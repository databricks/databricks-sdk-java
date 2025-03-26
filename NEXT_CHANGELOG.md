# NEXT CHANGELOG

## Release v0.43.0

### New Features and Improvements

### Bug Fixes

### Documentation

### Internal Changes

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
