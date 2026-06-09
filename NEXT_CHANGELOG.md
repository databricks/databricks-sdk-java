# NEXT CHANGELOG

## Release v0.119.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `com.databricks.sdk.service.aisearch` and `com.databricks.sdk.service.bundledeployments` packages.
* Add `workspaceClient.aiSearch()` service.
* Add `workspaceClient.bundleDeployments()` service.
* Add `runningInstances` field for `com.databricks.sdk.service.apps.ApplicationStatus`.
* Add `customMaxRetentionHours` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
* Add `environmentSettings` field for `com.databricks.sdk.service.catalog.ConnectionInfo`.
* Add `customMaxRetentionHours` field for `com.databricks.sdk.service.catalog.CreateCatalog`.
* Add `environmentSettings` field for `com.databricks.sdk.service.catalog.CreateConnection`.
* Add `customMaxRetentionHours` field for `com.databricks.sdk.service.catalog.CreateSchema`.
* Add `customMaxRetentionHours` field for `com.databricks.sdk.service.catalog.SchemaInfo`.
* Add `customMaxRetentionHours` field for `com.databricks.sdk.service.catalog.UpdateCatalog`.
* Add `environmentSettings` field for `com.databricks.sdk.service.catalog.UpdateConnection`.
* Add `customMaxRetentionHours` field for `com.databricks.sdk.service.catalog.UpdateSchema`.
* Add `streamSource` field for `com.databricks.sdk.service.ml.DataSource`.
* Add `ingestionConfig` field for `com.databricks.sdk.service.ml.KafkaConfig`.
* Add `clusteringColumns`, `enableAutoClustering` and `tableProperties` fields for `com.databricks.sdk.service.pipelines.TableSpecificConfig`.
* Add `branchId` field for `com.databricks.sdk.service.postgres.Branch`.
* Add `catalogId` field for `com.databricks.sdk.service.postgres.Catalog`.
* Add `databaseId` field for `com.databricks.sdk.service.postgres.Database`.
* Add `endpointId` field for `com.databricks.sdk.service.postgres.Endpoint`.
* Add `projectId` field for `com.databricks.sdk.service.postgres.Project`.
* Add `roleId` field for `com.databricks.sdk.service.postgres.Role`.
* Add `syncedTableId` field for `com.databricks.sdk.service.postgres.SyncedTable`.
* Add `allowedDatabricksDestinations` field for `com.databricks.sdk.service.settings.EgressNetworkPolicyNetworkAccessPolicy`.
* Add `facets`, `queryColumns` and `sortColumns` fields for `com.databricks.sdk.service.vectorsearch.QueryVectorIndexRequest`.
* Add `facetResult` field for `com.databricks.sdk.service.vectorsearch.QueryVectorIndexResponse`.
* Add `facetColumnCount` and `facetColumns` fields for `com.databricks.sdk.service.vectorsearch.ResultManifest`.
* Add `dangerouslyForceDiscardAll` field for `com.databricks.sdk.service.workspace.UpdateRepoRequest`.
* [Breaking] Remove `com.databricks.sdk.service.bundle` package.
* [Breaking] Remove `workspaceClient.bundle()` service.
