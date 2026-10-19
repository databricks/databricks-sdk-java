// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A governed tag referenced by a policy condition. */
@Generated
public class GovernedTagReference {
  /** The governed tag key. */
  @JsonProperty("tag_key")
  private String tagKey;

  /** The governed tag value, when the policy references a specific value. */
  @JsonProperty("tag_value")
  private String tagValue;

  public GovernedTagReference setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  public GovernedTagReference setTagValue(String tagValue) {
    this.tagValue = tagValue;
    return this;
  }

  public String getTagValue() {
    return tagValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GovernedTagReference that = (GovernedTagReference) o;
    return Objects.equals(tagKey, that.tagKey) && Objects.equals(tagValue, that.tagValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey, tagValue);
  }

  @Override
  public String toString() {
    return new ToStringer(GovernedTagReference.class)
        .add("tagKey", tagKey)
        .add("tagValue", tagValue)
        .toString();
  }
}
