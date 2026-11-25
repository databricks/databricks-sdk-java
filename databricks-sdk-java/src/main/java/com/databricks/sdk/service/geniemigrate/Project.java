// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** A migration project: the conversion settings and source files of one migration. */
@Generated
public class Project {
  /**
   * Whether the source dialect and target framework are locked. They lock after a conversion or
   * analysis runs on the project. Other settings stay editable.
   */
  @JsonProperty("changes_locked")
  private Boolean changesLocked;

  /**
   * The time the project was created, if available. Can be absent from `CreateProject` and
   * `UpdateProject` responses.
   */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * The display name of the project. Required on create, and can't be blank. Changing it renames
   * the project.
   */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * The workspace folder that contains the project, in the format `folders/{folder_id}`. For
   * example, `folders/456`. If omitted on create, defaults to the caller's home folder.
   * `UpdateProject` can't change it, but moving the project in the workspace does. Returned when
   * available. Converted files are written to `project_config.destination_location`, which can be a
   * different folder.
   */
  @JsonProperty("folder")
  private String folder;

  /**
   * The resource name of the project, in the format `projects/{project_id}`. For example,
   * `projects/123`. The server assigns it when the project is created.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The conversion settings of the project. Required on create. Returned by `CreateProject`,
   * `GetProject`, and `UpdateProject`, but not by `ListProjects`.
   */
  @JsonProperty("project_config")
  private ProjectConfig projectConfig;

  /**
   * The time the project was last modified, if available. Can be absent from `CreateProject` and
   * `UpdateProject` responses.
   */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Project setChangesLocked(Boolean changesLocked) {
    this.changesLocked = changesLocked;
    return this;
  }

  public Boolean getChangesLocked() {
    return changesLocked;
  }

  public Project setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Project setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Project setFolder(String folder) {
    this.folder = folder;
    return this;
  }

  public String getFolder() {
    return folder;
  }

  public Project setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Project setProjectConfig(ProjectConfig projectConfig) {
    this.projectConfig = projectConfig;
    return this;
  }

  public ProjectConfig getProjectConfig() {
    return projectConfig;
  }

  public Project setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Project that = (Project) o;
    return Objects.equals(changesLocked, that.changesLocked)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(folder, that.folder)
        && Objects.equals(name, that.name)
        && Objects.equals(projectConfig, that.projectConfig)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        changesLocked, createTime, displayName, folder, name, projectConfig, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Project.class)
        .add("changesLocked", changesLocked)
        .add("createTime", createTime)
        .add("displayName", displayName)
        .add("folder", folder)
        .add("name", name)
        .add("projectConfig", projectConfig)
        .add("updateTime", updateTime)
        .toString();
  }
}
