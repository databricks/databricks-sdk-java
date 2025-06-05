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
@JsonSerialize(using = UpdateRegisteredModelRequest.UpdateRegisteredModelRequestSerializer.class)
@JsonDeserialize(
    using = UpdateRegisteredModelRequest.UpdateRegisteredModelRequestDeserializer.class)
public class UpdateRegisteredModelRequest {
  /** The comment attached to the registered model */
  private String comment;

  /** The three-level (fully qualified) name of the registered model */
  private String fullName;

  /** New name for the registered model. */
  private String newName;

  /** The identifier of the user who owns the registered model */
  private String owner;

  public UpdateRegisteredModelRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateRegisteredModelRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateRegisteredModelRequest setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateRegisteredModelRequest setOwner(String owner) {
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
    UpdateRegisteredModelRequest that = (UpdateRegisteredModelRequest) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, fullName, newName, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRegisteredModelRequest.class)
        .add("comment", comment)
        .add("fullName", fullName)
        .add("newName", newName)
        .add("owner", owner)
        .toString();
  }

  UpdateRegisteredModelRequestPb toPb() {
    UpdateRegisteredModelRequestPb pb = new UpdateRegisteredModelRequestPb();
    pb.setComment(comment);
    pb.setFullName(fullName);
    pb.setNewName(newName);
    pb.setOwner(owner);

    return pb;
  }

  static UpdateRegisteredModelRequest fromPb(UpdateRegisteredModelRequestPb pb) {
    UpdateRegisteredModelRequest model = new UpdateRegisteredModelRequest();
    model.setComment(pb.getComment());
    model.setFullName(pb.getFullName());
    model.setNewName(pb.getNewName());
    model.setOwner(pb.getOwner());

    return model;
  }

  public static class UpdateRegisteredModelRequestSerializer
      extends JsonSerializer<UpdateRegisteredModelRequest> {
    @Override
    public void serialize(
        UpdateRegisteredModelRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateRegisteredModelRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateRegisteredModelRequestDeserializer
      extends JsonDeserializer<UpdateRegisteredModelRequest> {
    @Override
    public UpdateRegisteredModelRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateRegisteredModelRequestPb pb = mapper.readValue(p, UpdateRegisteredModelRequestPb.class);
      return UpdateRegisteredModelRequest.fromPb(pb);
    }
  }
}
