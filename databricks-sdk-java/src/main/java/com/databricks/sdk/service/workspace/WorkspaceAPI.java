// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Workspace API allows you to list, import, export, and delete notebooks and folders.
 *
 * <p>A notebook is a web-based interface to a document that contains runnable code, visualizations,
 * and explanatory text.
 */
@Generated
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
    return export(new ExportRequest().setPath(path));
  }

  /**
   * Export a workspace object.
   *
   * <p>Exports an object or the contents of an entire directory.
   *
   * <p>If `path` does not exist, this call returns an error `RESOURCE_DOES_NOT_EXIST`.
   *
   * <p>If the exported data would exceed size limit, this call returns
   * `MAX_NOTEBOOK_SIZE_EXCEEDED`. Currently, this API does not support exporting a library.
   */
  public ExportResponse export(ExportRequest request) {
    return impl.export(request);
  }

  public GetWorkspaceObjectPermissionLevelsResponse getPermissionLevels(
      String workspaceObjectType, String workspaceObjectId) {
    return getPermissionLevels(
        new GetWorkspaceObjectPermissionLevelsRequest()
            .setWorkspaceObjectType(workspaceObjectType)
            .setWorkspaceObjectId(workspaceObjectId));
  }

  /**
   * Get workspace object permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  public GetWorkspaceObjectPermissionLevelsResponse getPermissionLevels(
      GetWorkspaceObjectPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  public WorkspaceObjectPermissions getPermissions(
      String workspaceObjectType, String workspaceObjectId) {
    return getPermissions(
        new GetWorkspaceObjectPermissionsRequest()
            .setWorkspaceObjectType(workspaceObjectType)
            .setWorkspaceObjectId(workspaceObjectId));
  }

  /**
   * Get workspace object permissions.
   *
   * <p>Gets the permissions of a workspace object. Workspace objects can inherit permissions from
   * their parent objects or root object.
   */
  public WorkspaceObjectPermissions getPermissions(GetWorkspaceObjectPermissionsRequest request) {
    return impl.getPermissions(request);
  }

  public ObjectInfo getStatus(String path) {
    return getStatus(new GetStatusRequest().setPath(path));
  }

  /**
   * Get status.
   *
   * <p>Gets the status of an object or a directory. If `path` does not exist, this call returns an
   * error `RESOURCE_DOES_NOT_EXIST`.
   */
  public ObjectInfo getStatus(GetStatusRequest request) {
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
   * error `RESOURCE_ALREADY_EXISTS`. To import a directory, you can use either the `DBC` format or
   * the `SOURCE` format with the `language` field unset. To import a single file as `SOURCE`, you
   * must set the `language` field.
   */
  public void importContent(Import request) {
    impl.importContent(request);
  }

  public Iterable<ObjectInfo> list(String path) {
    return list(new ListWorkspaceRequest().setPath(path));
  }

  /**
   * List contents.
   *
   * <p>Lists the contents of a directory, or the object if it is not a directory. If the input path
   * does not exist, this call returns an error `RESOURCE_DOES_NOT_EXIST`.
   */
  public Iterable<ObjectInfo> list(ListWorkspaceRequest request) {
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
   * parent directories.
   */
  public void mkdirs(Mkdirs request) {
    impl.mkdirs(request);
  }

  public WorkspaceObjectPermissions setPermissions(
      String workspaceObjectType, String workspaceObjectId) {
    return setPermissions(
        new WorkspaceObjectPermissionsRequest()
            .setWorkspaceObjectType(workspaceObjectType)
            .setWorkspaceObjectId(workspaceObjectId));
  }

  /**
   * Set workspace object permissions.
   *
   * <p>Sets permissions on a workspace object. Workspace objects can inherit permissions from their
   * parent objects or root object.
   */
  public WorkspaceObjectPermissions setPermissions(WorkspaceObjectPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  public WorkspaceObjectPermissions updatePermissions(
      String workspaceObjectType, String workspaceObjectId) {
    return updatePermissions(
        new WorkspaceObjectPermissionsRequest()
            .setWorkspaceObjectType(workspaceObjectType)
            .setWorkspaceObjectId(workspaceObjectId));
  }

  /**
   * Update workspace object permissions.
   *
   * <p>Updates the permissions on a workspace object. Workspace objects can inherit permissions
   * from their parent objects or root object.
   */
  public WorkspaceObjectPermissions updatePermissions(WorkspaceObjectPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public WorkspaceService impl() {
    return impl;
  }
}
