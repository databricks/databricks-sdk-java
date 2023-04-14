// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransitionRequestsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TransitionRequestsAPI.class);

  private final TransitionRequestsService impl;

  /** Regular-use constructor */
  public TransitionRequestsAPI(ApiClient apiClient) {
    impl = new TransitionRequestsImpl(apiClient);
  }

  /** Constructor for mocks */
  public TransitionRequestsAPI(TransitionRequestsService mock) {
    impl = mock;
  }

  public ApproveResponse approve(
      String name, String version, Stage stage, boolean archiveExistingVersions) {
    return approve(
        new ApproveTransitionRequest()
            .setName(name)
            .setVersion(version)
            .setStage(stage)
            .setArchiveExistingVersions(archiveExistingVersions));
  }

  /**
   * Approve transition requests.
   *
   * <p>Approves a model version stage transition request.
   */
  public ApproveResponse approve(ApproveTransitionRequest request) {
    return impl.approve(request);
  }

  public CreateResponse create(String name, String version, Stage stage) {
    return create(new CreateTransitionRequest().setName(name).setVersion(version).setStage(stage));
  }

  /**
   * Make a transition request.
   *
   * <p>Creates a model version stage transition request.
   */
  public CreateResponse create(CreateTransitionRequest request) {
    return impl.create(request);
  }

  public void delete(String name, String version, String stage, String creator) {
    delete(
        new DeleteTransitionRequestRequest()
            .setName(name)
            .setVersion(version)
            .setStage(stage)
            .setCreator(creator));
  }

  /**
   * Delete a ransition request.
   *
   * <p>Cancels a model version stage transition request.
   */
  public void delete(DeleteTransitionRequestRequest request) {
    impl.delete(request);
  }

  public Iterable<Activity> list(String name, String version) {
    return list(new ListTransitionRequestsRequest().setName(name).setVersion(version));
  }

  /**
   * List transition requests.
   *
   * <p>Gets a list of all open stage transition requests for the model version.
   */
  public Iterable<Activity> list(ListTransitionRequestsRequest request) {
    return impl.list(request).getRequests();
  }

  public RejectResponse reject(String name, String version, Stage stage) {
    return reject(new RejectTransitionRequest().setName(name).setVersion(version).setStage(stage));
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
