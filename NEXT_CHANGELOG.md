# NEXT CHANGELOG

## Release v0.70.0

### New Features and Improvements
* Increase maximum number of concurrent HTTP connections per Workspace from 2 to 20.

### Bug Fixes

* Fix HTTP 429 (Too Many Requests) responses to correctly return `TooManyRequests` exception instead of generic `DatabricksError`.

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
