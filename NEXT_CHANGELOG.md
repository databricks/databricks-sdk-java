# NEXT CHANGELOG

## Release v0.75.0

### New Features and Improvements

* Increase async cache stale period from 3 to 5 minutes to cover the maximum monthly downtime of a 99.99% uptime SLA.

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `TABLE_DELTASHARING_OPEN_DIR_BASED` enum value for `com.databricks.sdk.service.catalog.SecurableKind`.
* Add `CREATING` and `CREATE_FAILED` enum values for `com.databricks.sdk.service.settings.NccPrivateEndpointRulePrivateLinkConnectionState`.
* [Breaking] Remove `accessModes` and `storageLocation` fields for `com.databricks.sdk.service.sharing.Table`.
* Add `errorMessage` field for `com.databricks.sdk.service.settings.CreatePrivateEndpointRule`.
* Add `errorMessage` field for `com.databricks.sdk.service.settings.NccPrivateEndpointRule`.
* Add `errorMessage` field for `com.databricks.sdk.service.settings.UpdatePrivateEndpointRule`.
* Add `RATE_LIMITED` enum value for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Add `RATE_LIMITED` enum value for `com.databricks.sdk.service.sql.TerminationReasonCode`.
* [Breaking] Add long-running operation configuration for `workspaceClient.postgres().deleteBranch()` method.
* [Breaking] Add long-running operation configuration for `workspaceClient.postgres().deleteEndpoint()` method.
* [Breaking] Add long-running operation configuration for `workspaceClient.postgres().deleteProject()` method.
* [Breaking] Change `deleteBranch()`, `deleteEndpoint()` and `deleteProject()` methods for `workspaceClient.postgres()` service to return `com.databricks.sdk.service.postgres.Operation` class.
* [Breaking] Remove `pgbouncerSettings` field for `com.databricks.sdk.service.postgres.EndpointSettings`.
* [Breaking] Remove `poolerMode` field for `com.databricks.sdk.service.postgres.EndpointSpec`.
* [Breaking] Remove `poolerMode` field for `com.databricks.sdk.service.postgres.EndpointStatus`.
* [Breaking] Remove `pgbouncerSettings` field for `com.databricks.sdk.service.postgres.ProjectDefaultEndpointSettings`.
* Add `owner` field for `com.databricks.sdk.service.postgres.ProjectStatus`.
* Add `validityCheckConfigurations` field for `com.databricks.sdk.service.qualitymonitorv2.QualityMonitor`.
* Add `burstScalingEnabled` field for `com.databricks.sdk.service.serving.PtServedModel`.