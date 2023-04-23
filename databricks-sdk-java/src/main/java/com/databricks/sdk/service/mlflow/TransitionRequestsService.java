// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

/**
 * This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface TransitionRequestsService {
  /**
   * Approve transition requests.
   *
   * <p>Approves a model version stage transition request.
   */
  ApproveResponse approve(ApproveTransitionRequest approveTransitionRequest);

  /**
   * Make a transition request.
   *
   * <p>Creates a model version stage transition request.
   */
  CreateResponse create(CreateTransitionRequest createTransitionRequest);

  /**
   * Delete a ransition request.
   *
   * <p>Cancels a model version stage transition request.
   */
  void delete(DeleteTransitionRequestRequest deleteTransitionRequestRequest);

  /**
   * List transition requests.
   *
   * <p>Gets a list of all open stage transition requests for the model version.
   */
  ListResponse list(ListTransitionRequestsRequest listTransitionRequestsRequest);

  /**
   * Reject a transition request.
   *
   * <p>Rejects a model version stage transition request.
   */
  RejectResponse reject(RejectTransitionRequest rejectTransitionRequest);
}
