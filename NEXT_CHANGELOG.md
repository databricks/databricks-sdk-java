# NEXT CHANGELOG

## Release v0.58.0

### New Features and Improvements

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
* Added `statementIdSignature` field for `com.databricks.sdk.service.dashboards.Result`.
* Added `effectiveDatabaseInstanceName` and `effectiveLogicalDatabaseName` fields for `com.databricks.sdk.service.database.SyncedDatabaseTable`.
* Added `table` field for `com.databricks.sdk.service.jobs.TriggerStateProto`.
* Added `emailNotifications` field for `com.databricks.sdk.service.serving.CreatePtEndpointRequest`.
* Added `emailNotifications` field for `com.databricks.sdk.service.serving.CreateServingEndpoint`.
* Added `emailNotifications` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
* [Breaking] Changed `list()` method for `workspaceClient.consumerProviders()` service . New request type is `com.databricks.sdk.service.marketplace.ListConsumerProvidersRequest` class.
* [Breaking] Changed `create()` method for `accountClient.privateAccess()` service . New request type is `com.databricks.sdk.service.provisioning.CreatePrivateAccessSettingsRequest` class.
* [Breaking] Changed `create()` method for `accountClient.privateAccess()` service with new required argument order.
* [Breaking] Changed `replace()` method for `accountClient.privateAccess()` service . New request type is `com.databricks.sdk.service.provisioning.ReplacePrivateAccessSettingsRequest` class.
* [Breaking] Removed `isFeatured` field for `com.databricks.sdk.service.marketplace.ListProvidersRequest`.