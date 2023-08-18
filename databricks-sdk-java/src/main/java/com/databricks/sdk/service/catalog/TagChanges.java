// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class TagChanges {
  /** Tags to add for the current entity */
  @JsonProperty("add_tags")
  private Collection<TagKeyValuePair> addTags;

  /** Tags to remove for the current entity */
  @JsonProperty("remove")
  private Collection<String> remove;

  public TagChanges setAddTags(Collection<TagKeyValuePair> addTags) {
    this.addTags = addTags;
    return this;
  }

  public Collection<TagKeyValuePair> getAddTags() {
    return addTags;
  }

  public TagChanges setRemove(Collection<String> remove) {
    this.remove = remove;
    return this;
  }

  public Collection<String> getRemove() {
    return remove;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TagChanges that = (TagChanges) o;
    return Objects.equals(addTags, that.addTags) && Objects.equals(remove, that.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addTags, remove);
  }

  @Override
  public String toString() {
    return new ToStringer(TagChanges.class)
        .add("addTags", addTags)
        .add("remove", remove)
        .toString();
  }
}
