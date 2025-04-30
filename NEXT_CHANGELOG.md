# NEXT CHANGELOG

## Release v0.48.0

### New Features and Improvements
 * Introduce support for Databricks Workload Identity Federation in GitHub workflows ([423](https://github.com/databricks/databricks-sdk-java/pull/423)).
   See README.md for instructions.
 * [Breaking] Users running their workflows in GitHub Actions, which use Cloud native authentication and also have a `DATABRICKS_CLIENT_ID` and `DATABRICKS_HOST`
   environment variables set may see their authentication start failing due to the order in which the SDK tries different authentication methods.

### Bug Fixes

### Documentation

### Internal Changes

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
