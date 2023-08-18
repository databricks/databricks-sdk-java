// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class TagsSubentityAssignment {
  /** Subentity associated with the tagging information */
  @JsonProperty("securable")
  private TagSubentity securable;

  /** Name of the subentity */
  @JsonProperty("subentity")
  private String subentity;

  /** tag assignments containing keys and values for the securable entity */
  @JsonProperty("tag_key_value_pairs")
  private Collection<TagKeyValuePair> tagKeyValuePairs;

  public TagsSubentityAssignment setSecurable(TagSubentity securable) {
    this.securable = securable;
    return this;
  }

  public TagSubentity getSecurable() {
    return securable;
  }

  public TagsSubentityAssignment setSubentity(String subentity) {
    this.subentity = subentity;
    return this;
  }

  public String getSubentity() {
    return subentity;
  }

  public TagsSubentityAssignment setTagKeyValuePairs(Collection<TagKeyValuePair> tagKeyValuePairs) {
    this.tagKeyValuePairs = tagKeyValuePairs;
    return this;
  }

  public Collection<TagKeyValuePair> getTagKeyValuePairs() {
    return tagKeyValuePairs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TagsSubentityAssignment that = (TagsSubentityAssignment) o;
    return Objects.equals(securable, that.securable)
        && Objects.equals(subentity, that.subentity)
        && Objects.equals(tagKeyValuePairs, that.tagKeyValuePairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securable, subentity, tagKeyValuePairs);
  }

  @Override
  public String toString() {
    return new ToStringer(TagsSubentityAssignment.class)
        .add("securable", securable)
        .add("subentity", subentity)
        .add("tagKeyValuePairs", tagKeyValuePairs)
        .toString();
  }
}
