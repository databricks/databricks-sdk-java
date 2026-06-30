// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class KnowledgeAssistantPermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<KnowledgeAssistantAccessControlRequest> accessControlList;

  /** The knowledge assistant for which to get or manage permissions. */
  @JsonIgnore private String knowledgeAssistantId;

  public KnowledgeAssistantPermissionsRequest setAccessControlList(
      Collection<KnowledgeAssistantAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<KnowledgeAssistantAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public KnowledgeAssistantPermissionsRequest setKnowledgeAssistantId(String knowledgeAssistantId) {
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
    KnowledgeAssistantPermissionsRequest that = (KnowledgeAssistantPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(knowledgeAssistantId, that.knowledgeAssistantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, knowledgeAssistantId);
  }

  @Override
  public String toString() {
    return new ToStringer(KnowledgeAssistantPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("knowledgeAssistantId", knowledgeAssistantId)
        .toString();
  }
}
