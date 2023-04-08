// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

public class ModelVersionCommentsAPI {
  private final ModelVersionCommentsService impl;

  /** Regular-use constructor */
  public ModelVersionCommentsAPI(ApiClient apiClient) {
    impl = new ModelVersionCommentsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ModelVersionCommentsAPI(ModelVersionCommentsService mock) {
    impl = mock;
  }

  /**
   * Post a comment.
   *
   * <p>Posts a comment on a model version. A comment can be submitted either by a user or
   * programmatically to display relevant information about the model. For example, test results or
   * deployment errors.
   */
  public CreateResponse create(CreateComment request) {
    return impl.create(request);
  }

  /**
   * Delete a comment.
   *
   * <p>Deletes a comment on a model version.
   */
  public void delete(DeleteModelVersionCommentRequest request) {
    impl.delete(request);
  }

  /**
   * Update a comment.
   *
   * <p>Post an edit to a comment on a model version.
   */
  public UpdateResponse update(UpdateComment request) {
    return impl.update(request);
  }

  public ModelVersionCommentsService impl() {
    return impl;
  }
}
