# NEXT CHANGELOG

## Release v0.100.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes
* Add retry with backoff to `CachedTokenSource` async refresh so that a failed background refresh no longer disables async until a blocking call succeeds.

### API Changes
* Add `connectorType` and `dataStagingOptions` fields for `com.databricks.sdk.service.pipelines.IngestionPipelineDefinition`.
* Add `ingestionSourceCatalogName`, `ingestionSourceConnectionName`, `ingestionSourceSchemaName`, `ingestionSourceTableName` and `ingestionSourceTableVersion` fields for `com.databricks.sdk.service.pipelines.Origin`.
* Add `subDomain` field for `com.databricks.sdk.service.serving.ExternalFunctionRequest`.