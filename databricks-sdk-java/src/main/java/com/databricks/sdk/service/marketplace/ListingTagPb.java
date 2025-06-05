// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListingTagPb {
  @JsonProperty("tag_name")
  private ListingTagType tagName;

  @JsonProperty("tag_values")
  private Collection<String> tagValues;

  public ListingTagPb setTagName(ListingTagType tagName) {
    this.tagName = tagName;
    return this;
  }

  public ListingTagType getTagName() {
    return tagName;
  }

  public ListingTagPb setTagValues(Collection<String> tagValues) {
    this.tagValues = tagValues;
    return this;
  }

  public Collection<String> getTagValues() {
    return tagValues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListingTagPb that = (ListingTagPb) o;
    return Objects.equals(tagName, that.tagName) && Objects.equals(tagValues, that.tagValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagName, tagValues);
  }

  @Override
  public String toString() {
    return new ToStringer(ListingTagPb.class)
        .add("tagName", tagName)
        .add("tagValues", tagValues)
        .toString();
  }
}
