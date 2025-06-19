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

/** Get conversation message */
@Generated
@JsonSerialize(
    using = GenieGetConversationMessageRequest.GenieGetConversationMessageRequestSerializer.class)
@JsonDeserialize(
    using = GenieGetConversationMessageRequest.GenieGetConversationMessageRequestDeserializer.class)
public class GenieGetConversationMessageRequest {
  /** The ID associated with the target conversation. */
  private String conversationId;

  /** The ID associated with the target message from the identified conversation. */
  private String messageId;

  /** The ID associated with the Genie space where the target conversation is located. */
  private String spaceId;

  public GenieGetConversationMessageRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieGetConversationMessageRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieGetConversationMessageRequest setSpaceId(String spaceId) {
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
    GenieGetConversationMessageRequest that = (GenieGetConversationMessageRequest) o;
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
    return new ToStringer(GenieGetConversationMessageRequest.class)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }

  GenieGetConversationMessageRequestPb toPb() {
    GenieGetConversationMessageRequestPb pb = new GenieGetConversationMessageRequestPb();
    pb.setConversationId(conversationId);
    pb.setMessageId(messageId);
    pb.setSpaceId(spaceId);

    return pb;
  }

  static GenieGetConversationMessageRequest fromPb(GenieGetConversationMessageRequestPb pb) {
    GenieGetConversationMessageRequest model = new GenieGetConversationMessageRequest();
    model.setConversationId(pb.getConversationId());
    model.setMessageId(pb.getMessageId());
    model.setSpaceId(pb.getSpaceId());

    return model;
  }

  public static class GenieGetConversationMessageRequestSerializer
      extends JsonSerializer<GenieGetConversationMessageRequest> {
    @Override
    public void serialize(
        GenieGetConversationMessageRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieGetConversationMessageRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieGetConversationMessageRequestDeserializer
      extends JsonDeserializer<GenieGetConversationMessageRequest> {
    @Override
    public GenieGetConversationMessageRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieGetConversationMessageRequestPb pb =
          mapper.readValue(p, GenieGetConversationMessageRequestPb.class);
      return GenieGetConversationMessageRequest.fromPb(pb);
    }
  }
}
