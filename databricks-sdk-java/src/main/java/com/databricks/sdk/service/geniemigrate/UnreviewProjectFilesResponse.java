// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The files unreviewed by `UnreviewProjectFiles`, in request order. */
@Generated
public class UnreviewProjectFilesResponse {
  /**
   * The unreviewed files, in request order. To read a file's changes, to-do items, blockers, and
   * notes, call `GetProjectFile`.
   */
  @JsonProperty("project_files")
  private Collection<ProjectFile> projectFiles;

  public UnreviewProjectFilesResponse setProjectFiles(Collection<ProjectFile> projectFiles) {
    this.projectFiles = projectFiles;
    return this;
  }

  public Collection<ProjectFile> getProjectFiles() {
    return projectFiles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UnreviewProjectFilesResponse that = (UnreviewProjectFilesResponse) o;
    return Objects.equals(projectFiles, that.projectFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectFiles);
  }

  @Override
  public String toString() {
    return new ToStringer(UnreviewProjectFilesResponse.class)
        .add("projectFiles", projectFiles)
        .toString();
  }
}
