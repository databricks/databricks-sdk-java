// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListProjectsResponse {
  /** Token to request the next page of projects. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** List of all projects in the workspace that the user has permission to access. */
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
