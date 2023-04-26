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
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class WorkspaceAPI {
  private static final Logger LOG = LoggerFactory.getLogger(WorkspaceAPI.class);

  private final WorkspaceService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public WorkspaceAPI(ApiClient apiClient) {
    impl = new WorkspaceImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.workspace.WorkspaceService} object
   */
  public WorkspaceAPI(WorkspaceService mock) {
    impl = mock;
  }

  /**
   * <p>delete.</p>
   *
   * @param path a {@link java.lang.String} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.workspace.Delete} object
   */
  public void delete(Delete request) {
    impl.delete(request);
  }

  /**
   * <p>export.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.ExportResponse} object
   */
  public ExportResponse export(String path) {
    return export(new ExportRequest().setPath(path));
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
   *
   * @param request a {@link com.databricks.sdk.service.workspace.ExportRequest} object
   * @return a {@link com.databricks.sdk.service.workspace.ExportResponse} object
   */
  public ExportResponse export(ExportRequest request) {
    return impl.export(request);
  }

  /**
   * <p>getStatus.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.ObjectInfo} object
   */
  public ObjectInfo getStatus(String path) {
    return getStatus(new GetStatusRequest().setPath(path));
  }

  /**
   * Get status.
   *
   * <p>Gets the status of an object or a directory. If `path` does not exist, this call returns an
   * error `RESOURCE_DOES_NOT_EXIST`.
   *
   * @param request a {@link com.databricks.sdk.service.workspace.GetStatusRequest} object
   * @return a {@link com.databricks.sdk.service.workspace.ObjectInfo} object
   */
  public ObjectInfo getStatus(GetStatusRequest request) {
    return impl.getStatus(request);
  }

  /**
   * <p>importContent.</p>
   *
   * @param path a {@link java.lang.String} object
   */
  public void importContent(String path) {
    importContent(new Import().setPath(path));
  }

  /**
   * Import a workspace object.
   *
   * <p>Imports a workspace object (for example, a notebook or file) or the contents of an entire
   * directory. If `path` already exists and `overwrite` is set to `false`, this call returns an
   * error `RESOURCE_ALREADY_EXISTS`. One can only use `DBC` format to import a directory.
   *
   * @param request a {@link com.databricks.sdk.service.workspace.Import} object
   */
  public void importContent(Import request) {
    impl.importContent(request);
  }

  /**
   * <p>list.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<ObjectInfo> list(String path) {
    return list(new ListWorkspaceRequest().setPath(path));
  }

  /**
   * List contents.
   *
   * <p>Lists the contents of a directory, or the object if it is not a directory.If the input path
   * does not exist, this call returns an error `RESOURCE_DOES_NOT_EXIST`.
   *
   * @param request a {@link com.databricks.sdk.service.workspace.ListWorkspaceRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<ObjectInfo> list(ListWorkspaceRequest request) {
    return impl.list(request).getObjects();
  }

  /**
   * <p>mkdirs.</p>
   *
   * @param path a {@link java.lang.String} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.workspace.Mkdirs} object
   */
  public void mkdirs(Mkdirs request) {
    impl.mkdirs(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.workspace.WorkspaceService} object
   */
  public WorkspaceService impl() {
    return impl;
  }
}
