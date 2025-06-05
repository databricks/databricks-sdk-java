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

/** Execute message attachment SQL query */
@Generated
@JsonSerialize(
    using =
        GenieExecuteMessageAttachmentQueryRequest
            .GenieExecuteMessageAttachmentQueryRequestSerializer.class)
@JsonDeserialize(
    using =
        GenieExecuteMessageAttachmentQueryRequest
            .GenieExecuteMessageAttachmentQueryRequestDeserializer.class)
public class GenieExecuteMessageAttachmentQueryRequest {
  /** Attachment ID */
  private String attachmentId;

  /** Conversation ID */
  private String conversationId;

  /** Message ID */
  private String messageId;

  /** Genie space ID */
  private String spaceId;

  public GenieExecuteMessageAttachmentQueryRequest setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  public String getAttachmentId() {
    return attachmentId;
  }

  public GenieExecuteMessageAttachmentQueryRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieExecuteMessageAttachmentQueryRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieExecuteMessageAttachmentQueryRequest setSpaceId(String spaceId) {
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
    GenieExecuteMessageAttachmentQueryRequest that = (GenieExecuteMessageAttachmentQueryRequest) o;
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
    return new ToStringer(GenieExecuteMessageAttachmentQueryRequest.class)
        .add("attachmentId", attachmentId)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }

  GenieExecuteMessageAttachmentQueryRequestPb toPb() {
    GenieExecuteMessageAttachmentQueryRequestPb pb =
        new GenieExecuteMessageAttachmentQueryRequestPb();
    pb.setAttachmentId(attachmentId);
    pb.setConversationId(conversationId);
    pb.setMessageId(messageId);
    pb.setSpaceId(spaceId);

    return pb;
  }

  static GenieExecuteMessageAttachmentQueryRequest fromPb(
      GenieExecuteMessageAttachmentQueryRequestPb pb) {
    GenieExecuteMessageAttachmentQueryRequest model =
        new GenieExecuteMessageAttachmentQueryRequest();
    model.setAttachmentId(pb.getAttachmentId());
    model.setConversationId(pb.getConversationId());
    model.setMessageId(pb.getMessageId());
    model.setSpaceId(pb.getSpaceId());

    return model;
  }

  public static class GenieExecuteMessageAttachmentQueryRequestSerializer
      extends JsonSerializer<GenieExecuteMessageAttachmentQueryRequest> {
    @Override
    public void serialize(
        GenieExecuteMessageAttachmentQueryRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GenieExecuteMessageAttachmentQueryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieExecuteMessageAttachmentQueryRequestDeserializer
      extends JsonDeserializer<GenieExecuteMessageAttachmentQueryRequest> {
    @Override
    public GenieExecuteMessageAttachmentQueryRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieExecuteMessageAttachmentQueryRequestPb pb =
          mapper.readValue(p, GenieExecuteMessageAttachmentQueryRequestPb.class);
      return GenieExecuteMessageAttachmentQueryRequest.fromPb(pb);
    }
  }
}
