// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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

/** Delete credential configuration */
@Generated
@JsonSerialize(using = DeleteCredentialRequest.DeleteCredentialRequestSerializer.class)
@JsonDeserialize(using = DeleteCredentialRequest.DeleteCredentialRequestDeserializer.class)
public class DeleteCredentialRequest {
  /** Databricks Account API credential configuration ID */
  private String credentialsId;

  public DeleteCredentialRequest setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteCredentialRequest that = (DeleteCredentialRequest) o;
    return Objects.equals(credentialsId, that.credentialsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialsId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCredentialRequest.class)
        .add("credentialsId", credentialsId)
        .toString();
  }

  DeleteCredentialRequestPb toPb() {
    DeleteCredentialRequestPb pb = new DeleteCredentialRequestPb();
    pb.setCredentialsId(credentialsId);

    return pb;
  }

  static DeleteCredentialRequest fromPb(DeleteCredentialRequestPb pb) {
    DeleteCredentialRequest model = new DeleteCredentialRequest();
    model.setCredentialsId(pb.getCredentialsId());

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
