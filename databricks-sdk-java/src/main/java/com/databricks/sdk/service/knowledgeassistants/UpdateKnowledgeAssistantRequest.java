// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateKnowledgeAssistantRequest {
  /**
   * The Knowledge Assistant update payload. Only fields listed in update_mask are updated. REQUIRED
   * annotations on Knowledge Assistant fields describe create-time requirements and do not mean all
   * those fields are required for update.
   */
  @JsonProperty("knowledge_assistant")
  private KnowledgeAssistant knowledgeAssistant;

  /**
   * The resource name of the Knowledge Assistant. Format:
   * knowledge-assistants/{knowledge_assistant_id}
   */
  @JsonIgnore private String name;

  /**
   * Comma-delimited list of fields to update on the Knowledge Assistant. Allowed values:
   * `display_name`, `description`, `instructions`. Examples: - `display_name` -
   * `description,instructions`
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateKnowledgeAssistantRequest setKnowledgeAssistant(
      KnowledgeAssistant knowledgeAssistant) {
    this.knowledgeAssistant = knowledgeAssistant;
    return this;
  }

  public KnowledgeAssistant getKnowledgeAssistant() {
    return knowledgeAssistant;
  }

  public UpdateKnowledgeAssistantRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateKnowledgeAssistantRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateKnowledgeAssistantRequest that = (UpdateKnowledgeAssistantRequest) o;
    return Objects.equals(knowledgeAssistant, that.knowledgeAssistant)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeAssistant, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateKnowledgeAssistantRequest.class)
        .add("knowledgeAssistant", knowledgeAssistant)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
