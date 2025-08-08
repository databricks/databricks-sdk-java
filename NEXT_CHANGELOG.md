# NEXT CHANGELOG

## Release v0.59.0

### New Features and Improvements

* Add option to add a timeout for browser confirmation in the U2M authentication flow.

### Bug Fixes

* User provided scopes are now properly propagated in OAuth flows.
* [Warning] Correctly defaults to scope `all-apis` (instead of `clusters sql`) in U2M if no scopes are provided by the users. This change aligns the Java SDK logic with the Python and Go SDK logic.

### Documentation

### Internal Changes

### API Changes
