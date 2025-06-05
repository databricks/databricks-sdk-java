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

/** Get message attachment SQL query result */
@Generated
@JsonSerialize(
    using =
        GenieGetMessageAttachmentQueryResultRequest
            .GenieGetMessageAttachmentQueryResultRequestSerializer.class)
@JsonDeserialize(
    using =
        GenieGetMessageAttachmentQueryResultRequest
            .GenieGetMessageAttachmentQueryResultRequestDeserializer.class)
public class GenieGetMessageAttachmentQueryResultRequest {
  /** Attachment ID */
  private String attachmentId;

  /** Conversation ID */
  private String conversationId;

  /** Message ID */
  private String messageId;

  /** Genie space ID */
  private String spaceId;

  public GenieGetMessageAttachmentQueryResultRequest setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  public String getAttachmentId() {
    return attachmentId;
  }

  public GenieGetMessageAttachmentQueryResultRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieGetMessageAttachmentQueryResultRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieGetMessageAttachmentQueryResultRequest setSpaceId(String spaceId) {
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
    GenieGetMessageAttachmentQueryResultRequest that =
        (GenieGetMessageAttachmentQueryResultRequest) o;
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
    return new ToStringer(GenieGetMessageAttachmentQueryResultRequest.class)
        .add("attachmentId", attachmentId)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }

  GenieGetMessageAttachmentQueryResultRequestPb toPb() {
    GenieGetMessageAttachmentQueryResultRequestPb pb =
        new GenieGetMessageAttachmentQueryResultRequestPb();
    pb.setAttachmentId(attachmentId);
    pb.setConversationId(conversationId);
    pb.setMessageId(messageId);
    pb.setSpaceId(spaceId);

    return pb;
  }

  static GenieGetMessageAttachmentQueryResultRequest fromPb(
      GenieGetMessageAttachmentQueryResultRequestPb pb) {
    GenieGetMessageAttachmentQueryResultRequest model =
        new GenieGetMessageAttachmentQueryResultRequest();
    model.setAttachmentId(pb.getAttachmentId());
    model.setConversationId(pb.getConversationId());
    model.setMessageId(pb.getMessageId());
    model.setSpaceId(pb.getSpaceId());

    return model;
  }

  public static class GenieGetMessageAttachmentQueryResultRequestSerializer
      extends JsonSerializer<GenieGetMessageAttachmentQueryResultRequest> {
    @Override
    public void serialize(
        GenieGetMessageAttachmentQueryResultRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GenieGetMessageAttachmentQueryResultRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieGetMessageAttachmentQueryResultRequestDeserializer
      extends JsonDeserializer<GenieGetMessageAttachmentQueryResultRequest> {
    @Override
    public GenieGetMessageAttachmentQueryResultRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieGetMessageAttachmentQueryResultRequestPb pb =
          mapper.readValue(p, GenieGetMessageAttachmentQueryResultRequestPb.class);
      return GenieGetMessageAttachmentQueryResultRequest.fromPb(pb);
    }
  }
}
