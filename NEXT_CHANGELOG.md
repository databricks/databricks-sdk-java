# NEXT CHANGELOG

## Release v0.50.0

### New Features and Improvements

### Bug Fixes

### Documentation

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
