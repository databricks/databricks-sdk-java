// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

/**
 * This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface ModelVersionCommentsService {
  /**
   * Post a comment.
   *
   * <p>Posts a comment on a model version. A comment can be submitted either by a user or
   * programmatically to display relevant information about the model. For example, test results or
   * deployment errors.
   */
  CreateResponse create(CreateComment createComment);

  /**
   * Delete a comment.
   *
   * <p>Deletes a comment on a model version.
   */
  void delete(DeleteModelVersionCommentRequest deleteModelVersionCommentRequest);

  /**
   * Update a comment.
   *
   * <p>Post an edit to a comment on a model version.
   */
  UpdateResponse update(UpdateComment updateComment);
}
