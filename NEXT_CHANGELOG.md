# NEXT CHANGELOG

## Release v0.97.0

### New Features and Improvements

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes
* Move cloud-based credential filtering from individual credential providers into `DefaultCredentialsProvider`. Azure strategies are skipped on GCP/AWS hosts in auto-detect mode; GCP strategies are skipped on Azure/AWS hosts. When `authType` is explicitly set, cloud filtering is bypassed so the named strategy is always attempted regardless of host cloud.

### API Changes
