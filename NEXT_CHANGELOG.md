# NEXT CHANGELOG

## Release v0.95.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `dataframeSchema`, `filterCondition` and `transformationSql` fields for `com.databricks.sdk.service.ml.DeltaTableSource`.
* Add `environmentVersion` field for `com.databricks.sdk.service.pipelines.PipelinesEnvironment`.
* Add `resetCheckpointSelection` field for `com.databricks.sdk.service.pipelines.StartUpdate`.
* [Breaking] Remove `oauth2AppClientId` and `oauth2AppIntegrationId` fields for `com.databricks.sdk.service.apps.Space`.
* Add `createDatabase()`, `deleteDatabase()`, `getDatabase()`, `listDatabases()` and `updateDatabase()` methods for `workspaceClient.postgres()` service.
* Add `postgres` field for `com.databricks.sdk.service.apps.AppResource`.