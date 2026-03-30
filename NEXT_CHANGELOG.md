# NEXT CHANGELOG

## Release v0.105.0

### New Features and Improvements
* Added automatic detection of AI coding agents (Amp, Antigravity, Augment, Claude Code, Cline, Codex, Copilot CLI, Copilot VS Code, Cursor, Gemini CLI, Goose, Kiro, OpenClaw, OpenCode, Windsurf) in the user-agent string. The SDK now appends `agent/<name>` to HTTP request headers when running inside a known AI agent environment. Also honors the `AGENT=<name>` standard: when `AGENT` is set to a known product name the SDK reports that product, and when set to an unrecognized non-empty value the SDK reports `agent/unknown`. Environment variables set to the empty string (e.g. `CLAUDECODE=""`) now count as "set" for presence-only matchers, matching `databricks-sdk-go` semantics; previously they were treated as unset. Explicit agent env vars (e.g. `CLAUDECODE`, `GOOSE_TERMINAL`) always take precedence over the generic `AGENT=<name>` signal. When multiple agent env vars are present (e.g. a Cursor CLI subagent invoked from Claude Code), the user-agent reports `agent/multiple`.

### Breaking Changes
* Remove the `experimentalIsUnifiedHost` field (and the `DATABRICKS_EXPERIMENTAL_IS_UNIFIED_HOST` environment variable) from `DatabricksConfig`. The flag was unused — `getHostType()` never read it — so unified host detection is now determined purely by URL pattern and the automatic `/.well-known/databricks-config` metadata resolution. Callers that set the flag should remove those calls. Mirrors [databricks/databricks-sdk-go#1641](https://github.com/databricks/databricks-sdk-go/pull/1641) and [databricks/databricks-sdk-py#1358](https://github.com/databricks/databricks-sdk-py/pull/1358).

### Bug Fixes
* Add `X-Databricks-Org-Id` header to `SharesExtImpl.list()` for SPOG host compatibility. Without this header, calls to the hand-written extension were rejected by the SPOG proxy with `Unable to load OAuth Config (400 UNKNOWN)`. Mirrors [databricks/databricks-sdk-go#1635](https://github.com/databricks/databricks-sdk-go/pull/1635).

### Security Vulnerabilities

### Documentation

### Internal Changes
* Added parametrized unit tests covering PAT, Basic, OAuth M2M, GitHub OIDC, Env OIDC, File OIDC, Azure Client Secret, and Azure GitHub OIDC against six host profiles (LW, NW, LA, NA, SPOGW, SPOGA) across AWS, Azure, and GCP (138 subtests total). Mirrors databricks-sdk-go PR #1627 and databricks-sdk-py PR #1357.
* Migrated internal SDK classes to the logging abstraction. The SDK now supports SLF4J, `java.util.logging`, or a custom backend via `LoggerFactory.setDefault()`.

### API Changes
