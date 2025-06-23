// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GenieDeleteConversationRequest {
  /** The ID of the conversation to delete. */
  @JsonIgnore private String conversationId;

  /** The ID associated with the Genie space where the conversation is located. */
  @JsonIgnore private String spaceId;

  public GenieDeleteConversationRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieDeleteConversationRequest setSpaceId(String spaceId) {
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
    GenieDeleteConversationRequest that = (GenieDeleteConversationRequest) o;
    return Objects.equals(conversationId, that.conversationId)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieDeleteConversationRequest.class)
        .add("conversationId", conversationId)
        .add("spaceId", spaceId)
        .toString();
  }
}
