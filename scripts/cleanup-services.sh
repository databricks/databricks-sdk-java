#!/bin/bash

# Script to clean up generated service directories while preserving specific files
# This script is configured for the Databricks SDK Java project

set -e

# Configuration
SERVICE_DIR="databricks-sdk-java/src/main/java/com/databricks/sdk/service"

# Files/directories to exclude from deletion (relative to service directory)
# Add specific files or directories that should be preserved during cleanup
EXCLUDES=(
    "iam"
    "sharing/SharesExtService.java"
    "sharing/SharesExtImpl.java"
    "sharing/SharesExtAPI.java"
    "common/lro/LroOptions.java"
)

echo "🧹 Cleaning service directory: $SERVICE_DIR"
echo "📋 Exclusions: ${EXCLUDES[*]}"

# Check if service directory exists
if [[ ! -d "$SERVICE_DIR" ]]; then
    echo "❌ Service directory not found: $SERVICE_DIR"
    exit 1
fi

# Function to check if a file/directory should be excluded
should_exclude() {
    local item="$1"
    local relative_path="${item#$SERVICE_DIR/}"
    # Remove trailing slash if present
    relative_path="${relative_path%/}"
    
    for exclude_pattern in "${EXCLUDES[@]}"; do
        if [[ -n "$exclude_pattern" ]]; then
            # Handle directory exclusions (exact match)
            if [[ "$relative_path" == "$exclude_pattern" ]]; then
                return 0  # Should exclude
            fi
            # Handle file exclusions (check if this item contains the excluded file)
            if [[ "$exclude_pattern" == *"/"* ]]; then
                local exclude_dir="${exclude_pattern%%/*}"
                if [[ "$relative_path" == "$exclude_dir" ]]; then
                    # This is a directory that contains excluded files, handle specially
                    return 2  # Special case: partial exclusion
                fi
            fi
        fi
    done
    return 1  # Should not exclude
}

# Function to selectively clean a directory with file-level exclusions
selective_clean_directory() {
    local dir="$1"
    local dir_name="${dir#$SERVICE_DIR/}"
    dir_name="${dir_name%/}"
    
    echo "🔍 Selectively cleaning directory: $dir_name"
    
    # Find all files in this directory
    while IFS= read -r -d '' file; do
        local file_relative="${file#$SERVICE_DIR/}"
        local should_keep=false
        
        # Check if this file should be excluded
        for exclude_pattern in "${EXCLUDES[@]}"; do
            if [[ "$file_relative" == "$exclude_pattern" ]]; then
                should_keep=true
                break
            fi
        done
        
        if $should_keep; then
            echo "⏭️  Keeping: $file_relative"
        else
            echo "🗑️  Deleting: $file_relative"
            rm -f "$file"
        fi
    done < <(find "$dir" -type f -print0)
    
    # Remove empty subdirectories
    find "$dir" -type d -empty -delete 2>/dev/null || true
}

# Find all items in the service directory (1 level deep)
while IFS= read -r -d '' item; do
    exclusion_result=$(should_exclude "$item"; echo $?)
    
    case $exclusion_result in
        0)  # Full exclusion
            echo "⏭️  Skipping: ${item#$SERVICE_DIR/}"
            ;;
        2)  # Partial exclusion (directory with some excluded files)
            selective_clean_directory "$item"
            ;;
        *)  # No exclusion - delete entirely
            echo "🗑️  Deleting: ${item#$SERVICE_DIR/}"
            rm -rf "$item"
            ;;
    esac
done < <(find "$SERVICE_DIR" -mindepth 1 -maxdepth 1 -type d -print0)

echo "✅ Service directory cleanup completed"
