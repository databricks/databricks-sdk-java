# NEXT CHANGELOG

## Release v0.104.0

### New Features and Improvements
* Added automatic detection of AI coding agents (Antigravity, Claude Code, Cline, Codex, Copilot CLI, Cursor, Gemini CLI, OpenCode) in the user-agent string. The SDK now appends `agent/<name>` to HTTP request headers when running inside a known AI agent environment.

### Bug Fixes
* Fixed non-JSON error responses (e.g. plain-text "Invalid Token" with HTTP 403) producing `Unknown` instead of the correct typed exception (`PermissionDenied`, `Unauthenticated`, etc.). The error message no longer contains Jackson deserialization internals.
* Added `X-Databricks-Org-Id` header to deprecated workspace SCIM APIs (Groups, ServicePrincipals, Users) for SPOG host compatibility.
* Fixed Databricks CLI authentication to detect when the cached token's scopes don't match the SDK's configured scopes. Previously, a scope mismatch was silently ignored, causing requests to use wrong permissions. The SDK now raises an error with instructions to re-authenticate.

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `createCatalog()`, `createSyncedTable()`, `deleteCatalog()`, `deleteSyncedTable()`, `getCatalog()` and `getSyncedTable()` methods for `workspaceClient.postgres()` service.
* Add `effectiveFileEventQueue` field for `com.databricks.sdk.service.catalog.CreateExternalLocation`.
* Add `effectiveFileEventQueue` field for `com.databricks.sdk.service.catalog.ExternalLocationInfo`.
* Add `effectiveFileEventQueue` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
* Add `columnSelection` field for `com.databricks.sdk.service.ml.Function`.
* Add `cascade` field for `com.databricks.sdk.service.pipelines.DeletePipelineRequest`.
* Add `defaultBranch` field for `com.databricks.sdk.service.postgres.ProjectSpec`.
* Add `defaultBranch` field for `com.databricks.sdk.service.postgres.ProjectStatus`.
* Add `ingress` and `ingressDryRun` fields for `com.databricks.sdk.service.settings.AccountNetworkPolicy`.
