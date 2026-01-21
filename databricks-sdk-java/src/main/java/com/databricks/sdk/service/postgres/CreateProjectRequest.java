// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateProjectRequest {
  /** The Project to create. */
  @JsonProperty("project")
  private Project project;

  /**
   * The ID to use for the Project. This becomes the final component of the project's resource name.
   * The ID must be 1-63 characters long, start with a lowercase letter, and contain only lowercase
   * letters, numbers, and hyphens (RFC 1123). Examples: - With custom ID: `production` → name
   * becomes `projects/production` - Without custom ID: system generates UUID → name becomes
   * `projects/a7f89b2c-3d4e-5f6g-7h8i-9j0k1l2m3n4o`
   */
  @JsonIgnore
  @QueryParam("project_id")
  private String projectId;

  public CreateProjectRequest setProject(Project project) {
    this.project = project;
    return this;
  }

  public Project getProject() {
    return project;
  }

  public CreateProjectRequest setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateProjectRequest that = (CreateProjectRequest) o;
    return Objects.equals(project, that.project) && Objects.equals(projectId, that.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, projectId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateProjectRequest.class)
        .add("project", project)
        .add("projectId", projectId)
        .toString();
  }
}
