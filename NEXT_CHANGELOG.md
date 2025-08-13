# NEXT CHANGELOG

## Release v0.59.0

### New Features and Improvements

* Add option to add a timeout for browser confirmation in the U2M authentication flow.

### Bug Fixes

* User provided scopes are now properly propagated in OAuth flows.
* [Warning] Correctly defaults to scope `all-apis` (instead of `clusters sql`) in U2M if no scopes are provided by the users. This change aligns the Java SDK logic with the Python and Go SDK logic.

### Documentation

### Internal Changes

### API Changes
* Added `workspaceClient.policies()` service and `workspaceClient.temporaryPathCredentials()` service.
* Added `create()` method for `workspaceClient.tables()` service.
* Added `listDatabaseCatalogs()`, `listSyncedDatabaseTables()`, `updateDatabaseCatalog()` and `updateSyncedDatabaseTable()` methods for `workspaceClient.database()` service.
* Added `firstOnDemand` field for `com.databricks.sdk.service.compute.GcpAttributes`.
* Added `usagePolicyId` field for `com.databricks.sdk.service.jobs.CreateJob`.
* Added `usagePolicyId` field for `com.databricks.sdk.service.jobs.JobSettings`.
* Added `usagePolicyId` field for `com.databricks.sdk.service.jobs.SubmitRun`.
* Added `clientRequestId` and `usageContext` fields for `com.databricks.sdk.service.serving.QueryEndpointInput`.
* Added `channelId`, `channelIdSet`, `oauthToken` and `oauthTokenSet` fields for `com.databricks.sdk.service.settings.SlackConfig`.
* Added `SNAPSHOT` enum value for `com.databricks.sdk.service.ml.PublishSpecPublishMode`.
* [Breaking] Changed `publishMode` field for `com.databricks.sdk.service.ml.PublishSpec` to be required.