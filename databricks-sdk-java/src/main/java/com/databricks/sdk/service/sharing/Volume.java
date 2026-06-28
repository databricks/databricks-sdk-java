// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Volume {
  /** The comment of the volume. */
  @JsonProperty("comment")
  private String comment;

  /**
   * This id maps to the shared_volume_id in database Recipient needs shared_volume_id for recon to
   * check if this volume is already in recipient's DB or not.
   */
  @JsonProperty("id")
  private String id;

  /** The name of the volume. */
  @JsonProperty("name")
  private String name;

  /** The name of the schema that the volume belongs to. */
  @JsonProperty("schema")
  private String schema;

  /** The name of the share that the volume belongs to. */
  @JsonProperty("share")
  private String share;

  /** / The id of the share that the volume belongs to. */
  @JsonProperty("share_id")
  private String shareId;

  /** The tags of the volume. */
  @JsonProperty("tags")
  private Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags;

  public Volume setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public Volume setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Volume setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Volume setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public Volume setShare(String share) {
    this.share = share;
    return this;
  }

  public String getShare() {
    return share;
  }

  public Volume setShareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

  public String getShareId() {
    return shareId;
  }

  public Volume setTags(Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags) {
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
    Volume that = (Volume) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(schema, that.schema)
        && Objects.equals(share, that.share)
        && Objects.equals(shareId, that.shareId)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, id, name, schema, share, shareId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(Volume.class)
        .add("comment", comment)
        .add("id", id)
        .add("name", name)
        .add("schema", schema)
        .add("share", share)
        .add("shareId", shareId)
        .add("tags", tags)
        .toString();
  }
}
