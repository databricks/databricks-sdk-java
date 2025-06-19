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

@Generated
@JsonSerialize(
    using = GenieStartConversationResponse.GenieStartConversationResponseSerializer.class)
@JsonDeserialize(
    using = GenieStartConversationResponse.GenieStartConversationResponseDeserializer.class)
public class GenieStartConversationResponse {
  /** */
  private GenieConversation conversation;

  /** Conversation ID */
  private String conversationId;

  /** */
  private GenieMessage message;

  /** Message ID */
  private String messageId;

  public GenieStartConversationResponse setConversation(GenieConversation conversation) {
    this.conversation = conversation;
    return this;
  }

  public GenieConversation getConversation() {
    return conversation;
  }

  public GenieStartConversationResponse setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieStartConversationResponse setMessage(GenieMessage message) {
    this.message = message;
    return this;
  }

  public GenieMessage getMessage() {
    return message;
  }

  public GenieStartConversationResponse setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieStartConversationResponse that = (GenieStartConversationResponse) o;
    return Objects.equals(conversation, that.conversation)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(message, that.message)
        && Objects.equals(messageId, that.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, conversationId, message, messageId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieStartConversationResponse.class)
        .add("conversation", conversation)
        .add("conversationId", conversationId)
        .add("message", message)
        .add("messageId", messageId)
        .toString();
  }

  GenieStartConversationResponsePb toPb() {
    GenieStartConversationResponsePb pb = new GenieStartConversationResponsePb();
    pb.setConversation(conversation);
    pb.setConversationId(conversationId);
    pb.setMessage(message);
    pb.setMessageId(messageId);

    return pb;
  }

  static GenieStartConversationResponse fromPb(GenieStartConversationResponsePb pb) {
    GenieStartConversationResponse model = new GenieStartConversationResponse();
    model.setConversation(pb.getConversation());
    model.setConversationId(pb.getConversationId());
    model.setMessage(pb.getMessage());
    model.setMessageId(pb.getMessageId());

    return model;
  }

  public static class GenieStartConversationResponseSerializer
      extends JsonSerializer<GenieStartConversationResponse> {
    @Override
    public void serialize(
        GenieStartConversationResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieStartConversationResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieStartConversationResponseDeserializer
      extends JsonDeserializer<GenieStartConversationResponse> {
    @Override
    public GenieStartConversationResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieStartConversationResponsePb pb =
          mapper.readValue(p, GenieStartConversationResponsePb.class);
      return GenieStartConversationResponse.fromPb(pb);
    }
  }
}
