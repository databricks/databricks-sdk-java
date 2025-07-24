# Version changelog

## Release v0.56.0

### Bug Fixes
- [BREAKING] Removed shortcut methods for POST/PUT/PATCH operations.
These methods did not accept request bodies, making it impossible to 
specify which fields to update or create. If you depend on these methods, 
use the corresponding methods that accept full request objects instead. 

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


## Release v0.55.0

### New Features and Improvements
* Enabled asynchronous token refreshes by default. A new `disable_async_token_refresh` configuration option has been added to allow disabling this feature if necessary.
  To disable asynchronous token refresh, set the environment variable `DATABRICKS_DISABLE_ASYNC_TOKEN_REFRESH=true` or configure it within your configuration object.
  The previous `DATABRICKS_ENABLE_EXPERIMENTAL_ASYNC_TOKEN_REFRESH` option has been removed as asynchronous refresh is now the default behavior.

### Internal Changes

* The route-optimized query method now returns a descriptive error instead of a NullPointerException when called on a non-optimized endpoint.

### API Changes

* Added `workspaceClient.aiBuilder()` service.
* Added `workspaceClient.featureStore()` service and `workspaceClient.materializedFeatures()` service.
* Added `deleteConversation()`, `listConversations()` and `trashSpace()` methods for `workspaceClient.genie()` service.
* Added `createDatabaseInstanceRole()`, `deleteDatabaseInstanceRole()`, `getDatabaseInstanceRole()` and `listDatabaseInstanceRoles()` methods for `workspaceClient.database()` service.
* Added `connection` and `credential` fields for `com.databricks.sdk.service.catalog.Dependency`.
* Added `rely` field for `com.databricks.sdk.service.catalog.ForeignKeyConstraint`.
* Added `rely` field for `com.databricks.sdk.service.catalog.PrimaryKeyConstraint`.
* Added `securableKindManifest` field for `com.databricks.sdk.service.catalog.TableInfo`.
* Added `securableKindManifest` field for `com.databricks.sdk.service.catalog.TableSummary`.
* Added `remoteDiskThroughput` and `totalInitialRemoteDiskSize` fields for `com.databricks.sdk.service.compute.ClusterAttributes`.
* Added `remoteDiskThroughput` and `totalInitialRemoteDiskSize` fields for `com.databricks.sdk.service.compute.ClusterDetails`.
* Added `remoteDiskThroughput` and `totalInitialRemoteDiskSize` fields for `com.databricks.sdk.service.compute.ClusterSpec`.
* Added `remoteDiskThroughput` and `totalInitialRemoteDiskSize` fields for `com.databricks.sdk.service.compute.CreateCluster`.
* Added `remoteDiskThroughput` and `totalInitialRemoteDiskSize` fields for `com.databricks.sdk.service.compute.CreateInstancePool`.
* Added `remoteDiskThroughput` and `totalInitialRemoteDiskSize` fields for `com.databricks.sdk.service.compute.EditCluster`.
* Added `remoteDiskThroughput` and `totalInitialRemoteDiskSize` fields for `com.databricks.sdk.service.compute.EditInstancePool`.
* Added `remoteDiskThroughput` and `totalInitialRemoteDiskSize` fields for `com.databricks.sdk.service.compute.GetInstancePool`.
* Added `remoteDiskThroughput` and `totalInitialRemoteDiskSize` fields for `com.databricks.sdk.service.compute.InstancePoolAndStats`.
* Added `remoteDiskThroughput` and `totalInitialRemoteDiskSize` fields for `com.databricks.sdk.service.compute.UpdateClusterResource`.
* Added `expirationTime` field for `com.databricks.sdk.service.database.DatabaseCredential`.
* Added `childInstanceRefs`, `effectiveEnableReadableSecondaries`, `effectiveNodeCount`, `effectiveRetentionWindowInDays`, `effectiveStopped`, `enableReadableSecondaries`, `nodeCount`, `parentInstanceRef`, `readOnlyDns` and `retentionWindowInDays` fields for `com.databricks.sdk.service.database.DatabaseInstance`.
* Added `existingPipelineId` field for `com.databricks.sdk.service.database.SyncedTableSpec`.
* Added `lastSync` and `pipelineId` fields for `com.databricks.sdk.service.database.SyncedTableStatus`.
* Added `dbtPlatformOutput` field for `com.databricks.sdk.service.jobs.RunOutput`.
* Added `dbtPlatformTask` field for `com.databricks.sdk.service.jobs.RunTask`.
* Added `dbtPlatformTask` field for `com.databricks.sdk.service.jobs.SubmitTask`.
* Added `dbtPlatformTask` field for `com.databricks.sdk.service.jobs.Task`.
* Added `environment` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
* Added `environment` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
* Added `environment` field for `com.databricks.sdk.service.pipelines.PipelineSpec`.
* Added `description` field for `com.databricks.sdk.service.serving.CreateServingEndpoint`.
* Added `servedEntityName` field for `com.databricks.sdk.service.serving.Route`.
* Added `description` field for `com.databricks.sdk.service.serving.ServingEndpoint`.
* Added `description` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
* Added `DATABRICKS_ROW_STORE_FORMAT`, `DELTA_UNIFORM_HUDI`, `DELTA_UNIFORM_ICEBERG`, `HIVE`, `ICEBERG`, `MONGODB_FORMAT`, `ORACLE_FORMAT`, `SALESFORCE_DATA_CLOUD_FORMAT` and `TERADATA_FORMAT` enum values for `com.databricks.sdk.service.catalog.DataSourceFormat`.
* Added `METRIC_VIEW` enum value for `com.databricks.sdk.service.catalog.TableType`.
* Added `R` enum value for `com.databricks.sdk.service.compute.Language`.
* Added `CANCELLED`, `ERROR`, `QUEUED`, `RUNNING`, `STARTING` and `SUCCESS` enum values for `com.databricks.sdk.service.jobs.DbtPlatformRunStatus`.
* Added `CONTINUOUS` and `CONTINUOUS_RESTART` enum values for `com.databricks.sdk.service.jobs.TriggerType`.
* Added `APPEND_ONLY` enum value for `com.databricks.sdk.service.pipelines.TableSpecificConfigScdType`.
* [Breaking] Changed `update()` method for `workspaceClient.dashboardWidgets()` service . New request type is `com.databricks.sdk.service.sql.UpdateWidgetRequest` class.
* [Breaking] Changed `create()` method for `workspaceClient.queryVisualizationsLegacy()` service with new required argument order.
* [Breaking] Changed `status` field for `com.databricks.sdk.service.jobs.DbtCloudJobRunStep` to type `com.databricks.sdk.service.jobs.DbtPlatformRunStatus` class.
* Changed `servedModelName` field for `com.databricks.sdk.service.serving.Route` to no longer be required.
* [Breaking] Changed `servedModelName` field for `com.databricks.sdk.service.serving.Route` to no longer be required.
* [Breaking] Removed `workspaceClient.customLlms()` service.
* [Breaking] Removed `generateDownloadFullQueryResult()` and `getDownloadFullQueryResult()` methods for `workspaceClient.genie()` service.
* [Breaking] Removed `includeDeltaMetadata` field for `com.databricks.sdk.service.catalog.ListTablesRequest`.
* [Breaking] Removed `tableServingUrl` field for `com.databricks.sdk.service.database.DatabaseTable`.
* [Breaking] Removed `tableServingUrl` field for `com.databricks.sdk.service.database.SyncedDatabaseTable`.
* [Breaking] Removed `pipelineId` field for `com.databricks.sdk.service.database.SyncedTableSpec`.
* [Breaking] Removed `UNKNOWN_CATALOG_TYPE` enum value for `com.databricks.sdk.service.catalog.CatalogType`.
* [Breaking] Removed `HIVE_CUSTOM` and `HIVE_SERDE` enum values for `com.databricks.sdk.service.catalog.DataSourceFormat`.
* [Breaking] Removed `UNKNOWN_SECURABLE_TYPE` enum value for `com.databricks.sdk.service.catalog.SecurableType`.
* [Breaking] Removed `CANCELLED`, `ERROR`, `QUEUED`, `RUNNING`, `STARTING` and `SUCCESS` enum values for `com.databricks.sdk.service.jobs.DbtCloudRunStatus`.
* Added `workspaceClient.externalLineage()` service and `workspaceClient.externalMetadata()` service.
* Added `workspaceClient.defaultWarehouseId()` service.
* Added `claims` field for `com.databricks.sdk.service.database.GenerateDatabaseCredentialRequest`.
* Added `activity` field for `com.databricks.sdk.service.ml.DeleteTransitionRequestResponse`.
* Added `maxResults` field for `com.databricks.sdk.service.ml.ListWebhooksRequest`.
* Added `body` and `statusCode` fields for `com.databricks.sdk.service.ml.TestRegistryWebhookResponse`.
* Added `modelVersionDatabricks` field for `com.databricks.sdk.service.ml.TransitionStageResponse`.
* Added `registeredModel` field for `com.databricks.sdk.service.ml.UpdateModelResponse`.
* Added `modelVersion` field for `com.databricks.sdk.service.ml.UpdateModelVersionResponse`.
* Added `webhook` field for `com.databricks.sdk.service.ml.UpdateWebhookResponse`.
* Added `runAs` field for `com.databricks.sdk.service.pipelines.GetPipelineResponse`.
* Added `principal` field for `com.databricks.sdk.service.serving.AiGatewayRateLimit`.
* Added `ANY_STATIC_CREDENTIAL` enum value for `com.databricks.sdk.service.catalog.CredentialType`.
* Added `TABLE_DELTA_ICEBERG_DELTASHARING` enum value for `com.databricks.sdk.service.catalog.SecurableKind`.
* Added `SECURITY_AGENTS_FAILED_INITIAL_VERIFICATION` enum value for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Added `CAN_CREATE_REGISTERED_MODEL` enum value for `com.databricks.sdk.service.ml.PermissionLevel`.
* Added `BIGQUERY` enum value for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* Added `SERVICE_PRINCIPAL` and `USER_GROUP` enum values for `com.databricks.sdk.service.serving.AiGatewayRateLimitKey`.
* Added `DELTA_ICEBERG_TABLE` enum value for `com.databricks.sdk.service.sharing.TableInternalAttributesSharedTableType`.
* [Breaking] Changed `deleteTransitionRequest()`, `updateModel()`, `updateModelVersion()` and `updateWebhook()` methods for `workspaceClient.modelRegistry()` service return type to become non-empty.
* [Breaking] Changed `deleteWebhook()` method for `workspaceClient.modelRegistry()` service with new required argument order.
* [Breaking] Changed `fromStage` and `toStage` fields for `com.databricks.sdk.service.ml.Activity` to type `String` class.
* [Breaking] Changed `stage` field for `com.databricks.sdk.service.ml.ApproveTransitionRequest` to type `String` class.
* [Breaking] Changed `stage` field for `com.databricks.sdk.service.ml.CreateTransitionRequest` to type `String` class.
* [Breaking] Changed `stage` field for `com.databricks.sdk.service.ml.DeleteTransitionRequestRequest` to type `String` class.
* [Breaking] Changed `id` field for `com.databricks.sdk.service.ml.DeleteWebhookRequest` to be required.
* [Breaking] Changed `key` field for `com.databricks.sdk.service.ml.FeatureTag` to be required.
* Changed `key` field for `com.databricks.sdk.service.ml.FeatureTag` to be required.
* [Breaking] Changed `capacity` field for `com.databricks.sdk.service.ml.OnlineStore` to be required.
* Changed `capacity` field for `com.databricks.sdk.service.ml.OnlineStore` to be required.
* [Breaking] Changed `onlineTableName` field for `com.databricks.sdk.service.ml.PublishSpec` to be required.
* [Breaking] Changed `stage` field for `com.databricks.sdk.service.ml.RejectTransitionRequest` to type `String` class.
* [Breaking] Changed `stage` field for `com.databricks.sdk.service.ml.TransitionModelVersionStageDatabricks` to type `String` class.
* [Breaking] Changed `toStage` field for `com.databricks.sdk.service.ml.TransitionRequest` to type `String` class.
* [Breaking] Removed `allowedOptions` and `requiredOptions` fields for `com.databricks.sdk.service.catalog.SecurableKindManifest`.
* [Breaking] Removed `webhook` field for `com.databricks.sdk.service.ml.TestRegistryWebhookResponse`.
* [Breaking] Removed `modelVersion` field for `com.databricks.sdk.service.ml.TransitionStageResponse`.
* [Breaking] Removed `ARCHIVED`, `NONE`, `PRODUCTION` and `STAGING` enum values for `com.databricks.sdk.service.ml.DeleteTransitionRequestStage`.
* [Breaking] Removed `ARCHIVED`, `NONE`, `PRODUCTION` and `STAGING` enum values for `com.databricks.sdk.service.ml.Stage`.
* Added `workspaceClient.servicePrincipalSecretsProxy()` service.
* Added `database` field for `com.databricks.sdk.service.apps.AppResource`.
* Added `environmentSettings` field for `com.databricks.sdk.service.catalog.ConnectionInfo`.
* Added `environmentSettings` field for `com.databricks.sdk.service.catalog.CreateConnection`.
* Added `environmentSettings` field for `com.databricks.sdk.service.catalog.UpdateConnection`.
* Added `readReplicaCount` field for `com.databricks.sdk.service.ml.OnlineStore`.
* Added `pageSize` field for `com.databricks.sdk.service.oauth2.ListServicePrincipalSecretsRequest`.
* Added `queryBasedConnectorConfig` field for `com.databricks.sdk.service.pipelines.TableSpecificConfig`.
* Added `projectedRemainingTaskTotalTimeMs`, `remainingTaskCount`, `runnableTasks` and `workToBeDone` fields for `com.databricks.sdk.service.sql.QueryMetrics`.
* Added `isDefaultForProvider` and `name` fields for `com.databricks.sdk.service.workspace.CreateCredentialsRequest`.
* Added `isDefaultForProvider` and `name` fields for `com.databricks.sdk.service.workspace.CreateCredentialsResponse`.
* Added `isDefaultForProvider` and `name` fields for `com.databricks.sdk.service.workspace.CredentialInfo`.
* Added `isDefaultForProvider` and `name` fields for `com.databricks.sdk.service.workspace.GetCredentialsResponse`.
* Added `isDefaultForProvider` and `name` fields for `com.databricks.sdk.service.workspace.UpdateCredentialsRequest`.
* Added `DATABRICKS` enum value for `com.databricks.sdk.service.catalog.SystemType`.
* Added `DRIVER_DNS_RESOLUTION_FAILURE` enum value for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Added `CONFLUENCE` and `META_MARKETING` enum values for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* [Breaking] Changed `delete()` method for `workspaceClient.tableConstraints()` service to start returning `com.databricks.sdk.service.catalog.DeleteTableConstraintResponse`.
* [Breaking] Changed `servicePrincipalId` field for `com.databricks.sdk.service.oauth2.CreateServicePrincipalSecretRequest` to type `String` class.
* [Breaking] Changed `servicePrincipalId` field for `com.databricks.sdk.service.oauth2.DeleteServicePrincipalSecretRequest` to type `String` class.
* [Breaking] Changed `servicePrincipalId` field for `com.databricks.sdk.service.oauth2.ListServicePrincipalSecretsRequest` to type `String` class.
* Changed `calls` field for `com.databricks.sdk.service.serving.AiGatewayRateLimit` to no longer be required.
* [Breaking] Changed `calls` field for `com.databricks.sdk.service.serving.AiGatewayRateLimit` to no longer be required.
* [Breaking] Removed `create()` method for `workspaceClient.dashboards()` service.
* [Breaking] Removed `range` and `ifUnmodifiedSince` fields for `com.databricks.sdk.service.files.DownloadRequest`.
* [Breaking] Removed `range` and `ifUnmodifiedSince` fields for `com.databricks.sdk.service.files.GetMetadataRequest`.


## Release v0.54.0

