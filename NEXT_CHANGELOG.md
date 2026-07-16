# NEXT CHANGELOG

## Release v0.130.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `listCleanRoomTaskRunsHandler()` method for `workspaceClient.cleanRoomTaskRuns()` service.
* Add `initialParentPath` field for `com.databricks.sdk.service.bundledeployments.Deployment`.
* Add `jarAnalysis` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAsset`.
* Add `jarAnalysisReview` field for `com.databricks.sdk.service.cleanrooms.CreateCleanRoomAssetReviewRequest`.
* Add `jarAnalysisReviewState` and `jarAnalysisReviews` fields for `com.databricks.sdk.service.cleanrooms.CreateCleanRoomAssetReviewResponse`.
* Add `capacityReservationGroup` field for `com.databricks.sdk.service.compute.InstancePoolAzureAttributes`.
* Add `effectiveWorkspaceId` field for `com.databricks.sdk.service.disasterrecovery.StableUrl`.
* Add `lifetime` field for `com.databricks.sdk.service.ml.TimeWindow`.
* Add `sourceMetadataColumn` field for `com.databricks.sdk.service.pipelines.TableSpecificConfig`.
* Add `JDBC` enum value for `com.databricks.sdk.service.catalog.ConnectionType`.
* Add `JAR_ANALYSIS` enum value for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetAssetType`.
* [Breaking] Remove `codeSourcePath` field for `com.databricks.sdk.service.jobs.AiRuntimeTask`.