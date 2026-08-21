# NEXT CHANGELOG

## Release v0.150.0

### New Features and Improvements

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

- Make unit-test fixtures portable to non-Maven build layouts. `TestOSUtils.resource` now stages a
  resource to a writable temp directory when it cannot be chmod-ed in place (e.g. when served
  read-only from a jar), while keeping the existing in-place behavior for Maven's exploded
  `target/test-classes`. This lets the unit tests run unchanged under other build systems.

### API Changes
