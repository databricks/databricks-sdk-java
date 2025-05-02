# NEXT CHANGELOG

## Release v0.49.0

### New Features and Improvements

### Bug Fixes
* Fixed the deserialization of responses in VectorSearchAPI's `queryIndex()` method ([#440](https://github.com/databricks/databricks-sdk-java/pull/440)).

### Documentation

### Internal Changes

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
