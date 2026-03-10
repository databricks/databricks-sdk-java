# NEXT CHANGELOG

## Release v0.99.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `updateRole()` method for `workspaceClient.postgres()` service.
* Add `entities` and `timeseriesColumn` fields for `com.databricks.sdk.service.ml.Feature`.
* Add `aggregationFunction` field for `com.databricks.sdk.service.ml.Function`.
* Add `filterCondition` field for `com.databricks.sdk.service.ml.KafkaSource`.
* Add `attributes` field for `com.databricks.sdk.service.postgres.RoleRoleStatus`.
* Change `entityColumns` and `timeseriesColumn` fields for `com.databricks.sdk.service.ml.DeltaTableSource` to no longer be required.
* [Breaking] Change `entityColumns` and `timeseriesColumn` fields for `com.databricks.sdk.service.ml.DeltaTableSource` to no longer be required.
* Change `inputs` field for `com.databricks.sdk.service.ml.Feature` to no longer be required.
* [Breaking] Change `inputs` field for `com.databricks.sdk.service.ml.Feature` to no longer be required.
* [Breaking] Change `functionType` field for `com.databricks.sdk.service.ml.Function` to no longer be required.
* Change `functionType` field for `com.databricks.sdk.service.ml.Function` to no longer be required.
* Change `entityColumnIdentifiers` and `timeseriesColumnIdentifier` fields for `com.databricks.sdk.service.ml.KafkaSource` to no longer be required.
* [Breaking] Change `entityColumnIdentifiers` and `timeseriesColumnIdentifier` fields for `com.databricks.sdk.service.ml.KafkaSource` to no longer be required.