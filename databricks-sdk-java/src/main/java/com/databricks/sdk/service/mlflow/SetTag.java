// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
