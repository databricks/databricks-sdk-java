# Benchmark Tests

The tests defined in this module are benchmarks of the Databricks SDK and its internal components. These tests ensure that the SDK works correctly and with reasonable performance under high load and concurrency. In general, these tests are not run in normal CI builds to prevent regularly exhausing the REST API rate limit.

## Running the Benchmarks

To run the benchmarks, execute the following command:

```bash
mvn test -Pbenchmark
```
