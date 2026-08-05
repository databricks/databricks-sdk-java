# NEXT CHANGELOG

## Release v0.142.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

* Fixed requests with a streaming body (e.g. `files().upload()`) silently uploading an empty body when retried. A single-use `InputStream` body is consumed by the first attempt, so retrying a retriable error (e.g. HTTP 503) re-sent an empty stream, which could write a 0-byte file or surface as a confusing error. The SDK no longer retries a streaming request once its body has been sent, and instead surfaces the original error so the caller can retry with a fresh stream.

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `principalOverrides` and `scopeType` fields for `com.databricks.sdk.service.billing.AlertConfiguration`.
* Add `resourceType` field for `com.databricks.sdk.service.billing.BudgetConfiguration`.
* Add `resourceType` field for `com.databricks.sdk.service.billing.CreateBudgetConfigurationBudget`.
* Add `principalOverrides` and `scopeType` fields for `com.databricks.sdk.service.billing.CreateBudgetConfigurationBudgetAlertConfigurations`.
* Add `resourceType` field for `com.databricks.sdk.service.billing.UpdateBudgetConfigurationBudget`.
* Add `grant` field for `com.databricks.sdk.service.catalog.PolicyInfo`.
* Add `BLOCK_USAGE` enum value for `com.databricks.sdk.service.billing.ActionConfigurationType`.
* Add `POLICY_TYPE_GRANT` enum value for `com.databricks.sdk.service.catalog.PolicyType`.