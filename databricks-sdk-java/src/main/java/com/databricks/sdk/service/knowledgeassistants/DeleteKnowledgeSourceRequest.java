// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteKnowledgeSourceRequest {
  /**
   * The resource name of the Knowledge Source to delete. Format:
   * knowledge-assistants/{knowledge_assistant_id}/knowledge-sources/{knowledge_source_id}
   */
  @JsonIgnore private String name;

  public DeleteKnowledgeSourceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteKnowledgeSourceRequest that = (DeleteKnowledgeSourceRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteKnowledgeSourceRequest.class).add("name", name).toString();
  }
}
