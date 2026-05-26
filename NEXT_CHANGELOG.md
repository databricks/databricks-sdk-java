# NEXT CHANGELOG

## Release v0.113.0

### New Features and Improvements

* Detect VS Code agent-initiated terminal commands via the `VSCODE_AGENT` environment variable (VS Code 1.121+). The User-Agent header now reports `agent/vscode-agent` when set. The previous `COPILOT_MODEL` heuristic (which reported `agent/copilot-vscode`) has been removed; it produced false positives for Copilot CLI BYOK users and never reliably identified VS Code.

### Breaking Changes

### Bug Fixes

### Security Vulnerabilities

### Documentation

### Internal Changes

### API Changes
