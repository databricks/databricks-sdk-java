// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateKnowledgeAssistantRequest {
  /** The Knowledge Assistant to create. */
  @JsonProperty("knowledge_assistant")
  private KnowledgeAssistant knowledgeAssistant;

  public CreateKnowledgeAssistantRequest setKnowledgeAssistant(
      KnowledgeAssistant knowledgeAssistant) {
    this.knowledgeAssistant = knowledgeAssistant;
    return this;
  }

  public KnowledgeAssistant getKnowledgeAssistant() {
    return knowledgeAssistant;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateKnowledgeAssistantRequest that = (CreateKnowledgeAssistantRequest) o;
    return Objects.equals(knowledgeAssistant, that.knowledgeAssistant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeAssistant);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateKnowledgeAssistantRequest.class)
        .add("knowledgeAssistant", knowledgeAssistant)
        .toString();
  }
}
