// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Paginator;
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

  public CreateRegisteredModelResponse create(String name) {
    return create(new CreateRegisteredModelRequest().setName(name));
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

  public void delete(String name) {
    delete(new DeleteRegisteredModelRequest().setName(name));
  }

  /**
   * Delete a model.
   *
   * <p>Deletes a registered model.
   */
  public void delete(DeleteRegisteredModelRequest request) {
    impl.delete(request);
  }

  public void deleteTag(String name, String key) {
    deleteTag(new DeleteRegisteredModelTagRequest().setName(name).setKey(key));
  }

  /**
   * Delete a model tag.
   *
   * <p>Deletes the tag for a registered model.
   */
  public void deleteTag(DeleteRegisteredModelTagRequest request) {
    impl.deleteTag(request);
  }

  public GetRegisteredModelResponse get(String name) {
    return get(new GetRegisteredModelRequest().setName(name));
  }

  /**
   * Get a model.
   *
   * <p>Gets the registered model that matches the specified ID.
   */
  public GetRegisteredModelResponse get(GetRegisteredModelRequest request) {
    return impl.get(request);
  }

  public Iterable<ModelVersion> getLatestVersions(String name) {
    return getLatestVersions(new GetLatestVersionsRequest().setName(name));
  }

  /**
   * Get the latest version.
   *
   * <p>Gets the latest version of a registered model.
   */
  public Iterable<ModelVersion> getLatestVersions(GetLatestVersionsRequest request) {
    return impl.getLatestVersions(request).getModelVersions();
  }

  /**
   * List models.
   *
   * <p>Lists all available registered models, up to the limit specified in __max_results__.
   */
  public Iterable<RegisteredModel> list(ListRegisteredModelsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListRegisteredModelsResponse::getRegisteredModels,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public RenameRegisteredModelResponse rename(String name) {
    return rename(new RenameRegisteredModelRequest().setName(name));
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
  public Iterable<RegisteredModel> search(SearchRegisteredModelsRequest request) {
    return new Paginator<>(
        request,
        impl::search,
        SearchRegisteredModelsResponse::getRegisteredModels,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public void setTag(String name, String key, String value) {
    setTag(new SetRegisteredModelTagRequest().setName(name).setKey(key).setValue(value));
  }

  /**
   * Set a tag.
   *
   * <p>Sets a tag on a registered model.
   */
  public void setTag(SetRegisteredModelTagRequest request) {
    impl.setTag(request);
  }

  public void update(String name) {
    update(new UpdateRegisteredModelRequest().setName(name));
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
