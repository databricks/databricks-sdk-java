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
