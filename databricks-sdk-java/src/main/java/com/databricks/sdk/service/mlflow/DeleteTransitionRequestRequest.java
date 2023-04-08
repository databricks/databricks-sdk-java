// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;

/** Delete a ransition request */
public class DeleteTransitionRequestRequest {
  /** User-provided comment on the action. */
  @QueryParam("comment")
  private String comment;

  /**
   * Username of the user who created this request. Of the transition requests matching the
   * specified details, only the one transition created by this user will be deleted.
   */
  @QueryParam("creator")
  private String creator;

  /** Name of the model. */
  @QueryParam("name")
  private String name;

  /**
   * Target stage of the transition request. Valid values are:
   *
   * <p>* `None`: The initial stage of a model version.
   *
   * <p>* `Staging`: Staging or pre-production stage.
   *
   * <p>* `Production`: Production stage.
   *
   * <p>* `Archived`: Archived stage.
   */
  @QueryParam("stage")
  private String stage;

  /** Version of the model. */
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

  public DeleteTransitionRequestRequest setStage(String stage) {
    this.stage = stage;
    return this;
  }

  public String getStage() {
    return stage;
  }

  public DeleteTransitionRequestRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }
}
