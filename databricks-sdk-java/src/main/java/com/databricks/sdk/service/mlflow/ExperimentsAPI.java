// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


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
    public CreateExperimentResponse create(CreateExperiment request) {
        return impl.create(request);
    }
    
	/**
     * Delete an experiment.
     * 
     * Marks an experiment and associated metadata, runs, metrics, params, and
     * tags for deletion. If the experiment uses FileStore, artifacts associated
     * with experiment are also deleted.
     */
    public void delete(DeleteExperiment request) {
        impl.delete(request);
    }
    
	/**
     * Get an experiment.
     * 
     * Gets metadata for an experiment. This method works on deleted
     * experiments.
     */
    public Experiment get(GetExperimentRequest request) {
        return impl.get(request);
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
    public GetExperimentByNameResponse getByName(GetByNameRequest request) {
        return impl.getByName(request);
    }
    
	/**
     * List experiments.
     * 
     * Gets a list of all experiments.
     */
    public ListExperimentsResponse list(ListExperimentsRequest request) {
        return impl.list(request);
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
    public void restore(RestoreExperiment request) {
        impl.restore(request);
    }
    
	/**
     * Search experiments.
     * 
     * Searches for experiments that satisfy specified search criteria.
     */
    public SearchExperimentsResponse search(SearchExperiments request) {
        return impl.search(request);
    }
    
	/**
     * Set a tag.
     * 
     * Sets a tag on an experiment. Experiment tags are metadata that can be
     * updated.
     */
    public void setExperimentTag(SetExperimentTag request) {
        impl.setExperimentTag(request);
    }
    
	/**
     * Update an experiment.
     * 
     * Updates experiment metadata.
     */
    public void update(UpdateExperiment request) {
        impl.update(request);
    }
    
    public ExperimentsService impl() {
        return impl;
    }
}