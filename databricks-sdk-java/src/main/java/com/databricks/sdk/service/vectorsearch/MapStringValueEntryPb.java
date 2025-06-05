// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Key-value pair. */
@Generated
class MapStringValueEntryPb {
  @JsonProperty("key")
  private String key;

  @JsonProperty("value")
  private Value value;

  public MapStringValueEntryPb setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public MapStringValueEntryPb setValue(Value value) {
    this.value = value;
    return this;
  }

  public Value getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MapStringValueEntryPb that = (MapStringValueEntryPb) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(MapStringValueEntryPb.class)
        .add("key", key)
        .add("value", value)
        .toString();
  }
}
