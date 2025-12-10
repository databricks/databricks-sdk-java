# NEXT CHANGELOG

## Release v0.72.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `workspaceClient.workspaceEntityTagAssignments()` service.
* Add `clone()` method for `workspaceClient.pipelines()` service.
* Add `datasetCatalog` and `datasetSchema` fields for `com.databricks.sdk.service.dashboards.CreateDashboardRequest`.
* Add `datasetCatalog` and `datasetSchema` fields for `com.databricks.sdk.service.dashboards.UpdateDashboardRequest`.
* Add `purgeData` field for `com.databricks.sdk.service.database.DeleteSyncedDatabaseTableRequest`.
* Add `cronSchedule` field for `com.databricks.sdk.service.ml.MaterializedFeature`.
* Add `truncation` field for `com.databricks.sdk.service.pipelines.PipelineEvent`.
* Add `gcpServiceAccount` field for `com.databricks.sdk.service.provisioning.CreateGcpKeyInfo`.
* Add `gcpServiceAccount` field for `com.databricks.sdk.service.provisioning.GcpKeyInfo`.
* Add `hasDeltaUniformIceberg` field for `com.databricks.sdk.service.sharing.TableInternalAttributes`.
* Add `FOREIGN_TABLE` and `VOLUME` enum values for `com.databricks.sdk.service.sharing.SharedDataObjectDataObjectType`.
* Change `timeWindow` field for `com.databricks.sdk.service.ml.Feature` to no longer be required.
* [Breaking] Change `timeWindow` field for `com.databricks.sdk.service.ml.Feature` to no longer be required.