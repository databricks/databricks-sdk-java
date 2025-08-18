# NEXT CHANGELOG

## Release v0.60.0

### New Features and Improvements
- Azure Service Principal credential provider can now automatically discover tenant ID when not explicitly provided

### Bug Fixes

- [Breaking] `DatabricksError` now correctly exposes all Databricks error details types. This change is a breaking change for users depending on the `ErrorDetail` class. The same information can be accessed from `ErrorDetails.errorInfo`.

### Documentation

### Internal Changes

### API Changes
