# NEXT CHANGELOG

## Release v0.139.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

* Fixed requests with a streaming body (e.g. `files().upload()`) silently uploading an empty body when retried. A single-use `InputStream` body is consumed by the first attempt, so retrying a retriable error (e.g. HTTP 503) re-sent an empty stream, which could write a 0-byte file or surface as a confusing error. The SDK no longer retries a streaming request once its body has been sent, and instead surfaces the original error so the caller can retry with a fresh stream.

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
