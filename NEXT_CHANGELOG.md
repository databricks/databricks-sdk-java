# NEXT CHANGELOG

## Release v0.74.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `gitRepository` field for `com.databricks.sdk.service.apps.App`.
* Add `gitSource` field for `com.databricks.sdk.service.apps.AppDeployment`.
* Add `experimentSpec` field for `com.databricks.sdk.service.apps.AppManifestAppResourceSpec`.
* Add `experiment` field for `com.databricks.sdk.service.apps.AppResource`.
* Add `gitRepository` field for `com.databricks.sdk.service.apps.AppUpdate`.
* Add `excludedTableFullNames` field for `com.databricks.sdk.service.dataquality.AnomalyDetectionConfig`.
* Add `groupName` field for `com.databricks.sdk.service.jobs.JobRunAs`.
* Add `rowFilter` field for `com.databricks.sdk.service.pipelines.TableSpecificConfig`.
* Add `spec` and `status` fields for `com.databricks.sdk.service.postgres.Branch`.
* Add `spec` and `status` fields for `com.databricks.sdk.service.postgres.Endpoint`.
* Add `spec` and `status` fields for `com.databricks.sdk.service.postgres.Project`.
* Add `excludedTableFullNames` field for `com.databricks.sdk.service.qualitymonitorv2.AnomalyDetectionConfig`.
* Add `EXECUTE` and `USE_CONNECTION` enum values for `com.databricks.sdk.service.apps.AppManifestAppResourceUcSecurableSpecUcSecurablePermission`.
* Add `FUNCTION` and `CONNECTION` enum values for `com.databricks.sdk.service.apps.AppManifestAppResourceUcSecurableSpecUcSecurableType`.
* Add `SELECT`, `EXECUTE` and `USE_CONNECTION` enum values for `com.databricks.sdk.service.apps.AppResourceUcSecurableUcSecurablePermission`.
* Add `TABLE`, `FUNCTION` and `CONNECTION` enum values for `com.databricks.sdk.service.apps.AppResourceUcSecurableUcSecurableType`.
* [Breaking] Remove `currentState`, `default`, `effectiveDefault`, `effectiveIsProtected`, `effectiveSourceBranch`, `effectiveSourceBranchLsn`, `effectiveSourceBranchTime`, `isProtected`, `logicalSizeBytes`, `pendingState`, `sourceBranch`, `sourceBranchLsn`, `sourceBranchTime` and `stateChangeTime` fields for `com.databricks.sdk.service.postgres.Branch`.
* [Breaking] Remove `autoscalingLimitMaxCu`, `autoscalingLimitMinCu`, `currentState`, `disabled`, `effectiveAutoscalingLimitMaxCu`, `effectiveAutoscalingLimitMinCu`, `effectiveDisabled`, `effectivePoolerMode`, `effectiveSettings`, `effectiveSuspendTimeoutDuration`, `endpointType`, `host`, `lastActiveTime`, `pendingState`, `poolerMode`, `settings`, `startTime`, `suspendTime` and `suspendTimeoutDuration` fields for `com.databricks.sdk.service.postgres.Endpoint`.
* [Breaking] Remove `branchLogicalSizeLimitBytes`, `computeLastActiveTime`, `defaultEndpointSettings`, `displayName`, `effectiveDefaultEndpointSettings`, `effectiveDisplayName`, `effectiveHistoryRetentionDuration`, `effectivePgVersion`, `effectiveSettings`, `historyRetentionDuration`, `pgVersion`, `settings` and `syntheticStorageSizeBytes` fields for `com.databricks.sdk.service.postgres.Project`.
* Add `createRole()`, `deleteRole()`, `getRole()` and `listRoles()` methods for `workspaceClient.postgres()` service.
* Add `destinationSourceSecurable` field for `com.databricks.sdk.service.catalog.AccessRequestDestinations`.
* Add `accessModes` and `storageLocation` fields for `com.databricks.sdk.service.sharing.Table`.
* Add `command` and `envVars` fields for `com.databricks.sdk.service.apps.AppDeployment`.
* Add `fullName` and `securableType` fields for `com.databricks.sdk.service.catalog.AccessRequestDestinations`.
* [Breaking] Change `deleteKafkaConfig()` method for `workspaceClient.featureEngineering()` service . Method path has changed.