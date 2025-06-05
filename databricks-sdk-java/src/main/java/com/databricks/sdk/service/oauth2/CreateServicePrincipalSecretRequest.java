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

@Generated
@JsonSerialize(
    using = CreateServicePrincipalSecretRequest.CreateServicePrincipalSecretRequestSerializer.class)
@JsonDeserialize(
    using =
        CreateServicePrincipalSecretRequest.CreateServicePrincipalSecretRequestDeserializer.class)
public class CreateServicePrincipalSecretRequest {
  /**
   * The lifetime of the secret in seconds. If this parameter is not provided, the secret will have
   * a default lifetime of 730 days (63072000s).
   */
  private String lifetime;

  /** The service principal ID. */
  private Long servicePrincipalId;

  public CreateServicePrincipalSecretRequest setLifetime(String lifetime) {
    this.lifetime = lifetime;
    return this;
  }

  public String getLifetime() {
    return lifetime;
  }

  public CreateServicePrincipalSecretRequest setServicePrincipalId(Long servicePrincipalId) {
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
    CreateServicePrincipalSecretRequest that = (CreateServicePrincipalSecretRequest) o;
    return Objects.equals(lifetime, that.lifetime)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifetime, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateServicePrincipalSecretRequest.class)
        .add("lifetime", lifetime)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }

  CreateServicePrincipalSecretRequestPb toPb() {
    CreateServicePrincipalSecretRequestPb pb = new CreateServicePrincipalSecretRequestPb();
    pb.setLifetime(lifetime);
    pb.setServicePrincipalId(servicePrincipalId);

    return pb;
  }

  static CreateServicePrincipalSecretRequest fromPb(CreateServicePrincipalSecretRequestPb pb) {
    CreateServicePrincipalSecretRequest model = new CreateServicePrincipalSecretRequest();
    model.setLifetime(pb.getLifetime());
    model.setServicePrincipalId(pb.getServicePrincipalId());

    return model;
  }

  public static class CreateServicePrincipalSecretRequestSerializer
      extends JsonSerializer<CreateServicePrincipalSecretRequest> {
    @Override
    public void serialize(
        CreateServicePrincipalSecretRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateServicePrincipalSecretRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateServicePrincipalSecretRequestDeserializer
      extends JsonDeserializer<CreateServicePrincipalSecretRequest> {
    @Override
    public CreateServicePrincipalSecretRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateServicePrincipalSecretRequestPb pb =
          mapper.readValue(p, CreateServicePrincipalSecretRequestPb.class);
      return CreateServicePrincipalSecretRequest.fromPb(pb);
    }
  }
}
