# NEXT CHANGELOG

## Release v0.80.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `postgresRole` field for `com.databricks.sdk.service.postgres.RoleRoleSpec`.
* Add `postgresRole` field for `com.databricks.sdk.service.postgres.RoleRoleStatus`.
* Add `purge` field for `com.databricks.sdk.service.sql.TrashAlertV2Request`.
* [Breaking] Change `createRole()` method for `workspaceClient.postgres()` service with new required argument order.
* Change `roleId` field for `com.databricks.sdk.service.postgres.CreateRoleRequest` to no longer be required.