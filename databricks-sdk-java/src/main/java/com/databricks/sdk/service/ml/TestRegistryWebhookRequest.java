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
@JsonSerialize(using = TestRegistryWebhookRequest.TestRegistryWebhookRequestSerializer.class)
@JsonDeserialize(using = TestRegistryWebhookRequest.TestRegistryWebhookRequestDeserializer.class)
public class TestRegistryWebhookRequest {
  /**
   * If `event` is specified, the test trigger uses the specified event. If `event` is not
   * specified, the test trigger uses a randomly chosen event associated with the webhook.
   */
  private RegistryWebhookEvent event;

  /** Webhook ID */
  private String id;

  public TestRegistryWebhookRequest setEvent(RegistryWebhookEvent event) {
    this.event = event;
    return this;
  }

  public RegistryWebhookEvent getEvent() {
    return event;
  }

  public TestRegistryWebhookRequest setId(String id) {
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
    TestRegistryWebhookRequest that = (TestRegistryWebhookRequest) o;
    return Objects.equals(event, that.event) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, id);
  }

  @Override
  public String toString() {
    return new ToStringer(TestRegistryWebhookRequest.class)
        .add("event", event)
        .add("id", id)
        .toString();
  }

  TestRegistryWebhookRequestPb toPb() {
    TestRegistryWebhookRequestPb pb = new TestRegistryWebhookRequestPb();
    pb.setEvent(event);
    pb.setId(id);

    return pb;
  }

  static TestRegistryWebhookRequest fromPb(TestRegistryWebhookRequestPb pb) {
    TestRegistryWebhookRequest model = new TestRegistryWebhookRequest();
    model.setEvent(pb.getEvent());
    model.setId(pb.getId());

    return model;
  }

  public static class TestRegistryWebhookRequestSerializer
      extends JsonSerializer<TestRegistryWebhookRequest> {
    @Override
    public void serialize(
        TestRegistryWebhookRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TestRegistryWebhookRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TestRegistryWebhookRequestDeserializer
      extends JsonDeserializer<TestRegistryWebhookRequest> {
    @Override
    public TestRegistryWebhookRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TestRegistryWebhookRequestPb pb = mapper.readValue(p, TestRegistryWebhookRequestPb.class);
      return TestRegistryWebhookRequest.fromPb(pb);
    }
  }
}
