# NEXT CHANGELOG

## Release v0.68.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

* Clarify behavior and expectation for method `CredentialsProvider.configure()` to return a new `HeaderFactory` instance on each invocation.

### Internal Changes

### API Changes
* Add `instanceProfileArn` field for `com.databricks.sdk.service.compute.InstancePoolAwsAttributes`.
* Add `continuous`, `sliding` and `tumbling` fields for `com.databricks.sdk.service.ml.TimeWindow`.
* Add `usagePolicyId` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
* Add `usagePolicyId` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
* Add `usagePolicyId` field for `com.databricks.sdk.service.pipelines.PipelineSpec`.
* Add `readFilesBytes` field for `com.databricks.sdk.service.sql.QueryMetrics`.
* Add `SELECT` enum value for `com.databricks.sdk.service.apps.AppManifestAppResourceUcSecurableSpecUcSecurablePermission`.
* Add `TABLE` enum value for `com.databricks.sdk.service.apps.AppManifestAppResourceUcSecurableSpecUcSecurableType`.
* Add `DECOMMISSION_STARTED` and `DECOMMISSION_ENDED` enum values for `com.databricks.sdk.service.compute.EventType`.
* Add `DBR_IMAGE_RESOLUTION_FAILURE` enum value for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Add `DBR_IMAGE_RESOLUTION_FAILURE` enum value for `com.databricks.sdk.service.sql.TerminationReasonCode`.
* [Breaking] Change `offlineStoreConfig` and `onlineStoreConfig` fields for `com.databricks.sdk.service.ml.MaterializedFeature` to no longer be required.
* Change `offlineStoreConfig` and `onlineStoreConfig` fields for `com.databricks.sdk.service.ml.MaterializedFeature` to no longer be required.
* [Breaking] Change `lifecycleState` field for `com.databricks.sdk.service.sql.AlertV2` to type `com.databricks.sdk.service.sql.AlertLifecycleState`.
* [Breaking] Remove `table` field for `com.databricks.sdk.service.jobs.TriggerSettings`.
* [Breaking] Remove `duration` and `offset` fields for `com.databricks.sdk.service.ml.TimeWindow`.