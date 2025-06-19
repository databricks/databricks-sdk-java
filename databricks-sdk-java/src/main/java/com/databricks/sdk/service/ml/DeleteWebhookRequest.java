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

/** Delete a webhook */
@Generated
@JsonSerialize(using = DeleteWebhookRequest.DeleteWebhookRequestSerializer.class)
@JsonDeserialize(using = DeleteWebhookRequest.DeleteWebhookRequestDeserializer.class)
public class DeleteWebhookRequest {
  /** Webhook ID required to delete a registry webhook. */
  private String id;

  public DeleteWebhookRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteWebhookRequest that = (DeleteWebhookRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteWebhookRequest.class).add("id", id).toString();
  }

  DeleteWebhookRequestPb toPb() {
    DeleteWebhookRequestPb pb = new DeleteWebhookRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteWebhookRequest fromPb(DeleteWebhookRequestPb pb) {
    DeleteWebhookRequest model = new DeleteWebhookRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteWebhookRequestSerializer extends JsonSerializer<DeleteWebhookRequest> {
    @Override
    public void serialize(
        DeleteWebhookRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteWebhookRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteWebhookRequestDeserializer
      extends JsonDeserializer<DeleteWebhookRequest> {
    @Override
    public DeleteWebhookRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteWebhookRequestPb pb = mapper.readValue(p, DeleteWebhookRequestPb.class);
      return DeleteWebhookRequest.fromPb(pb);
    }
  }
}
