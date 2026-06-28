// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ChatMessage {
  /** The content of the message. */
  @JsonProperty("content")
  private String content;

  /** The role of the message. One of [system, user, assistant]. */
  @JsonProperty("role")
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
}
