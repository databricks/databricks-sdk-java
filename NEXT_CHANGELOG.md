# NEXT CHANGELOG

## Release v0.106.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes
* Fixed Databricks CLI `--profile` fallback by detecting the CLI version at init time. The previous error-based detection was broken because `--profile` is a global Cobra flag silently accepted by old CLIs.

### Security Vulnerabilities

### Documentation

### Internal Changes
* Detect Databricks CLI version at init time via `databricks version --output json`, enabling version-gated flag support. Successful detections are cached per CLI path; subprocess failures fall back to the most conservative command and are retried on the next call.

### API Changes
