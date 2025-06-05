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
@JsonSerialize(using = TestRegistryWebhookResponse.TestRegistryWebhookResponseSerializer.class)
@JsonDeserialize(using = TestRegistryWebhookResponse.TestRegistryWebhookResponseDeserializer.class)
public class TestRegistryWebhookResponse {
  /** Test webhook response object. */
  private TestRegistryWebhook webhook;

  public TestRegistryWebhookResponse setWebhook(TestRegistryWebhook webhook) {
    this.webhook = webhook;
    return this;
  }

  public TestRegistryWebhook getWebhook() {
    return webhook;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TestRegistryWebhookResponse that = (TestRegistryWebhookResponse) o;
    return Objects.equals(webhook, that.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhook);
  }

  @Override
  public String toString() {
    return new ToStringer(TestRegistryWebhookResponse.class).add("webhook", webhook).toString();
  }

  TestRegistryWebhookResponsePb toPb() {
    TestRegistryWebhookResponsePb pb = new TestRegistryWebhookResponsePb();
    pb.setWebhook(webhook);

    return pb;
  }

  static TestRegistryWebhookResponse fromPb(TestRegistryWebhookResponsePb pb) {
    TestRegistryWebhookResponse model = new TestRegistryWebhookResponse();
    model.setWebhook(pb.getWebhook());

    return model;
  }

  public static class TestRegistryWebhookResponseSerializer
      extends JsonSerializer<TestRegistryWebhookResponse> {
    @Override
    public void serialize(
        TestRegistryWebhookResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TestRegistryWebhookResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TestRegistryWebhookResponseDeserializer
      extends JsonDeserializer<TestRegistryWebhookResponse> {
    @Override
    public TestRegistryWebhookResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TestRegistryWebhookResponsePb pb = mapper.readValue(p, TestRegistryWebhookResponsePb.class);
      return TestRegistryWebhookResponse.fromPb(pb);
    }
  }
}
