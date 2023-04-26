// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a ransition request
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.DeleteTransitionRequestRequest} object
   */
  public DeleteTransitionRequestRequest setComment(String comment) {
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
   * <p>Setter for the field <code>creator</code>.</p>
   *
   * @param creator a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.DeleteTransitionRequestRequest} object
   */
  public DeleteTransitionRequestRequest setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * <p>Getter for the field <code>creator</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreator() {
    return creator;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.DeleteTransitionRequestRequest} object
   */
  public DeleteTransitionRequestRequest setName(String name) {
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
   * @param stage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.DeleteTransitionRequestRequest} object
   */
  public DeleteTransitionRequestRequest setStage(String stage) {
    this.stage = stage;
    return this;
  }

  /**
   * <p>Getter for the field <code>stage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStage() {
    return stage;
  }

  /**
   * <p>Setter for the field <code>version</code>.</p>
   *
   * @param version a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.DeleteTransitionRequestRequest} object
   */
  public DeleteTransitionRequestRequest setVersion(String version) {
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
    DeleteTransitionRequestRequest that = (DeleteTransitionRequestRequest) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(creator, that.creator)
        && Objects.equals(name, that.name)
        && Objects.equals(stage, that.stage)
        && Objects.equals(version, that.version);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(comment, creator, name, stage, version);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteTransitionRequestRequest.class)
        .add("comment", comment)
        .add("creator", creator)
        .add("name", name)
        .add("stage", stage)
        .add("version", version)
        .toString();
  }
}
