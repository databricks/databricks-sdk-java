// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Share {
  /** The comment of the share. */
  @JsonProperty("comment")
  private String comment;

  /** The display name of the share. If defined, it will be shown in the UI. */
  @JsonProperty("display_name")
  private String displayName;

  /** */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("name")
  private String name;

  /** The tags of the share. */
  @JsonProperty("tags")
  private Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags;

  public Share setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public Share setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Share setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Share setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Share setTags(Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<com.databricks.sdk.service.catalog.TagKeyValue> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Share that = (Share) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, displayName, id, name, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(Share.class)
        .add("comment", comment)
        .add("displayName", displayName)
        .add("id", id)
        .add("name", name)
        .add("tags", tags)
        .toString();
  }
}
