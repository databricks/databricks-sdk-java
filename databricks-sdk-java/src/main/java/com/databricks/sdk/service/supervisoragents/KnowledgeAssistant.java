// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class KnowledgeAssistant {
  /** The ID of the knowledge assistant. */
  @JsonProperty("knowledge_assistant_id")
  private String knowledgeAssistantId;

  /** Deprecated: use knowledge_assistant_id instead. */
  @JsonProperty("serving_endpoint_name")
  private String servingEndpointName;

  public KnowledgeAssistant setKnowledgeAssistantId(String knowledgeAssistantId) {
    this.knowledgeAssistantId = knowledgeAssistantId;
    return this;
  }

  public String getKnowledgeAssistantId() {
    return knowledgeAssistantId;
  }

  public KnowledgeAssistant setServingEndpointName(String servingEndpointName) {
    this.servingEndpointName = servingEndpointName;
    return this;
  }

  public String getServingEndpointName() {
    return servingEndpointName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KnowledgeAssistant that = (KnowledgeAssistant) o;
    return Objects.equals(knowledgeAssistantId, that.knowledgeAssistantId)
        && Objects.equals(servingEndpointName, that.servingEndpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeAssistantId, servingEndpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(KnowledgeAssistant.class)
        .add("knowledgeAssistantId", knowledgeAssistantId)
        .add("servingEndpointName", servingEndpointName)
        .toString();
  }
}
