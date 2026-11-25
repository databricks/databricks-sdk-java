// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The request to remove files from a migration project. */
@Generated
public class RemoveProjectFilesRequest {
  /**
   * The resource name of the project, in the format `projects/{project_id}`. For example,
   * `projects/123`.
   */
  @JsonIgnore private String name;

  /**
   * The files to remove, by `ProjectFile.name`. For example, `projects/123/files/789`. Every file
   * must belong to the project in `name`. An empty list changes nothing. Send at most 10 files per
   * request, the default limit. Requests over a project's limit return `INVALID_PARAMETER_VALUE`.
   */
  @JsonProperty("names")
  private Collection<String> names;

  public RemoveProjectFilesRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RemoveProjectFilesRequest setNames(Collection<String> names) {
    this.names = names;
    return this;
  }

  public Collection<String> getNames() {
    return names;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RemoveProjectFilesRequest that = (RemoveProjectFilesRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(names, that.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, names);
  }

  @Override
  public String toString() {
    return new ToStringer(RemoveProjectFilesRequest.class)
        .add("name", name)
        .add("names", names)
        .toString();
  }
}
