# NEXT CHANGELOG

## Release v0.104.0

### New Features and Improvements
* Add support for authentication through Azure Managed Service Identity (MSI) via the new `azure-msi` credential provider.
* Support `default_profile` in `[__settings__]` section of `.databrickscfg` for consistent default profile resolution across CLI and SDKs.
* Added automatic detection of AI coding agents (Antigravity, Claude Code, Cline, Codex, Copilot CLI, Cursor, Gemini CLI, OpenCode) in the user-agent string. The SDK now appends `agent/<name>` to HTTP request headers when running inside a known AI agent environment.
* Pass `--force-refresh` to Databricks CLI `auth token` command so the SDK always receives a fresh token instead of a potentially stale one from the CLI's internal cache. Falls back gracefully on older CLIs that do not support this flag.

### Bug Fixes
* Fixed non-JSON error responses (e.g. plain-text "Invalid Token" with HTTP 403) producing `Unknown` instead of the correct typed exception (`PermissionDenied`, `Unauthenticated`, etc.). The error message no longer contains Jackson deserialization internals.
* Added `X-Databricks-Org-Id` header to deprecated workspace SCIM APIs (Groups, ServicePrincipals, Users) for SPOG host compatibility.
* Fixed Databricks CLI authentication to detect when the cached token's scopes don't match the SDK's configured scopes. Previously, a scope mismatch was silently ignored, causing requests to use wrong permissions. The SDK now raises an error with instructions to re-authenticate.

### Security Vulnerabilities

### Documentation

### Internal Changes
* Introduced a logging abstraction (`com.databricks.sdk.core.logging`) to decouple the SDK from a specific logging backend.
* Added `token_federation_default_oidc_audiences` resolution from host metadata. The SDK now sets `tokenAudience` from the first element of this field during config initialization, with fallback to `accountId` for account hosts.

### API Changes
* Add `createCatalog()`, `createSyncedTable()`, `deleteCatalog()`, `deleteSyncedTable()`, `getCatalog()` and `getSyncedTable()` methods for `workspaceClient.postgres()` service.
* Add `effectiveFileEventQueue` field for `com.databricks.sdk.service.catalog.CreateExternalLocation`.
* Add `effectiveFileEventQueue` field for `com.databricks.sdk.service.catalog.ExternalLocationInfo`.
* Add `effectiveFileEventQueue` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
* Add `columnSelection` field for `com.databricks.sdk.service.ml.Function`.
* Add `cascade` field for `com.databricks.sdk.service.pipelines.DeletePipelineRequest`.
* Add `defaultBranch` field for `com.databricks.sdk.service.postgres.ProjectSpec`.
* Add `defaultBranch` field for `com.databricks.sdk.service.postgres.ProjectStatus`.
* Add `ingress` and `ingressDryRun` fields for `com.databricks.sdk.service.settings.AccountNetworkPolicy`.
* Add `deleteAppThumbnail()` and `updateAppThumbnail()` methods for `workspaceClient.apps()` service.
* Add `createMessageComment()`, `listConversationComments()` and `listMessageComments()` methods for `workspaceClient.genie()` service.
* Add `applyEnvironment()` method for `workspaceClient.pipelines()` service.
* Add `name` and `permission` fields for `com.databricks.sdk.service.apps.AppResourceApp`.
* Add `managedEncryptionSettings` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
* Add `managedEncryptionSettings` field for `com.databricks.sdk.service.catalog.CreateCatalog`.
* Add `managedEncryptionSettings` field for `com.databricks.sdk.service.catalog.UpdateCatalog`.
* Add `comment` field for `com.databricks.sdk.service.dashboards.GenieFeedback`.
* Add `thoughts` field for `com.databricks.sdk.service.dashboards.GenieQueryAttachment`.
* Add `comment` field for `com.databricks.sdk.service.dashboards.GenieSendMessageFeedbackRequest`.
* Add `requestSource` field for `com.databricks.sdk.service.ml.DataSource`.
* Add `isOnline` field for `com.databricks.sdk.service.ml.MaterializedFeature`.
* Add `connectorOptions` field for `com.databricks.sdk.service.pipelines.SchemaSpec`.
* Add `connectorOptions` field for `com.databricks.sdk.service.pipelines.TableSpec`.
* Add `scopes` field for `com.databricks.sdk.service.settings.CreateOboTokenRequest`.
* Add `gcpEndpoint` field for `com.databricks.sdk.service.settings.CreatePrivateEndpointRule`.
* Add `scopes` field for `com.databricks.sdk.service.settings.CreateTokenRequest`.
* Add `gcpEndpoint` field for `com.databricks.sdk.service.settings.NccPrivateEndpointRule`.
* Add `gcpEndpoint` field for `com.databricks.sdk.service.settings.UpdatePrivateEndpointRule`.
* Add `sqlState` field for `com.databricks.sdk.service.sql.StatementStatus`.
* Add `usagePolicyId` field for `com.databricks.sdk.service.vectorsearch.CreateEndpoint`.
* Add `indexSubtype` field for `com.databricks.sdk.service.vectorsearch.CreateVectorIndexRequest`.
* Add `budgetPolicyId` field for `com.databricks.sdk.service.vectorsearch.EndpointInfo`.
* Add `indexSubtype` field for `com.databricks.sdk.service.vectorsearch.MiniVectorIndex`.
* Add `budgetPolicyId` field for `com.databricks.sdk.service.vectorsearch.PatchEndpointBudgetPolicyResponse`.
* Add `indexSubtype` field for `com.databricks.sdk.service.vectorsearch.VectorIndex`.
* Add `TABLE_DELTA_UNIFORM_ICEBERG_EXTERNAL_DELTASHARING` enum value for `com.databricks.sdk.service.catalog.SecurableKind`.
* Add `GOOGLE_DRIVE` enum value for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* Add `STORAGE_OPTIMIZED` enum value for `com.databricks.sdk.service.vectorsearch.EndpointType`.
* [Breaking] Remove `project` field for `com.databricks.sdk.service.postgres.SyncedTableSyncedTableSpec`.
* [Breaking] Remove `apps` and `lakebase` fields for `com.databricks.sdk.service.settings.CustomerFacingIngressNetworkPolicyRequestDestination`.