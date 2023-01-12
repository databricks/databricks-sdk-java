// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface ModelVersionCommentsService {
	/**
     * Post a comment.
     * 
     * Posts a comment on a model version. A comment can be submitted either by
     * a user or programmatically to display relevant information about the
     * model. For example, test results or deployment errors.
     */
    CreateResponse create(CreateComment createComment);
    
	/**
     * Delete a comment.
     * 
     * Deletes a comment on a model version.
     */
    void delete(DeleteModelVersionCommentRequest deleteModelVersionCommentRequest);
    
	/**
     * Update a comment.
     * 
     * Post an edit to a comment on a model version.
     */
    UpdateResponse update(UpdateComment updateComment);
    
}