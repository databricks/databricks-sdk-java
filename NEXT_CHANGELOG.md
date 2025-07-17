# NEXT CHANGELOG

## Release v0.55.0

### New Features and Improvements
* Enabled asynchronous token refreshes by default. A new `disable_async_token_refresh` configuration option has been added to allow disabling this feature if necessary.
  To disable asynchronous token refresh, set the environment variable `DATABRICKS_DISABLE_ASYNC_TOKEN_REFRESH=true` or configure it within your configuration object.
  The previous `DATABRICKS_ENABLE_EXPERIMENTAL_ASYNC_TOKEN_REFRESH` option has been removed as asynchronous refresh is now the default behavior.

### Bug Fixes

### Documentation

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
