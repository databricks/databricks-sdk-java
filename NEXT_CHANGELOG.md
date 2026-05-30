# NEXT CHANGELOG

## Release v0.114.0

### New Features and Improvements
* Detect the `AI_AGENT` environment variable (Vercel `@vercel/detect-agent` convention) as a secondary fallback for the AI agent reported in the user agent, consulted only when the agents.md `AGENT` variable is unset or empty. An unrecognized `AGENT` or `AI_AGENT` value is now passed through as-is (sanitized to the user agent allowlist and capped at 64 characters) instead of being reported as `unknown`. Mirrors [databricks/databricks-sdk-go#1683](https://github.com/databricks/databricks-sdk-go/pull/1683).

### Breaking Changes

### Bug Fixes

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