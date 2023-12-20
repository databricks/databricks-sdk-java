# Version changelog

## 0.15.0

* Better Java examples ([#200](https://github.com/databricks/databricks-sdk-java/pull/200)).

API Changes:

 * Added `azureWorkspaceInfo` field for `com.databricks.sdk.service.provisioning.Workspace`.
 * Added `com.databricks.sdk.service.provisioning.AzureWorkspaceInfo` class.
 * Changed `updateConfig()` method for `workspaceClient.servingEndpoints()` service with new required argument order.
 * Changed `servedEntities` field for `com.databricks.sdk.service.serving.EndpointCoreConfigInput` to no longer be required.
 * Changed `create()` method for `accountClient.ipAccessLists()` service with new required argument order.
 * Changed `replace()` method for `accountClient.ipAccessLists()` service with new required argument order.
 * Changed `update()` method for `accountClient.ipAccessLists()` service with new required argument order.
 * Changed `create()` method for `workspaceClient.ipAccessLists()` service with new required argument order.
 * Changed `replace()` method for `workspaceClient.ipAccessLists()` service with new required argument order.
 * Changed `update()` method for `workspaceClient.ipAccessLists()` service with new required argument order.
 * Changed `ipAddresses` field for `com.databricks.sdk.service.settings.CreateIpAccessList` to no longer be required.
 * Changed `ipAddresses` field for `com.databricks.sdk.service.settings.ReplaceIpAccessList` to no longer be required.
 * Removed `listId` field for `com.databricks.sdk.service.settings.ReplaceIpAccessList`.
 * Changed `enabled` field for `com.databricks.sdk.service.settings.UpdateIpAccessList` to no longer be required.
 * Changed `ipAddresses` field for `com.databricks.sdk.service.settings.UpdateIpAccessList` to no longer be required.
 * Changed `label` field for `com.databricks.sdk.service.settings.UpdateIpAccessList` to no longer be required.
 * Removed `listId` field for `com.databricks.sdk.service.settings.UpdateIpAccessList`.
 * Changed `listType` field for `com.databricks.sdk.service.settings.UpdateIpAccessList` to no longer be required.

OpenAPI SHA: d3853c8dee5806d04da2ae8910f273ffb35719a5, Date: 2023-12-14


## 0.14.0

Other changes:

* Added support for GCP auth ([#196](https://github.com/databricks/databricks-sdk-java/pull/196)).

API Changes:

 * Changed `update()` method for `workspaceClient.connections()` service with new required argument order.
 * Added `cloudflareApiToken` field for `com.databricks.sdk.service.catalog.CreateStorageCredential`.
 * Added `cloudflareApiToken` field for `com.databricks.sdk.service.catalog.StorageCredentialInfo`.
 * Changed `name` field for `com.databricks.sdk.service.catalog.UpdateCatalog` to be required.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateCatalog`.
 * Changed `name` field for `com.databricks.sdk.service.catalog.UpdateConnection` to no longer be required.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateConnection`.
 * Changed `name` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation` to be required.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateMetastore`.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateRegisteredModelRequest`.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateSchema`.
 * Changed `name` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential` to be required.
 * Added `cloudflareApiToken` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateStorageCredential`.
 * Added `newName` field for `com.databricks.sdk.service.catalog.UpdateVolumeRequestContent`.
 * Added `cloudflareApiToken` field for `com.databricks.sdk.service.catalog.ValidateStorageCredential`.
 * Added `com.databricks.sdk.service.catalog.CloudflareApiToken` class.
 * Removed `continuous` field for `com.databricks.sdk.service.jobs.BaseRun`.
 * Removed `continuous` field for `com.databricks.sdk.service.jobs.Run`.
 * Changed `jobParameters` field for `com.databricks.sdk.service.jobs.RunJobTask` to `com.databricks.sdk.service.jobs.ParamPairs` class.
 * Added `runIf` field for `com.databricks.sdk.service.jobs.SubmitTask`.
 * Added `runJobTask` field for `com.databricks.sdk.service.jobs.SubmitTask`.
 * Changed `updateConfig()` method for `workspaceClient.servingEndpoints()` service with new required argument order.
 * Added `put()` method for `workspaceClient.servingEndpoints()` service.
 * Added `rateLimits` field for `com.databricks.sdk.service.serving.CreateServingEndpoint`.
 * Changed `servedModels` field for `com.databricks.sdk.service.serving.EndpointCoreConfigInput` to no longer be required.
 * Added `autoCaptureConfig` field for `com.databricks.sdk.service.serving.EndpointCoreConfigInput`.
 * Added `servedEntities` field for `com.databricks.sdk.service.serving.EndpointCoreConfigInput`.
 * Added `autoCaptureConfig` field for `com.databricks.sdk.service.serving.EndpointCoreConfigOutput`.
 * Added `servedEntities` field for `com.databricks.sdk.service.serving.EndpointCoreConfigOutput`.
 * Added `servedEntities` field for `com.databricks.sdk.service.serving.EndpointCoreConfigSummary`.
 * Added `servedEntities` field for `com.databricks.sdk.service.serving.EndpointPendingConfig`.
 * Added `extraParams` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `input` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `maxTokens` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `messages` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `n` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `prompt` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `stop` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `stream` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Added `temperature` field for `com.databricks.sdk.service.serving.QueryEndpointInput`.
 * Changed `predictions` field for `com.databricks.sdk.service.serving.QueryEndpointResponse` to no longer be required.
 * Added `choices` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Added `created` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Added `data` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Added `id` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Added `model` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Added `object` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Added `usage` field for `com.databricks.sdk.service.serving.QueryEndpointResponse`.
 * Changed `workloadSize` field for `com.databricks.sdk.service.serving.ServedModelInput` to `com.databricks.sdk.service.serving.ServedModelInputWorkloadSize` class.
 * Changed `workloadType` field for `com.databricks.sdk.service.serving.ServedModelInput` to `com.databricks.sdk.service.serving.ServedModelInputWorkloadType` class.
 * Added `task` field for `com.databricks.sdk.service.serving.ServingEndpoint`.
 * Added `task` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
 * Added `com.databricks.sdk.service.serving.Ai21LabsConfig` class.
 * Added `com.databricks.sdk.service.serving.AnthropicConfig` class.
 * Added `com.databricks.sdk.service.serving.AutoCaptureConfigInput` class.
 * Added `com.databricks.sdk.service.serving.AutoCaptureConfigOutput` class.
 * Added `com.databricks.sdk.service.serving.AutoCaptureState` class.
 * Added `com.databricks.sdk.service.serving.AwsBedrockConfig` class.
 * Added `com.databricks.sdk.service.serving.AwsBedrockConfigBedrockProvider` class.
 * Added `com.databricks.sdk.service.serving.ChatMessage` class.
 * Added `com.databricks.sdk.service.serving.ChatMessageRole` class.
 * Added `com.databricks.sdk.service.serving.CohereConfig` class.
 * Added `com.databricks.sdk.service.serving.DatabricksModelServingConfig` class.
 * Added `com.databricks.sdk.service.serving.EmbeddingsV1ResponseEmbeddingElement` class.
 * Added `com.databricks.sdk.service.serving.EmbeddingsV1ResponseEmbeddingElementObject` class.
 * Added `com.databricks.sdk.service.serving.ExternalModel` class.
 * Added `com.databricks.sdk.service.serving.ExternalModelConfig` class.
 * Added `com.databricks.sdk.service.serving.ExternalModelProvider` class.
 * Added `com.databricks.sdk.service.serving.ExternalModelUsageElement` class.
 * Added `com.databricks.sdk.service.serving.FoundationModel` class.
 * Added `com.databricks.sdk.service.serving.OpenAiConfig` class.
 * Added `com.databricks.sdk.service.serving.PaLmConfig` class.
 * Added `com.databricks.sdk.service.serving.PayloadTable` class.
 * Added `com.databricks.sdk.service.serving.PutRequest` class.
 * Added `com.databricks.sdk.service.serving.PutResponse` class.
 * Added `com.databricks.sdk.service.serving.QueryEndpointResponseObject` class.
 * Added `com.databricks.sdk.service.serving.RateLimit` class.
 * Added `com.databricks.sdk.service.serving.RateLimitKey` class.
 * Added `com.databricks.sdk.service.serving.RateLimitRenewalPeriod` class.
 * Added `com.databricks.sdk.service.serving.ServedEntityInput` class.
 * Added `com.databricks.sdk.service.serving.ServedEntityOutput` class.
 * Added `com.databricks.sdk.service.serving.ServedEntitySpec` class.
 * Added `com.databricks.sdk.service.serving.ServedModelInputWorkloadSize` class.
 * Added `com.databricks.sdk.service.serving.ServedModelInputWorkloadType` class.
 * Added `com.databricks.sdk.service.serving.V1ResponseChoiceElement` class.
 * Removed `accountClient.networkPolicy()` service.
 * Removed `com.databricks.sdk.service.settings.AccountNetworkPolicyMessage` class.
 * Removed `com.databricks.sdk.service.settings.DeleteAccountNetworkPolicyRequest` class.
 * Removed `com.databricks.sdk.service.settings.DeleteAccountNetworkPolicyResponse` class.
 * Removed `com.databricks.sdk.service.settings.ReadAccountNetworkPolicyRequest` class.
 * Removed `com.databricks.sdk.service.settings.UpdateAccountNetworkPolicyRequest` class.
 * Removed `name` field for `com.databricks.sdk.service.sharing.UpdateCleanRoom`.
 * Changed `name` field for `com.databricks.sdk.service.sharing.UpdateProvider` to be required.
 * Added `newName` field for `com.databricks.sdk.service.sharing.UpdateProvider`.
 * Changed `name` field for `com.databricks.sdk.service.sharing.UpdateRecipient` to be required.
 * Added `newName` field for `com.databricks.sdk.service.sharing.UpdateRecipient`.
 * Changed `name` field for `com.databricks.sdk.service.sharing.UpdateShare` to be required.
 * Added `newName` field for `com.databricks.sdk.service.sharing.UpdateShare`.
 * Added `statementIds` field for `com.databricks.sdk.service.sql.QueryFilter`.
 * Added `com.databricks.sdk.service.sql.StatementId` class.

OpenAPI SHA: 63caa3cb0c05045e81d3dcf2451fa990d8670f36, Date: 2023-12-12


## 0.13.0

Bug fixes:

* Fix databricks CLI authentication on Windows ([#192](https://github.com/databricks/databricks-sdk-java/pull/192)).
* Fix SCIM pagination ([#193](https://github.com/databricks/databricks-sdk-java/pull/193)).

Other changes:

* Add more detailed error message on default credentials not found error ([#180](https://github.com/databricks/databricks-sdk-java/pull/180)).
* Support custom scopes and redirectUrl for U2M OAuth flow ([#190](https://github.com/databricks/databricks-sdk-java/pull/190)).

API Changes:

 * Removed `enableOptimization()` method for `workspaceClient.metastores()` service.
 * Added `pipelineId` field for `com.databricks.sdk.service.catalog.TableInfo`.
 * Added `enablePredictiveOptimization` field for `com.databricks.sdk.service.catalog.UpdateCatalog` and `com.databricks.sdk.service.catalog.UpdateSchema`.
 * Removed `com.databricks.sdk.service.catalog.UpdatePredictiveOptimization` and `com.databricks.sdk.service.catalog.UpdatePredictiveOptimizationResponse` class.
 * Added `description` field for `com.databricks.sdk.service.jobs.CreateJob` and `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `listNetworkConnectivityConfigurations()` and `listPrivateEndpointRules()` methods for `accountClient.networkConnectivity()` service.
 * Added `com.databricks.sdk.service.settings.ListNccAzurePrivateEndpointRulesResponse`, `com.databricks.sdk.service.settings.ListNetworkConnectivityConfigurationsRequest`, `com.databricks.sdk.service.settings.ListNetworkConnectivityConfigurationsResponse`, and `com.databricks.sdk.service.settings.ListPrivateEndpointRulesRequest` classes.
 * Added `stringSharedAs` field for `com.databricks.sdk.service.sharing.SharedDataObject`.

OpenAPI SHA: 22f09783eb8a84d52026f856be3b2068f9498db3, Date: 2023-11-23

## 0.12.0

* Implemented notebook-native auth for the Java SDK ([#171](https://github.com/databricks/databricks-sdk-java/pull/171)).
* Addeded regression question to github issue template ([#176](https://github.com/databricks/databricks-sdk-java/pull/176)).
* Marked Java SDK as Beta ([#177](https://github.com/databricks/databricks-sdk-java/pull/177)).
* Updated SDK to latest OpenAPI Spec ([#181](https://github.com/databricks/databricks-sdk-java/pull/181)).

API Changes:

 * Changed `create()` method for `workspaceClient.functions()` and `workspaceClient.metastores()` service. 
 * Changed the following fields:
   * `inputParams` field for `com.databricks.sdk.service.catalog.CreateFunction` to `com.databricks.sdk.service.catalog.FunctionParameterInfos` class.
   * `properties` field for `com.databricks.sdk.service.catalog.CreateFunction` to `String` class.
   * `returnParams` field for `com.databricks.sdk.service.catalog.CreateFunction` to `com.databricks.sdk.service.catalog.FunctionParameterInfos` class.
   * `storageRoot` field for `com.databricks.sdk.service.catalog.CreateMetastore` to no longer be required.
   * `inputParams` field for `com.databricks.sdk.service.catalog.FunctionInfo` to `com.databricks.sdk.service.catalog.FunctionParameterInfos` class.
   * `properties` field for `com.databricks.sdk.service.catalog.FunctionInfo` to `String` class.
   * `returnParams` field for `com.databricks.sdk.service.catalog.FunctionInfo` to `com.databricks.sdk.service.catalog.FunctionParameterInfos` class.
 * Added the following fields:
   * `skipValidation` field for `com.databricks.sdk.service.catalog.UpdateExternalLocation`.
   * `libraries` field for `com.databricks.sdk.service.compute.CreatePolicy`, `com.databricks.sdk.service.compute.EditPolicy` and `com.databricks.sdk.service.compute.Policy`.
   * `initScripts` field for `com.databricks.sdk.service.compute.EventDetails`.
   * `file` field for `com.databricks.sdk.service.compute.InitScriptInfo`.
   * `zoneId` field for `com.databricks.sdk.service.compute.InstancePoolGcpAttributes`.
   * `editMode` field for `com.databricks.sdk.service.jobs.CreateJob` and `com.databricks.sdk.service.jobs.JobSettings`.
   * `includeResolvedValues` field for `com.databricks.sdk.service.jobs.GetRunRequest`.
   * `networkConnectivityConfigId` field for `com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest`.
   * `containerLogs` and `extraInfo` field for `com.databricks.sdk.service.serving.DeploymentStatus`.
* Added `deleteApp()`, `getApp()`, `getAppDeploymentStatus()`, `getApps()` and `getEvents()` method for `workspaceClient.apps()` service.
 * Added `accountClient.networkConnectivity()` service. 
 * Added the following classses: 
   * `com.databricks.sdk.service.compute`: `LocalFileInfo`, `InitScriptInfoAndExecutionDetails`, `InitScriptEventDetails`, `InitScriptExecutionDetails` and `InitScriptExecutionDetailsStatus`.
   * `com.databricks.sdk.service.jobs`: `JobSettingsEditMode` and `CreateJobEditMode`.
   * `com.databricks.sdk.service.catalog`: `CreateFunctionRequest`, `DependencyList` and `FunctionParameterInfos`.
   * `com.databricks.sdk.service.serving`: `AppEvents`, `AppServiceStatus`, `DeleteAppResponse`, `GetAppDeploymentStatusRequest`, `GetAppResponse`, `GetEventsRequest`, `ListAppEventsResponse` and `ListAppsResponse`.
   * `com.databricks.sdk.service.settings`: `CreateNetworkConnectivityConfigRequest`, `CreatePrivateEndpointRuleRequest`, `CreatePrivateEndpointRuleRequestGroupId`, `DeleteNetworkConnectivityConfigurationRequest`, `DeletePrivateEndpointRuleRequest`, `GetNetworkConnectivityConfigurationRequest`, `GetPrivateEndpointRuleRequest`, `NccAzurePrivateEndpointRule`, `NccAzurePrivateEndpointRuleConnectionState`, `NccAzurePrivateEndpointRuleGroupId`, `NccAzureServiceEndpointRule`, `NccEgressConfig`, `NccEgressDefaultRules`, `NccEgressTargetRules` and `NetworkConnectivityConfiguration`.
 * Removed the following fields:
   * `uiState` field for `com.databricks.sdk.service.jobs.CreateJob`.
   * `uiState` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Removed `delete()` and `get()` method for `workspaceClient.apps()` service.
 * Removed `accountClient.oAuthEnrollment()` service.
 * Removed the following classes: `com.databricks.sdk.service.jobs.CreateJobUiState`, `com.databricks.sdk.service.jobs.JobSettingsUiState`, `com.databricks.sdk.service.oauth2.CreateOAuthEnrollment` and `com.databricks.sdk.service.oauth2.OAuthEnrollmentStatus`.

OpenAPI SHA: e7b127cb07af8dd4d8c61c7cc045c8910cdbb02a, Date: 2023-11-08


## 0.11.0

* Adjust token expiry window to 40 seconds because of Azure ([#170](https://github.com/databricks/databricks-sdk-java/pull/170)).
* Use same logic as Go SDK for DatabricksConfig.isAzure() ([#174](https://github.com/databricks/databricks-sdk-java/pull/174)).

API Changes:

 * Added `attributes`, `count`, `excludedAttributes`, `filter`, `sortBy`, `sortOrder`, and `startIndex` fields for `com.databricks.sdk.service.iam.GetAccountUserRequest` and `com.databricks.sdk.service.iam.GetUserRequest`.
 * Added `schemas` field for `com.databricks.sdk.service.iam.Group`, `com.databricks.sdk.service.iam.ListGroupsResponse`, `com.databricks.sdk.service.iam.ListServicePrincipalResponse`, `com.databricks.sdk.service.iam.ListUsersResponse`, `com.databricks.sdk.service.iam.ServicePrincipal`, and `com.databricks.sdk.service.iam.User`.
 * Added `com.databricks.sdk.service.iam.GetSortOrder`, `com.databricks.sdk.service.iam.GroupSchema`, `com.databricks.sdk.service.iam.ListResponseSchema`, `com.databricks.sdk.service.iam.ServicePrincipalSchema`, and `com.databricks.sdk.service.iam.UserSchema` class.
 * Added `webhookNotifications` field for `com.databricks.sdk.service.jobs.SubmitTask`.
 * Added `workspaceClient.apps()` service and related classes.
 * Added `accountClient.networkPolicy()` service and related classes.

OpenAPI SHA: 5903bb39137fd76ac384b2044e425f9c56840e00, Date: 2023-10-23

Dependency updates:

 * Bump org.junit:junit-bom from 5.9.3 to 5.10.0 ([#124](https://github.com/databricks/databricks-sdk-java/pull/124)).
 * Bump org.slf4j:slf4j-api from 2.0.7 to 2.0.9 ([#146](https://github.com/databricks/databricks-sdk-java/pull/146)).
 * Bump org.slf4j:slf4j-reload4j from 2.0.7 to 2.0.9 ([#147](https://github.com/databricks/databricks-sdk-java/pull/147)).
 * Bump org.apache.maven.plugins:maven-javadoc-plugin from 3.5.0 to 3.6.0 ([#156](https://github.com/databricks/databricks-sdk-java/pull/156)).

## 0.10.0

* Don't fail codegen if the tree was already removed ([#164](https://github.com/databricks/databricks-sdk-java/pull/164)).
* Update OpenAPI spec to 12 Oct 2023 ([#165](https://github.com/databricks/databricks-sdk-java/pull/165)).

API Changes:

 * Changed `download()` method for `accountClient.billableUsage()` service to start returning `com.databricks.sdk.service.billing.DownloadResponse` class.
 * Added `com.databricks.sdk.service.billing.DownloadResponse` class.
 * Changed `delete()` method for `accountClient.storageCredentials()` service with new required argument order.
 * Changed `get()` method for `accountClient.storageCredentials()` service with new required argument order.
 * Changed `update()` method for `accountClient.storageCredentials()` service with new required argument order.
 * Added `getBindings()` method for `workspaceClient.workspaceBindings()` service.
 * Added `updateBindings()` method for `workspaceClient.workspaceBindings()` service.
 * Removed `name` field for `com.databricks.sdk.service.catalog.AccountsUpdateStorageCredential`.
 * Added `storageCredentialName` field for `com.databricks.sdk.service.catalog.AccountsUpdateStorageCredential`.
 * Removed `name` field for `com.databricks.sdk.service.catalog.DeleteAccountStorageCredentialRequest`.
 * Added `storageCredentialName` field for `com.databricks.sdk.service.catalog.DeleteAccountStorageCredentialRequest`.
 * Removed `name` field for `com.databricks.sdk.service.catalog.GetAccountStorageCredentialRequest`.
 * Added `storageCredentialName` field for `com.databricks.sdk.service.catalog.GetAccountStorageCredentialRequest`.
 * Added `owner` field for `com.databricks.sdk.service.catalog.UpdateConnection`.
 * Added `com.databricks.sdk.service.catalog.GetBindingsRequest` class.
 * Added `com.databricks.sdk.service.catalog.UpdateWorkspaceBindingsParameters` class.
 * Added `com.databricks.sdk.service.catalog.WorkspaceBinding` class.
 * Added `com.databricks.sdk.service.catalog.WorkspaceBindingBindingType` class.
 * Added `com.databricks.sdk.service.catalog.WorkspaceBindingsResponse` class.
 * Added `spec` field for `com.databricks.sdk.service.compute.ClusterDetails`.
 * Added `applyPolicyDefaultValues` field for `com.databricks.sdk.service.compute.ClusterSpec`.
 * Removed `awsAttributes` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `azureAttributes` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `diskSpec` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `enableElasticDisk` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `gcpAttributes` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `preloadedDockerImages` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `preloadedSparkVersions` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Added `deployment` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `uiState` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `deployment` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `uiState` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Removed `conditionTask` field for `com.databricks.sdk.service.jobs.RunOutput`.
 * Added `webhookNotifications` field for `com.databricks.sdk.service.jobs.Task`.
 * Added `com.databricks.sdk.service.jobs.CreateJobUiState` class.
 * Added `com.databricks.sdk.service.jobs.JobDeployment` class.
 * Added `com.databricks.sdk.service.jobs.JobDeploymentKind` class.
 * Added `com.databricks.sdk.service.jobs.JobSettingsUiState` class.
 * Added `workloadType` field for `com.databricks.sdk.service.serving.ServedModelInput`.
 * Added `workloadType` field for `com.databricks.sdk.service.serving.ServedModelOutput`.
 * Removed `accountClient.networkPolicy()` service.
 * Changed `list()` method for `workspaceClient.ipAccessLists()` service to return `com.databricks.sdk.service.settings.ListIpAccessListResponse` class.
 * Removed `com.databricks.sdk.service.settings.AccountNetworkPolicyMessage` class.
 * Removed `com.databricks.sdk.service.settings.DeleteAccountNetworkPolicyRequest` class.
 * Removed `com.databricks.sdk.service.settings.DeleteAccountNetworkPolicyResponse` class.
 * Removed `ipAccessLists` field for `com.databricks.sdk.service.settings.GetIpAccessListResponse`.
 * Added `ipAccessList` field for `com.databricks.sdk.service.settings.GetIpAccessListResponse`.
 * Removed `com.databricks.sdk.service.settings.ReadAccountNetworkPolicyRequest` class.
 * Removed `com.databricks.sdk.service.settings.UpdateAccountNetworkPolicyRequest` class.
 * Added `com.databricks.sdk.service.settings.ListIpAccessListResponse` class.

OpenAPI SHA: 493a76554afd3afdd15dc858773d01643f80352a, Date: 2023-10-12


## 0.9.0

* Add additional error metadata to API errors ([#153](https://github.com/databricks/databricks-sdk-java/pull/153)).
* Bugfix: Chunk streaming request bodies only ([#157](https://github.com/databricks/databricks-sdk-java/pull/157)).
* Relicense the Java SDK using the Apache 2.0 license ([#158](https://github.com/databricks/databricks-sdk-java/pull/158)).

Breaking API Changes:

 * Changed `list()` method for `accountClient.metastoreAssignments()` service to return `com.databricks.sdk.service.catalog.ListAccountMetastoreAssignmentsResponse` class.
 * Changed `artifactMatchers` field for `com.databricks.sdk.service.catalog.ArtifactAllowlistInfo` to `com.databricks.sdk.service.catalog.ArtifactMatcherList` class.
 * Removed `owner` field for `com.databricks.sdk.service.catalog.CreateConnection`. Use instead the `owner` field of `UpdateConnection`.
 * Changed `artifactMatchers` field for `com.databricks.sdk.service.catalog.SetArtifactAllowlist` to `com.databricks.sdk.service.catalog.ArtifactMatcherList` class.
 * Removed `options` field for `com.databricks.sdk.service.catalog.UpdateCatalog`.
 * Changed `cancelAllRuns()` method for `workspaceClient.jobs()` service with new required argument order.
 * Changed `jobId` field for `com.databricks.sdk.service.jobs.CancelAllRuns` to no longer be required.
 * Changed `jobParameters` field for `com.databricks.sdk.service.jobs.RunNow` to `com.databricks.sdk.service.jobs.ParamPairs` class.
 * Changed `query()` method for `workspaceClient.servingEndpoints()` service. New request type is `com.databricks.sdk.service.serving.QueryEndpointInput` class.
 * Removed `com.databricks.sdk.service.serving.QueryRequest` class.
 * Changed `list()` method for `workspaceClient.cleanRooms()` service to require request of `com.databricks.sdk.service.sharing.ListCleanRoomsRequest` class.
 * Changed `executeStatement()` method for `workspaceClient.statementExecution()` service with new required argument order.
 * Renamed `com.databricks.sdk.service.sql.ChunkInfo` class to `BaseChunkInfo`.
 * Changed `onWaitTimeout` field for `com.databricks.sdk.service.sql.ExecuteStatementRequest` to `com.databricks.sdk.service.sql.ExecuteStatementRequestOnWaitTimeout` class.
 * Changed `statement` field for `com.databricks.sdk.service.sql.ExecuteStatementRequest` to be required.
 * Changed `warehouseId` field for `com.databricks.sdk.service.sql.ExecuteStatementRequest` to be required.
 * Changed `chunks` field for `com.databricks.sdk.service.sql.ResultManifest` to `com.databricks.sdk.service.sql.BaseChunkInfoList` class.
 * Renamed `com.databricks.sdk.service.sql.TimeoutAction` class to `ExecuteStatementRequestOnWaitTimeout`.

API Changes:

 * Added `com.databricks.sdk.service.catalog.ListAccountMetastoreAssignmentsResponse` class.
 * Added `com.databricks.sdk.service.catalog.WorkspaceId` class.
 * Added `allQueuedRuns` field for `com.databricks.sdk.service.jobs.CancelAllRuns`.
 * Added `queue` field for `com.databricks.sdk.service.jobs.CreateJob`.
 * Added `queue` field for `com.databricks.sdk.service.jobs.JobSettings`.
 * Added `jobParameters` field for `com.databricks.sdk.service.jobs.RepairRun`.
 * Added `queue` field for `com.databricks.sdk.service.jobs.RunNow`.
 * Added `jobParameters` field for `com.databricks.sdk.service.jobs.RunParameters`.
 * Added `queueReason` field for `com.databricks.sdk.service.jobs.RunState`.
 * Added `queueDuration` field for `com.databricks.sdk.service.jobs.RunTask`.
 * Added `queue` field for `com.databricks.sdk.service.jobs.SubmitRun`.
 * Added `com.databricks.sdk.service.jobs.QueueSettings` class.
 * Added `accountClient.oAuthPublishedApps()` service.
 * Added `com.databricks.sdk.service.oauth2.GetPublishedAppsOutput` class.
 * Added `com.databricks.sdk.service.oauth2.ListOAuthPublishedAppsRequest` class.
 * Added `com.databricks.sdk.service.oauth2.PublishedAppOutput` class.
 * Added `notifications` field for `com.databricks.sdk.service.pipelines.CreatePipeline`.
 * Added `notifications` field for `com.databricks.sdk.service.pipelines.EditPipeline`.
 * Added `notifications` field for `com.databricks.sdk.service.pipelines.PipelineSpec`.
 * Added `com.databricks.sdk.service.pipelines.Notifications` class.
 * Added `patch()` method for `workspaceClient.servingEndpoints()` service.
 * Added `tags` field for `com.databricks.sdk.service.serving.CreateServingEndpoint`.
 * Added `tags` field for `com.databricks.sdk.service.serving.ServingEndpoint`.
 * Added `tags` field for `com.databricks.sdk.service.serving.ServingEndpointDetailed`.
 * Added `com.databricks.sdk.service.serving.DataframeSplitInput` class.
 * Added `com.databricks.sdk.service.serving.EndpointTag` class.
 * Added `com.databricks.sdk.service.serving.PatchServingEndpointTags` class.
 * Added `com.databricks.sdk.service.serving.QueryEndpointInput` class.
 * Added `workspaceClient.credentialsManager()` service.
 * Added `workspaceClient.settings()` service.
 * Added `com.databricks.sdk.service.settings.DefaultNamespaceSetting` class.
 * Added `com.databricks.sdk.service.settings.DeleteDefaultWorkspaceNamespaceRequest` class.
 * Added `com.databricks.sdk.service.settings.DeleteDefaultWorkspaceNamespaceResponse` class.
 * Added `com.databricks.sdk.service.settings.ExchangeToken` class.
 * Added `com.databricks.sdk.service.settings.ExchangeTokenRequest` class.
 * Added `com.databricks.sdk.service.settings.ExchangeTokenResponse` class.
 * Added `com.databricks.sdk.service.settings.PartitionId` class.
 * Added `com.databricks.sdk.service.settings.ReadDefaultWorkspaceNamespaceRequest` class.
 * Added `com.databricks.sdk.service.settings.StringMessage` class.
 * Added `com.databricks.sdk.service.settings.TokenType` class.
 * Added `com.databricks.sdk.service.settings.UpdateDefaultWorkspaceNamespaceRequest` class.
 * Added `nextPageToken` field for `com.databricks.sdk.service.sharing.ListCleanRoomsResponse`.
 * Added `com.databricks.sdk.service.sharing.ListCleanRoomsRequest` class.
 * Added `emptyResultState` field for `com.databricks.sdk.service.sql.AlertOptions`.
 * Added `truncated` field for `com.databricks.sdk.service.sql.ResultManifest`.
 * Added `com.databricks.sdk.service.sql.AlertOptionsEmptyResultState` class.

OpenAPI SHA: bcbf6e851e3d82fd910940910dd31c10c059746c, Date: 2023-10-02


## 0.8.1

* Added support for Azure authentication when WorkspaceResourceID is provided ([#145](https://github.com/databricks/databricks-sdk-java/pull/145)).
* Fixed Files API integration test ([#150](https://github.com/databricks/databricks-sdk-java/pull/150)).


## 0.8.0

* Adding mock constructor method for WorkspaceClient to support mocked ApiClient ([#144](https://github.com/databricks/databricks-sdk-java/pull/144)).

API Changes:

* Renamed permissions APIs to no longer include the service name, for example:
  * `getJobPermissionLevels` -> `getPermissionLevels`
  * `getJobPermissions` -> `getPermissions`
  * `setJobPermissions` -> `setPermissions`
  * `updateJobPermissions` -> `updatePermissions`
* Changed `create()` method for `workspaceClient.volumes()` service with new required argument order.
* Added `supportsElasticDisk` field for `com.databricks.sdk.service.compute.NodeType`.
* Changed `create()` method for `workspaceClient.dashboards()` service with new required argument order.
* Added `workspaceClient.dashboardWidgets()` service.
* Added `workspaceClient.queryVisualizations()` service.
* Changed `name` field for `com.databricks.sdk.service.sql.CreateDashboardRequest` to be required.
* Added `dashboardFiltersEnabled` field for `com.databricks.sdk.service.sql.CreateDashboardRequest`.
* Added `runAsRole` field for `com.databricks.sdk.service.sql.CreateDashboardRequest`.
* Added `runAsRole` field for `com.databricks.sdk.service.sql.Query`.
* Added `runAsRole` field for `com.databricks.sdk.service.sql.QueryPostContent`.
* Removed `dashboardId` field for `com.databricks.sdk.service.sql.WidgetOptions`.
* Changed `position` field for `com.databricks.sdk.service.sql.WidgetOptions` to `com.databricks.sdk.service.sql.WidgetPosition` class.
* Removed `text` field for `com.databricks.sdk.service.sql.WidgetOptions`.
* Added `description` field for `com.databricks.sdk.service.sql.WidgetOptions`.
* Added `title` field for `com.databricks.sdk.service.sql.WidgetOptions`.
* Added `com.databricks.sdk.service.sql.CreateQueryVisualizationRequest` class.
* Added `com.databricks.sdk.service.sql.CreateWidget` class.
* Added `com.databricks.sdk.service.sql.DeleteDashboardWidgetRequest` class.
* Added `com.databricks.sdk.service.sql.DeleteQueryVisualizationRequest` class.
* Added `com.databricks.sdk.service.sql.RunAsRole` class.
* Added `com.databricks.sdk.service.sql.WidgetPosition` class.

OpenAPI SHA: 09a7fa63d9ae243e5407941f200960ca14d48b07, Date: 2023-09-04
## 0.7.0

* Added support for propagating Request Headers through API Client ([#135](https://github.com/databricks/databricks-sdk-java/pull/135)).
* Added support for InputStream for streaming request and response bodies ([#138](https://github.com/databricks/databricks-sdk-java/pull/138)).
* Fixed query param serialization for requests with enums ([#140](https://github.com/databricks/databricks-sdk-java/pull/140)).

Breaking API Changes:
 * Changed `list()` method for `accountClient.storageCredentials()` service to return `com.databricks.sdk.service.catalog.StorageCredentialInfoList` class.
 * Removed `workspaceClient.securableTags()` service and all related classes.
 * Removed `workspaceClient.subentityTags()` service and all related classes.
 * Renamed `provisioningState` field for `com.databricks.sdk.service.catalog.ConnectionInfo` to `provisioningInfo`.
 * Removed `instancePoolFleetAttributes` field for `com.databricks.sdk.service.compute.CreateInstancePool`.
 * Removed `instancePoolFleetAttributes` field for `com.databricks.sdk.service.compute.EditInstancePool`.
 * Removed `com.databricks.sdk.service.compute.FleetLaunchTemplateOverride` class.
 * Removed `com.databricks.sdk.service.compute.FleetOnDemandOption` class.
 * Removed `com.databricks.sdk.service.compute.FleetOnDemandOptionAllocationStrategy` class.
 * Removed `com.databricks.sdk.service.compute.FleetSpotOption` class.
 * Removed `com.databricks.sdk.service.compute.FleetSpotOptionAllocationStrategy` class.
 * Removed `instancePoolFleetAttributes` field for `com.databricks.sdk.service.compute.GetInstancePool`.
 * Removed `instancePoolFleetAttributes` field for `com.databricks.sdk.service.compute.InstancePoolAndStats`.
 * Removed `com.databricks.sdk.service.compute.InstancePoolFleetAttributes` class.
 * Changed `getByName()` method for `workspaceClient.experiments()` service to return `com.databricks.sdk.service.ml.GetExperimentResponse` class.
 * Changed `getExperiment()` method for `workspaceClient.experiments()` service to return `com.databricks.sdk.service.ml.GetExperimentResponse` class.
 * Renamed `com.databricks.sdk.service.ml.GetExperimentByNameResponse` class to `com.databricks.sdk.service.ml.GetExperimentResponse`.

API Changes:

 * Added `workspaceClient.modelVersions()` service.
 * Added `workspaceClient.registeredModels()` service.
 * Added `browseOnly` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Added `fullName` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Added `provisioningInfo` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Added `securableKind` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Added `securableType` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Added `options` field for `com.databricks.sdk.service.catalog.CreateCatalog`.
 * Added `options` field for `com.databricks.sdk.service.catalog.UpdateCatalog`.
 * Added `com.databricks.sdk.service.catalog.CatalogInfoSecurableKind` class.
 * Added `com.databricks.sdk.service.catalog.CreateRegisteredModelRequest` class.
 * Added `com.databricks.sdk.service.catalog.DeleteAliasRequest` class.
 * Added `com.databricks.sdk.service.catalog.DeleteModelVersionRequest` class.
 * Added `com.databricks.sdk.service.catalog.DeleteRegisteredModelRequest` class.
 * Added `com.databricks.sdk.service.catalog.GetByAliasRequest` class.
 * Added `com.databricks.sdk.service.catalog.GetModelVersionRequest` class.
 * Added `com.databricks.sdk.service.catalog.GetRegisteredModelRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListModelVersionsRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListModelVersionsResponse` class.
 * Added `com.databricks.sdk.service.catalog.ListRegisteredModelsRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListRegisteredModelsResponse` class.
 * Added `com.databricks.sdk.service.catalog.ModelVersionInfo` class.
 * Added `com.databricks.sdk.service.catalog.ModelVersionInfoStatus` class.
 * Added `com.databricks.sdk.service.catalog.ProvisioningInfo` class.
 * Added `com.databricks.sdk.service.catalog.ProvisioningInfoState` class.
 * Added `com.databricks.sdk.service.catalog.RegisteredModelAlias` class.
 * Added `com.databricks.sdk.service.catalog.RegisteredModelInfo` class.
 * Added `com.databricks.sdk.service.catalog.SetRegisteredModelAliasRequest` class.
 * Added `com.databricks.sdk.service.catalog.UpdateModelVersionRequest` class.
 * Added `com.databricks.sdk.service.catalog.UpdateRegisteredModelRequest` class.
 * Added `volumes` field for `com.databricks.sdk.service.compute.InitScriptInfo`.
 * Added `com.databricks.sdk.service.compute.VolumesStorageInfo` class.
 * Added `workspaceClient.files()` service.
 * Added `com.databricks.sdk.service.files.DeleteFileRequest` class.
 * Added `com.databricks.sdk.service.files.DownloadRequest` class.
 * Added `com.databricks.sdk.service.files.DownloadResponse` class.
 * Added `com.databricks.sdk.service.files.UploadRequest` class.
 * Added `customTags` field for `com.databricks.sdk.service.provisioning.CreateWorkspaceRequest`.
 * Added `customTags` field for `com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest`.
 * Added `customTags` field for `com.databricks.sdk.service.provisioning.Workspace`.
 * Added `com.databricks.sdk.service.provisioning.CustomTags` class.
 * Added `parameters` field for `com.databricks.sdk.service.sql.ExecuteStatementRequest`.
 * Added `rowLimit` field for `com.databricks.sdk.service.sql.ExecuteStatementRequest`.
 * Added `com.databricks.sdk.service.sql.StatementParameterListItem` class.

OpenAPI SHA: 5d0ccbb790d341eae8e85321a685a9e9e2d5bf24, Date: 2023-08-29
## 0.6.0

* Added support for `dbutils.secrets` ([#132](https://github.com/databricks/databricks-sdk-java/pull/132)).
* Added retry in `w.clusters().ensureClusterIsRunning(id)` when cluster is simultaneously started by two different processes ([#134](https://github.com/databricks/databricks-sdk-java/pull/134)).
* Set necessary headers when authenticating via Azure CLI ([#136](https://github.com/databricks/databricks-sdk-java/pull/136)).

New Services:

 * Added `workspaceClient.artifactAllowlists()` service.
 * Added `workspaceClient.securableTags()` service.
 * Added `workspaceClient.subentityTags()` service.
 * Added `com.databricks.sdk.service.catalog.ArtifactAllowlistInfo` class.
 * Added `com.databricks.sdk.service.catalog.ArtifactMatcher` class.
 * Added `com.databricks.sdk.service.catalog.ArtifactType` class.
 * Added `com.databricks.sdk.service.catalog.GetArtifactAllowlistRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListSecurableTagsRequest` class.
 * Added `com.databricks.sdk.service.catalog.ListSecurableType` class.
 * Added `com.databricks.sdk.service.catalog.ListSubentityTagsRequest` class.
 * Added `com.databricks.sdk.service.catalog.MatchType` class.
 * Added `com.databricks.sdk.service.catalog.SetArtifactAllowlist` class.
 * Added `com.databricks.sdk.service.catalog.TagChanges` class.
 * Added `com.databricks.sdk.service.catalog.TagKeyValuePair` class.
 * Added `com.databricks.sdk.service.catalog.TagSecurable` class.
 * Added `com.databricks.sdk.service.catalog.TagSecurableAssignment` class.
 * Added `com.databricks.sdk.service.catalog.TagSecurableAssignmentsList` class.
 * Added `com.databricks.sdk.service.catalog.TagSubentity` class.
 * Added `com.databricks.sdk.service.catalog.TagSubentityAssignmentsList` class.
 * Added `com.databricks.sdk.service.catalog.TagsSubentityAssignment` class.
 * Added `com.databricks.sdk.service.catalog.UpdateSecurableType` class.
 * Added `com.databricks.sdk.service.catalog.UpdateTags` class.

New APIs:

 * Added `deleteRuns()` method for `workspaceClient.experiments()` service.
 * Added `restoreRuns()` method for `workspaceClient.experiments()` service.
 * Added `com.databricks.sdk.service.ml.DeleteRuns` class.
 * Added `com.databricks.sdk.service.ml.DeleteRunsResponse` class.
 * Added `com.databricks.sdk.service.ml.RestoreRuns` class.
 * Added `com.databricks.sdk.service.ml.RestoreRunsResponse` class.
 * Added `getSecret()` method for `workspaceClient.secrets()` service.
 * Added `com.databricks.sdk.service.workspace.GetSecretRequest` class.
 * Added `com.databricks.sdk.service.workspace.GetSecretResponse` class.

API Renames:

 * Renamed `effectiveAutoMaintenanceFlag` field to `effectivePredictiveOptimizationFlag` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Renamed `enableAutoMaintenance` field to `enablePredictiveOptimization` field for `com.databricks.sdk.service.catalog.CatalogInfo`.
 * Renamed `com.databricks.sdk.service.catalog.EffectiveAutoMaintenanceFlag` class to `com.databricks.sdk.service.catalog.EffectivePredictiveOptimizationFlag` class.
 * Renamed `com.databricks.sdk.service.catalog.EffectiveAutoMaintenanceFlagInheritedFromType` class to `com.databricks.sdk.service.catalog.EffectivePredictiveOptimizationFlagInheritedFromType`.
 * Renamed `com.databricks.sdk.service.catalog.EnableAutoMaintenance` class to `com.databricks.sdk.service.catalog.EnablePredictiveOptimization`.
 * Renamed `effectiveAutoMaintenanceFlag` field to `effectivePredictiveOptimizationFlag` field for `com.databricks.sdk.service.catalog.SchemaInfo`.
 * Renamed `enableAutoMaintenance` field to `enablePredictiveOptimization` field for `com.databricks.sdk.service.catalog.SchemaInfo`.
 * Renamed `effectiveAutoMaintenanceFlag` field to `effectivePredictiveOptimizationFlag` field for `com.databricks.sdk.service.catalog.TableInfo`.
 * Renamed `enableAutoMaintenance` field to `enablePredictiveOptimization` field for `com.databricks.sdk.service.catalog.TableInfo`.

OpenAPI SHA: beff621d7b3e1d59244e2e34fc53a496f310e130, Date: 2023-08-17


## 0.5.0


API Changes:

 * Changed `create()` method for `accountClient.storageCredentials()` service to return `com.databricks.sdk.service.catalog.AccountsStorageCredentialInfo` class.
 * Changed `get()` method for `accountClient.storageCredentials()` service to return `com.databricks.sdk.service.catalog.AccountsStorageCredentialInfo` class.
 * Changed `update()` method for `accountClient.storageCredentials()` service to return `com.databricks.sdk.service.catalog.AccountsStorageCredentialInfo` class.
 * Changed `create()` method for `workspaceClient.connections()` service with new required argument order.
 * Changed `update()` method for `workspaceClient.connections()` service with new required argument order.
 * Added `provisioningState` field for `com.databricks.sdk.service.catalog.ConnectionInfo`.
 * Added `securableKind` field for `com.databricks.sdk.service.catalog.ConnectionInfo`.
 * Added `securableType` field for `com.databricks.sdk.service.catalog.ConnectionInfo`.
 * Changed `algorithm` field for `com.databricks.sdk.service.catalog.SseEncryptionDetails` to no longer be required.
 * Added `com.databricks.sdk.service.catalog.AccountsStorageCredentialInfo` class.
 * Added `com.databricks.sdk.service.catalog.ConnectionInfoSecurableKind` class.
 * Added `com.databricks.sdk.service.catalog.ProvisioningState` class.
 * Added `dataSecurityMode` field for `com.databricks.sdk.service.compute.CreateCluster`.
 * Added `dockerImage` field for `com.databricks.sdk.service.compute.CreateCluster`.
 * Added `singleUserName` field for `com.databricks.sdk.service.compute.CreateCluster`.

Bug fixes:

 * Renamed `optionsKvpairs` field to `options` for `com.databricks.sdk.service.catalog.ConnectionInfo`.
 * Renamed `propertiesKvpairs` field to `properties` for `com.databricks.sdk.service.catalog.ConnectionInfo`.
 * Renamed `optionsKvpairs` field to `options` for `com.databricks.sdk.service.catalog.CreateConnection`.
 * Renamed `propertiesKvpairs` field to `properties` for `com.databricks.sdk.service.catalog.CreateConnection`.
 * Renamed `optionsKvpairs` field to `options` for `com.databricks.sdk.service.catalog.UpdateConnection`.
 * Renamed `schema` field to `schemas` for `com.databricks.sdk.service.iam.PartialUpdate`.

OpenAPI SHA: 1e3533f94335f0e6c5d9262bc1fea95b3ddcb0e1, Date: 2023-08-11


## 0.4.0

To simplify documentation and management of object permissions, this release features a major reorganization of how permissions APIs are structured in the SDK. Rather than using a single `Permissions.Get()` API for all services, each service supporting permissions has its own permissions APIs. Follow these steps to migrate to the current SDK:

 * Change `w.permissions().get()` and `w.permissions().getByRequestOgjectIdAndRequestObjectType()` to `w.<Service>.get<Service>Permissions()`
 * Change `w.permissions().getPermissionLevels()` to `w.<Service>.getServicePermissionLevels()`
 * Change `w.permissions().set()` to `w.<Service>.set<Service>Permissions()`
 * Change `w.permissions().update()` to `w.<Service>.update<Service>Permissions()`


API Changes:

 * Added `getClusterPolicyPermissionLevels()` method for `workspaceClient.clusterPolicies()` service.
 * Added `getClusterPolicyPermissions()` method for `workspaceClient.clusterPolicies()` service.
 * Added `setClusterPolicyPermissions()` method for `workspaceClient.clusterPolicies()` service.
 * Added `updateClusterPolicyPermissions()` method for `workspaceClient.clusterPolicies()` service.
 * Added `getClusterPermissionLevels()` method for `workspaceClient.clusters()` service.
 * Added `getClusterPermissions()` method for `workspaceClient.clusters()` service.
 * Added `setClusterPermissions()` method for `workspaceClient.clusters()` service.
 * Added `updateClusterPermissions()` method for `workspaceClient.clusters()` service.
 * Added `getInstancePoolPermissionLevels()` method for `workspaceClient.instancePools()` service.
 * Added `getInstancePoolPermissions()` method for `workspaceClient.instancePools()` service.
 * Added `setInstancePoolPermissions()` method for `workspaceClient.instancePools()` service.
 * Added `updateInstancePoolPermissions()` method for `workspaceClient.instancePools()` service.
 * Added `com.databricks.sdk.service.compute.ClusterAccessControlRequest` class.
 * Added `com.databricks.sdk.service.compute.ClusterAccessControlResponse` class.
 * Added `com.databricks.sdk.service.compute.ClusterPermission` class.
 * Added `com.databricks.sdk.service.compute.ClusterPermissionLevel` class.
 * Added `com.databricks.sdk.service.compute.ClusterPermissions` class.
 * Added `com.databricks.sdk.service.compute.ClusterPermissionsDescription` class.
 * Added `com.databricks.sdk.service.compute.ClusterPermissionsRequest` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyAccessControlRequest` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyAccessControlResponse` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyPermission` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyPermissionLevel` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyPermissions` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyPermissionsDescription` class.
 * Added `com.databricks.sdk.service.compute.ClusterPolicyPermissionsRequest` class.
 * Added `com.databricks.sdk.service.compute.GetClusterPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.compute.GetClusterPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.compute.GetClusterPermissionsRequest` class.
 * Added `com.databricks.sdk.service.compute.GetClusterPolicyPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.compute.GetClusterPolicyPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.compute.GetClusterPolicyPermissionsRequest` class.
 * Added `com.databricks.sdk.service.compute.GetInstancePoolPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.compute.GetInstancePoolPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.compute.GetInstancePoolPermissionsRequest` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolAccessControlRequest` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolAccessControlResponse` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolPermission` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolPermissionLevel` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolPermissions` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolPermissionsDescription` class.
 * Added `com.databricks.sdk.service.compute.InstancePoolPermissionsRequest` class.
 * Changed `set()` method for `workspaceClient.permissions()` service to start returning `com.databricks.sdk.service.iam.ObjectPermissions` class.
 * Changed `update()` method for `workspaceClient.permissions()` service to start returning `com.databricks.sdk.service.iam.ObjectPermissions` class.
 * Added `getPasswordPermissionLevels()` method for `workspaceClient.users()` service.
 * Added `getPasswordPermissions()` method for `workspaceClient.users()` service.
 * Added `setPasswordPermissions()` method for `workspaceClient.users()` service.
 * Added `updatePasswordPermissions()` method for `workspaceClient.users()` service.
 * Added `displayName` field for `com.databricks.sdk.service.iam.AccessControlResponse`.
 * Changed `roles` field for `com.databricks.sdk.service.iam.GetAssignableRolesForResourceResponse` to `com.databricks.sdk.service.iam.RoleList` class.
 * Added `com.databricks.sdk.service.iam.GetPasswordPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.iam.PasswordAccessControlRequest` class.
 * Added `com.databricks.sdk.service.iam.PasswordAccessControlResponse` class.
 * Added `com.databricks.sdk.service.iam.PasswordPermission` class.
 * Added `com.databricks.sdk.service.iam.PasswordPermissionLevel` class.
 * Added `com.databricks.sdk.service.iam.PasswordPermissions` class.
 * Added `com.databricks.sdk.service.iam.PasswordPermissionsDescription` class.
 * Added `com.databricks.sdk.service.iam.PasswordPermissionsRequest` class.
 * Added `com.databricks.sdk.service.iam.Role` class.
 * Added `getJobPermissionLevels()` method for `workspaceClient.jobs()` service.
 * Added `getJobPermissions()` method for `workspaceClient.jobs()` service.
 * Added `setJobPermissions()` method for `workspaceClient.jobs()` service.
 * Added `updateJobPermissions()` method for `workspaceClient.jobs()` service.
 * Added `com.databricks.sdk.service.jobs.GetJobPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.jobs.GetJobPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.jobs.GetJobPermissionsRequest` class.
 * Added `com.databricks.sdk.service.jobs.JobAccessControlRequest` class.
 * Added `com.databricks.sdk.service.jobs.JobAccessControlResponse` class.
 * Added `com.databricks.sdk.service.jobs.JobPermission` class.
 * Added `com.databricks.sdk.service.jobs.JobPermissionLevel` class.
 * Added `com.databricks.sdk.service.jobs.JobPermissions` class.
 * Added `com.databricks.sdk.service.jobs.JobPermissionsDescription` class.
 * Added `com.databricks.sdk.service.jobs.JobPermissionsRequest` class.
 * Added `getExperimentPermissionLevels()` method for `workspaceClient.experiments()` service.
 * Added `getExperimentPermissions()` method for `workspaceClient.experiments()` service.
 * Added `setExperimentPermissions()` method for `workspaceClient.experiments()` service.
 * Added `updateExperimentPermissions()` method for `workspaceClient.experiments()` service.
 * Added `getRegisteredModelPermissionLevels()` method for `workspaceClient.modelRegistry()` service.
 * Added `getRegisteredModelPermissions()` method for `workspaceClient.modelRegistry()` service.
 * Added `setRegisteredModelPermissions()` method for `workspaceClient.modelRegistry()` service.
 * Added `updateRegisteredModelPermissions()` method for `workspaceClient.modelRegistry()` service.
 * Added `com.databricks.sdk.service.ml.ExperimentAccessControlRequest` class.
 * Added `com.databricks.sdk.service.ml.ExperimentAccessControlResponse` class.
 * Added `com.databricks.sdk.service.ml.ExperimentPermission` class.
 * Added `com.databricks.sdk.service.ml.ExperimentPermissionLevel` class.
 * Added `com.databricks.sdk.service.ml.ExperimentPermissions` class.
 * Added `com.databricks.sdk.service.ml.ExperimentPermissionsDescription` class.
 * Added `com.databricks.sdk.service.ml.ExperimentPermissionsRequest` class.
 * Added `com.databricks.sdk.service.ml.GetExperimentPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.ml.GetExperimentPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.ml.GetExperimentPermissionsRequest` class.
 * Added `com.databricks.sdk.service.ml.GetRegisteredModelPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.ml.GetRegisteredModelPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.ml.GetRegisteredModelPermissionsRequest` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelAccessControlRequest` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelAccessControlResponse` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelPermission` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelPermissionLevel` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelPermissions` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelPermissionsDescription` class.
 * Added `com.databricks.sdk.service.ml.RegisteredModelPermissionsRequest` class.
 * Added `scopes` field for `com.databricks.sdk.service.oauth2.CreateCustomAppIntegration`.
 * Added `getPipelinePermissionLevels()` method for `workspaceClient.pipelines()` service.
 * Added `getPipelinePermissions()` method for `workspaceClient.pipelines()` service.
 * Added `setPipelinePermissions()` method for `workspaceClient.pipelines()` service.
 * Added `updatePipelinePermissions()` method for `workspaceClient.pipelines()` service.
 * Added `com.databricks.sdk.service.pipelines.GetPipelinePermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.pipelines.GetPipelinePermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.pipelines.GetPipelinePermissionsRequest` class.
 * Added `com.databricks.sdk.service.pipelines.PipelineAccessControlRequest` class.
 * Added `com.databricks.sdk.service.pipelines.PipelineAccessControlResponse` class.
 * Added `com.databricks.sdk.service.pipelines.PipelinePermission` class.
 * Added `com.databricks.sdk.service.pipelines.PipelinePermissionLevel` class.
 * Added `com.databricks.sdk.service.pipelines.PipelinePermissions` class.
 * Added `com.databricks.sdk.service.pipelines.PipelinePermissionsDescription` class.
 * Added `com.databricks.sdk.service.pipelines.PipelinePermissionsRequest` class.
 * Added `gcpManagedNetworkConfig` field for `com.databricks.sdk.service.provisioning.CreateWorkspaceRequest`.
 * Added `gkeConfig` field for `com.databricks.sdk.service.provisioning.CreateWorkspaceRequest`.
 * Added `getServingEndpointPermissionLevels()` method for `workspaceClient.servingEndpoints()` service.
 * Added `getServingEndpointPermissions()` method for `workspaceClient.servingEndpoints()` service.
 * Added `setServingEndpointPermissions()` method for `workspaceClient.servingEndpoints()` service.
 * Added `updateServingEndpointPermissions()` method for `workspaceClient.servingEndpoints()` service.
 * Added `instanceProfileArn` field for `com.databricks.sdk.service.serving.ServedModelInput`.
 * Added `instanceProfileArn` field for `com.databricks.sdk.service.serving.ServedModelOutput`.
 * Added `com.databricks.sdk.service.serving.GetServingEndpointPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.serving.GetServingEndpointPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.serving.GetServingEndpointPermissionsRequest` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointAccessControlRequest` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointAccessControlResponse` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointPermission` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointPermissionLevel` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointPermissions` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointPermissionsDescription` class.
 * Added `com.databricks.sdk.service.serving.ServingEndpointPermissionsRequest` class.
 * Added `getTokenPermissionLevels()` method for `workspaceClient.tokenManagement()` service.
 * Added `getTokenPermissions()` method for `workspaceClient.tokenManagement()` service.
 * Added `setTokenPermissions()` method for `workspaceClient.tokenManagement()` service.
 * Added `updateTokenPermissions()` method for `workspaceClient.tokenManagement()` service.
 * Added `com.databricks.sdk.service.settings.GetTokenPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.settings.TokenAccessControlRequest` class.
 * Added `com.databricks.sdk.service.settings.TokenAccessControlResponse` class.
 * Added `com.databricks.sdk.service.settings.TokenPermission` class.
 * Added `com.databricks.sdk.service.settings.TokenPermissionLevel` class.
 * Added `com.databricks.sdk.service.settings.TokenPermissions` class.
 * Added `com.databricks.sdk.service.settings.TokenPermissionsDescription` class.
 * Added `com.databricks.sdk.service.settings.TokenPermissionsRequest` class.
 * Added `getWarehousePermissionLevels()` method for `workspaceClient.warehouses()` service.
 * Added `getWarehousePermissions()` method for `workspaceClient.warehouses()` service.
 * Added `setWarehousePermissions()` method for `workspaceClient.warehouses()` service.
 * Added `updateWarehousePermissions()` method for `workspaceClient.warehouses()` service.
 * Added `canSubscribeToLiveQuery` field for `com.databricks.sdk.service.sql.QueryInfo`.
 * Removed `queuedOverloadTimeMs` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Removed `queuedProvisioningTimeMs` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Removed `totalFilesCount` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Removed `totalPartitionsCount` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `metadataTimeMs` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `overloadingQueueStartTimestamp` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `planningPhases` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `planningTimeMs` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `provisioningQueueStartTimestamp` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `prunedBytes` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `prunedFilesCount` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `queryCompilationStartTimestamp` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `queryExecutionTimeMs` field for `com.databricks.sdk.service.sql.QueryMetrics`.
 * Added `com.databricks.sdk.service.sql.GetWarehousePermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.sql.GetWarehousePermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.sql.GetWarehousePermissionsRequest` class.
 * Added `com.databricks.sdk.service.sql.WarehouseAccessControlRequest` class.
 * Added `com.databricks.sdk.service.sql.WarehouseAccessControlResponse` class.
 * Added `com.databricks.sdk.service.sql.WarehousePermission` class.
 * Added `com.databricks.sdk.service.sql.WarehousePermissionLevel` class.
 * Added `com.databricks.sdk.service.sql.WarehousePermissions` class.
 * Added `com.databricks.sdk.service.sql.WarehousePermissionsDescription` class.
 * Added `com.databricks.sdk.service.sql.WarehousePermissionsRequest` class.
 * Added `getRepoPermissionLevels()` method for `workspaceClient.repos()` service.
 * Added `getRepoPermissions()` method for `workspaceClient.repos()` service.
 * Added `setRepoPermissions()` method for `workspaceClient.repos()` service.
 * Added `updateRepoPermissions()` method for `workspaceClient.repos()` service.
 * Added `getWorkspaceObjectPermissionLevels()` method for `workspaceClient.workspace()` service.
 * Added `getWorkspaceObjectPermissions()` method for `workspaceClient.workspace()` service.
 * Added `setWorkspaceObjectPermissions()` method for `workspaceClient.workspace()` service.
 * Added `updateWorkspaceObjectPermissions()` method for `workspaceClient.workspace()` service.
 * Added `com.databricks.sdk.service.workspace.GetRepoPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.workspace.GetRepoPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.workspace.GetRepoPermissionsRequest` class.
 * Added `com.databricks.sdk.service.workspace.GetWorkspaceObjectPermissionLevelsRequest` class.
 * Added `com.databricks.sdk.service.workspace.GetWorkspaceObjectPermissionLevelsResponse` class.
 * Added `com.databricks.sdk.service.workspace.GetWorkspaceObjectPermissionsRequest` class.
 * Added `com.databricks.sdk.service.workspace.RepoAccessControlRequest` class.
 * Added `com.databricks.sdk.service.workspace.RepoAccessControlResponse` class.
 * Added `com.databricks.sdk.service.workspace.RepoPermission` class.
 * Added `com.databricks.sdk.service.workspace.RepoPermissionLevel` class.
 * Added `com.databricks.sdk.service.workspace.RepoPermissions` class.
 * Added `com.databricks.sdk.service.workspace.RepoPermissionsDescription` class.
 * Added `com.databricks.sdk.service.workspace.RepoPermissionsRequest` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectAccessControlRequest` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectAccessControlResponse` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectPermission` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectPermissionLevel` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectPermissions` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectPermissionsDescription` class.
 * Added `com.databricks.sdk.service.workspace.WorkspaceObjectPermissionsRequest` class.

OpenAPI SHA: 386b65ecdc825b9c3ed4aa7ca88e2e5baf9d87df, Date: 2023-08-07


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
