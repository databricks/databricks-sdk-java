// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CustomPolicyTag {
  /**
   * The key of the tag. - Must be unique among all custom tags of the same policy - Cannot be
   * “budget-policy-name”, “budget-policy-id” or "budget-policy-resolution-result" - these tags are
   * preserved.
   */
  @JsonProperty("key")
  private String key;

  /** The value of the tag. */
  @JsonProperty("value")
  private String value;

  public CustomPolicyTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public CustomPolicyTag setValue(String value) {
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
    CustomPolicyTag that = (CustomPolicyTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomPolicyTag.class).add("key", key).add("value", value).toString();
  }
}
