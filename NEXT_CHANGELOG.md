# NEXT CHANGELOG

## Release v0.63.0

### New Features and Improvements

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
* Added `workspaceClient.featureEngineering()` service.
* Added `javaDependencies` field for `com.databricks.sdk.service.compute.Environment`.
* Added `followupQuestions` field for `com.databricks.sdk.service.dashboards.GenieAttachment`.
* Added `effectiveCapacity` field for `com.databricks.sdk.service.database.DatabaseInstance`.
* Added `createTime` and `updateTime` fields for `com.databricks.sdk.service.tags.TagPolicy`.
* Added `TABLE_DELTA_UNIFORM_ICEBERG_FOREIGN_DELTASHARING` enum value for `com.databricks.sdk.service.catalog.SecurableKind`.
* Added `INTERNAL_CATALOG_PATH_OVERLAP_EXCEPTION` enum value for `com.databricks.sdk.service.dashboards.MessageErrorType`.
* [Breaking] Changed `creationTime` field for `com.databricks.sdk.service.agentbricks.CustomLlm` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.agentbricks.UpdateCustomLlmRequest` to type `String` class.
* [Breaking] Changed `createTime` and `updateTime` fields for `com.databricks.sdk.service.apps.App` to type `String` class.
* [Breaking] Changed `createTime` and `updateTime` fields for `com.databricks.sdk.service.apps.AppDeployment` to type `String` class.
* [Breaking] Changed `timestamp` field for `com.databricks.sdk.service.catalog.ContinuousUpdateStatus` to type `String` class.
* [Breaking] Changed `eventTime` field for `com.databricks.sdk.service.catalog.ExternalLineageExternalMetadataInfo` to type `String` class.
* [Breaking] Changed `eventTime` field for `com.databricks.sdk.service.catalog.ExternalLineageFileInfo` to type `String` class.
* [Breaking] Changed `eventTime` field for `com.databricks.sdk.service.catalog.ExternalLineageModelVersionInfo` to type `String` class.
* [Breaking] Changed `eventTime` field for `com.databricks.sdk.service.catalog.ExternalLineageTableInfo` to type `String` class.
* [Breaking] Changed `createTime` and `updateTime` fields for `com.databricks.sdk.service.catalog.ExternalMetadata` to type `String` class.
* [Breaking] Changed `timestamp` field for `com.databricks.sdk.service.catalog.FailedStatus` to type `String` class.
* [Breaking] Changed `timestamp` field for `com.databricks.sdk.service.catalog.TriggeredUpdateStatus` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.catalog.UpdateAccessRequestDestinationsRequest` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.catalog.UpdateEntityTagAssignmentRequest` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.catalog.UpdateExternalLineageRelationshipRequest` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.catalog.UpdateExternalMetadataRequest` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.catalog.UpdatePolicyRequest` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.compute.UpdateCluster` to type `String` class.
* [Breaking] Changed `createTime` and `updateTime` fields for `com.databricks.sdk.service.dashboards.Dashboard` to type `String` class.
* [Breaking] Changed `revisionCreateTime` field for `com.databricks.sdk.service.dashboards.PublishedDashboard` to type `String` class.
* [Breaking] Changed `createTime` and `updateTime` fields for `com.databricks.sdk.service.dashboards.Schedule` to type `String` class.
* [Breaking] Changed `createTime` and `updateTime` fields for `com.databricks.sdk.service.dashboards.Subscription` to type `String` class.
* [Breaking] Changed `expirationTime` field for `com.databricks.sdk.service.database.DatabaseCredential` to type `String` class.
* [Breaking] Changed `creationTime` field for `com.databricks.sdk.service.database.DatabaseInstance` to type `String` class.
* [Breaking] Changed `branchTime` field for `com.databricks.sdk.service.database.DatabaseInstanceRef` to type `String` class.
* [Breaking] Changed `deltaCommitTimestamp` field for `com.databricks.sdk.service.database.DeltaTableSyncInfo` to type `String` class.
* [Breaking] Changed `timestamp` field for `com.databricks.sdk.service.database.SyncedTableContinuousUpdateStatus` to type `String` class.
* [Breaking] Changed `timestamp` field for `com.databricks.sdk.service.database.SyncedTableFailedStatus` to type `String` class.
* [Breaking] Changed `syncEndTimestamp` and `syncStartTimestamp` fields for `com.databricks.sdk.service.database.SyncedTablePosition` to type `String` class.
* [Breaking] Changed `timestamp` field for `com.databricks.sdk.service.database.SyncedTableTriggeredUpdateStatus` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.database.UpdateDatabaseCatalogRequest` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.database.UpdateDatabaseInstanceRequest` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.database.UpdateSyncedDatabaseTableRequest` to type `String` class.
* [Breaking] Changed `creationTime` field for `com.databricks.sdk.service.ml.OnlineStore` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.ml.UpdateFeatureTagRequest` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.ml.UpdateOnlineStoreRequest` to type `String` class.
* [Breaking] Changed `lifetime` field for `com.databricks.sdk.service.oauth2.CreateServicePrincipalSecretRequest` to type `String` class.
* [Breaking] Changed `expireTime` field for `com.databricks.sdk.service.oauth2.CreateServicePrincipalSecretResponse` to type `String` class.
* [Breaking] Changed `createTime` and `updateTime` fields for `com.databricks.sdk.service.oauth2.FederationPolicy` to type `String` class.
* [Breaking] Changed `expireTime` field for `com.databricks.sdk.service.oauth2.SecretInfo` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.oauth2.UpdateAccountFederationPolicyRequest` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.oauth2.UpdateServicePrincipalFederationPolicyRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateAccountIpAccessEnableRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateAibiDashboardEmbeddingAccessPolicySettingRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateAibiDashboardEmbeddingApprovedDomainsSettingRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateAutomaticClusterUpdateSettingRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateComplianceSecurityProfileSettingRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateCspEnablementAccountSettingRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateDashboardEmailSubscriptionsRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateDefaultNamespaceSettingRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateDefaultWarehouseIdRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateDisableLegacyAccessRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateDisableLegacyDbfsRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateDisableLegacyFeaturesRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateEnableExportNotebookRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateEnableNotebookTableClipboardRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateEnableResultsDownloadingRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateEnhancedSecurityMonitoringSettingRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateEsmEnablementAccountSettingRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateLlmProxyPartnerPoweredAccountRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateLlmProxyPartnerPoweredEnforceRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateLlmProxyPartnerPoweredWorkspaceRequest` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.settings.UpdateNccPrivateEndpointRuleRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdatePersonalComputeSettingRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateRestrictWorkspaceAdminsSettingRequest` to type `String` class.
* [Breaking] Changed `fieldMask` field for `com.databricks.sdk.service.settings.UpdateSqlResultsDownloadRequest` to type `String` class.
* [Breaking] Changed `createTime` and `updateTime` fields for `com.databricks.sdk.service.sharing.FederationPolicy` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.sharing.UpdateFederationPolicyRequest` to type `String` class.
* [Breaking] Changed `createTime`, `triggerTime` and `updateTime` fields for `com.databricks.sdk.service.sql.Alert` to type `String` class.
* [Breaking] Changed `createTime` and `updateTime` fields for `com.databricks.sdk.service.sql.AlertV2` to type `String` class.
* [Breaking] Changed `lastEvaluatedAt` field for `com.databricks.sdk.service.sql.AlertV2Evaluation` to type `String` class.
* [Breaking] Changed `createTime`, `triggerTime` and `updateTime` fields for `com.databricks.sdk.service.sql.ListAlertsResponseAlert` to type `String` class.
* [Breaking] Changed `createTime` and `updateTime` fields for `com.databricks.sdk.service.sql.ListQueryObjectsResponseQuery` to type `String` class.
* [Breaking] Changed `createTime` and `updateTime` fields for `com.databricks.sdk.service.sql.Query` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.sql.UpdateAlertRequest` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.sql.UpdateAlertV2Request` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.sql.UpdateQueryRequest` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.sql.UpdateVisualizationRequest` to type `String` class.
* [Breaking] Changed `createTime` and `updateTime` fields for `com.databricks.sdk.service.sql.Visualization` to type `String` class.
* [Breaking] Changed `updateMask` field for `com.databricks.sdk.service.tags.UpdateTagPolicyRequest` to type `String` class.
* [Breaking] Removed `defaultDataSecurityMode` and `effectiveDefaultDataSecurityMode` fields for `com.databricks.sdk.service.settingsv2.Setting`.