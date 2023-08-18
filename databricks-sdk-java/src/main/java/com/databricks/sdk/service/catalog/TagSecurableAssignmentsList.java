// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class TagSecurableAssignmentsList {
  /** An array of tag assignments on a securable */
  @JsonProperty("tag_assignments")
  private Collection<TagSecurableAssignment> tagAssignments;

  public TagSecurableAssignmentsList setTagAssignments(
      Collection<TagSecurableAssignment> tagAssignments) {
    this.tagAssignments = tagAssignments;
    return this;
  }

  public Collection<TagSecurableAssignment> getTagAssignments() {
    return tagAssignments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TagSecurableAssignmentsList that = (TagSecurableAssignmentsList) o;
    return Objects.equals(tagAssignments, that.tagAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(TagSecurableAssignmentsList.class)
        .add("tagAssignments", tagAssignments)
        .toString();
  }
}
