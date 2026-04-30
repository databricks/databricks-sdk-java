# NEXT CHANGELOG

## Release v0.106.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `com.databricks.sdk.service.disasterrecovery` package.
* Add `workspaceClient.temporaryVolumeCredentials()` service.
* Add `accountClient.disasterRecovery()` service.
* Add `createExample()`, `deleteExample()`, `getExample()`, `getPermissionLevels()`, `getPermissions()`, `listExamples()`, `setPermissions()`, `updateExample()` and `updatePermissions()` methods for `workspaceClient.knowledgeAssistants()` service.
* Add `undeleteProject()` method for `workspaceClient.postgres()` service.
* Add `thumbnailUrl` field for `com.databricks.sdk.service.apps.App`.
* Add `confidentialComputeType` field for `com.databricks.sdk.service.compute.GcpAttributes`.
* Add `deltaTableName` field for `com.databricks.sdk.service.ml.BackfillSource`.
* Add `confluenceOptions`, `jiraOptions`, `outlookOptions` and `smartsheetOptions` fields for `com.databricks.sdk.service.pipelines.ConnectorOptions`.
* Add `googleAdsConfig` field for `com.databricks.sdk.service.pipelines.SourceConfig`.
* Add `replaceExisting` field for `com.databricks.sdk.service.postgres.CreateBranchRequest`.
* Add `replaceExisting` field for `com.databricks.sdk.service.postgres.CreateEndpointRequest`.
* Add `purge` field for `com.databricks.sdk.service.postgres.DeleteProjectRequest`.
* Add `showDeleted` field for `com.databricks.sdk.service.postgres.ListProjectsRequest`.
* Add `deleteTime` and `purgeTime` fields for `com.databricks.sdk.service.postgres.Project`.
* Add `ucConnection` field for `com.databricks.sdk.service.supervisoragents.Tool`.
* Add `CONFLUENCE` enum value for `com.databricks.sdk.service.catalog.ConnectionType`.
* Add `CONFLUENCE` enum value for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* [Breaking] Change `description` field for `com.databricks.sdk.service.supervisoragents.SupervisorAgent` to no longer be required.
* Change `description` field for `com.databricks.sdk.service.supervisoragents.SupervisorAgent` to no longer be required.
* [Breaking] Remove `connection` field for `com.databricks.sdk.service.supervisoragents.Tool`.
