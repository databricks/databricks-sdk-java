# NEXT CHANGELOG

## Release v0.67.1

### New Features and Improvements

* Add a new config attribute `DATABRICKS_DISABLE_OAUTH_REFRESH_TOKEN` to disable requesting
  refresh tokens by default (by adding the `offline_access` scope) in OAuth exchanges. This 
  option does not remove the scope from the user provided scopes if present.

### Bug Fixes

### Documentation

### Internal Changes

### API Changes
