# NEXT CHANGELOG

## Release v0.73.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

* Add `@InternalApi` annotation to clarify the public API surface. Classes 
  marked with `@InternalApi` are intended for internal use only and may change
  without notice. Only unmarked classes (e.g., `DatabricksConfig`, exceptions, 
  error types, extension interfaces) are part of the stable public API.

### Internal Changes

### API Changes
* Add `com.databricks.sdk.service.postgres` package.
* Add `workspaceClient.postgres()` service.
* Add `effectiveUsagePolicyId` and `usagePolicyId` fields for `com.databricks.sdk.service.apps.App`.
* Add `externalAccessEnabled` field for `com.databricks.sdk.service.catalog.CreateAccountsMetastore`.
* Add `externalAccessEnabled` field for `com.databricks.sdk.service.catalog.CreateMetastore`.
* Add `externalAccessEnabled` field for `com.databricks.sdk.service.catalog.UpdateAccountsMetastore`.
* Add `externalAccessEnabled` field for `com.databricks.sdk.service.catalog.UpdateMetastore`.
* Add `usagePolicyId` field for `com.databricks.sdk.service.ml.OnlineStore`.
* Add `errorMessage` field for `com.databricks.sdk.service.settings.CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRule`.
* Add `errorMessage` field for `com.databricks.sdk.service.settings.NccAzurePrivateEndpointRule`.
* Add `CONTROL_PLANE_CONNECTION_FAILURE` and `CONTROL_PLANE_CONNECTION_FAILURE_DUE_TO_MISCONFIG` enum values for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Add `CONTROL_PLANE_CONNECTION_FAILURE` and `CONTROL_PLANE_CONNECTION_FAILURE_DUE_TO_MISCONFIG` enum values for `com.databricks.sdk.service.sql.TerminationReasonCode`.