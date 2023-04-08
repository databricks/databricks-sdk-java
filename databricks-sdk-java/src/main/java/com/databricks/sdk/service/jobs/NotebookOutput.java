// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
