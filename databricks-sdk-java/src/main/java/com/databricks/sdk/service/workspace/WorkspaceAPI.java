// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Workspace API allows you to list, import, export, and delete notebooks and folders.
 *
 * <p>A notebook is a web-based interface to a document that contains runnable code, visualizations,
 * and explanatory text.
 */
public class WorkspaceAPI {
  private static final Logger LOG = LoggerFactory.getLogger(WorkspaceAPI.class);

  private final WorkspaceService impl;

  /** Regular-use constructor */
  public WorkspaceAPI(ApiClient apiClient) {
    impl = new WorkspaceImpl(apiClient);
  }

  /** Constructor for mocks */
  public WorkspaceAPI(WorkspaceService mock) {
    impl = mock;
  }

  public void delete(String path) {
    delete(new Delete().setPath(path));
  }

  /**
   * Delete a workspace object.
   *
   * <p>Deletes an object or a directory (and optionally recursively deletes all objects in the
   * directory). * If `path` does not exist, this call returns an error `RESOURCE_DOES_NOT_EXIST`. *
   * If `path` is a non-empty directory and `recursive` is set to `false`, this call returns an
   * error `DIRECTORY_NOT_EMPTY`.
   *
   * <p>Object deletion cannot be undone and deleting a directory recursively is not atomic.
   */
  public void delete(Delete request) {
    impl.delete(request);
  }

  public ExportResponse export(String path) {
    return export(new Export().setPath(path));
  }

  /**
   * Export a workspace object.
   *
   * <p>Exports an object or the contents of an entire directory.
   *
   * <p>If `path` does not exist, this call returns an error `RESOURCE_DOES_NOT_EXIST`.
   *
   * <p>One can only export a directory in `DBC` format. If the exported data would exceed size
   * limit, this call returns `MAX_NOTEBOOK_SIZE_EXCEEDED`. Currently, this API does not support
   * exporting a library.
   */
  public ExportResponse export(Export request) {
    return impl.export(request);
  }

  public ObjectInfo getStatus(String path) {
    return getStatus(new GetStatus().setPath(path));
  }

  /**
   * Get status.
   *
   * <p>Gets the status of an object or a directory. If `path` does not exist, this call returns an
   * error `RESOURCE_DOES_NOT_EXIST`.
   */
  public ObjectInfo getStatus(GetStatus request) {
    return impl.getStatus(request);
  }

  public void importContent(String path) {
    importContent(new Import().setPath(path));
  }

  /**
   * Import a workspace object.
   *
   * <p>Imports a workspace object (for example, a notebook or file) or the contents of an entire
   * directory. If `path` already exists and `overwrite` is set to `false`, this call returns an
   * error `RESOURCE_ALREADY_EXISTS`. One can only use `DBC` format to import a directory.
   */
  public void importContent(Import request) {
    impl.importContent(request);
  }

  public Iterable<ObjectInfo> list(String path) {
    return list(new List().setPath(path));
  }

  /**
   * List contents.
   *
   * <p>Lists the contents of a directory, or the object if it is not a directory.If the input path
   * does not exist, this call returns an error `RESOURCE_DOES_NOT_EXIST`.
   */
  public Iterable<ObjectInfo> list(List request) {
    return impl.list(request).getObjects();
  }

  public void mkdirs(String path) {
    mkdirs(new Mkdirs().setPath(path));
  }

  /**
   * Create a directory.
   *
   * <p>Creates the specified directory (and necessary parent directories if they do not exist). If
   * there is an object (not a directory) at any prefix of the input path, this call returns an
   * error `RESOURCE_ALREADY_EXISTS`.
   *
   * <p>Note that if this operation fails it may have succeeded in creating some of the necessary
   * parrent directories.
   */
  public void mkdirs(Mkdirs request) {
    impl.mkdirs(request);
  }

  public WorkspaceService impl() {
    return impl;
  }
}
