# NEXT CHANGELOG

## Release v0.153.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `executeCommandSync()` method for `workspaceClient.sandbox()` service.
* Add `mode` field for `com.databricks.sdk.service.ml.CronSchedule`.
* Add `DEPLOYMENT_RESOURCE_TYPE_SECRET` and `DEPLOYMENT_RESOURCE_TYPE_CLUSTER_POLICY` enum values for `com.databricks.sdk.service.bundledeployments.DeploymentResourceType`.
* Add `AWS_SECRETS_MANAGER` and `AZURE_KEY_VAULT` enum values for `com.databricks.sdk.service.catalog.ConnectionType`.
* [Breaking] Remove `firstTokenTimeout` field for `com.databricks.sdk.service.catalog.ModelServiceConfigRoutingConfig`.
* [Breaking] Remove `requestTagKey` and `requestTagValue` fields for `com.databricks.sdk.service.catalog.RateLimit`.
* [Breaking] Remove `RATE_LIMIT_KEY_REQUEST_TAG` enum value for `com.databricks.sdk.service.catalog.RateLimitRateLimitKey`.
* Add `com.databricks.sdk.service.domains` package.
* Add `workspaceClient.domains()` service.
* Add `entityColumns` and `timeseriesColumn` fields for `com.databricks.sdk.service.ml.DeltaTableSource`.
* Add `filterCondition`, `inputs` and `timeWindow` fields for `com.databricks.sdk.service.ml.Feature`.
* Add `extraParameters` and `functionType` fields for `com.databricks.sdk.service.ml.Function`.
* Add `entityColumnIdentifiers` and `timeseriesColumnIdentifier` fields for `com.databricks.sdk.service.ml.KafkaSource`.
* Add `cronSchedule` field for `com.databricks.sdk.service.ml.MaterializedFeature`.
* Add `fullFeatureName` field for `com.databricks.sdk.service.ml.PublishSpec`.
* Add `continuous` field for `com.databricks.sdk.service.ml.TimeWindow`.