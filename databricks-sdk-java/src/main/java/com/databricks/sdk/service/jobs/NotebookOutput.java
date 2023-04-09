// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class NotebookOutput {
  /**
   * The value passed to
   * [dbutils.notebook.exit()](/notebooks/notebook-workflows.html#notebook-workflows-exit).
   * Databricks restricts this API to return the first 5 MB of the value. For a larger result, your
   * job can store the results in a cloud storage service. This field is absent if
   * `dbutils.notebook.exit()` was never called.
   */
  @JsonProperty("result")
  private String result;

  /** Whether or not the result was truncated. */
  @JsonProperty("truncated")
  private Boolean truncated;

  public NotebookOutput setResult(String result) {
    this.result = result;
    return this;
  }

  public String getResult() {
    return result;
  }

  public NotebookOutput setTruncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  public Boolean getTruncated() {
    return truncated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotebookOutput that = (NotebookOutput) o;
    return Objects.equals(result, that.result) && Objects.equals(truncated, that.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, truncated);
  }

  @Override
  public String toString() {
    return new ToStringer(NotebookOutput.class)
        .add("result", result)
        .add("truncated", truncated)
        .toString();
  }
}
