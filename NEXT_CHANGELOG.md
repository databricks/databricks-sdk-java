# NEXT CHANGELOG

## Release v0.70.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `batchCreateMaterializedFeatures()` method for `workspaceClient.featureEngineering()` service.
* Add `retrieveUserVisibleMetrics()` method for `workspaceClient.vectorSearchEndpoints()` service.
* Add `purpose` field for `com.databricks.sdk.service.dashboards.TextAttachment`.
* Add `lineageContext` field for `com.databricks.sdk.service.ml.Feature`.
* Add `ingestFromUcForeignCatalog` field for `com.databricks.sdk.service.pipelines.IngestionPipelineDefinition`.
* Add `AUTOSCALE_V2` enum value for `com.databricks.sdk.service.compute.EventDetailsCause`.
* Add `UNSUPPORTED_CONVERSATION_TYPE_EXCEPTION` enum value for `com.databricks.sdk.service.dashboards.MessageErrorType`.
* Add `RED_STATE` and `YELLOW_STATE` enum values for `com.databricks.sdk.service.vectorsearch.EndpointStatusState`.
* [Breaking] Change `tableNames` field for `com.databricks.sdk.service.jobs.TableUpdateTriggerConfiguration` to be required.
* Change `tableNames` field for `com.databricks.sdk.service.jobs.TableUpdateTriggerConfiguration` to be required.
* [Breaking] Change `onlineStoreConfig` field for `com.databricks.sdk.service.ml.MaterializedFeature` to type `com.databricks.sdk.service.ml.OnlineStoreConfig` class.