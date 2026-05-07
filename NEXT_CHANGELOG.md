# NEXT CHANGELOG

## Release v0.107.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes
* Fixed Databricks CLI `--profile` fallback by detecting the CLI version at init time. The previous error-based detection was broken because `--profile` is a global Cobra flag silently accepted by old CLIs.

### Security Vulnerabilities

### Documentation

### Internal Changes
* Detect Databricks CLI version at init time via `databricks version --output json`, enabling version-gated flag support. Successful detections are cached per CLI path; subprocess failures fall back to the most conservative command and are retried on the next call.
* Pass `--force-refresh` to Databricks CLI `auth token` command (when the installed CLI is >= v0.296.0) so the SDK always receives a freshly minted token instead of a potentially stale one from the CLI's internal cache.

### API Changes
* Add `createExample()`, `deleteExample()`, `getExample()`, `getPermissionLevels()`, `getPermissions()`, `listExamples()`, `setPermissions()`, `updateExample()` and `updatePermissions()` methods for `workspaceClient.supervisorAgents()` service.
* Add `metaAdsOptions` field for `com.databricks.sdk.service.pipelines.ConnectorOptions`.
* Add `META_MARKETING` enum value for `com.databricks.sdk.service.catalog.ConnectionType`.
* Add `META_MARKETING` enum value for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* Change `guidelines` field for `com.databricks.sdk.service.knowledgeassistants.Example` to no longer be required.
* [Breaking] Change `guidelines` field for `com.databricks.sdk.service.knowledgeassistants.Example` to no longer be required.
* Change `description` field for `com.databricks.sdk.service.supervisoragents.Tool` to no longer be required.
* [Breaking] Change `description` field for `com.databricks.sdk.service.supervisoragents.Tool` to no longer be required.
* Add `ZENDESK` enum value for `com.databricks.sdk.service.catalog.ConnectionType`.
* Add `r2TempCredentials` field for `com.databricks.sdk.service.catalog.TemporaryCredentials`.
* Add `zendeskSupportOptions` field for `com.databricks.sdk.service.pipelines.ConnectorOptions`.
* Add `azureKeyInfo` field for `com.databricks.sdk.service.provisioning.CreateCustomerManagedKeyRequest`.
* Add `targetQps` field for `com.databricks.sdk.service.vectorsearch.CreateEndpoint`.
* Add `columnsToIndex` field for `com.databricks.sdk.service.vectorsearch.DeltaSyncVectorIndexSpecRequest`.
* Add `columnsToIndex` field for `com.databricks.sdk.service.vectorsearch.DeltaSyncVectorIndexSpecResponse`.
* Add `requestedTargetQps` field for `com.databricks.sdk.service.vectorsearch.EndpointScalingInfo`.
* Add `targetQps` field for `com.databricks.sdk.service.vectorsearch.PatchEndpointRequest`.
* Add `JIRA` and `ZENDESK` enum values for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* [Breaking] Remove `minQps` field for `com.databricks.sdk.service.vectorsearch.CreateEndpoint`.
* [Breaking] Remove `requestedMinQps` field for `com.databricks.sdk.service.vectorsearch.EndpointScalingInfo`.
* [Breaking] Remove `minQps` field for `com.databricks.sdk.service.vectorsearch.PatchEndpointRequest`.
* Add `getPermissionLevels()`, `getPermissions()`, `setPermissions()` and `updatePermissions()` methods for `workspaceClient.vectorSearchEndpoints()` service.
* Add `privateAccess` field for `com.databricks.sdk.service.settings.CustomerFacingIngressNetworkPolicy`.
* Add `accountApi`, `accountDatabricksOne` and `accountUi` fields for `com.databricks.sdk.service.settings.CustomerFacingIngressNetworkPolicyRequestDestination`.
* Add `scopeQualifier` field for `com.databricks.sdk.service.settings.CustomerFacingIngressNetworkPolicyWorkspaceApiDestination`.
* Add `displayName` and `previewPhase` fields for `com.databricks.sdk.service.settingsv2.SettingsMetadata`.