// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The response to `ListProjectFiles`. */
@Generated
public class ListProjectFilesResponse {
  /** The token for the next page. Empty when there are no more pages. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The files in this page. */
  @JsonProperty("project_files")
  private Collection<ProjectFile> projectFiles;

  public ListProjectFilesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListProjectFilesResponse setProjectFiles(Collection<ProjectFile> projectFiles) {
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
    ListProjectFilesResponse that = (ListProjectFilesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(projectFiles, that.projectFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, projectFiles);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProjectFilesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("projectFiles", projectFiles)
        .toString();
  }
}
