# NEXT CHANGELOG

## Release v0.116.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

- Make the client ID optional in `DatabricksOAuthTokenSource`. Previously `getToken()` threw a
  `NullPointerException` ("ClientID cannot be null") when no client ID was set, which prevented
  token exchange for users authenticated through a web browser OAuth flow whose IdP JWT does not
  contain a client ID. When the client ID is null or empty, the `client_id` parameter is now
  omitted from the token exchange request to perform account-wide token federation.

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
