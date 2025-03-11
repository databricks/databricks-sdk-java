# NEXT CHANGELOG

## Release v0.42.0

### New Features and Improvements

### Bug Fixes

### Documentation

### Internal Changes
* Update Jobs ListRuns API to support paginated responses ([#411](https://github.com/databricks/databricks-sdk-java/pull/411))
* Update Jobs ListJobs API to support paginated responses ([#410](https://github.com/databricks/databricks-sdk-java/pull/410))
* Introduce automated tagging ([#409](https://github.com/databricks/databricks-sdk-java/pull/409)).
* Update Jobs GetJob API to support paginated responses  ([#403](https://github.com/databricks/databricks-sdk-java/pull/403)).
* Update Jobs GetRun API to support paginated responses  ([#402](https://github.com/databricks/databricks-sdk-java/pull/402)).
* Update github cache action version from v2 to v4 ([#415](Update github cache action version from v2 to v4))
  
### API Changes
* Added `workspaceClient.forecasting()` service.
* Added `executeMessageAttachmentQuery()`, `getMessageAttachmentQueryResult()` and `getSpace()` methods for `workspaceClient.genie()` service.
* Added `listProviderShareAssets()` method for `workspaceClient.providers()` service.
* Added `budgetPolicyId` and `effectiveBudgetPolicyId` fields for `com.databricks.sdk.service.apps.App`.
* Added `policy` field for `com.databricks.sdk.service.billing.CreateBudgetPolicyRequest`.
* Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.ValidateCredentialRequest`.
* Added `attachmentId` field for `com.databricks.sdk.service.dashboards.GenieAttachment`.
* Added `conversationId` field for `com.databricks.sdk.service.dashboards.GenieConversation`.
* Added `messageId` field for `com.databricks.sdk.service.dashboards.GenieMessage`.
* Added `description`, `id`, `lastUpdatedTimestamp`, `query`, `queryResultMetadata`, `statementId` and `title` fields for `com.databricks.sdk.service.dashboards.GenieQueryAttachment`.
* Added `genAiComputeTask` field for `com.databricks.sdk.service.jobs.RunTask`.
* Added `genAiComputeTask` field for `com.databricks.sdk.service.jobs.SubmitTask`.
* Added `genAiComputeTask` field for `com.databricks.sdk.service.jobs.Task`.
* Added `runName` field for `com.databricks.sdk.service.ml.CreateRun`.
* Added `runName` field for `com.databricks.sdk.service.ml.RunInfo`.
* Added `runName` field for `com.databricks.sdk.service.ml.UpdateRun`.
* Added `lifetime` field for `com.databricks.sdk.service.oauth2.CreateServicePrincipalSecretRequest`.
* Added `expireTime` field for `com.databricks.sdk.service.oauth2.CreateServicePrincipalSecretResponse`.
* Added `expireTime` field for `com.databricks.sdk.service.oauth2.SecretInfo`.
* Added `instanceProfileArn` field for `com.databricks.sdk.service.serving.AmazonBedrockConfig`.
* Added `budgetPolicyId` field for `com.databricks.sdk.service.serving.CreateServingEndpoint`.
* Added `budgetPolicyId` field for `com.databricks.sdk.service.serving.ServingEndpoint`.
* Added `budgetPolicyId` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
* Added `add`, `principal` and `remove` fields for `com.databricks.sdk.service.sharing.PermissionsChange`.
* Added `columnsToRerank` field for `com.databricks.sdk.service.vectorsearch.QueryVectorIndexRequest`.
* Added `ORACLE` and `TERADATA` enum values for `com.databricks.sdk.service.catalog.ConnectionType`.
* Added `COULD_NOT_GET_MODEL_DEPLOYMENTS_EXCEPTION`, `FUNCTION_ARGUMENTS_INVALID_TYPE_EXCEPTION` and `MESSAGE_CANCELLED_WHILE_EXECUTING_EXCEPTION` enum values for `com.databricks.sdk.service.dashboards.MessageErrorType`.
* Added `WAITING` enum value for `com.databricks.sdk.service.jobs.RunLifecycleStateV2State`.
* Added `ACTIVE_ONLY`, `ALL` and `DELETED_ONLY` enum values for `com.databricks.sdk.service.ml.ViewType`.
* Added `OAUTH_CLIENT_CREDENTIALS` enum value for `com.databricks.sdk.service.sharing.AuthenticationType`.
* Added `RAW` enum value for `com.databricks.sdk.service.workspace.ExportFormat`.
* [Breaking] Changed `getByName()` method for `workspaceClient.experiments()` service to return `com.databricks.sdk.service.ml.GetExperimentByNameResponse` class.
* [Breaking] Changed `logInputs()` method for `workspaceClient.experiments()` service with new required argument order.
* [Breaking] Changed `sharePermissions()` method for `workspaceClient.shares()` service to return `com.databricks.sdk.service.sharing.GetSharePermissionsResponse` class.
* [Breaking] Changed `sharePermissions()` and `updatePermissions()` methods for `workspaceClient.shares()` service return type to become non-empty.
* [Breaking] Changed `updatePermissions()` method for `workspaceClient.shares()` service to return `com.databricks.sdk.service.sharing.UpdateSharePermissionsResponse` class.
* Changed `policyId` field for `com.databricks.sdk.service.billing.BudgetPolicy` to no longer be required.
* [Breaking] Changed `policyId` field for `com.databricks.sdk.service.billing.BudgetPolicy` to no longer be required.
* [Breaking] Changed `partitions` field for `com.databricks.sdk.service.cleanrooms.CleanRoomAssetTableLocalDetails` to type `com.databricks.sdk.service.cleanrooms.PartitionList` class.
* [Breaking] Changed `query` field for `com.databricks.sdk.service.dashboards.GenieAttachment` to type `com.databricks.sdk.service.dashboards.GenieQueryAttachment` class.
* [Breaking] Changed `digest`, `name`, `source` and `sourceType` fields for `com.databricks.sdk.service.ml.Dataset` to be required.
* Changed `digest`, `name`, `source` and `sourceType` fields for `com.databricks.sdk.service.ml.Dataset` to be required.
* Changed `dataset` field for `com.databricks.sdk.service.ml.DatasetInput` to be required.
* [Breaking] Changed `dataset` field for `com.databricks.sdk.service.ml.DatasetInput` to be required.
* [Breaking] Changed `key` and `value` fields for `com.databricks.sdk.service.ml.InputTag` to be required.
* Changed `key` and `value` fields for `com.databricks.sdk.service.ml.InputTag` to be required.
* [Breaking] Changed `viewType` field for `com.databricks.sdk.service.ml.ListExperimentsRequest` to type `com.databricks.sdk.service.ml.ViewType` class.
* [Breaking] Changed `runId` field for `com.databricks.sdk.service.ml.LogInputs` to be required.
* [Breaking] Changed `viewType` field for `com.databricks.sdk.service.ml.SearchExperiments` to type `com.databricks.sdk.service.ml.ViewType` class.
* [Breaking] Changed `runViewType` field for `com.databricks.sdk.service.ml.SearchRuns` to type `com.databricks.sdk.service.ml.ViewType` class.
* [Breaking] Removed `customTags` and `policyName` fields for `com.databricks.sdk.service.billing.CreateBudgetPolicyRequest`.
* [Breaking] Removed `cachedQuerySchema`, `description`, `id`, `instructionId`, `instructionTitle`, `lastUpdatedTimestamp`, `query`, `statementId` and `title` fields for `com.databricks.sdk.service.dashboards.QueryAttachment`.
* [Breaking] Removed `maxResults` and `pageToken` fields for `com.databricks.sdk.service.sharing.UpdateSharePermissions`.
* [Breaking] Removed `ACTIVE_ONLY`, `ALL` and `DELETED_ONLY` enum values for `com.databricks.sdk.service.ml.SearchExperimentsViewType`.
* [Breaking] Removed `ACTIVE_ONLY`, `ALL` and `DELETED_ONLY` enum values for `com.databricks.sdk.service.ml.SearchRunsRunViewType`.
