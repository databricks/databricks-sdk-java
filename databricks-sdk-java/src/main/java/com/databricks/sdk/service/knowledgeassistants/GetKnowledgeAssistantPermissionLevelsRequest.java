// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetKnowledgeAssistantPermissionLevelsRequest {
  /** The knowledge assistant for which to get or manage permissions. */
  @JsonIgnore private String knowledgeAssistantId;

  public GetKnowledgeAssistantPermissionLevelsRequest setKnowledgeAssistantId(
      String knowledgeAssistantId) {
    this.knowledgeAssistantId = knowledgeAssistantId;
    return this;
  }

  public String getKnowledgeAssistantId() {
    return knowledgeAssistantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetKnowledgeAssistantPermissionLevelsRequest that =
        (GetKnowledgeAssistantPermissionLevelsRequest) o;
    return Objects.equals(knowledgeAssistantId, that.knowledgeAssistantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeAssistantId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetKnowledgeAssistantPermissionLevelsRequest.class)
        .add("knowledgeAssistantId", knowledgeAssistantId)
        .toString();
  }
}
