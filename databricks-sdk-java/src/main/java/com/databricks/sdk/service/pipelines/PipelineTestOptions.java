// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Options for selecting the tests that a test-only update runs. */
@Generated
public class PipelineTestOptions {
  /**
   * A list of arguments to pass to pytest, for example `["-m", "slow"]`. Only `-k` and `-m` are
   * accepted, each followed by its value. Other arguments are rejected.
   */
  @JsonProperty("pytest_args")
  private Collection<String> pytestArgs;

  /**
   * A list of test files or folders to run, as absolute workspace paths inside the pipeline's test
   * sources. A path outside the test sources is rejected. To run one test, append `::` and the test
   * name to a file path, for example `/Workspace/orders/tests/test_orders.py::test_backfill`. When
   * empty, every test in the test sources runs.
   */
  @JsonProperty("test_selection")
  private Collection<String> testSelection;

  public PipelineTestOptions setPytestArgs(Collection<String> pytestArgs) {
    this.pytestArgs = pytestArgs;
    return this;
  }

  public Collection<String> getPytestArgs() {
    return pytestArgs;
  }

  public PipelineTestOptions setTestSelection(Collection<String> testSelection) {
    this.testSelection = testSelection;
    return this;
  }

  public Collection<String> getTestSelection() {
    return testSelection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineTestOptions that = (PipelineTestOptions) o;
    return Objects.equals(pytestArgs, that.pytestArgs)
        && Objects.equals(testSelection, that.testSelection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pytestArgs, testSelection);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineTestOptions.class)
        .add("pytestArgs", pytestArgs)
        .add("testSelection", testSelection)
        .toString();
  }
}
