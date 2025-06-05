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
@JsonSerialize(using = DeleteCredentialRequest.DeleteCredentialRequestSerializer.class)
@JsonDeserialize(using = DeleteCredentialRequest.DeleteCredentialRequestDeserializer.class)
public class DeleteCredentialRequest {
  /**
   * Force an update even if there are dependent services (when purpose is **SERVICE**) or dependent
   * external locations and external tables (when purpose is **STORAGE**).
   */
  private Boolean force;

  /** Name of the credential. */
  private String nameArg;

  public DeleteCredentialRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteCredentialRequest setNameArg(String nameArg) {
    this.nameArg = nameArg;
    return this;
  }

  public String getNameArg() {
    return nameArg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteCredentialRequest that = (DeleteCredentialRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(nameArg, that.nameArg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, nameArg);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCredentialRequest.class)
        .add("force", force)
        .add("nameArg", nameArg)
        .toString();
  }

  DeleteCredentialRequestPb toPb() {
    DeleteCredentialRequestPb pb = new DeleteCredentialRequestPb();
    pb.setForce(force);
    pb.setNameArg(nameArg);

    return pb;
  }

  static DeleteCredentialRequest fromPb(DeleteCredentialRequestPb pb) {
    DeleteCredentialRequest model = new DeleteCredentialRequest();
    model.setForce(pb.getForce());
    model.setNameArg(pb.getNameArg());

    return model;
  }

  public static class DeleteCredentialRequestSerializer
      extends JsonSerializer<DeleteCredentialRequest> {
    @Override
    public void serialize(
        DeleteCredentialRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteCredentialRequestDeserializer
      extends JsonDeserializer<DeleteCredentialRequest> {
    @Override
    public DeleteCredentialRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteCredentialRequestPb pb = mapper.readValue(p, DeleteCredentialRequestPb.class);
      return DeleteCredentialRequest.fromPb(pb);
    }
  }
}
