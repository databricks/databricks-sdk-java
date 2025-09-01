# NEXT CHANGELOG

## Release v0.61.0

### New Features and Improvements

### Bug Fixes

* Fixed `selectSparkVersion()` method to use contains() instead of equals() for spark version matching.

### Documentation

### Internal Changes

### API Changes
* Added `comment` field for `com.databricks.sdk.service.dashboards.GenieSendMessageFeedbackRequest`.
* [Breaking] Added `rating` field for `com.databricks.sdk.service.dashboards.GenieSendMessageFeedbackRequest`.
* Added `effectiveEnablePgNativeLogin` and `enablePgNativeLogin` fields for `com.databricks.sdk.service.database.DatabaseInstance`.
* Added `taskRetryMode` field for `com.databricks.sdk.service.jobs.Continuous`.
* Added `sourceConfigurations` field for `com.databricks.sdk.service.pipelines.IngestionPipelineDefinition`.
* Added `appId`, `appIdSet`, `authSecret`, `authSecretSet`, `channelUrl`, `channelUrlSet`, `tenantId` and `tenantIdSet` fields for `com.databricks.sdk.service.settings.MicrosoftTeamsConfig`.
* Added `ensureRerankerCompatible` field for `com.databricks.sdk.service.vectorsearch.GetIndexRequest`.
* Added `reranker` field for `com.databricks.sdk.service.vectorsearch.QueryVectorIndexRequest`.
* [Breaking] Changed `createCleanRoomAssetReview()` method for `workspaceClient.cleanRoomAssets()` service with new required argument order.
* [Breaking] Changed `sendMessageFeedback()` method for `workspaceClient.genie()` service with new required argument order.
* Changed `notebookReview` field for `com.databricks.sdk.service.cleanrooms.CreateCleanRoomAssetReviewRequest` to no longer be required.
* [Breaking] Changed `features` field for `com.databricks.sdk.service.ml.FeatureList` to type List<`com.databricks.sdk.service.ml.LinkedFeature`>.
* [Breaking] Removed `feedbackRating` and `feedbackText` fields for `com.databricks.sdk.service.dashboards.GenieSendMessageFeedbackRequest`.