# NEXT CHANGELOG

## Release v0.68.0

### New Features and Improvements

### Bug Fixes

* Fix proxy SPNego authentication to respect krb5.conf canonicalization settings instead of forcing hostname canonicalization. The SDK now defers to the Kerberos library configuration for hostname resolution. **Migration note**: If you experience new Kerberos authentication failures with proxy servers after upgrading, verify that your `krb5.conf` canonicalization settings (`rdns` and `dns_canonicalize_hostname`) are correctly configured for your environment.

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
