// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class DeleteTag {
  /** Name of the tag. Maximum size is 255 bytes. Must be provided. */
  @JsonProperty("key")
  private String key;

  /** ID of the run that the tag was logged under. Must be provided. */
  @JsonProperty("run_id")
  private String runId;

  public DeleteTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public DeleteTag setRunId(String runId) {
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
    DeleteTag that = (DeleteTag) o;
    return Objects.equals(key, that.key) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteTag.class).add("key", key).add("runId", runId).toString();
  }
}
