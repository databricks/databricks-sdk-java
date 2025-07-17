# NEXT CHANGELOG

## Release v0.56.0

### New Features and Improvements

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
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