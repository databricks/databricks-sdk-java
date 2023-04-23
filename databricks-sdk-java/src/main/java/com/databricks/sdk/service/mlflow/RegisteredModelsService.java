// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

/**
 * This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface RegisteredModelsService {
  /**
   * Create a model.
   *
   * <p>Creates a new registered model with the name specified in the request body.
   *
   * <p>Throws `RESOURCE_ALREADY_EXISTS` if a registered model with the given name exists.
   */
  CreateRegisteredModelResponse create(CreateRegisteredModelRequest createRegisteredModelRequest);

  /**
   * Delete a model.
   *
   * <p>Deletes a registered model.
   */
  void delete(DeleteRegisteredModelRequest deleteRegisteredModelRequest);

  /**
   * Delete a model tag.
   *
   * <p>Deletes the tag for a registered model.
   */
  void deleteTag(DeleteRegisteredModelTagRequest deleteRegisteredModelTagRequest);

  /**
   * Get a model.
   *
   * <p>Gets the registered model that matches the specified ID.
   */
  GetRegisteredModelResponse get(GetRegisteredModelRequest getRegisteredModelRequest);

  /**
   * Get the latest version.
   *
   * <p>Gets the latest version of a registered model.
   */
  GetLatestVersionsResponse getLatestVersions(GetLatestVersionsRequest getLatestVersionsRequest);

  /**
   * List models.
   *
   * <p>Lists all available registered models, up to the limit specified in __max_results__.
   */
  ListRegisteredModelsResponse list(ListRegisteredModelsRequest listRegisteredModelsRequest);

  /**
   * Rename a model.
   *
   * <p>Renames a registered model.
   */
  RenameRegisteredModelResponse rename(RenameRegisteredModelRequest renameRegisteredModelRequest);

  /**
   * Search models.
   *
   * <p>Search for registered models based on the specified __filter__.
   */
  SearchRegisteredModelsResponse search(
      SearchRegisteredModelsRequest searchRegisteredModelsRequest);

  /**
   * Set a tag.
   *
   * <p>Sets a tag on a registered model.
   */
  void setTag(SetRegisteredModelTagRequest setRegisteredModelTagRequest);

  /**
   * Update model.
   *
   * <p>Updates a registered model.
   */
  void update(UpdateRegisteredModelRequest updateRegisteredModelRequest);
}
