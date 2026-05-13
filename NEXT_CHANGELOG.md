# NEXT CHANGELOG

## Release v0.108.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `catalogName`, `createdAt`, `createdBy`, `name` and `schemaName` fields for `com.databricks.sdk.service.ml.Feature`.
* [Breaking] Add `catalogName` and `schemaName` fields for `com.databricks.sdk.service.ml.ListFeaturesRequest`.
* Add `GPU_XLARGE` enum value for `com.databricks.sdk.service.serving.ServedModelInputWorkloadType`.
* Add `GPU_XLARGE` enum value for `com.databricks.sdk.service.serving.ServingModelWorkloadType`.
* [Breaking] Change `listFeatures()` method for `workspaceClient.featureEngineering()` service with new required argument order.
* [Breaking] Remove `unspecifiedResourceName` field for `com.databricks.sdk.service.postgres.RequestedResource`.