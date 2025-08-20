# NEXT CHANGELOG

## Release v0.60.0

### New Features and Improvements
- Azure Service Principal credential provider can now automatically discover tenant ID when not explicitly provided

### Bug Fixes

- [Breaking] `DatabricksError` now correctly exposes all Databricks error details types. This change is a breaking change for users depending on the `ErrorDetail` class. The same information can be accessed from `ErrorDetails.errorInfo`.

### Documentation

### Internal Changes

### API Changes
* Added `com.databricks.sdk.service.settingsv2` and `com.databricks.sdk.service.tags` packages.
* Added `workspaceClient.appsSettings()` service.
* Added `workspaceClient.entityTagAssignments()` service and `workspaceClient.rfa()` service.
* Added `accountClient.accountSettingsV2()` service and `workspaceClient.workspaceSettingsV2()` service.
* Added `workspaceClient.tagPolicies()` service.
* Added `deleteConversationMessage()`, `listConversationMessages()` and `sendMessageFeedback()` methods for `workspaceClient.genie()` service.
* Added `includeAll` field for `com.databricks.sdk.service.dashboards.GenieListConversationsRequest`.
* Added `effectiveUsagePolicyId` field for `com.databricks.sdk.service.jobs.BaseJob`.
* Added `effectiveUsagePolicyId` field for `com.databricks.sdk.service.jobs.BaseRun`.
* Added `effectiveUsagePolicyId` field for `com.databricks.sdk.service.jobs.Job`.
* Added `effectiveUsagePolicyId` field for `com.databricks.sdk.service.jobs.Run`.
* Added `tokens` field for `com.databricks.sdk.service.serving.AiGatewayRateLimit`.
* Added `usagePolicyId` field for `com.databricks.sdk.service.serving.ServingEndpoint`.
* Added `effectiveRunAs` and `runAs` fields for `com.databricks.sdk.service.sql.AlertV2`.
* Added `cacheQueryId` field for `com.databricks.sdk.service.sql.QueryInfo`.
* Added `modelEndpointNameForQuery` field for `com.databricks.sdk.service.vectorsearch.EmbeddingSourceColumn`.
* [Breaking] Removed `environmentSettings` field for `com.databricks.sdk.service.catalog.ConnectionInfo`.
* [Breaking] Removed `environmentSettings` field for `com.databricks.sdk.service.catalog.CreateConnection`.
* [Breaking] Removed `environmentSettings` field for `com.databricks.sdk.service.catalog.UpdateConnection`.
* [Breaking] Removed `comment`, `displayName` and `tags` fields for `com.databricks.sdk.service.sharing.Share`.