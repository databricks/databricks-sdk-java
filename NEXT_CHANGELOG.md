# NEXT CHANGELOG

## Release v0.71.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `createSpace()` and `updateSpace()` methods for `workspaceClient.genie()` service.
* Add `batchCreateMaterializedFeatures()` method for `workspaceClient.featureEngineering()` service.
* Add `retrieveUserVisibleMetrics()` method for `workspaceClient.vectorSearchEndpoints()` service.
* Add `includeSerializedSpace` field for `com.databricks.sdk.service.dashboards.GenieGetSpaceRequest`.
* Add `purpose` field for `com.databricks.sdk.service.dashboards.TextAttachment`.
* Add `budgetPolicyId` field for `com.databricks.sdk.service.database.NewPipelineSpec`.
* Add `lineageContext` field for `com.databricks.sdk.service.ml.Feature`.
* Add `connectionParameters` field for `com.databricks.sdk.service.pipelines.IngestionGatewayPipelineDefinition`.
* Add `ingestFromUcForeignCatalog` field for `com.databricks.sdk.service.pipelines.IngestionPipelineDefinition`.
* Add `rewindSpec` field for `com.databricks.sdk.service.pipelines.StartUpdate`.
* Add `typeText` field for `com.databricks.sdk.service.vectorsearch.ColumnInfo`.
* Add `AUTOSCALE_V2` enum value for `com.databricks.sdk.service.compute.EventDetailsCause`.
* Add `UNSUPPORTED_CONVERSATION_TYPE_EXCEPTION` enum value for `com.databricks.sdk.service.dashboards.MessageErrorType`.
* Add `FOREIGN_CATALOG` enum value for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* Add `CREATING` and `CREATE_FAILED` enum values for `com.databricks.sdk.service.settings.CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePrivateLinkConnectionState`.
* Add `CREATING` and `CREATE_FAILED` enum values for `com.databricks.sdk.service.settings.NccAzurePrivateEndpointRuleConnectionState`.
* Add `RED_STATE` and `YELLOW_STATE` enum values for `com.databricks.sdk.service.vectorsearch.EndpointStatusState`.
* Change `destinations` field for `com.databricks.sdk.service.catalog.AccessRequestDestinations` to no longer be required.
* [Breaking] Change `destinations` field for `com.databricks.sdk.service.catalog.AccessRequestDestinations` to no longer be required.
* Change `tableNames` field for `com.databricks.sdk.service.jobs.TableUpdateTriggerConfiguration` to be required.
* [Breaking] Change `tableNames` field for `com.databricks.sdk.service.jobs.TableUpdateTriggerConfiguration` to be required.
* [Breaking] Change `onlineStoreConfig` field for `com.databricks.sdk.service.ml.MaterializedFeature` to type `com.databricks.sdk.service.ml.OnlineStoreConfig` class.