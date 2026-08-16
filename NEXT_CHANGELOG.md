# NEXT CHANGELOG

## Release v0.147.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `agentType` field for `com.databricks.sdk.service.dashboards.GenieConversationSummary`.
* Add `groupId` field for `com.databricks.sdk.service.iamv2.DirectGroupMember`.
* Add `effectiveServerlessComputeId` field for `com.databricks.sdk.service.jobs.RunTask`.
* Add `pipelineChannel` field for `com.databricks.sdk.service.postgres.NewPipelineSpec`.
* Add `TEXT_ATTACHMENT_PURPOSE_ANSWER` enum value for `com.databricks.sdk.service.dashboards.TextAttachmentPurpose`.
* [Breaking] Add pagination for `accountClient.accountIamV2().listDirectGroupMembers()` method.
* [Breaking] Add pagination for `accountClient.accountIamV2().listWorkspaceAssignmentDetails()` method.
* [Breaking] Add pagination for `workspaceClient.workspaceIamV2().listDirectGroupMembersProxy()` method.
* [Breaking] Add pagination for `workspaceClient.workspaceIamV2().listWorkspaceAssignmentDetailsProxy()` method.
* Add `PG_SPECIFIC_TYPE_HALFVEC` and `PG_SPECIFIC_TYPE_VARCHAR` enum values for `com.databricks.sdk.service.database.SyncedTableSpecPgSpecificType`.
* Add `PG_SPECIFIC_TYPE_HALFVEC` and `PG_SPECIFIC_TYPE_VARCHAR` enum values for `com.databricks.sdk.service.postgres.SyncedTableSyncedTableSpecPgSpecificType`.
* [Breaking] Add pagination for `accountClient.accountIamV2().listWorkspaceAssignments()` method.
* [Breaking] Add pagination for `workspaceClient.workspaceIamV2().listWorkspaceAssignmentsProxy()` method.
* Add `linkedinAdsOptions` and `marketoOptions` fields for `com.databricks.sdk.service.pipelines.ConnectorOptions`.