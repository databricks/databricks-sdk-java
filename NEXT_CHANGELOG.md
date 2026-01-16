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