// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class SetTag {
  /**
   * Name of the tag. Maximum size depends on storage backend. All storage backends are guaranteed
   * to support key values up to 250 bytes in size.
   */
  @JsonProperty("key")
  private String key;

  /** ID of the run under which to log the tag. Must be provided. */
  @JsonProperty("run_id")
  private String runId;

  /**
   * [Deprecated, use run_id instead] ID of the run under which to log the tag. This field will be
   * removed in a future MLflow version.
   */
  @JsonProperty("run_uuid")
  private String runUuid;

  /**
   * String value of the tag being logged. Maximum size depends on storage backend. All storage
   * backends are guaranteed to support key values up to 5000 bytes in size.
   */
  @JsonProperty("value")
  private String value;

  public SetTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SetTag setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public SetTag setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  public SetTag setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetTag that = (SetTag) o;
    return Objects.equals(key, that.key)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, runId, runUuid, value);
  }

  @Override
  public String toString() {
    return new ToStringer(SetTag.class)
        .add("key", key)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .add("value", value)
        .toString();
  }
}
