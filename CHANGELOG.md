# Version changelog

## 0.3.0

* Handled nested query parameters in ApiClient.withQuery ([#125](https://github.com/databricks/databricks-sdk-java/pull/125)). This fixes issues with filters when listing query history.

API Changes:

 * Changed `create()` method for `accountClient.metastoreAssignments()` service to no longer return `com.databricks.sdk.service.catalog.CreateMetastoreAssignmentsResponseItemList` class.
 * Added `connectionName` field for `com.databricks.sdk.service.catalog.CreateCatalog`.
 * Added `accessPoint` field for `com.databricks.sdk.service.catalog.CreateExternalLocation`.
 * Added `encryptionDetails` field for `com.databricks.sdk.service.catalog.CreateExternalLocation`.
 * Removed `com.databricks.sdk.service.catalog.CreateMetastoreAssignmentsResponseItem` class.
 * Added `accessPoint` field for `com.databricks.sdk.service.catalog.ExternalLocationInfo`.
 * Added `encryptionDetails` field for `com.databricks.sdk.service.catalog.ExternalLocationInfo`.
 * Added `accessPoint` field for `com.databricks.sdk.service.catalog.TableInfo`.
 * Added `encryptionDetails` field for `com.databricks.sdk.service.catalog.TableInfo`.
 * Added `accessPoint` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
 * Added `encryptionDetails` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
 * Added `accessPoint` field for `com.databricks.sdk.service.catalog.VolumeInfo`.
 * Added `encryptionDetails` field for `com.databricks.sdk.service.catalog.VolumeInfo`.
 * Added `com.databricks.sdk.service.catalog.EncryptionDetails` class.
 * Added `com.databricks.sdk.service.catalog.SseEncryptionDetails` class.
 * Added `com.databricks.sdk.service.catalog.SseEncryptionDetailsAlgorithm` class.
 * Added `accountClient.networkPolicy()` service.
 * Added `com.databricks.sdk.service.settings.AccountNetworkPolicyMessage` class.
 * Added `com.databricks.sdk.service.settings.DeleteAccountNetworkPolicyRequest` class.
 * Added `com.databricks.sdk.service.settings.DeleteAccountNetworkPolicyResponse` class.
 * Added `com.databricks.sdk.service.settings.ReadAccountNetworkPolicyRequest` class.
 * Added `com.databricks.sdk.service.settings.UpdateAccountNetworkPolicyRequest` class.

OpenAPI SHA: fbdd0fa3e83fed2c798a58d376529bdb1285b915, Date: 2023-07-26


## 0.2.0

* Synchronize auth permutation tests with Go SDK ([#108](https://github.com/databricks/databricks-sdk-java/pull/108)).
* Regenerated from OpenAPI spec ([#112](https://github.com/databricks/databricks-sdk-java/pull/112)).
* Add issue template ([#113](https://github.com/databricks/databricks-sdk-java/pull/113)).
* Add accounts-dod support in the Java SDK ([#114](https://github.com/databricks/databricks-sdk-java/pull/114)).
* Regenerate Java SDK using recent OpenAPI Specification ([#115](https://github.com/databricks/databricks-sdk-java/pull/115)).
* Rerun OpenAPI Generator ([#117](https://github.com/databricks/databricks-sdk-java/pull/117)).
* Integrate with auto-release toolchain ([#118](https://github.com/databricks/databricks-sdk-java/pull/118)).
* Updated CLI token source `parseExpiry` method to account for different time format ([#116](https://github.com/databricks/databricks-sdk-java/pull/116)).
* Added support for using new `databricks` CLI with backwards compatibility check ([#121](https://github.com/databricks/databricks-sdk-java/pull/121)).

API Changes:

 * Changed `create()` method for `accountClient.metastoreAssignments()` service . New request type is `com.databricks.sdk.service.catalog.AccountsCreateMetastoreAssignment` class.
 * Changed `create()` method for `accountClient.metastoreAssignments()` service to return `com.databricks.sdk.service.catalog.CreateMetastoreAssignmentsResponseItemList` class.
 * Changed `get()` method for `accountClient.metastoreAssignments()` service to return `com.databricks.sdk.service.catalog.AccountsMetastoreAssignment` class.
 * Changed `update()` method for `accountClient.metastoreAssignments()` service . New request type is `com.databricks.sdk.service.catalog.AccountsUpdateMetastoreAssignment` class.
 * Changed `update()` method for `accountClient.metastoreAssignments()` service to no longer return `com.databricks.sdk.service.catalog.MetastoreAssignment` class.
 * Changed `create()` method for `accountClient.metastores()` service . New request type is `com.databricks.sdk.service.catalog.AccountsCreateMetastore` class.
 * Changed `create()` method for `accountClient.metastores()` service to return `com.databricks.sdk.service.catalog.AccountsMetastoreInfo` class.
 * Changed `get()` method for `accountClient.metastores()` service to return `com.databricks.sdk.service.catalog.AccountsMetastoreInfo` class.
 * Changed `update()` method for `accountClient.metastores()` service . New request type is `com.databricks.sdk.service.catalog.AccountsUpdateMetastore` class.
 * Changed `update()` method for `accountClient.metastores()` service to return `com.databricks.sdk.service.catalog.AccountsMetastoreInfo` class.
 * Changed `create()` method for `accountClient.storageCredentials()` service . New request type is `com.databricks.sdk.service.catalog.AccountsCreateStorageCredential` class.
 * Changed `update()` method for `accountClient.storageCredentials()` service . New request type is `com.databricks.sdk.service.catalog.AccountsUpdateStorageCredential` class.
 * Removed `maintenance()` method for `workspaceClient.metastores()` service.
 * Added `enableOptimization()` method for `workspaceClient.metastores()` service.
 * Added `update()` method for `workspaceClient.tables()` service.
 * Changed `get()` method for `workspaceClient.workspaceBindings()` service to return `com.databricks.sdk.service.catalog.CurrentWorkspaceBindings` class.
 * Changed `update()` method for `workspaceClient.workspaceBindings()` service to return `com.databricks.sdk.service.catalog.CurrentWorkspaceBindings` class.
 * Added `workspaceClient.connections()` service.
 * Added `workspaceClient.systemSchemas()` service.
 * Added `connectionName` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Added `options` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Removed `gcpServiceAccountKey` field for `com.databricks.sdk.service.catalog.CreateStorageCredential`.
 * Removed `metastoreId` field for `com.databricks.sdk.service.catalog.CreateStorageCredential`.
 * Added `azureManagedIdentity` field for `com.databricks.sdk.service.catalog.CreateStorageCredential`.
 * Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.CreateStorageCredential`.
 * Added `force` field for `com.databricks.sdk.service.catalog.DeleteAccountMetastoreRequest`.
 * Added `force` field for `com.databricks.sdk.service.catalog.DeleteAccountStorageCredentialRequest`.
 * Removed `com.databricks.sdk.service.catalog.GcpServiceAccountKey` class.
 * Removed `schemas` field for `com.databricks.sdk.service.catalog.ListFunctionsResponse`.
 * Added `functions` field for `com.databricks.sdk.service.catalog.ListFunctionsResponse`.
 * Removed `gcpServiceAccountKey` field for `com.databricks.sdk.service.catalog.StorageCredentialInfo`.
 * Added `azureManagedIdentity` field for `com.databricks.sdk.service.catalog.StorageCredentialInfo`.
 * Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.StorageCredentialInfo`.
 * Removed `com.databricks.sdk.service.catalog.UpdateAutoMaintenance` class.
 * Removed `com.databricks.sdk.service.catalog.UpdateAutoMaintenanceResponse` class.
 * Removed `metastoreId` field for `com.databricks.sdk.service.catalog.UpdateMetastore`.
 * Removed `gcpServiceAccountKey` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Removed `metastoreId` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Added `azureManagedIdentity` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Changed `assignWorkspaces` field for `com.databricks.sdk.service.catalog.UpdateWorkspaceBindings` to `com.databricks.sdk.service.catalog.List` class.
 * Changed `unassignWorkspaces` field for `com.databricks.sdk.service.catalog.UpdateWorkspaceBindings` to `com.databricks.sdk.service.catalog.List` class.
 * Removed `gcpServiceAccountKey` field for `com.databricks.sdk.service.catalog.ValidateStorageCredential`.
 * Added `azureManagedIdentity` field for `com.databricks.sdk.service.catalog.ValidateStorageCredential`.
 * Added `databricksGcpServiceAccount` field for `com.databricks.sdk.service.catalog.ValidateStorageCredential`.
 * Removed `com.databricks.sdk.service.catalog.WorkspaceId` class.
 * Added `com.databricks.sdk.service.catalog.AccountsCreateMetastore` class.
 * Added `com.databricks.sdk.service.catalog.AccountsCreateMetastoreAssignment` class.
 * Added `com.databricks.sdk.service.catalog.AccountsCreateStorageCredential` class.
 * Added `com.databricks.sdk.service.catalog.AccountsMetastoreAssignment` class.
 * Added `com.databricks.sdk.service.catalog.AccountsMetastoreInfo` class.
 * Added `com.databricks.sdk.service.catalog.AccountsUpdateMetastore` class.
 * Added `com.databricks.sdk.service.catalog.AccountsUpdateMetastoreAssignment` class.
 * Added `com.databricks.sdk.service.catalog.AccountsUpdateStorageCredential` class.
 * Added `com.databricks.sdk.service.catalog.AzureManagedIdentity` class.
 * Added `com.databricks.sdk.service.catalog.ConnectionInfo` class.
 * Added `com.databricks.sdk.service.catalog.ConnectionType` class.
 * Added `com.databricks.sdk.service.catalog.CreateConnection` class.
 * Added `com.databricks.sdk.service.catalog.CreateMetastoreAssignmentsResponseItem` class.
 * Added `com.databricks.sdk.service.catalog.CredentialType` class.
 * Added `com.databricks.sdk.service.catalog.CurrentWorkspaceBindings` class.
 * Added `com.databricks.sdk.service.catalog.DatabricksGcpServiceAccountResponse` class.
 * Added `com.databricks.sdk.service.catalog.DeleteConnectionRequest` class.
 * Added `com.databricks.sdk.service.catalog.DisableRequest` class.
 * Added `com.databricks.sdk.service.catalog.DisableSchemaName` class.
 * Added `com.databricks.sdk.service.catalog.EnableRequest` class.
 * Added `com.databricks.sdk.service.catalog.EnableSchemaName` class.
 * Added `com.databricks.sdk.service.catalog.GetConnectionRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListConnectionsResponse` class.
 * Added `com.databricks.sdk.service.catalog.ListSystemSchemasRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListSystemSchemasResponse` class.
 * Added `com.databricks.sdk.service.catalog.PropertiesKvPairs` class.
 * Added `com.databricks.sdk.service.catalog.SecurableOptionsMap` class.
 * Added `com.databricks.sdk.service.catalog.SystemSchemaInfo` class.
 * Added `com.databricks.sdk.service.catalog.SystemSchemaInfoState` class.
 * Added `com.databricks.sdk.service.catalog.UpdateConnection` class.
 * Added `com.databricks.sdk.service.catalog.UpdatePredictiveOptimization` class.
 * Added `com.databricks.sdk.service.catalog.UpdatePredictiveOptimizationResponse` class.
 * Added `com.databricks.sdk.service.catalog.UpdateTableRequest` class.
 * Changed `get()` method for `workspaceClient.clusters()` service to return `com.databricks.sdk.service.compute.ClusterDetails` class.
 * Removed `com.databricks.sdk.service.compute.BaseClusterInfo` class.
 * Added `dataSecurityMode` field for `com.databricks.sdk.service.compute.ClusterAttributes`.
 * Added `dockerImage` field for `com.databricks.sdk.service.compute.ClusterAttributes`.
 * Added `singleUserName` field for `com.databricks.sdk.service.compute.ClusterAttributes`.
 * Removed `com.databricks.sdk.service.compute.ClusterInfo` class.
 * Added `gcpAttributes` field for `com.databricks.sdk.service.compute.CreateInstancePool`.
 * Added `dataSecurityMode` field for `com.databricks.sdk.service.compute.EditCluster`.
 * Added `dockerImage` field for `com.databricks.sdk.service.compute.EditCluster`.
 * Added `singleUserName` field for `com.databricks.sdk.service.compute.EditCluster`.
 * Added `gcpAttributes` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Added `localSsdCount` field for `com.databricks.sdk.service.compute.GcpAttributes`.
 * Added `gcpAttributes` field for `com.databricks.sdk.service.compute.GetInstancePool`.
 * Added `gcpAttributes` field for `com.databricks.sdk.service.compute.InstancePoolAndStats`.
 * Changed `clusters` field for `com.databricks.sdk.service.compute.ListClustersResponse` to `com.databricks.sdk.service.compute.ClusterDetailsList` class.
 * Added `com.databricks.sdk.service.compute.ClusterDetails` class.
 * Added `com.databricks.sdk.service.compute.ClusterSpec` class.
 * Added `com.databricks.sdk.service.compute.ComputeSpec` class.
 * Added `com.databricks.sdk.service.compute.ComputeSpecKind` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolGcpAttributes` class.
 * Added `accountClient.accessControl()` service.
 * Added `workspaceClient.accessControlProxy()` service.
 * Added `meta` field for `com.databricks.sdk.service.iam.Group`.
 * Added `schema` field for `com.databricks.sdk.service.iam.PartialUpdate`.
 * Added `com.databricks.sdk.service.iam.GetAssignableRolesForResourceRequest` class.
 * Added `com.databricks.sdk.service.iam.GetAssignableRolesForResourceResponse` class.
 * Added `com.databricks.sdk.service.iam.GetRuleSetRequest` class.
 * Added `com.databricks.sdk.service.iam.GrantRule` class.
 * Added `com.databricks.sdk.service.iam.PatchSchema` class.
 * Added `com.databricks.sdk.service.iam.Principal` class.
 * Added `com.databricks.sdk.service.iam.ResourceMeta` class.
 * Added `com.databricks.sdk.service.iam.RuleSetResponse` class.
 * Added `com.databricks.sdk.service.iam.RuleSetUpdateRequest` class.
 * Added `com.databricks.sdk.service.iam.UpdateRuleSetRequest` class.
 * Added `jobParameters` field for `com.databricks.sdk.service.jobs.BaseRun`.
 * Added `triggerInfo` field for `com.databricks.sdk.service.jobs.BaseRun`.
 * Changed `newCluster` field for `com.databricks.sdk.service.jobs.ClusterSpec` to `com.databricks.sdk.service.compute.ClusterSpec` class.
 * Changed `pauseStatus` field for `com.databricks.sdk.service.jobs.Continuous` to `com.databricks.sdk.service.jobs.PauseStatus` class.
 * Removed `com.databricks.sdk.service.jobs.ContinuousPauseStatus` class.
 * Changed `format` field for `com.databricks.sdk.service.jobs.CreateJob` to `com.databricks.sdk.service.jobs.Format` class.
 * Changed `tasks` field for `com.databricks.sdk.service.jobs.CreateJob` to `com.databricks.sdk.service.jobs.TaskList` class.
 * Changed `webhookNotifications` field for `com.databricks.sdk.service.jobs.CreateJob` to `com.databricks.sdk.service.jobs.WebhookNotifications` class.
 * Added `compute` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `health` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `parameters` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `runAs` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Removed `com.databricks.sdk.service.jobs.CreateJobFormat` class.
 * Changed `pauseStatus` field for `com.databricks.sdk.service.jobs.CronSchedule` to `com.databricks.sdk.service.jobs.PauseStatus` class.
 * Removed `com.databricks.sdk.service.jobs.CronSchedulePauseStatus` class.
 * Removed `com.databricks.sdk.service.jobs.FileArrivalTriggerSettings` class.
 * Changed `gitProvider` field for `com.databricks.sdk.service.jobs.GitSource` to `com.databricks.sdk.service.jobs.GitProvider` class.
 * Added `jobSource` field for `com.databricks.sdk.service.jobs.GitSource`.
 * Removed `com.databricks.sdk.service.jobs.GitSourceGitProvider` class.
 * Changed `newCluster` field for `com.databricks.sdk.service.jobs.JobCluster` to `com.databricks.sdk.service.compute.ClusterSpec` class.
 * Added `onDurationWarningThresholdExceeded` field for `com.databricks.sdk.service.jobs.JobEmailNotifications`.
 * Changed `format` field for `com.databricks.sdk.service.jobs.JobSettings` to `com.databricks.sdk.service.jobs.Format` class.
 * Changed `tasks` field for `com.databricks.sdk.service.jobs.JobSettings` to `com.databricks.sdk.service.jobs.TaskList` class.
 * Changed `webhookNotifications` field for `com.databricks.sdk.service.jobs.JobSettings` to `com.databricks.sdk.service.jobs.WebhookNotifications` class.
 * Added `compute` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `health` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `parameters` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `runAs` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Removed `com.databricks.sdk.service.jobs.JobSettingsFormat` class.
 * Removed `com.databricks.sdk.service.jobs.JobTaskSettings` class.
 * Removed `com.databricks.sdk.service.jobs.JobWebhookNotifications` class.
 * Removed `com.databricks.sdk.service.jobs.JobWebhookNotificationsOnFailureItem` class.
 * Removed `com.databricks.sdk.service.jobs.JobWebhookNotificationsOnStartItem` class.
 * Removed `com.databricks.sdk.service.jobs.JobWebhookNotificationsOnSuccessItem` class.
 * Added `pageToken` field for `com.databricks.sdk.service.jobs.ListJobsRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.jobs.ListJobsResponse`.
 * Added `prevPageToken` field for `com.databricks.sdk.service.jobs.ListJobsResponse`.
 * Added `pageToken` field for `com.databricks.sdk.service.jobs.ListRunsRequest`.
 * Added `nextPageToken` field for `com.databricks.sdk.service.jobs.ListRunsResponse`.
 * Added `prevPageToken` field for `com.databricks.sdk.service.jobs.ListRunsResponse`.
 * Changed `source` field for `com.databricks.sdk.service.jobs.NotebookTask` to `com.databricks.sdk.service.jobs.Source` class.
 * Removed `com.databricks.sdk.service.jobs.NotebookTaskSource` class.
 * Added `rerunDependentTasks` field for `com.databricks.sdk.service.jobs.RepairRun`.
 * Added `jobParameters` field for `com.databricks.sdk.service.jobs.Run`.
 * Added `triggerInfo` field for `com.databricks.sdk.service.jobs.Run`.
 * Added `jobParameters` field for `com.databricks.sdk.service.jobs.RunNow`.
 * Added `conditionTask` field for `com.databricks.sdk.service.jobs.RunOutput`.
 * Added `runJobOutput` field for `com.databricks.sdk.service.jobs.RunOutput`.
 * Removed `com.databricks.sdk.service.jobs.RunSubmitTaskSettings` class.
 * Changed `dependsOn` field for `com.databricks.sdk.service.jobs.RunTask` to `com.databricks.sdk.service.jobs.TaskDependencyList` class.
 * Changed `newCluster` field for `com.databricks.sdk.service.jobs.RunTask` to `com.databricks.sdk.service.compute.ClusterSpec` class.
 * Added `conditionTask` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Added `resolvedValues` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Added `runIf` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Added `runJobTask` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Changed `source` field for `com.databricks.sdk.service.jobs.SparkPythonTask` to `com.databricks.sdk.service.jobs.Source` class.
 * Removed `com.databricks.sdk.service.jobs.SparkPythonTaskSource` class.
 * Changed `widgets` field for `com.databricks.sdk.service.jobs.SqlDashboardOutput` to `com.databricks.sdk.service.jobs.SqlDashboardWidgetOutputList` class.
 * Changed `tasks` field for `com.databricks.sdk.service.jobs.SubmitRun` to `com.databricks.sdk.service.jobs.SubmitTaskList` class.
 * Changed `webhookNotifications` field for `com.databricks.sdk.service.jobs.SubmitRun` to `com.databricks.sdk.service.jobs.WebhookNotifications` class.
 * Added `emailNotifications` field for `com.databricks.sdk.service.jobs.SubmitRun`.
 * Added `health` field for `com.databricks.sdk.service.jobs.SubmitRun`.
 * Removed `com.databricks.sdk.service.jobs.TaskDependenciesItem` class.
 * Added `onDurationWarningThresholdExceeded` field for `com.databricks.sdk.service.jobs.TaskEmailNotifications`.
 * Changed `fileArrival` field for `com.databricks.sdk.service.jobs.TriggerSettings` to `com.databricks.sdk.service.jobs.FileArrivalTriggerConfiguration` class.
 * Changed `pauseStatus` field for `com.databricks.sdk.service.jobs.TriggerSettings` to `com.databricks.sdk.service.jobs.PauseStatus` class.
 * Removed `com.databricks.sdk.service.jobs.TriggerSettingsPauseStatus` class.
 * Added `com.databricks.sdk.service.jobs.ConditionTask` class.
 * Added `com.databricks.sdk.service.jobs.ConditionTaskOp` class.
 * Added `com.databricks.sdk.service.jobs.FileArrivalTriggerConfiguration` class.
 * Added `com.databricks.sdk.service.jobs.Format` class.
 * Added `com.databricks.sdk.service.jobs.GitProvider` class.
 * Added `com.databricks.sdk.service.jobs.JobCompute` class.
 * Added `com.databricks.sdk.service.jobs.JobParameter` class.
 * Added `com.databricks.sdk.service.jobs.JobParameterDefinition` class.
 * Added `com.databricks.sdk.service.jobs.JobRunAs` class.
 * Added `com.databricks.sdk.service.jobs.JobSource` class.
 * Added `com.databricks.sdk.service.jobs.JobSourceDirtyState` class.
 * Added `com.databricks.sdk.service.jobs.JobsHealthMetric` class.
 * Added `com.databricks.sdk.service.jobs.JobsHealthOperator` class.
 * Added `com.databricks.sdk.service.jobs.JobsHealthRule` class.
 * Added `com.databricks.sdk.service.jobs.JobsHealthRules` class.
 * Added `com.databricks.sdk.service.jobs.ParamPairs` class.
 * Added `com.databricks.sdk.service.jobs.PauseStatus` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedConditionTaskValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedDbtTaskValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedNotebookTaskValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedParamPairValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedPythonWheelTaskValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedRunJobTaskValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedStringParamsValues` class.
 * Added `com.databricks.sdk.service.jobs.ResolvedValues` class.
 * Added `com.databricks.sdk.service.jobs.RunConditionTask` class.
 * Added `com.databricks.sdk.service.jobs.RunConditionTaskOp` class.
 * Added `com.databricks.sdk.service.jobs.RunIf` class.
 * Added `com.databricks.sdk.service.jobs.RunJobOutput` class.
 * Added `com.databricks.sdk.service.jobs.RunJobTask` class.
 * Added `com.databricks.sdk.service.jobs.Source` class.
 * Added `com.databricks.sdk.service.jobs.SubmitTask` class.
 * Added `com.databricks.sdk.service.jobs.Task` class.
 * Added `com.databricks.sdk.service.jobs.TaskDependency` class.
 * Added `com.databricks.sdk.service.jobs.TriggerInfo` class.
 * Added `com.databricks.sdk.service.jobs.Webhook` class.
 * Added `com.databricks.sdk.service.jobs.WebhookNotifications` class.
 * Added `com.databricks.sdk.service.jobs.WebhookNotificationsOnDurationWarningThresholdExceededItem` class.
 * Removed `registeredModel` field for `com.databricks.sdk.service.ml.GetModelResponse`.
 * Added `registeredModelDatabricks` field for `com.databricks.sdk.service.ml.GetModelResponse`.
 * Removed `whl` field for `com.databricks.sdk.service.pipelines.PipelineLibrary`.
 * Added `environmentVars` field for `com.databricks.sdk.service.serving.ServedModelInput`.
 * Added `environmentVars` field for `com.databricks.sdk.service.serving.ServedModelOutput`.
 * Added `accountClient.settings()` service.
 * Added `com.databricks.sdk.service.settings.DeletePersonalComputeSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.DeletePersonalComputeSettingResponse` class.
 * Added `com.databricks.sdk.service.settings.PersonalComputeMessage` class.
 * Added `com.databricks.sdk.service.settings.PersonalComputeMessageEnum` class.
 * Added `com.databricks.sdk.service.settings.PersonalComputeSetting` class.
 * Added `com.databricks.sdk.service.settings.ReadPersonalComputeSettingRequest` class.
 * Added `com.databricks.sdk.service.settings.UpdatePersonalComputeSettingRequest` class.
 * Added `workspaceClient.cleanRooms()` service.
 * Added `historyDataSharingStatus` field for `com.databricks.sdk.service.sharing.SharedDataObject`.
 * Added `com.databricks.sdk.service.sharing.CentralCleanRoomInfo` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomAssetInfo` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomCatalog` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomCatalogUpdate` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomCollaboratorInfo` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomInfo` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomNotebookInfo` class.
 * Added `com.databricks.sdk.service.sharing.CleanRoomTableInfo` class.
 * Added `com.databricks.sdk.service.sharing.ColumnInfo` class.
 * Added `com.databricks.sdk.service.sharing.ColumnMask` class.
 * Added `com.databricks.sdk.service.sharing.ColumnTypeName` class.
 * Added `com.databricks.sdk.service.sharing.CreateCleanRoom` class.
 * Added `com.databricks.sdk.service.sharing.DeleteCleanRoomRequest` class.
 * Added `com.databricks.sdk.service.sharing.GetCleanRoomRequest` class.
 * Added `com.databricks.sdk.service.sharing.ListCleanRoomsResponse` class.
 * Added `com.databricks.sdk.service.sharing.SharedDataObjectHistoryDataSharingStatus` class.
 * Added `com.databricks.sdk.service.sharing.UpdateCleanRoom` class.
 * Changed `query` field for `com.databricks.sdk.service.sql.Alert` to `com.databricks.sdk.service.sql.AlertQuery` class.
 * Changed `value` field for `com.databricks.sdk.service.sql.AlertOptions` to `Object` class.
 * Removed `isDbAdmin` field for `com.databricks.sdk.service.sql.User`.
 * Removed `profileImageUrl` field for `com.databricks.sdk.service.sql.User`.
 * Added `com.databricks.sdk.service.sql.AlertQuery` class.
 * Removed `keyvaultMetadata` field for `com.databricks.sdk.service.workspace.CreateScope`.
 * Added `backendAzureKeyvault` field for `com.databricks.sdk.service.workspace.CreateScope`.
 * Changed `format` field for `com.databricks.sdk.service.workspace.Import` to `com.databricks.sdk.service.workspace.ImportFormat` class.
 * Added `com.databricks.sdk.service.workspace.ImportFormat` class.

OpenAPI SHA: 0a1949ba96f71680dad30e06973eaae85b1307bb, Date: 2023-07-18

Dependency updates:

 * Bump commons-io from 2.12.0 to 2.13.0 ([#105](https://github.com/databricks/databricks-sdk-java/pull/105)).
 * Bump jackson.version from 2.15.1 to 2.15.2 ([#101](https://github.com/databricks/databricks-sdk-java/pull/101)).
 * Bump maven-failsafe-plugin from 3.1.0 to 3.1.2 ([#103](https://github.com/databricks/databricks-sdk-java/pull/103)).

## 0.1.1

 * Usable version
