// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jsonmarshallv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class NestedMessage {
  /** */
  @JsonProperty("optional_duration")
  @QueryParam("optional_duration")
  private String optionalDuration;

  /** */
  @JsonProperty("optional_string")
  @QueryParam("optional_string")
  private String optionalString;

  /** */
  @JsonProperty("optional_timestamp")
  @QueryParam("optional_timestamp")
  private String optionalTimestamp;

  public NestedMessage setOptionalDuration(String optionalDuration) {
    this.optionalDuration = optionalDuration;
    return this;
  }

  public String getOptionalDuration() {
    return optionalDuration;
  }

  public NestedMessage setOptionalString(String optionalString) {
    this.optionalString = optionalString;
    return this;
  }

  public String getOptionalString() {
    return optionalString;
  }

  public NestedMessage setOptionalTimestamp(String optionalTimestamp) {
    this.optionalTimestamp = optionalTimestamp;
    return this;
  }

  public String getOptionalTimestamp() {
    return optionalTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NestedMessage that = (NestedMessage) o;
    return Objects.equals(optionalDuration, that.optionalDuration)
        && Objects.equals(optionalString, that.optionalString)
        && Objects.equals(optionalTimestamp, that.optionalTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionalDuration, optionalString, optionalTimestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(NestedMessage.class)
        .add("optionalDuration", optionalDuration)
        .add("optionalString", optionalString)
        .add("optionalTimestamp", optionalTimestamp)
        .toString();
  }
}
