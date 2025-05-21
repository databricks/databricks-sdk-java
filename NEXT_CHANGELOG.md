# NEXT CHANGELOG

## Release v0.51.0

### New Features and Improvements

### Bug Fixes

### Documentation

### Internal Changes
* Added support for .cloud.databricks.mil domains ([#435](https://github.com/databricks/databricks-sdk-java/pull/435)).

### API Changes
* Added `accountClient.networkPolicies()` service and `accountClient.workspaceNetworkConfiguration()` service.
* Added `workspaceClient.recipientFederationPolicies()` service.
* Added `createLoggedModel()`, `deleteLoggedModel()`, `deleteLoggedModelTag()`, `finalizeLoggedModel()`, `getLoggedModel()`, `listLoggedModelArtifacts()`, `logLoggedModelParams()`, `logOutputs()`, `searchLoggedModels()` and `setLoggedModelTags()` methods for `workspaceClient.experiments()` service.
* Added `ucSecurable` field for `com.databricks.sdk.service.apps.AppResource`.
* Added `timeseriesColumns` field for `com.databricks.sdk.service.catalog.PrimaryKeyConstraint`.
* Added `reviewState`, `reviews` and `runnerCollaboratorAliases` fields for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetNotebook`.
* Added `notebookEtag` and `notebookUpdatedAt` fields for `com.databricks.sdk.service.cleanrooms.CleanRoomNotebookTaskRun`.
* Added `rootPath` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
* Added `rootPath` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
* Added `rootPath` field for `com.databricks.sdk.service.pipelines.PipelineSpec`.
* Added `materializationNamespace` field for `com.databricks.sdk.service.sharing.Table`.
* Added `omitPermissionsList` field for `com.databricks.sdk.service.sharing.UpdateSharePermissions`.
* Added `autoResolveDisplayName` field for `com.databricks.sdk.service.sql.UpdateAlertRequest`.
* Added `autoResolveDisplayName` field for `com.databricks.sdk.service.sql.UpdateQueryRequest`.
* Added `INTERNAL_CATALOG`, `MANAGED_ONLINE_CATALOG` and `UNKNOWN_CATALOG_TYPE` enum values for `com.databricks.sdk.service.catalog.CatalogType`.
* Added `CATALOG`, `CLEAN_ROOM`, `CONNECTION`, `CREDENTIAL`, `EXTERNAL_LOCATION`, `EXTERNAL_METADATA`, `FUNCTION`, `METASTORE`, `PIPELINE`, `PROVIDER`, `RECIPIENT`, `SCHEMA`, `SHARE`, `STAGING_TABLE`, `STORAGE_CREDENTIAL`, `TABLE`, `UNKNOWN_SECURABLE_TYPE` and `VOLUME` enum values for `com.databricks.sdk.service.catalog.SecurableType`.
* [Breaking] Changed `securableType` field for `com.databricks.sdk.service.catalog.CatalogInfo` to type `com.databricks.sdk.service.catalog.SecurableType` class.
* Changed `etag` and `name` fields for `com.databricks.sdk.service.iam.RuleSetResponse` to be required.
* Added `enableFileEvents` and `fileEventQueue` fields for `com.databricks.sdk.service.catalog.CreateExternalLocation`.
* Added `enableFileEvents` and `fileEventQueue` fields for `com.databricks.sdk.service.catalog.ExternalLocationInfo`.
* Added `enableFileEvents` and `fileEventQueue` fields for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
* Added `policyId` and `servicePrincipalId` fields for `com.databricks.sdk.service.oauth2.FederationPolicy`.
* [Breaking] Removed `accessPoint` field for `com.databricks.sdk.service.catalog.CreateExternalLocation`.
* [Breaking] Removed `accessPoint` field for `com.databricks.sdk.service.catalog.ExternalLocationInfo`.
* [Breaking] Removed `accessPoint` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
