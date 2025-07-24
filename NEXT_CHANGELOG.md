# NEXT CHANGELOG

## Release v0.56.0

### New Features and Improvements

### Bug Fixes
- [BREAKING] Removed shortcut methods for POST/PUT/PATCH operations.
These methods did not accept request bodies, making it impossible to 
specify which fields to update or create. If you depend on these methods, 
use the corresponding methods that accept full request objects instead. 

### Documentation

### Internal Changes

### API Changes
