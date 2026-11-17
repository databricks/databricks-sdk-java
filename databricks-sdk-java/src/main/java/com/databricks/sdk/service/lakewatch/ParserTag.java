// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A key/value tag on a built-in parser, e.g. `key = "cloud_provider"`, `value = "aws"`. Key/value
 * pairs match the tag shape used across Databricks (MLflow, model-serving endpoints, clusters)
 * rather than a bare string list.
 */
@Generated
public class ParserTag {
  /**
   * The tag key, e.g. `cloud_provider`. Required: a keyless tag cannot be filtered on and is
   * meaningless.
   */
  @JsonProperty("key")
  private String key;

  /** The tag value, e.g. `aws`. */
  @JsonProperty("value")
  private String value;

  public ParserTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public ParserTag setValue(String value) {
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
    ParserTag that = (ParserTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(ParserTag.class).add("key", key).add("value", value).toString();
  }
}
