# NEXT CHANGELOG

## Release v0.116.0

### New Features and Improvements

* Added `Paginator.newTokenPagination(...)` and `Paginator.newOffsetPagination(...)` factory methods in `com.databricks.sdk.support`, which make the pagination strategy explicit. The `Paginator` constructor is now deprecated in favor of these; it keeps its previous (offset/limit) behavior.

### Breaking Changes

### Bug Fixes

* Fixed `Paginator` silently dropping results when a token-paginated response returned an empty page with a non-empty `next_page_token`. List methods (e.g. `tables().list()`) now keep paging until the page token is absent instead of stopping at the first empty page.
- Make the client ID optional in `DatabricksOAuthTokenSource`. Previously `getToken()` threw a
  `NullPointerException` ("ClientID cannot be null") when no client ID was set, which prevented
  token exchange for users authenticated through a web browser OAuth flow whose IdP JWT does not
  contain a client ID. When the client ID is null or empty, the `client_id` parameter is now
  omitted from the token exchange request to perform account-wide token federation.

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
