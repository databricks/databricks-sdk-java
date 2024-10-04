# Benchmark Tests

The tests defined in this module are benchmarks of the Databricks SDK and its internal components. These tests ensure that the SDK works correctly and with reasonable performance under high load and concurrency. These tests are not run in normal CI builds to prevent regularly exhausting the REST API rate limit.

Load tests of components that don't make any network requests (e.g. `UserAgentLoadTest`) should be colocated with the unit tests for that component.

## Adding a Benchmark Test

All test files in this module should be named `*LoadIT.java`. They should be written as integration tests, with the `@EnvContext()` and `@ExtendWith(EnvTest.class)` annotations.

## Running the Benchmarks

Use [IntelliJ's built-in test runner](https://www.jetbrains.com/help/idea/performing-tests.html) to run benchmark tests.
