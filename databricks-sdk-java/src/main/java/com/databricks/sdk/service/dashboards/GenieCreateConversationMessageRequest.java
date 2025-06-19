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
    using =
        GenieCreateConversationMessageRequest.GenieCreateConversationMessageRequestSerializer.class)
@JsonDeserialize(
    using =
        GenieCreateConversationMessageRequest.GenieCreateConversationMessageRequestDeserializer
            .class)
public class GenieCreateConversationMessageRequest {
  /** User message content. */
  private String content;

  /** The ID associated with the conversation. */
  private String conversationId;

  /** The ID associated with the Genie space where the conversation is started. */
  private String spaceId;

  public GenieCreateConversationMessageRequest setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public GenieCreateConversationMessageRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieCreateConversationMessageRequest setSpaceId(String spaceId) {
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
    GenieCreateConversationMessageRequest that = (GenieCreateConversationMessageRequest) o;
    return Objects.equals(content, that.content)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, conversationId, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieCreateConversationMessageRequest.class)
        .add("content", content)
        .add("conversationId", conversationId)
        .add("spaceId", spaceId)
        .toString();
  }

  GenieCreateConversationMessageRequestPb toPb() {
    GenieCreateConversationMessageRequestPb pb = new GenieCreateConversationMessageRequestPb();
    pb.setContent(content);
    pb.setConversationId(conversationId);
    pb.setSpaceId(spaceId);

    return pb;
  }

  static GenieCreateConversationMessageRequest fromPb(GenieCreateConversationMessageRequestPb pb) {
    GenieCreateConversationMessageRequest model = new GenieCreateConversationMessageRequest();
    model.setContent(pb.getContent());
    model.setConversationId(pb.getConversationId());
    model.setSpaceId(pb.getSpaceId());

    return model;
  }

  public static class GenieCreateConversationMessageRequestSerializer
      extends JsonSerializer<GenieCreateConversationMessageRequest> {
    @Override
    public void serialize(
        GenieCreateConversationMessageRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieCreateConversationMessageRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieCreateConversationMessageRequestDeserializer
      extends JsonDeserializer<GenieCreateConversationMessageRequest> {
    @Override
    public GenieCreateConversationMessageRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieCreateConversationMessageRequestPb pb =
          mapper.readValue(p, GenieCreateConversationMessageRequestPb.class);
      return GenieCreateConversationMessageRequest.fromPb(pb);
    }
  }
}
