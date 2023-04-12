// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Paginator;
import org.apache.http.client.methods.*;

public class ExperimentsAPI {
  private final ExperimentsService impl;

  /** Regular-use constructor */
  public ExperimentsAPI(ApiClient apiClient) {
    impl = new ExperimentsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ExperimentsAPI(ExperimentsService mock) {
    impl = mock;
  }

  public CreateExperimentResponse create(String name) {
    return create(new CreateExperiment().setName(name));
  }

  /**
   * Create experiment.
   *
   * <p>Creates an experiment with a name. Returns the ID of the newly created experiment. Validates
   * that another experiment with the same name does not already exist and fails if another
   * experiment with the same name already exists.
   *
   * <p>Throws `RESOURCE_ALREADY_EXISTS` if a experiment with the given name exists.
   */
  public CreateExperimentResponse create(CreateExperiment request) {
    return impl.create(request);
  }

  public void delete(String experimentId) {
    delete(new DeleteExperiment().setExperimentId(experimentId));
  }

  /**
   * Delete an experiment.
   *
   * <p>Marks an experiment and associated metadata, runs, metrics, params, and tags for deletion.
   * If the experiment uses FileStore, artifacts associated with experiment are also deleted.
   */
  public void delete(DeleteExperiment request) {
    impl.delete(request);
  }

  public Experiment get(String experimentId) {
    return get(new GetExperimentRequest().setExperimentId(experimentId));
  }

  /**
   * Get an experiment.
   *
   * <p>Gets metadata for an experiment. This method works on deleted experiments.
   */
  public Experiment get(GetExperimentRequest request) {
    return impl.get(request);
  }

  public GetExperimentByNameResponse getByName(String experimentName) {
    return getByName(new GetByNameRequest().setExperimentName(experimentName));
  }

  /**
   * Get metadata.
   *
   * <p>"Gets metadata for an experiment.
   *
   * <p>This endpoint will return deleted experiments, but prefers the active experiment if an
   * active and deleted experiment share the same name. If multiple deleted experiments share the
   * same name, the API will return one of them.
   *
   * <p>Throws `RESOURCE_DOES_NOT_EXIST` if no experiment with the specified name exists.S
   */
  public GetExperimentByNameResponse getByName(GetByNameRequest request) {
    return impl.getByName(request);
  }

  /**
   * List experiments.
   *
   * <p>Gets a list of all experiments.
   */
  public Iterable<Experiment> list(ListExperimentsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListExperimentsResponse::getExperiments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public void restore(String experimentId) {
    restore(new RestoreExperiment().setExperimentId(experimentId));
  }

  /**
   * Restores an experiment.
   *
   * <p>"Restore an experiment marked for deletion. This also restores associated metadata, runs,
   * metrics, params, and tags. If experiment uses FileStore, underlying artifacts associated with
   * experiment are also restored.
   *
   * <p>Throws `RESOURCE_DOES_NOT_EXIST` if experiment was never created or was permanently
   * deleted.",
   */
  public void restore(RestoreExperiment request) {
    impl.restore(request);
  }

  /**
   * Search experiments.
   *
   * <p>Searches for experiments that satisfy specified search criteria.
   */
  public Iterable<Experiment> search(SearchExperiments request) {
    return new Paginator<>(
        request,
        impl::search,
        SearchExperimentsResponse::getExperiments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public void setExperimentTag(String experimentId, String key, String value) {
    setExperimentTag(
        new SetExperimentTag().setExperimentId(experimentId).setKey(key).setValue(value));
  }

  /**
   * Set a tag.
   *
   * <p>Sets a tag on an experiment. Experiment tags are metadata that can be updated.
   */
  public void setExperimentTag(SetExperimentTag request) {
    impl.setExperimentTag(request);
  }

  public void update(String experimentId) {
    update(new UpdateExperiment().setExperimentId(experimentId));
  }

  /**
   * Update an experiment.
   *
   * <p>Updates experiment metadata.
   */
  public void update(UpdateExperiment request) {
    impl.update(request);
  }

  public ExperimentsService impl() {
    return impl;
  }
}
