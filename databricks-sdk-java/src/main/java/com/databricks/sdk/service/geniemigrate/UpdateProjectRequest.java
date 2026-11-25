// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

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
   * The resource name of the project, in the format `projects/{project_id}`. For example,
   * `projects/123`. The server assigns it when the project is created.
   */
  @JsonIgnore private String name;

  /** The project to update, identified by `name`. */
  @JsonProperty("project")
  private Project project;

  /**
   * The fields to update. Supported fields are `display_name`, `project_config.source_dialect`,
   * `project_config.target_framework`, and `project_config.lineage_location`. `project_config` and
   * `*` update all three `project_config` fields and can't be combined with `display_name`.
   */
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
