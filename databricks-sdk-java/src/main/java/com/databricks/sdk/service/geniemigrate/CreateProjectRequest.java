// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateProjectRequest {
  /** The project to create. The server sets `name` in the response. */
  @JsonProperty("project")
  private Project project;

  public CreateProjectRequest setProject(Project project) {
    this.project = project;
    return this;
  }

  public Project getProject() {
    return project;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateProjectRequest that = (CreateProjectRequest) o;
    return Objects.equals(project, that.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateProjectRequest.class).add("project", project).toString();
  }
}
