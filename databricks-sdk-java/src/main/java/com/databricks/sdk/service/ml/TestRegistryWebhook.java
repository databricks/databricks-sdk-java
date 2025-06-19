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

/** Test webhook response object. */
@Generated
@JsonSerialize(using = TestRegistryWebhook.TestRegistryWebhookSerializer.class)
@JsonDeserialize(using = TestRegistryWebhook.TestRegistryWebhookDeserializer.class)
public class TestRegistryWebhook {
  /** Body of the response from the webhook URL */
  private String body;

  /** Status code returned by the webhook URL */
  private Long statusCode;

  public TestRegistryWebhook setBody(String body) {
    this.body = body;
    return this;
  }

  public String getBody() {
    return body;
  }

  public TestRegistryWebhook setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  public Long getStatusCode() {
    return statusCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TestRegistryWebhook that = (TestRegistryWebhook) o;
    return Objects.equals(body, that.body) && Objects.equals(statusCode, that.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, statusCode);
  }

  @Override
  public String toString() {
    return new ToStringer(TestRegistryWebhook.class)
        .add("body", body)
        .add("statusCode", statusCode)
        .toString();
  }

  TestRegistryWebhookPb toPb() {
    TestRegistryWebhookPb pb = new TestRegistryWebhookPb();
    pb.setBody(body);
    pb.setStatusCode(statusCode);

    return pb;
  }

  static TestRegistryWebhook fromPb(TestRegistryWebhookPb pb) {
    TestRegistryWebhook model = new TestRegistryWebhook();
    model.setBody(pb.getBody());
    model.setStatusCode(pb.getStatusCode());

    return model;
  }

  public static class TestRegistryWebhookSerializer extends JsonSerializer<TestRegistryWebhook> {
    @Override
    public void serialize(TestRegistryWebhook value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TestRegistryWebhookPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TestRegistryWebhookDeserializer
      extends JsonDeserializer<TestRegistryWebhook> {
    @Override
    public TestRegistryWebhook deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TestRegistryWebhookPb pb = mapper.readValue(p, TestRegistryWebhookPb.class);
      return TestRegistryWebhook.fromPb(pb);
    }
  }
}
