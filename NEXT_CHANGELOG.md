# NEXT CHANGELOG

## Release v0.76.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `fullRefreshWindow` field for `com.databricks.sdk.service.pipelines.IngestionPipelineDefinition`.
* Add `autoFullRefreshPolicy` field for `com.databricks.sdk.service.pipelines.TableSpecificConfig`.
* Add `hosts` field for `com.databricks.sdk.service.postgres.EndpointStatus`.
* Add `ENDPOINT_TYPE_READ_WRITE` and `ENDPOINT_TYPE_READ_ONLY` enum values for `com.databricks.sdk.service.postgres.EndpointType`.
* Add `DELETED` enum value for `com.databricks.sdk.service.vectorsearch.EndpointStatusState`.
* [Breaking] Change `createBranch()`, `createEndpoint()` and `createProject()` methods for `workspaceClient.postgres()` service with new required argument order.
* Change `branchId` field for `com.databricks.sdk.service.postgres.CreateBranchRequest` to no longer be required.
* Change `endpointId` field for `com.databricks.sdk.service.postgres.CreateEndpointRequest` to no longer be required.
* Change `projectId` field for `com.databricks.sdk.service.postgres.CreateProjectRequest` to no longer be required.
* [Breaking] Remove `host`, `lastActiveTime`, `startTime` and `suspendTime` fields for `com.databricks.sdk.service.postgres.EndpointStatus`.
* [Breaking] Remove `computeLastActiveTime` field for `com.databricks.sdk.service.postgres.ProjectStatus`.
* [Breaking] Remove `READ_WRITE` and `READ_ONLY` enum values for `com.databricks.sdk.service.postgres.EndpointType`.
* Add `createDefaultWarehouseOverride()`, `deleteDefaultWarehouseOverride()`, `getDefaultWarehouseOverride()`, `listDefaultWarehouseOverrides()` and `updateDefaultWarehouseOverride()` methods for `workspaceClient.warehouses()` service.
* Add `driverNodeTypeFlexibility` and `workerNodeTypeFlexibility` fields for `com.databricks.sdk.service.compute.ClusterAttributes`.
* Add `driverNodeTypeFlexibility` and `workerNodeTypeFlexibility` fields for `com.databricks.sdk.service.compute.ClusterDetails`.
* Add `driverNodeTypeFlexibility` and `workerNodeTypeFlexibility` fields for `com.databricks.sdk.service.compute.ClusterSpec`.
* Add `driverNodeTypeFlexibility` and `workerNodeTypeFlexibility` fields for `com.databricks.sdk.service.compute.CreateCluster`.
* Add `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.CreateInstancePool`.
* Add `driverNodeTypeFlexibility` and `workerNodeTypeFlexibility` fields for `com.databricks.sdk.service.compute.EditCluster`.
* Add `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.EditInstancePool`.
* Add `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.GetInstancePool`.
* Add `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.InstancePoolAndStats`.
* Add `driverNodeTypeFlexibility` and `workerNodeTypeFlexibility` fields for `com.databricks.sdk.service.compute.UpdateClusterResource`.
* Add `expireTime` and `ttl` fields for `com.databricks.sdk.service.postgres.BranchSpec`.
* Add `expireTime` field for `com.databricks.sdk.service.postgres.BranchStatus`.
* [Breaking] Change `createBranch()`, `createEndpoint()` and `createProject()` methods for `workspaceClient.postgres()` service with new required argument order.
* [Breaking] Change `branchId` field for `com.databricks.sdk.service.postgres.CreateBranchRequest` to be required.
* [Breaking] Change `endpointId` field for `com.databricks.sdk.service.postgres.CreateEndpointRequest` to be required.
* [Breaking] Change `projectId` field for `com.databricks.sdk.service.postgres.CreateProjectRequest` to be required.
* [Breaking] Remove `default` field for `com.databricks.sdk.service.postgres.BranchSpec`.
* [Breaking] Remove `settings` field for `com.databricks.sdk.service.postgres.ProjectSpec`.
* [Breaking] Remove `settings` field for `com.databricks.sdk.service.postgres.ProjectStatus`.
* Add `noExpiry` field for `com.databricks.sdk.service.postgres.BranchSpec`.
* Add `stderr` field for `com.databricks.sdk.service.compute.InitScriptInfoAndExecutionDetails`.
* Add `generateDatabaseCredential()` method for `workspaceClient.postgres()` service.
* Add `getPublicAccountUserPreference()`, `listAccountUserPreferencesMetadata()` and `patchPublicAccountUserPreference()` methods for `accountClient.accountSettingsV2()` service.