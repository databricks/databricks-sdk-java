// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The request to remove the reviewed status from files of a migration project. */
@Generated
public class UnreviewProjectFilesRequest {
  /**
   * The files to unreview: 1 to 100 distinct file resource names, in the format
   * `projects/{project_id}/files/{file_id}`. For example, `projects/123/files/789`.
   */
  @JsonProperty("names")
  private Collection<String> names;

  /**
   * The resource name of the project, in the format `projects/{project_id}`. For example,
   * `projects/123`. Every file in `names` must belong to this project.
   */
  @JsonIgnore private String parent;

  public UnreviewProjectFilesRequest setNames(Collection<String> names) {
    this.names = names;
    return this;
  }

  public Collection<String> getNames() {
    return names;
  }

  public UnreviewProjectFilesRequest setParent(String parent) {
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
    UnreviewProjectFilesRequest that = (UnreviewProjectFilesRequest) o;
    return Objects.equals(names, that.names) && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(UnreviewProjectFilesRequest.class)
        .add("names", names)
        .add("parent", parent)
        .toString();
  }
}
