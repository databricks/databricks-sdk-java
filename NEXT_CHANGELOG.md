# NEXT CHANGELOG

## Release v0.68.0

### New Features and Improvements

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
* Add `createMaterializedFeature()`, `deleteMaterializedFeature()`, `getMaterializedFeature()`, `listMaterializedFeatures()` and `updateMaterializedFeature()` methods for `workspaceClient.featureEngineering()` service.
* Add `filterCondition` field for `com.databricks.sdk.service.ml.Feature`.
* Change `displayName`, `evaluation`, `queryText`, `schedule` and `warehouseId` fields for `com.databricks.sdk.service.sql.AlertV2` to be required.
* [Breaking] Change `displayName`, `evaluation`, `queryText`, `schedule` and `warehouseId` fields for `com.databricks.sdk.service.sql.AlertV2` to be required.
* [Breaking] Change `comparisonOperator` and `source` fields for `com.databricks.sdk.service.sql.AlertV2Evaluation` to be required.
* Change `comparisonOperator` and `source` fields for `com.databricks.sdk.service.sql.AlertV2Evaluation` to be required.
* Change `name` field for `com.databricks.sdk.service.sql.AlertV2OperandColumn` to be required.
* [Breaking] Change `name` field for `com.databricks.sdk.service.sql.AlertV2OperandColumn` to be required.
* Change `quartzCronSchedule` and `timezoneId` fields for `com.databricks.sdk.service.sql.CronSchedule` to be required.
* [Breaking] Change `quartzCronSchedule` and `timezoneId` fields for `com.databricks.sdk.service.sql.CronSchedule` to be required.
* [Breaking] Remove `results` field for `com.databricks.sdk.service.sql.ListAlertsV2Response`.
