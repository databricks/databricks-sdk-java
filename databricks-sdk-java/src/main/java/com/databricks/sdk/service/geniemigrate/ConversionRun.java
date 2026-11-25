// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/** A conversion of a migration project's files, with its state and the status of each file. */
@Generated
public class ConversionRun {
  /** The time the run was accepted, before its background job started. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The time the run ended. Absent while the run is active. */
  @JsonProperty("end_time")
  private Timestamp endTime;

  /** Why the run failed. Set only when `state` is `CONVERSION_RUN_STATE_FAILED`. */
  @JsonProperty("error_code")
  private ConversionRunErrorCode errorCode;

  /**
   * The files in this run, at most 500, each with its status in this run. Later conversions and
   * reviews can change `ProjectFile.status` but don't change this list.
   */
  @JsonProperty("files")
  private Collection<ConversionRunFile> files;

  /** The resource name of the project being converted, in the format `projects/{project_id}`. */
  @JsonProperty("project")
  private String project;

  /**
   * The skill folders that the run was started with. Empty if the run discovers skills
   * automatically.
   */
  @JsonProperty("skill_paths")
  private Collection<String> skillPaths;

  /** The state of the run. */
  @JsonProperty("state")
  private ConversionRunState state;

  public ConversionRun setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public ConversionRun setEndTime(Timestamp endTime) {
    this.endTime = endTime;
    return this;
  }

  public Timestamp getEndTime() {
    return endTime;
  }

  public ConversionRun setErrorCode(ConversionRunErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public ConversionRunErrorCode getErrorCode() {
    return errorCode;
  }

  public ConversionRun setFiles(Collection<ConversionRunFile> files) {
    this.files = files;
    return this;
  }

  public Collection<ConversionRunFile> getFiles() {
    return files;
  }

  public ConversionRun setProject(String project) {
    this.project = project;
    return this;
  }

  public String getProject() {
    return project;
  }

  public ConversionRun setSkillPaths(Collection<String> skillPaths) {
    this.skillPaths = skillPaths;
    return this;
  }

  public Collection<String> getSkillPaths() {
    return skillPaths;
  }

  public ConversionRun setState(ConversionRunState state) {
    this.state = state;
    return this;
  }

  public ConversionRunState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConversionRun that = (ConversionRun) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(endTime, that.endTime)
        && Objects.equals(errorCode, that.errorCode)
        && Objects.equals(files, that.files)
        && Objects.equals(project, that.project)
        && Objects.equals(skillPaths, that.skillPaths)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, endTime, errorCode, files, project, skillPaths, state);
  }

  @Override
  public String toString() {
    return new ToStringer(ConversionRun.class)
        .add("createTime", createTime)
        .add("endTime", endTime)
        .add("errorCode", errorCode)
        .add("files", files)
        .add("project", project)
        .add("skillPaths", skillPaths)
        .add("state", state)
        .toString();
  }
}
