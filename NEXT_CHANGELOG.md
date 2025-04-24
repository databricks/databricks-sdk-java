# NEXT CHANGELOG

## Release v0.47.0

### New Features and Improvements

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
* Added `updateEndpointBudgetPolicy()` and `updateEndpointCustomTags()` methods for `workspaceClient.vectorSearchEndpoints()` service.
* Added `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.EditInstancePool`.
* Added `pageSize` and `pageToken` fields for `com.databricks.sdk.service.compute.GetEvents`.
* Added `nextPageToken` and `prevPageToken` fields for `com.databricks.sdk.service.compute.GetEventsResponse`.
* Added `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.GetInstancePool`.
* Added `nodeTypeFlexibility` field for `com.databricks.sdk.service.compute.InstancePoolAndStats`.
* Added `effectivePerformanceTarget` field for `com.databricks.sdk.service.jobs.RepairHistoryItem`.
* Added `performanceTarget` field for `com.databricks.sdk.service.jobs.RepairRun`.
* Added `budgetPolicyId` field for `com.databricks.sdk.service.vectorsearch.CreateEndpoint`.
* Added `customTags` and `effectiveBudgetPolicyId` fields for `com.databricks.sdk.service.vectorsearch.EndpointInfo`.
* Added `DISABLED` enum value for `com.databricks.sdk.service.jobs.TerminationCodeCode`.
* [Breaking] Changed `createIndex()` method for `workspaceClient.vectorSearchIndexes()` service to return `com.databricks.sdk.service.vectorsearch.VectorIndex` class.
* [Breaking] Changed `deleteDataVectorIndex()` method for `workspaceClient.vectorSearchIndexes()` service . HTTP method/verb has changed.
* [Breaking] Changed `deleteDataVectorIndex()` method for `workspaceClient.vectorSearchIndexes()` service with new required argument order.
* [Breaking] Changed `com.databricks.sdk.service.vectorsearch.List` class to.
* [Breaking] Changed `dataArray` field for `com.databricks.sdk.service.vectorsearch.ResultData` to type `com.databricks.sdk.service.vectorsearch.ListValueList` class.
* [Breaking] Changed waiter for `workspaceClient.vectorSearchEndpoints().createEndpoint()` method.
* [Breaking] Removed `nullValue` field for `com.databricks.sdk.service.vectorsearch.Value`.
