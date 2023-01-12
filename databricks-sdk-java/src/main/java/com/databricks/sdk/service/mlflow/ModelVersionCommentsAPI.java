// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;


@Generated("databricks-sdk-generator")
public class ModelVersionCommentsAPI implements ModelVersionCommentsService {
    private final ApiClient apiClient;

    public ModelVersionCommentsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Post a comment.
     * 
     * Posts a comment on a model version. A comment can be submitted either by
     * a user or programmatically to display relevant information about the
     * model. For example, test results or deployment errors.
     */
    @Override
    public CreateResponse create(CreateComment request) {
        String path = "/api/2.0/mlflow/comments/create";
        return apiClient.POST(path, request, CreateResponse.class);
    }
    
	/**
     * Delete a comment.
     * 
     * Deletes a comment on a model version.
     */
    @Override
    public void delete(DeleteModelVersionCommentRequest request) {
        String path = "/api/2.0/mlflow/comments/delete";
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Update a comment.
     * 
     * Post an edit to a comment on a model version.
     */
    @Override
    public UpdateResponse update(UpdateComment request) {
        String path = "/api/2.0/mlflow/comments/update";
        return apiClient.POST(path, request, UpdateResponse.class);
    }
    
}