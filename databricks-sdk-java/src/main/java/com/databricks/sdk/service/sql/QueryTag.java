// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * * A query execution can be annotated with an optional key-value pair to allow users to attribute
 * the executions by key and optional value to filter by. QueryTag is the user-facing
 * representation.
 */
@Generated
public class QueryTag {
  /** */
  @JsonProperty("key")
  private String key;

  /** */
  @JsonProperty("value")
  private String value;

  public QueryTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public QueryTag setValue(String value) {
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
    QueryTag that = (QueryTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryTag.class).add("key", key).add("value", value).toString();
  }
}
