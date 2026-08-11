# NEXT CHANGELOG

## Release v0.144.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `forwardUserAccessToken` field for `com.databricks.sdk.service.apps.App`.
* Add `forwardUserAccessToken` field for `com.databricks.sdk.service.apps.AppUpdate`.
* Add `includeValue` field for `com.databricks.sdk.service.catalog.GetSecretRequest`.
* Add `dockerImageUrl` field for `com.databricks.sdk.service.jobs.AiRuntimeTask`.
* Add `GPU_XLARGE_8` enum value for `com.databricks.sdk.service.serving.ServedModelInputWorkloadType`.
* Add `GPU_XLARGE_8` enum value for `com.databricks.sdk.service.serving.ServingModelWorkloadType`.
* Add `LEGACY_MODE` enum value for `com.databricks.sdk.service.settings.CustomerFacingIngressNetworkPolicyCrossWorkspaceAccessRestrictionMode`.
* Change `accountSpStatus` and `displayName` fields for `com.databricks.sdk.service.iamv2.ServicePrincipal` to be required.
* Change `accountUserStatus`, `fullName` and `username` fields for `com.databricks.sdk.service.iamv2.User` to be required.