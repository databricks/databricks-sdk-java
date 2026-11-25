// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Conversion settings of a migration project. */
@Generated
public class ProjectConfig {
  /**
   * The workspace folder where converted files are written. Required on create; set
   * `workspace.path` or `workspace.object_id`. `UpdateProject` can't change it.
   */
  @JsonProperty("destination_location")
  private Location destinationLocation;

  /**
   * The workspace JSON file that holds the project's lineage report. Optional. To clear it, include
   * `project_config.lineage_location` in `update_mask` and leave this field unset.
   */
  @JsonProperty("lineage_location")
  private Location lineageLocation;

  /**
   * The dialect of the project's source files. Can't be changed when `Project.changes_locked` is
   * `true`.
   */
  @JsonProperty("source_dialect")
  private SourceDialect sourceDialect;

  /**
   * The framework that source files are converted to. Required on create, and can't be
   * `TARGET_FRAMEWORK_UNSPECIFIED`. Can't be changed when `Project.changes_locked` is `true`.
   */
  @JsonProperty("target_framework")
  private TargetFramework targetFramework;

  public ProjectConfig setDestinationLocation(Location destinationLocation) {
    this.destinationLocation = destinationLocation;
    return this;
  }

  public Location getDestinationLocation() {
    return destinationLocation;
  }

  public ProjectConfig setLineageLocation(Location lineageLocation) {
    this.lineageLocation = lineageLocation;
    return this;
  }

  public Location getLineageLocation() {
    return lineageLocation;
  }

  public ProjectConfig setSourceDialect(SourceDialect sourceDialect) {
    this.sourceDialect = sourceDialect;
    return this;
  }

  public SourceDialect getSourceDialect() {
    return sourceDialect;
  }

  public ProjectConfig setTargetFramework(TargetFramework targetFramework) {
    this.targetFramework = targetFramework;
    return this;
  }

  public TargetFramework getTargetFramework() {
    return targetFramework;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProjectConfig that = (ProjectConfig) o;
    return Objects.equals(destinationLocation, that.destinationLocation)
        && Objects.equals(lineageLocation, that.lineageLocation)
        && Objects.equals(sourceDialect, that.sourceDialect)
        && Objects.equals(targetFramework, that.targetFramework);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationLocation, lineageLocation, sourceDialect, targetFramework);
  }

  @Override
  public String toString() {
    return new ToStringer(ProjectConfig.class)
        .add("destinationLocation", destinationLocation)
        .add("lineageLocation", lineageLocation)
        .add("sourceDialect", sourceDialect)
        .add("targetFramework", targetFramework)
        .toString();
  }
}
