// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class NotebookOutputPb {
  @JsonProperty("result")
  private String result;

  @JsonProperty("truncated")
  private Boolean truncated;

  public NotebookOutputPb setResult(String result) {
    this.result = result;
    return this;
  }

  public String getResult() {
    return result;
  }

  public NotebookOutputPb setTruncated(Boolean truncated) {
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
    NotebookOutputPb that = (NotebookOutputPb) o;
    return Objects.equals(result, that.result) && Objects.equals(truncated, that.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, truncated);
  }

  @Override
  public String toString() {
    return new ToStringer(NotebookOutputPb.class)
        .add("result", result)
        .add("truncated", truncated)
        .toString();
  }
}
