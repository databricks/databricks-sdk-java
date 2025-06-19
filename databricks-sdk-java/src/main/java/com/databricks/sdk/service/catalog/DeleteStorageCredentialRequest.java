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

/** Delete a credential */
@Generated
@JsonSerialize(
    using = DeleteStorageCredentialRequest.DeleteStorageCredentialRequestSerializer.class)
@JsonDeserialize(
    using = DeleteStorageCredentialRequest.DeleteStorageCredentialRequestDeserializer.class)
public class DeleteStorageCredentialRequest {
  /** Force deletion even if there are dependent external locations or external tables. */
  private Boolean force;

  /** Name of the storage credential. */
  private String name;

  public DeleteStorageCredentialRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteStorageCredentialRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteStorageCredentialRequest that = (DeleteStorageCredentialRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteStorageCredentialRequest.class)
        .add("force", force)
        .add("name", name)
        .toString();
  }

  DeleteStorageCredentialRequestPb toPb() {
    DeleteStorageCredentialRequestPb pb = new DeleteStorageCredentialRequestPb();
    pb.setForce(force);
    pb.setName(name);

    return pb;
  }

  static DeleteStorageCredentialRequest fromPb(DeleteStorageCredentialRequestPb pb) {
    DeleteStorageCredentialRequest model = new DeleteStorageCredentialRequest();
    model.setForce(pb.getForce());
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteStorageCredentialRequestSerializer
      extends JsonSerializer<DeleteStorageCredentialRequest> {
    @Override
    public void serialize(
        DeleteStorageCredentialRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteStorageCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteStorageCredentialRequestDeserializer
      extends JsonDeserializer<DeleteStorageCredentialRequest> {
    @Override
    public DeleteStorageCredentialRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteStorageCredentialRequestPb pb =
          mapper.readValue(p, DeleteStorageCredentialRequestPb.class);
      return DeleteStorageCredentialRequest.fromPb(pb);
    }
  }
}
