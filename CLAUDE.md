# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Development Commands

### Build and Test
- **Build**: `mvn clean compile` - Compiles the project
- **Test**: `mvn test` - Runs unit tests (excludes integration tests and benchmarks)
- **Integration Tests**: `mvn verify -Prun-integration-tests` - Runs integration tests
- **Format Code**: `mvn spotless:apply` or `make fmt` - Applies Google Java Format and organizes imports
- **Package**: `mvn package` - Creates JAR files
- **Coverage**: `mvn clean test jacoco:report` - Generates test coverage reports

### Working with Single Tests
- **Run specific test**: `mvn test -Dtest=ClassNameTest`
- **Run specific test method**: `mvn test -Dtest=ClassNameTest#methodName`
- **Run integration test**: `mvn verify -Dit.test=ClassNameIT`

### Build Profiles
- **Release Profile**: `mvn clean deploy -Prelease` - For releases with signing and javadocs
- **Integration Test Profile**: `-Prun-integration-tests` - Enables integration tests

## Project Architecture

### Core Structure
The SDK is organized into several key packages:

**Main Clients**:
- `WorkspaceClient` - Entry point for workspace-level operations
- `AccountClient` - Entry point for account-level operations

**Core Infrastructure** (`com.databricks.sdk.core`):
- `ApiClient` - HTTP client abstraction with retries and error handling
- `DatabricksConfig` - Configuration management with environment variable support
- `CredentialsProvider` - Authentication provider chain
- `HeaderFactory` - Request header management

**Authentication** (`com.databricks.sdk.core.oauth`):
- Supports multiple auth flows: PAT tokens, OAuth, Azure Service Principal, Google credentials
- `TokenSource` implementations for different credential types
- `CachedTokenSource` for token caching and refresh

**Service APIs** (`com.databricks.sdk.service.*`):
- Auto-generated service clients for all Databricks APIs
- Organized by service area (compute, catalog, jobs, etc.)
- Each service has API interface, implementation, and request/response POJOs

**Mixins** (`com.databricks.sdk.mixin`):
- Extensions to generated APIs with convenience methods
- `ClustersExt`, `DbfsExt`, `JobsExt`, `SecretsExt`

### Key Patterns

**Configuration**: Uses annotation-driven config with `@ConfigAttribute` for environment variable binding

**Error Handling**: Consistent exception hierarchy with retry strategies and error mapping

**Pagination**: `Paginator` abstraction hides different pagination styles across APIs

**Long-running Operations**: `Wait` interface for polling operations until completion

**Serialization**: Jackson-based with custom serializers for special types

## Testing Strategy

### Test Organization
- **Unit Tests**: `src/test/java` - Fast tests with mocking
- **Integration Tests**: `src/test/java/.../integration` - Real API calls (suffix: `IT.java`)
- **Framework**: JUnit 5 with custom extensions for environment-based test execution

### Integration Test Environment
- Uses `@EnvTest` extension for conditional test execution
- Environment contexts: `workspace`, `account`, `ucws` (Unity Catalog workspace), `ucacct`
- Supports both real credentials and mock environments via `debug-env.json`

### Test Utilities
- `EnvTest` - JUnit extension for environment-based test execution
- `FixtureServer` - HTTP mock server for unit tests
- `DummyCredentialsProvider` - Test credentials provider

## Code Generation
Many files are auto-generated from OpenAPI specs (marked with `DO NOT EDIT` header). If a change needs to be made here,
don't make the change and instead report an error indicating what needs to be changed.

## Development Practices

### Java Compatibility
- Target: Java 8+
- CI tests on Java 8, 11, 17, and 20

### Code Style
- Uses Google Java Format via Spotless plugin
- Run `mvn spotless:apply` before committing
- Import organization and unused import removal enabled

### Dependencies
- **HTTP Client**: Apache HttpComponents
- **JSON**: Jackson
- **Testing**: JUnit 5, Mockito
- **Utilities**: Apache Commons, Google Auto Value for value classes

## Pull Request Guidelines

### Creating Pull Requests
- **Always follow the GitHub PR template** located at `.github/PULL_REQUEST_TEMPLATE.md`
- Answer the **WHAT** and **WHY** questions thoroughly in the PR description
- Include comprehensive testing information - never skip the "How is this tested?" section
- Use descriptive titles that clearly indicate the change being made
- Reference related issues using "Fixes #issue-number" format

### PR Description Best Practices
- Explain the context and motivation behind changes (the WHY is most important)
- Describe what changes are being made at a high level 
- Provide evidence or examples when fixing bugs
- Don't exaggerate severity - describe issues accurately
- Include cross-references to related SDKs or implementations when relevant

## Common Development Tasks

### Adding New Authentication Provider
1. Implement `CredentialsProvider` interface
2. Add to `DefaultCredentialsProvider` chain
3. Add configuration attributes to `DatabricksConfig`
4. Add unit and integration tests

### Working with Generated Services
- Service interfaces are in `com.databricks.sdk.service.*`
- Don't modify generated files directly
- Add extensions in `mixin` package if needed

### Adding Integration Tests
1. Use `@EnvTest` extension
2. Choose appropriate context (`@EnvContext("workspace")`, etc.)
3. Use environment variable injection via `@EnvOrSkip`
4. Follow existing patterns in `integration/` package