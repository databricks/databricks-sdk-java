// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;

/**
 * The Workspace API allows you to list, import, export, and delete notebooks and folders.
 *
 * <p>A notebook is a web-based interface to a document that contains runnable code, visualizations,
 * and explanatory text.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface WorkspaceService {
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
  DeleteResponse delete(Delete delete);

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
  ExportResponse export(ExportRequest exportRequest);

  /**
   * Get workspace object permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  GetWorkspaceObjectPermissionLevelsResponse getPermissionLevels(
      GetWorkspaceObjectPermissionLevelsRequest getWorkspaceObjectPermissionLevelsRequest);

  /**
   * Get workspace object permissions.
   *
   * <p>Gets the permissions of a workspace object. Workspace objects can inherit permissions from
   * their parent objects or root object.
   */
  WorkspaceObjectPermissions getPermissions(
      GetWorkspaceObjectPermissionsRequest getWorkspaceObjectPermissionsRequest);

  /**
   * Get status.
   *
   * <p>Gets the status of an object or a directory. If `path` does not exist, this call returns an
   * error `RESOURCE_DOES_NOT_EXIST`.
   */
  ObjectInfo getStatus(GetStatusRequest getStatusRequest);

  /**
   * Import a workspace object.
   *
   * <p>Imports a workspace object (for example, a notebook or file) or the contents of an entire
   * directory. If `path` already exists and `overwrite` is set to `false`, this call returns an
   * error `RESOURCE_ALREADY_EXISTS`. To import a directory, you can use either the `DBC` format or
   * the `SOURCE` format with the `language` field unset. To import a single file as `SOURCE`, you
   * must set the `language` field.
   */
  ImportResponse importContent(Import importContent);

  /**
   * List contents.
   *
   * <p>Lists the contents of a directory, or the object if it is not a directory. If the input path
   * does not exist, this call returns an error `RESOURCE_DOES_NOT_EXIST`.
   */
  ListResponse list(ListWorkspaceRequest listWorkspaceRequest);

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
  MkdirsResponse mkdirs(Mkdirs mkdirs);

  /**
   * Set workspace object permissions.
   *
   * <p>Sets permissions on a workspace object. Workspace objects can inherit permissions from their
   * parent objects or root object.
   */
  WorkspaceObjectPermissions setPermissions(
      WorkspaceObjectPermissionsRequest workspaceObjectPermissionsRequest);

  /**
   * Update workspace object permissions.
   *
   * <p>Updates the permissions on a workspace object. Workspace objects can inherit permissions
   * from their parent objects or root object.
   */
  WorkspaceObjectPermissions updatePermissions(
      WorkspaceObjectPermissionsRequest workspaceObjectPermissionsRequest);
}
