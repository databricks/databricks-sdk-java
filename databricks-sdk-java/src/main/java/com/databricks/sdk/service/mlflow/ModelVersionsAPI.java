// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

public class ModelVersionsAPI {
  private final ModelVersionsService impl;

  /** Regular-use constructor */
  public ModelVersionsAPI(ApiClient apiClient) {
    impl = new ModelVersionsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ModelVersionsAPI(ModelVersionsService mock) {
    impl = mock;
  }

  /**
   * Create a model version.
   *
   * <p>Creates a model version.
   */
  public CreateModelVersionResponse create(CreateModelVersionRequest request) {
    return impl.create(request);
  }

  /**
   * Delete a model version.
   *
   * <p>Deletes a model version.
   */
  public void delete(DeleteModelVersionRequest request) {
    impl.delete(request);
  }

  /**
   * Delete a model version tag.
   *
   * <p>Deletes a model version tag.
   */
  public void deleteTag(DeleteModelVersionTagRequest request) {
    impl.deleteTag(request);
  }

  /**
   * Get a model version.
   *
   * <p>Get a model version.
   */
  public GetModelVersionResponse get(GetModelVersionRequest request) {
    return impl.get(request);
  }

  /**
   * Get a model version URI.
   *
   * <p>Gets a URI to download the model version.
   */
  public GetModelVersionDownloadUriResponse getDownloadUri(
      GetModelVersionDownloadUriRequest request) {
    return impl.getDownloadUri(request);
  }

  /**
   * Searches model versions.
   *
   * <p>Searches for specific model versions based on the supplied __filter__.
   */
  public SearchModelVersionsResponse search(SearchModelVersionsRequest request) {
    return impl.search(request);
  }

  /**
   * Set a version tag.
   *
   * <p>Sets a model version tag.
   */
  public void setTag(SetModelVersionTagRequest request) {
    impl.setTag(request);
  }

  /**
   * Transition a stage.
   *
   * <p>Transition to the next model stage.
   */
  public TransitionModelVersionStageResponse transitionStage(TransitionModelVersionStage request) {
    return impl.transitionStage(request);
  }

  /**
   * Update model version.
   *
   * <p>Updates the model version.
   */
  public void update(UpdateModelVersionRequest request) {
    impl.update(request);
  }

  public ModelVersionsService impl() {
    return impl;
  }
}
