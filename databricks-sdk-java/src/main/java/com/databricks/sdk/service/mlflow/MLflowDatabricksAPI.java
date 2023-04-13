// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These endpoints are modified versions of the MLflow API that accept additional input parameters
 * or return additional information.
 */
public class MLflowDatabricksAPI {
  private static final Logger LOG = LoggerFactory.getLogger(MLflowDatabricksAPI.class);

  private final MLflowDatabricksService impl;

  /** Regular-use constructor */
  public MLflowDatabricksAPI(ApiClient apiClient) {
    impl = new MLflowDatabricksImpl(apiClient);
  }

  /** Constructor for mocks */
  public MLflowDatabricksAPI(MLflowDatabricksService mock) {
    impl = mock;
  }

  public GetResponse get(String name) {
    return get(new GetMLflowDatabrickRequest().setName(name));
  }

  /**
   * Get model.
   *
   * <p>Get the details of a model. This is a Databricks Workspace version of the [MLflow endpoint]
   * that also returns the model's Databricks Workspace ID and the permission level of the
   * requesting user on the model.
   *
   * <p>[MLflow endpoint]: https://www.mlflow.org/docs/latest/rest-api.html#get-registeredmodel
   */
  public GetResponse get(GetMLflowDatabrickRequest request) {
    return impl.get(request);
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
   * Transition a stage.
   *
   * <p>Transition a model version's stage. This is a Databricks Workspace version of the [MLflow
   * endpoint] that also accepts a comment associated with the transition to be recorded.",
   *
   * <p>[MLflow endpoint]:
   * https://www.mlflow.org/docs/latest/rest-api.html#transition-modelversion-stage
   */
  public TransitionStageResponse transitionStage(TransitionModelVersionStageDatabricks request) {
    return impl.transitionStage(request);
  }

  public MLflowDatabricksService impl() {
    return impl;
  }
}
