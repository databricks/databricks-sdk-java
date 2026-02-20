# NEXT CHANGELOG

## Release v0.92.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `readOnlyHost` field for `com.databricks.sdk.service.postgres.EndpointHosts`.
* Add `group` field for `com.databricks.sdk.service.postgres.EndpointSpec`.
* Add `group` field for `com.databricks.sdk.service.postgres.EndpointStatus`.
* Add `initialEndpointSpec` field for `com.databricks.sdk.service.postgres.Project`.
* Add `DEGRADED` enum value for `com.databricks.sdk.service.postgres.EndpointStatusState`.
* Add `patchEndpoint()` method for `workspaceClient.vectorSearchEndpoints()` service.
* Add `app` field for `com.databricks.sdk.service.apps.AppResource`.
* Add `securableKind` field for `com.databricks.sdk.service.apps.AppResourceUcSecurable`.
* Add `minQps` field for `com.databricks.sdk.service.vectorsearch.CreateEndpoint`.
* Add `scalingInfo` field for `com.databricks.sdk.service.vectorsearch.EndpointInfo`.
* Add `MODIFY` enum value for `com.databricks.sdk.service.apps.AppResourceUcSecurableUcSecurablePermission`.
* Add `COULD_NOT_GET_DASHBOARD_SCHEMA_EXCEPTION` enum value for `com.databricks.sdk.service.dashboards.MessageErrorType`.