package com.databricks.sdk.core.error.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;

/**
 * ResourceInfo describes the resource that is being accessed.
 *
 * <p>This error detail type provides information about the specific resource that was involved in
 * the error. This is particularly useful when the error is related to resource access, permissions,
 * or resource-specific operations.
 *
 * <p>ResourceInfo helps clients understand:
 *
 * <ul>
 *   <li>What resource was involved in the error
 *   <li>What type of resource it was
 *   <li>Who owns the resource (if applicable)
 *   <li>What specific error occurred when accessing the resource
 * </ul>
 *
 * <p>Examples of when ResourceInfo might be provided:
 *
 * <ul>
 *   <li>Permission denied errors
 *   <li>Resource not found errors
 *   <li>Resource conflict errors
 *   <li>Resource quota exceeded errors
 *   <li>Resource state validation errors
 * </ul>
 */
@AutoValue
@JsonDeserialize(builder = AutoValue_ResourceInfo.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ResourceInfo {

  /**
   * A name for the type of resource being accessed.
   *
   * <p>This field categorizes the resource by its type or class. Examples might include:
   *
   * <ul>
   *   <li>"workspace"
   *   <li>"cluster"
   *   <li>"job"
   *   <li>"table"
   *   <li>"user"
   *   <li>"group"
   *   <li>"secret"
   *   <li>"notebook"
   * </ul>
   *
   * <p>This information helps clients understand what category of resource was involved and
   * potentially implement resource-type-specific error handling.
   *
   * @return the type of resource
   */
  @JsonProperty("resource_type")
  public abstract String resourceType();

  /**
   * The name of the resource being accessed.
   *
   * <p>This field provides the specific identifier or name of the resource that was involved in the
   * error. The format depends on the resource type but typically includes:
   *
   * <ul>
   *   <li>Resource IDs (e.g., "12345")
   *   <li>Resource names (e.g., "my-cluster")
   *   <li>Resource paths (e.g., "/path/to/resource")
   *   <li>Resource URIs (e.g., "databricks://workspace/123")
   * </ul>
   *
   * <p>This identifier helps clients locate the specific resource and potentially retry the
   * operation or report the issue more precisely.
   *
   * @return the name or identifier of the resource
   */
  @JsonProperty("resource_name")
  public abstract String resourceName();

  /**
   * The owner of the resource (optional).
   *
   * <p>This field identifies who owns or controls the resource. This information is particularly
   * useful for permission-related errors or when the client needs to contact the resource owner.
   *
   * <p>Examples of owner values:
   *
   * <ul>
   *   <li>User email addresses
   *   <li>User IDs
   *   <li>Group names
   *   <li>Service account identifiers
   *   <li>Organization names
   * </ul>
   *
   * <p>Note: This field may be null or empty if the owner information is not available or not
   * applicable.
   *
   * @return the owner of the resource, or null if not available
   */
  @JsonProperty("owner")
  public abstract String owner();

  /**
   * Describes what error is encountered when accessing this resource.
   *
   * <p>This field provides a human-readable description of the specific error that occurred when
   * trying to access or operate on the resource. The description should be clear enough for
   * developers to understand what went wrong.
   *
   * <p>Examples of resource error descriptions:
   *
   * <ul>
   *   <li>"Resource not found"
   *   <li>"Access denied: insufficient permissions"
   *   <li>"Resource is currently locked by another operation"
   *   <li>"Resource quota exceeded"
   *   <li>"Resource is in an invalid state for this operation"
   *   <li>"Resource name contains invalid characters"
   *   <li>"Resource already exists with this name"
   * </ul>
   *
   * @return description of the resource access error
   */
  @JsonProperty("description")
  public abstract String description();

  /**
   * Creates a new builder for constructing ResourceInfo instances.
   *
   * @return a new builder instance
   */
  public static Builder builder() {
    return new AutoValue_ResourceInfo.Builder();
  }

  /** Builder for constructing ResourceInfo instances. */
  @AutoValue.Builder
  @JsonIgnoreProperties(ignoreUnknown = true)
  public abstract static class Builder {

    /**
     * Sets the resource type.
     *
     * @param resourceType the type of resource
     * @return this builder for method chaining
     */
    @JsonProperty("resource_type")
    public abstract Builder setResourceType(String resourceType);

    /**
     * Sets the resource name.
     *
     * @param resourceName the name or identifier of the resource
     * @return this builder for method chaining
     */
    @JsonProperty("resource_name")
    public abstract Builder setResourceName(String resourceName);

    /**
     * Sets the resource owner.
     *
     * @param owner the owner of the resource
     * @return this builder for method chaining
     */
    @JsonProperty("owner")
    public abstract Builder setOwner(String owner);

    /**
     * Sets the error description.
     *
     * @param description description of the resource access error
     * @return this builder for method chaining
     */
    @JsonProperty("description")
    public abstract Builder setDescription(String description);

    /**
     * Builds the ResourceInfo instance.
     *
     * @return a new ResourceInfo instance
     */
    public abstract ResourceInfo build();
  }
}
