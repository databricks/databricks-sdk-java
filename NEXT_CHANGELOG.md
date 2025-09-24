# NEXT CHANGELOG

## Release v0.65.0

### New Features and Improvements

### Bug Fixes

* Fix OAuthClient to properly encode complex query parameters.

### Documentation

### Internal Changes

### API Changes
* Added `com.databricks.sdk.service.iamv2` package.
* Added `accountClient.accountGroupsV2()` service, `accountClient.accountServicePrincipalsV2()` service, `accountClient.accountUsersV2()` service, `workspaceClient.groupsV2()` service, `workspaceClient.servicePrincipalsV2()` service and `workspaceClient.usersV2()` service.
* Added `accountClient.accountIamV2()` service and `workspaceClient.workspaceIamV2()` service.
* Added `workspaceClient.featureEngineering()` service.
* Added `javaDependencies` field for `com.databricks.sdk.service.compute.Environment`.
* Added `followupQuestions` field for `com.databricks.sdk.service.dashboards.GenieAttachment`.
* Added `feedback` field for `com.databricks.sdk.service.dashboards.GenieMessage`.
* Added `comment` field for `com.databricks.sdk.service.dashboards.GenieSendMessageFeedbackRequest`.
* [Breaking] Added `rating` field for `com.databricks.sdk.service.dashboards.GenieSendMessageFeedbackRequest`.
* Added `effectiveCapacity`, `effectiveEnablePgNativeLogin` and `enablePgNativeLogin` fields for `com.databricks.sdk.service.database.DatabaseInstance`.
* Added `taskRetryMode` field for `com.databricks.sdk.service.jobs.Continuous`.
* Added `disabled` field for `com.databricks.sdk.service.jobs.Task`.
* Added `netsuiteJarPath` and `sourceConfigurations` fields for `com.databricks.sdk.service.pipelines.IngestionPipelineDefinition`.
* Added `workdayReportParameters` field for `com.databricks.sdk.service.pipelines.TableSpecificConfig`.
* Added `appId`, `appIdSet`, `authSecret`, `authSecretSet`, `channelUrl`, `channelUrlSet`, `tenantId` and `tenantIdSet` fields for `com.databricks.sdk.service.settings.MicrosoftTeamsConfig`.
* Added `auxiliaryManagedLocation` field for `com.databricks.sdk.service.sharing.TableInternalAttributes`.
* Added `alerts` field for `com.databricks.sdk.service.sql.ListAlertsV2Response`.
* Added `createTime` and `updateTime` fields for `com.databricks.sdk.service.tags.TagPolicy`.
* Added `ensureRerankerCompatible` field for `com.databricks.sdk.service.vectorsearch.GetIndexRequest`.
* Added `reranker` field for `com.databricks.sdk.service.vectorsearch.QueryVectorIndexRequest`.
* Added `TABLE_DELTA_UNIFORM_ICEBERG_FOREIGN_DELTASHARING` enum value for `com.databricks.sdk.service.catalog.SecurableKind`.
* Added `NO_ACTIVATED_K8S` and `USAGE_POLICY_ENTITLEMENT_DENIED` enum values for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Added `INTERNAL_CATALOG_PATH_OVERLAP_EXCEPTION` and `INTERNAL_CATALOG_MISSING_UC_PATH_EXCEPTION` enum values for `com.databricks.sdk.service.dashboards.MessageErrorType`.
* Added `FOREIGN_CATALOG` enum value for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* Added `FOREIGN_ICEBERG_TABLE` enum value for `com.databricks.sdk.service.sharing.TableInternalAttributesSharedTableType`.
* [Breaking] Changed `createCleanRoomAssetReview()` method for `workspaceClient.cleanRoomAssets()` service with new required argument order.
* [Breaking] Changed `sendMessageFeedback()` method for `workspaceClient.genie()` service with new required argument order.
* [Breaking] Removed `feedbackRating` and `feedbackText` fields for `com.databricks.sdk.service.dashboards.GenieSendMessageFeedbackRequest`.
* [Breaking] Removed `disabled` field for `com.databricks.sdk.service.jobs.RunTask`.
* [Breaking] Removed `defaultDataSecurityMode` and `effectiveDefaultDataSecurityMode` fields for `com.databricks.sdk.service.settingsv2.Setting`.
* Added `listShares()` method for `workspaceClient.shares()` service.
* Added `suggestedQuestions` field for `com.databricks.sdk.service.dashboards.GenieAttachment`.
* Added `warehouseId` field for `com.databricks.sdk.service.dashboards.GenieSpace`.
* Added `PALANTIR` enum value for `com.databricks.sdk.service.catalog.ConnectionType`.
* Added `TABLE_METRIC_VIEW_DELTASHARING` and `TABLE_FOREIGN_PALANTIR` enum values for `com.databricks.sdk.service.catalog.SecurableKind`.
* Added `NO_ACTIVATED_K8S_TESTING_TAG` enum value for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Added `METRIC_VIEW` enum value for `com.databricks.sdk.service.sharing.TableInternalAttributesSharedTableType`.
* [Breaking] Removed `followupQuestions` field for `com.databricks.sdk.service.dashboards.GenieAttachment`.
* [Breaking] Removed `comment` field for `com.databricks.sdk.service.dashboards.GenieFeedback`.
* [Breaking] Removed `comment` field for `com.databricks.sdk.service.dashboards.GenieSendMessageFeedbackRequest`.