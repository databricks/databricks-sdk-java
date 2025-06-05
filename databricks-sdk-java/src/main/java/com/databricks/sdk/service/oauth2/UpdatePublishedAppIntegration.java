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
@JsonSerialize(using = UpdatePublishedAppIntegration.UpdatePublishedAppIntegrationSerializer.class)
@JsonDeserialize(
    using = UpdatePublishedAppIntegration.UpdatePublishedAppIntegrationDeserializer.class)
public class UpdatePublishedAppIntegration {
  /** */
  private String integrationId;

  /** Token access policy to be updated in the published OAuth app integration */
  private TokenAccessPolicy tokenAccessPolicy;

  public UpdatePublishedAppIntegration setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  public UpdatePublishedAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePublishedAppIntegration that = (UpdatePublishedAppIntegration) o;
    return Objects.equals(integrationId, that.integrationId)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, tokenAccessPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePublishedAppIntegration.class)
        .add("integrationId", integrationId)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }

  UpdatePublishedAppIntegrationPb toPb() {
    UpdatePublishedAppIntegrationPb pb = new UpdatePublishedAppIntegrationPb();
    pb.setIntegrationId(integrationId);
    pb.setTokenAccessPolicy(tokenAccessPolicy);

    return pb;
  }

  static UpdatePublishedAppIntegration fromPb(UpdatePublishedAppIntegrationPb pb) {
    UpdatePublishedAppIntegration model = new UpdatePublishedAppIntegration();
    model.setIntegrationId(pb.getIntegrationId());
    model.setTokenAccessPolicy(pb.getTokenAccessPolicy());

    return model;
  }

  public static class UpdatePublishedAppIntegrationSerializer
      extends JsonSerializer<UpdatePublishedAppIntegration> {
    @Override
    public void serialize(
        UpdatePublishedAppIntegration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdatePublishedAppIntegrationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdatePublishedAppIntegrationDeserializer
      extends JsonDeserializer<UpdatePublishedAppIntegration> {
    @Override
    public UpdatePublishedAppIntegration deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdatePublishedAppIntegrationPb pb =
          mapper.readValue(p, UpdatePublishedAppIntegrationPb.class);
      return UpdatePublishedAppIntegration.fromPb(pb);
    }
  }
}
