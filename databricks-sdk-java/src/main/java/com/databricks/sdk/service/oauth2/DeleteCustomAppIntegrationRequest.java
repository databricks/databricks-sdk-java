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

/** Delete Custom OAuth App Integration */
@Generated
@JsonSerialize(
    using = DeleteCustomAppIntegrationRequest.DeleteCustomAppIntegrationRequestSerializer.class)
@JsonDeserialize(
    using = DeleteCustomAppIntegrationRequest.DeleteCustomAppIntegrationRequestDeserializer.class)
public class DeleteCustomAppIntegrationRequest {
  /** */
  private String integrationId;

  public DeleteCustomAppIntegrationRequest setIntegrationId(String integrationId) {
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
    DeleteCustomAppIntegrationRequest that = (DeleteCustomAppIntegrationRequest) o;
    return Objects.equals(integrationId, that.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCustomAppIntegrationRequest.class)
        .add("integrationId", integrationId)
        .toString();
  }

  DeleteCustomAppIntegrationRequestPb toPb() {
    DeleteCustomAppIntegrationRequestPb pb = new DeleteCustomAppIntegrationRequestPb();
    pb.setIntegrationId(integrationId);

    return pb;
  }

  static DeleteCustomAppIntegrationRequest fromPb(DeleteCustomAppIntegrationRequestPb pb) {
    DeleteCustomAppIntegrationRequest model = new DeleteCustomAppIntegrationRequest();
    model.setIntegrationId(pb.getIntegrationId());

    return model;
  }

  public static class DeleteCustomAppIntegrationRequestSerializer
      extends JsonSerializer<DeleteCustomAppIntegrationRequest> {
    @Override
    public void serialize(
        DeleteCustomAppIntegrationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteCustomAppIntegrationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteCustomAppIntegrationRequestDeserializer
      extends JsonDeserializer<DeleteCustomAppIntegrationRequest> {
    @Override
    public DeleteCustomAppIntegrationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteCustomAppIntegrationRequestPb pb =
          mapper.readValue(p, DeleteCustomAppIntegrationRequestPb.class);
      return DeleteCustomAppIntegrationRequest.fromPb(pb);
    }
  }
}
