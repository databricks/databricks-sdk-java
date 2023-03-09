// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * The Workspace API allows you to list, import, export, and delete notebooks
 * and folders.
 * 
 * A notebook is a web-based interface to a document that contains runnable
 * code, visualizations, and explanatory text.
 */
public class WorkspaceAPI implements WorkspaceService {
    private final ApiClient apiClient;

    public WorkspaceAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Delete a workspace object.
     * 
     * Deletes an object or a directory (and optionally recursively deletes all
     * objects in the directory). * If `path` does not exist, this call returns
     * an error `RESOURCE_DOES_NOT_EXIST`. * If `path` is a non-empty directory
     * and `recursive` is set to `false`, this call returns an error
     * `DIRECTORY_NOT_EMPTY`.
     * 
     * Object deletion cannot be undone and deleting a directory recursively is
     * not atomic.
     */
    @Override
    public void delete(Delete request) {
        String path = "/api/2.0/workspace/delete";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Export a notebook.
     * 
     * Exports a notebook or the contents of an entire directory.
     * 
     * If `path` does not exist, this call returns an error
     * `RESOURCE_DOES_NOT_EXIST`.
     * 
     * One can only export a directory in `DBC` format. If the exported data
     * would exceed size limit, this call returns `MAX_NOTEBOOK_SIZE_EXCEEDED`.
     * Currently, this API does not support exporting a library.
     */
    @Override
    public ExportResponse export(Export request) {
        String path = "/api/2.0/workspace/export";
        return apiClient.GET(path, request, ExportResponse.class);
    }
    
	/**
     * Get status.
     * 
     * Gets the status of an object or a directory. If `path` does not exist,
     * this call returns an error `RESOURCE_DOES_NOT_EXIST`.
     */
    @Override
    public ObjectInfo getStatus(GetStatus request) {
        String path = "/api/2.0/workspace/get-status";
        return apiClient.GET(path, request, ObjectInfo.class);
    }
    
	/**
     * Import a notebook.
     * 
     * Imports a notebook or the contents of an entire directory. If `path`
     * already exists and `overwrite` is set to `false`, this call returns an
     * error `RESOURCE_ALREADY_EXISTS`. One can only use `DBC` format to import
     * a directory.
     */
    @Override
    public void importContent(Import request) {
        String path = "/api/2.0/workspace/import";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * List contents.
     * 
     * Lists the contents of a directory, or the object if it is not a
     * directory.If the input path does not exist, this call returns an error
     * `RESOURCE_DOES_NOT_EXIST`.
     */
    @Override
    public ListResponse list(List request) {
        String path = "/api/2.0/workspace/list";
        return apiClient.GET(path, request, ListResponse.class);
    }
    
	/**
     * Create a directory.
     * 
     * Creates the specified directory (and necessary parent directories if they
     * do not exist). If there is an object (not a directory) at any prefix of
     * the input path, this call returns an error `RESOURCE_ALREADY_EXISTS`.
     * 
     * Note that if this operation fails it may have succeeded in creating some
     * of the necessary parrent directories.
     */
    @Override
    public void mkdirs(Mkdirs request) {
        String path = "/api/2.0/workspace/mkdirs";
        apiClient.POST(path, request, Void.class);
    }
    
}