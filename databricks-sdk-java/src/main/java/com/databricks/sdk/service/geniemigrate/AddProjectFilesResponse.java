// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Lists the files from an `AddProjectFiles` request, including files that were already in the
 * project.
 */
@Generated
public class AddProjectFilesResponse {
  /**
   * The requested files, in request order, without conversion results. Call `ListProjectFiles` or
   * `GetProjectFile` to read their state.
   */
  @JsonProperty("files")
  private Collection<ProjectFile> files;

  public AddProjectFilesResponse setFiles(Collection<ProjectFile> files) {
    this.files = files;
    return this;
  }

  public Collection<ProjectFile> getFiles() {
    return files;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddProjectFilesResponse that = (AddProjectFilesResponse) o;
    return Objects.equals(files, that.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files);
  }

  @Override
  public String toString() {
    return new ToStringer(AddProjectFilesResponse.class).add("files", files).toString();
  }
}
