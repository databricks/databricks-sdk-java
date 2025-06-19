// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = Webhook.WebhookSerializer.class)
@JsonDeserialize(using = Webhook.WebhookDeserializer.class)
public class Webhook {
  /** */
  private String id;

  public Webhook setId(String id) {
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
    Webhook that = (Webhook) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(Webhook.class).add("id", id).toString();
  }

  WebhookPb toPb() {
    WebhookPb pb = new WebhookPb();
    pb.setId(id);

    return pb;
  }

  static Webhook fromPb(WebhookPb pb) {
    Webhook model = new Webhook();
    model.setId(pb.getId());

    return model;
  }

  public static class WebhookSerializer extends JsonSerializer<Webhook> {
    @Override
    public void serialize(Webhook value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WebhookPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WebhookDeserializer extends JsonDeserializer<Webhook> {
    @Override
    public Webhook deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WebhookPb pb = mapper.readValue(p, WebhookPb.class);
      return Webhook.fromPb(pb);
    }
  }
}
