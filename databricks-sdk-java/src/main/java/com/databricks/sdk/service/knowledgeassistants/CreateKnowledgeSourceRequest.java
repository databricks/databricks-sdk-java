// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateKnowledgeSourceRequest {
  /** */
  @JsonProperty("knowledge_source")
  private KnowledgeSource knowledgeSource;

  /**
   * Parent resource where this source will be created. Format:
   * knowledge-assistants/{knowledge_assistant_id}
   */
  @JsonIgnore private String parent;

  public CreateKnowledgeSourceRequest setKnowledgeSource(KnowledgeSource knowledgeSource) {
    this.knowledgeSource = knowledgeSource;
    return this;
  }

  public KnowledgeSource getKnowledgeSource() {
    return knowledgeSource;
  }

  public CreateKnowledgeSourceRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateKnowledgeSourceRequest that = (CreateKnowledgeSourceRequest) o;
    return Objects.equals(knowledgeSource, that.knowledgeSource)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeSource, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateKnowledgeSourceRequest.class)
        .add("knowledgeSource", knowledgeSource)
        .add("parent", parent)
        .toString();
  }
}
