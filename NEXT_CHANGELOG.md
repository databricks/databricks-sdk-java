# NEXT CHANGELOG

## Release v0.83.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `generateDownloadFullQueryResult()` and `getDownloadFullQueryResult()` methods for `workspaceClient.genie()` service.
* Add `activeInstances` field for `com.databricks.sdk.service.apps.ComputeStatus`.
* [Breaking] Change `createRole()` method for `workspaceClient.postgres()` service. HTTP method/verb has changed.
* Add `compute` field for `com.databricks.sdk.service.jobs.RunTask`.
* Add `compute` field for `com.databricks.sdk.service.jobs.SubmitTask`.
* Add `compute` field for `com.databricks.sdk.service.jobs.Task`.