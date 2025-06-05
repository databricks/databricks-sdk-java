// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class TransitionModelVersionStageDatabricksPb {
  @JsonProperty("archive_existing_versions")
  private Boolean archiveExistingVersions;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("name")
  private String name;

  @JsonProperty("stage")
  private Stage stage;

  @JsonProperty("version")
  private String version;

  public TransitionModelVersionStageDatabricksPb setArchiveExistingVersions(
      Boolean archiveExistingVersions) {
    this.archiveExistingVersions = archiveExistingVersions;
    return this;
  }

  public Boolean getArchiveExistingVersions() {
    return archiveExistingVersions;
  }

  public TransitionModelVersionStageDatabricksPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public TransitionModelVersionStageDatabricksPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public TransitionModelVersionStageDatabricksPb setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  public Stage getStage() {
    return stage;
  }

  public TransitionModelVersionStageDatabricksPb setVersion(String version) {
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
    TransitionModelVersionStageDatabricksPb that = (TransitionModelVersionStageDatabricksPb) o;
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
    return new ToStringer(TransitionModelVersionStageDatabricksPb.class)
        .add("archiveExistingVersions", archiveExistingVersions)
        .add("comment", comment)
        .add("name", name)
        .add("stage", stage)
        .add("version", version)
        .toString();
  }
}
