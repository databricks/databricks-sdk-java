# NEXT CHANGELOG

## Release v0.87.0

### New Features and Improvements

### Bug Fixes
* Fixed Databricks M2M OAuth to correctly use Databricks OIDC endpoints instead of incorrectly using Azure endpoints when `ARM_CLIENT_ID` is set. Added new `getDatabricksOidcEndpoints` method that returns only Databricks OIDC endpoints, and updated all Databricks OAuth flows to use it. The old `getOidcEndpoints` property is deprecated but maintained for backward compatibility.

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
