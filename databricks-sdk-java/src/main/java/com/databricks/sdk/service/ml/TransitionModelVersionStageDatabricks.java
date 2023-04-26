// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TransitionModelVersionStageDatabricks class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>archiveExistingVersions</code>.</p>
   *
   * @param archiveExistingVersions a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.ml.TransitionModelVersionStageDatabricks} object
   */
  public TransitionModelVersionStageDatabricks setArchiveExistingVersions(
      Boolean archiveExistingVersions) {
    this.archiveExistingVersions = archiveExistingVersions;
    return this;
  }

  /**
   * <p>Getter for the field <code>archiveExistingVersions</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getArchiveExistingVersions() {
    return archiveExistingVersions;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.TransitionModelVersionStageDatabricks} object
   */
  public TransitionModelVersionStageDatabricks setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.TransitionModelVersionStageDatabricks} object
   */
  public TransitionModelVersionStageDatabricks setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>stage</code>.</p>
   *
   * @param stage a {@link com.databricks.sdk.service.ml.Stage} object
   * @return a {@link com.databricks.sdk.service.ml.TransitionModelVersionStageDatabricks} object
   */
  public TransitionModelVersionStageDatabricks setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  /**
   * <p>Getter for the field <code>stage</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.Stage} object
   */
  public Stage getStage() {
    return stage;
  }

  /**
   * <p>Setter for the field <code>version</code>.</p>
   *
   * @param version a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.TransitionModelVersionStageDatabricks} object
   */
  public TransitionModelVersionStageDatabricks setVersion(String version) {
    this.version = version;
    return this;
  }

  /**
   * <p>Getter for the field <code>version</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getVersion() {
    return version;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(archiveExistingVersions, comment, name, stage, version);
  }

  /** {@inheritDoc} */
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
