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

/** [Deprecated] Get conversation message SQL query result */
@Generated
@JsonSerialize(
    using = GenieGetMessageQueryResultRequest.GenieGetMessageQueryResultRequestSerializer.class)
@JsonDeserialize(
    using = GenieGetMessageQueryResultRequest.GenieGetMessageQueryResultRequestDeserializer.class)
public class GenieGetMessageQueryResultRequest {
  /** Conversation ID */
  private String conversationId;

  /** Message ID */
  private String messageId;

  /** Genie space ID */
  private String spaceId;

  public GenieGetMessageQueryResultRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieGetMessageQueryResultRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieGetMessageQueryResultRequest setSpaceId(String spaceId) {
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
    GenieGetMessageQueryResultRequest that = (GenieGetMessageQueryResultRequest) o;
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
    return new ToStringer(GenieGetMessageQueryResultRequest.class)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }

  GenieGetMessageQueryResultRequestPb toPb() {
    GenieGetMessageQueryResultRequestPb pb = new GenieGetMessageQueryResultRequestPb();
    pb.setConversationId(conversationId);
    pb.setMessageId(messageId);
    pb.setSpaceId(spaceId);

    return pb;
  }

  static GenieGetMessageQueryResultRequest fromPb(GenieGetMessageQueryResultRequestPb pb) {
    GenieGetMessageQueryResultRequest model = new GenieGetMessageQueryResultRequest();
    model.setConversationId(pb.getConversationId());
    model.setMessageId(pb.getMessageId());
    model.setSpaceId(pb.getSpaceId());

    return model;
  }

  public static class GenieGetMessageQueryResultRequestSerializer
      extends JsonSerializer<GenieGetMessageQueryResultRequest> {
    @Override
    public void serialize(
        GenieGetMessageQueryResultRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieGetMessageQueryResultRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieGetMessageQueryResultRequestDeserializer
      extends JsonDeserializer<GenieGetMessageQueryResultRequest> {
    @Override
    public GenieGetMessageQueryResultRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieGetMessageQueryResultRequestPb pb =
          mapper.readValue(p, GenieGetMessageQueryResultRequestPb.class);
      return GenieGetMessageQueryResultRequest.fromPb(pb);
    }
  }
}
