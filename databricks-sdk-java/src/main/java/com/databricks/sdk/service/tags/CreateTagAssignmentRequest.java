// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateTagAssignmentRequest {
  /** */
  @JsonProperty("tag_assignment")
  private TagAssignment tagAssignment;

  public CreateTagAssignmentRequest setTagAssignment(TagAssignment tagAssignment) {
    this.tagAssignment = tagAssignment;
    return this;
  }

  public TagAssignment getTagAssignment() {
    return tagAssignment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTagAssignmentRequest that = (CreateTagAssignmentRequest) o;
    return Objects.equals(tagAssignment, that.tagAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagAssignment);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTagAssignmentRequest.class)
        .add("tagAssignment", tagAssignment)
        .toString();
  }
}
