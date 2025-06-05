# NEXT CHANGELOG

## Release v0.53.0

### New Features and Improvements

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
* Added `com.databricks.sdk.service.aibuilder`, `com.databricks.sdk.service.database` and `com.databricks.sdk.service.qualitymonitorv2` packages.
* Added `workspaceClient.customLlms()` service.
* Added `workspaceClient.database()` service.
* Added `workspaceClient.qualityMonitorV2()` service.
* Added `updatePrivateEndpointRule()` method for `accountClient.networkConnectivity()` service.
* Added `listSpaces()` method for `workspaceClient.genie()` service.
* Added `pageToken` field for `com.databricks.sdk.service.billing.ListLogDeliveryRequest`.
* Added `nextPageToken` field for `com.databricks.sdk.service.billing.WrappedLogDeliveryConfigurations`.
* Added `nextPageToken` field for `com.databricks.sdk.service.catalog.EffectivePermissionsList`.
* Added `maxResults` and `pageToken` fields for `com.databricks.sdk.service.catalog.GetEffectiveRequest`.
* Added `maxResults` and `pageToken` fields for `com.databricks.sdk.service.catalog.GetGrantRequest`.
* Added `nextPageToken` field for `com.databricks.sdk.service.catalog.ListMetastoresResponse`.
* Added `cleanRoomName` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAsset`.
* [Breaking] Added `name` field for `com.databricks.sdk.service.cleanrooms.DeleteCleanRoomAssetRequest`.
* [Breaking] Added `name` field for `com.databricks.sdk.service.cleanrooms.GetCleanRoomAssetRequest`.
* Added `triggerState` field for `com.databricks.sdk.service.jobs.BaseJob`.
* Added `triggerState` field for `com.databricks.sdk.service.jobs.Job`.
* Added `dbtCloudOutput` field for `com.databricks.sdk.service.jobs.RunOutput`.
* Added `dbtCloudTask` field for `com.databricks.sdk.service.jobs.RunTask`.
* Added `dbtCloudTask` field for `com.databricks.sdk.service.jobs.SubmitTask`.
* Added `dbtCloudTask` field for `com.databricks.sdk.service.jobs.Task`.
* Added `endpointService` and `resourceNames` fields for `com.databricks.sdk.service.settings.CreatePrivateEndpointRule`.
* Added `awsPrivateEndpointRules` field for `com.databricks.sdk.service.settings.NccEgressTargetRules`.
* Added `taskTimeOverTimeRange` field for `com.databricks.sdk.service.sql.QueryMetrics`.
* Added `INTERNAL` and `INTERNAL_AND_EXTERNAL` enum values for `com.databricks.sdk.service.catalog.DeltaSharingScopeEnum`.
* Added `CLUSTER_MIGRATED` enum value for `com.databricks.sdk.service.compute.EventType`.
* Added `DRIVER_UNHEALTHY` enum value for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* [Breaking] Changed `create()` method for `accountClient.logDelivery()` service with new required argument order.
* [Breaking] Changed `get()` method for `accountClient.logDelivery()` service to return `com.databricks.sdk.service.billing.GetLogDeliveryConfigurationResponse` class.
* [Breaking] Changed `createPrivateEndpointRule()`, `deletePrivateEndpointRule()` and `getPrivateEndpointRule()` methods for `accountClient.networkConnectivity()` service to return `com.databricks.sdk.service.settings.NccPrivateEndpointRule` class.
* [Breaking] Changed `listPrivateEndpointRules()` method for `accountClient.networkConnectivity()` service to return `com.databricks.sdk.service.settings.ListPrivateEndpointRulesResponse` class.
* [Breaking] Changed `delete()` and `get()` methods for `workspaceClient.cleanRoomAssets()` service with new required argument order.
* [Breaking] Changed `delete()` and `get()` methods for `workspaceClient.cleanRoomAssets()` service . Method path has changed.
* [Breaking] Changed `get()` method for `workspaceClient.grants()` service to return `com.databricks.sdk.service.catalog.GetPermissionsResponse` class.
* [Breaking] Changed `update()` method for `workspaceClient.grants()` service to return `com.databricks.sdk.service.catalog.UpdatePermissionsResponse` class.
* [Breaking] Changed `list()` method for `workspaceClient.metastores()` service to require request of `com.databricks.sdk.service.catalog.ListMetastoresRequest` class.
* Changed `accountId`, `credentialsId`, `logType`, `outputFormat` and `storageConfigurationId` fields for `com.databricks.sdk.service.billing.LogDeliveryConfiguration` to be required.
* Changed `message` and `status` fields for `com.databricks.sdk.service.billing.LogDeliveryStatus` to be required.
* [Breaking] Changed `logDeliveryConfiguration` field for `com.databricks.sdk.service.billing.WrappedCreateLogDeliveryConfiguration` to be required.
* [Breaking] Changed `securableType` field for `com.databricks.sdk.service.catalog.GetEffectiveRequest` to type `String` class.
* [Breaking] Changed `securableType` field for `com.databricks.sdk.service.catalog.GetGrantRequest` to type `String` class.
* [Breaking] Changed `deltaSharingScope` field for `com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse` to type `com.databricks.sdk.service.catalog.DeltaSharingScopeEnum` class.
* [Breaking] Changed `deltaSharingScope` field for `com.databricks.sdk.service.catalog.MetastoreInfo` to type `com.databricks.sdk.service.catalog.DeltaSharingScopeEnum` class.
* [Breaking] Changed `deltaSharingScope` field for `com.databricks.sdk.service.catalog.UpdateMetastore` to type `com.databricks.sdk.service.catalog.DeltaSharingScopeEnum` class.
* [Breaking] Changed `securableType` field for `com.databricks.sdk.service.catalog.UpdatePermissions` to type `String` class.
* Changed `resourceId` field for `com.databricks.sdk.service.settings.CreatePrivateEndpointRule` to no longer be required.
* [Breaking] Changed pagination for `accountClient.networkConnectivity().listPrivateEndpointRules()` method.
* [Breaking] Removed `workspaceClient.databaseInstances()` service.
* [Breaking] Removed `workspaceClient.queryExecution()` service.
* [Breaking] Removed `updateNccAzurePrivateEndpointRulePublic()` method for `accountClient.networkConnectivity()` service.
* [Breaking] Removed `getCredentialsForTraceDataDownload()`, `getCredentialsForTraceDataUpload()` and `listLoggedModelArtifacts()` methods for `workspaceClient.experiments()` service.
* [Breaking] Removed `getPublishedDashboardEmbedded()` method for `workspaceClient.lakeviewEmbedded()` service.
* [Breaking] Removed `assetFullName` field for `com.databricks.sdk.service.cleanrooms.DeleteCleanRoomAssetRequest`.
* [Breaking] Removed `assetFullName` field for `com.databricks.sdk.service.cleanrooms.GetCleanRoomAssetRequest`.
* [Breaking] Removed `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.ClusterAttributes`.
* [Breaking] Removed `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.ClusterDetails`.
* [Breaking] Removed `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.ClusterSpec`.
* [Breaking] Removed `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.CreateCluster`.
* [Breaking] Removed `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.EditCluster`.
* [Breaking] Removed `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.UpdateClusterResource`.
* [Breaking] Removed `INTERNAL` and `INTERNAL_AND_EXTERNAL` enum values for `com.databricks.sdk.service.catalog.GetMetastoreSummaryResponseDeltaSharingScope`.
* [Breaking] Removed `INTERNAL` and `INTERNAL_AND_EXTERNAL` enum values for `com.databricks.sdk.service.catalog.MetastoreInfoDeltaSharingScope`.
* [Breaking] Removed `CATALOG`, `CLEAN_ROOM`, `CONNECTION`, `CREDENTIAL`, `EXTERNAL_LOCATION`, `EXTERNAL_METADATA`, `FUNCTION`, `METASTORE`, `PIPELINE`, `PROVIDER`, `RECIPIENT`, `SCHEMA`, `SHARE`, `STAGING_TABLE`, `STORAGE_CREDENTIAL`, `TABLE`, `UNKNOWN_SECURABLE_TYPE` and `VOLUME` enum values for `com.databricks.sdk.service.catalog.SecurableType`.
* [Breaking] Removed `INTERNAL` and `INTERNAL_AND_EXTERNAL` enum values for `com.databricks.sdk.service.catalog.UpdateMetastoreDeltaSharingScope`.
