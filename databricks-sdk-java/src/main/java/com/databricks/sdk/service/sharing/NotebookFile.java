// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class NotebookFile {
  /** The comment of the notebook file. */
  @JsonProperty("comment")
  private String comment;

  /** The id of the notebook file. */
  @JsonProperty("id")
  private String id;

  /** Name of the notebook file. */
  @JsonProperty("name")
  private String name;

  /** The name of the share that the notebook file belongs to. */
  @JsonProperty("share")
  private String share;

  /** The id of the share that the notebook file belongs to. */
  @JsonProperty("share_id")
  private String shareId;

  /** The tags of the notebook file. */
  @JsonProperty("tags")
  private Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags;

  public NotebookFile setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public NotebookFile setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public NotebookFile setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public NotebookFile setShare(String share) {
    this.share = share;
    return this;
  }

  public String getShare() {
    return share;
  }

  public NotebookFile setShareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

  public String getShareId() {
    return shareId;
  }

  public NotebookFile setTags(Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags) {
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
    NotebookFile that = (NotebookFile) o;
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
    return new ToStringer(NotebookFile.class)
        .add("comment", comment)
        .add("id", id)
        .add("name", name)
        .add("share", share)
        .add("shareId", shareId)
        .add("tags", tags)
        .toString();
  }
}
