# NEXT CHANGELOG

## Release v0.112.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `undeleteBranch()` method for `workspaceClient.postgres()` service.
* Add `attributes` and `excludedAttributes` fields for `com.databricks.sdk.service.iam.MeRequest`.
* Add `includeTriggerState` field for `com.databricks.sdk.service.jobs.GetJobRequest`.
* Add `deleteTime` and `purgeTime` fields for `com.databricks.sdk.service.postgres.BranchStatus`.
* Add `purge` field for `com.databricks.sdk.service.postgres.DeleteBranchRequest`.
* Add `showDeleted` field for `com.databricks.sdk.service.postgres.ListBranchesRequest`.
* Add `DELETED` enum value for `com.databricks.sdk.service.postgres.BranchStatusState`.
* [Breaking] Change `actionType` and `resourceId` fields for `com.databricks.sdk.service.bundle.Operation` to be required.
* Change `actionType` and `resourceId` fields for `com.databricks.sdk.service.bundle.Operation` to be required.
* Change `cliVersion` field for `com.databricks.sdk.service.bundle.Version` to be required.
* [Breaking] Change `cliVersion` field for `com.databricks.sdk.service.bundle.Version` to be required.
* [Breaking] Change `tags` field for `com.databricks.sdk.service.marketplace.ListListingsRequest` to type `com.databricks.sdk.service.marketplace.ListingTag` class.
* [Breaking] Change pagination for `workspaceClient.clusters().events()` method.