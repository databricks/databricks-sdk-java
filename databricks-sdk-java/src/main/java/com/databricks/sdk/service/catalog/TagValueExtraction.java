// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Extracts the value of a securable-level tag: get_tag_value("tagKey"). */
@Generated
public class TagValueExtraction {
  /** 1024 matches the max_length on FunctionArgument.constant above. */
  @JsonProperty("tag_key")
  private String tagKey;

  public TagValueExtraction setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TagValueExtraction that = (TagValueExtraction) o;
    return Objects.equals(tagKey, that.tagKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey);
  }

  @Override
  public String toString() {
    return new ToStringer(TagValueExtraction.class).add("tagKey", tagKey).toString();
  }
}
