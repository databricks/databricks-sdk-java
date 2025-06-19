// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = Volume.VolumeSerializer.class)
@JsonDeserialize(using = Volume.VolumeDeserializer.class)
public class Volume {
  /** The comment of the volume. */
  private String comment;

  /**
   * This id maps to the shared_volume_id in database Recipient needs shared_volume_id for recon to
   * check if this volume is already in recipient's DB or not.
   */
  private String id;

  /** Internal attributes for D2D sharing that should not be disclosed to external users. */
  private VolumeInternalAttributes internalAttributes;

  /** The name of the volume. */
  private String name;

  /** The name of the schema that the volume belongs to. */
  private String schema;

  /** The name of the share that the volume belongs to. */
  private String share;

  /** / The id of the share that the volume belongs to. */
  private String shareId;

  /** The tags of the volume. */
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

  public Volume setInternalAttributes(VolumeInternalAttributes internalAttributes) {
    this.internalAttributes = internalAttributes;
    return this;
  }

  public VolumeInternalAttributes getInternalAttributes() {
    return internalAttributes;
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
    return new ToStringer(Volume.class)
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

  VolumePb toPb() {
    VolumePb pb = new VolumePb();
    pb.setComment(comment);
    pb.setId(id);
    pb.setInternalAttributes(internalAttributes);
    pb.setName(name);
    pb.setSchema(schema);
    pb.setShare(share);
    pb.setShareId(shareId);
    pb.setTags(tags);

    return pb;
  }

  static Volume fromPb(VolumePb pb) {
    Volume model = new Volume();
    model.setComment(pb.getComment());
    model.setId(pb.getId());
    model.setInternalAttributes(pb.getInternalAttributes());
    model.setName(pb.getName());
    model.setSchema(pb.getSchema());
    model.setShare(pb.getShare());
    model.setShareId(pb.getShareId());
    model.setTags(pb.getTags());

    return model;
  }

  public static class VolumeSerializer extends JsonSerializer<Volume> {
    @Override
    public void serialize(Volume value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      VolumePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class VolumeDeserializer extends JsonDeserializer<Volume> {
    @Override
    public Volume deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      VolumePb pb = mapper.readValue(p, VolumePb.class);
      return Volume.fromPb(pb);
    }
  }
}
