// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The request to add workspace files to a migration project. */
@Generated
public class AddProjectFilesRequest {
  /**
   * The resource name of the project, in the format `projects/{project_id}`. For example,
   * `projects/123`.
   */
  @JsonIgnore private String name;

  /**
   * The files to add, each identified by `workspace.path` or `workspace.object_id`. Send at most
   * 500 files per request. Duplicate files, and requests that exceed a file-count limit, return
   * `INVALID_PARAMETER_VALUE`. Files already in the project aren't overwritten. An empty list
   * changes nothing.
   */
  @JsonProperty("sources")
  private Collection<SourceFileRef> sources;

  public AddProjectFilesRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AddProjectFilesRequest setSources(Collection<SourceFileRef> sources) {
    this.sources = sources;
    return this;
  }

  public Collection<SourceFileRef> getSources() {
    return sources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddProjectFilesRequest that = (AddProjectFilesRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(sources, that.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sources);
  }

  @Override
  public String toString() {
    return new ToStringer(AddProjectFilesRequest.class)
        .add("name", name)
        .add("sources", sources)
        .toString();
  }
}
