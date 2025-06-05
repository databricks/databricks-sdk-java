// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class NotebookFilePb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("share")
  private String share;

  @JsonProperty("share_id")
  private String shareId;

  @JsonProperty("tags")
  private Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags;

  public NotebookFilePb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public NotebookFilePb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public NotebookFilePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public NotebookFilePb setShare(String share) {
    this.share = share;
    return this;
  }

  public String getShare() {
    return share;
  }

  public NotebookFilePb setShareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

  public String getShareId() {
    return shareId;
  }

  public NotebookFilePb setTags(Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags) {
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
    NotebookFilePb that = (NotebookFilePb) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(share, that.share)
        && Objects.equals(shareId, that.shareId)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, id, name, share, shareId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(NotebookFilePb.class)
        .add("comment", comment)
        .add("id", id)
        .add("name", name)
        .add("share", share)
        .add("shareId", shareId)
        .add("tags", tags)
        .toString();
  }
}
