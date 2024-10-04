# Benchmark Tests

The tests defined in this module are benchmarks of the Databricks SDK and its internal components. These tests ensure that the SDK works correctly and with reasonable performance under high load and concurrency. These tests are not run in normal CI builds to prevent regularly exhausting the REST API rate limit.

All test files in this module should be named `*LoadIT.java`.

## Running the Benchmarks

Use [IntelliJ's built-in test runner](https://www.jetbrains.com/help/idea/performing-tests.html) to run benchmark tests.
