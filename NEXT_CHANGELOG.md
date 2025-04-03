# NEXT CHANGELOG

## Release v0.44.0

### New Features and Improvements
* Introduce support for Databricks Workload Identity Federation in GitHub workflows ([423](https://github.com/databricks/databricks-sdk-java/pull/423)).
  See README.md for instructions.
* [Breaking] Users running their workflows in GitHub Actions, which use Cloud native authentication and also have a `DATABRICKS_CLIENT_ID` and `DATABRICKS_HOST`
  environment variables set may see their authentication start failing due to the order in which the SDK tries different authentication methods.

### Bug Fixes
* Fix issue deserializing HTTP responses with an empty body ([#426](https://github.com/databricks/databricks-sdk-java/pull/426)).

### Documentation

### Internal Changes

### API Changes
