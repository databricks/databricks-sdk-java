// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class TagPolicy {
  /** */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("tag_key")
  private String tagKey;

  /** */
  @JsonProperty("values")
  private Collection<Value> values;

  public TagPolicy setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public TagPolicy setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public TagPolicy setTagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  public String getTagKey() {
    return tagKey;
  }

  public TagPolicy setValues(Collection<Value> values) {
    this.values = values;
    return this;
  }

  public Collection<Value> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TagPolicy that = (TagPolicy) o;
    return Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(tagKey, that.tagKey)
        && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, tagKey, values);
  }

  @Override
  public String toString() {
    return new ToStringer(TagPolicy.class)
        .add("description", description)
        .add("id", id)
        .add("tagKey", tagKey)
        .add("values", values)
        .toString();
  }
}
