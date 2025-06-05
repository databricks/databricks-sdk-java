// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = DeleteWebhookResponse.DeleteWebhookResponseSerializer.class)
@JsonDeserialize(using = DeleteWebhookResponse.DeleteWebhookResponseDeserializer.class)
public class DeleteWebhookResponse {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteWebhookResponse.class).toString();
  }

  DeleteWebhookResponsePb toPb() {
    DeleteWebhookResponsePb pb = new DeleteWebhookResponsePb();

    return pb;
  }

  static DeleteWebhookResponse fromPb(DeleteWebhookResponsePb pb) {
    DeleteWebhookResponse model = new DeleteWebhookResponse();

    return model;
  }

  public static class DeleteWebhookResponseSerializer
      extends JsonSerializer<DeleteWebhookResponse> {
    @Override
    public void serialize(
        DeleteWebhookResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteWebhookResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteWebhookResponseDeserializer
      extends JsonDeserializer<DeleteWebhookResponse> {
    @Override
    public DeleteWebhookResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteWebhookResponsePb pb = mapper.readValue(p, DeleteWebhookResponsePb.class);
      return DeleteWebhookResponse.fromPb(pb);
    }
  }
}
