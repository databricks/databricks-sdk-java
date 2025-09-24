// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDatabaseProjectRequest {
  /** */
  @JsonProperty("database_project")
  private DatabaseProject databaseProject;

  public CreateDatabaseProjectRequest setDatabaseProject(DatabaseProject databaseProject) {
    this.databaseProject = databaseProject;
    return this;
  }

  public DatabaseProject getDatabaseProject() {
    return databaseProject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDatabaseProjectRequest that = (CreateDatabaseProjectRequest) o;
    return Objects.equals(databaseProject, that.databaseProject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseProject);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseProjectRequest.class)
        .add("databaseProject", databaseProject)
        .toString();
  }
}
