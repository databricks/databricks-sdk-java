# NEXT CHANGELOG

## Release v0.97.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
* Add `com.databricks.sdk.service.dataclassification` and `com.databricks.sdk.service.knowledgeassistants` packages.
* Add `workspaceClient.dataClassification()` service.
* Add `workspaceClient.knowledgeAssistants()` service.
* Add `genieCreateEvalRun()`, `genieGetEvalResultDetails()`, `genieGetEvalRun()`, `genieListEvalResults()` and `genieListEvalRuns()` methods for `workspaceClient.genie()` service.
* Add `telemetryExportDestinations` field for `com.databricks.sdk.service.apps.App`.