// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class SetExperimentTag {
  /** ID of the experiment under which to log the tag. Must be provided. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /**
   * Name of the tag. Maximum size depends on storage backend. All storage backends are guaranteed
   * to support key values up to 250 bytes in size.
   */
  @JsonProperty("key")
  private String key;

  /**
   * String value of the tag being logged. Maximum size depends on storage backend. All storage
   * backends are guaranteed to support key values up to 5000 bytes in size.
   */
  @JsonProperty("value")
  private String value;

  public SetExperimentTag setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public SetExperimentTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SetExperimentTag setValue(String value) {
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
    SetExperimentTag that = (SetExperimentTag) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(key, that.key)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(SetExperimentTag.class)
        .add("experimentId", experimentId)
        .add("key", key)
        .add("value", value)
        .toString();
  }
}
