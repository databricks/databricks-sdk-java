# NEXT CHANGELOG

## Release v0.62.0

### New Features and Improvements

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
* Added `com.databricks.sdk.service.iamv2` package.
* Added `accountClient.accountIamV2()` service and `workspaceClient.workspaceIamV2()` service.
* Added `feedback` field for `com.databricks.sdk.service.dashboards.GenieMessage`.
* Added `disabled` field for `com.databricks.sdk.service.jobs.Task`.
* Added `auxiliaryManagedLocation` field for `com.databricks.sdk.service.sharing.TableInternalAttributes`.
* Added `alerts` field for `com.databricks.sdk.service.sql.ListAlertsV2Response`.
* Added `NO_ACTIVATED_K8S` and `USAGE_POLICY_ENTITLEMENT_DENIED` enum values for `com.databricks.sdk.service.compute.TerminationReasonCode`.
* Added `FOREIGN_CATALOG` enum value for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* Added `FOREIGN_ICEBERG_TABLE` enum value for `com.databricks.sdk.service.sharing.TableInternalAttributesSharedTableType`.
* [Breaking] Removed `disabled` field for `com.databricks.sdk.service.jobs.RunTask`.