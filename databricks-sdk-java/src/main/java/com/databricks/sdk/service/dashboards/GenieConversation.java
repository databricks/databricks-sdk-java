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
@JsonSerialize(using = GenieConversation.GenieConversationSerializer.class)
@JsonDeserialize(using = GenieConversation.GenieConversationDeserializer.class)
public class GenieConversation {
  /** Conversation ID */
  private String conversationId;

  /** Timestamp when the message was created */
  private Long createdTimestamp;

  /** Conversation ID. Legacy identifier, use conversation_id instead */
  private String id;

  /** Timestamp when the message was last updated */
  private Long lastUpdatedTimestamp;

  /** Genie space ID */
  private String spaceId;

  /** Conversation title */
  private String title;

  /** ID of the user who created the conversation */
  private Long userId;

  public GenieConversation setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieConversation setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public GenieConversation setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieConversation setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public GenieConversation setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public GenieConversation setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public GenieConversation setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieConversation that = (GenieConversation) o;
    return Objects.equals(conversationId, that.conversationId)
        && Objects.equals(createdTimestamp, that.createdTimestamp)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(spaceId, that.spaceId)
        && Objects.equals(title, that.title)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conversationId, createdTimestamp, id, lastUpdatedTimestamp, spaceId, title, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieConversation.class)
        .add("conversationId", conversationId)
        .add("createdTimestamp", createdTimestamp)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("spaceId", spaceId)
        .add("title", title)
        .add("userId", userId)
        .toString();
  }

  GenieConversationPb toPb() {
    GenieConversationPb pb = new GenieConversationPb();
    pb.setConversationId(conversationId);
    pb.setCreatedTimestamp(createdTimestamp);
    pb.setId(id);
    pb.setLastUpdatedTimestamp(lastUpdatedTimestamp);
    pb.setSpaceId(spaceId);
    pb.setTitle(title);
    pb.setUserId(userId);

    return pb;
  }

  static GenieConversation fromPb(GenieConversationPb pb) {
    GenieConversation model = new GenieConversation();
    model.setConversationId(pb.getConversationId());
    model.setCreatedTimestamp(pb.getCreatedTimestamp());
    model.setId(pb.getId());
    model.setLastUpdatedTimestamp(pb.getLastUpdatedTimestamp());
    model.setSpaceId(pb.getSpaceId());
    model.setTitle(pb.getTitle());
    model.setUserId(pb.getUserId());

    return model;
  }

  public static class GenieConversationSerializer extends JsonSerializer<GenieConversation> {
    @Override
    public void serialize(GenieConversation value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieConversationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieConversationDeserializer extends JsonDeserializer<GenieConversation> {
    @Override
    public GenieConversation deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieConversationPb pb = mapper.readValue(p, GenieConversationPb.class);
      return GenieConversation.fromPb(pb);
    }
  }
}
