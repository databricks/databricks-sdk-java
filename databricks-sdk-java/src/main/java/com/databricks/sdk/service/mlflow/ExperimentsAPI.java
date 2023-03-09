// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


public class ExperimentsAPI implements ExperimentsService {
    private final ApiClient apiClient;

    public ExperimentsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create experiment.
     * 
     * Creates an experiment with a name. Returns the ID of the newly created
     * experiment. Validates that another experiment with the same name does not
     * already exist and fails if another experiment with the same name already
     * exists.
     * 
     * Throws `RESOURCE_ALREADY_EXISTS` if a experiment with the given name
     * exists.
     */
    @Override
    public CreateExperimentResponse create(CreateExperiment request) {
        String path = "/api/2.0/mlflow/experiments/create";
        return apiClient.POST(path, request, CreateExperimentResponse.class);
    }
    
	/**
     * Delete an experiment.
     * 
     * Marks an experiment and associated metadata, runs, metrics, params, and
     * tags for deletion. If the experiment uses FileStore, artifacts associated
     * with experiment are also deleted.
     */
    @Override
    public void delete(DeleteExperiment request) {
        String path = "/api/2.0/mlflow/experiments/delete";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Get an experiment.
     * 
     * Gets metadata for an experiment. This method works on deleted
     * experiments.
     */
    @Override
    public Experiment get(GetExperimentRequest request) {
        String path = "/api/2.0/mlflow/experiments/get";
        return apiClient.GET(path, request, Experiment.class);
    }
    
	/**
     * Get metadata.
     * 
     * "Gets metadata for an experiment.
     * 
     * This endpoint will return deleted experiments, but prefers the active
     * experiment if an active and deleted experiment share the same name. If
     * multiple deleted experiments share the same name, the API will return one
     * of them.
     * 
     * Throws `RESOURCE_DOES_NOT_EXIST` if no experiment with the specified name
     * exists.S
     */
    @Override
    public GetExperimentByNameResponse getByName(GetByNameRequest request) {
        String path = "/api/2.0/mlflow/experiments/get-by-name";
        return apiClient.GET(path, request, GetExperimentByNameResponse.class);
    }
    
	/**
     * List experiments.
     * 
     * Gets a list of all experiments.
     */
    @Override
    public ListExperimentsResponse list(ListExperimentsRequest request) {
        String path = "/api/2.0/mlflow/experiments/list";
        return apiClient.GET(path, request, ListExperimentsResponse.class);
    }
    
	/**
     * Restores an experiment.
     * 
     * "Restore an experiment marked for deletion. This also restores associated
     * metadata, runs, metrics, params, and tags. If experiment uses FileStore,
     * underlying artifacts associated with experiment are also restored.
     * 
     * Throws `RESOURCE_DOES_NOT_EXIST` if experiment was never created or was
     * permanently deleted.",
     */
    @Override
    public void restore(RestoreExperiment request) {
        String path = "/api/2.0/mlflow/experiments/restore";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Search experiments.
     * 
     * Searches for experiments that satisfy specified search criteria.
     */
    @Override
    public SearchExperimentsResponse search(SearchExperiments request) {
        String path = "/api/2.0/mlflow/experiments/search";
        return apiClient.POST(path, request, SearchExperimentsResponse.class);
    }
    
	/**
     * Set a tag.
     * 
     * Sets a tag on an experiment. Experiment tags are metadata that can be
     * updated.
     */
    @Override
    public void setExperimentTag(SetExperimentTag request) {
        String path = "/api/2.0/mlflow/experiments/set-experiment-tag";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Update an experiment.
     * 
     * Updates experiment metadata.
     */
    @Override
    public void update(UpdateExperiment request) {
        String path = "/api/2.0/mlflow/experiments/update";
        apiClient.POST(path, request, Void.class);
    }
    
}