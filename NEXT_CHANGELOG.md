# NEXT CHANGELOG

## Release v0.66.0

### New Features and Improvements

* Add native support for Azure DevOps OIDC authentication.

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
* Add `com.databricks.sdk.service.dataquality` package.
* Add `workspaceClient.dataQuality()` service.
* Add `createUpdate()` and `getUpdate()` methods for `workspaceClient.apps()` service.
* Add `updateNotifications()` method for `workspaceClient.servingEndpoints()` service.
* Add `computeSize` field for `com.databricks.sdk.service.apps.App`.
* Add `genieSpace` field for `com.databricks.sdk.service.apps.AppResource`.
* Add `skipValidation` field for `com.databricks.sdk.service.catalog.AccountsCreateStorageCredential`.
* Add `skipValidation` field for `com.databricks.sdk.service.catalog.AccountsUpdateStorageCredential`.
* Add `aliases`, `browseOnly`, `createdAt`, `createdBy`, `fullName`, `metastoreId`, `owner`, `updatedAt` and `updatedBy` fields for `com.databricks.sdk.service.catalog.CreateRegisteredModelRequest`.
* Add `includeUnbound` field for `com.databricks.sdk.service.catalog.ListCatalogsRequest`.
* Add `includeUnbound` field for `com.databricks.sdk.service.catalog.ListCredentialsRequest`.
* Add `includeUnbound` field for `com.databricks.sdk.service.catalog.ListExternalLocationsRequest`.
* Add `includeUnbound` field for `com.databricks.sdk.service.catalog.ListStorageCredentialsRequest`.
* Add `catalogName`, `id`, `modelName` and `schemaName` fields for `com.databricks.sdk.service.catalog.RegisteredModelAlias`.
* Add `aliases`, `catalogName`, `createdAt`, `createdBy`, `id`, `metastoreId`, `modelName`, `modelVersionDependencies`, `runId`, `runWorkspaceId`, `schemaName`, `source`, `status`, `storageLocation`, `updatedAt` and `updatedBy` fields for `com.databricks.sdk.service.catalog.UpdateModelVersionRequest`.
* Add `aliases`, `browseOnly`, `catalogName`, `createdAt`, `createdBy`, `metastoreId`, `name`, `schemaName`, `storageLocation`, `updatedAt` and `updatedBy` fields for `com.databricks.sdk.service.catalog.UpdateRegisteredModelRequest`.
* Add `parameters` field for `com.databricks.sdk.service.dashboards.GenieQueryAttachment`.
* Add `databaseInstanceName` field for `com.databricks.sdk.service.database.CreateDatabaseInstanceRoleRequest`.
* Add `customTags`, `effectiveCustomTags`, `effectiveUsagePolicyId` and `usagePolicyId` fields for `com.databricks.sdk.service.database.DatabaseInstance`.
* Add `effectiveAttributes` and `instanceName` fields for `com.databricks.sdk.service.database.DatabaseInstanceRole`.
* Add `keyRegion` field for `com.databricks.sdk.service.provisioning.CreateAwsKeyInfo`.
* Add `roleArn` field for `com.databricks.sdk.service.provisioning.CreateStorageConfigurationRequest`.
* Add `computeMode` field for `com.databricks.sdk.service.provisioning.CreateWorkspaceRequest`.
* Add `azureKeyInfo` field for `com.databricks.sdk.service.provisioning.CustomerManagedKey`.
* [Breaking] Add `customerFacingPrivateAccessSettings` field for `com.databricks.sdk.service.provisioning.ReplacePrivateAccessSettingsRequest`.
* Add `roleArn` field for `com.databricks.sdk.service.provisioning.StorageConfiguration`.
* [Breaking] Add `customerFacingWorkspace` field for `com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest`.
* Add `updateMask` field for `com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest`.
* Add `computeMode`, `expectedWorkspaceStatus`, `network`, `networkConnectivityConfigId` and `storageMode` fields for `com.databricks.sdk.service.provisioning.Workspace`.
* Add `dependencyStorageLocations` field for `com.databricks.sdk.service.sharing.TableInternalAttributes`.
* Add `enableServerlessCompute` field for `com.databricks.sdk.service.sql.GetWorkspaceWarehouseConfigResponse`.
* Add `pageSize` and `pageToken` fields for `com.databricks.sdk.service.sql.ListWarehousesRequest`.
* Add `nextPageToken` field for `com.databricks.sdk.service.sql.ListWarehousesResponse`.
* Add `enableServerlessCompute` field for `com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest`.
* Add `gitEmail` field for `com.databricks.sdk.service.workspace.CreateCredentialsRequest`.
* Add `gitEmail` field for `com.databricks.sdk.service.workspace.CreateCredentialsResponse`.
* Add `gitEmail` field for `com.databricks.sdk.service.workspace.CredentialInfo`.
* Add `gitEmail` field for `com.databricks.sdk.service.workspace.GetCredentialsResponse`.
* Add `gitEmail` field for `com.databricks.sdk.service.workspace.UpdateCredentialsRequest`.
* Add `MODEL_VERSION_STATUS_UNKNOWN` enum value for `com.databricks.sdk.service.catalog.ModelVersionInfoStatus`.
* Add `EXTERNAL_USE_SCHEMA` enum value for `com.databricks.sdk.service.catalog.Privilege`.
* Add `STREAM_NATIVE` enum value for `com.databricks.sdk.service.catalog.SystemType`.
* Add `K8S_ACTIVE_POD_QUOTA_EXCEEDED` and `CLOUD_ACCOUNT_POD_QUOTA_EXCEEDED` enum values for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Add `EXCEEDED_MAX_TOKEN_LENGTH_EXCEPTION`, `INTERNAL_CATALOG_ASSET_CREATION_ONGOING_EXCEPTION`, `INTERNAL_CATALOG_ASSET_CREATION_FAILED_EXCEPTION` and `INTERNAL_CATALOG_ASSET_CREATION_UNSUPPORTED_EXCEPTION` enum values for `com.databricks.sdk.service.dashboards.MessageErrorType`.
* Add `ASSET_TYPE_MCP` enum value for `com.databricks.sdk.service.marketplace.AssetType`.
* Add `GERMANY_TISAX` enum value for `com.databricks.sdk.service.settings.ComplianceStandard`.
* Add `SSH_BOOTSTRAP_FAILURE`, `AWS_INACCESSIBLE_KMS_KEY_FAILURE`, `INIT_CONTAINER_NOT_FINISHED`, `SPARK_IMAGE_DOWNLOAD_THROTTLED`, `SPARK_IMAGE_NOT_FOUND`, `CLUSTER_OPERATION_THROTTLED`, `CLUSTER_OPERATION_TIMEOUT`, `SERVERLESS_LONG_RUNNING_TERMINATED`, `AZURE_PACKED_DEPLOYMENT_PARTIAL_FAILURE`, `INVALID_WORKER_IMAGE_FAILURE`, `WORKSPACE_UPDATE`, `INVALID_AWS_PARAMETER`, `DRIVER_OUT_OF_DISK`, `DRIVER_OUT_OF_MEMORY`, `DRIVER_LAUNCH_TIMEOUT`, `DRIVER_UNEXPECTED_FAILURE`, `UNEXPECTED_POD_RECREATION`, `GCP_INACCESSIBLE_KMS_KEY_FAILURE`, `GCP_KMS_KEY_PERMISSION_DENIED`, `DRIVER_EVICTION`, `USER_INITIATED_VM_TERMINATION`, `GCP_IAM_TIMEOUT`, `AWS_RESOURCE_QUOTA_EXCEEDED`, `CLOUD_ACCOUNT_SETUP_FAILURE`, `AWS_INVALID_KEY_PAIR`, `DRIVER_POD_CREATION_FAILURE`, `MAINTENANCE_MODE`, `INTERNAL_CAPACITY_FAILURE`, `EXECUTOR_POD_UNSCHEDULED`, `STORAGE_DOWNLOAD_FAILURE_SLOW`, `STORAGE_DOWNLOAD_FAILURE_THROTTLED`, `DYNAMIC_SPARK_CONF_SIZE_EXCEEDED`, `AWS_INSTANCE_PROFILE_UPDATE_FAILURE`, `INSTANCE_POOL_NOT_FOUND`, `INSTANCE_POOL_MAX_CAPACITY_REACHED`, `AWS_INVALID_KMS_KEY_STATE`, `GCP_INSUFFICIENT_CAPACITY`, `GCP_API_RATE_QUOTA_EXCEEDED`, `GCP_RESOURCE_QUOTA_EXCEEDED`, `GCP_IP_SPACE_EXHAUSTED`, `GCP_SERVICE_ACCOUNT_ACCESS_DENIED`, `GCP_SERVICE_ACCOUNT_NOT_FOUND`, `GCP_FORBIDDEN`, `GCP_NOT_FOUND`, `RESOURCE_USAGE_BLOCKED`, `DATA_ACCESS_CONFIG_CHANGED`, `ACCESS_TOKEN_FAILURE`, `INVALID_INSTANCE_PLACEMENT_PROTOCOL`, `BUDGET_POLICY_RESOLUTION_FAILURE`, `IN_PENALTY_BOX`, `DISASTER_RECOVERY_REPLICATION`, `BOOTSTRAP_TIMEOUT_DUE_TO_MISCONFIG`, `INSTANCE_UNREACHABLE_DUE_TO_MISCONFIG`, `STORAGE_DOWNLOAD_FAILURE_DUE_TO_MISCONFIG`, `CONTROL_PLANE_REQUEST_FAILURE_DUE_TO_MISCONFIG`, `CLOUD_PROVIDER_LAUNCH_FAILURE_DUE_TO_MISCONFIG`, `GCP_SUBNET_NOT_READY`, `CLOUD_OPERATION_CANCELLED`, `CLOUD_PROVIDER_INSTANCE_NOT_LAUNCHED`, `GCP_TRUSTED_IMAGE_PROJECTS_VIOLATED`, `BUDGET_POLICY_LIMIT_ENFORCEMENT_ACTIVATED`, `EOS_SPARK_IMAGE`, `NO_MATCHED_K8S`, `LAZY_ALLOCATION_TIMEOUT`, `DRIVER_NODE_UNREACHABLE`, `SECRET_CREATION_FAILURE`, `POD_SCHEDULING_FAILURE`, `POD_ASSIGNMENT_FAILURE`, `ALLOCATION_TIMEOUT`, `ALLOCATION_TIMEOUT_NO_UNALLOCATED_CLUSTERS`, `ALLOCATION_TIMEOUT_NO_MATCHED_CLUSTERS`, `ALLOCATION_TIMEOUT_NO_READY_CLUSTERS`, `ALLOCATION_TIMEOUT_NO_WARMED_UP_CLUSTERS`, `ALLOCATION_TIMEOUT_NODE_DAEMON_NOT_READY`, `ALLOCATION_TIMEOUT_NO_HEALTHY_CLUSTERS`, `NETVISOR_SETUP_TIMEOUT`, `NO_MATCHED_K8S_TESTING_TAG`, `CLOUD_PROVIDER_RESOURCE_STOCKOUT_DUE_TO_MISCONFIG`, `GKE_BASED_CLUSTER_TERMINATION`, `ALLOCATION_TIMEOUT_NO_HEALTHY_AND_WARMED_UP_CLUSTERS`, `DOCKER_INVALID_OS_EXCEPTION`, `DOCKER_CONTAINER_CREATION_EXCEPTION`, `DOCKER_IMAGE_TOO_LARGE_FOR_INSTANCE_EXCEPTION`, `DNS_RESOLUTION_ERROR`, `GCP_DENIED_BY_ORG_POLICY`, `SECRET_PERMISSION_DENIED`, `NETWORK_CHECK_NIC_FAILURE`, `NETWORK_CHECK_DNS_SERVER_FAILURE`, `NETWORK_CHECK_STORAGE_FAILURE`, `NETWORK_CHECK_METADATA_ENDPOINT_FAILURE`, `NETWORK_CHECK_CONTROL_PLANE_FAILURE`, `NETWORK_CHECK_MULTIPLE_COMPONENTS_FAILURE`, `DRIVER_UNHEALTHY`, `SECURITY_AGENTS_FAILED_INITIAL_VERIFICATION`, `DRIVER_DNS_RESOLUTION_FAILURE`, `NO_ACTIVATED_K8S`, `USAGE_POLICY_ENTITLEMENT_DENIED`, `NO_ACTIVATED_K8S_TESTING_TAG`, `K8S_ACTIVE_POD_QUOTA_EXCEEDED` and `CLOUD_ACCOUNT_POD_QUOTA_EXCEEDED` enum values for `com.databricks.sdk.service.sql.TerminationReasonCode`.
* [Breaking] Change `create()` method for `accountClient.accountMetastoreAssignments()` service to start returning `com.databricks.sdk.service.catalog.AccountsCreateMetastoreAssignmentResponse` class.
* [Breaking] Change `delete()` method for `accountClient.accountMetastoreAssignments()` service to start returning `com.databricks.sdk.service.catalog.AccountsDeleteMetastoreAssignmentResponse` class.
* [Breaking] Change `update()` method for `accountClient.accountMetastoreAssignments()` service to start returning `com.databricks.sdk.service.catalog.AccountsUpdateMetastoreAssignmentResponse` class.
* [Breaking] Change `create()` method for `accountClient.accountMetastores()` service to return `com.databricks.sdk.service.catalog.AccountsCreateMetastoreResponse` class.
* [Breaking] Change `delete()` method for `accountClient.accountMetastores()` service to start returning `com.databricks.sdk.service.catalog.AccountsDeleteMetastoreResponse` class.
* [Breaking] Change `get()` method for `accountClient.accountMetastores()` service to return `com.databricks.sdk.service.catalog.AccountsGetMetastoreResponse` class.
* [Breaking] Change `list()` method for `accountClient.accountMetastores()` service to return `com.databricks.sdk.service.catalog.AccountsListMetastoresResponse` class.
* [Breaking] Change `update()` method for `accountClient.accountMetastores()` service to return `com.databricks.sdk.service.catalog.AccountsUpdateMetastoreResponse` class.
* [Breaking] Change `create()` method for `accountClient.accountStorageCredentials()` service to return `com.databricks.sdk.service.catalog.AccountsCreateStorageCredentialInfo` class.
* [Breaking] Change `delete()` method for `accountClient.accountStorageCredentials()` service to start returning `com.databricks.sdk.service.catalog.AccountsDeleteStorageCredentialResponse` class.
* [Breaking] Change `update()` method for `accountClient.accountStorageCredentials()` service to return `com.databricks.sdk.service.catalog.AccountsUpdateStorageCredentialResponse` class.
* [Breaking] Change `create()` method for `workspaceClient.registeredModels()` service with new required argument order.
* [Breaking] Change `delete()` method for `accountClient.credentials()` service to start returning `com.databricks.sdk.service.provisioning.Credential` class.
* [Breaking] Change `delete()` method for `accountClient.encryptionKeys()` service to start returning `com.databricks.sdk.service.provisioning.CustomerManagedKey` class.
* [Breaking] Change `create()` method for `accountClient.networks()` service with new required argument order.
* [Breaking] Change `delete()` method for `accountClient.networks()` service to start returning `com.databricks.sdk.service.provisioning.Network` class.
* [Breaking] Change `create()` and `replace()` methods for `accountClient.privateAccess()` service with new required argument order.
* [Breaking] Change `delete()` and `replace()` methods for `accountClient.privateAccess()` service to start returning `com.databricks.sdk.service.provisioning.PrivateAccessSettings` class.
* [Breaking] Change `delete()` method for `accountClient.storage()` service to start returning `com.databricks.sdk.service.provisioning.StorageConfiguration` class.
* [Breaking] Change `create()` method for `accountClient.vpcEndpoints()` service with new required argument order.
* [Breaking] Change `delete()` method for `accountClient.vpcEndpoints()` service to start returning `com.databricks.sdk.service.provisioning.VpcEndpoint` class.
* [Breaking] Change `create()` and `update()` methods for `accountClient.workspaces()` service with new required argument order.
* [Breaking] Change `delete()` and `update()` methods for `accountClient.workspaces()` service to start returning `com.databricks.sdk.service.provisioning.Workspace` class.
* [Breaking] Change `executeStatement()` method for `workspaceClient.statementExecution()` service . Method path has changed.
* [Breaking] Change `metastoreInfo` field for `com.databricks.sdk.service.catalog.AccountsCreateMetastore` to type `com.databricks.sdk.service.catalog.CreateAccountsMetastore` class.
* [Breaking] Change `credentialInfo` field for `com.databricks.sdk.service.catalog.AccountsCreateStorageCredential` to type `com.databricks.sdk.service.catalog.CreateAccountsStorageCredential` class.
* [Breaking] Change `metastoreInfo` field for `com.databricks.sdk.service.catalog.AccountsUpdateMetastore` to type `com.databricks.sdk.service.catalog.UpdateAccountsMetastore` class.
* [Breaking] Change `credentialInfo` field for `com.databricks.sdk.service.catalog.AccountsUpdateStorageCredential` to type `com.databricks.sdk.service.catalog.UpdateAccountsStorageCredential` class.
* Change `catalogName`, `name` and `schemaName` fields for `com.databricks.sdk.service.catalog.CreateRegisteredModelRequest` to no longer be required.
* Change `name` field for `com.databricks.sdk.service.database.DatabaseInstanceRole` to be required.
* [Breaking] Change `name` field for `com.databricks.sdk.service.database.DatabaseInstanceRole` to be required.
* Change `networkName` field for `com.databricks.sdk.service.provisioning.CreateNetworkRequest` to no longer be required.
* Change `privateAccessSettingsName` and `region` fields for `com.databricks.sdk.service.provisioning.CreatePrivateAccessSettingsRequest` to no longer be required.
* Change `vpcEndpointName` field for `com.databricks.sdk.service.provisioning.CreateVpcEndpointRequest` to no longer be required.
* Change `workspaceName` field for `com.databricks.sdk.service.provisioning.CreateWorkspaceRequest` to no longer be required.
* [Breaking] Change `dataplaneRelay` and `restApi` fields for `com.databricks.sdk.service.provisioning.NetworkVpcEndpoints` to no longer be required.
* Change `dataplaneRelay` and `restApi` fields for `com.databricks.sdk.service.provisioning.NetworkVpcEndpoints` to no longer be required.
* [Breaking] Change waiter for `accountClient.workspaces().update()` method.
* [Breaking] Remove `browseOnly` field for `com.databricks.sdk.service.catalog.ModelVersionInfo`.
* [Breaking] Remove `jarDependencies` field for `com.databricks.sdk.service.compute.Environment`.
* [Breaking] Remove `isNoPublicIpEnabled` field for `com.databricks.sdk.service.provisioning.CreateWorkspaceRequest`.
* [Breaking] Remove `allowedVpcEndpointIds`, `privateAccessLevel`, `privateAccessSettingsName`, `publicAccessEnabled` and `region` fields for `com.databricks.sdk.service.provisioning.ReplacePrivateAccessSettingsRequest`.
* [Breaking] Remove `externalId` field for `com.databricks.sdk.service.provisioning.StsRole`.
* [Breaking] Remove `awsRegion`, `credentialsId`, `customTags`, `managedServicesCustomerManagedKeyId`, `networkConnectivityConfigId`, `networkId`, `privateAccessSettingsId`, `storageConfigurationId` and `storageCustomerManagedKeyId` fields for `com.databricks.sdk.service.provisioning.UpdateWorkspaceRequest`.
* [Breaking] Remove `externalCustomerInfo` and `isNoPublicIpEnabled` fields for `com.databricks.sdk.service.provisioning.Workspace`.
* [Breaking] Remove `STATUS_UNSPECIFIED` enum value for `com.databricks.sdk.service.sql.Status`.
