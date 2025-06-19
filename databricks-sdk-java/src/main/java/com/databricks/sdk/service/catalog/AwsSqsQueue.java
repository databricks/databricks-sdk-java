// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = AwsSqsQueue.AwsSqsQueueSerializer.class)
@JsonDeserialize(using = AwsSqsQueue.AwsSqsQueueDeserializer.class)
public class AwsSqsQueue {
  /** Unique identifier included in the name of file events managed cloud resources. */
  private String managedResourceId;

  /**
   * The AQS queue url in the format https://sqs.{region}.amazonaws.com/{account id}/{queue name}
   * REQUIRED for provided_sqs.
   */
  private String queueUrl;

  public AwsSqsQueue setManagedResourceId(String managedResourceId) {
    this.managedResourceId = managedResourceId;
    return this;
  }

  public String getManagedResourceId() {
    return managedResourceId;
  }

  public AwsSqsQueue setQueueUrl(String queueUrl) {
    this.queueUrl = queueUrl;
    return this;
  }

  public String getQueueUrl() {
    return queueUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsSqsQueue that = (AwsSqsQueue) o;
    return Objects.equals(managedResourceId, that.managedResourceId)
        && Objects.equals(queueUrl, that.queueUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedResourceId, queueUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsSqsQueue.class)
        .add("managedResourceId", managedResourceId)
        .add("queueUrl", queueUrl)
        .toString();
  }

  AwsSqsQueuePb toPb() {
    AwsSqsQueuePb pb = new AwsSqsQueuePb();
    pb.setManagedResourceId(managedResourceId);
    pb.setQueueUrl(queueUrl);

    return pb;
  }

  static AwsSqsQueue fromPb(AwsSqsQueuePb pb) {
    AwsSqsQueue model = new AwsSqsQueue();
    model.setManagedResourceId(pb.getManagedResourceId());
    model.setQueueUrl(pb.getQueueUrl());

    return model;
  }

  public static class AwsSqsQueueSerializer extends JsonSerializer<AwsSqsQueue> {
    @Override
    public void serialize(AwsSqsQueue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AwsSqsQueuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AwsSqsQueueDeserializer extends JsonDeserializer<AwsSqsQueue> {
    @Override
    public AwsSqsQueue deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AwsSqsQueuePb pb = mapper.readValue(p, AwsSqsQueuePb.class);
      return AwsSqsQueue.fromPb(pb);
    }
  }
}
