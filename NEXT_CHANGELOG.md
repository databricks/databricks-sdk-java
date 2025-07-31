# NEXT CHANGELOG

## Release v0.57.0

### New Features and Improvements

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
* Added `share` field for `com.databricks.sdk.service.sharing.ListProviderShareAssetsResponse`.
* Added `projectedRemainingWallclockTimeMs` field for `com.databricks.sdk.service.sql.QueryMetrics`.
* Added `MESSAGE_ATTACHMENT_TOO_LONG_ERROR` enum value for `com.databricks.sdk.service.dashboards.MessageErrorType`.
* Added `MASK` enum value for `com.databricks.sdk.service.serving.AiGatewayGuardrailPiiBehaviorBehavior`.
* [Breaking] Added waiter for `workspaceClient.cleanRooms().create()` method.
* [Breaking] Added waiter for `workspaceClient.database().createDatabaseInstance()` method.