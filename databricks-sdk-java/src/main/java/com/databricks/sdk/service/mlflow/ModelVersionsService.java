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
public interface ModelVersionsService {
	/**
     * Create a model version.
     * 
     * Creates a model version.
     */
    CreateModelVersionResponse create(CreateModelVersionRequest createModelVersionRequest);
    
	/**
     * Delete a model version.
     * 
     * Deletes a model version.
     */
    void delete(DeleteModelVersionRequest deleteModelVersionRequest);
    
	/**
     * Delete a model version tag.
     * 
     * Deletes a model version tag.
     */
    void deleteTag(DeleteModelVersionTagRequest deleteModelVersionTagRequest);
    
	/**
     * Get a model version.
     * 
     * Get a model version.
     */
    GetModelVersionResponse get(GetModelVersionRequest getModelVersionRequest);
    
	/**
     * Get a model version URI.
     * 
     * Gets a URI to download the model version.
     */
    GetModelVersionDownloadUriResponse getDownloadUri(GetModelVersionDownloadUriRequest getModelVersionDownloadUriRequest);
    
	/**
     * Searches model versions.
     * 
     * Searches for specific model versions based on the supplied __filter__.
     */
    SearchModelVersionsResponse search(SearchModelVersionsRequest searchModelVersionsRequest);
    
	/**
     * Set a version tag.
     * 
     * Sets a model version tag.
     */
    void setTag(SetModelVersionTagRequest setModelVersionTagRequest);
    
	/**
     * Transition a stage.
     * 
     * Transition to the next model stage.
     */
    TransitionModelVersionStageResponse transitionStage(TransitionModelVersionStage transitionModelVersionStage);
    
	/**
     * Update model version.
     * 
     * Updates the model version.
     */
    void update(UpdateModelVersionRequest updateModelVersionRequest);
    
}