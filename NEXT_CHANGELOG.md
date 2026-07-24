# NEXT CHANGELOG

## Release v0.135.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `SPECIAL_DESTINATION_SCHEMA_OWNER`, `SPECIAL_DESTINATION_TABLE_OWNER`, `SPECIAL_DESTINATION_VOLUME_OWNER`, `SPECIAL_DESTINATION_FUNCTION_OWNER` and `SPECIAL_DESTINATION_REGISTERED_MODEL_OWNER` enum values for `com.databricks.sdk.service.catalog.SpecialDestination`.
* [Breaking] Change `createDeployment()` method for `workspaceClient.bundleDeployments()` service with new required argument order.
* [Breaking] Remove `deploymentId` field for `com.databricks.sdk.service.bundledeployments.CreateDeploymentRequest`.