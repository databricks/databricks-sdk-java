// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a transition request */
@Generated
class DeleteTransitionRequestRequestPb {
  @JsonIgnore
  @QueryParam("comment")
  private String comment;

  @JsonIgnore
  @QueryParam("creator")
  private String creator;

  @JsonIgnore
  @QueryParam("name")
  private String name;

  @JsonIgnore
  @QueryParam("stage")
  private DeleteTransitionRequestStage stage;

  @JsonIgnore
  @QueryParam("version")
  private String version;

  public DeleteTransitionRequestRequestPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public DeleteTransitionRequestRequestPb setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public DeleteTransitionRequestRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteTransitionRequestRequestPb setStage(DeleteTransitionRequestStage stage) {
    this.stage = stage;
    return this;
  }

  public DeleteTransitionRequestStage getStage() {
    return stage;
  }

  public DeleteTransitionRequestRequestPb setVersion(String version) {
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
    DeleteTransitionRequestRequestPb that = (DeleteTransitionRequestRequestPb) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(creator, that.creator)
        && Objects.equals(name, that.name)
        && Objects.equals(stage, that.stage)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, creator, name, stage, version);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteTransitionRequestRequestPb.class)
        .add("comment", comment)
        .add("creator", creator)
        .add("name", name)
        .add("stage", stage)
        .add("version", version)
        .toString();
  }
}
