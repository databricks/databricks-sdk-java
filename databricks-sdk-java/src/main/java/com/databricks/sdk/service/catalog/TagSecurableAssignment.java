// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class TagSecurableAssignment {
  /** Securable entity associated with the tagging information */
  @JsonProperty("securable")
  private TagSecurable securable;

  /** tag assignments containing keys and values for the securable entity */
  @JsonProperty("tag_key_value_pairs")
  private Collection<TagKeyValuePair> tagKeyValuePairs;

  public TagSecurableAssignment setSecurable(TagSecurable securable) {
    this.securable = securable;
    return this;
  }

  public TagSecurable getSecurable() {
    return securable;
  }

  public TagSecurableAssignment setTagKeyValuePairs(Collection<TagKeyValuePair> tagKeyValuePairs) {
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
    TagSecurableAssignment that = (TagSecurableAssignment) o;
    return Objects.equals(securable, that.securable)
        && Objects.equals(tagKeyValuePairs, that.tagKeyValuePairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securable, tagKeyValuePairs);
  }

  @Override
  public String toString() {
    return new ToStringer(TagSecurableAssignment.class)
        .add("securable", securable)
        .add("tagKeyValuePairs", tagKeyValuePairs)
        .toString();
  }
}
