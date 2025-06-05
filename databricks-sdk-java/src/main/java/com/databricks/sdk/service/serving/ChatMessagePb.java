// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ChatMessagePb {
  @JsonProperty("content")
  private String content;

  @JsonProperty("role")
  private ChatMessageRole role;

  public ChatMessagePb setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ChatMessagePb setRole(ChatMessageRole role) {
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
    ChatMessagePb that = (ChatMessagePb) o;
    return Objects.equals(content, that.content) && Objects.equals(role, that.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role);
  }

  @Override
  public String toString() {
    return new ToStringer(ChatMessagePb.class).add("content", content).add("role", role).toString();
  }
}
