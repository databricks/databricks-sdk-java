# NEXT CHANGELOG

## Release v0.113.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `createStream()`, `deleteStream()`, `getStream()`, `listStreams()` and `updateStream()` methods for `workspaceClient.featureEngineering()` service.
* Add `parameters` field for `com.databricks.sdk.service.jobs.PipelineTask`.
* Add `pipelineTask` field for `com.databricks.sdk.service.jobs.ResolvedValues`.
* Add `parameters` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
* Add `parameters` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
* Add `parameters` field for `com.databricks.sdk.service.pipelines.GetPipelineResponse`.
* [Breaking] Remove `catalogId` field for `com.databricks.sdk.service.postgres.CatalogCatalogStatus`.
* [Breaking] Remove `syncedTableId` field for `com.databricks.sdk.service.postgres.SyncedTableSyncedTableStatus`.