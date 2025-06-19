// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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

/** Delete service principal secret */
@Generated
@JsonSerialize(
    using = DeleteServicePrincipalSecretRequest.DeleteServicePrincipalSecretRequestSerializer.class)
@JsonDeserialize(
    using =
        DeleteServicePrincipalSecretRequest.DeleteServicePrincipalSecretRequestDeserializer.class)
public class DeleteServicePrincipalSecretRequest {
  /** The secret ID. */
  private String secretId;

  /** The service principal ID. */
  private Long servicePrincipalId;

  public DeleteServicePrincipalSecretRequest setSecretId(String secretId) {
    this.secretId = secretId;
    return this;
  }

  public String getSecretId() {
    return secretId;
  }

  public DeleteServicePrincipalSecretRequest setServicePrincipalId(Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteServicePrincipalSecretRequest that = (DeleteServicePrincipalSecretRequest) o;
    return Objects.equals(secretId, that.secretId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretId, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteServicePrincipalSecretRequest.class)
        .add("secretId", secretId)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }

  DeleteServicePrincipalSecretRequestPb toPb() {
    DeleteServicePrincipalSecretRequestPb pb = new DeleteServicePrincipalSecretRequestPb();
    pb.setSecretId(secretId);
    pb.setServicePrincipalId(servicePrincipalId);

    return pb;
  }

  static DeleteServicePrincipalSecretRequest fromPb(DeleteServicePrincipalSecretRequestPb pb) {
    DeleteServicePrincipalSecretRequest model = new DeleteServicePrincipalSecretRequest();
    model.setSecretId(pb.getSecretId());
    model.setServicePrincipalId(pb.getServicePrincipalId());

    return model;
  }

  public static class DeleteServicePrincipalSecretRequestSerializer
      extends JsonSerializer<DeleteServicePrincipalSecretRequest> {
    @Override
    public void serialize(
        DeleteServicePrincipalSecretRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteServicePrincipalSecretRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteServicePrincipalSecretRequestDeserializer
      extends JsonDeserializer<DeleteServicePrincipalSecretRequest> {
    @Override
    public DeleteServicePrincipalSecretRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteServicePrincipalSecretRequestPb pb =
          mapper.readValue(p, DeleteServicePrincipalSecretRequestPb.class);
      return DeleteServicePrincipalSecretRequest.fromPb(pb);
    }
  }
}
