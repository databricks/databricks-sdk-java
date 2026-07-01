# NEXT CHANGELOG

## Release v0.123.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

- Added a JDK 17 fallback to `scripts/mvn-spotless-apply.sh` so `spotless:apply` still
  formats when the default JDK is older than 17 (mirroring the `make fmt` behaviour).

### API Changes
* Add `cancelPendingClusterEnforcement()` method for `workspaceClient.policyComplianceForClusters()` service.
* Add `downloadMessageAttachmentVisualization()` method for `workspaceClient.genie()` service.
* Add `bundleRootPath` field for `com.databricks.sdk.service.bundledeployments.WorkspaceInfo`.
* Add `omitPermissionsInResponse` field for `com.databricks.sdk.service.catalog.UpdatePermissions`.
* Add `pendingEnforcement` field for `com.databricks.sdk.service.compute.ClusterCompliance`.
* Add `enforceMode` field for `com.databricks.sdk.service.compute.EnforceClusterComplianceRequest`.
* Add `enforceResult` field for `com.databricks.sdk.service.compute.EnforceClusterComplianceResponse`.
* Add `pendingEnforcement` field for `com.databricks.sdk.service.compute.GetClusterComplianceResponse`.
* Add `viz` field for `com.databricks.sdk.service.dashboards.GenieAttachment`.
* Add `enableVisualization` field for `com.databricks.sdk.service.dashboards.GenieCreateConversationMessageRequest`.
* Add `enableVisualization` field for `com.databricks.sdk.service.dashboards.GenieStartConversationMessageRequest`.
* Add `excludedSchemas` field for `com.databricks.sdk.service.dataclassification.CatalogConfig`.
* Add `etag` field for `com.databricks.sdk.service.disasterrecovery.UpdateFailoverGroupRequest`.
* Add `spec` field for `com.databricks.sdk.service.environments.WorkspaceBaseEnvironment`.
* Add `fullName` field for `com.databricks.sdk.service.iamv2.User`.
* Add `sqlCondition` field for `com.databricks.sdk.service.jobs.CronSchedule`.
* Add `aiRuntimeTask` field for `com.databricks.sdk.service.jobs.ResolvedValues`.
* Add `aiRuntimeTaskOutput` field for `com.databricks.sdk.service.jobs.RunOutput`.
* Add `aiRuntimeTask` field for `com.databricks.sdk.service.jobs.RunTask`.
* Add `aiRuntimeTask` field for `com.databricks.sdk.service.jobs.SubmitTask`.
* Add `aiRuntimeTask` field for `com.databricks.sdk.service.jobs.Task`.
* Add `sqlCondition` field for `com.databricks.sdk.service.jobs.TriggerInfo`.
* Add `sqlCondition` field for `com.databricks.sdk.service.jobs.TriggerSettings`.
* Add `sqlCondition` field for `com.databricks.sdk.service.jobs.TriggerStateProto`.
* Add `firstDistinctN`, `firstN`, `lastDistinctN` and `lastN` fields for `com.databricks.sdk.service.ml.AggregationFunction`.
* Add `replaceExisting` field for `com.databricks.sdk.service.postgres.CreateDatabaseRequest`.
* Add `replaceExisting` field for `com.databricks.sdk.service.postgres.CreateRoleRequest`.
* Add `readOnlyPooledHost` and `readWritePooledHost` fields for `com.databricks.sdk.service.postgres.EndpointHosts`.
* Add `lastActiveTime` field for `com.databricks.sdk.service.postgres.EndpointStatus`.
* Add `expireTime`, `groupName` and `ttl` fields for `com.databricks.sdk.service.postgres.GenerateDatabaseCredentialRequest`.
* Add `autoscalingLimitMaxCu`, `autoscalingLimitMinCu`, `noSuspension` and `suspendTimeoutDuration` fields for `com.databricks.sdk.service.postgres.InitialEndpointSpec`.
* Add `initialBranchSpec` field for `com.databricks.sdk.service.postgres.Project`.
* Add `computeLastActiveTime` field for `com.databricks.sdk.service.postgres.ProjectStatus`.
* Add `telemetryConfig` field for `com.databricks.sdk.service.serving.CreateServingEndpoint`.
* Add `telemetryConfig` field for `com.databricks.sdk.service.serving.ServingEndpoint`.
* Add `telemetryConfig` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
* Add `READ_METADATA` enum value for `com.databricks.sdk.service.catalog.Privilege`.
* Add `DEFERRED_POLICY_ENFORCEMENT_SCHEDULED` and `DEFERRED_POLICY_ENFORCEMENT_FAILED` enum values for `com.databricks.sdk.service.compute.EventType`.
* Change `replicateWorkspaceAssets` field for `com.databricks.sdk.service.disasterrecovery.WorkspaceSet` to no longer be required.
* [Breaking] Change `replicateWorkspaceAssets` field for `com.databricks.sdk.service.disasterrecovery.WorkspaceSet` to no longer be required.
* [Breaking] Remove `name` field for `com.databricks.sdk.service.iamv2.User`.