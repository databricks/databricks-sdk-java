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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListRegistryWebhooks.ListRegistryWebhooksSerializer.class)
@JsonDeserialize(using = ListRegistryWebhooks.ListRegistryWebhooksDeserializer.class)
public class ListRegistryWebhooks {
  /** Token that can be used to retrieve the next page of artifact results */
  private String nextPageToken;

  /** Array of registry webhooks. */
  private Collection<RegistryWebhook> webhooks;

  public ListRegistryWebhooks setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRegistryWebhooks setWebhooks(Collection<RegistryWebhook> webhooks) {
    this.webhooks = webhooks;
    return this;
  }

  public Collection<RegistryWebhook> getWebhooks() {
    return webhooks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRegistryWebhooks that = (ListRegistryWebhooks) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(webhooks, that.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, webhooks);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRegistryWebhooks.class)
        .add("nextPageToken", nextPageToken)
        .add("webhooks", webhooks)
        .toString();
  }

  ListRegistryWebhooksPb toPb() {
    ListRegistryWebhooksPb pb = new ListRegistryWebhooksPb();
    pb.setNextPageToken(nextPageToken);
    pb.setWebhooks(webhooks);

    return pb;
  }

  static ListRegistryWebhooks fromPb(ListRegistryWebhooksPb pb) {
    ListRegistryWebhooks model = new ListRegistryWebhooks();
    model.setNextPageToken(pb.getNextPageToken());
    model.setWebhooks(pb.getWebhooks());

    return model;
  }

  public static class ListRegistryWebhooksSerializer extends JsonSerializer<ListRegistryWebhooks> {
    @Override
    public void serialize(
        ListRegistryWebhooks value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListRegistryWebhooksPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListRegistryWebhooksDeserializer
      extends JsonDeserializer<ListRegistryWebhooks> {
    @Override
    public ListRegistryWebhooks deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListRegistryWebhooksPb pb = mapper.readValue(p, ListRegistryWebhooksPb.class);
      return ListRegistryWebhooks.fromPb(pb);
    }
  }
}
