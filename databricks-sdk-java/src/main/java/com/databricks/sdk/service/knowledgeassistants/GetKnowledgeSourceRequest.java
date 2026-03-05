// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetKnowledgeSourceRequest {
  /**
   * The resource name of the Knowledge Source. Format:
   * knowledge-assistants/{knowledge_assistant_id}/knowledge-sources/{knowledge_source_id}
   */
  @JsonIgnore private String name;

  public GetKnowledgeSourceRequest setName(String name) {
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
    GetKnowledgeSourceRequest that = (GetKnowledgeSourceRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetKnowledgeSourceRequest.class).add("name", name).toString();
  }
}
