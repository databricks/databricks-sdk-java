// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Request to cancel an in-flight agent-mode response. */
@Generated
public class GenieCancelResponseRequest {
  /** The ID of the Genie agent (synonymous with the Genie space ID). */
  @JsonIgnore private String agentId;

  /** The ID of the conversation containing the response. */
  @JsonIgnore private String conversationId;

  /** The ID of the response to cancel (the id from the `response.created` event). */
  @JsonIgnore private String responseId;

  public GenieCancelResponseRequest setAgentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

  public String getAgentId() {
    return agentId;
  }

  public GenieCancelResponseRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieCancelResponseRequest setResponseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

  public String getResponseId() {
    return responseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieCancelResponseRequest that = (GenieCancelResponseRequest) o;
    return Objects.equals(agentId, that.agentId)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(responseId, that.responseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, conversationId, responseId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieCancelResponseRequest.class)
        .add("agentId", agentId)
        .add("conversationId", conversationId)
        .add("responseId", responseId)
        .toString();
  }
}
