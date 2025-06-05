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
@JsonSerialize(using = CreateWebhookResponse.CreateWebhookResponseSerializer.class)
@JsonDeserialize(using = CreateWebhookResponse.CreateWebhookResponseDeserializer.class)
public class CreateWebhookResponse {
  /** */
  private RegistryWebhook webhook;

  public CreateWebhookResponse setWebhook(RegistryWebhook webhook) {
    this.webhook = webhook;
    return this;
  }

  public RegistryWebhook getWebhook() {
    return webhook;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateWebhookResponse that = (CreateWebhookResponse) o;
    return Objects.equals(webhook, that.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhook);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWebhookResponse.class).add("webhook", webhook).toString();
  }

  CreateWebhookResponsePb toPb() {
    CreateWebhookResponsePb pb = new CreateWebhookResponsePb();
    pb.setWebhook(webhook);

    return pb;
  }

  static CreateWebhookResponse fromPb(CreateWebhookResponsePb pb) {
    CreateWebhookResponse model = new CreateWebhookResponse();
    model.setWebhook(pb.getWebhook());

    return model;
  }

  public static class CreateWebhookResponseSerializer
      extends JsonSerializer<CreateWebhookResponse> {
    @Override
    public void serialize(
        CreateWebhookResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateWebhookResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateWebhookResponseDeserializer
      extends JsonDeserializer<CreateWebhookResponse> {
    @Override
    public CreateWebhookResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateWebhookResponsePb pb = mapper.readValue(p, CreateWebhookResponsePb.class);
      return CreateWebhookResponse.fromPb(pb);
    }
  }
}
