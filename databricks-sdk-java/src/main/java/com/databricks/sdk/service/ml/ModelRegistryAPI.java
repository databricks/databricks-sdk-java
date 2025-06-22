// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Note: This API reference documents APIs for the Workspace Model Registry. Databricks recommends
 * using [Models in Unity Catalog](/api/workspace/registeredmodels) instead. Models in Unity Catalog
 * provides centralized model governance, cross-workspace access, lineage, and deployment. Workspace
 * Model Registry will be deprecated in the future.
 *
 * <p>The Workspace Model Registry is a centralized model repository and a UI and set of APIs that
 * enable you to manage the full lifecycle of MLflow Models.
 */
@Generated
public class ModelRegistryAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ModelRegistryAPI.class);

  private final ModelRegistryService impl;

  /** Regular-use constructor */
  public ModelRegistryAPI(ApiClient apiClient) {
    impl = new ModelRegistryImpl(apiClient);
  }

  /** Constructor for mocks */
  public ModelRegistryAPI(ModelRegistryService mock) {
    impl = mock;
  }

  public ApproveTransitionRequestResponse approveTransitionRequest(
      String name, String version, Stage stage, boolean archiveExistingVersions) {
    return approveTransitionRequest(
        new ApproveTransitionRequest()
            .setName(name)
            .setVersion(version)
            .setStage(stage)
            .setArchiveExistingVersions(archiveExistingVersions));
  }

  /** Approves a model version stage transition request. */
  public ApproveTransitionRequestResponse approveTransitionRequest(
      ApproveTransitionRequest request) {
    return impl.approveTransitionRequest(request);
  }

  public CreateCommentResponse createComment(String name, String version, String comment) {
    return createComment(new CreateComment().setName(name).setVersion(version).setComment(comment));
  }

  /**
   * Posts a comment on a model version. A comment can be submitted either by a user or
   * programmatically to display relevant information about the model. For example, test results or
   * deployment errors.
   */
  public CreateCommentResponse createComment(CreateComment request) {
    return impl.createComment(request);
  }

  public CreateModelResponse createModel(String name) {
    return createModel(new CreateModelRequest().setName(name));
  }

  /**
   * Creates a new registered model with the name specified in the request body.
   *
   * <p>Throws `RESOURCE_ALREADY_EXISTS` if a registered model with the given name exists.
   */
  public CreateModelResponse createModel(CreateModelRequest request) {
    return impl.createModel(request);
  }

  public CreateModelVersionResponse createModelVersion(String name, String source) {
    return createModelVersion(new CreateModelVersionRequest().setName(name).setSource(source));
  }

  /** Creates a model version. */
  public CreateModelVersionResponse createModelVersion(CreateModelVersionRequest request) {
    return impl.createModelVersion(request);
  }

  public CreateTransitionRequestResponse createTransitionRequest(
      String name, String version, Stage stage) {
    return createTransitionRequest(
        new CreateTransitionRequest().setName(name).setVersion(version).setStage(stage));
  }

  /** Creates a model version stage transition request. */
  public CreateTransitionRequestResponse createTransitionRequest(CreateTransitionRequest request) {
    return impl.createTransitionRequest(request);
  }

  public CreateWebhookResponse createWebhook(Collection<RegistryWebhookEvent> events) {
    return createWebhook(new CreateRegistryWebhook().setEvents(events));
  }

  /**
   * **NOTE**: This endpoint is in Public Preview.
   *
   * <p>Creates a registry webhook.
   */
  public CreateWebhookResponse createWebhook(CreateRegistryWebhook request) {
    return impl.createWebhook(request);
  }

  public void deleteComment(String id) {
    deleteComment(new DeleteCommentRequest().setId(id));
  }

  /** Deletes a comment on a model version. */
  public void deleteComment(DeleteCommentRequest request) {
    impl.deleteComment(request);
  }

  public void deleteModel(String name) {
    deleteModel(new DeleteModelRequest().setName(name));
  }

  /** Deletes a registered model. */
  public void deleteModel(DeleteModelRequest request) {
    impl.deleteModel(request);
  }

  public void deleteModelTag(String name, String key) {
    deleteModelTag(new DeleteModelTagRequest().setName(name).setKey(key));
  }

  /** Deletes the tag for a registered model. */
  public void deleteModelTag(DeleteModelTagRequest request) {
    impl.deleteModelTag(request);
  }

  public void deleteModelVersion(String name, String version) {
    deleteModelVersion(new DeleteModelVersionRequest().setName(name).setVersion(version));
  }

  /** Deletes a model version. */
  public void deleteModelVersion(DeleteModelVersionRequest request) {
    impl.deleteModelVersion(request);
  }

  public void deleteModelVersionTag(String name, String version, String key) {
    deleteModelVersionTag(
        new DeleteModelVersionTagRequest().setName(name).setVersion(version).setKey(key));
  }

  /** Deletes a model version tag. */
  public void deleteModelVersionTag(DeleteModelVersionTagRequest request) {
    impl.deleteModelVersionTag(request);
  }

  public void deleteTransitionRequest(
      String name, String version, DeleteTransitionRequestStage stage, String creator) {
    deleteTransitionRequest(
        new DeleteTransitionRequestRequest()
            .setName(name)
            .setVersion(version)
            .setStage(stage)
            .setCreator(creator));
  }

  /** Cancels a model version stage transition request. */
  public void deleteTransitionRequest(DeleteTransitionRequestRequest request) {
    impl.deleteTransitionRequest(request);
  }

  /**
   * **NOTE:** This endpoint is in Public Preview.
   *
   * <p>Deletes a registry webhook.
   */
  public void deleteWebhook(DeleteWebhookRequest request) {
    impl.deleteWebhook(request);
  }

  public Iterable<ModelVersion> getLatestVersions(String name) {
    return getLatestVersions(new GetLatestVersionsRequest().setName(name));
  }

  /** Gets the latest version of a registered model. */
  public Iterable<ModelVersion> getLatestVersions(GetLatestVersionsRequest request) {
    return new Paginator<>(
        request,
        impl::getLatestVersions,
        GetLatestVersionsResponse::getModelVersions,
        response -> null);
  }

  public GetModelResponse getModel(String name) {
    return getModel(new GetModelRequest().setName(name));
  }

  /**
   * Get the details of a model. This is a Databricks workspace version of the [MLflow endpoint]
   * that also returns the model's Databricks workspace ID and the permission level of the
   * requesting user on the model.
   *
   * <p>[MLflow endpoint]: https://www.mlflow.org/docs/latest/rest-api.html#get-registeredmodel
   */
  public GetModelResponse getModel(GetModelRequest request) {
    return impl.getModel(request);
  }

  public GetModelVersionResponse getModelVersion(String name, String version) {
    return getModelVersion(new GetModelVersionRequest().setName(name).setVersion(version));
  }

  /** Get a model version. */
  public GetModelVersionResponse getModelVersion(GetModelVersionRequest request) {
    return impl.getModelVersion(request);
  }

  public GetModelVersionDownloadUriResponse getModelVersionDownloadUri(
      String name, String version) {
    return getModelVersionDownloadUri(
        new GetModelVersionDownloadUriRequest().setName(name).setVersion(version));
  }

  /** Gets a URI to download the model version. */
  public GetModelVersionDownloadUriResponse getModelVersionDownloadUri(
      GetModelVersionDownloadUriRequest request) {
    return impl.getModelVersionDownloadUri(request);
  }

  public GetRegisteredModelPermissionLevelsResponse getPermissionLevels(String registeredModelId) {
    return getPermissionLevels(
        new GetRegisteredModelPermissionLevelsRequest().setRegisteredModelId(registeredModelId));
  }

  /** Gets the permission levels that a user can have on an object. */
  public GetRegisteredModelPermissionLevelsResponse getPermissionLevels(
      GetRegisteredModelPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  public RegisteredModelPermissions getPermissions(String registeredModelId) {
    return getPermissions(
        new GetRegisteredModelPermissionsRequest().setRegisteredModelId(registeredModelId));
  }

  /**
   * Gets the permissions of a registered model. Registered models can inherit permissions from
   * their root object.
   */
  public RegisteredModelPermissions getPermissions(GetRegisteredModelPermissionsRequest request) {
    return impl.getPermissions(request);
  }

  /** Lists all available registered models, up to the limit specified in __max_results__. */
  public Iterable<Model> listModels(ListModelsRequest request) {
    return new Paginator<>(
        request,
        impl::listModels,
        ListModelsResponse::getRegisteredModels,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Activity> listTransitionRequests(String name, String version) {
    return listTransitionRequests(
        new ListTransitionRequestsRequest().setName(name).setVersion(version));
  }

  /** Gets a list of all open stage transition requests for the model version. */
  public Iterable<Activity> listTransitionRequests(ListTransitionRequestsRequest request) {
    return new Paginator<>(
        request,
        impl::listTransitionRequests,
        ListTransitionRequestsResponse::getRequests,
        response -> null);
  }

  /**
   * **NOTE:** This endpoint is in Public Preview.
   *
   * <p>Lists all registry webhooks.
   */
  public Iterable<RegistryWebhook> listWebhooks(ListWebhooksRequest request) {
    return new Paginator<>(
        request,
        impl::listWebhooks,
        ListRegistryWebhooks::getWebhooks,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public RejectTransitionRequestResponse rejectTransitionRequest(
      String name, String version, Stage stage) {
    return rejectTransitionRequest(
        new RejectTransitionRequest().setName(name).setVersion(version).setStage(stage));
  }

  /** Rejects a model version stage transition request. */
  public RejectTransitionRequestResponse rejectTransitionRequest(RejectTransitionRequest request) {
    return impl.rejectTransitionRequest(request);
  }

  public RenameModelResponse renameModel(String name) {
    return renameModel(new RenameModelRequest().setName(name));
  }

  /** Renames a registered model. */
  public RenameModelResponse renameModel(RenameModelRequest request) {
    return impl.renameModel(request);
  }

  /** Searches for specific model versions based on the supplied __filter__. */
  public Iterable<ModelVersion> searchModelVersions(SearchModelVersionsRequest request) {
    return new Paginator<>(
        request,
        impl::searchModelVersions,
        SearchModelVersionsResponse::getModelVersions,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Search for registered models based on the specified __filter__. */
  public Iterable<Model> searchModels(SearchModelsRequest request) {
    return new Paginator<>(
        request,
        impl::searchModels,
        SearchModelsResponse::getRegisteredModels,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public void setModelTag(String name, String key, String value) {
    setModelTag(new SetModelTagRequest().setName(name).setKey(key).setValue(value));
  }

  /** Sets a tag on a registered model. */
  public void setModelTag(SetModelTagRequest request) {
    impl.setModelTag(request);
  }

  public void setModelVersionTag(String name, String version, String key, String value) {
    setModelVersionTag(
        new SetModelVersionTagRequest()
            .setName(name)
            .setVersion(version)
            .setKey(key)
            .setValue(value));
  }

  /** Sets a model version tag. */
  public void setModelVersionTag(SetModelVersionTagRequest request) {
    impl.setModelVersionTag(request);
  }

  public RegisteredModelPermissions setPermissions(String registeredModelId) {
    return setPermissions(
        new RegisteredModelPermissionsRequest().setRegisteredModelId(registeredModelId));
  }

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  public RegisteredModelPermissions setPermissions(RegisteredModelPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  public TestRegistryWebhookResponse testRegistryWebhook(String id) {
    return testRegistryWebhook(new TestRegistryWebhookRequest().setId(id));
  }

  /**
   * **NOTE:** This endpoint is in Public Preview.
   *
   * <p>Tests a registry webhook.
   */
  public TestRegistryWebhookResponse testRegistryWebhook(TestRegistryWebhookRequest request) {
    return impl.testRegistryWebhook(request);
  }

  public TransitionStageResponse transitionStage(
      String name, String version, Stage stage, boolean archiveExistingVersions) {
    return transitionStage(
        new TransitionModelVersionStageDatabricks()
            .setName(name)
            .setVersion(version)
            .setStage(stage)
            .setArchiveExistingVersions(archiveExistingVersions));
  }

  /**
   * Transition a model version's stage. This is a Databricks workspace version of the [MLflow
   * endpoint] that also accepts a comment associated with the transition to be recorded.",
   *
   * <p>[MLflow endpoint]:
   * https://www.mlflow.org/docs/latest/rest-api.html#transition-modelversion-stage
   */
  public TransitionStageResponse transitionStage(TransitionModelVersionStageDatabricks request) {
    return impl.transitionStage(request);
  }

  public UpdateCommentResponse updateComment(String id, String comment) {
    return updateComment(new UpdateComment().setId(id).setComment(comment));
  }

  /** Post an edit to a comment on a model version. */
  public UpdateCommentResponse updateComment(UpdateComment request) {
    return impl.updateComment(request);
  }

  public void updateModel(String name) {
    updateModel(new UpdateModelRequest().setName(name));
  }

  /** Updates a registered model. */
  public void updateModel(UpdateModelRequest request) {
    impl.updateModel(request);
  }

  public void updateModelVersion(String name, String version) {
    updateModelVersion(new UpdateModelVersionRequest().setName(name).setVersion(version));
  }

  /** Updates the model version. */
  public void updateModelVersion(UpdateModelVersionRequest request) {
    impl.updateModelVersion(request);
  }

  public RegisteredModelPermissions updatePermissions(String registeredModelId) {
    return updatePermissions(
        new RegisteredModelPermissionsRequest().setRegisteredModelId(registeredModelId));
  }

  /**
   * Updates the permissions on a registered model. Registered models can inherit permissions from
   * their root object.
   */
  public RegisteredModelPermissions updatePermissions(RegisteredModelPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public void updateWebhook(String id) {
    updateWebhook(new UpdateRegistryWebhook().setId(id));
  }

  /**
   * **NOTE:** This endpoint is in Public Preview.
   *
   * <p>Updates a registry webhook.
   */
  public void updateWebhook(UpdateRegistryWebhook request) {
    impl.updateWebhook(request);
  }

  public ModelRegistryService impl() {
    return impl;
  }
}
