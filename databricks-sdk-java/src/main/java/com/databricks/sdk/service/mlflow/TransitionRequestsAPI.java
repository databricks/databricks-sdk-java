// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

public class TransitionRequestsAPI {
  private final TransitionRequestsService impl;

  /** Regular-use constructor */
  public TransitionRequestsAPI(ApiClient apiClient) {
    impl = new TransitionRequestsImpl(apiClient);
  }

  /** Constructor for mocks */
  public TransitionRequestsAPI(TransitionRequestsService mock) {
    impl = mock;
  }

  /**
   * Approve transition requests.
   *
   * <p>Approves a model version stage transition request.
   */
  public ApproveResponse approve(ApproveTransitionRequest request) {
    return impl.approve(request);
  }

  /**
   * Make a transition request.
   *
   * <p>Creates a model version stage transition request.
   */
  public CreateResponse create(CreateTransitionRequest request) {
    return impl.create(request);
  }

  /**
   * Delete a ransition request.
   *
   * <p>Cancels a model version stage transition request.
   */
  public void delete(DeleteTransitionRequestRequest request) {
    impl.delete(request);
  }

  /**
   * List transition requests.
   *
   * <p>Gets a list of all open stage transition requests for the model version.
   */
  public ListResponse list(ListTransitionRequestsRequest request) {
    return impl.list(request);
  }

  /**
   * Reject a transition request.
   *
   * <p>Rejects a model version stage transition request.
   */
  public RejectResponse reject(RejectTransitionRequest request) {
    return impl.reject(request);
  }

  public TransitionRequestsService impl() {
    return impl;
  }
}
