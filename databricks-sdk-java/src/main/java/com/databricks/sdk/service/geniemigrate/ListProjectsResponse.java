// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The response to `ListProjects`. */
@Generated
public class ListProjectsResponse {
  /** The token for the next page. Empty when there are no more pages. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /**
   * The projects in this page, without `project_config` or `changes_locked`. Call `GetProject` for
   * the full project.
   */
  @JsonProperty("projects")
  private Collection<Project> projects;

  public ListProjectsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListProjectsResponse setProjects(Collection<Project> projects) {
    this.projects = projects;
    return this;
  }

  public Collection<Project> getProjects() {
    return projects;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProjectsResponse that = (ListProjectsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(projects, that.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, projects);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProjectsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("projects", projects)
        .toString();
  }
}
