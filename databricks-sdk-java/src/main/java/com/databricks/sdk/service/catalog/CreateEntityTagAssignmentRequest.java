// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateEntityTagAssignmentRequest {
  /** */
  @JsonProperty("tag_assignment")
  private EntityTagAssignment tagAssignment;

  public CreateEntityTagAssignmentRequest setTagAssignment(EntityTagAssignment tagAssignment) {
    this.tagAssignment = tagAssignment;
    return this;
  }

  public EntityTagAssignment getTagAssignment() {
    return tagAssignment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateEntityTagAssignmentRequest that = (CreateEntityTagAssignmentRequest) o;
    return Objects.equals(tagAssignment, that.tagAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagAssignment);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateEntityTagAssignmentRequest.class)
        .add("tagAssignment", tagAssignment)
        .toString();
  }
}
