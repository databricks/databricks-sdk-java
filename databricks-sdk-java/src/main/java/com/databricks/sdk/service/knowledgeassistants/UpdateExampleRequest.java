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
public class UpdateExampleRequest {
  /** */
  @JsonProperty("example")
  private Example example;

  /**
   * The resource name of the example to update. Format:
   * knowledge-assistants/{knowledge_assistant_id}/examples/{example_id}
   */
  @JsonIgnore private String name;

  /**
   * Comma-delimited list of fields to update on the example. Allowed values: `question`,
   * `guidelines`. Examples: - `question` - `question,guidelines`
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateExampleRequest setExample(Example example) {
    this.example = example;
    return this;
  }

  public Example getExample() {
    return example;
  }

  public UpdateExampleRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateExampleRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateExampleRequest that = (UpdateExampleRequest) o;
    return Objects.equals(example, that.example)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(example, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExampleRequest.class)
        .add("example", example)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
