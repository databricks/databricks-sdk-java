// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

public class RegisteredModelsAPI {
  private final RegisteredModelsService impl;

  /** Regular-use constructor */
  public RegisteredModelsAPI(ApiClient apiClient) {
    impl = new RegisteredModelsImpl(apiClient);
  }

  /** Constructor for mocks */
  public RegisteredModelsAPI(RegisteredModelsService mock) {
    impl = mock;
  }

  /**
   * Create a model.
   *
   * <p>Creates a new registered model with the name specified in the request body.
   *
   * <p>Throws `RESOURCE_ALREADY_EXISTS` if a registered model with the given name exists.
   */
  public CreateRegisteredModelResponse create(CreateRegisteredModelRequest request) {
    return impl.create(request);
  }

  /**
   * Delete a model.
   *
   * <p>Deletes a registered model.
   */
  public void delete(DeleteRegisteredModelRequest request) {
    impl.delete(request);
  }

  /**
   * Delete a model tag.
   *
   * <p>Deletes the tag for a registered model.
   */
  public void deleteTag(DeleteRegisteredModelTagRequest request) {
    impl.deleteTag(request);
  }

  /**
   * Get a model.
   *
   * <p>Gets the registered model that matches the specified ID.
   */
  public GetRegisteredModelResponse get(GetRegisteredModelRequest request) {
    return impl.get(request);
  }

  /**
   * Get the latest version.
   *
   * <p>Gets the latest version of a registered model.
   */
  public GetLatestVersionsResponse getLatestVersions(GetLatestVersionsRequest request) {
    return impl.getLatestVersions(request);
  }

  /**
   * List models.
   *
   * <p>Lists all available registered models, up to the limit specified in __max_results__.
   */
  public ListRegisteredModelsResponse list(ListRegisteredModelsRequest request) {
    return impl.list(request);
  }

  /**
   * Rename a model.
   *
   * <p>Renames a registered model.
   */
  public RenameRegisteredModelResponse rename(RenameRegisteredModelRequest request) {
    return impl.rename(request);
  }

  /**
   * Search models.
   *
   * <p>Search for registered models based on the specified __filter__.
   */
  public SearchRegisteredModelsResponse search(SearchRegisteredModelsRequest request) {
    return impl.search(request);
  }

  /**
   * Set a tag.
   *
   * <p>Sets a tag on a registered model.
   */
  public void setTag(SetRegisteredModelTagRequest request) {
    impl.setTag(request);
  }

  /**
   * Update model.
   *
   * <p>Updates a registered model.
   */
  public void update(UpdateRegisteredModelRequest request) {
    impl.update(request);
  }

  public RegisteredModelsService impl() {
    return impl;
  }
}
