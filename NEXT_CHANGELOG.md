# NEXT CHANGELOG

## Release v0.56.0

### New Features and Improvements

### Bug Fixes
- [BREAKING] Removed shortcut methods for POST/PUT/PATCH operations.
These methods did not accept request bodies, making it impossible to 
specify which fields to update or create. If you depend on these methods, 
use the corresponding methods that accept full request objects instead. 

### Documentation

### Internal Changes

### API Changes
* Added `com.databricks.sdk.service.agentbricks` package.
* Added `workspaceClient.cleanRoomAssetRevisions()` service and `workspaceClient.cleanRoomAutoApprovalRules()` service.
* Added `createCleanRoomAssetReview()` method for `workspaceClient.cleanRoomAssets()` service.
* Added `latestMonitorFailureMsg` field for `com.databricks.sdk.service.catalog.CreateMonitor`.
* Added `latestMonitorFailureMsg` field for `com.databricks.sdk.service.catalog.UpdateMonitor`.
* Added `provisioningPhase` field for `com.databricks.sdk.service.database.SyncedTablePipelineProgress`.
* Added `UNSPECIFIED` enum value for `com.databricks.sdk.service.catalog.MonitorCronSchedulePauseStatus`.
* Added `UNKNOWN` enum value for `com.databricks.sdk.service.catalog.MonitorRefreshInfoState`.
* Added `UNKNOWN_TRIGGER` enum value for `com.databricks.sdk.service.catalog.MonitorRefreshInfoTrigger`.
* Added `REDSHIFT` and `SQLDW` enum values for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* Added `GERMANY_C5` enum value for `com.databricks.sdk.service.settings.ComplianceStandard`.
* [Breaking] Changed `cancelRefresh()` method for `workspaceClient.qualityMonitors()` service to start returning `com.databricks.sdk.service.catalog.CancelRefreshResponse`.
* [Breaking] Changed `create()` method for `workspaceClient.qualityMonitors()` service with new required argument order.
* [Breaking] Changed `delete()` method for `workspaceClient.qualityMonitors()` service to start returning `com.databricks.sdk.service.catalog.DeleteMonitorResponse`.
* [Breaking] Changed `refreshId` field for `com.databricks.sdk.service.catalog.CancelRefreshRequest` to type `Integer` class.
* [Breaking] Changed `refreshId` field for `com.databricks.sdk.service.catalog.GetRefreshRequest` to type `Integer` class.
* [Breaking] Changed `monitorVersion` field for `com.databricks.sdk.service.catalog.MonitorInfo` to type `Integer` class.
* Changed `outputSchemaName` field for `com.databricks.sdk.service.catalog.MonitorInfo` to be required.
* [Breaking] Changed `assetType` and `name` fields for `com.databricks.sdk.service.cleanrooms.CleanRoomAsset` to be required.
* Changed `assetType` and `name` fields for `com.databricks.sdk.service.cleanrooms.CleanRoomAsset` to be required.
* Changed `localName` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetForeignTableLocalDetails` to be required.
* [Breaking] Changed `localName` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetForeignTableLocalDetails` to be required.
* [Breaking] Changed `notebookContent` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetNotebook` to be required.
* Changed `notebookContent` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetNotebook` to be required.
* Changed `localName` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetTableLocalDetails` to be required.
* [Breaking] Changed `localName` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetTableLocalDetails` to be required.
* Changed `localName` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetViewLocalDetails` to be required.
* [Breaking] Changed `localName` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetViewLocalDetails` to be required.
* Changed `localName` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetVolumeLocalDetails` to be required.
* [Breaking] Changed `localName` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetVolumeLocalDetails` to be required.
* [Breaking] Removed `com.databricks.sdk.service.aibuilder` package.
