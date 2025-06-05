// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DeleteTagPb {
  @JsonProperty("key")
  private String key;

  @JsonProperty("run_id")
  private String runId;

  public DeleteTagPb setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public DeleteTagPb setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteTagPb that = (DeleteTagPb) o;
    return Objects.equals(key, that.key) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteTagPb.class).add("key", key).add("runId", runId).toString();
  }
}
