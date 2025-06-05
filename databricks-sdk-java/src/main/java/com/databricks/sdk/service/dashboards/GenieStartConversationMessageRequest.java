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
        GenieStartConversationMessageRequest.GenieStartConversationMessageRequestSerializer.class)
@JsonDeserialize(
    using =
        GenieStartConversationMessageRequest.GenieStartConversationMessageRequestDeserializer.class)
public class GenieStartConversationMessageRequest {
  /** The text of the message that starts the conversation. */
  private String content;

  /** The ID associated with the Genie space where you want to start a conversation. */
  private String spaceId;

  public GenieStartConversationMessageRequest setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public GenieStartConversationMessageRequest setSpaceId(String spaceId) {
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
    GenieStartConversationMessageRequest that = (GenieStartConversationMessageRequest) o;
    return Objects.equals(content, that.content) && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieStartConversationMessageRequest.class)
        .add("content", content)
        .add("spaceId", spaceId)
        .toString();
  }

  GenieStartConversationMessageRequestPb toPb() {
    GenieStartConversationMessageRequestPb pb = new GenieStartConversationMessageRequestPb();
    pb.setContent(content);
    pb.setSpaceId(spaceId);

    return pb;
  }

  static GenieStartConversationMessageRequest fromPb(GenieStartConversationMessageRequestPb pb) {
    GenieStartConversationMessageRequest model = new GenieStartConversationMessageRequest();
    model.setContent(pb.getContent());
    model.setSpaceId(pb.getSpaceId());

    return model;
  }

  public static class GenieStartConversationMessageRequestSerializer
      extends JsonSerializer<GenieStartConversationMessageRequest> {
    @Override
    public void serialize(
        GenieStartConversationMessageRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieStartConversationMessageRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieStartConversationMessageRequestDeserializer
      extends JsonDeserializer<GenieStartConversationMessageRequest> {
    @Override
    public GenieStartConversationMessageRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieStartConversationMessageRequestPb pb =
          mapper.readValue(p, GenieStartConversationMessageRequestPb.class);
      return GenieStartConversationMessageRequest.fromPb(pb);
    }
  }
}
