// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * The Workspace API allows you to list, import, export, and delete notebooks
 * and folders.
 * 
 * A notebook is a web-based interface to a document that contains runnable
 * code, visualizations, and explanatory text.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface WorkspaceService {
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
    void delete(Delete delete);
    
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
    ExportResponse export(Export export);
    
	/**
     * Get status.
     * 
     * Gets the status of an object or a directory. If `path` does not exist,
     * this call returns an error `RESOURCE_DOES_NOT_EXIST`.
     */
    ObjectInfo getStatus(GetStatus getStatus);
    
	/**
     * Import a notebook.
     * 
     * Imports a notebook or the contents of an entire directory. If `path`
     * already exists and `overwrite` is set to `false`, this call returns an
     * error `RESOURCE_ALREADY_EXISTS`. One can only use `DBC` format to import
     * a directory.
     */
    void importContent(Import importContent);
    
	/**
     * List contents.
     * 
     * Lists the contents of a directory, or the object if it is not a
     * directory.If the input path does not exist, this call returns an error
     * `RESOURCE_DOES_NOT_EXIST`.
     */
    ListResponse list(List list);
    
	/**
     * Create a directory.
     * 
     * Creates the specified directory (and necessary parent directories if they
     * do not exist). If there is an object (not a directory) at any prefix of
     * the input path, this call returns an error `RESOURCE_ALREADY_EXISTS`.
     * 
     * Note that if this operation fails it may have succeeded in creating some
     * of the necessary\nparrent directories.
     */
    void mkdirs(Mkdirs mkdirs);
    
}