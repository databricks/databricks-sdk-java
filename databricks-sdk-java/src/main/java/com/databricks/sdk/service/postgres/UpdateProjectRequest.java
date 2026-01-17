// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateProjectRequest {
  /**
   * The resource name of the project. This field is output-only and constructed by the system.
   * Format: `projects/{project_id}`
   */
  @JsonIgnore private String name;

  /**
   * The Project to update.
   *
   * <p>The project's `name` field is used to identify the project to update. Format:
   * projects/{project_id}
   */
  @JsonProperty("project")
  private Project project;

  /** The list of fields to update. If unspecified, all fields will be updated when possible. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateProjectRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateProjectRequest setProject(Project project) {
    this.project = project;
    return this;
  }

  public Project getProject() {
    return project;
  }

  public UpdateProjectRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateProjectRequest that = (UpdateProjectRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(project, that.project)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, project, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateProjectRequest.class)
        .add("name", name)
        .add("project", project)
        .add("updateMask", updateMask)
        .toString();
  }
}
