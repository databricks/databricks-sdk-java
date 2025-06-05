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

/** Delete Published OAuth App Integration */
@Generated
@JsonSerialize(
    using =
        DeletePublishedAppIntegrationRequest.DeletePublishedAppIntegrationRequestSerializer.class)
@JsonDeserialize(
    using =
        DeletePublishedAppIntegrationRequest.DeletePublishedAppIntegrationRequestDeserializer.class)
public class DeletePublishedAppIntegrationRequest {
  /** */
  private String integrationId;

  public DeletePublishedAppIntegrationRequest setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeletePublishedAppIntegrationRequest that = (DeletePublishedAppIntegrationRequest) o;
    return Objects.equals(integrationId, that.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePublishedAppIntegrationRequest.class)
        .add("integrationId", integrationId)
        .toString();
  }

  DeletePublishedAppIntegrationRequestPb toPb() {
    DeletePublishedAppIntegrationRequestPb pb = new DeletePublishedAppIntegrationRequestPb();
    pb.setIntegrationId(integrationId);

    return pb;
  }

  static DeletePublishedAppIntegrationRequest fromPb(DeletePublishedAppIntegrationRequestPb pb) {
    DeletePublishedAppIntegrationRequest model = new DeletePublishedAppIntegrationRequest();
    model.setIntegrationId(pb.getIntegrationId());

    return model;
  }

  public static class DeletePublishedAppIntegrationRequestSerializer
      extends JsonSerializer<DeletePublishedAppIntegrationRequest> {
    @Override
    public void serialize(
        DeletePublishedAppIntegrationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeletePublishedAppIntegrationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeletePublishedAppIntegrationRequestDeserializer
      extends JsonDeserializer<DeletePublishedAppIntegrationRequest> {
    @Override
    public DeletePublishedAppIntegrationRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeletePublishedAppIntegrationRequestPb pb =
          mapper.readValue(p, DeletePublishedAppIntegrationRequestPb.class);
      return DeletePublishedAppIntegrationRequest.fromPb(pb);
    }
  }
}
