# NEXT CHANGELOG

## Release v0.124.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `firstDistinct` and `lastDistinct` fields for `com.databricks.sdk.service.ml.AggregationFunction`.
* Add `avroSchema` and `protoSchema` fields for `com.databricks.sdk.service.ml.SchemaConfig`.
* Add `freshnessTarget` field for `com.databricks.sdk.service.ml.StreamingMode`.
* Add `longRolling` field for `com.databricks.sdk.service.ml.TimeWindow`.
* [Breaking] Remove `firstDistinctN` and `lastDistinctN` fields for `com.databricks.sdk.service.ml.AggregationFunction`.
* Add `list()` and `listEffective()` methods for `workspaceClient.grants()` service.
* [Breaking] Remove `includeBrowse` field for `com.databricks.sdk.service.catalog.GetSecretRequest`.
* [Breaking] Remove `includeBrowse` field for `com.databricks.sdk.service.catalog.ListSecretsRequest`.
* [Breaking] Remove `browseOnly` and `externalSecretId` fields for `com.databricks.sdk.service.catalog.Secret`.
* [Breaking] Remove `groupName` field for `com.databricks.sdk.service.postgres.GenerateDatabaseCredentialRequest`.
