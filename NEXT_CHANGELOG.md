# NEXT CHANGELOG

## Release v0.93.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes
* Implement dynamic auth token stale period based on initial token lifetime. Increased up to 20 mins for standard OAuth with proportionally shorter periods for short-lived tokens. Manually setting the stale period using the CachedTokeSource builder reverts the behaviour to the legacy fixed stale duration.

### API Changes
