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
public class UpdateKnowledgeSourceRequest {
  /**
   * The Knowledge Source update payload. Only fields listed in update_mask are updated. REQUIRED
   * annotations on Knowledge Source fields describe create-time requirements and do not mean all
   * those fields are required for update.
   */
  @JsonProperty("knowledge_source")
  private KnowledgeSource knowledgeSource;

  /**
   * The resource name of the Knowledge Source to update. Format:
   * knowledge-assistants/{knowledge_assistant_id}/knowledge-sources/{knowledge_source_id}
   */
  @JsonIgnore private String name;

  /**
   * Comma-delimited list of fields to update on the Knowledge Source. Allowed values:
   * `display_name`, `description`. Examples: - `display_name` - `display_name,description`
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateKnowledgeSourceRequest setKnowledgeSource(KnowledgeSource knowledgeSource) {
    this.knowledgeSource = knowledgeSource;
    return this;
  }

  public KnowledgeSource getKnowledgeSource() {
    return knowledgeSource;
  }

  public UpdateKnowledgeSourceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateKnowledgeSourceRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateKnowledgeSourceRequest that = (UpdateKnowledgeSourceRequest) o;
    return Objects.equals(knowledgeSource, that.knowledgeSource)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeSource, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateKnowledgeSourceRequest.class)
        .add("knowledgeSource", knowledgeSource)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
