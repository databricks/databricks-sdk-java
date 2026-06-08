# NEXT CHANGELOG

## Release v0.117.0

### New Features and Improvements
* Detect the `AI_AGENT` environment variable (Vercel `@vercel/detect-agent` convention) as a secondary fallback for the AI agent reported in the user agent, consulted only when the agents.md `AGENT` variable is unset or empty. An unrecognized `AGENT` or `AI_AGENT` value is now passed through as-is (sanitized to the user agent allowlist and capped at 64 characters) instead of being reported as `unknown`. Mirrors [databricks/databricks-sdk-go#1683](https://github.com/databricks/databricks-sdk-go/pull/1683).

* Added `Paginator.newTokenPagination(...)` and `Paginator.newOffsetPagination(...)` factory methods in `com.databricks.sdk.support`, which make the pagination strategy explicit. The `Paginator` constructor is now deprecated in favor of these; it keeps its previous (offset/limit) behavior.

### Breaking Changes

### Bug Fixes
* Canonicalize Bearer tokenType in Authorization headers

* Fixed `Paginator` silently dropping results when a token-paginated response returned an empty page with a non-empty `next_page_token`. List methods (e.g. `tables().list()`) now keep paging until the page token is absent instead of stopping at the first empty page.

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `getCanonicalTokenType()` method for `com.databricks.sdk.core.oauth.Token`
