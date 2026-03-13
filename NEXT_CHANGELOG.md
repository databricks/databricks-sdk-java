# NEXT CHANGELOG

## Release v0.101.0

### New Features and Improvements
* Support `default_profile` in `[__settings__]` section of `.databrickscfg` for consistent default profile resolution across CLI and SDKs.

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `alertOutput` field for `com.databricks.sdk.service.jobs.RunOutput`.
* Add `alertTask` field for `com.databricks.sdk.service.jobs.RunTask`.
* Add `alertTask` field for `com.databricks.sdk.service.jobs.SubmitTask`.
* Add `alertTask` field for `com.databricks.sdk.service.jobs.Task`.
* Add `com.databricks.sdk.service.environments` package.
* Add `workspaceClient.environments()` service.