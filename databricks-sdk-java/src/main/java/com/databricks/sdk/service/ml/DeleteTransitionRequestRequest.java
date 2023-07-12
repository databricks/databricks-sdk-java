// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Delete a transition request
 */
@Generated
public class DeleteTransitionRequestRequest {
  /**
   * User-provided comment on the action.
   */
  @QueryParam("comment")
  private String comment;
  
  /**
   * Username of the user who created this request. Of the transition requests
   * matching the specified details, only the one transition created by this
   * user will be deleted.
   */
  @QueryParam("creator")
  private String creator;
  
  /**
   * Name of the model.
   */
  @QueryParam("name")
  private String name;
  
  /**
   * Target stage of the transition request. Valid values are:
   * 
   * * `None`: The initial stage of a model version.
   * 
   * * `Staging`: Staging or pre-production stage.
   * 
   * * `Production`: Production stage.
   * 
   * * `Archived`: Archived stage.
   */
  @QueryParam("stage")
  private DeleteTransitionRequestStage stage;
  
  /**
   * Version of the model.
   */
  @QueryParam("version")
  private String version;
  
  public DeleteTransitionRequestRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }
  
  public DeleteTransitionRequestRequest setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }
  
  public DeleteTransitionRequestRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
  
  public DeleteTransitionRequestRequest setStage(DeleteTransitionRequestStage stage) {
    this.stage = stage;
    return this;
  }

  public DeleteTransitionRequestStage getStage() {
    return stage;
  }
  
  public DeleteTransitionRequestRequest setVersion(String version) {
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
    DeleteTransitionRequestRequest that = (DeleteTransitionRequestRequest) o;
    return Objects.equals(comment, that.comment)
    && Objects.equals(creator, that.creator)
    && Objects.equals(name, that.name)
    && Objects.equals(stage, that.stage)
    && Objects.equals(version, that.version)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, creator, name, stage, version);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteTransitionRequestRequest.class)
      .add("comment", comment)
      .add("creator", creator)
      .add("name", name)
      .add("stage", stage)
      .add("version", version).toString();
  }
}
