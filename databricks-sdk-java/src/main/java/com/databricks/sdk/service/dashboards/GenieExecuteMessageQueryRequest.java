// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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

/** [Deprecated] Execute SQL query in a conversation message */
@Generated
@JsonSerialize(
    using = GenieExecuteMessageQueryRequest.GenieExecuteMessageQueryRequestSerializer.class)
@JsonDeserialize(
    using = GenieExecuteMessageQueryRequest.GenieExecuteMessageQueryRequestDeserializer.class)
public class GenieExecuteMessageQueryRequest {
  /** Conversation ID */
  private String conversationId;

  /** Message ID */
  private String messageId;

  /** Genie space ID */
  private String spaceId;

  public GenieExecuteMessageQueryRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieExecuteMessageQueryRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieExecuteMessageQueryRequest setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieExecuteMessageQueryRequest that = (GenieExecuteMessageQueryRequest) o;
    return Objects.equals(conversationId, that.conversationId)
        && Objects.equals(messageId, that.messageId)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, messageId, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieExecuteMessageQueryRequest.class)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }

  GenieExecuteMessageQueryRequestPb toPb() {
    GenieExecuteMessageQueryRequestPb pb = new GenieExecuteMessageQueryRequestPb();
    pb.setConversationId(conversationId);
    pb.setMessageId(messageId);
    pb.setSpaceId(spaceId);

    return pb;
  }

  static GenieExecuteMessageQueryRequest fromPb(GenieExecuteMessageQueryRequestPb pb) {
    GenieExecuteMessageQueryRequest model = new GenieExecuteMessageQueryRequest();
    model.setConversationId(pb.getConversationId());
    model.setMessageId(pb.getMessageId());
    model.setSpaceId(pb.getSpaceId());

    return model;
  }

  public static class GenieExecuteMessageQueryRequestSerializer
      extends JsonSerializer<GenieExecuteMessageQueryRequest> {
    @Override
    public void serialize(
        GenieExecuteMessageQueryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieExecuteMessageQueryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieExecuteMessageQueryRequestDeserializer
      extends JsonDeserializer<GenieExecuteMessageQueryRequest> {
    @Override
    public GenieExecuteMessageQueryRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieExecuteMessageQueryRequestPb pb =
          mapper.readValue(p, GenieExecuteMessageQueryRequestPb.class);
      return GenieExecuteMessageQueryRequest.fromPb(pb);
    }
  }
}
