// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

/**
 * This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface ModelVersionsService {
  /**
   * Create a model version.
   *
   * <p>Creates a model version.
   */
  CreateModelVersionResponse create(CreateModelVersionRequest createModelVersionRequest);

  /**
   * Delete a model version.
   *
   * <p>Deletes a model version.
   */
  void delete(DeleteModelVersionRequest deleteModelVersionRequest);

  /**
   * Delete a model version tag.
   *
   * <p>Deletes a model version tag.
   */
  void deleteTag(DeleteModelVersionTagRequest deleteModelVersionTagRequest);

  /**
   * Get a model version.
   *
   * <p>Get a model version.
   */
  GetModelVersionResponse get(GetModelVersionRequest getModelVersionRequest);

  /**
   * Get a model version URI.
   *
   * <p>Gets a URI to download the model version.
   */
  GetModelVersionDownloadUriResponse getDownloadUri(
      GetModelVersionDownloadUriRequest getModelVersionDownloadUriRequest);

  /**
   * Searches model versions.
   *
   * <p>Searches for specific model versions based on the supplied __filter__.
   */
  SearchModelVersionsResponse search(SearchModelVersionsRequest searchModelVersionsRequest);

  /**
   * Set a version tag.
   *
   * <p>Sets a model version tag.
   */
  void setTag(SetModelVersionTagRequest setModelVersionTagRequest);

  /**
   * Transition a stage.
   *
   * <p>Transition to the next model stage.
   */
  TransitionModelVersionStageResponse transitionStage(
      TransitionModelVersionStage transitionModelVersionStage);

  /**
   * Update model version.
   *
   * <p>Updates the model version.
   */
  void update(UpdateModelVersionRequest updateModelVersionRequest);
}
