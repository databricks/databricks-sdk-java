// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Paginator;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>ModelRegistryAPI class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ModelRegistryAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ModelRegistryAPI.class);

  private final ModelRegistryService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public ModelRegistryAPI(ApiClient apiClient) {
    impl = new ModelRegistryImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.ml.ModelRegistryService} object
   */
  public ModelRegistryAPI(ModelRegistryService mock) {
    impl = mock;
  }

  /**
   * <p>approveTransitionRequest.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   * @param stage a {@link com.databricks.sdk.service.ml.Stage} object
   * @param archiveExistingVersions a boolean
   * @return a {@link com.databricks.sdk.service.ml.ApproveTransitionRequestResponse} object
   */
  public ApproveTransitionRequestResponse approveTransitionRequest(
      String name, String version, Stage stage, boolean archiveExistingVersions) {
    return approveTransitionRequest(
        new ApproveTransitionRequest()
            .setName(name)
            .setVersion(version)
            .setStage(stage)
            .setArchiveExistingVersions(archiveExistingVersions));
  }

  /**
   * Approve transition request.
   *
   * <p>Approves a model version stage transition request.
   *
   * @param request a {@link com.databricks.sdk.service.ml.ApproveTransitionRequest} object
   * @return a {@link com.databricks.sdk.service.ml.ApproveTransitionRequestResponse} object
   */
  public ApproveTransitionRequestResponse approveTransitionRequest(
      ApproveTransitionRequest request) {
    return impl.approveTransitionRequest(request);
  }

  /**
   * <p>createComment.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.CreateCommentResponse} object
   */
  public CreateCommentResponse createComment(String name, String version, String comment) {
    return createComment(new CreateComment().setName(name).setVersion(version).setComment(comment));
  }

  /**
   * Post a comment.
   *
   * <p>Posts a comment on a model version. A comment can be submitted either by a user or
   * programmatically to display relevant information about the model. For example, test results or
   * deployment errors.
   *
   * @param request a {@link com.databricks.sdk.service.ml.CreateComment} object
   * @return a {@link com.databricks.sdk.service.ml.CreateCommentResponse} object
   */
  public CreateCommentResponse createComment(CreateComment request) {
    return impl.createComment(request);
  }

  /**
   * <p>createModel.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.CreateModelResponse} object
   */
  public CreateModelResponse createModel(String name) {
    return createModel(new CreateModelRequest().setName(name));
  }

  /**
   * Create a model.
   *
   * <p>Creates a new registered model with the name specified in the request body.
   *
   * <p>Throws `RESOURCE_ALREADY_EXISTS` if a registered model with the given name exists.
   *
   * @param request a {@link com.databricks.sdk.service.ml.CreateModelRequest} object
   * @return a {@link com.databricks.sdk.service.ml.CreateModelResponse} object
   */
  public CreateModelResponse createModel(CreateModelRequest request) {
    return impl.createModel(request);
  }

  /**
   * <p>createModelVersion.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param source a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.CreateModelVersionResponse} object
   */
  public CreateModelVersionResponse createModelVersion(String name, String source) {
    return createModelVersion(new CreateModelVersionRequest().setName(name).setSource(source));
  }

  /**
   * Create a model version.
   *
   * <p>Creates a model version.
   *
   * @param request a {@link com.databricks.sdk.service.ml.CreateModelVersionRequest} object
   * @return a {@link com.databricks.sdk.service.ml.CreateModelVersionResponse} object
   */
  public CreateModelVersionResponse createModelVersion(CreateModelVersionRequest request) {
    return impl.createModelVersion(request);
  }

  /**
   * <p>createTransitionRequest.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   * @param stage a {@link com.databricks.sdk.service.ml.Stage} object
   * @return a {@link com.databricks.sdk.service.ml.CreateTransitionRequestResponse} object
   */
  public CreateTransitionRequestResponse createTransitionRequest(
      String name, String version, Stage stage) {
    return createTransitionRequest(
        new CreateTransitionRequest().setName(name).setVersion(version).setStage(stage));
  }

  /**
   * Make a transition request.
   *
   * <p>Creates a model version stage transition request.
   *
   * @param request a {@link com.databricks.sdk.service.ml.CreateTransitionRequest} object
   * @return a {@link com.databricks.sdk.service.ml.CreateTransitionRequestResponse} object
   */
  public CreateTransitionRequestResponse createTransitionRequest(CreateTransitionRequest request) {
    return impl.createTransitionRequest(request);
  }

  /**
   * <p>createWebhook.</p>
   *
   * @param events a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.CreateWebhookResponse} object
   */
  public CreateWebhookResponse createWebhook(Collection<RegistryWebhookEvent> events) {
    return createWebhook(new CreateRegistryWebhook().setEvents(events));
  }

  /**
   * Create a webhook.
   *
   * <p>**NOTE**: This endpoint is in Public Preview.
   *
   * <p>Creates a registry webhook.
   *
   * @param request a {@link com.databricks.sdk.service.ml.CreateRegistryWebhook} object
   * @return a {@link com.databricks.sdk.service.ml.CreateWebhookResponse} object
   */
  public CreateWebhookResponse createWebhook(CreateRegistryWebhook request) {
    return impl.createWebhook(request);
  }

  /**
   * <p>deleteComment.</p>
   *
   * @param id a {@link java.lang.String} object
   */
  public void deleteComment(String id) {
    deleteComment(new DeleteCommentRequest().setId(id));
  }

  /**
   * Delete a comment.
   *
   * <p>Deletes a comment on a model version.
   *
   * @param request a {@link com.databricks.sdk.service.ml.DeleteCommentRequest} object
   */
  public void deleteComment(DeleteCommentRequest request) {
    impl.deleteComment(request);
  }

  /**
   * <p>deleteModel.</p>
   *
   * @param name a {@link java.lang.String} object
   */
  public void deleteModel(String name) {
    deleteModel(new DeleteModelRequest().setName(name));
  }

  /**
   * Delete a model.
   *
   * <p>Deletes a registered model.
   *
   * @param request a {@link com.databricks.sdk.service.ml.DeleteModelRequest} object
   */
  public void deleteModel(DeleteModelRequest request) {
    impl.deleteModel(request);
  }

  /**
   * <p>deleteModelTag.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param key a {@link java.lang.String} object
   */
  public void deleteModelTag(String name, String key) {
    deleteModelTag(new DeleteModelTagRequest().setName(name).setKey(key));
  }

  /**
   * Delete a model tag.
   *
   * <p>Deletes the tag for a registered model.
   *
   * @param request a {@link com.databricks.sdk.service.ml.DeleteModelTagRequest} object
   */
  public void deleteModelTag(DeleteModelTagRequest request) {
    impl.deleteModelTag(request);
  }

  /**
   * <p>deleteModelVersion.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   */
  public void deleteModelVersion(String name, String version) {
    deleteModelVersion(new DeleteModelVersionRequest().setName(name).setVersion(version));
  }

  /**
   * Delete a model version.
   *
   * <p>Deletes a model version.
   *
   * @param request a {@link com.databricks.sdk.service.ml.DeleteModelVersionRequest} object
   */
  public void deleteModelVersion(DeleteModelVersionRequest request) {
    impl.deleteModelVersion(request);
  }

  /**
   * <p>deleteModelVersionTag.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   * @param key a {@link java.lang.String} object
   */
  public void deleteModelVersionTag(String name, String version, String key) {
    deleteModelVersionTag(
        new DeleteModelVersionTagRequest().setName(name).setVersion(version).setKey(key));
  }

  /**
   * Delete a model version tag.
   *
   * <p>Deletes a model version tag.
   *
   * @param request a {@link com.databricks.sdk.service.ml.DeleteModelVersionTagRequest} object
   */
  public void deleteModelVersionTag(DeleteModelVersionTagRequest request) {
    impl.deleteModelVersionTag(request);
  }

  /**
   * <p>deleteTransitionRequest.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   * @param stage a {@link java.lang.String} object
   * @param creator a {@link java.lang.String} object
   */
  public void deleteTransitionRequest(String name, String version, String stage, String creator) {
    deleteTransitionRequest(
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
   *
   * @param request a {@link com.databricks.sdk.service.ml.DeleteTransitionRequestRequest} object
   */
  public void deleteTransitionRequest(DeleteTransitionRequestRequest request) {
    impl.deleteTransitionRequest(request);
  }

  /**
   * Delete a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Deletes a registry webhook.
   *
   * @param request a {@link com.databricks.sdk.service.ml.DeleteWebhookRequest} object
   */
  public void deleteWebhook(DeleteWebhookRequest request) {
    impl.deleteWebhook(request);
  }

  /**
   * <p>getLatestVersions.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<ModelVersion> getLatestVersions(String name) {
    return getLatestVersions(new GetLatestVersionsRequest().setName(name));
  }

  /**
   * Get the latest version.
   *
   * <p>Gets the latest version of a registered model.
   *
   * @param request a {@link com.databricks.sdk.service.ml.GetLatestVersionsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<ModelVersion> getLatestVersions(GetLatestVersionsRequest request) {
    return impl.getLatestVersions(request).getModelVersions();
  }

  /**
   * <p>getModel.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelResponse} object
   */
  public GetModelResponse getModel(String name) {
    return getModel(new GetModelRequest().setName(name));
  }

  /**
   * Get model.
   *
   * <p>Get the details of a model. This is a Databricks Workspace version of the [MLflow endpoint]
   * that also returns the model's Databricks Workspace ID and the permission level of the
   * requesting user on the model.
   *
   * <p>[MLflow endpoint]: https://www.mlflow.org/docs/latest/rest-api.html#get-registeredmodel
   *
   * @param request a {@link com.databricks.sdk.service.ml.GetModelRequest} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelResponse} object
   */
  public GetModelResponse getModel(GetModelRequest request) {
    return impl.getModel(request);
  }

  /**
   * <p>getModelVersion.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelVersionResponse} object
   */
  public GetModelVersionResponse getModelVersion(String name, String version) {
    return getModelVersion(new GetModelVersionRequest().setName(name).setVersion(version));
  }

  /**
   * Get a model version.
   *
   * <p>Get a model version.
   *
   * @param request a {@link com.databricks.sdk.service.ml.GetModelVersionRequest} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelVersionResponse} object
   */
  public GetModelVersionResponse getModelVersion(GetModelVersionRequest request) {
    return impl.getModelVersion(request);
  }

  /**
   * <p>getModelVersionDownloadUri.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelVersionDownloadUriResponse} object
   */
  public GetModelVersionDownloadUriResponse getModelVersionDownloadUri(
      String name, String version) {
    return getModelVersionDownloadUri(
        new GetModelVersionDownloadUriRequest().setName(name).setVersion(version));
  }

  /**
   * Get a model version URI.
   *
   * <p>Gets a URI to download the model version.
   *
   * @param request a {@link com.databricks.sdk.service.ml.GetModelVersionDownloadUriRequest} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelVersionDownloadUriResponse} object
   */
  public GetModelVersionDownloadUriResponse getModelVersionDownloadUri(
      GetModelVersionDownloadUriRequest request) {
    return impl.getModelVersionDownloadUri(request);
  }

  /**
   * List models.
   *
   * <p>Lists all available registered models, up to the limit specified in __max_results__.
   *
   * @param request a {@link com.databricks.sdk.service.ml.ListModelsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<Model> listModels(ListModelsRequest request) {
    return new Paginator<>(
        request,
        impl::listModels,
        ListModelsResponse::getRegisteredModels,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * <p>listTransitionRequests.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<Activity> listTransitionRequests(String name, String version) {
    return listTransitionRequests(
        new ListTransitionRequestsRequest().setName(name).setVersion(version));
  }

  /**
   * List transition requests.
   *
   * <p>Gets a list of all open stage transition requests for the model version.
   *
   * @param request a {@link com.databricks.sdk.service.ml.ListTransitionRequestsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<Activity> listTransitionRequests(ListTransitionRequestsRequest request) {
    return impl.listTransitionRequests(request).getRequests();
  }

  /**
   * List registry webhooks.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Lists all registry webhooks.
   *
   * @param request a {@link com.databricks.sdk.service.ml.ListWebhooksRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<RegistryWebhook> listWebhooks(ListWebhooksRequest request) {
    return new Paginator<>(
        request,
        impl::listWebhooks,
        ListRegistryWebhooks::getWebhooks,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * <p>rejectTransitionRequest.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   * @param stage a {@link com.databricks.sdk.service.ml.Stage} object
   * @return a {@link com.databricks.sdk.service.ml.RejectTransitionRequestResponse} object
   */
  public RejectTransitionRequestResponse rejectTransitionRequest(
      String name, String version, Stage stage) {
    return rejectTransitionRequest(
        new RejectTransitionRequest().setName(name).setVersion(version).setStage(stage));
  }

  /**
   * Reject a transition request.
   *
   * <p>Rejects a model version stage transition request.
   *
   * @param request a {@link com.databricks.sdk.service.ml.RejectTransitionRequest} object
   * @return a {@link com.databricks.sdk.service.ml.RejectTransitionRequestResponse} object
   */
  public RejectTransitionRequestResponse rejectTransitionRequest(RejectTransitionRequest request) {
    return impl.rejectTransitionRequest(request);
  }

  /**
   * <p>renameModel.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.RenameModelResponse} object
   */
  public RenameModelResponse renameModel(String name) {
    return renameModel(new RenameModelRequest().setName(name));
  }

  /**
   * Rename a model.
   *
   * <p>Renames a registered model.
   *
   * @param request a {@link com.databricks.sdk.service.ml.RenameModelRequest} object
   * @return a {@link com.databricks.sdk.service.ml.RenameModelResponse} object
   */
  public RenameModelResponse renameModel(RenameModelRequest request) {
    return impl.renameModel(request);
  }

  /**
   * Searches model versions.
   *
   * <p>Searches for specific model versions based on the supplied __filter__.
   *
   * @param request a {@link com.databricks.sdk.service.ml.SearchModelVersionsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<ModelVersion> searchModelVersions(SearchModelVersionsRequest request) {
    return new Paginator<>(
        request,
        impl::searchModelVersions,
        SearchModelVersionsResponse::getModelVersions,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Search models.
   *
   * <p>Search for registered models based on the specified __filter__.
   *
   * @param request a {@link com.databricks.sdk.service.ml.SearchModelsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<Model> searchModels(SearchModelsRequest request) {
    return new Paginator<>(
        request,
        impl::searchModels,
        SearchModelsResponse::getRegisteredModels,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * <p>setModelTag.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param key a {@link java.lang.String} object
   * @param value a {@link java.lang.String} object
   */
  public void setModelTag(String name, String key, String value) {
    setModelTag(new SetModelTagRequest().setName(name).setKey(key).setValue(value));
  }

  /**
   * Set a tag.
   *
   * <p>Sets a tag on a registered model.
   *
   * @param request a {@link com.databricks.sdk.service.ml.SetModelTagRequest} object
   */
  public void setModelTag(SetModelTagRequest request) {
    impl.setModelTag(request);
  }

  /**
   * <p>setModelVersionTag.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   * @param key a {@link java.lang.String} object
   * @param value a {@link java.lang.String} object
   */
  public void setModelVersionTag(String name, String version, String key, String value) {
    setModelVersionTag(
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
   *
   * @param request a {@link com.databricks.sdk.service.ml.SetModelVersionTagRequest} object
   */
  public void setModelVersionTag(SetModelVersionTagRequest request) {
    impl.setModelVersionTag(request);
  }

  /**
   * <p>testRegistryWebhook.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.TestRegistryWebhookResponse} object
   */
  public TestRegistryWebhookResponse testRegistryWebhook(String id) {
    return testRegistryWebhook(new TestRegistryWebhookRequest().setId(id));
  }

  /**
   * Test a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Tests a registry webhook.
   *
   * @param request a {@link com.databricks.sdk.service.ml.TestRegistryWebhookRequest} object
   * @return a {@link com.databricks.sdk.service.ml.TestRegistryWebhookResponse} object
   */
  public TestRegistryWebhookResponse testRegistryWebhook(TestRegistryWebhookRequest request) {
    return impl.testRegistryWebhook(request);
  }

  /**
   * <p>transitionStage.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   * @param stage a {@link com.databricks.sdk.service.ml.Stage} object
   * @param archiveExistingVersions a boolean
   * @return a {@link com.databricks.sdk.service.ml.TransitionStageResponse} object
   */
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
   * Transition a stage.
   *
   * <p>Transition a model version's stage. This is a Databricks Workspace version of the [MLflow
   * endpoint] that also accepts a comment associated with the transition to be recorded.",
   *
   * <p>[MLflow endpoint]:
   * https://www.mlflow.org/docs/latest/rest-api.html#transition-modelversion-stage
   *
   * @param request a {@link com.databricks.sdk.service.ml.TransitionModelVersionStageDatabricks} object
   * @return a {@link com.databricks.sdk.service.ml.TransitionStageResponse} object
   */
  public TransitionStageResponse transitionStage(TransitionModelVersionStageDatabricks request) {
    return impl.transitionStage(request);
  }

  /**
   * <p>updateComment.</p>
   *
   * @param id a {@link java.lang.String} object
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateCommentResponse} object
   */
  public UpdateCommentResponse updateComment(String id, String comment) {
    return updateComment(new UpdateComment().setId(id).setComment(comment));
  }

  /**
   * Update a comment.
   *
   * <p>Post an edit to a comment on a model version.
   *
   * @param request a {@link com.databricks.sdk.service.ml.UpdateComment} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateCommentResponse} object
   */
  public UpdateCommentResponse updateComment(UpdateComment request) {
    return impl.updateComment(request);
  }

  /**
   * <p>updateModel.</p>
   *
   * @param name a {@link java.lang.String} object
   */
  public void updateModel(String name) {
    updateModel(new UpdateModelRequest().setName(name));
  }

  /**
   * Update model.
   *
   * <p>Updates a registered model.
   *
   * @param request a {@link com.databricks.sdk.service.ml.UpdateModelRequest} object
   */
  public void updateModel(UpdateModelRequest request) {
    impl.updateModel(request);
  }

  /**
   * <p>updateModelVersion.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param version a {@link java.lang.String} object
   */
  public void updateModelVersion(String name, String version) {
    updateModelVersion(new UpdateModelVersionRequest().setName(name).setVersion(version));
  }

  /**
   * Update model version.
   *
   * <p>Updates the model version.
   *
   * @param request a {@link com.databricks.sdk.service.ml.UpdateModelVersionRequest} object
   */
  public void updateModelVersion(UpdateModelVersionRequest request) {
    impl.updateModelVersion(request);
  }

  /**
   * <p>updateWebhook.</p>
   *
   * @param id a {@link java.lang.String} object
   */
  public void updateWebhook(String id) {
    updateWebhook(new UpdateRegistryWebhook().setId(id));
  }

  /**
   * Update a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Updates a registry webhook.
   *
   * @param request a {@link com.databricks.sdk.service.ml.UpdateRegistryWebhook} object
   */
  public void updateWebhook(UpdateRegistryWebhook request) {
    impl.updateWebhook(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.ModelRegistryService} object
   */
  public ModelRegistryService impl() {
    return impl;
  }
}
