# NEXT CHANGELOG

## Release v0.114.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes
* Switch workspace addressing header on workspace-scoped API calls from `X-Databricks-Org-Id` to `X-Databricks-Workspace-Id`. The value continues to come from the `DATABRICKS_WORKSPACE_ID` environment variable / `DatabricksConfig.setWorkspaceId()` setter, and now accepts either a classic numeric workspace ID or another workspace identifier format (server disambiguates). Mirrors [databricks/databricks-sdk-go#1688](https://github.com/databricks/databricks-sdk-go/pull/1688).

### API Changes
