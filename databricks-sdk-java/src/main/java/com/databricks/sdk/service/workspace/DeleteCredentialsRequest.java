// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = DeleteCredentialsRequest.DeleteCredentialsRequestSerializer.class)
@JsonDeserialize(using = DeleteCredentialsRequest.DeleteCredentialsRequestDeserializer.class)
public class DeleteCredentialsRequest {
  /** The ID for the corresponding credential to access. */
  private Long credentialId;

  public DeleteCredentialsRequest setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public Long getCredentialId() {
    return credentialId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteCredentialsRequest that = (DeleteCredentialsRequest) o;
    return Objects.equals(credentialId, that.credentialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCredentialsRequest.class)
        .add("credentialId", credentialId)
        .toString();
  }

  DeleteCredentialsRequestPb toPb() {
    DeleteCredentialsRequestPb pb = new DeleteCredentialsRequestPb();
    pb.setCredentialId(credentialId);

    return pb;
  }

  static DeleteCredentialsRequest fromPb(DeleteCredentialsRequestPb pb) {
    DeleteCredentialsRequest model = new DeleteCredentialsRequest();
    model.setCredentialId(pb.getCredentialId());

    return model;
  }

  public static class DeleteCredentialsRequestSerializer
      extends JsonSerializer<DeleteCredentialsRequest> {
    @Override
    public void serialize(
        DeleteCredentialsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteCredentialsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteCredentialsRequestDeserializer
      extends JsonDeserializer<DeleteCredentialsRequest> {
    @Override
    public DeleteCredentialsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteCredentialsRequestPb pb = mapper.readValue(p, DeleteCredentialsRequestPb.class);
      return DeleteCredentialsRequest.fromPb(pb);
    }
  }
}
