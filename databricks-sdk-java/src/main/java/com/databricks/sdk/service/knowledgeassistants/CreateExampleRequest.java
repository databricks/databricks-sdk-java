// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateExampleRequest {
  /** The example to create under the parent Knowledge Assistant. */
  @JsonProperty("example")
  private Example example;

  /**
   * Parent resource where this example will be created. Format:
   * knowledge-assistants/{knowledge_assistant_id}
   */
  @JsonIgnore private String parent;

  public CreateExampleRequest setExample(Example example) {
    this.example = example;
    return this;
  }

  public Example getExample() {
    return example;
  }

  public CreateExampleRequest setParent(String parent) {
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
    CreateExampleRequest that = (CreateExampleRequest) o;
    return Objects.equals(example, that.example) && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(example, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExampleRequest.class)
        .add("example", example)
        .add("parent", parent)
        .toString();
  }
}
