# NEXT CHANGELOG

## Release v0.107.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

- Bumped JaCoCo to 0.8.13 and overrode Mockito's transitive Byte Buddy to 1.17.5 so that `mvn clean test` works on JDK 25 (used by the code-generator's automated environment). No runtime or API impact.

### API Changes
* Add `createExample()`, `deleteExample()`, `getExample()`, `getPermissionLevels()`, `getPermissions()`, `listExamples()`, `setPermissions()`, `updateExample()` and `updatePermissions()` methods for `workspaceClient.supervisorAgents()` service.
* Add `metaAdsOptions` field for `com.databricks.sdk.service.pipelines.ConnectorOptions`.
* Add `META_MARKETING` enum value for `com.databricks.sdk.service.catalog.ConnectionType`.
* Add `META_MARKETING` enum value for `com.databricks.sdk.service.pipelines.IngestionSourceType`.
* Change `guidelines` field for `com.databricks.sdk.service.knowledgeassistants.Example` to no longer be required.
* [Breaking] Change `guidelines` field for `com.databricks.sdk.service.knowledgeassistants.Example` to no longer be required.
* Change `description` field for `com.databricks.sdk.service.supervisoragents.Tool` to no longer be required.
* [Breaking] Change `description` field for `com.databricks.sdk.service.supervisoragents.Tool` to no longer be required.