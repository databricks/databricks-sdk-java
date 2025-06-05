// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class VolumePb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("id")
  private String id;

  @JsonProperty("internal_attributes")
  private VolumeInternalAttributes internalAttributes;

  @JsonProperty("name")
  private String name;

  @JsonProperty("schema")
  private String schema;

  @JsonProperty("share")
  private String share;

  @JsonProperty("share_id")
  private String shareId;

  @JsonProperty("tags")
  private Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags;

  public VolumePb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public VolumePb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public VolumePb setInternalAttributes(VolumeInternalAttributes internalAttributes) {
    this.internalAttributes = internalAttributes;
    return this;
  }

  public VolumeInternalAttributes getInternalAttributes() {
    return internalAttributes;
  }

  public VolumePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public VolumePb setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public VolumePb setShare(String share) {
    this.share = share;
    return this;
  }

  public String getShare() {
    return share;
  }

  public VolumePb setShareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

  public String getShareId() {
    return shareId;
  }

  public VolumePb setTags(Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags) {
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
    VolumePb that = (VolumePb) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(id, that.id)
        && Objects.equals(internalAttributes, that.internalAttributes)
        && Objects.equals(name, that.name)
        && Objects.equals(schema, that.schema)
        && Objects.equals(share, that.share)
        && Objects.equals(shareId, that.shareId)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, id, internalAttributes, name, schema, share, shareId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(VolumePb.class)
        .add("comment", comment)
        .add("id", id)
        .add("internalAttributes", internalAttributes)
        .add("name", name)
        .add("schema", schema)
        .add("share", share)
        .add("shareId", shareId)
        .add("tags", tags)
        .toString();
  }
}
