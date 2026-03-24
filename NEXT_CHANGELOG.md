# NEXT CHANGELOG

## Release v0.104.0

### New Features and Improvements

### Bug Fixes

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