### New Features and Improvements
* [Experimental] Add support for asynchronous token refresh ([#464](https://github.com/databricks/databricks-sdk-java/pull/465)).
  Enable this feature by setting the environment variable:
  ```bash
  export DATABRICKS_ENABLE_EXPERIMENTAL_ASYNC_TOKEN_REFRESH=true
  ```
  Note: This feature and its configuration are experimental and may be removed in future releases.


## Release v0.53.0

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


## Release v0.52.0

### New Features and Improvements
* Added Direct-to-Dataplane API support, allowing users to query route optimized model serving endpoints ([#453](https://github.com/databricks/databricks-sdk-java/pull/453)).

### API Changes
* Added `workspaceClient.dashboardEmailSubscriptions()` service and `workspaceClient.sqlResultsDownload()` service.
* Added `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.ClusterAttributes`.
* Added `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.ClusterDetails`.
* Added `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.ClusterSpec`.
* Added `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.CreateCluster`.
* Added `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.EditCluster`.
* Added `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.UpdateClusterResource`.
* Added `tags` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
* Added `tags` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
* Added `tags` field for `com.databricks.sdk.service.pipelines.PipelineSpec`.
* Added `maxProvisionedConcurrency` and `minProvisionedConcurrency` fields for `com.databricks.sdk.service.serving.ServedEntityInput`.
* Added `maxProvisionedConcurrency` and `minProvisionedConcurrency` fields for `com.databricks.sdk.service.serving.ServedEntityOutput`.
* Added `maxProvisionedConcurrency` and `minProvisionedConcurrency` fields for `com.databricks.sdk.service.serving.ServedModelInput`.
* Added `maxProvisionedConcurrency` and `minProvisionedConcurrency` fields for `com.databricks.sdk.service.serving.ServedModelOutput`.
* Added `DELTASHARING_CATALOG`, `FOREIGN_CATALOG`, `INTERNAL_CATALOG`, `MANAGED_CATALOG`, `MANAGED_ONLINE_CATALOG`, `SYSTEM_CATALOG` and `UNKNOWN_CATALOG_TYPE` enum values for `com.databricks.sdk.service.catalog.CatalogType`.
* Added `GA4_RAW_DATA`, `POWER_BI`, `SALESFORCE`, `SALESFORCE_DATA_CLOUD`, `SERVICENOW`, `UNKNOWN_CONNECTION_TYPE` and `WORKDAY_RAAS` enum values for `com.databricks.sdk.service.catalog.ConnectionType`.
* Added `OAUTH_ACCESS_TOKEN`, `OAUTH_M2M`, `OAUTH_REFRESH_TOKEN`, `OAUTH_RESOURCE_OWNER_PASSWORD`, `OAUTH_U2M`, `OAUTH_U2M_MAPPING`, `OIDC_TOKEN`, `PEM_PRIVATE_KEY`, `SERVICE_CREDENTIAL` and `UNKNOWN_CREDENTIAL_TYPE` enum values for `com.databricks.sdk.service.catalog.CredentialType`.
* Added `CATALOG`, `CLEAN_ROOM`, `CONNECTION`, `CREDENTIAL`, `EXTERNAL_LOCATION`, `EXTERNAL_METADATA`, `FUNCTION`, `METASTORE`, `PIPELINE`, `PROVIDER`, `RECIPIENT`, `SCHEMA`, `SHARE`, `STAGING_TABLE`, `STORAGE_CREDENTIAL`, `TABLE`, `UNKNOWN_SECURABLE_TYPE` and `VOLUME` enum values for `com.databricks.sdk.service.catalog.SecurableType`.
* Added `TERADATA` enum value for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* Added `OIDC_FEDERATION` enum value for `com.databricks.sdk.service.sharing.AuthenticationType`.
* [Breaking] Changed `securableType` field for `com.databricks.sdk.service.catalog.ConnectionInfo` to type `com.databricks.sdk.service.catalog.SecurableType` class.
* [Breaking] Changed `catalogType` field for `com.databricks.sdk.service.catalog.SchemaInfo` to type `com.databricks.sdk.service.catalog.CatalogType` class.


## Release v0.51.0

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


## Release v0.50.0

### Internal Changes
* Capture DatabricksError when retrying API calls ([#427](https://github.com/databricks/databricks-sdk-java/pull/427)).

### API Changes
* Added `accountClient.llmProxyPartnerPoweredAccount()` service, `accountClient.llmProxyPartnerPoweredEnforce()` service and `workspaceClient.llmProxyPartnerPoweredWorkspace()` service.
* Added `workspaceClient.databaseInstances()` service.
* Added `createProvisionedThroughputEndpoint()` and `updateProvisionedThroughputEndpointConfig()` methods for `workspaceClient.servingEndpoints()` service.
* Added `catalogName` field for `com.databricks.sdk.service.catalog.EnableRequest`.
* Added `sourceType` field for `com.databricks.sdk.service.pipelines.IngestionPipelineDefinition`.
* Added `glob` field for `com.databricks.sdk.service.pipelines.PipelineLibrary`.
* Added `provisionedModelUnits` field for `com.databricks.sdk.service.serving.ServedEntityInput`.
* Added `provisionedModelUnits` field for `com.databricks.sdk.service.serving.ServedEntityOutput`.
* Added `provisionedModelUnits` field for `com.databricks.sdk.service.serving.ServedModelInput`.
* Added `provisionedModelUnits` field for `com.databricks.sdk.service.serving.ServedModelOutput`.
* Added `DESCRIBE_QUERY_INVALID_SQL_ERROR`, `DESCRIBE_QUERY_TIMEOUT`, `DESCRIBE_QUERY_UNEXPECTED_FAILURE`, `INVALID_CHAT_COMPLETION_ARGUMENTS_JSON_EXCEPTION`, `INVALID_SQL_MULTIPLE_DATASET_REFERENCES_EXCEPTION`, `INVALID_SQL_MULTIPLE_STATEMENTS_EXCEPTION` and `INVALID_SQL_UNKNOWN_TABLE_EXCEPTION` enum values for `com.databricks.sdk.service.dashboards.MessageErrorType`.
* Added `CAN_CREATE` and `CAN_MONITOR_ONLY` enum values for `com.databricks.sdk.service.iam.PermissionLevel`.
* Added `SUCCESS_WITH_FAILURES` enum value for `com.databricks.sdk.service.jobs.TerminationCodeCode`.
* Added `INFRASTRUCTURE_MAINTENANCE` enum value for `com.databricks.sdk.service.pipelines.StartUpdateCause`.
* Added `INFRASTRUCTURE_MAINTENANCE` enum value for `com.databricks.sdk.service.pipelines.UpdateInfoCause`.
* [Breaking] Changed `createAlert()` and `updateAlert()` methods for `workspaceClient.alertsV2()` service with new required argument order.
* [Breaking] Changed `set()` method for `workspaceClient.permissions()` service . New request type is `com.databricks.sdk.service.iam.SetObjectPermissions` class.
* [Breaking] Changed `update()` method for `workspaceClient.permissions()` service . New request type is `com.databricks.sdk.service.iam.UpdateObjectPermissions` class.
* [Breaking] Changed `get()` method for `workspaceClient.workspaceBindings()` service to return `com.databricks.sdk.service.catalog.GetCatalogWorkspaceBindingsResponse` class.
* [Breaking] Changed `getBindings()` method for `workspaceClient.workspaceBindings()` service to return `com.databricks.sdk.service.catalog.GetWorkspaceBindingsResponse` class.
* [Breaking] Changed `update()` method for `workspaceClient.workspaceBindings()` service to return `com.databricks.sdk.service.catalog.UpdateCatalogWorkspaceBindingsResponse` class.
* [Breaking] Changed `updateBindings()` method for `workspaceClient.workspaceBindings()` service to return `com.databricks.sdk.service.catalog.UpdateWorkspaceBindingsResponse` class.
* [Breaking] Changed `securableType` field for `com.databricks.sdk.service.catalog.GetBindingsRequest` to type `String` class.
* Changed `schema` and `state` fields for `com.databricks.sdk.service.catalog.SystemSchemaInfo` to be required.
* [Breaking] Changed `state` field for `com.databricks.sdk.service.catalog.SystemSchemaInfo` to type `String` class.
* [Breaking] Changed `securableType` field for `com.databricks.sdk.service.catalog.UpdateWorkspaceBindingsParameters` to type `String` class.
* [Breaking] Changed `workspaceId` field for `com.databricks.sdk.service.catalog.WorkspaceBinding` to be required.
* [Breaking] Changed `gpuNodePoolId` field for `com.databricks.sdk.service.jobs.ComputeConfig` to no longer be required.
* Changed `gpuNodePoolId` field for `com.databricks.sdk.service.jobs.ComputeConfig` to no longer be required.
* [Breaking] Changed `alert` field for `com.databricks.sdk.service.sql.CreateAlertV2Request` to be required.
* [Breaking] Changed `alert` field for `com.databricks.sdk.service.sql.UpdateAlertV2Request` to be required.
* [Breaking] Removed `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.EditInstancePool`.
* [Breaking] Removed `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.GetInstancePool`.
* [Breaking] Removed `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.InstancePoolAndStats`.
* [Breaking] Removed `CATALOG`, `CREDENTIAL`, `EXTERNAL_LOCATION` and `STORAGE_CREDENTIAL` enum values for `com.databricks.sdk.service.catalog.GetBindingsSecurableType`.
* [Breaking] Removed `AVAILABLE`, `DISABLE_INITIALIZED`, `ENABLE_COMPLETED`, `ENABLE_INITIALIZED` and `UNAVAILABLE` enum values for `com.databricks.sdk.service.catalog.SystemSchemaInfoState`.
* [Breaking] Removed `CATALOG`, `CREDENTIAL`, `EXTERNAL_LOCATION` and `STORAGE_CREDENTIAL` enum values for `com.databricks.sdk.service.catalog.UpdateBindingsSecurableType`.


## Release v0.49.0

### Bug Fixes
* Fixed the deserialization of responses in VectorSearchAPI's `queryIndex()` method ([#440](https://github.com/databricks/databricks-sdk-java/pull/440)).

### API Changes
* Added `futureFeatureDataPath` field for `com.databricks.sdk.service.ml.CreateForecastingExperimentRequest`.
* Added `excludeColumns` and `includeColumns` fields for `com.databricks.sdk.service.pipelines.TableSpecificConfig`.
* Added `NETWORK_CHECK_CONTROL_PLANE_FAILURE`, `NETWORK_CHECK_DNS_SERVER_FAILURE`, `NETWORK_CHECK_METADATA_ENDPOINT_FAILURE`, `NETWORK_CHECK_MULTIPLE_COMPONENTS_FAILURE`, `NETWORK_CHECK_NIC_FAILURE`, `NETWORK_CHECK_STORAGE_FAILURE` and `SECRET_PERMISSION_DENIED` enum values for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* [Breaking] Changed `pipelineId` field for `com.databricks.sdk.service.pipelines.EditPipeline` to be required.
* [Breaking] Changed `connectionName`, `gatewayStorageCatalog` and `gatewayStorageSchema` fields for `com.databricks.sdk.service.pipelines.IngestionGatewayPipelineDefinition` to be required.
* Changed `connectionName`, `gatewayStorageCatalog` and `gatewayStorageSchema` fields for `com.databricks.sdk.service.pipelines.IngestionGatewayPipelineDefinition` to be required.
* [Breaking] Changed `kind` field for `com.databricks.sdk.service.pipelines.PipelineDeployment` to be required.
* Changed `kind` field for `com.databricks.sdk.service.pipelines.PipelineDeployment` to be required.
* Changed `destinationCatalog`, `destinationSchema` and `sourceUrl` fields for `com.databricks.sdk.service.pipelines.ReportSpec` to be required.
* [Breaking] Changed `destinationCatalog`, `destinationSchema` and `sourceUrl` fields for `com.databricks.sdk.service.pipelines.ReportSpec` to be required.
* Changed `destinationCatalog`, `destinationSchema` and `sourceSchema` fields for `com.databricks.sdk.service.pipelines.SchemaSpec` to be required.
* [Breaking] Changed `destinationCatalog`, `destinationSchema` and `sourceSchema` fields for `com.databricks.sdk.service.pipelines.SchemaSpec` to be required.
* [Breaking] Changed `destinationCatalog`, `destinationSchema` and `sourceTable` fields for `com.databricks.sdk.service.pipelines.TableSpec` to be required.
* Changed `destinationCatalog`, `destinationSchema` and `sourceTable` fields for `com.databricks.sdk.service.pipelines.TableSpec` to be required.
* [Breaking] Changed `results` field for `com.databricks.sdk.service.sql.ListAlertsV2Response` to type `com.databricks.sdk.service.sql.AlertV2List` class.
* [Breaking] Changed pagination for `workspaceClient.alertsV2().listAlerts()` method.
* [Breaking] Changed waiter for `workspaceClient.genie().createMessage()` method.


## Release v0.48.0

### New Features and Improvements
 * Introduce support for Databricks Workload Identity Federation in GitHub workflows ([423](https://github.com/databricks/databricks-sdk-java/pull/423)).
   See README.md for instructions.
 * [Breaking] Users running their workflows in GitHub Actions, which use Cloud native authentication and also have a `DATABRICKS_CLIENT_ID` and `DATABRICKS_HOST`
   environment variables set may see their authentication start failing due to the order in which the SDK tries different authentication methods.

### API Changes
* Added `workspaceClient.alertsV2()` service.
* Added `updateNccAzurePrivateEndpointRulePublic()` method for `accountClient.networkConnectivity()` service.
* Added `createdAt`, `createdBy` and `metastoreId` fields for `com.databricks.sdk.service.catalog.SetArtifactAllowlist`.
* [Breaking] Added `networkConnectivityConfig` field for `com.databricks.sdk.service.settings.CreateNetworkConnectivityConfigRequest`.
* [Breaking] Added `privateEndpointRule` field for `com.databricks.sdk.service.settings.CreatePrivateEndpointRuleRequest`.
* Added `domainNames` field for `com.databricks.sdk.service.settings.NccAzurePrivateEndpointRule`.
* Added `autoResolveDisplayName` field for `com.databricks.sdk.service.sql.CreateAlertRequest`.
* Added `autoResolveDisplayName` field for `com.databricks.sdk.service.sql.CreateQueryRequest`.
* Added `CREATE_CLEAN_ROOM`, `EXECUTE_CLEAN_ROOM_TASK` and `MODIFY_CLEAN_ROOM` enum values for `com.databricks.sdk.service.catalog.Privilege`.
* Added `DNS_RESOLUTION_ERROR` and `GCP_DENIED_BY_ORG_POLICY` enum values for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Added `EXPIRED` enum value for `com.databricks.sdk.service.settings.NccAzurePrivateEndpointRuleConnectionState`.
* [Breaking] Changed `createNetworkConnectivityConfiguration()` and `createPrivateEndpointRule()` methods for `accountClient.networkConnectivity()` service with new required argument order.
* [Breaking] Changed `workloadSize` field for `com.databricks.sdk.service.serving.ServedModelInput` to type `String` class.
* [Breaking] Changed `groupId` field for `com.databricks.sdk.service.settings.NccAzurePrivateEndpointRule` to type `String` class.
* [Breaking] Changed `targetServices` field for `com.databricks.sdk.service.settings.NccAzureServiceEndpointRule` to type `com.databricks.sdk.service.settings.EgressResourceTypeList` class.
* [Breaking] Removed `name` and `region` fields for `com.databricks.sdk.service.settings.CreateNetworkConnectivityConfigRequest`.
* [Breaking] Removed `groupId` and `resourceId` fields for `com.databricks.sdk.service.settings.CreatePrivateEndpointRuleRequest`.
* [Breaking] Removed `LARGE`, `MEDIUM` and `SMALL` enum values for `com.databricks.sdk.service.serving.ServedModelInputWorkloadSize`.
* [Breaking] Removed `BLOB`, `DFS`, `MYSQL_SERVER` and `SQL_SERVER` enum values for `com.databricks.sdk.service.settings.NccAzurePrivateEndpointRuleGroupId`.


## Release v0.47.0

### API Changes
* Added `updateEndpointBudgetPolicy()` and `updateEndpointCustomTags()` methods for `workspaceClient.vectorSearchEndpoints()` service.
* Added `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.EditInstancePool`.
* Added `pageSize` and `pageToken` fields for `com.databricks.sdk.service.compute.GetEvents`.
* Added `nextPageToken` and `prevPageToken` fields for `com.databricks.sdk.service.compute.GetEventsResponse`.
* Added `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.GetInstancePool`.
* Added `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.InstancePoolAndStats`.
* Added `effectivePerformanceTarget` field for `com.databricks.sdk.service.jobs.RepairHistoryItem`.
* Added `performanceTarget` field for `com.databricks.sdk.service.jobs.RepairRun`.
* Added `budgetPolicyId` field for `com.databricks.sdk.service.vectorsearch.CreateEndpoint`.
* Added `customTags` and `effectiveBudgetPolicyId` fields for `com.databricks.sdk.service.vectorsearch.EndpointInfo`.
* Added `DISABLED` enum value for `com.databricks.sdk.service.jobs.TerminationCodeCode`.
* [Breaking] Changed `createIndex()` method for `workspaceClient.vectorSearchIndexes()` service to return `com.databricks.sdk.service.vectorsearch.VectorIndex` class.
* [Breaking] Changed `deleteDataVectorIndex()` method for `workspaceClient.vectorSearchIndexes()` service . HTTP method/verb has changed.
* [Breaking] Changed `deleteDataVectorIndex()` method for `workspaceClient.vectorSearchIndexes()` service with new required argument order.
* [Breaking] Changed `dataArray` field for `com.databricks.sdk.service.vectorsearch.ResultData` to type `com.databricks.sdk.service.vectorsearch.ListValueList` class.
* [Breaking] Changed waiter for `workspaceClient.vectorSearchEndpoints().createEndpoint()` method.
* [Breaking] Removed `nullValue` field for `com.databricks.sdk.service.vectorsearch.Value`.


## Release v0.46.0

### New Features and Improvements
 * Added `TokenCache` to `ExternalBrowserCredentialsProvider` to reduce number of authentications needed for U2M OAuth.


## Release v0.45.0

### API Changes
* Added `workspaceClient.enableExportNotebook()` service, `workspaceClient.enableNotebookTableClipboard()` service and `workspaceClient.enableResultsDownloading()` service.
* Added `getCredentialsForTraceDataDownload()` and `getCredentialsForTraceDataUpload()` methods for `workspaceClient.experiments()` service.
* Added `getDownloadFullQueryResult()` method for `workspaceClient.genie()` service.
* Added `getPublishedDashboardTokenInfo()` method for `workspaceClient.lakeviewEmbedded()` service.
* Added `bindingWorkspaceIds` field for `com.databricks.sdk.service.billing.BudgetPolicy`.
* Added `downloadId` field for `com.databricks.sdk.service.dashboards.GenieGenerateDownloadFullQueryResultResponse`.
* Added `dashboardOutput` field for `com.databricks.sdk.service.jobs.RunOutput`.
* Added `dashboardTask` and `powerBiTask` fields for `com.databricks.sdk.service.jobs.RunTask`.
* Added `dashboardTask` and `powerBiTask` fields for `com.databricks.sdk.service.jobs.SubmitTask`.
* Added `dashboardTask` and `powerBiTask` fields for `com.databricks.sdk.service.jobs.Task`.
* Added `includeFeatures` field for `com.databricks.sdk.service.ml.CreateForecastingExperimentRequest`.
* Added `models` field for `com.databricks.sdk.service.ml.LogInputs`.
* Added `datasetDigest`, `datasetName` and `modelId` fields for `com.databricks.sdk.service.ml.LogMetric`.
* Added `datasetDigest`, `datasetName`, `modelId` and `runId` fields for `com.databricks.sdk.service.ml.Metric`.
* Added `modelInputs` field for `com.databricks.sdk.service.ml.RunInputs`.
* Added `clientApplication` field for `com.databricks.sdk.service.sql.QueryInfo`.
* Added `GEOGRAPHY` and `GEOMETRY` enum values for `com.databricks.sdk.service.catalog.ColumnTypeName`.
* Added `ALLOCATION_TIMEOUT_NO_HEALTHY_AND_WARMED_UP_CLUSTERS`, `DOCKER_CONTAINER_CREATION_EXCEPTION`, `DOCKER_IMAGE_TOO_LARGE_FOR_INSTANCE_EXCEPTION` and `DOCKER_INVALID_OS_EXCEPTION` enum values for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Added `STANDARD` enum value for `com.databricks.sdk.service.jobs.PerformanceTarget`.
* Added `CAN_VIEW` enum value for `com.databricks.sdk.service.sql.WarehousePermissionLevel`.
* [Breaking] Changed `generateDownloadFullQueryResult()` method for `workspaceClient.genie()` service . Method path has changed.
* [Breaking] Changed waiter for `workspaceClient.commandExecution().create()` method.
* [Breaking] Changed waiter for `workspaceClient.commandExecution().execute()` method.
* [Breaking] Removed `error`, `status` and `transientStatementId` fields for `com.databricks.sdk.service.dashboards.GenieGenerateDownloadFullQueryResultResponse`.
* [Breaking] Removed `BALANCED` and `COST_OPTIMIZED` enum values for `com.databricks.sdk.service.jobs.PerformanceTarget`.
* [Breaking] Removed `workspaceClient.pipelines().waitGetPipelineRunning()` method.


## Release v0.44.0

### Bug Fixes
* Fix issue deserializing HTTP responses with an empty body ([#426](https://github.com/databricks/databricks-sdk-java/pull/426)).


## Release v0.43.0

### API Changes
* Added `generateDownloadFullQueryResult()` method for `workspaceClient.genie()` service.
* Added `effectiveUserApiScopes`, `oauth2AppClientId`, `oauth2AppIntegrationId` and `userApiScopes` fields for `com.databricks.sdk.service.apps.App`.
* Added `abfss`, `dbfs`, `errorMessage`, `executionDurationSeconds`, `file`, `gcs`, `s3`, `status`, `volumes` and `workspace` fields for `com.databricks.sdk.service.compute.InitScriptInfoAndExecutionDetails`.
* [Breaking] Added `forecastGranularity` field for `com.databricks.sdk.service.ml.CreateForecastingExperimentRequest`.
* Added `jwksUri` field for `com.databricks.sdk.service.oauth2.OidcFederationPolicy`.
* Added `eventLog` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
* Added `eventLog` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
* Added `eventLog` field for `com.databricks.sdk.service.pipelines.PipelineSpec`.
* Added `fallbackConfig` field for `com.databricks.sdk.service.serving.AiGatewayConfig`.
* Added `customProviderConfig` field for `com.databricks.sdk.service.serving.ExternalModel`.
* Added `fallbackConfig` field for `com.databricks.sdk.service.serving.PutAiGatewayRequest`.
* Added `fallbackConfig` field for `com.databricks.sdk.service.serving.PutAiGatewayResponse`.
* Added `aliases`, `comment`, `dataType`, `dependencyList`, `fullDataType`, `id`, `inputParams`, `name`, `properties`, `routineDefinition`, `schema`, `securableKind`, `share`, `shareId`, `storageLocation` and `tags` fields for `com.databricks.sdk.service.sharing.DeltaSharingFunction`.
* Added `querySource` field for `com.databricks.sdk.service.sql.QueryInfo`.
* Added `FOREIGN_CATALOG` enum value for `com.databricks.sdk.service.catalog.CatalogType`.
* Added `BROWSE` enum value for `com.databricks.sdk.service.catalog.Privilege`.
* Added `ACCESS_TOKEN_FAILURE`, `ALLOCATION_TIMEOUT`, `ALLOCATION_TIMEOUT_NODE_DAEMON_NOT_READY`, `ALLOCATION_TIMEOUT_NO_HEALTHY_CLUSTERS`, `ALLOCATION_TIMEOUT_NO_MATCHED_CLUSTERS`, `ALLOCATION_TIMEOUT_NO_READY_CLUSTERS`, `ALLOCATION_TIMEOUT_NO_UNALLOCATED_CLUSTERS`, `ALLOCATION_TIMEOUT_NO_WARMED_UP_CLUSTERS`, `AWS_INACCESSIBLE_KMS_KEY_FAILURE`, `AWS_INSTANCE_PROFILE_UPDATE_FAILURE`, `AWS_INVALID_KEY_PAIR`, `AWS_INVALID_KMS_KEY_STATE`, `AWS_RESOURCE_QUOTA_EXCEEDED`, `AZURE_PACKED_DEPLOYMENT_PARTIAL_FAILURE`, `BOOTSTRAP_TIMEOUT_DUE_TO_MISCONFIG`, `BUDGET_POLICY_LIMIT_ENFORCEMENT_ACTIVATED`, `BUDGET_POLICY_RESOLUTION_FAILURE`, `CLOUD_ACCOUNT_SETUP_FAILURE`, `CLOUD_OPERATION_CANCELLED`, `CLOUD_PROVIDER_INSTANCE_NOT_LAUNCHED`, `CLOUD_PROVIDER_LAUNCH_FAILURE_DUE_TO_MISCONFIG`, `CLOUD_PROVIDER_RESOURCE_STOCKOUT_DUE_TO_MISCONFIG`, `CLUSTER_OPERATION_THROTTLED`, `CLUSTER_OPERATION_TIMEOUT`, `CONTROL_PLANE_REQUEST_FAILURE_DUE_TO_MISCONFIG`, `DATA_ACCESS_CONFIG_CHANGED`, `DISASTER_RECOVERY_REPLICATION`, `DRIVER_EVICTION`, `DRIVER_LAUNCH_TIMEOUT`, `DRIVER_NODE_UNREACHABLE`, `DRIVER_OUT_OF_DISK`, `DRIVER_OUT_OF_MEMORY`, `DRIVER_POD_CREATION_FAILURE`, `DRIVER_UNEXPECTED_FAILURE`, `DYNAMIC_SPARK_CONF_SIZE_EXCEEDED`, `EOS_SPARK_IMAGE`, `EXECUTOR_POD_UNSCHEDULED`, `GCP_API_RATE_QUOTA_EXCEEDED`, `GCP_FORBIDDEN`, `GCP_IAM_TIMEOUT`, `GCP_INACCESSIBLE_KMS_KEY_FAILURE`, `GCP_INSUFFICIENT_CAPACITY`, `GCP_IP_SPACE_EXHAUSTED`, `GCP_KMS_KEY_PERMISSION_DENIED`, `GCP_NOT_FOUND`, `GCP_RESOURCE_QUOTA_EXCEEDED`, `GCP_SERVICE_ACCOUNT_ACCESS_DENIED`, `GCP_SERVICE_ACCOUNT_NOT_FOUND`, `GCP_SUBNET_NOT_READY`, `GCP_TRUSTED_IMAGE_PROJECTS_VIOLATED`, `GKE_BASED_CLUSTER_TERMINATION`, `INIT_CONTAINER_NOT_FINISHED`, `INSTANCE_POOL_MAX_CAPACITY_REACHED`, `INSTANCE_POOL_NOT_FOUND`, `INSTANCE_UNREACHABLE_DUE_TO_MISCONFIG`, `INTERNAL_CAPACITY_FAILURE`, `INVALID_AWS_PARAMETER`, `INVALID_INSTANCE_PLACEMENT_PROTOCOL`, `INVALID_WORKER_IMAGE_FAILURE`, `IN_PENALTY_BOX`, `LAZY_ALLOCATION_TIMEOUT`, `MAINTENANCE_MODE`, `NETVISOR_SETUP_TIMEOUT`, `NO_MATCHED_K8S`, `NO_MATCHED_K8S_TESTING_TAG`, `POD_ASSIGNMENT_FAILURE`, `POD_SCHEDULING_FAILURE`, `RESOURCE_USAGE_BLOCKED`, `SECRET_CREATION_FAILURE`, `SERVERLESS_LONG_RUNNING_TERMINATED`, `SPARK_IMAGE_DOWNLOAD_THROTTLED`, `SPARK_IMAGE_NOT_FOUND`, `SSH_BOOTSTRAP_FAILURE`, `STORAGE_DOWNLOAD_FAILURE_DUE_TO_MISCONFIG`, `STORAGE_DOWNLOAD_FAILURE_SLOW`, `STORAGE_DOWNLOAD_FAILURE_THROTTLED`, `UNEXPECTED_POD_RECREATION`, `USER_INITIATED_VM_TERMINATION` and `WORKSPACE_UPDATE` enum values for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Added `GENERATED_SQL_QUERY_TOO_LONG_EXCEPTION` and `MISSING_SQL_QUERY_EXCEPTION` enum values for `com.databricks.sdk.service.dashboards.MessageErrorType`.
* Added `BALANCED` enum value for `com.databricks.sdk.service.jobs.PerformanceTarget`.
* Added `LISTING_RESOURCE` enum value for `com.databricks.sdk.service.marketplace.FileParentType`.
* Added `APP` enum value for `com.databricks.sdk.service.marketplace.MarketplaceFileType`.
* Added `CUSTOM` enum value for `com.databricks.sdk.service.serving.ExternalModelProvider`.
* Added `ARCLIGHT_MULTI_TENANT_AZURE_EXCHANGE_TOKEN` and `ARCLIGHT_MULTI_TENANT_AZURE_EXCHANGE_TOKEN_WITH_USER_DELEGATION_KEY` enum values for `com.databricks.sdk.service.settings.TokenType`.
* [Breaking] Changed `createExperiment()` method for `workspaceClient.forecasting()` service with new required argument order.
* Changed `instanceTypeId` field for `com.databricks.sdk.service.compute.NodeInstanceType` to be required.
* Changed `category` field for `com.databricks.sdk.service.compute.NodeType` to be required.
* [Breaking] Changed `functions` field for `com.databricks.sdk.service.sharing.ListProviderShareAssetsResponse` to type `com.databricks.sdk.service.sharing.DeltaSharingFunctionList` class.
* [Breaking] Removed `executionDetails` and `script` fields for `com.databricks.sdk.service.compute.InitScriptInfoAndExecutionDetails`.
* [Breaking] Removed `supportsElasticDisk` field for `com.databricks.sdk.service.compute.NodeType`.
* [Breaking] Removed `dataGranularityQuantity` and `dataGranularityUnit` fields for `com.databricks.sdk.service.ml.CreateForecastingExperimentRequest`.
* [Breaking] Removed `aliases`, `comment`, `dataType`, `dependencyList`, `fullDataType`, `id`, `inputParams`, `name`, `properties`, `routineDefinition`, `schema`, `securableKind`, `share`, `shareId`, `storageLocation` and `tags` fields for `com.databricks.sdk.service.sharing.Function`.


## Release v0.42.0

### Internal Changes
* Update Jobs ListRuns API to support paginated responses ([#411](https://github.com/databricks/databricks-sdk-java/pull/411))
* Update Jobs ListJobs API to support paginated responses ([#410](https://github.com/databricks/databricks-sdk-java/pull/410))
* Introduce automated tagging ([#409](https://github.com/databricks/databricks-sdk-java/pull/409)).
* Update Jobs GetJob API to support paginated responses  ([#403](https://github.com/databricks/databricks-sdk-java/pull/403)).
* Update Jobs GetRun API to support paginated responses  ([#402](https://github.com/databricks/databricks-sdk-java/pull/402)).
* Update github cache action version from v2 to v4 ([#415](Update github cache action version from v2 to v4))
  

### API Changes
* Added `workspaceClient.forecasting()` service.
* Added `executeMessageAttachmentQuery()`, `getMessageAttachmentQueryResult()` and `getSpace()` methods for `workspaceClient.genie()` service.
* Added `listProviderShareAssets()` method for `workspaceClient.providers()` service.
* Added `budgetPolicyId` and `effectiveBudgetPolicyId` fields for `com.databricks.sdk.service.apps.App`.
* Added `policy` field for `com.databricks.sdk.service.billing.CreateBudgetPolicyRequest`.
* Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.ValidateCredentialRequest`.
* Added `attachmentId` field for `com.databricks.sdk.service.dashboards.GenieAttachment`.
* Added `conversationId` field for `com.databricks.sdk.service.dashboards.GenieConversation`.
* Added `messageId` field for `com.databricks.sdk.service.dashboards.GenieMessage`.
* Added `description`, `id`, `lastUpdatedTimestamp`, `query`, `queryResultMetadata`, `statementId` and `title` fields for `com.databricks.sdk.service.dashboards.GenieQueryAttachment`.
* Added `genAiComputeTask` field for `com.databricks.sdk.service.jobs.RunTask`.
* Added `genAiComputeTask` field for `com.databricks.sdk.service.jobs.SubmitTask`.
* Added `genAiComputeTask` field for `com.databricks.sdk.service.jobs.Task`.
* Added `runName` field for `com.databricks.sdk.service.ml.CreateRun`.
* Added `runName` field for `com.databricks.sdk.service.ml.RunInfo`.
* Added `runName` field for `com.databricks.sdk.service.ml.UpdateRun`.
* Added `lifetime` field for `com.databricks.sdk.service.oauth2.CreateServicePrincipalSecretRequest`.
* Added `expireTime` field for `com.databricks.sdk.service.oauth2.CreateServicePrincipalSecretResponse`.
* Added `expireTime` field for `com.databricks.sdk.service.oauth2.SecretInfo`.
* Added `instanceProfileArn` field for `com.databricks.sdk.service.serving.AmazonBedrockConfig`.
* Added `budgetPolicyId` field for `com.databricks.sdk.service.serving.CreateServingEndpoint`.
* Added `budgetPolicyId` field for `com.databricks.sdk.service.serving.ServingEndpoint`.
* Added `budgetPolicyId` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
* Added `add`, `principal` and `remove` fields for `com.databricks.sdk.service.sharing.PermissionsChange`.
* Added `columnsToRerank` field for `com.databricks.sdk.service.vectorsearch.QueryVectorIndexRequest`.
* Added `ORACLE` and `TERADATA` enum values for `com.databricks.sdk.service.catalog.ConnectionType`.
* Added `COULD_NOT_GET_MODEL_DEPLOYMENTS_EXCEPTION`, `FUNCTION_ARGUMENTS_INVALID_TYPE_EXCEPTION` and `MESSAGE_CANCELLED_WHILE_EXECUTING_EXCEPTION` enum values for `com.databricks.sdk.service.dashboards.MessageErrorType`.
* Added `WAITING` enum value for `com.databricks.sdk.service.jobs.RunLifecycleStateV2State`.
* Added `ACTIVE_ONLY`, `ALL` and `DELETED_ONLY` enum values for `com.databricks.sdk.service.ml.ViewType`.
* Added `OAUTH_CLIENT_CREDENTIALS` enum value for `com.databricks.sdk.service.sharing.AuthenticationType`.
* Added `RAW` enum value for `com.databricks.sdk.service.workspace.ExportFormat`.
* [Breaking] Changed `getByName()` method for `workspaceClient.experiments()` service to return `com.databricks.sdk.service.ml.GetExperimentByNameResponse` class.
* [Breaking] Changed `logInputs()` method for `workspaceClient.experiments()` service with new required argument order.
* [Breaking] Changed `sharePermissions()` method for `workspaceClient.shares()` service to return `com.databricks.sdk.service.sharing.GetSharePermissionsResponse` class.
* [Breaking] Changed `sharePermissions()` and `updatePermissions()` methods for `workspaceClient.shares()` service return type to become non-empty.
* [Breaking] Changed `updatePermissions()` method for `workspaceClient.shares()` service to return `com.databricks.sdk.service.sharing.UpdateSharePermissionsResponse` class.
* Changed `policyId` field for `com.databricks.sdk.service.billing.BudgetPolicy` to no longer be required.
* [Breaking] Changed `policyId` field for `com.databricks.sdk.service.billing.BudgetPolicy` to no longer be required.
* [Breaking] Changed `partitions` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetTableLocalDetails` to type `com.databricks.sdk.service.cleanrooms.PartitionList` class.
* [Breaking] Changed `query` field for `com.databricks.sdk.service.dashboards.GenieAttachment` to type `com.databricks.sdk.service.dashboards.GenieQueryAttachment` class.
* [Breaking] Changed `digest`, `name`, `source` and `sourceType` fields for `com.databricks.sdk.service.ml.Dataset` to be required.
* Changed `digest`, `name`, `source` and `sourceType` fields for `com.databricks.sdk.service.ml.Dataset` to be required.
* Changed `dataset` field for `com.databricks.sdk.service.ml.DatasetInput` to be required.
* [Breaking] Changed `dataset` field for `com.databricks.sdk.service.ml.DatasetInput` to be required.
* [Breaking] Changed `key` and `value` fields for `com.databricks.sdk.service.ml.InputTag` to be required.
* Changed `key` and `value` fields for `com.databricks.sdk.service.ml.InputTag` to be required.
* [Breaking] Changed `viewType` field for `com.databricks.sdk.service.ml.ListExperimentsRequest` to type `com.databricks.sdk.service.ml.ViewType` class.
* [Breaking] Changed `runId` field for `com.databricks.sdk.service.ml.LogInputs` to be required.
* [Breaking] Changed `viewType` field for `com.databricks.sdk.service.ml.SearchExperiments` to type `com.databricks.sdk.service.ml.ViewType` class.
* [Breaking] Changed `runViewType` field for `com.databricks.sdk.service.ml.SearchRuns` to type `com.databricks.sdk.service.ml.ViewType` class.
* [Breaking] Removed `customTags` and `policyName` fields for `com.databricks.sdk.service.billing.CreateBudgetPolicyRequest`.
* [Breaking] Removed `cachedQuerySchema`, `description`, `id`, `instructionId`, `instructionTitle`, `lastUpdatedTimestamp`, `query`, `statementId` and `title` fields for `com.databricks.sdk.service.dashboards.QueryAttachment`.
* [Breaking] Removed `maxResults` and `pageToken` fields for `com.databricks.sdk.service.sharing.UpdateSharePermissions`.
* [Breaking] Removed `ACTIVE_ONLY`, `ALL` and `DELETED_ONLY` enum values for `com.databricks.sdk.service.ml.SearchExperimentsViewType`.
* [Breaking] Removed `ACTIVE_ONLY`, `ALL` and `DELETED_ONLY` enum values for `com.databricks.sdk.service.ml.SearchRunsRunViewType`.


## [Release] Release v0.41.0

### API Changes:

 * Added `getMessageQueryResultByAttachment()` method for `workspaceClient.genie()` service.
 * Added `id` field for `com.databricks.sdk.service.apps.App`.
 * Added `limitConfig` field for `com.databricks.sdk.service.billing.UpdateBudgetPolicyRequest`.
 * Added `volumes` field for `com.databricks.sdk.service.compute.ClusterLogConf`.
 * Removed `reviewState`, `reviews` and `runnerCollaborators` fields for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetNotebook`.

OpenAPI SHA: 99f644e72261ef5ecf8d74db20f4b7a1e09723cc, Date: 2025-02-11


## [Release] Release v0.40.0

### Bug Fixes

 * Correctly include query parameters for APIs whose request objects contain the body as a field ([#401](https://github.com/databricks/databricks-sdk-java/pull/401)).


### Internal Changes

 * Add CICD environment to User Agent ([#404](https://github.com/databricks/databricks-sdk-java/pull/404)).


### API Changes:

 * Added `accountClient.budgetPolicy()` service.
 * Added `accountClient.enableIpAccessLists()` service.
 * Added `workspaceClient.accessControl()` service.
 * Added `workspaceClient.lakeviewEmbedded()` service and `workspaceClient.queryExecution()` service.
 * Added `workspaceClient.redashConfig()` service.
 * Added `httpRequest()` method for `workspaceClient.servingEndpoints()` service.
 * Added `gcpOauthToken` field for `com.databricks.sdk.service.catalog.TemporaryCredentials`.
 * Added `options` field for `com.databricks.sdk.service.catalog.UpdateCatalog`.
 * Added `reviewState`, `reviews` and `runnerCollaborators` fields for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetNotebook`.
 * Added `statementId` field for `com.databricks.sdk.service.dashboards.QueryAttachment`.
 * Added `effectivePerformanceTarget` field for `com.databricks.sdk.service.jobs.BaseRun`.
 * Added `performanceTarget` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `performanceTarget` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `effectivePerformanceTarget` field for `com.databricks.sdk.service.jobs.Run`.
 * Added `performanceTarget` field for `com.databricks.sdk.service.jobs.RunNow`.
 * Added `cleanRoomsNotebookOutput` field for `com.databricks.sdk.service.jobs.RunOutput`.
 * Added `disabled` and `effectivePerformanceTarget` fields for `com.databricks.sdk.service.jobs.RunTask`.
 * Added `runAsRepl` field for `com.databricks.sdk.service.jobs.SparkJarTask`.
 * Added `userAuthorizedScopes` field for `com.databricks.sdk.service.oauth2.CreateCustomAppIntegration`.
 * Added `userAuthorizedScopes` field for `com.databricks.sdk.service.oauth2.GetCustomAppIntegrationOutput`.
 * Added `scopes` and `userAuthorizedScopes` fields for `com.databricks.sdk.service.oauth2.UpdateCustomAppIntegration`.
 * Added `contents` field for `com.databricks.sdk.service.serving.GetOpenApiResponse`.
 * Added `activated`, `activationUrl`, `authenticationType`, `cloud`, `comment`, `createdAt`, `createdBy`, `dataRecipientGlobalMetastoreId`, `ipAccessList`, `metastoreId`, `name`, `owner`, `propertiesKvpairs`, `region`, `sharingCode`, `tokens`, `updatedAt` and `updatedBy` fields for `com.databricks.sdk.service.sharing.RecipientInfo`.
 * Added `expirationTime` field for `com.databricks.sdk.service.sharing.RecipientInfo`.
 * Changed `update()` method for `workspaceClient.recipients()` service to return `com.databricks.sdk.service.sharing.RecipientInfo` class.
 * Changed `update()` method for `workspaceClient.recipients()` service to type `update()` method for `workspaceClient.recipients()` service.
 * Changed `update()` method for `workspaceClient.recipients()` service return type to become non-empty.
 * Changed `create()` method for `workspaceClient.servingEndpoints()` service with new required argument order.
 * Changed `getOpenApi()` method for `workspaceClient.servingEndpoints()` service return type to become non-empty.
 * Changed `patch()` method for `workspaceClient.servingEndpoints()` service to return `com.databricks.sdk.service.serving.EndpointTags` class.
 * Changed `patch()` method for `workspaceClient.servingEndpoints()` service to type `patch()` method for `workspaceClient.servingEndpoints()` service.
 * Changed `com.databricks.sdk.service.serving.EndpointTagList` class to.
 * Changed `collaboratorAlias` field for `com.databricks.sdk.service.cleanrooms.CleanRoomCollaborator` to be required.
 * Changed `collaboratorAlias` field for `com.databricks.sdk.service.cleanrooms.CleanRoomCollaborator` to be required.
 * Changed `behavior` field for `com.databricks.sdk.service.serving.AiGatewayGuardrailPiiBehavior` to no longer be required.
 * Changed `behavior` field for `com.databricks.sdk.service.serving.AiGatewayGuardrailPiiBehavior` to no longer be required.
 * Changed `config` field for `com.databricks.sdk.service.serving.CreateServingEndpoint` to no longer be required.
 * Changed `projectId` and `region` fields for `com.databricks.sdk.service.serving.GoogleCloudVertexAiConfig` to be required.
 * Changed `projectId` and `region` fields for `com.databricks.sdk.service.serving.GoogleCloudVertexAiConfig` to be required.
 * Changed `workloadType` field for `com.databricks.sdk.service.serving.ServedEntityInput` to type `com.databricks.sdk.service.serving.ServingModelWorkloadType` class.
 * Changed `workloadType` field for `com.databricks.sdk.service.serving.ServedEntityOutput` to type `com.databricks.sdk.service.serving.ServingModelWorkloadType` class.
 * Changed `workloadType` field for `com.databricks.sdk.service.serving.ServedModelOutput` to type `com.databricks.sdk.service.serving.ServingModelWorkloadType` class.
 * Removed `securableKind` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Removed `securableKind` field for `com.databricks.sdk.service.catalog.ConnectionInfo`.

OpenAPI SHA: c72c58f97b950fcb924a90ef164bcb10cfcd5ece, Date: 2025-02-03


## [Release] Release v0.39.0

### Internal Changes

 * Migrate workflows that need write access to use hosted runners ([#397](https://github.com/databricks/databricks-sdk-java/pull/397)).


### API Changes:

 * Added `noCompute` field for `com.databricks.sdk.service.apps.CreateAppRequest`.
 * Added `hasMore` field for `com.databricks.sdk.service.jobs.BaseJob`.
 * Added `hasMore` field for `com.databricks.sdk.service.jobs.BaseRun`.
 * Added `pageToken` field for `com.databricks.sdk.service.jobs.GetJobRequest`.
 * Added `hasMore` and `nextPageToken` fields for `com.databricks.sdk.service.jobs.Job`.
 * Added `hasMore` field for `com.databricks.sdk.service.jobs.Run`.
 * Added `runAs` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
 * Added `runAs` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
 * Added `authorizationDetails` and `endpointUrl` fields for `com.databricks.sdk.service.serving.DataPlaneInfo`.
 * Added .
 * Changed `update()` method for `accountClient.federationPolicy()` service with new required argument order.
 * Changed `update()` method for `accountClient.servicePrincipalFederationPolicy()` service with new required argument order.
 * Changed `updateMask` field for `com.databricks.sdk.service.oauth2.UpdateAccountFederationPolicyRequest` to no longer be required.
 * Changed `updateMask` field for `com.databricks.sdk.service.oauth2.UpdateServicePrincipalFederationPolicyRequest` to no longer be required.
 * Changed `daysOfWeek` field for `com.databricks.sdk.service.pipelines.RestartWindow` to type `com.databricks.sdk.service.pipelines.DayOfWeekList` class.

OpenAPI SHA: 779817ed8d63031f5ea761fbd25ee84f38feec0d, Date: 2025-01-08


## [Release] Release v0.38.0

### API Changes:

 * Added `accountClient.federationPolicy()` service and `accountClient.servicePrincipalFederationPolicy()` service.
 * Added `isSingleNode`, `kind` and `useMlRuntime` fields for `com.databricks.sdk.service.compute.ClusterAttributes`.
 * Added `isSingleNode`, `kind` and `useMlRuntime` fields for `com.databricks.sdk.service.compute.ClusterDetails`.
 * Added `isSingleNode`, `kind` and `useMlRuntime` fields for `com.databricks.sdk.service.compute.ClusterSpec`.
 * Added `isSingleNode`, `kind` and `useMlRuntime` fields for `com.databricks.sdk.service.compute.CreateCluster`.
 * Added `isSingleNode`, `kind` and `useMlRuntime` fields for `com.databricks.sdk.service.compute.EditCluster`.
 * Added `isSingleNode`, `kind` and `useMlRuntime` fields for `com.databricks.sdk.service.compute.UpdateClusterResource`.
 * Added `updateParameterSyntax` field for `com.databricks.sdk.service.dashboards.MigrateDashboardRequest`.
 * Added `cleanRoomsNotebookTask` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Added `cleanRoomsNotebookTask` field for `com.databricks.sdk.service.jobs.SubmitTask`.
 * Added `cleanRoomsNotebookTask` field for `com.databricks.sdk.service.jobs.Task`.
 * Changed `daysOfWeek` field for `com.databricks.sdk.service.pipelines.RestartWindow` to type `com.databricks.sdk.service.pipelines.RestartWindowDaysOfWeekList` class.

OpenAPI SHA: a6a317df8327c9b1e5cb59a03a42ffa2aabeef6d, Date: 2024-12-16


## [Release] Release v0.37.0

### Internal Changes

 * Update SDK to OpenAPI spec ([#389](https://github.com/databricks/databricks-sdk-java/pull/389)).


### API Changes:

 * Added `com.databricks.sdk.service.cleanrooms` package.
 * Added `delete()` method for `workspaceClient.aibiDashboardEmbeddingAccessPolicy()` service.
 * Added `delete()` method for `workspaceClient.aibiDashboardEmbeddingApprovedDomains()` service.
 * Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.CreateCredentialRequest`.
 * Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.CredentialInfo`.
 * Added `gcpOptions` field for `com.databricks.sdk.service.catalog.GenerateTemporaryServiceCredentialRequest`.
 * Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.UpdateCredentialRequest`.
 * Added `cachedQuerySchema` field for `com.databricks.sdk.service.dashboards.QueryAttachment`.
 * Added .
 * Removed `gcpServiceAccountKey` field for `com.databricks.sdk.service.catalog.CreateCredentialRequest`.

OpenAPI SHA: 7016dcbf2e011459416cf408ce21143bcc4b3a25, Date: 2024-12-05


## [Release] Release v0.36.0

### Internal Changes

 * Update Jobs GetRun API to support paginated responses for jobs and ForEach tasks ([#386](https://github.com/databricks/databricks-sdk-java/pull/386)).

### API Changes:

 * Added `servicePrincipalClientId` field for `com.databricks.sdk.service.apps.App`.
 * Added `azureServicePrincipal`, `gcpServiceAccountKey` and `readOnly` fields for `com.databricks.sdk.service.catalog.CreateCredentialRequest`.
 * Added `azureServicePrincipal`, `readOnly` and `usedForManagedStorage` fields for `com.databricks.sdk.service.catalog.CredentialInfo`.
 * Added `azureServicePrincipal` and `readOnly` fields for `com.databricks.sdk.service.catalog.UpdateCredentialRequest`.
 * Added `externalLocationName`, `readOnly` and `url` fields for `com.databricks.sdk.service.catalog.ValidateCredentialRequest`.
 * Added `isDir` field for `com.databricks.sdk.service.catalog.ValidateCredentialResponse`.
 * Changed `createCredential()` and `generateTemporaryServiceCredential()` methods for `workspaceClient.credentials()` service with new required argument order.
 * Changed `accessConnectorId` field for `com.databricks.sdk.service.catalog.AzureManagedIdentity` to be required.
 * Changed `accessConnectorId` field for `com.databricks.sdk.service.catalog.AzureManagedIdentity` to be required.
 * Changed `name` field for `com.databricks.sdk.service.catalog.CreateCredentialRequest` to be required.
 * Changed `credentialName` field for `com.databricks.sdk.service.catalog.GenerateTemporaryServiceCredentialRequest` to be required.

OpenAPI SHA: f2385add116e3716c8a90a0b68e204deb40f996c, Date: 2024-11-15

## [Release] Release v0.35.0

### New Features and Improvements

 * DatabricksConfig: Add clone() support ([#376](https://github.com/databricks/databricks-sdk-java/pull/376)).


### Bug Fixes

 * Fix vulnerabilities in the present SDK version ([#383](https://github.com/databricks/databricks-sdk-java/pull/383)).


### Internal Changes

 * Add test instructions for external contributors ([#370](https://github.com/databricks/databricks-sdk-java/pull/370)).
 * Always write message for manual test integration ([#374](https://github.com/databricks/databricks-sdk-java/pull/374)).
 * Automatically trigger integration tests on PR ([#369](https://github.com/databricks/databricks-sdk-java/pull/369)).
 * Move templates in the code generator ([#373](https://github.com/databricks/databricks-sdk-java/pull/373)).
 * Refresh PR template ([#381](https://github.com/databricks/databricks-sdk-java/pull/381)).


### API Changes:

 * Added `workspaceClient.aibiDashboardEmbeddingAccessPolicy()` service and `workspaceClient.aibiDashboardEmbeddingApprovedDomains()` service.
 * Added `workspaceClient.credentials()` service.
 * Added `appDeployment` field for `com.databricks.sdk.service.apps.CreateAppDeploymentRequest`.
 * Added `app` field for `com.databricks.sdk.service.apps.CreateAppRequest`.
 * Added `app` field for `com.databricks.sdk.service.apps.UpdateAppRequest`.
 * Added `table` field for `com.databricks.sdk.service.catalog.CreateOnlineTableRequest`.
 * Added `azureAad` field for `com.databricks.sdk.service.catalog.GenerateTemporaryTableCredentialResponse`.
 * Added `omitUsername` field for `com.databricks.sdk.service.catalog.ListTablesRequest`.
 * Added `fullName` field for `com.databricks.sdk.service.catalog.StorageCredentialInfo`.
 * Added `dashboard` field for `com.databricks.sdk.service.dashboards.CreateDashboardRequest`.
 * Added `schedule` field for `com.databricks.sdk.service.dashboards.CreateScheduleRequest`.
 * Added `subscription` field for `com.databricks.sdk.service.dashboards.CreateSubscriptionRequest`.
 * Added `warehouseId` field for `com.databricks.sdk.service.dashboards.Schedule`.
 * Added `dashboard` field for `com.databricks.sdk.service.dashboards.UpdateDashboardRequest`.
 * Added `schedule` field for `com.databricks.sdk.service.dashboards.UpdateScheduleRequest`.
 * Added `only` field for `com.databricks.sdk.service.jobs.RunNow`.
 * Added `pageToken` field for `com.databricks.sdk.service.oauth2.ListServicePrincipalSecretsRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.oauth2.ListServicePrincipalSecretsResponse`.
 * Added `restartWindow` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
 * Added `restartWindow` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
 * Added `connectionName` field for `com.databricks.sdk.service.pipelines.IngestionGatewayPipelineDefinition`.
 * Added `restartWindow` field for `com.databricks.sdk.service.pipelines.PipelineSpec`.
 * Added `isNoPublicIpEnabled` field for `com.databricks.sdk.service.provisioning.CreateWorkspaceRequest`.
 * Added `privateAccessSettingsId` field for `com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest`.
 * Added `externalCustomerInfo` and `isNoPublicIpEnabled` fields for `com.databricks.sdk.service.provisioning.Workspace`.
 * Added `lastUsedDay` field for `com.databricks.sdk.service.settings.TokenInfo`.
 * Changed `create()` method for `workspaceClient.apps()` service with new required argument order.
 * Changed `executeMessageQuery()` method for `workspaceClient.genie()` service . New request type is `com.databricks.sdk.service.dashboards.GenieExecuteMessageQueryRequest` class.
 * Changed `executeMessageQuery()` method for `workspaceClient.genie()` service to type `executeMessageQuery()` method for `workspaceClient.genie()` service.
 * Changed `create()`, `createSchedule()`, `createSubscription()` and `updateSchedule()` methods for `workspaceClient.lakeview()` service with new required argument order.
 * Removed `workspaceClient.cleanRooms()` service.
 * Removed `deploymentId`, `mode` and `sourceCodePath` fields for `com.databricks.sdk.service.apps.CreateAppDeploymentRequest`.
 * Removed `description`, `name` and `resources` fields for `com.databricks.sdk.service.apps.CreateAppRequest`.
 * Removed `description` and `resources` fields for `com.databricks.sdk.service.apps.UpdateAppRequest`.
 * Removed `name` and `spec` fields for `com.databricks.sdk.service.catalog.CreateOnlineTableRequest`.
 * Removed `displayName`, `parentPath`, `serializedDashboard` and `warehouseId` fields for `com.databricks.sdk.service.dashboards.CreateDashboardRequest`.
 * Removed `cronSchedule`, `displayName` and `pauseStatus` fields for `com.databricks.sdk.service.dashboards.CreateScheduleRequest`.
 * Removed `subscriber` field for `com.databricks.sdk.service.dashboards.CreateSubscriptionRequest`.
 * Removed `displayName`, `etag`, `serializedDashboard` and `warehouseId` fields for `com.databricks.sdk.service.dashboards.UpdateDashboardRequest`.
 * Removed `cronSchedule`, `displayName`, `etag` and `pauseStatus` fields for `com.databricks.sdk.service.dashboards.UpdateScheduleRequest`.
 * Removed `prevPageToken` field for `com.databricks.sdk.service.jobs.Run`.

OpenAPI SHA: d25296d2f4aa7bd6195c816fdf82e0f960f775da, Date: 2024-11-07


## [Release] Release v0.34.0

### New Features and Improvements

 * Experimental: Make retry strategy configurable ([#363](https://github.com/databricks/databricks-sdk-java/pull/363)).


### Bug Fixes

 * CommonHttpsClient Builder - set timeout correctly ([#362](https://github.com/databricks/databricks-sdk-java/pull/362)).




## [Release] Release v0.33.0

### Bug Fixes

 * Fix Ubuntu unit tests on Github Actions ([#366](https://github.com/databricks/databricks-sdk-java/pull/366)).


### API Changes:

 * Added `workspaceClient.disableLegacyDbfs()` service.
 * Added `com.databricks.sdk.service.apps.AppResource`, `com.databricks.sdk.service.apps.AppResourceJob`, `com.databricks.sdk.service.apps.AppResourceJobJobPermission`, `com.databricks.sdk.service.apps.AppResourceSecret`, `com.databricks.sdk.service.apps.AppResourceSecretSecretPermission`, `com.databricks.sdk.service.apps.AppResourceServingEndpoint`, `com.databricks.sdk.service.apps.AppResourceServingEndpointServingEndpointPermission`, `com.databricks.sdk.service.apps.AppResourceSqlWarehouse` and `com.databricks.sdk.service.apps.AppResourceSqlWarehouseSqlWarehousePermission` classes.
 * Added `com.databricks.sdk.service.pipelines.ReportSpec` class.
 * Added `com.databricks.sdk.service.settings.DeleteDisableLegacyDbfsRequest`, `com.databricks.sdk.service.settings.DeleteDisableLegacyDbfsResponse`, `com.databricks.sdk.service.settings.DisableLegacyDbfs`, `com.databricks.sdk.service.settings.GetDisableLegacyDbfsRequest` and `com.databricks.sdk.service.settings.UpdateDisableLegacyDbfsRequest` classes.
 * Added `com.databricks.sdk.service.workspace.CreateCredentialsRequest`, `com.databricks.sdk.service.workspace.CreateRepoRequest`, `com.databricks.sdk.service.workspace.CreateRepoResponse`, `com.databricks.sdk.service.workspace.DeleteCredentialsRequest`, `Object`, `Object`, `com.databricks.sdk.service.workspace.GetCredentialsRequest`, `com.databricks.sdk.service.workspace.GetRepoResponse`, `com.databricks.sdk.service.workspace.ListCredentialsResponse`, `com.databricks.sdk.service.workspace.UpdateCredentialsRequest`, `Object`, `com.databricks.sdk.service.workspace.UpdateRepoRequest` and `Object` classes.
 * Added `defaultSourceCodePath` and `resources` fields for `com.databricks.sdk.service.apps.App`.
 * Added `resources` field for `com.databricks.sdk.service.apps.CreateAppRequest`.
 * Added `resources` field for `com.databricks.sdk.service.apps.UpdateAppRequest`.
 * Added `unityCatalogProvisioningState` field for `com.databricks.sdk.service.catalog.OnlineTable`.
 * Added `isTruncated` field for `com.databricks.sdk.service.dashboards.Result`.
 * Added `effectiveBudgetPolicyId` field for `com.databricks.sdk.service.jobs.BaseJob`.
 * Added `budgetPolicyId` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `effectiveBudgetPolicyId` field for `com.databricks.sdk.service.jobs.Job`.
 * Added `budgetPolicyId` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `budgetPolicyId` field for `com.databricks.sdk.service.jobs.SubmitRun`.
 * Added `schema` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
 * Added `schema` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
 * Added `report` field for `com.databricks.sdk.service.pipelines.IngestionConfig`.
 * Added `schema` field for `com.databricks.sdk.service.pipelines.PipelineSpec`.
 * Added `sequenceBy` field for `com.databricks.sdk.service.pipelines.TableSpecificConfig`.
 * Added `notifyOnOk` field for `com.databricks.sdk.service.sql.Alert`.
 * Added `notifyOnOk` field for `com.databricks.sdk.service.sql.CreateAlertRequestAlert`.
 * Added `notifyOnOk` field for `com.databricks.sdk.service.sql.ListAlertsResponseAlert`.
 * Added `notifyOnOk` field for `com.databricks.sdk.service.sql.UpdateAlertRequestAlert`.
 * Added `credentialId`, `gitProvider` and `gitUsername` fields for `com.databricks.sdk.service.workspace.GetCredentialsResponse`.
 * Changed `create()` method for `workspaceClient.gitCredentials()` service . New request type is `com.databricks.sdk.service.workspace.CreateCredentialsRequest` class.
 * Changed `delete()` method for `workspaceClient.gitCredentials()` service to return `Object` class.
 * Changed `delete()` method for `workspaceClient.gitCredentials()` service . New request type is `com.databricks.sdk.service.workspace.DeleteCredentialsRequest` class.
 * Changed `get()` method for `workspaceClient.gitCredentials()` service to return `com.databricks.sdk.service.workspace.GetCredentialsResponse` class.
 * Changed `get()` method for `workspaceClient.gitCredentials()` service . New request type is `com.databricks.sdk.service.workspace.GetCredentialsRequest` class.
 * Changed `list()` method for `workspaceClient.gitCredentials()` service to return `com.databricks.sdk.service.workspace.ListCredentialsResponse` class.
 * Changed `update()` method for `workspaceClient.gitCredentials()` service to return `Object` class.
 * Changed `update()` method for `workspaceClient.gitCredentials()` service . New request type is `com.databricks.sdk.service.workspace.UpdateCredentialsRequest` class.
 * Changed `create()` method for `workspaceClient.repos()` service . New request type is `com.databricks.sdk.service.workspace.CreateRepoRequest` class.
 * Changed `create()` method for `workspaceClient.repos()` service to return `com.databricks.sdk.service.workspace.CreateRepoResponse` class.
 * Changed `delete()` method for `workspaceClient.repos()` service to return `Object` class.
 * Changed `get()` method for `workspaceClient.repos()` service to return `com.databricks.sdk.service.workspace.GetRepoResponse` class.
 * Changed `update()` method for `workspaceClient.repos()` service to return `Object` class.
 * Changed `update()` method for `workspaceClient.repos()` service . New request type is `com.databricks.sdk.service.workspace.UpdateRepoRequest` class.
 * Changed `credentialId` and `gitProvider` fields for `com.databricks.sdk.service.workspace.CreateCredentialsResponse` to be required.
 * Changed `credentialId` field for `com.databricks.sdk.service.workspace.CredentialInfo` to be required.
 * Changed `patterns` field for `com.databricks.sdk.service.workspace.SparseCheckout` to `com.databricks.sdk.service.workspace.List` class.
 * Changed `patterns` field for `com.databricks.sdk.service.workspace.SparseCheckoutUpdate` to `com.databricks.sdk.service.workspace.List` class.
 * Removed `com.databricks.sdk.service.workspace.CreateCredentials`, `com.databricks.sdk.service.workspace.CreateRepo`, `com.databricks.sdk.service.workspace.DeleteGitCredentialRequest`, `com.databricks.sdk.service.workspace.GetGitCredentialRequest`, `com.databricks.sdk.service.workspace.SparseCheckoutPattern`, `com.databricks.sdk.service.workspace.UpdateCredentials`, `com.databricks.sdk.service.workspace.UpdateRepo` and `Object` classes.
 * Removed `credentials` field for `com.databricks.sdk.service.workspace.GetCredentialsResponse`.

OpenAPI SHA: cf9c61453990df0f9453670f2fe68e1b128647a2, Date: 2024-10-14


## [Release] Release v0.32.2

### Bug Fixes

 * Make `UserAgent`'s `otherInfo` thread-safe ([#357](https://github.com/databricks/databricks-sdk-java/pull/357)).




## [Release] Release v0.32.1

### Bug Fixes

 * Retry on too many auth requests ([#355](https://github.com/databricks/databricks-sdk-java/pull/355)).




## [Release] Release v0.32.0

### Bug Fixes

 * Fix listAccountMetastoreAssignments Integration test ([#350](https://github.com/databricks/databricks-sdk-java/pull/350))
 * Fix parsing issue in ErrorDetail ([#328](https://github.com/databricks/databricks-sdk-java/pull/328))

### Internal Changes

 * Update SDK to OpenAPI spec ([#346](https://github.com/databricks/databricks-sdk-java/pull/346)).
 * Add DCO guidelines ([#351](https://github.com/databricks/databricks-sdk-java/pull/351))


### API Changes:

 * Added `workspaceClient.disableLegacyAccess()` service and `accountClient.disableLegacyFeatures()` service.
 * Added `workspaceClient.temporaryTableCredentials()` service.
 * Added `putAiGateway()` method for `workspaceClient.servingEndpoints()` service.
 * Added `com.databricks.sdk.service.apps.ApplicationState`, `com.databricks.sdk.service.apps.ApplicationStatus`, `com.databricks.sdk.service.apps.ComputeState` and `com.databricks.sdk.service.apps.ComputeStatus` classes.
 * Added `com.databricks.sdk.service.catalog.AwsCredentials`, `com.databricks.sdk.service.catalog.AzureUserDelegationSas`, `com.databricks.sdk.service.catalog.GcpOauthToken`, `com.databricks.sdk.service.catalog.GenerateTemporaryTableCredentialRequest`, `com.databricks.sdk.service.catalog.GenerateTemporaryTableCredentialResponse`, `com.databricks.sdk.service.catalog.R2Credentials` and `com.databricks.sdk.service.catalog.TableOperation` classes.
 * Added `com.databricks.sdk.service.serving.AiGatewayConfig`, `com.databricks.sdk.service.serving.AiGatewayGuardrailParameters`, `com.databricks.sdk.service.serving.AiGatewayGuardrailPiiBehavior`, `com.databricks.sdk.service.serving.AiGatewayGuardrailPiiBehaviorBehavior`, `com.databricks.sdk.service.serving.AiGatewayGuardrails`, `com.databricks.sdk.service.serving.AiGatewayInferenceTableConfig`, `com.databricks.sdk.service.serving.AiGatewayRateLimit`, `com.databricks.sdk.service.serving.AiGatewayRateLimitKey`, `com.databricks.sdk.service.serving.AiGatewayRateLimitRenewalPeriod`, `com.databricks.sdk.service.serving.AiGatewayUsageTrackingConfig`, `com.databricks.sdk.service.serving.PutAiGatewayRequest` and `com.databricks.sdk.service.serving.PutAiGatewayResponse` classes.
 * Added `com.databricks.sdk.service.settings.BooleanMessage`, `com.databricks.sdk.service.settings.DeleteDisableLegacyAccessRequest`, `com.databricks.sdk.service.settings.DeleteDisableLegacyAccessResponse`, `com.databricks.sdk.service.settings.DeleteDisableLegacyFeaturesRequest`, `com.databricks.sdk.service.settings.DeleteDisableLegacyFeaturesResponse`, `com.databricks.sdk.service.settings.DisableLegacyAccess`, `com.databricks.sdk.service.settings.DisableLegacyFeatures`, `com.databricks.sdk.service.settings.GetDisableLegacyAccessRequest`, `com.databricks.sdk.service.settings.GetDisableLegacyFeaturesRequest`, `com.databricks.sdk.service.settings.UpdateDisableLegacyAccessRequest` and `com.databricks.sdk.service.settings.UpdateDisableLegacyFeaturesRequest` classes.
 * Added `appStatus` and `computeStatus` fields for `com.databricks.sdk.service.apps.App`.
 * Added `deploymentId` field for `com.databricks.sdk.service.apps.CreateAppDeploymentRequest`.
 * Added `externalAccessEnabled` field for `com.databricks.sdk.service.catalog.GetMetastoreSummaryResponse`.
 * Added `includeManifestCapabilities` field for `com.databricks.sdk.service.catalog.GetTableRequest`.
 * Added `includeManifestCapabilities` field for `com.databricks.sdk.service.catalog.ListSummariesRequest`.
 * Added `includeManifestCapabilities` field for `com.databricks.sdk.service.catalog.ListTablesRequest`.
 * Added `externalAccessEnabled` field for `com.databricks.sdk.service.catalog.MetastoreInfo`.
 * Added `budgetPolicyId` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
 * Added `budgetPolicyId` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
 * Added `effectiveBudgetPolicyId` field for `com.databricks.sdk.service.pipelines.GetPipelineResponse`.
 * Added `budgetPolicyId` field for `com.databricks.sdk.service.pipelines.PipelineSpec`.
 * Added `aiGateway` field for `com.databricks.sdk.service.serving.CreateServingEndpoint`.
 * Added `aiGateway` field for `com.databricks.sdk.service.serving.ServingEndpoint`.
 * Added `aiGateway` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
 * Added `workspaceId` field for `com.databricks.sdk.service.settings.TokenInfo`.
 * Changed `delete()`, `start()` and `stop()` methods for `workspaceClient.apps()` service to return `com.databricks.sdk.service.apps.App` class.
 * Changed `deploy()` method for `workspaceClient.apps()` service with new required argument order.
 * Changed `sourceCodePath` field for `com.databricks.sdk.service.apps.AppDeployment` to no longer be required.
 * Changed `sourceCodePath` field for `com.databricks.sdk.service.apps.CreateAppDeploymentRequest` to no longer be required.
 * Changed `returnParams` and `routineDependencies` fields for `com.databricks.sdk.service.catalog.CreateFunction` to no longer be required.
 * Removed `com.databricks.sdk.service.apps.AppState`, `com.databricks.sdk.service.apps.AppStatus`, `Object` and `Object` classes.
 * Removed `com.databricks.sdk.service.sql.ClientCallContext`, `com.databricks.sdk.service.sql.EncodedText`, `com.databricks.sdk.service.sql.EncodedTextEncoding`, `com.databricks.sdk.service.sql.QuerySource`, `com.databricks.sdk.service.sql.QuerySourceDriverInfo`, `com.databricks.sdk.service.sql.QuerySourceEntryPoint`, `com.databricks.sdk.service.sql.QuerySourceJobManager`, `com.databricks.sdk.service.sql.QuerySourceTrigger` and `com.databricks.sdk.service.sql.ServerlessChannelInfo` classes.
 * Removed `status` field for `com.databricks.sdk.service.apps.App`.
 * Removed `querySource` field for `com.databricks.sdk.service.sql.QueryInfo`.

OpenAPI SHA: 6f6b1371e640f2dfeba72d365ac566368656f6b6, Date: 2024-09-19


## [Release] Release v0.31.1

### New Features and Improvements

 * Remove proxy settings from databricks config and use commons http client builder for connection manager ([#337](https://github.com/databricks/databricks-sdk-java/pull/337)).


### Bug Fixes

 * Remove Path Parameters from JSON body ([#344](https://github.com/databricks/databricks-sdk-java/pull/344)).
 * Stop pagination on empty next page token ([#343](https://github.com/databricks/databricks-sdk-java/pull/343)).




## [Release] Release v0.31.0

### New Features and Improvements

 * Add a way to provide non proxy hosts ([#331](https://github.com/databricks/databricks-sdk-java/pull/331)).
 * Add support for discovery URL ([#336](https://github.com/databricks/databricks-sdk-java/pull/336)).
 * Provide SSLSocketFactory in HttpClient ([#333](https://github.com/databricks/databricks-sdk-java/pull/333)).


### Bug Fixes

 * DatabricksConfig: newWithWorkspaceHost should retain authType ([#338](https://github.com/databricks/databricks-sdk-java/pull/338)).
 * Handle login.html incorrect validation for private link ([#340](https://github.com/databricks/databricks-sdk-java/pull/340)).


### Internal Changes

 * Fix nightly test failure ([#339](https://github.com/databricks/databricks-sdk-java/pull/339)).


### API Changes:

 * Added `regenerateDashboard()` method for `workspaceClient.qualityMonitors()` service.
 * Added `com.databricks.sdk.service.catalog.RegenerateDashboardRequest` and `com.databricks.sdk.service.catalog.RegenerateDashboardResponse` classes.
 * Added `com.databricks.sdk.service.jobs.QueueDetails`, `com.databricks.sdk.service.jobs.QueueDetailsCodeCode`, `com.databricks.sdk.service.jobs.RunLifecycleStateV2State`, `com.databricks.sdk.service.jobs.RunStatus`, `com.databricks.sdk.service.jobs.TerminationCodeCode`, `com.databricks.sdk.service.jobs.TerminationDetails` and `com.databricks.sdk.service.jobs.TerminationTypeType` classes.
 * Added `status` field for `com.databricks.sdk.service.jobs.BaseRun`.
 * Added `status` field for `com.databricks.sdk.service.jobs.RepairHistoryItem`.
 * Added `status` field for `com.databricks.sdk.service.jobs.Run`.
 * Added `status` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Added `maxProvisionedThroughput` and `minProvisionedThroughput` fields for `com.databricks.sdk.service.serving.ServedModelInput`.
 * Added `columnsToSync` field for `com.databricks.sdk.service.vectorsearch.DeltaSyncVectorIndexSpecRequest`.
 * Changed `workloadSize` field for `com.databricks.sdk.service.serving.ServedModelInput` to no longer be required.

OpenAPI SHA: d05898328669a3f8ab0c2ecee37db2673d3ea3f7, Date: 2024-09-04


## [Release] Release v0.30.0

### API Changes:

 * Added `workspaceClient.policyComplianceForClusters()` service.
 * Added `workspaceClient.policyComplianceForJobs()` service.
 * Added `workspaceClient.resourceQuotas()` service.
 * Added `com.databricks.sdk.service.catalog.GetQuotaRequest`, `com.databricks.sdk.service.catalog.GetQuotaResponse`, `com.databricks.sdk.service.catalog.ListQuotasRequest`, `com.databricks.sdk.service.catalog.ListQuotasResponse` and `com.databricks.sdk.service.catalog.QuotaInfo` classes.
 * Added `com.databricks.sdk.service.compute.ClusterCompliance`, `com.databricks.sdk.service.compute.ClusterSettingsChange`, `com.databricks.sdk.service.compute.EnforceClusterComplianceRequest`, `com.databricks.sdk.service.compute.EnforceClusterComplianceResponse`, `com.databricks.sdk.service.compute.GetClusterComplianceRequest`, `com.databricks.sdk.service.compute.GetClusterComplianceResponse`, `com.databricks.sdk.service.compute.ListClusterCompliancesRequest` and `com.databricks.sdk.service.compute.ListClusterCompliancesResponse` classes.
 * Added `com.databricks.sdk.service.jobs.EnforcePolicyComplianceForJobResponseJobClusterSettingsChange`, `com.databricks.sdk.service.jobs.EnforcePolicyComplianceRequest`, `com.databricks.sdk.service.jobs.EnforcePolicyComplianceResponse`, `com.databricks.sdk.service.jobs.GetPolicyComplianceRequest`, `com.databricks.sdk.service.jobs.GetPolicyComplianceResponse`, `com.databricks.sdk.service.jobs.JobCompliance`, `com.databricks.sdk.service.jobs.ListJobComplianceForPolicyResponse` and `com.databricks.sdk.service.jobs.ListJobComplianceRequest` classes.
 * Added `fallback` field for `com.databricks.sdk.service.catalog.CreateExternalLocation`.
 * Added `fallback` field for `com.databricks.sdk.service.catalog.ExternalLocationInfo`.
 * Added `fallback` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
 * Added `jobRunId` field for `com.databricks.sdk.service.jobs.BaseRun`.
 * Added `jobRunId` field for `com.databricks.sdk.service.jobs.Run`.
 * Added `includeMetrics` field for `com.databricks.sdk.service.sql.ListQueryHistoryRequest`.
 * Added `statementIds` field for `com.databricks.sdk.service.sql.QueryFilter`.
 * Removed `com.databricks.sdk.service.sql.ContextFilter` class.
 * Removed `contextFilter` field for `com.databricks.sdk.service.sql.QueryFilter`.
 * Removed `pipelineId` and `pipelineUpdateId` fields for `com.databricks.sdk.service.sql.QuerySource`.

OpenAPI SHA: 3eae49b444cac5a0118a3503e5b7ecef7f96527a, Date: 2024-08-21


## [Release] Release v0.29.0

### Internal Changes

 * Test that Jobs API endpoints are pinned to 2.1 ([#319](https://github.com/databricks/databricks-sdk-java/pull/319)).


### API Changes:

 * Added `update()` method for `workspaceClient.clusters()` service.
 * Added `com.databricks.sdk.service.compute.UpdateCluster`, `com.databricks.sdk.service.compute.UpdateClusterResource` and `Object` classes.
 * Added `com.databricks.sdk.service.pipelines.IngestionPipelineDefinition` class.
 * Added `maxResults` and `pageToken` fields for `com.databricks.sdk.service.catalog.GetBindingsRequest`.
 * Added `includeAliases` field for `com.databricks.sdk.service.catalog.GetByAliasRequest`.
 * Added `includeAliases` field for `com.databricks.sdk.service.catalog.GetModelVersionRequest`.
 * Added `includeAliases` field for `com.databricks.sdk.service.catalog.GetRegisteredModelRequest`.
 * Added `maxResults` and `pageToken` fields for `com.databricks.sdk.service.catalog.ListSystemSchemasRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.catalog.ListSystemSchemasResponse`.
 * Added `aliases` field for `com.databricks.sdk.service.catalog.ModelVersionInfo`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.catalog.WorkspaceBindingsResponse`.
 * Added `version` field for `com.databricks.sdk.service.compute.GetPolicyFamilyRequest`.
 * Added `id` field for `com.databricks.sdk.service.dashboards.QueryAttachment`.
 * Added `id` field for `com.databricks.sdk.service.dashboards.TextAttachment`.
 * Added `expirationTime` field for `com.databricks.sdk.service.sharing.CreateRecipient`.
 * Added `expirationTime` field for `com.databricks.sdk.service.sharing.UpdateRecipient`.
 * Changed `create()` and `edit()` methods for `workspaceClient.clusterPolicies()` service with new required argument order.
 * Changed `get()` method for `workspaceClient.modelVersions()` service to return `com.databricks.sdk.service.catalog.ModelVersionInfo` class.
 * Changed `name` field for `com.databricks.sdk.service.compute.CreatePolicy` to no longer be required.
 * Changed `name` field for `com.databricks.sdk.service.compute.EditPolicy` to no longer be required.
 * Changed `policyFamilyId` field for `com.databricks.sdk.service.compute.GetPolicyFamilyRequest` to `String` class.
 * Changed `policyFamilies` field for `com.databricks.sdk.service.compute.ListPolicyFamiliesResponse` to no longer be required.
 * Changed `definition`, `description`, `name` and `policyFamilyId` fields for `com.databricks.sdk.service.compute.PolicyFamily` to no longer be required.
 * Changed `accessControlList` field for `com.databricks.sdk.service.jobs.CreateJob` to `com.databricks.sdk.service.jobs.JobAccessControlRequestList` class.
 * Changed `accessControlList` field for `com.databricks.sdk.service.jobs.SubmitRun` to `com.databricks.sdk.service.jobs.JobAccessControlRequestList` class.
 * Changed `ingestionDefinition` field for `com.databricks.sdk.service.pipelines.CreatePipeline` to `com.databricks.sdk.service.pipelines.IngestionPipelineDefinition` class.
 * Changed `ingestionDefinition` field for `com.databricks.sdk.service.pipelines.EditPipeline` to `com.databricks.sdk.service.pipelines.IngestionPipelineDefinition` class.
 * Changed `ingestionDefinition` field for `com.databricks.sdk.service.pipelines.PipelineSpec` to `com.databricks.sdk.service.pipelines.IngestionPipelineDefinition` class.
 * Removed `com.databricks.sdk.service.pipelines.ManagedIngestionPipelineDefinition` class.
 * Removed `com.databricks.sdk.service.compute.PolicyFamilyId` class.

OpenAPI SHA: f98c07f9c71f579de65d2587bb0292f83d10e55d, Date: 2024-08-12


## [Release] Release v0.28.0

### Bug Fixes

 * Add missing token URL and client ID in Github OIDC Credentials Provider ([#322](https://github.com/databricks/databricks-sdk-java/pull/322)).


### Internal Changes

 * Add example for workspace unified authentication ([#320](https://github.com/databricks/databricks-sdk-java/pull/320)).
 * Fix processing of `quoted` titles ([#314](https://github.com/databricks/databricks-sdk-java/pull/314)).
 * Fixed SqlIT integration tests ([#326](https://github.com/databricks/databricks-sdk-java/pull/326)).
 * Move PR message validation to a separate workflow ([#312](https://github.com/databricks/databricks-sdk-java/pull/312)).
 * Trigger the validate workflow in the merge queue ([#313](https://github.com/databricks/databricks-sdk-java/pull/313)).
 * Update OpenAPI spec ([#316](https://github.com/databricks/databricks-sdk-java/pull/316)).


### API Changes:

 * Added `com.databricks.sdk.service.apps` package.
 * Added `accountClient.usageDashboards()` service.
 * Added `workspaceClient.alertsLegacy()` service, `workspaceClient.queriesLegacy()` service and `workspaceClient.queryVisualizationsLegacy()` service.
 * Added `workspaceClient.genie()` service.
 * Added `workspaceClient.notificationDestinations()` service.
 * Added `listVisualizations()` method for `workspaceClient.queries()` service.
 * Added `com.databricks.sdk.service.catalog.GetBindingsSecurableType` and `com.databricks.sdk.service.catalog.UpdateBindingsSecurableType` classes.
 * Added `com.databricks.sdk.service.pipelines.PipelineStateInfoHealth` class.
 * Added `com.databricks.sdk.service.billing.ActionConfiguration`, `com.databricks.sdk.service.billing.ActionConfigurationType`, `com.databricks.sdk.service.billing.AlertConfiguration`, `com.databricks.sdk.service.billing.AlertConfigurationQuantityType`, `com.databricks.sdk.service.billing.AlertConfigurationTimePeriod`, `com.databricks.sdk.service.billing.AlertConfigurationTriggerType`, `com.databricks.sdk.service.billing.BudgetConfiguration`, `com.databricks.sdk.service.billing.BudgetConfigurationFilter`, `com.databricks.sdk.service.billing.BudgetConfigurationFilterClause`, `com.databricks.sdk.service.billing.BudgetConfigurationFilterOperator`, `com.databricks.sdk.service.billing.BudgetConfigurationFilterTagClause`, `com.databricks.sdk.service.billing.BudgetConfigurationFilterWorkspaceIdClause`, `com.databricks.sdk.service.billing.CreateBillingUsageDashboardRequest`, `com.databricks.sdk.service.billing.CreateBillingUsageDashboardResponse`, `com.databricks.sdk.service.billing.CreateBudgetConfigurationBudget`, `com.databricks.sdk.service.billing.CreateBudgetConfigurationBudgetActionConfigurations`, `com.databricks.sdk.service.billing.CreateBudgetConfigurationBudgetAlertConfigurations`, `com.databricks.sdk.service.billing.CreateBudgetConfigurationRequest`, `com.databricks.sdk.service.billing.CreateBudgetConfigurationResponse`, `com.databricks.sdk.service.billing.DeleteBudgetConfigurationRequest`, `Object`, `com.databricks.sdk.service.billing.GetBillingUsageDashboardRequest`, `com.databricks.sdk.service.billing.GetBillingUsageDashboardResponse`, `com.databricks.sdk.service.billing.GetBudgetConfigurationRequest`, `com.databricks.sdk.service.billing.GetBudgetConfigurationResponse`, `com.databricks.sdk.service.billing.ListBudgetConfigurationsRequest`, `com.databricks.sdk.service.billing.ListBudgetConfigurationsResponse`, `com.databricks.sdk.service.billing.UpdateBudgetConfigurationBudget`, `com.databricks.sdk.service.billing.UpdateBudgetConfigurationRequest`, `com.databricks.sdk.service.billing.UpdateBudgetConfigurationResponse` and `com.databricks.sdk.service.billing.UsageDashboardType` classes.
 * Added `com.databricks.sdk.service.compute.ListClustersFilterBy`, `com.databricks.sdk.service.compute.ListClustersSortBy`, `com.databricks.sdk.service.compute.ListClustersSortByDirection` and `com.databricks.sdk.service.compute.ListClustersSortByField` classes.
 * Added `com.databricks.sdk.service.dashboards.ExecuteMessageQueryRequest`, `com.databricks.sdk.service.dashboards.GenieAttachment`, `com.databricks.sdk.service.dashboards.GenieConversation`, `com.databricks.sdk.service.dashboards.GenieCreateConversationMessageRequest`, `com.databricks.sdk.service.dashboards.GenieGetConversationMessageRequest`, `com.databricks.sdk.service.dashboards.GenieGetMessageQueryResultRequest`, `com.databricks.sdk.service.dashboards.GenieGetMessageQueryResultResponse`, `com.databricks.sdk.service.dashboards.GenieMessage`, `com.databricks.sdk.service.dashboards.GenieStartConversationMessageRequest`, `com.databricks.sdk.service.dashboards.GenieStartConversationResponse`, `com.databricks.sdk.service.dashboards.MessageError`, `com.databricks.sdk.service.dashboards.MessageErrorType`, `com.databricks.sdk.service.dashboards.MessageStatus`, `com.databricks.sdk.service.dashboards.QueryAttachment`, `com.databricks.sdk.service.dashboards.Result` and `com.databricks.sdk.service.dashboards.TextAttachment` classes.
 * Added `Object`, `com.databricks.sdk.service.iam.MigratePermissionsRequest` and `com.databricks.sdk.service.iam.MigratePermissionsResponse` classes.
 * Added `com.databricks.sdk.service.oauth2.ListCustomAppIntegrationsRequest` and `com.databricks.sdk.service.oauth2.ListPublishedAppIntegrationsRequest` classes.
 * Added `com.databricks.sdk.service.serving.GoogleCloudVertexAiConfig` class.
 * Added `com.databricks.sdk.service.settings.Config`, `com.databricks.sdk.service.settings.CreateNotificationDestinationRequest`, `com.databricks.sdk.service.settings.DeleteNotificationDestinationRequest`, `com.databricks.sdk.service.settings.DestinationType`, `com.databricks.sdk.service.settings.EmailConfig`, `Object`, `com.databricks.sdk.service.settings.GenericWebhookConfig`, `com.databricks.sdk.service.settings.GetNotificationDestinationRequest`, `com.databricks.sdk.service.settings.ListNotificationDestinationsRequest`, `com.databricks.sdk.service.settings.ListNotificationDestinationsResponse`, `com.databricks.sdk.service.settings.ListNotificationDestinationsResult`, `com.databricks.sdk.service.settings.MicrosoftTeamsConfig`, `com.databricks.sdk.service.settings.NotificationDestination`, `com.databricks.sdk.service.settings.PagerdutyConfig`, `com.databricks.sdk.service.settings.SlackConfig` and `com.databricks.sdk.service.settings.UpdateNotificationDestinationRequest` classes.
 * Added `com.databricks.sdk.service.sql.AlertCondition`, `com.databricks.sdk.service.sql.AlertConditionOperand`, `com.databricks.sdk.service.sql.AlertConditionThreshold`, `com.databricks.sdk.service.sql.AlertOperandColumn`, `com.databricks.sdk.service.sql.AlertOperandValue`, `com.databricks.sdk.service.sql.AlertOperator`, `com.databricks.sdk.service.sql.ClientCallContext`, `com.databricks.sdk.service.sql.ContextFilter`, `com.databricks.sdk.service.sql.CreateAlertRequest`, `com.databricks.sdk.service.sql.CreateAlertRequestAlert`, `com.databricks.sdk.service.sql.CreateQueryRequest`, `com.databricks.sdk.service.sql.CreateQueryRequestQuery`, `com.databricks.sdk.service.sql.CreateQueryVisualizationsLegacyRequest`, `com.databricks.sdk.service.sql.CreateVisualizationRequest`, `com.databricks.sdk.service.sql.CreateVisualizationRequestVisualization`, `com.databricks.sdk.service.sql.DatePrecision`, `com.databricks.sdk.service.sql.DateRange`, `com.databricks.sdk.service.sql.DateRangeValue`, `com.databricks.sdk.service.sql.DateRangeValueDynamicDateRange`, `com.databricks.sdk.service.sql.DateValue`, `com.databricks.sdk.service.sql.DateValueDynamicDate`, `com.databricks.sdk.service.sql.DeleteAlertsLegacyRequest`, `com.databricks.sdk.service.sql.DeleteQueriesLegacyRequest`, `com.databricks.sdk.service.sql.DeleteQueryVisualizationsLegacyRequest`, `com.databricks.sdk.service.sql.DeleteVisualizationRequest`, `Object`, `com.databricks.sdk.service.sql.EncodedText`, `com.databricks.sdk.service.sql.EncodedTextEncoding`, `com.databricks.sdk.service.sql.EnumValue`, `com.databricks.sdk.service.sql.GetAlertsLegacyRequest`, `com.databricks.sdk.service.sql.GetQueriesLegacyRequest`, `com.databricks.sdk.service.sql.LegacyAlert`, `com.databricks.sdk.service.sql.LegacyAlertState`, `com.databricks.sdk.service.sql.LegacyQuery`, `com.databricks.sdk.service.sql.LegacyVisualization`, `com.databricks.sdk.service.sql.LifecycleState`, `com.databricks.sdk.service.sql.ListAlertsRequest`, `com.databricks.sdk.service.sql.ListAlertsResponse`, `com.databricks.sdk.service.sql.ListAlertsResponseAlert`, `com.databricks.sdk.service.sql.ListQueriesLegacyRequest`, `com.databricks.sdk.service.sql.ListQueryObjectsResponse`, `com.databricks.sdk.service.sql.ListQueryObjectsResponseQuery`, `com.databricks.sdk.service.sql.ListVisualizationsForQueryRequest`, `com.databricks.sdk.service.sql.ListVisualizationsForQueryResponse`, `com.databricks.sdk.service.sql.NumericValue`, `com.databricks.sdk.service.sql.QueryBackedValue`, `com.databricks.sdk.service.sql.QueryParameter`, `com.databricks.sdk.service.sql.QuerySource`, `com.databricks.sdk.service.sql.QuerySourceDriverInfo`, `com.databricks.sdk.service.sql.QuerySourceEntryPoint`, `com.databricks.sdk.service.sql.QuerySourceJobManager`, `com.databricks.sdk.service.sql.QuerySourceTrigger`, `com.databricks.sdk.service.sql.RestoreQueriesLegacyRequest`, `com.databricks.sdk.service.sql.RunAsMode`, `com.databricks.sdk.service.sql.ServerlessChannelInfo`, `com.databricks.sdk.service.sql.StatementResponse`, `com.databricks.sdk.service.sql.TextValue`, `com.databricks.sdk.service.sql.TrashAlertRequest`, `com.databricks.sdk.service.sql.TrashQueryRequest`, `com.databricks.sdk.service.sql.UpdateAlertRequest`, `com.databricks.sdk.service.sql.UpdateAlertRequestAlert`, `com.databricks.sdk.service.sql.UpdateQueryRequest`, `com.databricks.sdk.service.sql.UpdateQueryRequestQuery`, `com.databricks.sdk.service.sql.UpdateVisualizationRequest` and `com.databricks.sdk.service.sql.UpdateVisualizationRequestVisualization` classes.
 * Added `force` field for `com.databricks.sdk.service.catalog.DeleteSchemaRequest`.
 * Added `filterBy`, `pageSize`, `pageToken` and `sortBy` fields for `com.databricks.sdk.service.compute.ListClustersRequest`.
 * Added `nextPageToken` and `prevPageToken` fields for `com.databricks.sdk.service.compute.ListClustersResponse`.
 * Added `pageToken` field for `com.databricks.sdk.service.jobs.GetRunRequest`.
 * Added `iterations`, `nextPageToken` and `prevPageToken` fields for `com.databricks.sdk.service.jobs.Run`.
 * Added `createTime`, `createdBy`, `creatorUsername` and `scopes` fields for `com.databricks.sdk.service.oauth2.GetCustomAppIntegrationOutput`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.oauth2.GetCustomAppIntegrationsOutput`.
 * Added `createTime` and `createdBy` fields for `com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationOutput`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.oauth2.GetPublishedAppIntegrationsOutput`.
 * Added `enableLocalDiskEncryption` field for `com.databricks.sdk.service.pipelines.PipelineCluster`.
 * Added `whl` field for `com.databricks.sdk.service.pipelines.PipelineLibrary`.
 * Added `health` field for `com.databricks.sdk.service.pipelines.PipelineStateInfo`.
 * Added `ai21labsApiKeyPlaintext` field for `com.databricks.sdk.service.serving.Ai21LabsConfig`.
 * Added `awsAccessKeyIdPlaintext` and `awsSecretAccessKeyPlaintext` fields for `com.databricks.sdk.service.serving.AmazonBedrockConfig`.
 * Added `anthropicApiKeyPlaintext` field for `com.databricks.sdk.service.serving.AnthropicConfig`.
 * Added `cohereApiBase` and `cohereApiKeyPlaintext` fields for `com.databricks.sdk.service.serving.CohereConfig`.
 * Added `databricksApiTokenPlaintext` field for `com.databricks.sdk.service.serving.DatabricksModelServingConfig`.
 * Added `googleCloudVertexAiConfig` field for `com.databricks.sdk.service.serving.ExternalModel`.
 * Added `microsoftEntraClientSecretPlaintext` and `openaiApiKeyPlaintext` fields for `com.databricks.sdk.service.serving.OpenAiConfig`.
 * Added `palmApiKeyPlaintext` field for `com.databricks.sdk.service.serving.PaLmConfig`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.sharing.GetRecipientSharePermissionsResponse`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.sharing.ListProviderSharesResponse`.
 * Added `maxResults` and `pageToken` fields for `com.databricks.sdk.service.sharing.ListProvidersRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.sharing.ListProvidersResponse`.
 * Added `maxResults` and `pageToken` fields for `com.databricks.sdk.service.sharing.ListRecipientsRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.sharing.ListRecipientsResponse`.
 * Added `maxResults` and `pageToken` fields for `com.databricks.sdk.service.sharing.ListSharesRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.sharing.ListSharesResponse`.
 * Added `maxResults` and `pageToken` fields for `com.databricks.sdk.service.sharing.SharePermissionsRequest`.
 * Added `maxResults` and `pageToken` fields for `com.databricks.sdk.service.sharing.UpdateSharePermissions`.
 * Added `condition`, `createTime`, `customBody`, `customSubject`, `displayName`, `lifecycleState`, `ownerUserName`, `parentPath`, `queryId`, `secondsToRetrigger`, `triggerTime` and `updateTime` fields for `com.databricks.sdk.service.sql.Alert`.
 * Added `id` field for `com.databricks.sdk.service.sql.GetAlertRequest`.
 * Added `id` field for `com.databricks.sdk.service.sql.GetQueryRequest`.
 * Added `pageToken` field for `com.databricks.sdk.service.sql.ListQueriesRequest`.
 * Added `applyAutoLimit`, `catalog`, `createTime`, `displayName`, `lastModifierUserName`, `lifecycleState`, `ownerUserName`, `parameters`, `parentPath`, `queryText`, `runAsMode`, `schema`, `updateTime` and `warehouseId` fields for `com.databricks.sdk.service.sql.Query`.
 * Added `contextFilter` field for `com.databricks.sdk.service.sql.QueryFilter`.
 * Added `querySource` field for `com.databricks.sdk.service.sql.QueryInfo`.
 * Added `createTime`, `displayName`, `queryId`, `serializedOptions`, `serializedQueryPlan` and `updateTime` fields for `com.databricks.sdk.service.sql.Visualization`.
 * Changed `create()` method for `accountClient.budgets()` service . New request type is `com.databricks.sdk.service.billing.CreateBudgetConfigurationRequest` class.
 * Changed `create()` method for `accountClient.budgets()` service to return `com.databricks.sdk.service.billing.CreateBudgetConfigurationResponse` class.
 * Changed `delete()` method for `accountClient.budgets()` service . New request type is `com.databricks.sdk.service.billing.DeleteBudgetConfigurationRequest` class.
 * Changed `delete()` method for `accountClient.budgets()` service to return `Object` class.
 * Changed `get()` method for `accountClient.budgets()` service . New request type is `com.databricks.sdk.service.billing.GetBudgetConfigurationRequest` class.
 * Changed `get()` method for `accountClient.budgets()` service to return `com.databricks.sdk.service.billing.GetBudgetConfigurationResponse` class.
 * Changed `list()` method for `accountClient.budgets()` service to require request of `com.databricks.sdk.service.billing.ListBudgetConfigurationsRequest` class.
 * Changed `list()` method for `accountClient.budgets()` service to return `com.databricks.sdk.service.billing.ListBudgetConfigurationsResponse` class.
 * Changed `update()` method for `accountClient.budgets()` service to return `com.databricks.sdk.service.billing.UpdateBudgetConfigurationResponse` class.
 * Changed `update()` method for `accountClient.budgets()` service . New request type is `com.databricks.sdk.service.billing.UpdateBudgetConfigurationRequest` class.
 * Changed `create()` method for `accountClient.customAppIntegration()` service with new required argument order.
 * Changed `list()` method for `accountClient.customAppIntegration()` service to require request of `com.databricks.sdk.service.oauth2.ListCustomAppIntegrationsRequest` class.
 * Changed `list()` method for `accountClient.publishedAppIntegration()` service to require request of `com.databricks.sdk.service.oauth2.ListPublishedAppIntegrationsRequest` class.
 * Changed `delete()` method for `accountClient.workspaceAssignment()` service to return `Object` class.
 * Changed `update()` method for `accountClient.workspaceAssignment()` service with new required argument order.
 * Changed `create()` method for `workspaceClient.alerts()` service . New request type is `com.databricks.sdk.service.sql.CreateAlertRequest` class.
 * Changed `delete()` method for `workspaceClient.alerts()` service to return `Object` class.
 * Changed `delete()` method for `workspaceClient.alerts()` service . New request type is `com.databricks.sdk.service.sql.TrashAlertRequest` class.
 * Changed `get()` method for `workspaceClient.alerts()` service with new required argument order.
 * Changed `list()` method for `workspaceClient.alerts()` service to require request of `com.databricks.sdk.service.sql.ListAlertsRequest` class.
 * Changed `list()` method for `workspaceClient.alerts()` service to return `com.databricks.sdk.service.sql.ListAlertsResponse` class.
 * Changed `update()` method for `workspaceClient.alerts()` service . New request type is `com.databricks.sdk.service.sql.UpdateAlertRequest` class.
 * Changed `update()` method for `workspaceClient.alerts()` service to return `com.databricks.sdk.service.sql.Alert` class.
 * Changed `migratePermissions()` method for `workspaceClient.permissionMigration()` service to return `com.databricks.sdk.service.iam.MigratePermissionsResponse` class.
 * Changed `migratePermissions()` method for `workspaceClient.permissionMigration()` service . New request type is `com.databricks.sdk.service.iam.MigratePermissionsRequest` class.
 * Changed `create()` method for `workspaceClient.queries()` service . New request type is `com.databricks.sdk.service.sql.CreateQueryRequest` class.
 * Changed `delete()` method for `workspaceClient.queries()` service to return `Object` class.
 * Changed `delete()` method for `workspaceClient.queries()` service . New request type is `com.databricks.sdk.service.sql.TrashQueryRequest` class.
 * Changed `get()` method for `workspaceClient.queries()` service with new required argument order.
 * Changed `list()` method for `workspaceClient.queries()` service to return `com.databricks.sdk.service.sql.ListQueryObjectsResponse` class.
 * Changed `update()` method for `workspaceClient.queries()` service . New request type is `com.databricks.sdk.service.sql.UpdateQueryRequest` class.
 * Changed `create()` method for `workspaceClient.queryVisualizations()` service . New request type is `com.databricks.sdk.service.sql.CreateVisualizationRequest` class.
 * Changed `delete()` method for `workspaceClient.queryVisualizations()` service . New request type is `com.databricks.sdk.service.sql.DeleteVisualizationRequest` class.
 * Changed `delete()` method for `workspaceClient.queryVisualizations()` service to return `Object` class.
 * Changed `update()` method for `workspaceClient.queryVisualizations()` service . New request type is `com.databricks.sdk.service.sql.UpdateVisualizationRequest` class.
 * Changed `list()` method for `workspaceClient.shares()` service to require request of `com.databricks.sdk.service.sharing.ListSharesRequest` class.
 * Changed `executeStatement()` and `getStatement()` methods for `workspaceClient.statementExecution()` service to return `com.databricks.sdk.service.sql.StatementResponse` class.
 * Changed `securableType` field for `com.databricks.sdk.service.catalog.GetBindingsRequest` to `com.databricks.sdk.service.catalog.GetBindingsSecurableType` class.
 * Changed `securableType` field for `com.databricks.sdk.service.catalog.UpdateWorkspaceBindingsParameters` to `com.databricks.sdk.service.catalog.UpdateBindingsSecurableType` class.
 * Changed `permissions` field for `com.databricks.sdk.service.iam.UpdateWorkspaceAssignments` to no longer be required.
 * Changed `name` and `redirectUrls` fields for `com.databricks.sdk.service.oauth2.CreateCustomAppIntegration` to no longer be required.
 * Changed `ai21labsApiKey` field for `com.databricks.sdk.service.serving.Ai21LabsConfig` to no longer be required.
 * Changed `awsAccessKeyId` and `awsSecretAccessKey` fields for `com.databricks.sdk.service.serving.AmazonBedrockConfig` to no longer be required.
 * Changed `anthropicApiKey` field for `com.databricks.sdk.service.serving.AnthropicConfig` to no longer be required.
 * Changed `cohereApiKey` field for `com.databricks.sdk.service.serving.CohereConfig` to no longer be required.
 * Changed `databricksApiToken` field for `com.databricks.sdk.service.serving.DatabricksModelServingConfig` to no longer be required.
 * Changed `palmApiKey` field for `com.databricks.sdk.service.serving.PaLmConfig` to no longer be required.
 * Changed `tags` field for `com.databricks.sdk.service.sql.Query` to `com.databricks.sdk.service.sql.List` class.
 * Changed `userIds` and `warehouseIds` fields for `com.databricks.sdk.service.sql.QueryFilter` to `com.databricks.sdk.service.sql.List` class.
 * Changed `results` field for `com.databricks.sdk.service.sql.QueryList` to `com.databricks.sdk.service.sql.LegacyQueryList` class.
 * Changed `visualization` field for `com.databricks.sdk.service.sql.Widget` to `com.databricks.sdk.service.sql.LegacyVisualization` class.
 * Removed `workspaceClient.apps()` service.
 * Removed `restore()` method for `workspaceClient.queries()` service.
 * Removed `com.databricks.sdk.service.marketplace.FilterType`, `com.databricks.sdk.service.marketplace.ProviderIconFile`, `com.databricks.sdk.service.marketplace.ProviderIconType`, `com.databricks.sdk.service.marketplace.ProviderListingSummaryInfo`, `com.databricks.sdk.service.marketplace.SortBy` and `com.databricks.sdk.service.marketplace.VisibilityFilter` classes.
 * Removed `com.databricks.sdk.service.billing.Budget`, `com.databricks.sdk.service.billing.BudgetAlert`, `com.databricks.sdk.service.billing.BudgetList`, `com.databricks.sdk.service.billing.BudgetWithStatus`, `com.databricks.sdk.service.billing.BudgetWithStatusStatusDailyItem`, `com.databricks.sdk.service.billing.DeleteBudgetRequest`, `Object`, `com.databricks.sdk.service.billing.GetBudgetRequest`, `Object`, `com.databricks.sdk.service.billing.WrappedBudget` and `com.databricks.sdk.service.billing.WrappedBudgetWithStatus` classes.
 * Removed `Object`, `com.databricks.sdk.service.iam.PermissionMigrationRequest` and `com.databricks.sdk.service.iam.PermissionMigrationResponse` classes.
 * Removed `com.databricks.sdk.service.serving.App`, `com.databricks.sdk.service.serving.AppDeployment`, `com.databricks.sdk.service.serving.AppDeploymentArtifacts`, `com.databricks.sdk.service.serving.AppDeploymentMode`, `com.databricks.sdk.service.serving.AppDeploymentState`, `com.databricks.sdk.service.serving.AppDeploymentStatus`, `com.databricks.sdk.service.serving.AppEnvironment`, `com.databricks.sdk.service.serving.AppState`, `com.databricks.sdk.service.serving.AppStatus`, `com.databricks.sdk.service.serving.CreateAppDeploymentRequest`, `com.databricks.sdk.service.serving.CreateAppRequest`, `com.databricks.sdk.service.serving.DeleteAppRequest`, `com.databricks.sdk.service.serving.EnvVariable`, `com.databricks.sdk.service.serving.GetAppDeploymentRequest`, `com.databricks.sdk.service.serving.GetAppEnvironmentRequest`, `com.databricks.sdk.service.serving.GetAppRequest`, `com.databricks.sdk.service.serving.ListAppDeploymentsRequest`, `com.databricks.sdk.service.serving.ListAppDeploymentsResponse`, `com.databricks.sdk.service.serving.ListAppsRequest`, `com.databricks.sdk.service.serving.ListAppsResponse`, `com.databricks.sdk.service.serving.StartAppRequest`, `com.databricks.sdk.service.serving.StopAppRequest`, `Object` and `com.databricks.sdk.service.serving.UpdateAppRequest` classes.
 * Removed `com.databricks.sdk.service.sql.CreateQueryVisualizationRequest`, `com.databricks.sdk.service.sql.DeleteAlertRequest`, `com.databricks.sdk.service.sql.DeleteQueryRequest`, `com.databricks.sdk.service.sql.DeleteQueryVisualizationRequest`, `com.databricks.sdk.service.sql.ExecuteStatementResponse`, `com.databricks.sdk.service.sql.GetStatementResponse`, `com.databricks.sdk.service.sql.RestoreQueryRequest`, `com.databricks.sdk.service.sql.StatementId`, `com.databricks.sdk.service.sql.UserId` and `com.databricks.sdk.service.sql.WarehouseId` classes.
 * Removed `canUseClient` field for `com.databricks.sdk.service.compute.ListClustersRequest`.
 * Removed `isAscending` and `sortBy` fields for `com.databricks.sdk.service.marketplace.ListListingsRequest`.
 * Removed `providerSummary` field for `com.databricks.sdk.service.marketplace.Listing`.
 * Removed `filters` field for `com.databricks.sdk.service.marketplace.ListingSetting`.
 * Removed `metastoreId` field for `com.databricks.sdk.service.marketplace.ListingSummary`.
 * Removed `isAscending` and `sortBy` fields for `com.databricks.sdk.service.marketplace.SearchListingsRequest`.
 * Removed `createdAt`, `lastTriggeredAt`, `name`, `options`, `parent`, `query`, `rearm`, `updatedAt` and `user` fields for `com.databricks.sdk.service.sql.Alert`.
 * Removed `alertId` field for `com.databricks.sdk.service.sql.GetAlertRequest`.
 * Removed `queryId` field for `com.databricks.sdk.service.sql.GetQueryRequest`.
 * Removed `order`, `page` and `q` fields for `com.databricks.sdk.service.sql.ListQueriesRequest`.
 * Removed `includeMetrics` field for `com.databricks.sdk.service.sql.ListQueryHistoryRequest`.
 * Removed `canEdit`, `createdAt`, `dataSourceId`, `isArchived`, `isDraft`, `isFavorite`, `isSafe`, `lastModifiedBy`, `lastModifiedById`, `latestQueryDataId`, `name`, `options`, `parent`, `permissionTier`, `query`, `queryHash`, `runAsRole`, `updatedAt`, `user`, `userId` and `visualizations` fields for `com.databricks.sdk.service.sql.Query`.
 * Removed `statementIds` field for `com.databricks.sdk.service.sql.QueryFilter`.
 * Removed `canSubscribeToLiveQuery` field for `com.databricks.sdk.service.sql.QueryInfo`.
 * Removed `metadataTimeMs`, `planningTimeMs` and `queryExecutionTimeMs` fields for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Removed `createdAt`, `description`, `name`, `options`, `query` and `updatedAt` fields for `com.databricks.sdk.service.sql.Visualization`.

OpenAPI SHA: cde487f4948666f7eff0f7566cd0d2704bb2e2fa, Date: 2024-08-01


## 0.27.1

### New Features and Improvements
 * Specify proxy auth explicitly when using system proxy ([#300](https://github.com/databricks/databricks-sdk-java/pull/300)).
 * Accept any `HttpRequest` instead of `HttpUriRequest` in `CommonHttpClient` ([#305](https://github.com/databricks/databricks-sdk-java/pull/305)).
 * Add credential provider for Azure Github OIDC ([#307](https://github.com/databricks/databricks-sdk-java/pull/307)).

### Internal Changes
 * Add Release tag and Workflow Fix ([#309](https://github.com/databricks/databricks-sdk-java/pull/309)).
 * Improve Changelog by grouping changes ([#308](https://github.com/databricks/databricks-sdk-java/pull/308)).
 * Test parsing of error messages with `int` error codes ([#303](https://github.com/databricks/databricks-sdk-java/pull/303)).
 * Run AccountClientIT test only for aws-prod-ucacct ([#311](https://github.com/databricks/databricks-sdk-java/pull/311)).


## 0.27.0

### Improvements
 
 * Support partners in headers for SDK ([#291](https://github.com/databricks/databricks-sdk-java/pull/291)).
 * Add `serverless_compute_id` field to the config ([#299](https://github.com/databricks/databricks-sdk-java/pull/299)).


### Internal Changes
 
 * Ignore DataPlane Services during generation ([#296](https://github.com/databricks/databricks-sdk-java/pull/296)).
 * Update OpenAPI spec ([#297](https://github.com/databricks/databricks-sdk-java/pull/297)).
 * Retry failed integration tests ([#298](https://github.com/databricks/databricks-sdk-java/pull/298)).


### API Changes:

 * Changed `list()` method for `accountClient.storageCredentials()` service to return `com.databricks.sdk.service.catalog.ListAccountStorageCredentialsResponse` class.
 * Changed `isolationMode` field for `com.databricks.sdk.service.catalog.CatalogInfo` to `com.databricks.sdk.service.catalog.CatalogIsolationMode` class.
 * Added `isolationMode` field for `com.databricks.sdk.service.catalog.ExternalLocationInfo`.
 * Added `maxResults` and `pageToken` fields for `com.databricks.sdk.service.catalog.ListCatalogsRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.catalog.ListCatalogsResponse`.
 * Added `tableServingUrl` field for `com.databricks.sdk.service.catalog.OnlineTable`.
 * Added `isolationMode` field for `com.databricks.sdk.service.catalog.StorageCredentialInfo`.
 * Changed `isolationMode` field for `com.databricks.sdk.service.catalog.UpdateCatalog` to `com.databricks.sdk.service.catalog.CatalogIsolationMode` class.
 * Added `isolationMode` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
 * Added `isolationMode` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Added `com.databricks.sdk.service.catalog.CatalogIsolationMode` and `com.databricks.sdk.service.catalog.ListAccountStorageCredentialsResponse` class.es
 * Added `createSchedule()`, `createSubscription()`, `deleteSchedule()`, `deleteSubscription()`, `getSchedule()`, `getSubscription()`, `list()`, `listSchedules()`, `listSubscriptions()` and `updateSchedule()` methods for `workspaceClient.lakeview()` service.
 * Added `com.databricks.sdk.service.dashboards.CreateScheduleRequest`, `com.databricks.sdk.service.dashboards.CreateSubscriptionRequest`, `com.databricks.sdk.service.dashboards.CronSchedule`, `com.databricks.sdk.service.dashboards.DashboardView`, `com.databricks.sdk.service.dashboards.DeleteScheduleRequest`, `com.databricks.sdk.service.dashboards.DeleteSubscriptionRequest`, `com.databricks.sdk.service.dashboards.GetScheduleRequest`, `com.databricks.sdk.service.dashboards.GetSubscriptionRequest`, `com.databricks.sdk.service.dashboards.ListDashboardsRequest`, `com.databricks.sdk.service.dashboards.ListDashboardsResponse`,`com.databricks.sdk.service.dashboards.ListSchedulesRequest`, `com.databricks.sdk.service.dashboards.ListSchedulesResponse`, `com.databricks.sdk.service.dashboards.ListSubscriptionsRequest`, `com.databricks.sdk.service.dashboards.ListSubscriptionsResponse`, `com.databricks.sdk.service.dashboards.Schedule`, `com.databricks.sdk.service.dashboards.SchedulePauseStatus`, `com.databricks.sdk.service.dashboards.Subscriber`, `com.databricks.sdk.service.dashboards.Subscription`, `com.databricks.sdk.service.dashboards.SubscriptionSubscriberDestination`, `com.databricks.sdk.service.dashboards.SubscriptionSubscriberUser`and `com.databricks.sdk.service.dashboards.UpdateScheduleRequest` classes.
 * Added `terminationCategory` field for `com.databricks.sdk.service.jobs.ForEachTaskErrorMessageStats`.
 * Added `onStreamingBacklogExceeded` field for `com.databricks.sdk.service.jobs.JobEmailNotifications`.
 * Added `environmentKey` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Removed `conditionTask`, `dbtTask`, `notebookTask`, `pipelineTask`, `pythonWheelTask`, `runJobTask`, `sparkJarTask`, `sparkPythonTask`, `sparkSubmitTask` and `sqlTask` fields for `com.databricks.sdk.service.jobs.SubmitRun`.
 * Added `environments` field for `com.databricks.sdk.service.jobs.SubmitRun`.
 * Added `dbtTask` field for `com.databricks.sdk.service.jobs.SubmitTask`.
 * Added `environmentKey` field for `com.databricks.sdk.service.jobs.SubmitTask`.
 * Added `onStreamingBacklogExceeded` field for `com.databricks.sdk.service.jobs.TaskEmailNotifications`.
 * Added `periodic` field for `com.databricks.sdk.service.jobs.TriggerSettings`.
 * Added `onStreamingBacklogExceeded` field for `com.databricks.sdk.service.jobs.WebhookNotifications`.
 * Added `com.databricks.sdk.service.jobs.PeriodicTriggerConfiguration` and `com.databricks.sdk.service.jobs.PeriodicTriggerConfigurationTimeUnit` classes.
 * Added `batchGet()` method for `workspaceClient.consumerListings()` service.
 * Added `batchGet()` method for `workspaceClient.consumerProviders()` service.
 * Added `providerSummary` field for `com.databricks.sdk.service.marketplace.Listing`.
 * Added `com.databricks.sdk.service.marketplace.BatchGetListingsRequest`, `com.databricks.sdk.service.marketplace.BatchGetListingsResponse`, `com.databricks.sdk.service.marketplace.BatchGetProvidersRequest`, `com.databricks.sdk.service.marketplace.BatchGetProvidersResponse`, `com.databricks.sdk.service.marketplace.ProviderIconFile`, `com.databricks.sdk.service.marketplace.ProviderIconType`, `com.databricks.sdk.service.marketplace.ProviderListingSummaryInfo` and `com.databricks.sdk.service.oauth2.DataPlaneInfo` classes.
 * Removed `createDeployment()` method for `workspaceClient.apps()` service.
 * Added `deploy()` and `start()` methods for `workspaceClient.apps()` service.
 * Added `workspaceClient.servingEndpointsDataPlane()` service.
 * Added `servicePrincipalId` field for `com.databricks.sdk.service.serving.App`.
 * Added `servicePrincipalName` field for `com.databricks.sdk.service.serving.App`.
 * Added `mode` field for `com.databricks.sdk.service.serving.AppDeployment`.
 * Added `mode` field for `com.databricks.sdk.service.serving.CreateAppDeploymentRequest`.
 * Added `dataPlaneInfo` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
 * Added `com.databricks.sdk.service.serving.AppDeploymentMode` class.
 * Added `com.databricks.sdk.service.serving.ModelDataPlaneInfo` class.
 * Added `com.databricks.sdk.service.serving.StartAppRequest` class.
 * Added `queryNextPage()` method for `workspaceClient.vectorSearchIndexes()` service.
 * Added `queryType` field for `com.databricks.sdk.service.vectorsearch.QueryVectorIndexRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.vectorsearch.QueryVectorIndexResponse`.
 * Added `com.databricks.sdk.service.vectorsearch.QueryVectorIndexNextPageRequest` class.

OpenAPI SHA: 7437dabb9dadee402c1fc060df4c1ce8cc5369f0, Date: 2024-06-24

## 0.26.0

### Improvements

 * Better error message when private link enabled workspaces reject requests ([#290](https://github.com/databricks/databricks-sdk-java/pull/290)).

### API Changes:

 * Changed `list()` method for `workspaceClient.connections()` service to require request of `com.databricks.sdk.service.catalog.ListConnectionsRequest` class.
 * Renamed `workspaceClient.lakehouseMonitors()` service to `workspaceClient.qualityMonitors()`.
 * Renamed `com.databricks.sdk.service.catalog.DeleteLakehouseMonitorRequest` class to `com.databricks.sdk.service.catalog.DeleteQualityMonitorRequest`.
 * Changed `schemaName` field for `com.databricks.sdk.service.catalog.DisableRequest` to `String` class.
 * Removed `com.databricks.sdk.service.catalog.DisableSchemaName` class.
 * Changed `schemaName` field for `com.databricks.sdk.service.catalog.EnableRequest` to `String` class.
 * Removed `com.databricks.sdk.service.catalog.EnableSchemaName` class.
 * Renamed `com.databricks.sdk.service.catalog.GetLakehouseMonitorRequest` class to `com.databricks.sdk.service.catalog.GetQualityMonitorRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.catalog.ListConnectionsResponse`.
 * Added `dashboardId` field for `com.databricks.sdk.service.catalog.UpdateMonitor`.
 * Added `com.databricks.sdk.service.catalog.ListConnectionsRequest` class.
 * Added `com.databricks.sdk.service.catalog.MonitorRefreshListResponse` class.
 * Changed `clusterStatus()` method for `workspaceClient.libraries()` service to return `com.databricks.sdk.service.compute.ClusterLibraryStatuses` class.
 * Removed `clusterSource` field for `com.databricks.sdk.service.compute.ClusterAttributes`.
 * Changed `spec` field for `com.databricks.sdk.service.compute.ClusterDetails` to `com.databricks.sdk.service.compute.ClusterSpec` class.
 * Removed `cloneFrom` and `clusterSource` fields for `com.databricks.sdk.service.compute.ClusterSpec`.
 * Removed `com.databricks.sdk.service.compute.ClusterStatusResponse` class.
 * Removed `clusterSource` field for `com.databricks.sdk.service.compute.CreateCluster`.
 * Removed `cloneFrom` and `clusterSource` fields for `com.databricks.sdk.service.compute.EditCluster`.
 * Removed `sortBySpec` field for `com.databricks.sdk.service.marketplace.ListListingsRequest`.
 * Added `isAscending` field for `com.databricks.sdk.service.marketplace.ListListingsRequest`.
 * Added `sortBy` field for `com.databricks.sdk.service.marketplace.ListListingsRequest`.
 * Added `isAscending` field for `com.databricks.sdk.service.marketplace.SearchListingsRequest`.
 * Removed `com.databricks.sdk.service.marketplace.SortBySpec` and  `com.databricks.sdk.service.marketplace.SortOrder` classes.
 * Added `gatewayDefinition` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
 * Added `gatewayDefinition` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
 * Added `tableConfiguration` field for `com.databricks.sdk.service.pipelines.ManagedIngestionPipelineDefinition`.
 * Added `gatewayDefinition` field for `com.databricks.sdk.service.pipelines.PipelineSpec`.
 * Added `tableConfiguration` field for `com.databricks.sdk.service.pipelines.SchemaSpec`.
 * Added `tableConfiguration` field for `com.databricks.sdk.service.pipelines.TableSpec`.
 * Added `com.databricks.sdk.service.pipelines.IngestionGatewayPipelineDefinition` class.
 * Added `com.databricks.sdk.service.pipelines.TableSpecificConfig` class.
 * Added `com.databricks.sdk.service.pipelines.TableSpecificConfigScdType` class.
 * Added `deploymentArtifacts` field for `com.databricks.sdk.service.serving.AppDeployment`.
 * Added `contents` field for `com.databricks.sdk.service.serving.ExportMetricsResponse`.
 * Changed `openaiApiKey` field for `com.databricks.sdk.service.serving.OpenAiConfig` to no longer be required.
 * Added `microsoftEntraClientId`, `microsoftEntraClientSecret` and `microsoftEntraTenantId` fields for `com.databricks.sdk.service.serving.OpenAiConfig`.
 * Added `com.databricks.sdk.service.serving.AppDeploymentArtifacts` class.
 * Added `storageRoot` field for `com.databricks.sdk.service.sharing.CreateShare`.
 * Added `storageLocation` and `storageRoot` fields for `com.databricks.sdk.service.sharing.ShareInfo`.
 * Added `storageRoot` field for `com.databricks.sdk.service.sharing.UpdateShare`.
 * Added `scanIndex()` method for `workspaceClient.vectorSearchIndexes()` service.
 * Added `embeddingWritebackTable` field for `com.databricks.sdk.service.vectorsearch.DeltaSyncVectorIndexSpecRequest`.
 * Added `embeddingWritebackTable` field for `com.databricks.sdk.service.vectorsearch.DeltaSyncVectorIndexSpecResponse`.
 * Added `com.databricks.sdk.service.vectorsearch.ListValue`, `com.databricks.sdk.service.vectorsearch.MapStringValueEntry`, `com.databricks.sdk.service.vectorsearch.ScanVectorIndexRequest`, `com.databricks.sdk.service.vectorsearch.ScanVectorIndexResponse`, `com.databricks.sdk.service.vectorsearch.Struct`and `com.databricks.sdk.service.vectorsearch.Value` classes.

OpenAPI SHA: 7eb5ad9a2ed3e3f1055968a2d1014ac92c06fe92, Date: 2024-05-21

## 0.25.0

### New Features and Improvements
* Fix OIDC Endpoint Fetching in DatabricksConfig for Workspace Clients ([#277](https://github.com/databricks/databricks-sdk-java/pull/277)).
* Fix NullPointerException when reading error response body ([#276](https://github.com/databricks/databricks-sdk-java/pull/276)).
* Incorporate host in request after `authenticate()` call ([#282](https://github.com/databricks/databricks-sdk-java/pull/282)).
* Fix NPE in string function on DatabricksConfig ([#285](https://github.com/databricks/databricks-sdk-java/pull/285)).

### Documentation Changes
* Add instructions for building a shaded JAR ([#284](https://github.com/databricks/databricks-sdk-java/pull/284)).

### API Changes:
 * Added `ingestionDefinition` field for `com.databricks.sdk.service.pipelines.CreatePipeline`, `com.databricks.sdk.service.pipelines.EditPipeline` and `com.databricks.sdk.service.pipelines.PipelineSpec`
 * Changed `create()` method for `workspaceClient.apps()` service . New request type is `com.databricks.sdk.service.serving.CreateAppRequest` class.
 * Changed `create()` method for `workspaceClient.apps()` service to return `com.databricks.sdk.service.serving.App` class.
 * Removed `deleteApp()`, `getApp()`, `getApps()` and `getEvents()` method for `workspaceClient.apps()` service.
* Added `createDeployment()`, `delete()`, `get()`, `getDeployment()`, `getEnvironment()`, `list()`, `listDeployments()`, `stop()`, and `update()` methods for `workspaceClient.apps()` service.
 * Added `getOpenApi()` method for `workspaceClient.servingEndpoints()` service.
 * Changed `apps` field for `com.databricks.sdk.service.serving.ListAppsResponse` to `com.databricks.sdk.service.serving.AppList` class.
 * Added `routeOptimized` field for `com.databricks.sdk.service.serving.CreateServingEndpoint`.
 * Added `endpointUrl` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
 * Added `routeOptimized` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
 * Added `tags` field for `com.databricks.sdk.service.sql.DashboardEditContent`. `com.databricks.sdk.service.sql.QueryEditContent` and `com.databricks.sdk.service.sql.QueryPostContent`.
 * Added `catalog` field for `com.databricks.sdk.service.sql.QueryOptions`.
 * Added `schema` field for `com.databricks.sdk.service.sql.QueryOptions`.
 * Added `query` field for `com.databricks.sdk.service.sql.Visualization`.
 * Added `com.databricks.sdk.service.pipelines.IngestionConfig` class.
 * Added `com.databricks.sdk.service.pipelines.ManagedIngestionPipelineDefinition` class.
 * Added `com.databricks.sdk.service.pipelines.SchemaSpec` class.
 * Added `com.databricks.sdk.service.pipelines.TableSpec` class.
 * Added `com.databricks.sdk.service.serving.App` class.
 * Added `com.databricks.sdk.service.serving.AppDeployment` class.
 * Added `com.databricks.sdk.service.serving.AppDeploymentState` class.
 * Added `com.databricks.sdk.service.serving.AppDeploymentStatus` class.
 * Added `com.databricks.sdk.service.serving.AppEnvironment` class.
 * Added `com.databricks.sdk.service.serving.AppState` class.
 * Added `com.databricks.sdk.service.serving.AppStatus` class.
 * Added `com.databricks.sdk.service.serving.CreateAppDeploymentRequest` class.
 * Added `com.databricks.sdk.service.serving.CreateAppRequest` class.
 * Added `com.databricks.sdk.service.serving.EnvVariable` class.
 * Added `com.databricks.sdk.service.serving.GetAppDeploymentRequest` class.
 * Added `com.databricks.sdk.service.serving.GetAppEnvironmentRequest` class.
 * Added `com.databricks.sdk.service.serving.GetOpenApiRequest` class.
 * Added `Object` class.
 * Added `com.databricks.sdk.service.serving.ListAppDeploymentsRequest` class.
 * Added `com.databricks.sdk.service.serving.ListAppDeploymentsResponse` class.
 * Added `com.databricks.sdk.service.serving.ListAppsRequest` class.
 * Added `com.databricks.sdk.service.serving.StopAppRequest` class.
 * Added `Object` class.
 * Added `com.databricks.sdk.service.serving.UpdateAppRequest` class.
 * Added `com.databricks.sdk.service.settings.ComplianceSecurityProfile` class.
 * Added `com.databricks.sdk.service.settings.ComplianceSecurityProfileSetting` class.
 * Added `com.databricks.sdk.service.settings.EnhancedSecurityMonitoring` class.
 * Added `com.databricks.sdk.service.settings.EnhancedSecurityMonitoringSetting` class.
 * Added `com.databricks.sdk.service.settings.GetComplianceSecurityProfileSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.GetEnhancedSecurityMonitoringSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.UpdateComplianceSecurityProfileSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.UpdateEnhancedSecurityMonitoringSettingRequest` class.
 * Added `workspaceClient.complianceSecurityProfile()` service.
 * Added `workspaceClient.enhancedSecurityMonitoring()` service.
 * Removed `workspaceClient.cspEnablement()` service.
 * Removed `workspaceClient.esmEnablement()` service.
 * Removed `com.databricks.sdk.service.serving.AppEvents` class.
 * Removed `com.databricks.sdk.service.serving.AppManifest` class.
 * Removed `com.databricks.sdk.service.serving.AppServiceStatus` class.
 * Removed `com.databricks.sdk.service.serving.DeleteAppResponse` class.
 * Removed `com.databricks.sdk.service.serving.DeployAppRequest` class.
 * Removed `com.databricks.sdk.service.serving.DeploymentStatus` class.
 * Removed `com.databricks.sdk.service.serving.DeploymentStatusState` class.
 * Removed `com.databricks.sdk.service.serving.GetAppDeploymentStatusRequest` class.
 * Removed `com.databricks.sdk.service.serving.GetAppResponse` class.
 * Removed `com.databricks.sdk.service.serving.GetEventsRequest` class.
 * Removed `com.databricks.sdk.service.serving.ListAppEventsResponse` class.
 * Removed `com.databricks.sdk.service.settings.CspEnablement` class.
 * Removed `com.databricks.sdk.service.settings.CspEnablementSetting` class.
 * Removed `com.databricks.sdk.service.settings.EsmEnablement` class.
 * Removed `com.databricks.sdk.service.settings.EsmEnablementSetting` class.
 * Removed `com.databricks.sdk.service.settings.GetCspEnablementSettingRequest` class.
 * Removed `com.databricks.sdk.service.settings.GetEsmEnablementSettingRequest` class.
 * Removed `com.databricks.sdk.service.settings.UpdateCspEnablementSettingRequest` class.
 * Removed `com.databricks.sdk.service.settings.UpdateEsmEnablementSettingRequest` class.

OpenAPI SHA: 84f9315bc9cdcf3917f764cf608255a74271ab2c, Date: 2024-05-06

### Internal Changes
* Update SDK to OpenAPI spec ([#280](https://github.com/databricks/databricks-sdk-java/pull/280)).
* Remove unused script from repository root ([#281](https://github.com/databricks/databricks-sdk-java/pull/281)).
* Add missing return ([#283](https://github.com/databricks/databricks-sdk-java/pull/283)).
* Fix test that was picking up configuration from the environment ([#287](https://github.com/databricks/databricks-sdk-java/pull/287)).


## 0.24.1

* Fixed interrupt handling ([#272](https://github.com/databricks/databricks-sdk-java/pull/272)).
* Added README for proxy and minor fix ([#273](https://github.com/databricks/databricks-sdk-java/pull/273)).



## 0.24.0

* Added retry strategy based on idempotency of requests ([#264](https://github.com/databricks/databricks-sdk-java/pull/264)).
* Fixde remaining Java integration tests ([#265](https://github.com/databricks/databricks-sdk-java/pull/265)).
* Fixed one-shot list APIs to not return null ([#266](https://github.com/databricks/databricks-sdk-java/pull/266)).
* Removed unnecessary secret from example ([#267](https://github.com/databricks/databricks-sdk-java/pull/267)).
* Fixed one shot pagination ([#268](https://github.com/databricks/databricks-sdk-java/pull/268)).
* Updated SDK to OpenAPI spec ([#269](https://github.com/databricks/databricks-sdk-java/pull/269)).
* Added a way to provide proxy details to SDK ([#271](https://github.com/databricks/databricks-sdk-java/pull/271)).

Note: This release contains breaking changes, please see the API changes below for more details. 

API Changes:

 * Added `deployment` field for `com.databricks.sdk.service.pipelines.CreatePipeline`, `com.databricks.sdk.service.pipelines.EditPipeline`, `com.databricks.sdk.service.pipelines.PipelineSpec`.
 * Added `schemaId` field for `com.databricks.sdk.service.catalog.SchemaInfo`.
 * Added `operation` field for `com.databricks.sdk.service.catalog.ValidationResult`.
 * Added `requirements` field for `com.databricks.sdk.service.compute.Library`.
 * Added `warehouseId` field for `com.databricks.sdk.service.jobs.NotebookTask`.
 * Added `runAs` field for `com.databricks.sdk.service.jobs.SubmitRun`.
 * Added `com.databricks.sdk.service.catalog.ValidationResultOperation` class.
 * Added `com.databricks.sdk.service.compute.ClusterStatus` class.
 * Added `com.databricks.sdk.service.compute.ClusterStatusResponse` class.
 * Added `com.databricks.sdk.service.compute.LibraryInstallStatus` class.
 * Added `com.databricks.sdk.service.pipelines.DeploymentKind` class.
 * Added `com.databricks.sdk.service.pipelines.PipelineDeployment` class.
 * Removed `awsOperation` field for `com.databricks.sdk.service.catalog.ValidationResult`.
 * Removed `azureOperation` field for `com.databricks.sdk.service.catalog.ValidationResult`.
 * Removed `gcpOperation` field for `com.databricks.sdk.service.catalog.ValidationResult`.
 * Removed `com.databricks.sdk.service.catalog.ValidationResultAwsOperation` class.
 * Removed `com.databricks.sdk.service.catalog.ValidationResultAzureOperation` class.
 * Removed `com.databricks.sdk.service.catalog.ValidationResultGcpOperation` class.
 * Removed `com.databricks.sdk.service.compute.ClusterStatusRequest` class.
 * Removed `com.databricks.sdk.service.compute.LibraryFullStatusStatus` class.
 * Changed `clusterStatus()` method for `workspaceClient.libraries()` service . New request type is `com.databricks.sdk.service.compute.ClusterStatus` class.
 * Changed `clusterStatus()` method for `workspaceClient.libraries()` service to return `com.databricks.sdk.service.compute.ClusterStatusResponse` class.
 * Changed `status` field for `com.databricks.sdk.service.compute.LibraryFullStatus` to `com.databricks.sdk.service.compute.LibraryInstallStatus` class.

OpenAPI SHA: 06d330f43d92c1be864d4638c672cd0723e20a51, Date: 2024-04-22


## 0.23.0

### Improvements and Bug Fixes
* Introduce more specific exceptions, like `NotFound`, `AlreadyExists`, `BadRequest`, `PermissionDenied`, `InternalError`, and others ([#185](https://github.com/databricks/databricks-sdk-java/pull/185), [#257](https://github.com/databricks/databricks-sdk-java/pull/257)).
* Lock around field accessibility changes ([#247](https://github.com/databricks/databricks-sdk-java/pull/247)).
* Fix Changelog ([#258](https://github.com/databricks/databricks-sdk-java/pull/258)).
* Support post with no body for APIs ([#262](https://github.com/databricks/databricks-sdk-java/pull/262)).

API Changes:

 * Changed `cancelRefresh()` method for `workspaceClient.lakehouseMonitors()` service with new required argument order.
 * Changed `create()` method for `workspaceClient.lakehouseMonitors()` service with new required argument order.
 * Changed `delete()` method for `workspaceClient.lakehouseMonitors()` service with new required argument order.
 * Changed `get()` method for `workspaceClient.lakehouseMonitors()` service with new required argument order.
 * Changed `getRefresh()` method for `workspaceClient.lakehouseMonitors()` service with new required argument order.
 * Changed `listRefreshes()` method for `workspaceClient.lakehouseMonitors()` service with new required argument order.
 * Changed `runRefresh()` method for `workspaceClient.lakehouseMonitors()` service with new required argument order.
 * Changed `update()` method for `workspaceClient.lakehouseMonitors()` service with new required argument order.
 * Removed `com.databricks.sdk.service.catalog.AzureManagedIdentity` class.
 * Removed `fullName` field for `com.databricks.sdk.service.catalog.CancelRefreshRequest`.
 * Added `tableName` field for `com.databricks.sdk.service.catalog.CancelRefreshRequest`.
 * Changed `customMetrics` field for `com.databricks.sdk.service.catalog.CreateMonitor` to `com.databricks.sdk.service.catalog.MonitorMetricList` class.
 * Removed `fullName` field for `com.databricks.sdk.service.catalog.CreateMonitor`.
 * Changed `inferenceLog` field for `com.databricks.sdk.service.catalog.CreateMonitor` to `com.databricks.sdk.service.catalog.MonitorInferenceLog` class.
 * Changed `notifications` field for `com.databricks.sdk.service.catalog.CreateMonitor` to `com.databricks.sdk.service.catalog.MonitorNotifications` class.
 * Changed `snapshot` field for `com.databricks.sdk.service.catalog.CreateMonitor` to `Object` class.
 * Changed `timeSeries` field for `com.databricks.sdk.service.catalog.CreateMonitor` to `com.databricks.sdk.service.catalog.MonitorTimeSeries` class.
 * Added `tableName` field for `com.databricks.sdk.service.catalog.CreateMonitor`.
 * Changed `azureManagedIdentity` field for `com.databricks.sdk.service.catalog.CreateStorageCredential` to `com.databricks.sdk.service.catalog.AzureManagedIdentityRequest` class.
 * Removed `fullName` field for `com.databricks.sdk.service.catalog.DeleteLakehouseMonitorRequest`.
 * Added `tableName` field for `com.databricks.sdk.service.catalog.DeleteLakehouseMonitorRequest`.
 * Removed `fullName` field for `com.databricks.sdk.service.catalog.GetLakehouseMonitorRequest`.
 * Added `tableName` field for `com.databricks.sdk.service.catalog.GetLakehouseMonitorRequest`.
 * Removed `fullName` field for `com.databricks.sdk.service.catalog.GetRefreshRequest`.
 * Added `tableName` field for `com.databricks.sdk.service.catalog.GetRefreshRequest`.
 * Removed `fullName` field for `com.databricks.sdk.service.catalog.ListRefreshesRequest`.
 * Added `tableName` field for `com.databricks.sdk.service.catalog.ListRefreshesRequest`.
 * Changed `quartzCronExpression` field for `com.databricks.sdk.service.catalog.MonitorCronSchedule` to be required.
 * Changed `timezoneId` field for `com.databricks.sdk.service.catalog.MonitorCronSchedule` to be required.
 * Removed `com.databricks.sdk.service.catalog.MonitorCustomMetric` class.
 * Removed `com.databricks.sdk.service.catalog.MonitorCustomMetricType` class.
 * Removed `com.databricks.sdk.service.catalog.MonitorDestinations` class.
 * Removed `com.databricks.sdk.service.catalog.MonitorInferenceLogProfileType` class.
 * Removed `com.databricks.sdk.service.catalog.MonitorInferenceLogProfileTypeProblemType` class.
 * Changed `customMetrics` field for `com.databricks.sdk.service.catalog.MonitorInfo` to `com.databricks.sdk.service.catalog.MonitorMetricList` class.
 * Changed `driftMetricsTableName` field for `com.databricks.sdk.service.catalog.MonitorInfo` to be required.
 * Changed `inferenceLog` field for `com.databricks.sdk.service.catalog.MonitorInfo` to `com.databricks.sdk.service.catalog.MonitorInferenceLog` class.
 * Changed `monitorVersion` field for `com.databricks.sdk.service.catalog.MonitorInfo` to be required.
 * Changed `notifications` field for `com.databricks.sdk.service.catalog.MonitorInfo` to `com.databricks.sdk.service.catalog.MonitorNotifications` class.
 * Changed `profileMetricsTableName` field for `com.databricks.sdk.service.catalog.MonitorInfo` to be required.
 * Changed `snapshot` field for `com.databricks.sdk.service.catalog.MonitorInfo` to `Object` class.
 * Changed `status` field for `com.databricks.sdk.service.catalog.MonitorInfo` to be required.
 * Changed `tableName` field for `com.databricks.sdk.service.catalog.MonitorInfo` to be required.
 * Changed `timeSeries` field for `com.databricks.sdk.service.catalog.MonitorInfo` to `com.databricks.sdk.service.catalog.MonitorTimeSeries` class.
 * Removed `com.databricks.sdk.service.catalog.MonitorNotificationsConfig` class.
 * Changed `refreshId` field for `com.databricks.sdk.service.catalog.MonitorRefreshInfo` to be required.
 * Changed `startTimeMs` field for `com.databricks.sdk.service.catalog.MonitorRefreshInfo` to be required.
 * Changed `state` field for `com.databricks.sdk.service.catalog.MonitorRefreshInfo` to be required.
 * Added `trigger` field for `com.databricks.sdk.service.catalog.MonitorRefreshInfo`.
 * Removed `Object` class.
 * Removed `com.databricks.sdk.service.catalog.MonitorTimeSeriesProfileType` class.
 * Removed `fullName` field for `com.databricks.sdk.service.catalog.RunRefreshRequest`.
 * Added `tableName` field for `com.databricks.sdk.service.catalog.RunRefreshRequest`.
 * Changed `azureManagedIdentity` field for `com.databricks.sdk.service.catalog.StorageCredentialInfo` to `com.databricks.sdk.service.catalog.AzureManagedIdentityResponse` class.
 * Removed `name` field for `com.databricks.sdk.service.catalog.TableRowFilter`.
 * Added `functionName` field for `com.databricks.sdk.service.catalog.TableRowFilter`.
 * Changed `customMetrics` field for `com.databricks.sdk.service.catalog.UpdateMonitor` to `com.databricks.sdk.service.catalog.MonitorMetricList` class.
 * Removed `fullName` field for `com.databricks.sdk.service.catalog.UpdateMonitor`.
 * Changed `inferenceLog` field for `com.databricks.sdk.service.catalog.UpdateMonitor` to `com.databricks.sdk.service.catalog.MonitorInferenceLog` class.
 * Changed `notifications` field for `com.databricks.sdk.service.catalog.UpdateMonitor` to `com.databricks.sdk.service.catalog.MonitorNotifications` class.
 * Changed `snapshot` field for `com.databricks.sdk.service.catalog.UpdateMonitor` to `Object` class.
 * Changed `timeSeries` field for `com.databricks.sdk.service.catalog.UpdateMonitor` to `com.databricks.sdk.service.catalog.MonitorTimeSeries` class.
 * Added `tableName` field for `com.databricks.sdk.service.catalog.UpdateMonitor`.
 * Changed `azureManagedIdentity` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential` to `com.databricks.sdk.service.catalog.AzureManagedIdentityResponse` class.
 * Changed `azureManagedIdentity` field for `com.databricks.sdk.service.catalog.ValidateStorageCredential` to `com.databricks.sdk.service.catalog.AzureManagedIdentityRequest` class.
 * Removed `operation` field for `com.databricks.sdk.service.catalog.ValidationResult`.
 * Added `awsOperation` field for `com.databricks.sdk.service.catalog.ValidationResult`.
 * Added `azureOperation` field for `com.databricks.sdk.service.catalog.ValidationResult`.
 * Added `gcpOperation` field for `com.databricks.sdk.service.catalog.ValidationResult`.
 * Removed `com.databricks.sdk.service.catalog.ValidationResultOperation` class.
 * Added `com.databricks.sdk.service.catalog.AzureManagedIdentityRequest` class.
 * Added `com.databricks.sdk.service.catalog.AzureManagedIdentityResponse` class.
 * Added `com.databricks.sdk.service.catalog.MonitorDestination` class.
 * Added `com.databricks.sdk.service.catalog.MonitorInferenceLog` class.
 * Added `com.databricks.sdk.service.catalog.MonitorInferenceLogProblemType` class.
 * Added `com.databricks.sdk.service.catalog.MonitorMetric` class.
 * Added `com.databricks.sdk.service.catalog.MonitorMetricType` class.
 * Added `com.databricks.sdk.service.catalog.MonitorNotifications` class.
 * Added `com.databricks.sdk.service.catalog.MonitorRefreshInfoTrigger` class.
 * Added `Object` class.
 * Added `com.databricks.sdk.service.catalog.MonitorTimeSeries` class.
 * Added `com.databricks.sdk.service.catalog.ValidationResultAwsOperation` class.
 * Added `com.databricks.sdk.service.catalog.ValidationResultAzureOperation` class.
 * Added `com.databricks.sdk.service.catalog.ValidationResultGcpOperation` class.
 * Added `cloneFrom` field for `com.databricks.sdk.service.compute.ClusterSpec`.
 * Removed `com.databricks.sdk.service.compute.ComputeSpec` class.
 * Removed `com.databricks.sdk.service.compute.ComputeSpecKind` class.
 * Added `cloneFrom` field for `com.databricks.sdk.service.compute.CreateCluster`.
 * Added `cloneFrom` field for `com.databricks.sdk.service.compute.EditCluster`.
 * Added `com.databricks.sdk.service.compute.CloneCluster` class.
 * Added `com.databricks.sdk.service.compute.Environment` class.
 * Changed `update()` method for `accountClient.workspaceAssignment()` service to return `com.databricks.sdk.service.iam.PermissionAssignment` class.
 * Removed `Object` class.
 * Removed `computeKey` field for `com.databricks.sdk.service.jobs.ClusterSpec`.
 * Removed `compute` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `environments` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Removed `com.databricks.sdk.service.jobs.JobCompute` class.
 * Removed `compute` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `environments` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Removed `computeKey` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Removed `com.databricks.sdk.service.jobs.TableTriggerConfiguration` class.
 * Removed `computeKey` field for `com.databricks.sdk.service.jobs.Task`.
 * Added `environmentKey` field for `com.databricks.sdk.service.jobs.Task`.
 * Changed `table` field for `com.databricks.sdk.service.jobs.TriggerSettings` to `com.databricks.sdk.service.jobs.TableUpdateTriggerConfiguration` class.
 * Changed `tableUpdate` field for `com.databricks.sdk.service.jobs.TriggerSettings` to `com.databricks.sdk.service.jobs.TableUpdateTriggerConfiguration` class.
 * Added `com.databricks.sdk.service.jobs.JobEnvironment` class.
 * Added `com.databricks.sdk.service.jobs.TableUpdateTriggerConfiguration` class.
 * Added `com.databricks.sdk.service.marketplace` package.

OpenAPI SHA: 94684175b8bd65f8701f89729351f8069e8309c9, Date: 2024-04-11


## 0.22.0

Improvements and Bug Fixes
* Properly escape multi-segment path parameters ([#252](https://github.com/databricks/databricks-sdk-java/pull/252)).

API Changes:
* Added `migrate()` and `unpublish()` methods for `workspaceClient.lakeview()` service.
* Added `com.databricks.sdk.service.dashboards.MigrateDashboardRequest` and `com.databricks.sdk.service.dashboards.UnpublishDashboardRequest` class.
* Added `description`, `queueDuration` and `repairHistory` fields for `com.databricks.sdk.service.jobs.BaseRun`.
* Added `computeKey` and `jobClusterKey` field for `com.databricks.sdk.service.jobs.ClusterSpec`.
* Changed `left`, `op` and `right` fields for `com.databricks.sdk.service.jobs.ConditionTask` to be required.
* Changed `editMode` field for `com.databricks.sdk.service.jobs.CreateJob` to `com.databricks.sdk.service.jobs.JobEditMode` class.
* Replaced `com.databricks.sdk.service.jobs.CreateJobEditMode` class by `com.databricks.sdk.service.jobs.JobEditMode`.
* Changed `url` field for `com.databricks.sdk.service.jobs.FileArrivalTriggerConfiguration` to be required.
* Changed `errorMessageStats` field for `com.databricks.sdk.service.jobs.ForEachStats` to `com.databricks.sdk.service.jobs.ForEachTaskErrorMessageStatsList` class.
* Changed `newCluster` field for `com.databricks.sdk.service.jobs.JobCluster` to be required.
* Changed `editMode` field for `com.databricks.sdk.service.jobs.JobSettings` to `com.databricks.sdk.service.jobs.JobEditMode` class.
* Removed `com.databricks.sdk.service.jobs.JobSettingsEditMode` class.
* Changed `metric`, `op` and `value` fields for `com.databricks.sdk.service.jobs.JobsHealthRule` to be required.
* Changed `runType` field for `com.databricks.sdk.service.jobs.ListRunsRequest` to `com.databricks.sdk.service.jobs.RunType` class.
* Replaced `com.databricks.sdk.service.jobs.ListRunsRunType` class by `com.databricks.sdk.service.jobs.RunType`.
* Removed `com.databricks.sdk.service.jobs.ParamPairs` class.
* Changed `pipelineId` field for `com.databricks.sdk.service.jobs.PipelineTask` to be required.
* Changed `entryPoint` and `packageName` fields for `com.databricks.sdk.service.jobs.PythonWheelTask` to be required.
* Changed `jobParameters` field for `com.databricks.sdk.service.jobs.RepairRun` to Map<String,`String`> class.
* Changed `baseParameters` field for `com.databricks.sdk.service.jobs.ResolvedNotebookTaskValues` to Map<String,`String`> class.
* Changed `parameters` field for `com.databricks.sdk.service.jobs.ResolvedParamPairValues` to Map<String,`String`> class.
* Changed `namedParameters` field for `com.databricks.sdk.service.jobs.ResolvedPythonWheelTaskValues` to Map<String,`String`> class.
* Removed `namedParameters` field for `com.databricks.sdk.service.jobs.ResolvedRunJobTaskValues`.
* Changed `parameters` field for `com.databricks.sdk.service.jobs.ResolvedRunJobTaskValues` to Map<String,`String`> class.
* Added `jobParameters` field for `com.databricks.sdk.service.jobs.ResolvedRunJobTaskValues`.
* Added `description` and `queueDuration` fields for `com.databricks.sdk.service.jobs.Run`.
* Changed `op` field for `com.databricks.sdk.service.jobs.RunConditionTask` to `com.databricks.sdk.service.jobs.ConditionTaskOp` class.
* Removed `com.databricks.sdk.service.jobs.RunConditionTaskOp` class.
* Changed `inputs` and `task` field for `com.databricks.sdk.service.jobs.RunForEachTask` to be required.
* Changed `jobParameters` field for `com.databricks.sdk.service.jobs.RunJobTask` to Map<String,`String`> class.
* Added `dbtCommands`, `jarParams`, `notebookParams`, `pipelineParams`, `pythonNamedParams`, `pythonParams`, `sparkSubmitParams` and `sqlParams` fields for `com.databricks.sdk.service.jobs.RunJobTask`.
* Changed `jobParameters` field for `com.databricks.sdk.service.jobs.RunNow` to Map<String,`String`> class.
* Added `info` field for `com.databricks.sdk.service.jobs.RunOutput`.
* Removed `jobParameters` field for `com.databricks.sdk.service.jobs.RunParameters`.
* Changed `taskKey` field for `com.databricks.sdk.service.jobs.RunTask` to be required.
* Added `computeKey`, `emailNotifications`, `jobClusterKey`, `notificationSettings`, `runDuration`, `runPageUrl`, `timeoutSeconds` and `webhookNotifications` fields for `com.databricks.sdk.service.jobs.RunTask`.
* Added `endpointId` field for `com.databricks.sdk.service.jobs.SqlQueryOutput`.
* Added `conditionTask`, `dbtTask`, `notebookTask`, `pipelineTask`, `pythonWheelTask`, `runJobTask`, `sparkJarTask`, `sparkPythonTask`, `sparkSubmitTask` and `sqlTask` fields for `com.databricks.sdk.service.jobs.SubmitRun`.
* Added `description` field for `com.databricks.sdk.service.jobs.SubmitTask`.
* Added `disableAutoOptimization` field for `com.databricks.sdk.service.jobs.Task`.
* Added `noAlertForSkippedRuns` field for `com.databricks.sdk.service.jobs.TaskEmailNotifications`.
* Added `tableUpdate` field for `com.databricks.sdk.service.jobs.TriggerSettings`.
* Changed `id` field for `com.databricks.sdk.service.jobs.Webhook` to be required.
* Changed `onDurationWarningThresholdExceeded` field for `com.databricks.sdk.service.jobs.WebhookNotifications` to `com.databricks.sdk.service.jobs.WebhookList` class.
* Removed `com.databricks.sdk.service.jobs.WebhookNotificationsOnDurationWarningThresholdExceededItem` class.
* Added `com.databricks.sdk.service.jobs.JobEditMode` class.
* Replaced `com.databricks.sdk.service.serving.AwsBedrockConfig` class by `com.databricks.sdk.service.serving.AmazonBedrockConfig` class.
* Replaced `com.databricks.sdk.service.serving.AwsBedrockConfigBedrockProvider` class by `com.databricks.sdk.service.serving.AmazonBedrockConfigBedrockProvider` class.
* Replaced `awsBedrockConfig` field for `com.databricks.sdk.service.serving.ExternalModel` by `amazonBedrockConfig`.
* Changed `get()` method for `workspaceClient.ipAccessLists()` service . New request type is `com.databricks.sdk.service.settings.GetIpAccessListRequest` class.
* Replaced `com.databricks.sdk.service.settings.GetIpAccessList` class by `com.databricks.sdk.service.settings.GetIpAccessListRequest` class.

OpenAPI SHA: d38528c3e47dd81c9bdbd918272a3e49d36e09ce, Date: 2024-03-27


## 0.21.0


API Changes:

 * Changed `list()` method for `workspaceClient.catalogs()` service to require request of `com.databricks.sdk.service.catalog.ListCatalogsRequest` class.
 * Changed `create()` method for `workspaceClient.onlineTables()` service . New request type is `com.databricks.sdk.service.catalog.CreateOnlineTableRequest` class.
 * Removed `com.databricks.sdk.service.catalog.AwsIamRole` class.
 * Changed `notifications` field for `com.databricks.sdk.service.catalog.CreateMonitor` to `com.databricks.sdk.service.catalog.MonitorNotificationsConfig` class.
 * Changed `awsIamRole` field for `com.databricks.sdk.service.catalog.CreateStorageCredential` to `com.databricks.sdk.service.catalog.AwsIamRoleRequest` class.
 * Added `browseOnly` field for `com.databricks.sdk.service.catalog.ExternalLocationInfo`.
 * Added `browseOnly` field for `com.databricks.sdk.service.catalog.FunctionInfo`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.GetCatalogRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.GetExternalLocationRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.GetFunctionRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.GetModelVersionRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.GetRegisteredModelRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.GetSchemaRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.GetTableRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.ListExternalLocationsRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.ListFunctionsRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.ListModelVersionsRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.ListRegisteredModelsRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.ListSchemasRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.ListTablesRequest`.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.ListVolumesRequest`.
 * Added `browseOnly` field for `com.databricks.sdk.service.catalog.ModelVersionInfo`.
 * Changed `notifications` field for `com.databricks.sdk.service.catalog.MonitorInfo` to `com.databricks.sdk.service.catalog.MonitorNotificationsConfig` class.
 * Added `includeBrowse` field for `com.databricks.sdk.service.catalog.ReadVolumeRequest`.
 * Added `browseOnly` field for `com.databricks.sdk.service.catalog.RegisteredModelInfo`.
 * Added `browseOnly` field for `com.databricks.sdk.service.catalog.SchemaInfo`.
 * Changed `awsIamRole` field for `com.databricks.sdk.service.catalog.StorageCredentialInfo` to `com.databricks.sdk.service.catalog.AwsIamRoleResponse` class.
 * Added `browseOnly` field for `com.databricks.sdk.service.catalog.TableInfo`.
 * Changed `notifications` field for `com.databricks.sdk.service.catalog.UpdateMonitor` to `com.databricks.sdk.service.catalog.MonitorNotificationsConfig` class.
 * Changed `awsIamRole` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential` to `com.databricks.sdk.service.catalog.AwsIamRoleRequest` class.
 * Changed `awsIamRole` field for `com.databricks.sdk.service.catalog.ValidateStorageCredential` to `com.databricks.sdk.service.catalog.AwsIamRoleRequest` class.
 * Removed `com.databricks.sdk.service.catalog.ViewData` class.
 * Added `browseOnly` field for `com.databricks.sdk.service.catalog.VolumeInfo`.
 * Added `com.databricks.sdk.service.catalog.AwsIamRoleRequest` class.
 * Added `com.databricks.sdk.service.catalog.AwsIamRoleResponse` class.
 * Added `com.databricks.sdk.service.catalog.CreateOnlineTableRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListCatalogsRequest` class.
 * Changed `publish()` method for `workspaceClient.lakeview()` service to return `com.databricks.sdk.service.dashboards.PublishedDashboard` class.
 * Added `create()` method for `workspaceClient.lakeview()` service.
 * Added `get()` method for `workspaceClient.lakeview()` service.
 * Added `getPublished()` method for `workspaceClient.lakeview()` service.
 * Added `trash()` method for `workspaceClient.lakeview()` service.
 * Added `update()` method for `workspaceClient.lakeview()` service.
 * Removed `Object` class.
 * Added `com.databricks.sdk.service.dashboards.CreateDashboardRequest` class.
 * Added `com.databricks.sdk.service.dashboards.Dashboard` class.
 * Added `com.databricks.sdk.service.dashboards.GetDashboardRequest` class.
 * Added `com.databricks.sdk.service.dashboards.GetPublishedDashboardRequest` class.
 * Added `com.databricks.sdk.service.dashboards.LifecycleState` class.
 * Added `com.databricks.sdk.service.dashboards.PublishedDashboard` class.
 * Added `com.databricks.sdk.service.dashboards.TrashDashboardRequest` class.
 * Added `Object` class.
 * Added `com.databricks.sdk.service.dashboards.UpdateDashboardRequest` class.
 * Added `autoCaptureConfig` field for `com.databricks.sdk.service.serving.EndpointPendingConfig`.
 * Changed `get()` method for `workspaceClient.automaticClusterUpdate()` service . New request type is `com.databricks.sdk.service.settings.GetAutomaticClusterUpdateSettingRequest` class.
 * Changed `get()` method for `workspaceClient.cspEnablement()` service . New request type is `com.databricks.sdk.service.settings.GetCspEnablementSettingRequest` class.
 * Changed `get()` method for `accountClient.cspEnablementAccount()` service . New request type is `com.databricks.sdk.service.settings.GetCspEnablementAccountSettingRequest` class.
 * Changed `delete()` method for `workspaceClient.defaultNamespace()` service . New request type is `com.databricks.sdk.service.settings.DeleteDefaultNamespaceSettingRequest` class.
 * Changed `get()` method for `workspaceClient.defaultNamespace()` service . New request type is `com.databricks.sdk.service.settings.GetDefaultNamespaceSettingRequest` class.
 * Changed `get()` method for `workspaceClient.esmEnablement()` service . New request type is `com.databricks.sdk.service.settings.GetEsmEnablementSettingRequest` class.
 * Changed `get()` method for `accountClient.esmEnablementAccount()` service . New request type is `com.databricks.sdk.service.settings.GetEsmEnablementAccountSettingRequest` class.
 * Changed `get()` method for `workspaceClient.ipAccessLists()` service . New request type is `com.databricks.sdk.service.settings.GetIpAccessList` class.
 * Changed `delete()` method for `accountClient.personalCompute()` service . New request type is `com.databricks.sdk.service.settings.DeletePersonalComputeSettingRequest` class.
 * Changed `get()` method for `accountClient.personalCompute()` service . New request type is `com.databricks.sdk.service.settings.GetPersonalComputeSettingRequest` class.
 * Changed `delete()` method for `workspaceClient.restrictWorkspaceAdmins()` service . New request type is `com.databricks.sdk.service.settings.DeleteRestrictWorkspaceAdminsSettingRequest` class.
 * Changed `get()` method for `workspaceClient.restrictWorkspaceAdmins()` service . New request type is `com.databricks.sdk.service.settings.GetRestrictWorkspaceAdminsSettingRequest` class.
 * Removed `com.databricks.sdk.service.settings.DeleteDefaultNamespaceRequest` class.
 * Removed `com.databricks.sdk.service.settings.DeletePersonalComputeRequest` class.
 * Removed `com.databricks.sdk.service.settings.DeleteRestrictWorkspaceAdminRequest` class.
 * Removed `com.databricks.sdk.service.settings.GetAutomaticClusterUpdateRequest` class.
 * Removed `com.databricks.sdk.service.settings.GetCspEnablementAccountRequest` class.
 * Removed `com.databricks.sdk.service.settings.GetCspEnablementRequest` class.
 * Removed `com.databricks.sdk.service.settings.GetDefaultNamespaceRequest` class.
 * Removed `com.databricks.sdk.service.settings.GetEsmEnablementAccountRequest` class.
 * Removed `com.databricks.sdk.service.settings.GetEsmEnablementRequest` class.
 * Removed `com.databricks.sdk.service.settings.GetIpAccessListRequest` class.
 * Removed `com.databricks.sdk.service.settings.GetPersonalComputeRequest` class.
 * Removed `com.databricks.sdk.service.settings.GetRestrictWorkspaceAdminRequest` class.
 * Added `com.databricks.sdk.service.settings.DeleteDefaultNamespaceSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.DeletePersonalComputeSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.DeleteRestrictWorkspaceAdminsSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.GetAutomaticClusterUpdateSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.GetCspEnablementAccountSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.GetCspEnablementSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.GetDefaultNamespaceSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.GetEsmEnablementAccountSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.GetEsmEnablementSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.GetIpAccessList` class.
 * Added `com.databricks.sdk.service.settings.GetPersonalComputeSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.GetRestrictWorkspaceAdminsSettingRequest` class.
 * Changed `dataObjectType` field for `com.databricks.sdk.service.sharing.SharedDataObject` to `com.databricks.sdk.service.sharing.SharedDataObjectDataObjectType` class.
 * Added `content` field for `com.databricks.sdk.service.sharing.SharedDataObject`.
 * Added `com.databricks.sdk.service.sharing.SharedDataObjectDataObjectType` class.
 * Added `embeddingSourceColumns` field for `com.databricks.sdk.service.vectorsearch.DirectAccessVectorIndexSpec`.
 * Added `scoreThreshold` field for `com.databricks.sdk.service.vectorsearch.QueryVectorIndexRequest`.

OpenAPI SHA: 93763b0d7ae908520c229c786fff28b8fd623261, Date: 2024-03-20


## 0.20.0

### Features and Improvements
  * Added basic support for HTTP proxies ([#241](https://github.com/databricks/databricks-sdk-java/pull/241)).
  * Fixed getWorkspaceClient() for GCP ([#224](https://github.com/databricks/databricks-sdk-java/pull/224)).
  * Note: Backwards incompatible changes - Settings are now nested, please see the API changes below.

### Internal Changes
  * Reading headers should be done in a case-insensitive manner ([#235](https://github.com/databricks/databricks-sdk-java/pull/235)).
  * Added integration tests for the Files API ([#236](https://github.com/databricks/databricks-sdk-java/pull/236)).
  * Supported subservices ([#237](https://github.com/databricks/databricks-sdk-java/pull/237)).
  * Handled empty types in the Java SDK ([#239](https://github.com/databricks/databricks-sdk-java/pull/239)).
  * Added tokei.rs lines of code badge ([#243](https://github.com/databricks/databricks-sdk-java/pull/243)).
  * Updated SDK to latest OpenAPI spec ([#245](https://github.com/databricks/databricks-sdk-java/pull/245)).

### API Changes:
 * Added the following services: 
    - `workspaceClient.permissionMigration()`
    - `workspaceClient.automaticClusterUpdate()`
    - `workspaceClient.cspEnablement()`
    - `accountClient.cspEnablementAccount()`
    - `workspaceClient.defaultNamespace()`
    - `workspaceClient.esmEnablement()`
    - `accountClient.esmEnablementAccount()`
    - `accountClient.personalCompute()`
    - `workspaceClient.restrictWorkspaceAdmins()`
 * Added the following classes: 
    - `com.databricks.sdk.service.iam.PermissionMigrationRequest`
    - `com.databricks.sdk.service.iam.PermissionMigrationResponse`
    - `com.databricks.sdk.service.settings.AutomaticClusterUpdateSetting`
    - `com.databricks.sdk.service.settings.ClusterAutoRestartMessage`
    - `com.databricks.sdk.service.settings.ClusterAutoRestartMessageEnablementDetails`
    - `com.databricks.sdk.service.settings.ClusterAutoRestartMessageMaintenanceWindow`
    - `com.databricks.sdk.service.settings.ClusterAutoRestartMessageMaintenanceWindowDayOfWeek`
    - `com.databricks.sdk.service.settings.ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule`
    - `com.databricks.sdk.service.settings.ClusterAutoRestartMessageMaintenanceWindowWeekDayFrequency`
    - `com.databricks.sdk.service.settings.ClusterAutoRestartMessageMaintenanceWindowWindowStartTime`
    - `com.databricks.sdk.service.settings.ComplianceStandard`
    - `com.databricks.sdk.service.settings.CspEnablement`
    - `com.databricks.sdk.service.settings.CspEnablementAccount`
    - `com.databricks.sdk.service.settings.CspEnablementAccountSetting`
    - `com.databricks.sdk.service.settings.CspEnablementSetting`
    - `com.databricks.sdk.service.settings.DeleteDefaultNamespaceRequest`
    - `com.databricks.sdk.service.settings.DeletePersonalComputeRequest`
    - `com.databricks.sdk.service.settings.DeleteRestrictWorkspaceAdminRequest`
    - `com.databricks.sdk.service.settings.EsmEnablement`
    - `com.databricks.sdk.service.settings.EsmEnablementAccount`
    - `com.databricks.sdk.service.settings.EsmEnablementAccountSetting`
    - `com.databricks.sdk.service.settings.EsmEnablementSetting`
    - `com.databricks.sdk.service.settings.GetAutomaticClusterUpdateRequest`
    - `com.databricks.sdk.service.settings.GetCspEnablementAccountRequest`
    - `com.databricks.sdk.service.settings.GetCspEnablementRequest`
    - `com.databricks.sdk.service.settings.GetDefaultNamespaceRequest`
    - `com.databricks.sdk.service.settings.GetEsmEnablementAccountRequest`
    - `com.databricks.sdk.service.settings.GetEsmEnablementRequest`
    - `com.databricks.sdk.service.settings.GetPersonalComputeRequest`
    - `com.databricks.sdk.service.settings.GetRestrictWorkspaceAdminRequest`
    - `com.databricks.sdk.service.settings.NccAwsStableIpRule`
    - `com.databricks.sdk.service.settings.UpdateAutomaticClusterUpdateSettingRequest`
    - `com.databricks.sdk.service.settings.UpdateCspEnablementAccountSettingRequest`
    - `com.databricks.sdk.service.settings.UpdateCspEnablementSettingRequest`
    - `com.databricks.sdk.service.settings.UpdateEsmEnablementAccountSettingRequest`
    - `com.databricks.sdk.service.settings.UpdateEsmEnablementSettingRequest`
 * Removed the follogin classes: 
    - `com.databricks.sdk.service.settings.DeleteDefaultNamespaceSettingRequest`
    - `com.databricks.sdk.service.settings.DeletePersonalComputeSettingRequest`
    - `com.databricks.sdk.service.settings.DeleteRestrictWorkspaceAdminsSettingRequest`
    - `com.databricks.sdk.service.settings.GetDefaultNamespaceSettingRequest`
    - `com.databricks.sdk.service.settings.GetPersonalComputeSettingRequest`
    - `com.databricks.sdk.service.settings.GetRestrictWorkspaceAdminsSettingRequest`
 * Changed `version` field for `com.databricks.sdk.service.serving.AppManifest` to `com.databricks.sdk.service.serving.AnyValue` class.
 * Removed `deletePersonalComputeSetting()`, `getPersonalComputeSetting()` and `updatePersonalComputeSetting()` method for `accountClient.settings()` service.
 * Removed `deleteDefaultNamespaceSetting()`, `deleteRestrictWorkspaceAdminsSetting()`, `getDefaultNamespaceSetting()`, `getRestrictWorkspaceAdminsSetting()`, `updateDefaultNamespaceSetting()` and `updateRestrictWorkspaceAdminsSetting()` method for `workspaceClient.settings()` service.
 * Added `awsStableIpRule` field for `com.databricks.sdk.service.settings.NccEgressDefaultRules`.
 * Added `indexName` field for `com.databricks.sdk.service.vectorsearch.DeleteDataVectorIndexRequest`.
 * Added `embeddingModelEndpointName` field for `com.databricks.sdk.service.vectorsearch.EmbeddingSourceColumn`.
 * Added `indexName` field for `com.databricks.sdk.service.vectorsearch.UpsertDataVectorIndexRequest`.
 * Added `deltaSyncIndexSpec` field for `com.databricks.sdk.service.vectorsearch.VectorIndex`.
 * Added `directAccessIndexSpec` field for `com.databricks.sdk.service.vectorsearch.VectorIndex`.
 * Changed `deleteEndpoint()`, `createIndex()`, `deleteDataVectorIndex()` and `upsertDataVectorIndex()` method for `workspaceClient.vectorSearchEndpoints()` service with new required argument order.
 * Changed `endpointName` field for `com.databricks.sdk.service.vectorsearch.CreateVectorIndexRequest` to be required.
 * Removed `planningPhases` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Removed `name` field for `com.databricks.sdk.service.vectorsearch.DeleteDataVectorIndexRequest`.
 * Removed `name` field for `com.databricks.sdk.service.vectorsearch.DeleteEndpointRequest`.
 * Removed `com.databricks.sdk.service.vectorsearch.EmbeddingConfig` class.
 * Removed `embeddingConfig` field for `com.databricks.sdk.service.vectorsearch.EmbeddingSourceColumn`.
 * Removed `name` field for `com.databricks.sdk.service.vectorsearch.UpsertDataVectorIndexRequest`.
 * Removed `deltaSyncVectorIndexSpec` field for `com.databricks.sdk.service.vectorsearch.VectorIndex`.
 * Removed `directAccessVectorIndexSpec` field for `com.databricks.sdk.service.vectorsearch.VectorIndex`.

OpenAPI SHA: d855b30f25a06fe84f25214efa20e7f1fffcdf9e, Date: 2024-03-04


## 0.19.0

Internal Changes:

* Support head operations ([#232](https://github.com/databricks/databricks-sdk-java/pull/232)).

API Changes:

 * Changed `delete()` method for `workspaceClient.connections()` service with new required argument order.
 * Changed `get()` method for `workspaceClient.connections()` service with new required argument order.
 * Changed `update()` method for `workspaceClient.connections()` service with new required argument order.
 * Changed `update()` method for `workspaceClient.lakehouseMonitors()` service with new required argument order.
 * Changed `delete()` method for `workspaceClient.volumes()` service with new required argument order.
 * Changed `read()` method for `workspaceClient.volumes()` service with new required argument order.
 * Changed `update()` method for `workspaceClient.volumes()` service with new required argument order.
 * Added `workspaceClient.onlineTables()` service.
 * Removed `nameArg` field for `com.databricks.sdk.service.catalog.DeleteConnectionRequest`.
 * Added `name` field for `com.databricks.sdk.service.catalog.DeleteConnectionRequest`.
 * Removed `fullNameArg` field for `com.databricks.sdk.service.catalog.DeleteVolumeRequest`.
 * Added `name` field for `com.databricks.sdk.service.catalog.DeleteVolumeRequest`.
 * Removed `nameArg` field for `com.databricks.sdk.service.catalog.GetConnectionRequest`.
 * Added `name` field for `com.databricks.sdk.service.catalog.GetConnectionRequest`.
 * Added `maxResults` field for `com.databricks.sdk.service.catalog.ListVolumesRequest`.
 * Added `pageToken` field for `com.databricks.sdk.service.catalog.ListVolumesRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.catalog.ListVolumesResponseContent`.
 * Removed `fullNameArg` field for `com.databricks.sdk.service.catalog.ReadVolumeRequest`.
 * Added `name` field for `com.databricks.sdk.service.catalog.ReadVolumeRequest`.
 * Removed `nameArg` field for `com.databricks.sdk.service.catalog.UpdateConnection`.
 * Added `name` field for `com.databricks.sdk.service.catalog.UpdateConnection`.
 * Removed `assetsDir` field for `com.databricks.sdk.service.catalog.UpdateMonitor`.
 * Removed `fullNameArg` field for `com.databricks.sdk.service.catalog.UpdateVolumeRequestContent`.
 * Added `name` field for `com.databricks.sdk.service.catalog.UpdateVolumeRequestContent`.
 * Added `com.databricks.sdk.service.catalog.ContinuousUpdateStatus` class.
 * Added `com.databricks.sdk.service.catalog.DeleteOnlineTableRequest` class.
 * Added `com.databricks.sdk.service.catalog.FailedStatus` class.
 * Added `com.databricks.sdk.service.catalog.GetOnlineTableRequest` class.
 * Added `com.databricks.sdk.service.catalog.OnlineTable` class.
 * Added `com.databricks.sdk.service.catalog.OnlineTableSpec` class.
 * Added `com.databricks.sdk.service.catalog.OnlineTableState` class.
 * Added `com.databricks.sdk.service.catalog.OnlineTableStatus` class.
 * Added `com.databricks.sdk.service.catalog.PipelineProgress` class.
 * Added `com.databricks.sdk.service.catalog.ProvisioningStatus` class.
 * Added `com.databricks.sdk.service.catalog.TriggeredUpdateStatus` class.
 * Added `com.databricks.sdk.service.catalog.ViewData` class.
 * Added `getDirectoryMetadata()` method for `workspaceClient.files()` service.
 * Added `getMetadata()` method for `workspaceClient.files()` service.
 * Added `contentLength` field for `com.databricks.sdk.service.files.DownloadResponse`.
 * Added `contentType` field for `com.databricks.sdk.service.files.DownloadResponse`.
 * Added `lastModified` field for `com.databricks.sdk.service.files.DownloadResponse`.
 * Added `com.databricks.sdk.service.files.FileSize` class.
 * Added `com.databricks.sdk.service.files.GetDirectoryMetadataRequest` class.
 * Added `com.databricks.sdk.service.files.GetMetadataRequest` class.
 * Added `com.databricks.sdk.service.files.GetMetadataResponse` class.
 * Added `com.databricks.sdk.service.files.LastModifiedHttpDate` class.
 * Removed `triggerHistory` field for `com.databricks.sdk.service.jobs.Job`.
 * Removed `com.databricks.sdk.service.jobs.TriggerEvaluation` class.
 * Removed `com.databricks.sdk.service.jobs.TriggerHistory` class.
 * Added `table` field for `com.databricks.sdk.service.jobs.TriggerSettings`.
 * Added `com.databricks.sdk.service.jobs.Condition` class.
 * Added `com.databricks.sdk.service.jobs.TableTriggerConfiguration` class.
 * Removed `config` field for `com.databricks.sdk.service.serving.ExternalModel`.
 * Added `ai21labsConfig` field for `com.databricks.sdk.service.serving.ExternalModel`.
 * Added `anthropicConfig` field for `com.databricks.sdk.service.serving.ExternalModel`.
 * Added `awsBedrockConfig` field for `com.databricks.sdk.service.serving.ExternalModel`.
 * Added `cohereConfig` field for `com.databricks.sdk.service.serving.ExternalModel`.
 * Added `databricksModelServingConfig` field for `com.databricks.sdk.service.serving.ExternalModel`.
 * Added `openaiConfig` field for `com.databricks.sdk.service.serving.ExternalModel`.
 * Added `palmConfig` field for `com.databricks.sdk.service.serving.ExternalModel`.
 * Removed `com.databricks.sdk.service.serving.ExternalModelConfig` class.
 * Added `maxProvisionedThroughput` field for `com.databricks.sdk.service.serving.ServedEntityInput`.
 * Added `minProvisionedThroughput` field for `com.databricks.sdk.service.serving.ServedEntityInput`.
 * Added `maxProvisionedThroughput` field for `com.databricks.sdk.service.serving.ServedEntityOutput`.
 * Added `minProvisionedThroughput` field for `com.databricks.sdk.service.serving.ServedEntityOutput`.
 * Changed `delete()` method for `workspaceClient.cleanRooms()` service with new required argument order.
 * Changed `get()` method for `workspaceClient.cleanRooms()` service with new required argument order.
 * Changed `update()` method for `workspaceClient.cleanRooms()` service with new required argument order.
 * Removed `nameArg` field for `com.databricks.sdk.service.sharing.DeleteCleanRoomRequest`.
 * Added `name` field for `com.databricks.sdk.service.sharing.DeleteCleanRoomRequest`.
 * Removed `nameArg` field for `com.databricks.sdk.service.sharing.GetCleanRoomRequest`.
 * Added `name` field for `com.databricks.sdk.service.sharing.GetCleanRoomRequest`.
 * Removed `nameArg` field for `com.databricks.sdk.service.sharing.UpdateCleanRoom`.
 * Added `name` field for `com.databricks.sdk.service.sharing.UpdateCleanRoom`.
 * Added `enumOptions` field for `com.databricks.sdk.service.sql.Parameter`.
 * Added `multiValuesOptions` field for `com.databricks.sdk.service.sql.Parameter`.
 * Added `queryId` field for `com.databricks.sdk.service.sql.Parameter`.
 * Added `com.databricks.sdk.service.sql.MultiValuesOptions` class.

OpenAPI SHA: cdd76a98a4fca7008572b3a94427566dd286c63b, Date: 2024-02-19


## 0.18.0

* Derive config file name from attribute name ([#216](https://github.com/databricks/databricks-sdk-java/pull/216)).
```
This also renames

getAzureMSI -> getAzureMsi
setAzureMSI -> setAzureMsi
```
* Fix Databricks OAuth U2M on GCP ([#217](https://github.com/databricks/databricks-sdk-java/pull/217)).
* Make new workspace client from account client ([#218](https://github.com/databricks/databricks-sdk-java/pull/218)).
```
Example:

AccountClient a = new AccountClient();
Iterator<Workspace> workspaces = a.workspaces().list().iterator();
Workspace workspace = workspaces.next();
WorkspaceClient w = a.getWorkspaceClient(workspace);
w.currentUser().me();
```
* Only include request body when the OpenAPI operation indicates that there is a request body ([#223](https://github.com/databricks/databricks-sdk-java/pull/223)).

Internal Changes:
* Skip `AccountClientIT` test in GCP / Azure ([#222](https://github.com/databricks/databricks-sdk-java/pull/222)).
* Generate SDK ([#226](https://github.com/databricks/databricks-sdk-java/pull/226)).

API Changes:

Additions:
 * Added the following fields
    - Added `usePreemptibleExecutors`, `zoneId` fields for `com.databricks.sdk.service.compute.GcpAttributes`.
    - Added `abfss`, `gcs` fields for `com.databricks.sdk.service.compute.InitScriptInfo`.
    - Added `source` field for `com.databricks.sdk.service.jobs.DbtTask`.
    - Added `forEachTask` field for `com.databricks.sdk.service.jobs.RunTask`.
    - Added `source` field for `com.databricks.sdk.service.jobs.SqlTaskFile`.
    - Added `forEachTask` field for `com.databricks.sdk.service.jobs.SubmitTask`.
    - Added `forEachTask` field for `com.databricks.sdk.service.jobs.Task`.
    - Added `fieldMask` field for `com.databricks.sdk.service.settings.UpdatePersonalComputeSettingRequest`.
    - Added `deltaSyncIndexSpec` field for `com.databricks.sdk.service.vectorsearch.CreateVectorIndexRequest`.
    - Added `fileType` field for `com.databricks.sdk.service.workspace.ExportResponse`.
    - Added `resourceId` field for `com.databricks.sdk.service.workspace.ObjectInfo`.
 * Added the following methods
   - Added `cancelRefresh()`, `getRefresh()`, `listRefreshes()`, `runRefresh()` methods for `workspaceClient.lakehouseMonitors()` service.
   - Added `createDirectory()`, `deleteDirectory()`, `listDirectoryContents()` methods for `workspaceClient.files()` service. 
   - Added `getPersonalComputeSetting()` method for `accountClient.settings()` service.  
   - Added `deleteDefaultNamespaceSetting()`, `deleteRestrictWorkspaceAdminsSetting()`, `getDefaultNamespaceSetting()`, `getRestrictWorkspaceAdminsSetting()`, `updateDefaultNamespaceSetting()`, `updateRestrictWorkspaceAdminsSetting()` methods for `workspaceClient.settings()` service.
 * Added the following classes
   - Added `com.databricks.sdk.service.catalog.CancelRefreshRequest` class.
   - Added `com.databricks.sdk.service.catalog.GetRefreshRequest` class.
   - Added `com.databricks.sdk.service.catalog.ListRefreshesRequest` class.
   - Added `com.databricks.sdk.service.catalog.MonitorRefreshInfo` class.
   - Added `com.databricks.sdk.service.catalog.MonitorRefreshInfoState` class.
   - Added `com.databricks.sdk.service.catalog.RunRefreshRequest` class.
   - Added `com.databricks.sdk.service.compute.Adlsgen2Info` class. 
   - Added `com.databricks.sdk.service.compute.GcsStorageInfo` class.
   - Added `com.databricks.sdk.service.files.CreateDirectoryRequest` class. 
   - Added `com.databricks.sdk.service.files.DeleteDirectoryRequest` class. 
   - Added `com.databricks.sdk.service.files.DirectoryEntry` class. 
   - Added `com.databricks.sdk.service.files.ListDirectoryContentsRequest` class. 
   - Added `com.databricks.sdk.service.files.ListDirectoryResponse` class. 
   - Added `com.databricks.sdk.service.files.PageToken` class. 
   - Added `com.databricks.sdk.service.jobs.ForEachStats` class. 
   - Added `com.databricks.sdk.service.jobs.ForEachTask` class. 
   - Added `com.databricks.sdk.service.jobs.ForEachTaskErrorMessageStats` class. 
   - Added `com.databricks.sdk.service.jobs.ForEachTaskTaskRunStats` class. 
   - Added `com.databricks.sdk.service.jobs.RunForEachTask` class.
   - Added `com.databricks.sdk.service.pipelines.PipelineClusterAutoscale` class. 
   - Added `com.databricks.sdk.service.pipelines.PipelineClusterAutoscaleMode` class. 
   - Added `com.databricks.sdk.service.settings.DeleteDefaultNamespaceSettingRequest` class. 
   - Added `com.databricks.sdk.service.settings.DeleteDefaultNamespaceSettingResponse` class. 
   - Added `com.databricks.sdk.service.settings.DeleteRestrictWorkspaceAdminsSettingRequest` class. 
   - Added `com.databricks.sdk.service.settings.DeleteRestrictWorkspaceAdminsSettingResponse` class. 
   - Added `com.databricks.sdk.service.settings.GetDefaultNamespaceSettingRequest` class. 
   - Added `com.databricks.sdk.service.settings.GetPersonalComputeSettingRequest` class. 
   - Added `com.databricks.sdk.service.settings.GetRestrictWorkspaceAdminsSettingRequest` class. 
   - Added `com.databricks.sdk.service.settings.RestrictWorkspaceAdminsMessage` class. 
   - Added `com.databricks.sdk.service.settings.RestrictWorkspaceAdminsMessageStatus` class. 
   - Added `com.databricks.sdk.service.settings.RestrictWorkspaceAdminsSetting` class. 
   - Added `com.databricks.sdk.service.settings.UpdateDefaultNamespaceSettingRequest` class. 
   - Added `com.databricks.sdk.service.settings.UpdateRestrictWorkspaceAdminsSettingRequest` class.

Removals:
 * Removed the following fields
   - Removed `name` field for `com.databricks.sdk.service.catalog.UpdateConnection`.
   - Removed `name` field for `com.databricks.sdk.service.catalog.UpdateMetastore`.
   - Removed `name` field for `com.databricks.sdk.service.catalog.UpdateRegisteredModelRequest`.
   - Removed `name` field for `com.databricks.sdk.service.catalog.UpdateSchema`.
   - Removed `name` field for `com.databricks.sdk.service.catalog.UpdateVolumeRequestContent`.
   - Removed `deltaSyncVectorIndexSpec` field for `com.databricks.sdk.service.vectorsearch.CreateVectorIndexRequest`.
 * Removed the following methods
   - Removed `getStatus()` method for `workspaceClient.files()` service. 
   - Removed `reset()` method for `workspaceClient.pipelines()` service. 
   - Removed `readPersonalComputeSetting()` method for `accountClient.settings()` service.  
   - Removed `deleteDefaultWorkspaceNamespace()`, `readDefaultWorkspaceNamespace()`, `updateDefaultWorkspaceNamespace()` methods for `workspaceClient.settings()` service.
 * Removed the following classes
   - Removed `com.databricks.sdk.service.pipelines.ResetRequest` class.
   - Removed `com.databricks.sdk.service.settings.DeleteDefaultWorkspaceNamespaceRequest` class. 
   - Removed `com.databricks.sdk.service.settings.DeleteDefaultWorkspaceNamespaceResponse` class. 
   - Changed `etag` field for `com.databricks.sdk.service.settings.DeletePersonalComputeSettingRequest` to no longer be required. 
   - Removed `com.databricks.sdk.service.settings.ReadDefaultWorkspaceNamespaceRequest` class. 
   - Removed `com.databricks.sdk.service.settings.ReadPersonalComputeSettingRequest` class. 
   - Removed `com.databricks.sdk.service.settings.UpdateDefaultWorkspaceNamespaceRequest` class.




Changes:
 * Changed the following fields
   - Changed `maxWorkers`, `minWorkers` fields for `com.databricks.sdk.service.compute.AutoScale` to no longer be required.
   - Changed `destination` field for `com.databricks.sdk.service.compute.DbfsStorageInfo` to be required.
   - Changed `destination` field for `com.databricks.sdk.service.compute.LocalFileInfo` to be required. 
   - Changed `destination` field for `com.databricks.sdk.service.compute.S3StorageInfo` to be required. 
   - Changed `destination` field for `com.databricks.sdk.service.compute.VolumesStorageInfo` to be required. 
   - Changed `clients` field for `com.databricks.sdk.service.compute.WorkloadType` to be required. 
   - Changed `destination` field for `com.databricks.sdk.service.compute.WorkspaceStorageInfo` to be required. 
   - Changed `autoscale` field for `com.databricks.sdk.service.pipelines.PipelineCluster` to `com.databricks.sdk.service.pipelines.PipelineClusterAutoscale` class.
   - Changed `allowMissing`, `setting` fields for `com.databricks.sdk.service.settings.UpdatePersonalComputeSettingRequest` to be required.
 * Changed the following methods 
   - Changed `deletePersonalComputeSetting()`, `updatePersonalComputeSetting()` methods for `accountClient.settings()` service with new required argument order.

OpenAPI SHA: 6b897bc95b23abed8b9f5eff0e6b8ec034046180, Date: 2024-02-08

Dependency updates:

 * Bump org.apache.maven.plugins:maven-failsafe-plugin from 3.1.2 to 3.2.5 ([#206](https://github.com/databricks/databricks-sdk-java/pull/206)).

## 0.17.1

Major changes:

* Allow customizing APIs in WorkspaceClient/AccountClient ([#213](https://github.com/databricks/databricks-sdk-java/pull/213)).

Bug fixes:

* Make modifications to make Azure connection work ([#202](https://github.com/databricks/databricks-sdk-java/pull/202)).
* Tolerate missing GCP dependencies ([#214](https://github.com/databricks/databricks-sdk-java/pull/214)).



## 0.17.0

Bugfixes:

* Update SDK to OpenAPI spec with bug fix ([#207](https://github.com/databricks/databricks-sdk-java/pull/207)).
* Fix Azure Databricks OAuth M2M ([#209](https://github.com/databricks/databricks-sdk-java/pull/209)).

API Changes:

 * Added `exists()` method for `workspaceClient.tables()` service.
 * Added `workspaceClient.lakehouseMonitors()` service.
 * Removed `com.databricks.sdk.service.catalog.TableConstraintList` class.
 * Added `initScripts` field for `com.databricks.sdk.service.pipelines.PipelineCluster`.
 * Added the following dataclasses: 
  `databricks.sdk.service.catalog.CreateMonitor`, 
  `databricks.sdk.service.catalog.DeleteLakehouseMonitorRequest`, 
  `databricks.sdk.service.catalog.ExistsRequest`, 
  `databricks.sdk.service.catalog.GetLakehouseMonitorRequest`, 
  `databricks.sdk.service.catalog.MonitorCronSchedule`, 
  `databricks.sdk.service.catalog.MonitorCronSchedulePauseStatus`, 
  `databricks.sdk.service.catalog.MonitorCustomMetric`, 
  `databricks.sdk.service.catalog.MonitorCustomMetricType`, 
  `databricks.sdk.service.catalog.MonitorDataClassificationConfig`, 
  `databricks.sdk.service.catalog.MonitorDestinations`, 
  `databricks.sdk.service.catalog.MonitorInferenceLogProfileType`,   
  `databricks.sdk.service.catalog.MonitorInferenceLogProfileTypeProblemType`, 
  `databricks.sdk.service.catalog.MonitorInfo`, 
  `databricks.sdk.service.catalog.MonitorInfoStatus`, 
  `databricks.sdk.service.catalog.MonitorNotificationsConfig`, 
  `databricks.sdk.service.catalog.MonitorTimeSeriesProfileType`, 
  `databricks.sdk.service.catalog.TableExistsResponse` and
  `databricks.sdk.service.catalog.UpdateMonitor`. 
 * Added `validateOnly` field for `com.databricks.sdk.service.pipelines.StartUpdate`.
 * Added `validateOnly` field for `com.databricks.sdk.service.pipelines.UpdateInfo`.
 * Changed `createOboToken()` method for `workspaceClient.tokenManagement()` service with new required argument order.
 * Changed `get()` method for `workspaceClient.tokenManagement()` service to return `com.databricks.sdk.service.settings.GetTokenResponse` class.
 * Changed `lifetimeSeconds` field for `com.databricks.sdk.service.settings.CreateOboTokenRequest` to no longer be required.
 * Added `com.databricks.sdk.service.settings.GetTokenResponse` class.
 * Changed `create()` method for `workspaceClient.dashboards()` service . New request type is `com.databricks.sdk.service.sql.DashboardPostContent` class.
 * Added `update()` method for `workspaceClient.dashboards()` service.
 * Removed `com.databricks.sdk.service.sql.CreateDashboardRequest` class.
 * Added `httpHeaders` field for `com.databricks.sdk.service.sql.ExternalLink`.
 * Added `runAsRole` field for `com.databricks.sdk.service.sql.QueryEditContent`.
 * Added `com.databricks.sdk.service.sql.DashboardEditContent` class.
 * Added `com.databricks.sdk.service.sql.DashboardPostContent` class.

OpenAPI SHA: e05401ed5dd4974c5333d737ec308a7d451f749f, Date: 2024-01-23


## 0.16.0

* Update to OpenAPI spec ([#204](https://github.com/databricks/databricks-sdk-java/pull/204)).

Note: This release contains breaking changes, please see below.

API Changes:

 * [Breaking] Changed `list()` method for `workspaceClient.externalLocations()` service to require request of `com.databricks.sdk.service.catalog.ListExternalLocationsRequest` class, `workspaceClient.storageCredentials()` service to require request of `com.databricks.sdk.service.catalog.ListStorageCredentialsRequest` class and `workspaceClient.tokens()` service to return `com.databricks.sdk.service.settings.ListPublicTokensResponse` class and `com.databricks.sdk.service.catalog.ListSchemasResponse`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.catalog.ListExternalLocationsResponse`, `com.databricks.sdk.service.catalog.ListFunctionsResponse`, `com.databricks.sdk.service.catalog.ListSchemasResponse` and `com.databricks.sdk.service.catalog.ListStorageCredentialsResponse`.
 * Added `maxResults` field for `com.databricks.sdk.service.catalog.ListFunctionsRequest` and `com.databricks.sdk.service.catalog.ListSchemasRequest`.
 * Added `pageToken` field for `com.databricks.sdk.service.catalog.ListFunctionsRequest` and `com.databricks.sdk.service.catalog.ListSchemasRequest`.
 * Added `omitColumns` and `omitProperties` field for `com.databricks.sdk.service.catalog.ListTablesRequest`.
 * Added class: `com.databricks.sdk.service.catalog.ListExternalLocationsRequest`, `com.databricks.sdk.service.catalog.ListStorageCredentialsRequest` and `com.databricks.sdk.service.settings.ListPublicTokensResponse` class.
 * Added package: `com.databricks.sdk.service.dashboards` and `com.databricks.sdk.service.vectorsearch`.

OpenAPI SHA: a7a9dc025bb80303e676bf3708942c6aa06689f1, Date: 2024-01-04


## 0.15.0

* Better Java examples ([#200](https://github.com/databricks/databricks-sdk-java/pull/200)).

API Changes:

 * Added `azureWorkspaceInfo` field for `com.databricks.sdk.service.provisioning.Workspace`.
 * Added `com.databricks.sdk.service.provisioning.AzureWorkspaceInfo` class.
 * Changed `updateConfig()` method for `workspaceClient.servingEndpoints()` service with new required argument order.
 * Changed `servedEntities` field for `com.databricks.sdk.service.serving.EndpointCoreConfigInput` to no longer be required.
 * Changed `create()` method for `accountClient.ipAccessLists()` service with new required argument order.
 * Changed `replace()` method for `accountClient.ipAccessLists()` service with new required argument order.
 * Changed `update()` method for `accountClient.ipAccessLists()` service with new required argument order.
 * Changed `create()` method for `workspaceClient.ipAccessLists()` service with new required argument order.
 * Changed `replace()` method for `workspaceClient.ipAccessLists()` service with new required argument order.
 * Changed `update()` method for `workspaceClient.ipAccessLists()` service with new required argument order.
 * Changed `ipAddresses` field for `com.databricks.sdk.service.settings.CreateIpAccessList` to no longer be required.
 * Changed `ipAddresses` field for `com.databricks.sdk.service.settings.ReplaceIpAccessList` to no longer be required.
 * Removed `listId` field for `com.databricks.sdk.service.settings.ReplaceIpAccessList`.
 * Changed `enabled` field for `com.databricks.sdk.service.settings.UpdateIpAccessList` to no longer be required.
 * Changed `ipAddresses` field for `com.databricks.sdk.service.settings.UpdateIpAccessList` to no longer be required.
 * Changed `label` field for `com.databricks.sdk.service.settings.UpdateIpAccessList` to no longer be required.
 * Removed `listId` field for `com.databricks.sdk.service.settings.UpdateIpAccessList`.
 * Changed `listType` field for `com.databricks.sdk.service.settings.UpdateIpAccessList` to no longer be required.

OpenAPI SHA: d3853c8dee5806d04da2ae8910f273ffb35719a5, Date: 2023-12-14


## 0.14.0

Other changes:

* Added support for GCP auth ([#196](https://github.com/databricks/databricks-sdk-java/pull/196)).

API Changes:

 * Changed `update()` method for `workspaceClient.connections()` service with new required argument order.
 * Added `cloudflareApiToken` field for `com.databricks.sdk.service.catalog.CreateStorageCredential`.
 * Added `cloudflareApiToken` field for `com.databricks.sdk.service.catalog.StorageCredentialInfo`.
 * Changed `name` field for `com.databricks.sdk.service.catalog.UpdateCatalog` to be required.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateCatalog`.
 * Changed `name` field for `com.databricks.sdk.service.catalog.UpdateConnection` to no longer be required.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateConnection`.
 * Changed `name` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation` to be required.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateMetastore`.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateRegisteredModelRequest`.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateSchema`.
 * Changed `name` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential` to be required.
 * Added `cloudflareApiToken` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateVolumeRequestContent`.
 * Added `cloudflareApiToken` field for `com.databricks.sdk.service.catalog.ValidateStorageCredential`.
 * Added `com.databricks.sdk.service.catalog.CloudflareApiToken` class.
 * Removed `continuous` field for `com.databricks.sdk.service.jobs.BaseRun`.
 * Removed `continuous` field for `com.databricks.sdk.service.jobs.Run`.
 * Changed `jobParameters` field for `com.databricks.sdk.service.jobs.RunJobTask` to `com.databricks.sdk.service.jobs.ParamPairs` class.
 * Added `runIf` field for `com.databricks.sdk.service.jobs.SubmitTask`.
 * Added `runJobTask` field for `com.databricks.sdk.service.jobs.SubmitTask`.
 * Changed `updateConfig()` method for `workspaceClient.servingEndpoints()` service with new required argument order.
 * Added `put()` method for `workspaceClient.servingEndpoints()` service.
 * Added `rateLimits` field for `com.databricks.sdk.service.serving.CreateServingEndpoint`.
 * Changed `servedModels` field for `com.databricks.sdk.service.serving.EndpointCoreConfigInput` to no longer be required.
 * Added `autoCaptureConfig` field for `com.databricks.sdk.service.serving.EndpointCoreConfigInput`.
 * Added `servedEntities` field for `com.databricks.sdk.service.serving.EndpointCoreConfigInput`.
 * Added `autoCaptureConfig` field for `com.databricks.sdk.service.serving.EndpointCoreConfigOutput`.
 * Added `servedEntities` field for `com.databricks.sdk.service.serving.EndpointCoreConfigOutput`.
 * Added `servedEntities` field for `com.databricks.sdk.service.serving.EndpointCoreConfigSummary`.
 * Added `servedEntities` field for `com.databricks.sdk.service.serving.EndpointPendingConfig`.
 * Added `extraParams` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `input` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `maxTokens` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `messages` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `n` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `prompt` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `stop` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `stream` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `temperature` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Changed `predictions` field for `com.databricks.sdk.service.serving.QueryEndpointResponse` to no longer be required.
 * Added `choices` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Added `created` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Added `data` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Added `id` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Added `model` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Added `object` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Added `usage` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Changed `workloadSize` field for `com.databricks.sdk.service.serving.ServedModelInput` to `com.databricks.sdk.service.serving.ServedModelInputWorkloadSize` class.
 * Changed `workloadType` field for `com.databricks.sdk.service.serving.ServedModelInput` to `com.databricks.sdk.service.serving.ServedModelInputWorkloadType` class.
 * Added `task` field for `com.databricks.sdk.service.serving.ServingEndpoint`.
 * Added `task` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
 * Added `com.databricks.sdk.service.serving.Ai21LabsConfig` class.
 * Added `com.databricks.sdk.service.serving.AnthropicConfig` class.
 * Added `com.databricks.sdk.service.serving.AutoCaptureConfigInput` class.
 * Added `com.databricks.sdk.service.serving.AutoCaptureConfigOutput` class.
 * Added `com.databricks.sdk.service.serving.AutoCaptureState` class.
 * Added `com.databricks.sdk.service.serving.AwsBedrockConfig` class.
 * Added `com.databricks.sdk.service.serving.AwsBedrockConfigBedrockProvider` class.
 * Added `com.databricks.sdk.service.serving.ChatMessage` class.
 * Added `com.databricks.sdk.service.serving.ChatMessageRole` class.
 * Added `com.databricks.sdk.service.serving.CohereConfig` class.
 * Added `com.databricks.sdk.service.serving.DatabricksModelServingConfig` class.
 * Added `com.databricks.sdk.service.serving.EmbeddingsV1ResponseEmbeddingElement` class.
 * Added `com.databricks.sdk.service.serving.EmbeddingsV1ResponseEmbeddingElementObject` class.
 * Added `com.databricks.sdk.service.serving.ExternalModel` class.
 * Added `com.databricks.sdk.service.serving.ExternalModelConfig` class.
 * Added `com.databricks.sdk.service.serving.ExternalModelProvider` class.
 * Added `com.databricks.sdk.service.serving.ExternalModelUsageElement` class.
 * Added `com.databricks.sdk.service.serving.FoundationModel` class.
 * Added `com.databricks.sdk.service.serving.OpenAiConfig` class.
 * Added `com.databricks.sdk.service.serving.PaLmConfig` class.
 * Added `com.databricks.sdk.service.serving.PayloadTable` class.
 * Added `com.databricks.sdk.service.serving.PutRequest` class.
 * Added `com.databricks.sdk.service.serving.PutResponse` class.
 * Added `com.databricks.sdk.service.serving.QueryEndpointResponseObject` class.
 * Added `com.databricks.sdk.service.serving.RateLimit` class.
 * Added `com.databricks.sdk.service.serving.RateLimitKey` class.
 * Added `com.databricks.sdk.service.serving.RateLimitRenewalPeriod` class.
 * Added `com.databricks.sdk.service.serving.ServedEntityInput` class.
 * Added `com.databricks.sdk.service.serving.ServedEntityOutput` class.
 * Added `com.databricks.sdk.service.serving.ServedEntitySpec` class.
 * Added `com.databricks.sdk.service.serving.ServedModelInputWorkloadSize` class.
 * Added `com.databricks.sdk.service.serving.ServedModelInputWorkloadType` class.
 * Added `com.databricks.sdk.service.serving.V1ResponseChoiceElement` class.
 * Removed `accountClient.networkPolicy()` service.
 * Removed `com.databricks.sdk.service.settings.AccountNetworkPolicyMessage` class.
 * Removed `com.databricks.sdk.service.settings.DeleteAccountNetworkPolicyRequest` class.
 * Removed `com.databricks.sdk.service.settings.DeleteAccountNetworkPolicyResponse` class.
 * Removed `com.databricks.sdk.service.settings.ReadAccountNetworkPolicyRequest` class.
 * Removed `com.databricks.sdk.service.settings.UpdateAccountNetworkPolicyRequest` class.
 * Removed `name` field for `com.databricks.sdk.service.sharing.UpdateCleanRoom`.
 * Changed `name` field for `com.databricks.sdk.service.sharing.UpdateProvider` to be required.
 * Added `newName` field for `com.databricks.sdk.service.sharing.UpdateProvider`.
 * Changed `name` field for `com.databricks.sdk.service.sharing.UpdateRecipient` to be required.
 * Added `newName` field for `com.databricks.sdk.service.sharing.UpdateRecipient`.
 * Changed `name` field for `com.databricks.sdk.service.sharing.UpdateShare` to be required.
 * Added `newName` field for `com.databricks.sdk.service.sharing.UpdateShare`.
 * Added `statementIds` field for `com.databricks.sdk.service.sql.QueryFilter`.
 * Added `com.databricks.sdk.service.sql.StatementId` class.

OpenAPI SHA: 63caa3cb0c05045e81d3dcf2451fa990d8670f36, Date: 2023-12-12


## 0.13.0

Bug fixes:

* Fix databricks CLI authentication on Windows ([#192](https://github.com/databricks/databricks-sdk-java/pull/192)).
* Fix SCIM pagination ([#193](https://github.com/databricks/databricks-sdk-java/pull/193)).

Other changes:

* Add more detailed error message on default credentials not found error ([#180](https://github.com/databricks/databricks-sdk-java/pull/180)).
* Support custom scopes and redirectUrl for U2M OAuth flow ([#190](https://github.com/databricks/databricks-sdk-java/pull/190)).

API Changes:

 * Removed `enableOptimization()` method for `workspaceClient.metastores()` service.
 * Added `pipelineId` field for `com.databricks.sdk.service.catalog.TableInfo`.
 * Added `enablePredictiveOptimization` field for `com.databricks.sdk.service.catalog.UpdateCatalog` and `com.databricks.sdk.service.catalog.UpdateSchema`.
 * Removed `com.databricks.sdk.service.catalog.UpdatePredictiveOptimization` and `com.databricks.sdk.service.catalog.UpdatePredictiveOptimizationResponse` class.
 * Added `description` field for `com.databricks.sdk.service.jobs.CreateJob` and `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `listNetworkConnectivityConfigurations()` and `listPrivateEndpointRules()` methods for `accountClient.networkConnectivity()` service.
 * Added `com.databricks.sdk.service.settings.ListNccAzurePrivateEndpointRulesResponse`, `com.databricks.sdk.service.settings.ListNetworkConnectivityConfigurationsRequest`, `com.databricks.sdk.service.settings.ListNetworkConnectivityConfigurationsResponse`, and `com.databricks.sdk.service.settings.ListPrivateEndpointRulesRequest` classes.
 * Added `stringSharedAs` field for `com.databricks.sdk.service.sharing.SharedDataObject`.

OpenAPI SHA: 22f09783eb8a84d52026f856be3b2068f9498db3, Date: 2023-11-23

## 0.12.0

* Implemented notebook-native auth for the Java SDK ([#171](https://github.com/databricks/databricks-sdk-java/pull/171)).
* Addeded regression question to github issue template ([#176](https://github.com/databricks/databricks-sdk-java/pull/176)).
* Marked Java SDK as Beta ([#177](https://github.com/databricks/databricks-sdk-java/pull/177)).
* Updated SDK to latest OpenAPI Spec ([#181](https://github.com/databricks/databricks-sdk-java/pull/181)).

API Changes:

 * Changed `create()` method for `workspaceClient.functions()` and `workspaceClient.metastores()` service. 
 * Changed the following fields:
   * `inputParams` field for `com.databricks.sdk.service.catalog.CreateFunction` to `com.databricks.sdk.service.catalog.FunctionParameterInfos` class.
   * `properties` field for `com.databricks.sdk.service.catalog.CreateFunction` to `String` class.
   * `returnParams` field for `com.databricks.sdk.service.catalog.CreateFunction` to `com.databricks.sdk.service.catalog.FunctionParameterInfos` class.
   * `storageRoot` field for `com.databricks.sdk.service.catalog.CreateMetastore` to no longer be required.
   * `inputParams` field for `com.databricks.sdk.service.catalog.FunctionInfo` to `com.databricks.sdk.service.catalog.FunctionParameterInfos` class.
   * `properties` field for `com.databricks.sdk.service.catalog.FunctionInfo` to `String` class.
   * `returnParams` field for `com.databricks.sdk.service.catalog.FunctionInfo` to `com.databricks.sdk.service.catalog.FunctionParameterInfos` class.
 * Added the following fields:
   * `skipValidation` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
   * `libraries` field for `com.databricks.sdk.service.compute.CreatePolicy`, `com.databricks.sdk.service.compute.EditPolicy` and `com.databricks.sdk.service.compute.Policy`.
   * `initScripts` field for `com.databricks.sdk.service.compute.EventDetails`.
   * `file` field for `com.databricks.sdk.service.compute.InitScriptInfo`.
   * `zoneId` field for `com.databricks.sdk.service.compute.InstancePoolGcpAttributes`.
   * `editMode` field for `com.databricks.sdk.service.jobs.CreateJob` and `com.databricks.sdk.service.jobs.JobSettings`.
   * `includeResolvedValues` field for `com.databricks.sdk.service.jobs.GetRunRequest`.
   * `networkConnectivityConfigId` field for `com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest`.
   * `containerLogs` and `extraInfo` field for `com.databricks.sdk.service.serving.DeploymentStatus`.
* Added `deleteApp()`, `getApp()`, `getAppDeploymentStatus()`, `getApps()` and `getEvents()` method for `workspaceClient.apps()` service.
 * Added `accountClient.networkConnectivity()` service. 
 * Added the following classses: 
   * `com.databricks.sdk.service.compute`: `LocalFileInfo`, `InitScriptInfoAndExecutionDetails`, `InitScriptEventDetails`, `InitScriptExecutionDetails` and `InitScriptExecutionDetailsStatus`.
   * `com.databricks.sdk.service.jobs`: `JobSettingsEditMode` and `CreateJobEditMode`.
   * `com.databricks.sdk.service.catalog`: `CreateFunctionRequest`, `DependencyList` and `FunctionParameterInfos`.
   * `com.databricks.sdk.service.serving`: `AppEvents`, `AppServiceStatus`, `DeleteAppResponse`, `GetAppDeploymentStatusRequest`, `GetAppResponse`, `GetEventsRequest`, `ListAppEventsResponse` and `ListAppsResponse`.
   * `com.databricks.sdk.service.settings`: `CreateNetworkConnectivityConfigRequest`, `CreatePrivateEndpointRuleRequest`, `CreatePrivateEndpointRuleRequestGroupId`, `DeleteNetworkConnectivityConfigurationRequest`, `DeletePrivateEndpointRuleRequest`, `GetNetworkConnectivityConfigurationRequest`, `GetPrivateEndpointRuleRequest`, `NccAzurePrivateEndpointRule`, `NccAzurePrivateEndpointRuleConnectionState`, `NccAzurePrivateEndpointRuleGroupId`, `NccAzureServiceEndpointRule`, `NccEgressConfig`, `NccEgressDefaultRules`, `NccEgressTargetRules` and `NetworkConnectivityConfiguration`.
 * Removed the following fields:
   * `uiState` field for `com.databricks.sdk.service.jobs.CreateJob`.
   * `uiState` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Removed `delete()` and `get()` method for `workspaceClient.apps()` service.
 * Removed `accountClient.oAuthEnrollment()` service.
 * Removed the following classes: `com.databricks.sdk.service.jobs.CreateJobUiState`, `com.databricks.sdk.service.jobs.JobSettingsUiState`, `com.databricks.sdk.service.oauth2.CreateOAuthEnrollment` and `com.databricks.sdk.service.oauth2.OAuthEnrollmentStatus`.

OpenAPI SHA: e7b127cb07af8dd4d8c61c7cc045c8910cdbb02a, Date: 2023-11-08


## 0.11.0

* Adjust token expiry window to 40 seconds because of Azure ([#170](https://github.com/databricks/databricks-sdk-java/pull/170)).
* Use same logic as Go SDK for DatabricksConfig.isAzure() ([#174](https://github.com/databricks/databricks-sdk-java/pull/174)).

API Changes:

 * Added `attributes`, `count`, `excludedAttributes`, `filter`, `sortBy`, `sortOrder`, and `startIndex` fields for `com.databricks.sdk.service.iam.GetAccountUserRequest` and `com.databricks.sdk.service.iam.GetUserRequest`.
 * Added `schemas` field for `com.databricks.sdk.service.iam.Group`, `com.databricks.sdk.service.iam.ListGroupsResponse`, `com.databricks.sdk.service.iam.ListServicePrincipalResponse`, `com.databricks.sdk.service.iam.ListUsersResponse`, `com.databricks.sdk.service.iam.ServicePrincipal`, and `com.databricks.sdk.service.iam.User`.
 * Added `com.databricks.sdk.service.iam.GetSortOrder`, `com.databricks.sdk.service.iam.GroupSchema`, `com.databricks.sdk.service.iam.ListResponseSchema`, `com.databricks.sdk.service.iam.ServicePrincipalSchema`, and `com.databricks.sdk.service.iam.UserSchema` class.
 * Added `webhookNotifications` field for `com.databricks.sdk.service.jobs.SubmitTask`.
 * Added `workspaceClient.apps()` service and related classes.
 * Added `accountClient.networkPolicy()` service and related classes.

OpenAPI SHA: 5903bb39137fd76ac384b2044e425f9c56840e00, Date: 2023-10-23

Dependency updates:

 * Bump org.junit:junit-bom from 5.9.3 to 5.10.0 ([#124](https://github.com/databricks/databricks-sdk-java/pull/124)).
 * Bump org.slf4j:slf4j-api from 2.0.7 to 2.0.9 ([#146](https://github.com/databricks/databricks-sdk-java/pull/146)).
 * Bump org.slf4j:slf4j-reload4j from 2.0.7 to 2.0.9 ([#147](https://github.com/databricks/databricks-sdk-java/pull/147)).
 * Bump org.apache.maven.plugins:maven-javadoc-plugin from 3.5.0 to 3.6.0 ([#156](https://github.com/databricks/databricks-sdk-java/pull/156)).

## 0.10.0

* Don't fail codegen if the tree was already removed ([#164](https://github.com/databricks/databricks-sdk-java/pull/164)).
* Update OpenAPI spec to 12 Oct 2023 ([#165](https://github.com/databricks/databricks-sdk-java/pull/165)).

API Changes:

 * Changed `download()` method for `accountClient.billableUsage()` service to start returning `com.databricks.sdk.service.billing.DownloadResponse` class.
 * Added `com.databricks.sdk.service.billing.DownloadResponse` class.
 * Changed `delete()` method for `accountClient.storageCredentials()` service with new required argument order.
 * Changed `get()` method for `accountClient.storageCredentials()` service with new required argument order.
 * Changed `update()` method for `accountClient.storageCredentials()` service with new required argument order.
 * Added `getBindings()` method for `workspaceClient.workspaceBindings()` service.
 * Added `updateBindings()` method for `workspaceClient.workspaceBindings()` service.
 * Removed `name` field for `com.databricks.sdk.service.catalog.AccountsUpdateStorageCredential`.
 * Added `storageCredentialName` field for `com.databricks.sdk.service.catalog.AccountsUpdateStorageCredential`.
 * Removed `name` field for `com.databricks.sdk.service.catalog.DeleteAccountStorageCredentialRequest`.
 * Added `storageCredentialName` field for `com.databricks.sdk.service.catalog.DeleteAccountStorageCredentialRequest`.
 * Removed `name` field for `com.databricks.sdk.service.catalog.GetAccountStorageCredentialRequest`.
 * Added `storageCredentialName` field for `com.databricks.sdk.service.catalog.GetAccountStorageCredentialRequest`.
 * Added `owner` field for `com.databricks.sdk.service.catalog.UpdateConnection`.
 * Added `com.databricks.sdk.service.catalog.GetBindingsRequest` class.
 * Added `com.databricks.sdk.service.catalog.UpdateWorkspaceBindingsParameters` class.
 * Added `com.databricks.sdk.service.catalog.WorkspaceBinding` class.
 * Added `com.databricks.sdk.service.catalog.WorkspaceBindingBindingType` class.
 * Added `com.databricks.sdk.service.catalog.WorkspaceBindingsResponse` class.
 * Added `spec` field for `com.databricks.sdk.service.compute.ClusterDetails`.
 * Added `applyPolicyDefaultValues` field for `com.databricks.sdk.service.compute.ClusterSpec`.
 * Removed `awsAttributes` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `azureAttributes` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `diskSpec` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `enableElasticDisk` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `gcpAttributes` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `preloadedDockerImages` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `preloadedSparkVersions` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Added `deployment` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `uiState` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `deployment` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `uiState` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Removed `conditionTask` field for `com.databricks.sdk.service.jobs.RunOutput`.
 * Added `webhookNotifications` field for `com.databricks.sdk.service.jobs.Task`.
 * Added `com.databricks.sdk.service.jobs.CreateJobUiState` class.
 * Added `com.databricks.sdk.service.jobs.JobDeployment` class.
 * Added `com.databricks.sdk.service.jobs.JobDeploymentKind` class.
 * Added `com.databricks.sdk.service.jobs.JobSettingsUiState` class.
 * Added `workloadType` field for `com.databricks.sdk.service.serving.ServedModelInput`.
 * Added `workloadType` field for `com.databricks.sdk.service.serving.ServedModelOutput`.
 * Removed `accountClient.networkPolicy()` service.
 * Changed `list()` method for `workspaceClient.ipAccessLists()` service to return `com.databricks.sdk.service.settings.ListIpAccessListResponse` class.
 * Removed `com.databricks.sdk.service.settings.AccountNetworkPolicyMessage` class.
 * Removed `com.databricks.sdk.service.settings.DeleteAccountNetworkPolicyRequest` class.
 * Removed `com.databricks.sdk.service.settings.DeleteAccountNetworkPolicyResponse` class.
 * Removed `ipAccessLists` field for `com.databricks.sdk.service.settings.GetIpAccessListResponse`.
 * Added `ipAccessList` field for `com.databricks.sdk.service.settings.GetIpAccessListResponse`.
 * Removed `com.databricks.sdk.service.settings.ReadAccountNetworkPolicyRequest` class.
 * Removed `com.databricks.sdk.service.settings.UpdateAccountNetworkPolicyRequest` class.
 * Added `com.databricks.sdk.service.settings.ListIpAccessListResponse` class.

OpenAPI SHA: 493a76554afd3afdd15dc858773d01643f80352a, Date: 2023-10-12


## 0.9.0

* Add additional error metadata to API errors ([#153](https://github.com/databricks/databricks-sdk-java/pull/153)).
* Bugfix: Chunk streaming request bodies only ([#157](https://github.com/databricks/databricks-sdk-java/pull/157)).
* Relicense the Java SDK using the Apache 2.0 license ([#158](https://github.com/databricks/databricks-sdk-java/pull/158)).

Breaking API Changes:

 * Changed `list()` method for `accountClient.metastoreAssignments()` service to return `com.databricks.sdk.service.catalog.ListAccountMetastoreAssignmentsResponse` class.
 * Changed `artifactMatchers` field for `com.databricks.sdk.service.catalog.ArtifactAllowlistInfo` to `com.databricks.sdk.service.catalog.ArtifactMatcherList` class.
 * Removed `owner` field for `com.databricks.sdk.service.catalog.CreateConnection`. Use instead the `owner` field of `UpdateConnection`.
 * Changed `artifactMatchers` field for `com.databricks.sdk.service.catalog.SetArtifactAllowlist` to `com.databricks.sdk.service.catalog.ArtifactMatcherList` class.
 * Removed `options` field for `com.databricks.sdk.service.catalog.UpdateCatalog`.
 * Changed `cancelAllRuns()` method for `workspaceClient.jobs()` service with new required argument order.
 * Changed `jobId` field for `com.databricks.sdk.service.jobs.CancelAllRuns` to no longer be required.
 * Changed `jobParameters` field for `com.databricks.sdk.service.jobs.RunNow` to `com.databricks.sdk.service.jobs.ParamPairs` class.
 * Changed `query()` method for `workspaceClient.servingEndpoints()` service. New request type is `com.databricks.sdk.service.serving.QueryEndpointInput` class.
 * Removed `com.databricks.sdk.service.serving.QueryRequest` class.
 * Changed `list()` method for `workspaceClient.cleanRooms()` service to require request of `com.databricks.sdk.service.sharing.ListCleanRoomsRequest` class.
 * Changed `executeStatement()` method for `workspaceClient.statementExecution()` service with new required argument order.
 * Renamed `com.databricks.sdk.service.sql.ChunkInfo` class to `BaseChunkInfo`.
 * Changed `onWaitTimeout` field for `com.databricks.sdk.service.sql.ExecuteStatementRequest` to `com.databricks.sdk.service.sql.ExecuteStatementRequestOnWaitTimeout` class.
 * Changed `statement` field for `com.databricks.sdk.service.sql.ExecuteStatementRequest` to be required.
 * Changed `warehouseId` field for `com.databricks.sdk.service.sql.ExecuteStatementRequest` to be required.
 * Changed `chunks` field for `com.databricks.sdk.service.sql.ResultManifest` to `com.databricks.sdk.service.sql.BaseChunkInfoList` class.
 * Renamed `com.databricks.sdk.service.sql.TimeoutAction` class to `ExecuteStatementRequestOnWaitTimeout`.

API Changes:

 * Added `com.databricks.sdk.service.catalog.ListAccountMetastoreAssignmentsResponse` class.
 * Added `com.databricks.sdk.service.catalog.WorkspaceId` class.
 * Added `allQueuedRuns` field for `com.databricks.sdk.service.jobs.CancelAllRuns`.
 * Added `queue` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `queue` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `jobParameters` field for `com.databricks.sdk.service.jobs.RepairRun`.
 * Added `queue` field for `com.databricks.sdk.service.jobs.RunNow`.
 * Added `jobParameters` field for `com.databricks.sdk.service.jobs.RunParameters`.
 * Added `queueReason` field for `com.databricks.sdk.service.jobs.RunState`.
 * Added `queueDuration` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Added `queue` field for `com.databricks.sdk.service.jobs.SubmitRun`.
 * Added `com.databricks.sdk.service.jobs.QueueSettings` class.
 * Added `accountClient.oAuthPublishedApps()` service.
 * Added `com.databricks.sdk.service.oauth2.GetPublishedAppsOutput` class.
 * Added `com.databricks.sdk.service.oauth2.ListOAuthPublishedAppsRequest` class.
 * Added `com.databricks.sdk.service.oauth2.PublishedAppOutput` class.
 * Added `notifications` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
 * Added `notifications` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
 * Added `notifications` field for `com.databricks.sdk.service.pipelines.PipelineSpec`.
 * Added `com.databricks.sdk.service.pipelines.Notifications` class.
 * Added `patch()` method for `workspaceClient.servingEndpoints()` service.
 * Added `tags` field for `com.databricks.sdk.service.serving.CreateServingEndpoint`.
 * Added `tags` field for `com.databricks.sdk.service.serving.ServingEndpoint`.
 * Added `tags` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
 * Added `com.databricks.sdk.service.serving.DataframeSplitInput` class.
 * Added `com.databricks.sdk.service.serving.EndpointTag` class.
 * Added `com.databricks.sdk.service.serving.PatchServingEndpointTags` class.
 * Added `com.databricks.sdk.service.serving.QueryEndpointInput` class.
 * Added `workspaceClient.credentialsManager()` service.
 * Added `workspaceClient.settings()` service.
 * Added `com.databricks.sdk.service.settings.DefaultNamespaceSetting` class.
 * Added `com.databricks.sdk.service.settings.DeleteDefaultWorkspaceNamespaceRequest` class.
 * Added `com.databricks.sdk.service.settings.DeleteDefaultWorkspaceNamespaceResponse` class.
 * Added `com.databricks.sdk.service.settings.ExchangeToken` class.
 * Added `com.databricks.sdk.service.settings.ExchangeTokenRequest` class.
 * Added `com.databricks.sdk.service.settings.ExchangeTokenResponse` class.
 * Added `com.databricks.sdk.service.settings.PartitionId` class.
 * Added `com.databricks.sdk.service.settings.ReadDefaultWorkspaceNamespaceRequest` class.
 * Added `com.databricks.sdk.service.settings.StringMessage` class.
 * Added `com.databricks.sdk.service.settings.TokenType` class.
 * Added `com.databricks.sdk.service.settings.UpdateDefaultWorkspaceNamespaceRequest` class.
 * Added `nextPageToken` field for `com.databricks.sdk.service.sharing.ListCleanRoomsResponse`.
 * Added `com.databricks.sdk.service.sharing.ListCleanRoomsRequest` class.
 * Added `emptyResultState` field for `com.databricks.sdk.service.sql.AlertOptions`.
 * Added `truncated` field for `com.databricks.sdk.service.sql.ResultManifest`.
 * Added `com.databricks.sdk.service.sql.AlertOptionsEmptyResultState` class.

OpenAPI SHA: bcbf6e851e3d82fd910940910dd31c10c059746c, Date: 2023-10-02


## 0.8.1

* Added support for Azure authentication when WorkspaceResourceID is provided ([#145](https://github.com/databricks/databricks-sdk-java/pull/145)).
* Fixed Files API integration test ([#150](https://github.com/databricks/databricks-sdk-java/pull/150)).


## 0.8.0

* Adding mock constructor method for WorkspaceClient to support mocked ApiClient ([#144](https://github.com/databricks/databricks-sdk-java/pull/144)).

API Changes:

* Renamed permissions APIs to no longer include the service name, for example:
  * `getJobPermissionLevels` -> `getPermissionLevels`
  * `getJobPermissions` -> `getPermissions`
  * `setJobPermissions` -> `setPermissions`
  * `updateJobPermissions` -> `updatePermissions`
* Changed `create()` method for `workspaceClient.volumes()` service with new required argument order.
* Added `supportsElasticDisk` field for `com.databricks.sdk.service.compute.NodeType`.
* Changed `create()` method for `workspaceClient.dashboards()` service with new required argument order.
* Added `workspaceClient.dashboardWidgets()` service.
* Added `workspaceClient.queryVisualizations()` service.
* Changed `name` field for `com.databricks.sdk.service.sql.CreateDashboardRequest` to be required.
* Added `dashboardFiltersEnabled` field for `com.databricks.sdk.service.sql.CreateDashboardRequest`.
* Added `runAsRole` field for `com.databricks.sdk.service.sql.CreateDashboardRequest`.
* Added `runAsRole` field for `com.databricks.sdk.service.sql.Query`.
* Added `runAsRole` field for `com.databricks.sdk.service.sql.QueryPostContent`.
* Removed `dashboardId` field for `com.databricks.sdk.service.sql.WidgetOptions`.
* Changed `position` field for `com.databricks.sdk.service.sql.WidgetOptions` to `com.databricks.sdk.service.sql.WidgetPosition` class.
* Removed `text` field for `com.databricks.sdk.service.sql.WidgetOptions`.
* Added `description` field for `com.databricks.sdk.service.sql.WidgetOptions`.
* Added `title` field for `com.databricks.sdk.service.sql.WidgetOptions`.
* Added `com.databricks.sdk.service.sql.CreateQueryVisualizationRequest` class.
* Added `com.databricks.sdk.service.sql.CreateWidget` class.
* Added `com.databricks.sdk.service.sql.DeleteDashboardWidgetRequest` class.
* Added `com.databricks.sdk.service.sql.DeleteQueryVisualizationRequest` class.
* Added `com.databricks.sdk.service.sql.RunAsRole` class.
* Added `com.databricks.sdk.service.sql.WidgetPosition` class.

OpenAPI SHA: 09a7fa63d9ae243e5407941f200960ca14d48b07, Date: 2023-09-04
## 0.7.0

* Added support for propagating Request Headers through API Client ([#135](https://github.com/databricks/databricks-sdk-java/pull/135)).
* Added support for InputStream for streaming request and response bodies ([#138](https://github.com/databricks/databricks-sdk-java/pull/138)).
* Fixed query param serialization for requests with enums ([#140](https://github.com/databricks/databricks-sdk-java/pull/140)).

Breaking API Changes:
 * Changed `list()` method for `accountClient.storageCredentials()` service to return `com.databricks.sdk.service.catalog.StorageCredentialInfoList` class.
 * Removed `workspaceClient.securableTags()` service and all related classes.
 * Removed `workspaceClient.subentityTags()` service and all related classes.
 * Renamed `provisioningState` field for `com.databricks.sdk.service.catalog.ConnectionInfo` to `provisioningInfo`.
 * Removed `instancePoolFleetAttributes` field for `com.databricks.sdk.service.compute.CreateInstancePool`.
 * Removed `instancePoolFleetAttributes` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `com.databricks.sdk.service.compute.FleetLaunchTemplateOverride` class.
 * Removed `com.databricks.sdk.service.compute.FleetOnDemandOption` class.
 * Removed `com.databricks.sdk.service.compute.FleetOnDemandOptionAllocationStrategy` class.
 * Removed `com.databricks.sdk.service.compute.FleetSpotOption` class.
 * Removed `com.databricks.sdk.service.compute.FleetSpotOptionAllocationStrategy` class.
 * Removed `instancePoolFleetAttributes` field for `com.databricks.sdk.service.compute.GetInstancePool`.
 * Removed `instancePoolFleetAttributes` field for `com.databricks.sdk.service.compute.InstancePoolAndStats`.
 * Removed `com.databricks.sdk.service.compute.InstancePoolFleetAttributes` class.
 * Changed `getByName()` method for `workspaceClient.experiments()` service to return `com.databricks.sdk.service.ml.GetExperimentResponse` class.
 * Changed `getExperiment()` method for `workspaceClient.experiments()` service to return `com.databricks.sdk.service.ml.GetExperimentResponse` class.
 * Renamed `com.databricks.sdk.service.ml.GetExperimentByNameResponse` class to `com.databricks.sdk.service.ml.GetExperimentResponse`.

API Changes:

 * Added `workspaceClient.modelVersions()` service.
 * Added `workspaceClient.registeredModels()` service.
 * Added `browseOnly` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Added `fullName` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Added `provisioningInfo` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Added `securableKind` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Added `securableType` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Added `options` field for `com.databricks.sdk.service.catalog.CreateCatalog`.
 * Added `options` field for `com.databricks.sdk.service.catalog.UpdateCatalog`.
 * Added `com.databricks.sdk.service.catalog.CatalogInfoSecurableKind` class.
 * Added `com.databricks.sdk.service.catalog.CreateRegisteredModelRequest` class.
 * Added `com.databricks.sdk.service.catalog.DeleteAliasRequest` class.
 * Added `com.databricks.sdk.service.catalog.DeleteModelVersionRequest` class.
 * Added `com.databricks.sdk.service.catalog.DeleteRegisteredModelRequest` class.
 * Added `com.databricks.sdk.service.catalog.GetByAliasRequest` class.
 * Added `com.databricks.sdk.service.catalog.GetModelVersionRequest` class.
 * Added `com.databricks.sdk.service.catalog.GetRegisteredModelRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListModelVersionsRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListModelVersionsResponse` class.
 * Added `com.databricks.sdk.service.catalog.ListRegisteredModelsRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListRegisteredModelsResponse` class.
 * Added `com.databricks.sdk.service.catalog.ModelVersionInfo` class.
 * Added `com.databricks.sdk.service.catalog.ModelVersionInfoStatus` class.
 * Added `com.databricks.sdk.service.catalog.ProvisioningInfo` class.
 * Added `com.databricks.sdk.service.catalog.ProvisioningInfoState` class.
 * Added `com.databricks.sdk.service.catalog.RegisteredModelAlias` class.
 * Added `com.databricks.sdk.service.catalog.RegisteredModelInfo` class.
 * Added `com.databricks.sdk.service.catalog.SetRegisteredModelAliasRequest` class.
 * Added `com.databricks.sdk.service.catalog.UpdateModelVersionRequest` class.
 * Added `com.databricks.sdk.service.catalog.UpdateRegisteredModelRequest` class.
 * Added `volumes` field for `com.databricks.sdk.service.compute.InitScriptInfo`.
 * Added `com.databricks.sdk.service.compute.VolumesStorageInfo` class.
 * Added `workspaceClient.files()` service.
 * Added `com.databricks.sdk.service.files.DeleteFileRequest` class.
 * Added `com.databricks.sdk.service.files.DownloadRequest` class.
 * Added `com.databricks.sdk.service.files.DownloadResponse` class.
 * Added `com.databricks.sdk.service.files.UploadRequest` class.
 * Added `customTags` field for `com.databricks.sdk.service.provisioning.CreateWorkspaceRequest`.
 * Added `customTags` field for `com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest`.
 * Added `customTags` field for `com.databricks.sdk.service.provisioning.Workspace`.
 * Added `com.databricks.sdk.service.provisioning.CustomTags` class.
 * Added `parameters` field for `com.databricks.sdk.service.sql.ExecuteStatementRequest`.
 * Added `rowLimit` field for `com.databricks.sdk.service.sql.ExecuteStatementRequest`.
 * Added `com.databricks.sdk.service.sql.StatementParameterListItem` class.

OpenAPI SHA: 5d0ccbb790d341eae8e85321a685a9e9e2d5bf24, Date: 2023-08-29
## 0.6.0

* Added support for `dbutils.secrets` ([#132](https://github.com/databricks/databricks-sdk-java/pull/132)).
* Added retry in `w.clusters().ensureClusterIsRunning(id)` when cluster is simultaneously started by two different processes ([#134](https://github.com/databricks/databricks-sdk-java/pull/134)).
* Set necessary headers when authenticating via Azure CLI ([#136](https://github.com/databricks/databricks-sdk-java/pull/136)).

New Services:

 * Added `workspaceClient.artifactAllowlists()` service.
 * Added `workspaceClient.securableTags()` service.
 * Added `workspaceClient.subentityTags()` service.
 * Added `com.databricks.sdk.service.catalog.ArtifactAllowlistInfo` class.
 * Added `com.databricks.sdk.service.catalog.ArtifactMatcher` class.
 * Added `com.databricks.sdk.service.catalog.ArtifactType` class.
 * Added `com.databricks.sdk.service.catalog.GetArtifactAllowlistRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListSecurableTagsRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListSecurableType` class.
 * Added `com.databricks.sdk.service.catalog.ListSubentityTagsRequest` class.
 * Added `com.databricks.sdk.service.catalog.MatchType` class.
 * Added `com.databricks.sdk.service.catalog.SetArtifactAllowlist` class.
 * Added `com.databricks.sdk.service.catalog.TagChanges` class.
 * Added `com.databricks.sdk.service.catalog.TagKeyValuePair` class.
 * Added `com.databricks.sdk.service.catalog.TagSecurable` class.
 * Added `com.databricks.sdk.service.catalog.TagSecurableAssignment` class.
 * Added `com.databricks.sdk.service.catalog.TagSecurableAssignmentsList` class.
 * Added `com.databricks.sdk.service.catalog.TagSubentity` class.
 * Added `com.databricks.sdk.service.catalog.TagSubentityAssignmentsList` class.
 * Added `com.databricks.sdk.service.catalog.TagsSubentityAssignment` class.
 * Added `com.databricks.sdk.service.catalog.UpdateSecurableType` class.
 * Added `com.databricks.sdk.service.catalog.UpdateTags` class.

New APIs:

 * Added `deleteRuns()` method for `workspaceClient.experiments()` service.
 * Added `restoreRuns()` method for `workspaceClient.experiments()` service.
 * Added `com.databricks.sdk.service.ml.DeleteRuns` class.
 * Added `com.databricks.sdk.service.ml.DeleteRunsResponse` class.
 * Added `com.databricks.sdk.service.ml.RestoreRuns` class.
 * Added `com.databricks.sdk.service.ml.RestoreRunsResponse` class.
 * Added `getSecret()` method for `workspaceClient.secrets()` service.
 * Added `com.databricks.sdk.service.workspace.GetSecretRequest` class.
 * Added `com.databricks.sdk.service.workspace.GetSecretResponse` class.

API Renames:

 * Renamed `effectiveAutoMaintenanceFlag` field to `effectivePredictiveOptimizationFlag` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Renamed `enableAutoMaintenance` field to `enablePredictiveOptimization` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Renamed `com.databricks.sdk.service.catalog.EffectiveAutoMaintenanceFlag` class to `com.databricks.sdk.service.catalog.EffectivePredictiveOptimizationFlag` class.
 * Renamed `com.databricks.sdk.service.catalog.EffectiveAutoMaintenanceFlagInheritedFromType` class to `com.databricks.sdk.service.catalog.EffectivePredictiveOptimizationFlagInheritedFromType`.
 * Renamed `com.databricks.sdk.service.catalog.EnableAutoMaintenance` class to `com.databricks.sdk.service.catalog.EnablePredictiveOptimization`.
 * Renamed `effectiveAutoMaintenanceFlag` field to `effectivePredictiveOptimizationFlag` field for `com.databricks.sdk.service.catalog.SchemaInfo`.
 * Renamed `enableAutoMaintenance` field to `enablePredictiveOptimization` field for `com.databricks.sdk.service.catalog.SchemaInfo`.
 * Renamed `effectiveAutoMaintenanceFlag` field to `effectivePredictiveOptimizationFlag` field for `com.databricks.sdk.service.catalog.TableInfo`.
 * Renamed `enableAutoMaintenance` field to `enablePredictiveOptimization` field for `com.databricks.sdk.service.catalog.TableInfo`.

OpenAPI SHA: beff621d7b3e1d59244e2e34fc53a496f310e130, Date: 2023-08-17


## 0.5.0


API Changes:

 * Changed `create()` method for `accountClient.storageCredentials()` service to return `com.databricks.sdk.service.catalog.AccountsStorageCredentialInfo` class.
 * Changed `get()` method for `accountClient.storageCredentials()` service to return `com.databricks.sdk.service.catalog.AccountsStorageCredentialInfo` class.
 * Changed `update()` method for `accountClient.storageCredentials()` service to return `com.databricks.sdk.service.catalog.AccountsStorageCredentialInfo` class.
 * Changed `create()` method for `workspaceClient.connections()` service with new required argument order.
 * Changed `update()` method for `workspaceClient.connections()` service with new required argument order.
 * Added `provisioningState` field for `com.databricks.sdk.service.catalog.ConnectionInfo`.
 * Added `securableKind` field for `com.databricks.sdk.service.catalog.ConnectionInfo`.
 * Added `securableType` field for `com.databricks.sdk.service.catalog.ConnectionInfo`.
 * Changed `algorithm` field for `com.databricks.sdk.service.catalog.SseEncryptionDetails` to no longer be required.
 * Added `com.databricks.sdk.service.catalog.AccountsStorageCredentialInfo` class.
 * Added `com.databricks.sdk.service.catalog.ConnectionInfoSecurableKind` class.
 * Added `com.databricks.sdk.service.catalog.ProvisioningState` class.
 * Added `dataSecurityMode` field for `com.databricks.sdk.service.compute.CreateCluster`.
 * Added `dockerImage` field for `com.databricks.sdk.service.compute.CreateCluster`.
 * Added `singleUserName` field for `com.databricks.sdk.service.compute.CreateCluster`.

Bug fixes:

 * Renamed `optionsKvpairs` field to `options` for `com.databricks.sdk.service.catalog.ConnectionInfo`.
 * Renamed `propertiesKvpairs` field to `properties` for `com.databricks.sdk.service.catalog.ConnectionInfo`.
 * Renamed `optionsKvpairs` field to `options` for `com.databricks.sdk.service.catalog.CreateConnection`.
 * Renamed `propertiesKvpairs` field to `properties` for `com.databricks.sdk.service.catalog.CreateConnection`.
 * Renamed `optionsKvpairs` field to `options` for `com.databricks.sdk.service.catalog.UpdateConnection`.
 * Renamed `schema` field to `schemas` for `com.databricks.sdk.service.iam.PartialUpdate`.

OpenAPI SHA: 1e3533f94335f0e6c5d9262bc1fea95b3ddcb0e1, Date: 2023-08-11


## 0.4.0

To simplify documentation and management of object permissions, this release features a major reorganization of how permissions APIs are structured in the SDK. Rather than using a single `Permissions.Get()` API for all services, each service supporting permissions has its own permissions APIs. Follow these steps to migrate to the current SDK:

 * Change `w.permissions().get()` and `w.permissions().getByRequestOgjectIdAndRequestObjectType()` to `w.<Service>.get<Service>Permissions()`
 * Change `w.permissions().getPermissionLevels()` to `w.<Service>.getServicePermissionLevels()`
 * Change `w.permissions().set()` to `w.<Service>.set<Service>Permissions()`
 * Change `w.permissions().update()` to `w.<Service>.update<Service>Permissions()`


API Changes:

 * Added `getClusterPolicyPermissionLevels()` method for `workspaceClient.clusterPolicies()` service.
 * Added `getClusterPolicyPermissions()` method for `workspaceClient.clusterPolicies()` service.
 * Added `setClusterPolicyPermissions()` method for `workspaceClient.clusterPolicies()` service.
 * Added `updateClusterPolicyPermissions()` method for `workspaceClient.clusterPolicies()` service.
 * Added `getClusterPermissionLevels()` method for `workspaceClient.clusters()` service.
 * Added `getClusterPermissions()` method for `workspaceClient.clusters()` service.
 * Added `setClusterPermissions()` method for `workspaceClient.clusters()` service.
 * Added `updateClusterPermissions()` method for `workspaceClient.clusters()` service.
 * Added `getInstancePoolPermissionLevels()` method for `workspaceClient.instancePools()` service.
 * Added `getInstancePoolPermissions()` method for `workspaceClient.instancePools()` service.
 * Added `setInstancePoolPermissions()` method for `workspaceClient.instancePools()` service.
 * Added `updateInstancePoolPermissions()` method for `workspaceClient.instancePools()` service.
 * Added `com.databricks.sdk.service.compute.ClusterAccessControlRequest` class.
 * Added `com.databricks.sdk.service.compute.ClusterAccessControlResponse` class.
 * Added `com.databricks.sdk.service.compute.ClusterPermission` class.
 * Added `com.databricks.sdk.service.compute.ClusterPermissionLevel` class.
 * Added `com.databricks.sdk.service.compute.ClusterPermissions` class.
 * Added `com.databricks.sdk.service.compute.ClusterPermissionsDescription` class.
 * Added `com.databricks.sdk.service.compute.ClusterPermissionsRequest` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyAccessControlRequest` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyAccessControlResponse` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyPermission` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyPermissionLevel` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyPermissions` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyPermissionsDescription` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyPermissionsRequest` class.
 * Added `com.databricks.sdk.service.compute.GetClusterPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.compute.GetClusterPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.compute.GetClusterPermissionsRequest` class.
 * Added `com.databricks.sdk.service.compute.GetClusterPolicyPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.compute.GetClusterPolicyPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.compute.GetClusterPolicyPermissionsRequest` class.
 * Added `com.databricks.sdk.service.compute.GetInstancePoolPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.compute.GetInstancePoolPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.compute.GetInstancePoolPermissionsRequest` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolAccessControlRequest` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolAccessControlResponse` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolPermission` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolPermissionLevel` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolPermissions` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolPermissionsDescription` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolPermissionsRequest` class.
 * Changed `set()` method for `workspaceClient.permissions()` service to start returning `com.databricks.sdk.service.iam.ObjectPermissions` class.
 * Changed `update()` method for `workspaceClient.permissions()` service to start returning `com.databricks.sdk.service.iam.ObjectPermissions` class.
 * Added `getPasswordPermissionLevels()` method for `workspaceClient.users()` service.
 * Added `getPasswordPermissions()` method for `workspaceClient.users()` service.
 * Added `setPasswordPermissions()` method for `workspaceClient.users()` service.
 * Added `updatePasswordPermissions()` method for `workspaceClient.users()` service.
 * Added `displayName` field for `com.databricks.sdk.service.iam.AccessControlResponse`.
 * Changed `roles` field for `com.databricks.sdk.service.iam.GetAssignableRolesForResourceResponse` to `com.databricks.sdk.service.iam.RoleList` class.
 * Added `com.databricks.sdk.service.iam.GetPasswordPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.iam.PasswordAccessControlRequest` class.
 * Added `com.databricks.sdk.service.iam.PasswordAccessControlResponse` class.
 * Added `com.databricks.sdk.service.iam.PasswordPermission` class.
 * Added `com.databricks.sdk.service.iam.PasswordPermissionLevel` class.
 * Added `com.databricks.sdk.service.iam.PasswordPermissions` class.
 * Added `com.databricks.sdk.service.iam.PasswordPermissionsDescription` class.
 * Added `com.databricks.sdk.service.iam.PasswordPermissionsRequest` class.
 * Added `com.databricks.sdk.service.iam.Role` class.
 * Added `getJobPermissionLevels()` method for `workspaceClient.jobs()` service.
 * Added `getJobPermissions()` method for `workspaceClient.jobs()` service.
 * Added `setJobPermissions()` method for `workspaceClient.jobs()` service.
 * Added `updateJobPermissions()` method for `workspaceClient.jobs()` service.
 * Added `com.databricks.sdk.service.jobs.GetJobPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.jobs.GetJobPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.jobs.GetJobPermissionsRequest` class.
 * Added `com.databricks.sdk.service.jobs.JobAccessControlRequest` class.
 * Added `com.databricks.sdk.service.jobs.JobAccessControlResponse` class.
 * Added `com.databricks.sdk.service.jobs.JobPermission` class.
 * Added `com.databricks.sdk.service.jobs.JobPermissionLevel` class.
 * Added `com.databricks.sdk.service.jobs.JobPermissions` class.
 * Added `com.databricks.sdk.service.jobs.JobPermissionsDescription` class.
 * Added `com.databricks.sdk.service.jobs.JobPermissionsRequest` class.
 * Added `getExperimentPermissionLevels()` method for `workspaceClient.experiments()` service.
 * Added `getExperimentPermissions()` method for `workspaceClient.experiments()` service.
 * Added `setExperimentPermissions()` method for `workspaceClient.experiments()` service.
 * Added `updateExperimentPermissions()` method for `workspaceClient.experiments()` service.
 * Added `getRegisteredModelPermissionLevels()` method for `workspaceClient.modelRegistry()` service.
 * Added `getRegisteredModelPermissions()` method for `workspaceClient.modelRegistry()` service.
 * Added `setRegisteredModelPermissions()` method for `workspaceClient.modelRegistry()` service.
 * Added `updateRegisteredModelPermissions()` method for `workspaceClient.modelRegistry()` service.
 * Added `com.databricks.sdk.service.ml.ExperimentAccessControlRequest` class.
 * Added `com.databricks.sdk.service.ml.ExperimentAccessControlResponse` class.
 * Added `com.databricks.sdk.service.ml.ExperimentPermission` class.
 * Added `com.databricks.sdk.service.ml.ExperimentPermissionLevel` class.
 * Added `com.databricks.sdk.service.ml.ExperimentPermissions` class.
 * Added `com.databricks.sdk.service.ml.ExperimentPermissionsDescription` class.
 * Added `com.databricks.sdk.service.ml.ExperimentPermissionsRequest` class.
 * Added `com.databricks.sdk.service.ml.GetExperimentPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.ml.GetExperimentPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.ml.GetExperimentPermissionsRequest` class.
 * Added `com.databricks.sdk.service.ml.GetRegisteredModelPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.ml.GetRegisteredModelPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.ml.GetRegisteredModelPermissionsRequest` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelAccessControlRequest` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelAccessControlResponse` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelPermission` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelPermissionLevel` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelPermissions` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelPermissionsDescription` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelPermissionsRequest` class.
 * Added `scopes` field for `com.databricks.sdk.service.oauth2.CreateCustomAppIntegration`.
 * Added `getPipelinePermissionLevels()` method for `workspaceClient.pipelines()` service.
 * Added `getPipelinePermissions()` method for `workspaceClient.pipelines()` service.
 * Added `setPipelinePermissions()` method for `workspaceClient.pipelines()` service.
 * Added `updatePipelinePermissions()` method for `workspaceClient.pipelines()` service.
 * Added `com.databricks.sdk.service.pipelines.GetPipelinePermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.pipelines.GetPipelinePermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.pipelines.GetPipelinePermissionsRequest` class.
 * Added `com.databricks.sdk.service.pipelines.PipelineAccessControlRequest` class.
 * Added `com.databricks.sdk.service.pipelines.PipelineAccessControlResponse` class.
 * Added `com.databricks.sdk.service.pipelines.PipelinePermission` class.
 * Added `com.databricks.sdk.service.pipelines.PipelinePermissionLevel` class.
 * Added `com.databricks.sdk.service.pipelines.PipelinePermissions` class.
 * Added `com.databricks.sdk.service.pipelines.PipelinePermissionsDescription` class.
 * Added `com.databricks.sdk.service.pipelines.PipelinePermissionsRequest` class.
 * Added `gcpManagedNetworkConfig` field for `com.databricks.sdk.service.provisioning.CreateWorkspaceRequest`.
 * Added `gkeConfig` field for `com.databricks.sdk.service.provisioning.CreateWorkspaceRequest`.
 * Added `getServingEndpointPermissionLevels()` method for `workspaceClient.servingEndpoints()` service.
 * Added `getServingEndpointPermissions()` method for `workspaceClient.servingEndpoints()` service.
 * Added `setServingEndpointPermissions()` method for `workspaceClient.servingEndpoints()` service.
 * Added `updateServingEndpointPermissions()` method for `workspaceClient.servingEndpoints()` service.
 * Added `instanceProfileArn` field for `com.databricks.sdk.service.serving.ServedModelInput`.
 * Added `instanceProfileArn` field for `com.databricks.sdk.service.serving.ServedModelOutput`.
 * Added `com.databricks.sdk.service.serving.GetServingEndpointPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.serving.GetServingEndpointPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.serving.GetServingEndpointPermissionsRequest` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointAccessControlRequest` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointAccessControlResponse` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointPermission` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointPermissionLevel` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointPermissions` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointPermissionsDescription` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointPermissionsRequest` class.
 * Added `getTokenPermissionLevels()` method for `workspaceClient.tokenManagement()` service.
 * Added `getTokenPermissions()` method for `workspaceClient.tokenManagement()` service.
 * Added `setTokenPermissions()` method for `workspaceClient.tokenManagement()` service.
 * Added `updateTokenPermissions()` method for `workspaceClient.tokenManagement()` service.
 * Added `com.databricks.sdk.service.settings.GetTokenPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.settings.TokenAccessControlRequest` class.
 * Added `com.databricks.sdk.service.settings.TokenAccessControlResponse` class.
 * Added `com.databricks.sdk.service.settings.TokenPermission` class.
 * Added `com.databricks.sdk.service.settings.TokenPermissionLevel` class.
 * Added `com.databricks.sdk.service.settings.TokenPermissions` class.
 * Added `com.databricks.sdk.service.settings.TokenPermissionsDescription` class.
 * Added `com.databricks.sdk.service.settings.TokenPermissionsRequest` class.
 * Added `getWarehousePermissionLevels()` method for `workspaceClient.warehouses()` service.
 * Added `getWarehousePermissions()` method for `workspaceClient.warehouses()` service.
 * Added `setWarehousePermissions()` method for `workspaceClient.warehouses()` service.
 * Added `updateWarehousePermissions()` method for `workspaceClient.warehouses()` service.
 * Added `canSubscribeToLiveQuery` field for `com.databricks.sdk.service.sql.QueryInfo`.
 * Removed `queuedOverloadTimeMs` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Removed `queuedProvisioningTimeMs` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Removed `totalFilesCount` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Removed `totalPartitionsCount` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `metadataTimeMs` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `overloadingQueueStartTimestamp` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `planningPhases` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `planningTimeMs` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `provisioningQueueStartTimestamp` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `prunedBytes` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `prunedFilesCount` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `queryCompilationStartTimestamp` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `queryExecutionTimeMs` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `com.databricks.sdk.service.sql.GetWarehousePermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.sql.GetWarehousePermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.sql.GetWarehousePermissionsRequest` class.
 * Added `com.databricks.sdk.service.sql.WarehouseAccessControlRequest` class.
 * Added `com.databricks.sdk.service.sql.WarehouseAccessControlResponse` class.
 * Added `com.databricks.sdk.service.sql.WarehousePermission` class.
 * Added `com.databricks.sdk.service.sql.WarehousePermissionLevel` class.
 * Added `com.databricks.sdk.service.sql.WarehousePermissions` class.
 * Added `com.databricks.sdk.service.sql.WarehousePermissionsDescription` class.
 * Added `com.databricks.sdk.service.sql.WarehousePermissionsRequest` class.
 * Added `getRepoPermissionLevels()` method for `workspaceClient.repos()` service.
 * Added `getRepoPermissions()` method for `workspaceClient.repos()` service.
 * Added `setRepoPermissions()` method for `workspaceClient.repos()` service.
 * Added `updateRepoPermissions()` method for `workspaceClient.repos()` service.
 * Added `getWorkspaceObjectPermissionLevels()` method for `workspaceClient.workspace()` service.
 * Added `getWorkspaceObjectPermissions()` method for `workspaceClient.workspace()` service.
 * Added `setWorkspaceObjectPermissions()` method for `workspaceClient.workspace()` service.
 * Added `updateWorkspaceObjectPermissions()` method for `workspaceClient.workspace()` service.
 * Added `com.databricks.sdk.service.workspace.GetRepoPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.workspace.GetRepoPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.workspace.GetRepoPermissionsRequest` class.
 * Added `com.databricks.sdk.service.workspace.GetWorkspaceObjectPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.workspace.GetWorkspaceObjectPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.workspace.GetWorkspaceObjectPermissionsRequest` class.
 * Added `com.databricks.sdk.service.workspace.RepoAccessControlRequest` class.
 * Added `com.databricks.sdk.service.workspace.RepoAccessControlResponse` class.
 * Added `com.databricks.sdk.service.workspace.RepoPermission` class.
 * Added `com.databricks.sdk.service.workspace.RepoPermissionLevel` class.
 * Added `com.databricks.sdk.service.workspace.RepoPermissions` class.
 * Added `com.databricks.sdk.service.workspace.RepoPermissionsDescription` class.
 * Added `com.databricks.sdk.service.workspace.RepoPermissionsRequest` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectAccessControlRequest` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectAccessControlResponse` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectPermission` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectPermissionLevel` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectPermissions` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectPermissionsDescription` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectPermissionsRequest` class.

OpenAPI SHA: 386b65ecdc825b9c3ed4aa7ca88e2e5baf9d87df, Date: 2023-08-07


## 0.3.0

* Handled nested query parameters in ApiClient.withQuery ([#125](https://github.com/databricks/databricks-sdk-java/pull/125)). This fixes issues with filters when listing query history.

API Changes:

 * Changed `create()` method for `accountClient.metastoreAssignments()` service to no longer return `com.databricks.sdk.service.catalog.CreateMetastoreAssignmentsResponseItemList` class.
 * Added `connectionName` field for `com.databricks.sdk.service.catalog.CreateCatalog`.
 * Added `accessPoint` field for `com.databricks.sdk.service.catalog.CreateExternalLocation`.
 * Added `encryptionDetails` field for `com.databricks.sdk.service.catalog.CreateExternalLocation`.
 * Removed `com.databricks.sdk.service.catalog.CreateMetastoreAssignmentsResponseItem` class.
 * Added `accessPoint` field for `com.databricks.sdk.service.catalog.ExternalLocationInfo`.
 * Added `encryptionDetails` field for `com.databricks.sdk.service.catalog.ExternalLocationInfo`.
 * Added `accessPoint` field for `com.databricks.sdk.service.catalog.TableInfo`.
 * Added `encryptionDetails` field for `com.databricks.sdk.service.catalog.TableInfo`.
 * Added `accessPoint` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
 * Added `encryptionDetails` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
 * Added `accessPoint` field for `com.databricks.sdk.service.catalog.VolumeInfo`.
 * Added `encryptionDetails` field for `com.databricks.sdk.service.catalog.VolumeInfo`.
 * Added `com.databricks.sdk.service.catalog.EncryptionDetails` class.
 * Added `com.databricks.sdk.service.catalog.SseEncryptionDetails` class.
 * Added `com.databricks.sdk.service.catalog.SseEncryptionDetailsAlgorithm` class.
 * Added `accountClient.networkPolicy()` service.
 * Added `com.databricks.sdk.service.settings.AccountNetworkPolicyMessage` class.
 * Added `com.databricks.sdk.service.settings.DeleteAccountNetworkPolicyRequest` class.
 * Added `com.databricks.sdk.service.settings.DeleteAccountNetworkPolicyResponse` class.
 * Added `com.databricks.sdk.service.settings.ReadAccountNetworkPolicyRequest` class.
 * Added `com.databricks.sdk.service.settings.UpdateAccountNetworkPolicyRequest` class.

OpenAPI SHA: fbdd0fa3e83fed2c798a58d376529bdb1285b915, Date: 2023-07-26


## 0.2.0

* Synchronize auth permutation tests with Go SDK ([#108](https://github.com/databricks/databricks-sdk-java/pull/108)).
* Regenerated from OpenAPI spec ([#112](https://github.com/databricks/databricks-sdk-java/pull/112)).
* Add issue template ([#113](https://github.com/databricks/databricks-sdk-java/pull/113)).
* Add accounts-dod support in the Java SDK ([#114](https://github.com/databricks/databricks-sdk-java/pull/114)).
* Regenerate Java SDK using recent OpenAPI Specification ([#115](https://github.com/databricks/databricks-sdk-java/pull/115)).
* Rerun OpenAPI Generator ([#117](https://github.com/databricks/databricks-sdk-java/pull/117)).
* Integrate with auto-release toolchain ([#118](https://github.com/databricks/databricks-sdk-java/pull/118)).
* Updated CLI token source `parseExpiry` method to account for different time format ([#116](https://github.com/databricks/databricks-sdk-java/pull/116)).
* Added support for using new `databricks` CLI with backwards compatibility check ([#121](https://github.com/databricks/databricks-sdk-java/pull/121)).

API Changes:

 * Changed `create()` method for `accountClient.metastoreAssignments()` service . New request type is `com.databricks.sdk.service.catalog.AccountsCreateMetastoreAssignment` class.
 * Changed `create()` method for `accountClient.metastoreAssignments()` service to return `com.databricks.sdk.service.catalog.CreateMetastoreAssignmentsResponseItemList` class.
 * Changed `get()` method for `accountClient.metastoreAssignments()` service to return `com.databricks.sdk.service.catalog.AccountsMetastoreAssignment` class.
 * Changed `update()` method for `accountClient.metastoreAssignments()` service . New request type is `com.databricks.sdk.service.catalog.AccountsUpdateMetastoreAssignment` class.
 * Changed `update()` method for `accountClient.metastoreAssignments()` service to no longer return `com.databricks.sdk.service.catalog.MetastoreAssignment` class.
 * Changed `create()` method for `accountClient.metastores()` service . New request type is `com.databricks.sdk.service.catalog.AccountsCreateMetastore` class.
 * Changed `create()` method for `accountClient.metastores()` service to return `com.databricks.sdk.service.catalog.AccountsMetastoreInfo` class.
 * Changed `get()` method for `accountClient.metastores()` service to return `com.databricks.sdk.service.catalog.AccountsMetastoreInfo` class.
 * Changed `update()` method for `accountClient.metastores()` service . New request type is `com.databricks.sdk.service.catalog.AccountsUpdateMetastore` class.
 * Changed `update()` method for `accountClient.metastores()` service to return `com.databricks.sdk.service.catalog.AccountsMetastoreInfo` class.
 * Changed `create()` method for `accountClient.storageCredentials()` service . New request type is `com.databricks.sdk.service.catalog.AccountsCreateStorageCredential` class.
 * Changed `update()` method for `accountClient.storageCredentials()` service . New request type is `com.databricks.sdk.service.catalog.AccountsUpdateStorageCredential` class.
 * Removed `maintenance()` method for `workspaceClient.metastores()` service.
 * Added `enableOptimization()` method for `workspaceClient.metastores()` service.
 * Added `update()` method for `workspaceClient.tables()` service.
 * Changed `get()` method for `workspaceClient.workspaceBindings()` service to return `com.databricks.sdk.service.catalog.CurrentWorkspaceBindings` class.
 * Changed `update()` method for `workspaceClient.workspaceBindings()` service to return `com.databricks.sdk.service.catalog.CurrentWorkspaceBindings` class.
 * Added `workspaceClient.connections()` service.
 * Added `workspaceClient.systemSchemas()` service.
 * Added `connectionName` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Added `options` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Removed `gcpServiceAccountKey` field for `com.databricks.sdk.service.catalog.CreateStorageCredential`.
 * Removed `metastoreId` field for `com.databricks.sdk.service.catalog.CreateStorageCredential`.
 * Added `azureManagedIdentity` field for `com.databricks.sdk.service.catalog.CreateStorageCredential`.
 * Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.CreateStorageCredential`.
 * Added `force` field for `com.databricks.sdk.service.catalog.DeleteAccountMetastoreRequest`.
 * Added `force` field for `com.databricks.sdk.service.catalog.DeleteAccountStorageCredentialRequest`.
 * Removed `com.databricks.sdk.service.catalog.GcpServiceAccountKey` class.
 * Removed `schemas` field for `com.databricks.sdk.service.catalog.ListFunctionsResponse`.
 * Added `functions` field for `com.databricks.sdk.service.catalog.ListFunctionsResponse`.
 * Removed `gcpServiceAccountKey` field for `com.databricks.sdk.service.catalog.StorageCredentialInfo`.
 * Added `azureManagedIdentity` field for `com.databricks.sdk.service.catalog.StorageCredentialInfo`.
 * Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.StorageCredentialInfo`.
 * Removed `com.databricks.sdk.service.catalog.UpdateAutoMaintenance` class.
 * Removed `com.databricks.sdk.service.catalog.UpdateAutoMaintenanceResponse` class.
 * Removed `metastoreId` field for `com.databricks.sdk.service.catalog.UpdateMetastore`.
 * Removed `gcpServiceAccountKey` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Removed `metastoreId` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Added `azureManagedIdentity` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Changed `assignWorkspaces` field for `com.databricks.sdk.service.catalog.UpdateWorkspaceBindings` to `com.databricks.sdk.service.catalog.List` class.
 * Changed `unassignWorkspaces` field for `com.databricks.sdk.service.catalog.UpdateWorkspaceBindings` to `com.databricks.sdk.service.catalog.List` class.
 * Removed `gcpServiceAccountKey` field for `com.databricks.sdk.service.catalog.ValidateStorageCredential`.
 * Added `azureManagedIdentity` field for `com.databricks.sdk.service.catalog.ValidateStorageCredential`.
 * Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.ValidateStorageCredential`.
 * Removed `com.databricks.sdk.service.catalog.WorkspaceId` class.
 * Added `com.databricks.sdk.service.catalog.AccountsCreateMetastore` class.
 * Added `com.databricks.sdk.service.catalog.AccountsCreateMetastoreAssignment` class.
 * Added `com.databricks.sdk.service.catalog.AccountsCreateStorageCredential` class.
 * Added `com.databricks.sdk.service.catalog.AccountsMetastoreAssignment` class.
 * Added `com.databricks.sdk.service.catalog.AccountsMetastoreInfo` class.
 * Added `com.databricks.sdk.service.catalog.AccountsUpdateMetastore` class.
 * Added `com.databricks.sdk.service.catalog.AccountsUpdateMetastoreAssignment` class.
 * Added `com.databricks.sdk.service.catalog.AccountsUpdateStorageCredential` class.
 * Added `com.databricks.sdk.service.catalog.AzureManagedIdentity` class.
 * Added `com.databricks.sdk.service.catalog.ConnectionInfo` class.
 * Added `com.databricks.sdk.service.catalog.ConnectionType` class.
 * Added `com.databricks.sdk.service.catalog.CreateConnection` class.
 * Added `com.databricks.sdk.service.catalog.CreateMetastoreAssignmentsResponseItem` class.
 * Added `com.databricks.sdk.service.catalog.CredentialType` class.
 * Added `com.databricks.sdk.service.catalog.CurrentWorkspaceBindings` class.
 * Added `com.databricks.sdk.service.catalog.DatabricksGcpServiceAccountResponse` class.
 * Added `com.databricks.sdk.service.catalog.DeleteConnectionRequest` class.
 * Added `com.databricks.sdk.service.catalog.DisableRequest` class.
 * Added `com.databricks.sdk.service.catalog.DisableSchemaName` class.
 * Added `com.databricks.sdk.service.catalog.EnableRequest` class.
 * Added `com.databricks.sdk.service.catalog.EnableSchemaName` class.
 * Added `com.databricks.sdk.service.catalog.GetConnectionRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListConnectionsResponse` class.
 * Added `com.databricks.sdk.service.catalog.ListSystemSchemasRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListSystemSchemasResponse` class.
 * Added `com.databricks.sdk.service.catalog.PropertiesKvPairs` class.
 * Added `com.databricks.sdk.service.catalog.SecurableOptionsMap` class.
 * Added `com.databricks.sdk.service.catalog.SystemSchemaInfo` class.
 * Added `com.databricks.sdk.service.catalog.SystemSchemaInfoState` class.
 * Added `com.databricks.sdk.service.catalog.UpdateConnection` class.
 * Added `com.databricks.sdk.service.catalog.UpdatePredictiveOptimization` class.
 * Added `com.databricks.sdk.service.catalog.UpdatePredictiveOptimizationResponse` class.
 * Added `com.databricks.sdk.service.catalog.UpdateTableRequest` class.
 * Changed `get()` method for `workspaceClient.clusters()` service to return `com.databricks.sdk.service.compute.ClusterDetails` class.
 * Removed `com.databricks.sdk.service.compute.BaseClusterInfo` class.
 * Added `dataSecurityMode` field for `com.databricks.sdk.service.compute.ClusterAttributes`.
 * Added `dockerImage` field for `com.databricks.sdk.service.compute.ClusterAttributes`.
 * Added `singleUserName` field for `com.databricks.sdk.service.compute.ClusterAttributes`.
 * Removed `com.databricks.sdk.service.compute.ClusterInfo` class.
 * Added `gcpAttributes` field for `com.databricks.sdk.service.compute.CreateInstancePool`.
 * Added `dataSecurityMode` field for `com.databricks.sdk.service.compute.EditCluster`.
 * Added `dockerImage` field for `com.databricks.sdk.service.compute.EditCluster`.
 * Added `singleUserName` field for `com.databricks.sdk.service.compute.EditCluster`.
 * Added `gcpAttributes` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Added `localSsdCount` field for `com.databricks.sdk.service.compute.GcpAttributes`.
 * Added `gcpAttributes` field for `com.databricks.sdk.service.compute.GetInstancePool`.
 * Added `gcpAttributes` field for `com.databricks.sdk.service.compute.InstancePoolAndStats`.
 * Changed `clusters` field for `com.databricks.sdk.service.compute.ListClustersResponse` to `com.databricks.sdk.service.compute.ClusterDetailsList` class.
 * Added `com.databricks.sdk.service.compute.ClusterDetails` class.
 * Added `com.databricks.sdk.service.compute.ClusterSpec` class.
 * Added `com.databricks.sdk.service.compute.ComputeSpec` class.
 * Added `com.databricks.sdk.service.compute.ComputeSpecKind` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolGcpAttributes` class.
 * Added `accountClient.accessControl()` service.
 * Added `workspaceClient.accessControlProxy()` service.
 * Added `meta` field for `com.databricks.sdk.service.iam.Group`.
 * Added `schema` field for `com.databricks.sdk.service.iam.PartialUpdate`.
 * Added `com.databricks.sdk.service.iam.GetAssignableRolesForResourceRequest` class.
 * Added `com.databricks.sdk.service.iam.GetAssignableRolesForResourceResponse` class.
 * Added `com.databricks.sdk.service.iam.GetRuleSetRequest` class.
 * Added `com.databricks.sdk.service.iam.GrantRule` class.
 * Added `com.databricks.sdk.service.iam.PatchSchema` class.
 * Added `com.databricks.sdk.service.iam.Principal` class.
 * Added `com.databricks.sdk.service.iam.ResourceMeta` class.
 * Added `com.databricks.sdk.service.iam.RuleSetResponse` class.
 * Added `com.databricks.sdk.service.iam.RuleSetUpdateRequest` class.
 * Added `com.databricks.sdk.service.iam.UpdateRuleSetRequest` class.
 * Added `jobParameters` field for `com.databricks.sdk.service.jobs.BaseRun`.
 * Added `triggerInfo` field for `com.databricks.sdk.service.jobs.BaseRun`.
 * Changed `newCluster` field for `com.databricks.sdk.service.jobs.ClusterSpec` to `com.databricks.sdk.service.compute.ClusterSpec` class.
 * Changed `pauseStatus` field for `com.databricks.sdk.service.jobs.Continuous` to `com.databricks.sdk.service.jobs.PauseStatus` class.
 * Removed `com.databricks.sdk.service.jobs.ContinuousPauseStatus` class.
 * Changed `format` field for `com.databricks.sdk.service.jobs.CreateJob` to `com.databricks.sdk.service.jobs.Format` class.
 * Changed `tasks` field for `com.databricks.sdk.service.jobs.CreateJob` to `com.databricks.sdk.service.jobs.TaskList` class.
 * Changed `webhookNotifications` field for `com.databricks.sdk.service.jobs.CreateJob` to `com.databricks.sdk.service.jobs.WebhookNotifications` class.
 * Added `compute` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `health` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `parameters` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `runAs` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Removed `com.databricks.sdk.service.jobs.CreateJobFormat` class.
 * Changed `pauseStatus` field for `com.databricks.sdk.service.jobs.CronSchedule` to `com.databricks.sdk.service.jobs.PauseStatus` class.
 * Removed `com.databricks.sdk.service.jobs.CronSchedulePauseStatus` class.
 * Removed `com.databricks.sdk.service.jobs.FileArrivalTriggerSettings` class.
 * Changed `gitProvider` field for `com.databricks.sdk.service.jobs.GitSource` to `com.databricks.sdk.service.jobs.GitProvider` class.
 * Added `jobSource` field for `com.databricks.sdk.service.jobs.GitSource`.
 * Removed `com.databricks.sdk.service.jobs.GitSourceGitProvider` class.
 * Changed `newCluster` field for `com.databricks.sdk.service.jobs.JobCluster` to `com.databricks.sdk.service.compute.ClusterSpec` class.
 * Added `onDurationWarningThresholdExceeded` field for `com.databricks.sdk.service.jobs.JobEmailNotifications`.
 * Changed `format` field for `com.databricks.sdk.service.jobs.JobSettings` to `com.databricks.sdk.service.jobs.Format` class.
 * Changed `tasks` field for `com.databricks.sdk.service.jobs.JobSettings` to `com.databricks.sdk.service.jobs.TaskList` class.
 * Changed `webhookNotifications` field for `com.databricks.sdk.service.jobs.JobSettings` to `com.databricks.sdk.service.jobs.WebhookNotifications` class.
 * Added `compute` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `health` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `parameters` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `runAs` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Removed `com.databricks.sdk.service.jobs.JobSettingsFormat` class.
 * Removed `com.databricks.sdk.service.jobs.JobTaskSettings` class.
 * Removed `com.databricks.sdk.service.jobs.JobWebhookNotifications` class.
 * Removed `com.databricks.sdk.service.jobs.JobWebhookNotificationsOnFailureItem` class.
 * Removed `com.databricks.sdk.service.jobs.JobWebhookNotificationsOnStartItem` class.
 * Removed `com.databricks.sdk.service.jobs.JobWebhookNotificationsOnSuccessItem` class.
 * Added `pageToken` field for `com.databricks.sdk.service.jobs.ListJobsRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.jobs.ListJobsResponse`.
 * Added `prevPageToken` field for `com.databricks.sdk.service.jobs.ListJobsResponse`.
 * Added `pageToken` field for `com.databricks.sdk.service.jobs.ListRunsRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.jobs.ListRunsResponse`.
 * Added `prevPageToken` field for `com.databricks.sdk.service.jobs.ListRunsResponse`.
 * Changed `source` field for `com.databricks.sdk.service.jobs.NotebookTask` to `com.databricks.sdk.service.jobs.Source` class.
 * Removed `com.databricks.sdk.service.jobs.NotebookTaskSource` class.
 * Added `rerunDependentTasks` field for `com.databricks.sdk.service.jobs.RepairRun`.
 * Added `jobParameters` field for `com.databricks.sdk.service.jobs.Run`.
 * Added `triggerInfo` field for `com.databricks.sdk.service.jobs.Run`.
 * Added `jobParameters` field for `com.databricks.sdk.service.jobs.RunNow`.
 * Added `conditionTask` field for `com.databricks.sdk.service.jobs.RunOutput`.
 * Added `runJobOutput` field for `com.databricks.sdk.service.jobs.RunOutput`.
 * Removed `com.databricks.sdk.service.jobs.RunSubmitTaskSettings` class.
 * Changed `dependsOn` field for `com.databricks.sdk.service.jobs.RunTask` to `com.databricks.sdk.service.jobs.TaskDependencyList` class.
 * Changed `newCluster` field for `com.databricks.sdk.service.jobs.RunTask` to `com.databricks.sdk.service.compute.ClusterSpec` class.
 * Added `conditionTask` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Added `resolvedValues` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Added `runIf` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Added `runJobTask` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Changed `source` field for `com.databricks.sdk.service.jobs.SparkPythonTask` to `com.databricks.sdk.service.jobs.Source` class.
 * Removed `com.databricks.sdk.service.jobs.SparkPythonTaskSource` class.
 * Changed `widgets` field for `com.databricks.sdk.service.jobs.SqlDashboardOutput` to `com.databricks.sdk.service.jobs.SqlDashboardWidgetOutputList` class.
 * Changed `tasks` field for `com.databricks.sdk.service.jobs.SubmitRun` to `com.databricks.sdk.service.jobs.SubmitTaskList` class.
 * Changed `webhookNotifications` field for `com.databricks.sdk.service.jobs.SubmitRun` to `com.databricks.sdk.service.jobs.WebhookNotifications` class.
 * Added `emailNotifications` field for `com.databricks.sdk.service.jobs.SubmitRun`.
 * Added `health` field for `com.databricks.sdk.service.jobs.SubmitRun`.
 * Removed `com.databricks.sdk.service.jobs.TaskDependenciesItem` class.
 * Added `onDurationWarningThresholdExceeded` field for `com.databricks.sdk.service.jobs.TaskEmailNotifications`.
 * Changed `fileArrival` field for `com.databricks.sdk.service.jobs.TriggerSettings` to `com.databricks.sdk.service.jobs.FileArrivalTriggerConfiguration` class.
 * Changed `pauseStatus` field for `com.databricks.sdk.service.jobs.TriggerSettings` to `com.databricks.sdk.service.jobs.PauseStatus` class.
 * Removed `com.databricks.sdk.service.jobs.TriggerSettingsPauseStatus` class.
 * Added `com.databricks.sdk.service.jobs.ConditionTask` class.
 * Added `com.databricks.sdk.service.jobs.ConditionTaskOp` class.
 * Added `com.databricks.sdk.service.jobs.FileArrivalTriggerConfiguration` class.
 * Added `com.databricks.sdk.service.jobs.Format` class.
 * Added `com.databricks.sdk.service.jobs.GitProvider` class.
 * Added `com.databricks.sdk.service.jobs.JobCompute` class.
 * Added `com.databricks.sdk.service.jobs.JobParameter` class.
 * Added `com.databricks.sdk.service.jobs.JobParameterDefinition` class.
 * Added `com.databricks.sdk.service.jobs.JobRunAs` class.
 * Added `com.databricks.sdk.service.jobs.JobSource` class.
 * Added `com.databricks.sdk.service.jobs.JobSourceDirtyState` class.
 * Added `com.databricks.sdk.service.jobs.JobsHealthMetric` class.
 * Added `com.databricks.sdk.service.jobs.JobsHealthOperator` class.
 * Added `com.databricks.sdk.service.jobs.JobsHealthRule` class.
 * Added `com.databricks.sdk.service.jobs.JobsHealthRules` class.
 * Added `com.databricks.sdk.service.jobs.ParamPairs` class.
 * Added `com.databricks.sdk.service.jobs.PauseStatus` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedConditionTaskValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedDbtTaskValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedNotebookTaskValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedParamPairValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedPythonWheelTaskValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedRunJobTaskValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedStringParamsValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedValues` class.
 * Added `com.databricks.sdk.service.jobs.RunConditionTask` class.
 * Added `com.databricks.sdk.service.jobs.RunConditionTaskOp` class.
 * Added `com.databricks.sdk.service.jobs.RunIf` class.
 * Added `com.databricks.sdk.service.jobs.RunJobOutput` class.
 * Added `com.databricks.sdk.service.jobs.RunJobTask` class.
 * Added `com.databricks.sdk.service.jobs.Source` class.
 * Added `com.databricks.sdk.service.jobs.SubmitTask` class.
 * Added `com.databricks.sdk.service.jobs.Task` class.
 * Added `com.databricks.sdk.service.jobs.TaskDependency` class.
 * Added `com.databricks.sdk.service.jobs.TriggerInfo` class.
 * Added `com.databricks.sdk.service.jobs.Webhook` class.
 * Added `com.databricks.sdk.service.jobs.WebhookNotifications` class.
 * Added `com.databricks.sdk.service.jobs.WebhookNotificationsOnDurationWarningThresholdExceededItem` class.
 * Removed `registeredModel` field for `com.databricks.sdk.service.ml.GetModelResponse`.
 * Added `registeredModelDatabricks` field for `com.databricks.sdk.service.ml.GetModelResponse`.
 * Removed `whl` field for `com.databricks.sdk.service.pipelines.PipelineLibrary`.
 * Added `environmentVars` field for `com.databricks.sdk.service.serving.ServedModelInput`.
 * Added `environmentVars` field for `com.databricks.sdk.service.serving.ServedModelOutput`.
 * Added `accountClient.settings()` service.
 * Added `com.databricks.sdk.service.settings.DeletePersonalComputeSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.DeletePersonalComputeSettingResponse` class.
 * Added `com.databricks.sdk.service.settings.PersonalComputeMessage` class.
 * Added `com.databricks.sdk.service.settings.PersonalComputeMessageEnum` class.
 * Added `com.databricks.sdk.service.settings.PersonalComputeSetting` class.
 * Added `com.databricks.sdk.service.settings.ReadPersonalComputeSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.UpdatePersonalComputeSettingRequest` class.
 * Added `workspaceClient.cleanRooms()` service.
 * Added `historyDataSharingStatus` field for `com.databricks.sdk.service.sharing.SharedDataObject`.
 * Added `com.databricks.sdk.service.sharing.CentralCleanRoomInfo` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomAssetInfo` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomCatalog` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomCatalogUpdate` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomCollaboratorInfo` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomInfo` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomNotebookInfo` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomTableInfo` class.
 * Added `com.databricks.sdk.service.sharing.ColumnInfo` class.
 * Added `com.databricks.sdk.service.sharing.ColumnMask` class.
 * Added `com.databricks.sdk.service.sharing.ColumnTypeName` class.
 * Added `com.databricks.sdk.service.sharing.CreateCleanRoom` class.
 * Added `com.databricks.sdk.service.sharing.DeleteCleanRoomRequest` class.
 * Added `com.databricks.sdk.service.sharing.GetCleanRoomRequest` class.
 * Added `com.databricks.sdk.service.sharing.ListCleanRoomsResponse` class.
 * Added `com.databricks.sdk.service.sharing.SharedDataObjectHistoryDataSharingStatus` class.
 * Added `com.databricks.sdk.service.sharing.UpdateCleanRoom` class.
 * Changed `query` field for `com.databricks.sdk.service.sql.Alert` to `com.databricks.sdk.service.sql.AlertQuery` class.
 * Changed `value` field for `com.databricks.sdk.service.sql.AlertOptions` to `Object` class.
 * Removed `isDbAdmin` field for `com.databricks.sdk.service.sql.User`.
 * Removed `profileImageUrl` field for `com.databricks.sdk.service.sql.User`.
 * Added `com.databricks.sdk.service.sql.AlertQuery` class.
 * Removed `keyvaultMetadata` field for `com.databricks.sdk.service.workspace.CreateScope`.
 * Added `backendAzureKeyvault` field for `com.databricks.sdk.service.workspace.CreateScope`.
 * Changed `format` field for `com.databricks.sdk.service.workspace.Import` to `com.databricks.sdk.service.workspace.ImportFormat` class.
 * Added `com.databricks.sdk.service.workspace.ImportFormat` class.

OpenAPI SHA: 0a1949ba96f71680dad30e06973eaae85b1307bb, Date: 2023-07-18

Dependency updates:

 * Bump commons-io from 2.12.0 to 2.13.0 ([#105](https://github.com/databricks/databricks-sdk-java/pull/105)).
 * Bump jackson.version from 2.15.1 to 2.15.2 ([#101](https://github.com/databricks/databricks-sdk-java/pull/101)).
 * Bump maven-failsafe-plugin from 3.1.0 to 3.1.2 ([#103](https://github.com/databricks/databricks-sdk-java/pull/103)).

## 0.1.1

 * Usable version
