if grep -q "tag: \"\[$TAG\]\"" .codegen/changelog_config.yml; then 
  echo "Match found." 
else 
  echo "Match not found. Exiting..." 
  exit 1 
fi
