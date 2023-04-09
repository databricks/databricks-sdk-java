// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class TransitionModelVersionStage {
  /**
   * When transitioning a model version to a particular stage, this flag dictates whether all
   * existing model versions in that stage should be atomically moved to the "archived" stage. This
   * ensures that at-most-one model version exists in the target stage. This field is *required*
   * when transitioning a model versions's stage
   */
  @JsonProperty("archive_existing_versions")
  private Boolean archiveExistingVersions;

  /** Name of the registered model */
  @JsonProperty("name")
  private String name;

  /** Transition `model_version` to new stage. */
  @JsonProperty("stage")
  private String stage;

  /** Model version number */
  @JsonProperty("version")
  private String version;

  public TransitionModelVersionStage setArchiveExistingVersions(Boolean archiveExistingVersions) {
    this.archiveExistingVersions = archiveExistingVersions;
    return this;
  }

  public Boolean getArchiveExistingVersions() {
    return archiveExistingVersions;
  }

  public TransitionModelVersionStage setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public TransitionModelVersionStage setStage(String stage) {
    this.stage = stage;
    return this;
  }

  public String getStage() {
    return stage;
  }

  public TransitionModelVersionStage setVersion(String version) {
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
    TransitionModelVersionStage that = (TransitionModelVersionStage) o;
    return Objects.equals(archiveExistingVersions, that.archiveExistingVersions)
        && Objects.equals(name, that.name)
        && Objects.equals(stage, that.stage)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveExistingVersions, name, stage, version);
  }

  @Override
  public String toString() {
    return new ToStringer(TransitionModelVersionStage.class)
        .add("archiveExistingVersions", archiveExistingVersions)
        .add("name", name)
        .add("stage", stage)
        .add("version", version)
        .toString();
  }
}
