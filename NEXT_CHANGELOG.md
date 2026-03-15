# NEXT CHANGELOG

## Release v0.101.0

### New Features and Improvements
* Added automatic detection of AI coding agents (Antigravity, Claude Code, Cline, Codex, Copilot CLI, Cursor, Gemini CLI, OpenCode) in the user-agent string. The SDK now appends `agent/<name>` to HTTP request headers when running inside a known AI agent environment.

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `alertOutput` field for `com.databricks.sdk.service.jobs.RunOutput`.
* Add `alertTask` field for `com.databricks.sdk.service.jobs.RunTask`.
* Add `alertTask` field for `com.databricks.sdk.service.jobs.SubmitTask`.
* Add `alertTask` field for `com.databricks.sdk.service.jobs.Task`.
* Add `com.databricks.sdk.service.environments` package.
* Add `workspaceClient.environments()` service.
* Add `CAN_CREATE_APP` enum value for `com.databricks.sdk.service.iam.PermissionLevel`.