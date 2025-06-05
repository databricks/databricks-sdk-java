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
import java.util.Objects;

@Generated
@JsonSerialize(using = UpdateProvider.UpdateProviderSerializer.class)
@JsonDeserialize(using = UpdateProvider.UpdateProviderDeserializer.class)
public class UpdateProvider {
  /** Description about the provider. */
  private String comment;

  /** Name of the provider. */
  private String name;

  /** New name for the provider. */
  private String newName;

  /** Username of Provider owner. */
  private String owner;

  /**
   * This field is required when the __authentication_type__ is **TOKEN**,
   * **OAUTH_CLIENT_CREDENTIALS** or not provided.
   */
  private String recipientProfileStr;

  public UpdateProvider setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateProvider setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateProvider setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateProvider setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateProvider setRecipientProfileStr(String recipientProfileStr) {
    this.recipientProfileStr = recipientProfileStr;
    return this;
  }

  public String getRecipientProfileStr() {
    return recipientProfileStr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateProvider that = (UpdateProvider) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner)
        && Objects.equals(recipientProfileStr, that.recipientProfileStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, newName, owner, recipientProfileStr);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateProvider.class)
        .add("comment", comment)
        .add("name", name)
        .add("newName", newName)
        .add("owner", owner)
        .add("recipientProfileStr", recipientProfileStr)
        .toString();
  }

  UpdateProviderPb toPb() {
    UpdateProviderPb pb = new UpdateProviderPb();
    pb.setComment(comment);
    pb.setName(name);
    pb.setNewName(newName);
    pb.setOwner(owner);
    pb.setRecipientProfileStr(recipientProfileStr);

    return pb;
  }

  static UpdateProvider fromPb(UpdateProviderPb pb) {
    UpdateProvider model = new UpdateProvider();
    model.setComment(pb.getComment());
    model.setName(pb.getName());
    model.setNewName(pb.getNewName());
    model.setOwner(pb.getOwner());
    model.setRecipientProfileStr(pb.getRecipientProfileStr());

    return model;
  }

  public static class UpdateProviderSerializer extends JsonSerializer<UpdateProvider> {
    @Override
    public void serialize(UpdateProvider value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateProviderPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateProviderDeserializer extends JsonDeserializer<UpdateProvider> {
    @Override
    public UpdateProvider deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateProviderPb pb = mapper.readValue(p, UpdateProviderPb.class);
      return UpdateProvider.fromPb(pb);
    }
  }
}
