// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SetExperimentTagPb {
  @JsonProperty("experiment_id")
  private String experimentId;

  @JsonProperty("key")
  private String key;

  @JsonProperty("value")
  private String value;

  public SetExperimentTagPb setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public SetExperimentTagPb setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SetExperimentTagPb setValue(String value) {
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
    SetExperimentTagPb that = (SetExperimentTagPb) o;
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
    return new ToStringer(SetExperimentTagPb.class)
        .add("experimentId", experimentId)
        .add("key", key)
        .add("value", value)
        .toString();
  }
}
