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
    using =
        GenieGetQueryResultByAttachmentRequest.GenieGetQueryResultByAttachmentRequestSerializer
            .class)
@JsonDeserialize(
    using =
        GenieGetQueryResultByAttachmentRequest.GenieGetQueryResultByAttachmentRequestDeserializer
            .class)
public class GenieGetQueryResultByAttachmentRequest {
  /** Attachment ID */
  private String attachmentId;

  /** Conversation ID */
  private String conversationId;

  /** Message ID */
  private String messageId;

  /** Genie space ID */
  private String spaceId;

  public GenieGetQueryResultByAttachmentRequest setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  public String getAttachmentId() {
    return attachmentId;
  }

  public GenieGetQueryResultByAttachmentRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieGetQueryResultByAttachmentRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieGetQueryResultByAttachmentRequest setSpaceId(String spaceId) {
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
    GenieGetQueryResultByAttachmentRequest that = (GenieGetQueryResultByAttachmentRequest) o;
    return Objects.equals(attachmentId, that.attachmentId)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(messageId, that.messageId)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, conversationId, messageId, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGetQueryResultByAttachmentRequest.class)
        .add("attachmentId", attachmentId)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }

  GenieGetQueryResultByAttachmentRequestPb toPb() {
    GenieGetQueryResultByAttachmentRequestPb pb = new GenieGetQueryResultByAttachmentRequestPb();
    pb.setAttachmentId(attachmentId);
    pb.setConversationId(conversationId);
    pb.setMessageId(messageId);
    pb.setSpaceId(spaceId);

    return pb;
  }

  static GenieGetQueryResultByAttachmentRequest fromPb(
      GenieGetQueryResultByAttachmentRequestPb pb) {
    GenieGetQueryResultByAttachmentRequest model = new GenieGetQueryResultByAttachmentRequest();
    model.setAttachmentId(pb.getAttachmentId());
    model.setConversationId(pb.getConversationId());
    model.setMessageId(pb.getMessageId());
    model.setSpaceId(pb.getSpaceId());

    return model;
  }

  public static class GenieGetQueryResultByAttachmentRequestSerializer
      extends JsonSerializer<GenieGetQueryResultByAttachmentRequest> {
    @Override
    public void serialize(
        GenieGetQueryResultByAttachmentRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GenieGetQueryResultByAttachmentRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieGetQueryResultByAttachmentRequestDeserializer
      extends JsonDeserializer<GenieGetQueryResultByAttachmentRequest> {
    @Override
    public GenieGetQueryResultByAttachmentRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieGetQueryResultByAttachmentRequestPb pb =
          mapper.readValue(p, GenieGetQueryResultByAttachmentRequestPb.class);
      return GenieGetQueryResultByAttachmentRequest.fromPb(pb);
    }
  }
}
