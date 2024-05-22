// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Key-value pair. */
@Generated
public class MapStringValueEntry {
  /** Column name. */
  @JsonProperty("key")
  private String key;

  /** Column value, nullable. */
  @JsonProperty("value")
  private Value value;

  public MapStringValueEntry setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public MapStringValueEntry setValue(Value value) {
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
    MapStringValueEntry that = (MapStringValueEntry) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(MapStringValueEntry.class).add("key", key).add("value", value).toString();
  }
}
