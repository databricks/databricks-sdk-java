# NEXT CHANGELOG

## Release v0.52.0

### New Features and Improvements
* Added Direct-to-Dataplane API support, allowing users to query route optimized model serving endpoints ([#453](https://github.com/databricks/databricks-sdk-java/pull/453)).

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
* Added `workspaceClient.dashboardEmailSubscriptions()` service and `workspaceClient.sqlResultsDownload()` service.
* Added `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.ClusterAttributes`.
* Added `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.ClusterDetails`.
* Added `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.ClusterSpec`.
* Added `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.CreateCluster`.
* Added `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.EditCluster`.
* Added `remoteShuffleDiskIops`, `remoteShuffleDiskThroughput` and `totalInitialRemoteShuffleDiskSize` fields for `com.databricks.sdk.service.compute.UpdateClusterResource`.
* Added `tags` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
* Added `tags` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
* Added `tags` field for `com.databricks.sdk.service.pipelines.PipelineSpec`.
* Added `maxProvisionedConcurrency` and `minProvisionedConcurrency` fields for `com.databricks.sdk.service.serving.ServedEntityInput`.
* Added `maxProvisionedConcurrency` and `minProvisionedConcurrency` fields for `com.databricks.sdk.service.serving.ServedEntityOutput`.
* Added `maxProvisionedConcurrency` and `minProvisionedConcurrency` fields for `com.databricks.sdk.service.serving.ServedModelInput`.
* Added `maxProvisionedConcurrency` and `minProvisionedConcurrency` fields for `com.databricks.sdk.service.serving.ServedModelOutput`.
* Added `DELTASHARING_CATALOG`, `FOREIGN_CATALOG`, `INTERNAL_CATALOG`, `MANAGED_CATALOG`, `MANAGED_ONLINE_CATALOG`, `SYSTEM_CATALOG` and `UNKNOWN_CATALOG_TYPE` enum values for `com.databricks.sdk.service.catalog.CatalogType`.
* Added `GA4_RAW_DATA`, `POWER_BI`, `SALESFORCE`, `SALESFORCE_DATA_CLOUD`, `SERVICENOW`, `UNKNOWN_CONNECTION_TYPE` and `WORKDAY_RAAS` enum values for `com.databricks.sdk.service.catalog.ConnectionType`.
* Added `OAUTH_ACCESS_TOKEN`, `OAUTH_M2M`, `OAUTH_REFRESH_TOKEN`, `OAUTH_RESOURCE_OWNER_PASSWORD`, `OAUTH_U2M`, `OAUTH_U2M_MAPPING`, `OIDC_TOKEN`, `PEM_PRIVATE_KEY`, `SERVICE_CREDENTIAL` and `UNKNOWN_CREDENTIAL_TYPE` enum values for `com.databricks.sdk.service.catalog.CredentialType`.
* Added `CATALOG`, `CLEAN_ROOM`, `CONNECTION`, `CREDENTIAL`, `EXTERNAL_LOCATION`, `EXTERNAL_METADATA`, `FUNCTION`, `METASTORE`, `PIPELINE`, `PROVIDER`, `RECIPIENT`, `SCHEMA`, `SHARE`, `STAGING_TABLE`, `STORAGE_CREDENTIAL`, `TABLE`, `UNKNOWN_SECURABLE_TYPE` and `VOLUME` enum values for `com.databricks.sdk.service.catalog.SecurableType`.
* Added `TERADATA` enum value for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* Added `OIDC_FEDERATION` enum value for `com.databricks.sdk.service.sharing.AuthenticationType`.
* [Breaking] Changed `securableType` field for `com.databricks.sdk.service.catalog.ConnectionInfo` to type `com.databricks.sdk.service.catalog.SecurableType` class.
* [Breaking] Changed `catalogType` field for `com.databricks.sdk.service.catalog.SchemaInfo` to type `com.databricks.sdk.service.catalog.CatalogType` class.
* [Breaking] Removed `getCredentialsForTraceDataDownload()` and `getCredentialsForTraceDataUpload()` methods for `workspaceClient.experiments()` service.
