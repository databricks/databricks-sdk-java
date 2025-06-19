// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(using = ChatMessage.ChatMessageSerializer.class)
@JsonDeserialize(using = ChatMessage.ChatMessageDeserializer.class)
public class ChatMessage {
  /** The content of the message. */
  private String content;

  /** The role of the message. One of [system, user, assistant]. */
  private ChatMessageRole role;

  public ChatMessage setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ChatMessage setRole(ChatMessageRole role) {
    this.role = role;
    return this;
  }

  public ChatMessageRole getRole() {
    return role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChatMessage that = (ChatMessage) o;
    return Objects.equals(content, that.content) && Objects.equals(role, that.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role);
  }

  @Override
  public String toString() {
    return new ToStringer(ChatMessage.class).add("content", content).add("role", role).toString();
  }

  ChatMessagePb toPb() {
    ChatMessagePb pb = new ChatMessagePb();
    pb.setContent(content);
    pb.setRole(role);

    return pb;
  }

  static ChatMessage fromPb(ChatMessagePb pb) {
    ChatMessage model = new ChatMessage();
    model.setContent(pb.getContent());
    model.setRole(pb.getRole());

    return model;
  }

  public static class ChatMessageSerializer extends JsonSerializer<ChatMessage> {
    @Override
    public void serialize(ChatMessage value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ChatMessagePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ChatMessageDeserializer extends JsonDeserializer<ChatMessage> {
    @Override
    public ChatMessage deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ChatMessagePb pb = mapper.readValue(p, ChatMessagePb.class);
      return ChatMessage.fromPb(pb);
    }
  }
}
