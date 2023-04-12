// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Paginator;
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

  public CreateModelVersionResponse create(String name, String source) {
    return create(new CreateModelVersionRequest().setName(name).setSource(source));
  }

  /**
   * Create a model version.
   *
   * <p>Creates a model version.
   */
  public CreateModelVersionResponse create(CreateModelVersionRequest request) {
    return impl.create(request);
  }

  public void delete(String name, String version) {
    delete(new DeleteModelVersionRequest().setName(name).setVersion(version));
  }

  /**
   * Delete a model version.
   *
   * <p>Deletes a model version.
   */
  public void delete(DeleteModelVersionRequest request) {
    impl.delete(request);
  }

  public void deleteTag(String name, String version, String key) {
    deleteTag(new DeleteModelVersionTagRequest().setName(name).setVersion(version).setKey(key));
  }

  /**
   * Delete a model version tag.
   *
   * <p>Deletes a model version tag.
   */
  public void deleteTag(DeleteModelVersionTagRequest request) {
    impl.deleteTag(request);
  }

  public GetModelVersionResponse get(String name, String version) {
    return get(new GetModelVersionRequest().setName(name).setVersion(version));
  }

  /**
   * Get a model version.
   *
   * <p>Get a model version.
   */
  public GetModelVersionResponse get(GetModelVersionRequest request) {
    return impl.get(request);
  }

  public GetModelVersionDownloadUriResponse getDownloadUri(String name, String version) {
    return getDownloadUri(
        new GetModelVersionDownloadUriRequest().setName(name).setVersion(version));
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
  public Iterable<ModelVersion> search(SearchModelVersionsRequest request) {
    return new Paginator<>(
        request,
        impl::search,
        SearchModelVersionsResponse::getModelVersions,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public void setTag(String name, String version, String key, String value) {
    setTag(
        new SetModelVersionTagRequest()
            .setName(name)
            .setVersion(version)
            .setKey(key)
            .setValue(value));
  }

  /**
   * Set a version tag.
   *
   * <p>Sets a model version tag.
   */
  public void setTag(SetModelVersionTagRequest request) {
    impl.setTag(request);
  }

  public TransitionModelVersionStageResponse transitionStage(
      String name, String version, String stage, boolean archiveExistingVersions) {
    return transitionStage(
        new TransitionModelVersionStage()
            .setName(name)
            .setVersion(version)
            .setStage(stage)
            .setArchiveExistingVersions(archiveExistingVersions));
  }

  /**
   * Transition a stage.
   *
   * <p>Transition to the next model stage.
   */
  public TransitionModelVersionStageResponse transitionStage(TransitionModelVersionStage request) {
    return impl.transitionStage(request);
  }

  public void update(String name, String version) {
    update(new UpdateModelVersionRequest().setName(name).setVersion(version));
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
