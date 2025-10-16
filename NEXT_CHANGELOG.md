# NEXT CHANGELOG

## Release v0.67.0

### New Features and Improvements

* Add a new config attribute `DATABRICKS_DISABLE_RETRIES` to disable the 
  default retry mechanism.

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
* Add `absoluteSessionLifetimeInMinutes` and `enableSingleUseRefreshTokens` fields for `com.databricks.sdk.service.oauth2.TokenAccessPolicy`.
* Add `networkConnectivityConfigId` field for `com.databricks.sdk.service.provisioning.CreateWorkspaceRequest`.
* Add `OAUTH_MTLS` enum value for `com.databricks.sdk.service.catalog.CredentialType`.
* Add `NETWORK_CHECK_NIC_FAILURE_DUE_TO_MISCONFIG`, `NETWORK_CHECK_DNS_SERVER_FAILURE_DUE_TO_MISCONFIG`, `NETWORK_CHECK_STORAGE_FAILURE_DUE_TO_MISCONFIG`, `NETWORK_CHECK_METADATA_ENDPOINT_FAILURE_DUE_TO_MISCONFIG`, `NETWORK_CHECK_CONTROL_PLANE_FAILURE_DUE_TO_MISCONFIG` and `NETWORK_CHECK_MULTIPLE_COMPONENTS_FAILURE_DUE_TO_MISCONFIG` enum values for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Add `CREATING` and `CREATE_FAILED` enum values for `com.databricks.sdk.service.settings.NccPrivateEndpointRulePrivateLinkConnectionState`.
* Add `NETWORK_CHECK_NIC_FAILURE_DUE_TO_MISCONFIG`, `NETWORK_CHECK_DNS_SERVER_FAILURE_DUE_TO_MISCONFIG`, `NETWORK_CHECK_STORAGE_FAILURE_DUE_TO_MISCONFIG`, `NETWORK_CHECK_METADATA_ENDPOINT_FAILURE_DUE_TO_MISCONFIG`, `NETWORK_CHECK_CONTROL_PLANE_FAILURE_DUE_TO_MISCONFIG` and `NETWORK_CHECK_MULTIPLE_COMPONENTS_FAILURE_DUE_TO_MISCONFIG` enum values for `com.databricks.sdk.service.sql.TerminationReasonCode`.
* [Breaking] Remove `update()` method for `workspaceClient.recipientFederationPolicies()` service.