# NEXT CHANGELOG

## Release v0.131.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `dataframeSchema` and `transformationSql` fields for `com.databricks.sdk.service.ml.StreamSource`.
* Add `effectiveTablePrefix` field for `com.databricks.sdk.service.ml.UcTraceLocation`.
* Add `performanceTarget` field for `com.databricks.sdk.service.jobs.SubmitRun`.
* Add `awsVpcEndpointInfo` and `gcpPscEndpointInfo` fields for `com.databricks.sdk.service.networking.Endpoint`.
* Add `gitCliEnabled` field for `com.databricks.sdk.service.workspace.GetRepoResponse`.
* Add `KSA_ECC_CCC_DCC` enum value for `com.databricks.sdk.service.settings.ComplianceStandard`.
* [Breaking] Change `createWorkspaceAssignmentDetail()`, `deleteWorkspaceAssignmentDetail()`, `getWorkspaceAccessDetail()`, `getWorkspaceAssignmentDetail()`, `listWorkspaceAssignmentDetails()`, `resolveGroup()`, `resolveServicePrincipal()`, `resolveUser()` and `updateWorkspaceAssignmentDetail()` methods for `accountClient.accountIamV2()` service. Method path has changed.
* [Breaking] Change `createWorkspaceAssignmentDetailProxy()`, `deleteWorkspaceAssignmentDetailProxy()`, `getWorkspaceAccessDetailLocal()`, `getWorkspaceAssignmentDetailProxy()`, `listWorkspaceAssignmentDetailsProxy()`, `resolveGroupProxy()`, `resolveServicePrincipalProxy()`, `resolveUserProxy()` and `updateWorkspaceAssignmentDetailProxy()` methods for `workspaceClient.workspaceIamV2()` service. Method path has changed.
* [Breaking] Remove `longRolling` field for `com.databricks.sdk.service.ml.TimeWindow`.