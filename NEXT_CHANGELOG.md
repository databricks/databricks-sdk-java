# NEXT CHANGELOG

## Release v0.114.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes
* Cannonicalize Bearer tokenType in Authorization headers

### Security Vulnerabilities

### Documentation

### Internal Changes
* Switch workspace addressing header on workspace-scoped API calls from `X-Databricks-Org-Id` to `X-Databricks-Workspace-Id`. The value continues to come from the `DATABRICKS_WORKSPACE_ID` environment variable / `DatabricksConfig.setWorkspaceId()` setter, and now accepts either a classic numeric workspace ID or another workspace identifier format (server disambiguates). Mirrors [databricks/databricks-sdk-go#1688](https://github.com/databricks/databricks-sdk-go/pull/1688).

### API Changes
* Add `updateTokenManagement()` method for `workspaceClient.tokenManagement()` service.
* Add `deploymentId` and `versionId` fields for `com.databricks.sdk.service.jobs.JobDeployment`.
* Add `deploymentId` and `versionId` fields for `com.databricks.sdk.service.pipelines.PipelineDeployment`.
* Add `autoscopeEnabled` field for `com.databricks.sdk.service.settings.CreateOboTokenRequest`.
* Add `autoscopeEnabled` field for `com.databricks.sdk.service.settings.CreateTokenRequest`.
* Add `autoscopeState`, `backfillScopes`, `inferredScopes` and `scopes` fields for `com.databricks.sdk.service.settings.PublicTokenInfo`.
* Add `autoscopeState`, `backfillScopes`, `inferredScopes` and `scopes` fields for `com.databricks.sdk.service.settings.TokenInfo`.
* Add `resourceType` field for `com.databricks.sdk.service.bundle.Operation`.
* Add `getCanonicalTokenType()` method for `com.databricks.sdk.core.oauth.Token`
