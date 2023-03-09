// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.util.List;
import java.util.Map;

/**
 
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
public interface ExperimentsService {
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
    CreateExperimentResponse create(CreateExperiment createExperiment);
    
	/**
     * Delete an experiment.
     * 
     * Marks an experiment and associated metadata, runs, metrics, params, and
     * tags for deletion. If the experiment uses FileStore, artifacts associated
     * with experiment are also deleted.
     */
    void delete(DeleteExperiment deleteExperiment);
    
	/**
     * Get an experiment.
     * 
     * Gets metadata for an experiment. This method works on deleted
     * experiments.
     */
    Experiment get(GetExperimentRequest getExperimentRequest);
    
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
    GetExperimentByNameResponse getByName(GetByNameRequest getByNameRequest);
    
	/**
     * List experiments.
     * 
     * Gets a list of all experiments.
     */
    ListExperimentsResponse list(ListExperimentsRequest listExperimentsRequest);
    
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
    void restore(RestoreExperiment restoreExperiment);
    
	/**
     * Search experiments.
     * 
     * Searches for experiments that satisfy specified search criteria.
     */
    SearchExperimentsResponse search(SearchExperiments searchExperiments);
    
	/**
     * Set a tag.
     * 
     * Sets a tag on an experiment. Experiment tags are metadata that can be
     * updated.
     */
    void setExperimentTag(SetExperimentTag setExperimentTag);
    
	/**
     * Update an experiment.
     * 
     * Updates experiment metadata.
     */
    void update(UpdateExperiment updateExperiment);
    
}