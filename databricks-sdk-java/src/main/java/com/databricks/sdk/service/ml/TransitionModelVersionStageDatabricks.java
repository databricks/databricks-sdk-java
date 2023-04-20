// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class TransitionModelVersionStageDatabricks {
  /** Specifies whether to archive all current model versions in the target stage. */
  @JsonProperty("archive_existing_versions")
  private Boolean archiveExistingVersions;

  /** User-provided comment on the action. */
  @JsonProperty("comment")
  private String comment;

  /** Name of the model. */
  @JsonProperty("name")
  private String name;

  /**
   * Target stage of the transition. Valid values are:
   *
   * <p>* `None`: The initial stage of a model version.
   *
   * <p>* `Staging`: Staging or pre-production stage.
   *
   * <p>* `Production`: Production stage.
   *
   * <p>* `Archived`: Archived stage.
   */
  @JsonProperty("stage")
  private Stage stage;

  /** Version of the model. */
  @JsonProperty("version")
  private String version;

  public TransitionModelVersionStageDatabricks setArchiveExistingVersions(
      Boolean archiveExistingVersions) {
    this.archiveExistingVersions = archiveExistingVersions;
    return this;
  }

  public Boolean getArchiveExistingVersions() {
    return archiveExistingVersions;
  }

  public TransitionModelVersionStageDatabricks setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public TransitionModelVersionStageDatabricks setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public TransitionModelVersionStageDatabricks setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  public Stage getStage() {
    return stage;
  }

  public TransitionModelVersionStageDatabricks setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransitionModelVersionStageDatabricks that = (TransitionModelVersionStageDatabricks) o;
    return Objects.equals(archiveExistingVersions, that.archiveExistingVersions)
        && Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(stage, that.stage)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveExistingVersions, comment, name, stage, version);
  }

  @Override
  public String toString() {
    return new ToStringer(TransitionModelVersionStageDatabricks.class)
        .add("archiveExistingVersions", archiveExistingVersions)
        .add("comment", comment)
        .add("name", name)
        .add("stage", stage)
        .add("version", version)
        .toString();
  }
}
