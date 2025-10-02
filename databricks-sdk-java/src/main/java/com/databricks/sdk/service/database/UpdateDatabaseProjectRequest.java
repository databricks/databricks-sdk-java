// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateDatabaseProjectRequest {
  /** */
  @JsonProperty("database_project")
  private DatabaseProject databaseProject;

  /** */
  @JsonIgnore private String projectId;

  /** The list of fields to update. If unspecified, all fields will be updated when possible. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateDatabaseProjectRequest setDatabaseProject(DatabaseProject databaseProject) {
    this.databaseProject = databaseProject;
    return this;
  }

  public DatabaseProject getDatabaseProject() {
    return databaseProject;
  }

  public UpdateDatabaseProjectRequest setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public UpdateDatabaseProjectRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDatabaseProjectRequest that = (UpdateDatabaseProjectRequest) o;
    return Objects.equals(databaseProject, that.databaseProject)
        && Objects.equals(projectId, that.projectId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseProject, projectId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDatabaseProjectRequest.class)
        .add("databaseProject", databaseProject)
        .add("projectId", projectId)
        .add("updateMask", updateMask)
        .toString();
  }
}
