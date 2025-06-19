// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
import java.util.Objects;

@Generated
@JsonSerialize(using = UpdateVolumeRequestContent.UpdateVolumeRequestContentSerializer.class)
@JsonDeserialize(using = UpdateVolumeRequestContent.UpdateVolumeRequestContentDeserializer.class)
public class UpdateVolumeRequestContent {
  /** The comment attached to the volume */
  private String comment;

  /** The three-level (fully qualified) name of the volume */
  private String name;

  /** New name for the volume. */
  private String newName;

  /** The identifier of the user who owns the volume */
  private String owner;

  public UpdateVolumeRequestContent setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateVolumeRequestContent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateVolumeRequestContent setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateVolumeRequestContent setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateVolumeRequestContent that = (UpdateVolumeRequestContent) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, newName, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateVolumeRequestContent.class)
        .add("comment", comment)
        .add("name", name)
        .add("newName", newName)
        .add("owner", owner)
        .toString();
  }

  UpdateVolumeRequestContentPb toPb() {
    UpdateVolumeRequestContentPb pb = new UpdateVolumeRequestContentPb();
    pb.setComment(comment);
    pb.setName(name);
    pb.setNewName(newName);
    pb.setOwner(owner);

    return pb;
  }

  static UpdateVolumeRequestContent fromPb(UpdateVolumeRequestContentPb pb) {
    UpdateVolumeRequestContent model = new UpdateVolumeRequestContent();
    model.setComment(pb.getComment());
    model.setName(pb.getName());
    model.setNewName(pb.getNewName());
    model.setOwner(pb.getOwner());

    return model;
  }

  public static class UpdateVolumeRequestContentSerializer
      extends JsonSerializer<UpdateVolumeRequestContent> {
    @Override
    public void serialize(
        UpdateVolumeRequestContent value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateVolumeRequestContentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateVolumeRequestContentDeserializer
      extends JsonDeserializer<UpdateVolumeRequestContent> {
    @Override
    public UpdateVolumeRequestContent deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateVolumeRequestContentPb pb = mapper.readValue(p, UpdateVolumeRequestContentPb.class);
      return UpdateVolumeRequestContent.fromPb(pb);
    }
  }
}
