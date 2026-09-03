# NEXT CHANGELOG

## Release v0.152.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `excludedColumns` and `recordTypeFilter` fields for `com.databricks.sdk.service.ml.Stream`.
* Add `EXTERNAL_USE_LOCATION` enum value for `com.databricks.sdk.service.catalog.Privilege`.
* [Breaking] Remove `planType` field for `com.databricks.sdk.service.catalog.ModelProviderServiceConfigAnthropicProviderRelayedConfig`.
* Add `com.databricks.sdk.service.aifunctions` package.
* Add `workspaceClient.aiFunctions()` service.
* Add `backfillFeatures()`, `cancelOperation()` and `getOperation()` methods for `workspaceClient.featureEngineering()` service.
* Add `provisionedCapacityId` field for `com.databricks.sdk.service.jobs.ComputeSpec`.
* Add `GPU_8X_B300` enum value for `com.databricks.sdk.service.compute.HardwareAcceleratorType`.
* [Breaking] Remove `disabled` field for `com.databricks.sdk.service.catalog.InferenceTableConfig`.
* [Breaking] Remove `owner` field for `com.databricks.sdk.service.catalog.McpService`.
* [Breaking] Remove `owner` field for `com.databricks.sdk.service.catalog.ModelProviderService`.
* [Breaking] Remove `owner` field for `com.databricks.sdk.service.catalog.ModelService`.
* Add `com.databricks.sdk.service.sandbox` package.
* Add `workspaceClient.sandbox()` service.
* Add `latestBackfillOperation` field for `com.databricks.sdk.service.ml.MaterializedFeature`.
* [Breaking] Remove `trafficSplitting` field for `com.databricks.sdk.service.catalog.ModelServiceConfigRoutingConfig`.