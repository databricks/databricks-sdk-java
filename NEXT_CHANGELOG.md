# NEXT CHANGELOG

## Release v0.95.0

### New Features and Improvements

### Bug Fixes
* Pass `--profile` to CLI token source when profile is set, and add `--host` fallback for older CLIs that don't support `--profile` ([#682](https://github.com/databricks/databricks-sdk-java/pull/682)).

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
* Add `enablePgNativeLogin` field for `com.databricks.sdk.service.postgres.ProjectSpec`.
* Add `enablePgNativeLogin` field for `com.databricks.sdk.service.postgres.ProjectStatus`.
* [Breaking] Remove `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.EditInstancePool`.