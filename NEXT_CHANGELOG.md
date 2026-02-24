# NEXT CHANGELOG

## Release v0.93.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `parameters` field for `com.databricks.sdk.service.pipelines.StartUpdate`.
* Add `parameters` field for `com.databricks.sdk.service.pipelines.UpdateInfo`.
* [Breaking] Change `getDownloadFullQueryResult()` method for `workspaceClient.genie()` service with new required argument order.
* [Breaking] Change `name` field for `com.databricks.sdk.service.apps.Space` to be required.
* Change `name` field for `com.databricks.sdk.service.apps.Space` to be required.
* [Breaking] Change `id` and `userId` fields for `com.databricks.sdk.service.dashboards.GenieConversation` to no longer be required.
* [Breaking] Change `createdTimestamp` and `title` fields for `com.databricks.sdk.service.dashboards.GenieConversationSummary` to no longer be required.
* [Breaking] Change `downloadIdSignature` field for `com.databricks.sdk.service.dashboards.GenieGetDownloadFullQueryResultRequest` to be required.
* [Breaking] Change `id` field for `com.databricks.sdk.service.dashboards.GenieMessage` to no longer be required.