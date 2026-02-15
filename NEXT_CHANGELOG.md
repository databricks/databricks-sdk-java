# NEXT CHANGELOG

## Release v0.89.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `com.databricks.sdk.service.networking` package.
* Add `accountClient.endpoints()` service.
* Add `filterCondition` and `transformations` fields for `com.databricks.sdk.service.ml.DeltaTableSource`.
* Add `budgetPolicyId` and `customTags` fields for `com.databricks.sdk.service.postgres.ProjectSpec`.
* Add `budgetPolicyId` and `customTags` fields for `com.databricks.sdk.service.postgres.ProjectStatus`.
* Add `createSpace()`, `deleteSpace()`, `getSpace()`, `getSpaceOperation()`, `listSpaces()` and `updateSpace()` methods for `workspaceClient.apps()` service.
* Add `space` field for `com.databricks.sdk.service.apps.App`.
* Add `space` field for `com.databricks.sdk.service.apps.ListAppsRequest`.
* [Breaking] Remove `filterCondition` and `transformations` fields for `com.databricks.sdk.service.ml.DeltaTableSource`.
