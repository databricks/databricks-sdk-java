// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * A securable in Databricks can be configured as __OPEN__ or __ISOLATED__. An __OPEN__ securable
 * can be accessed from any workspace, while an __ISOLATED__ securable can only be accessed from a
 * configured list of workspaces. This API allows you to configure (bind) securables to workspaces.
 *
 * <p>NOTE: The __isolation_mode__ is configured for the securable itself (using its Update method)
 * and the workspace bindings are only consulted when the securable's __isolation_mode__ is set to
 * __ISOLATED__.
 *
 * <p>A securable's workspace bindings can be configured by a metastore admin or the owner of the
 * securable.
 *
 * <p>The original path (/api/2.1/unity-catalog/workspace-bindings/catalogs/{name}) is deprecated.
 * Please use the new path (/api/2.1/unity-catalog/bindings/{securable_type}/{securable_name}) which
 * introduces the ability to bind a securable in READ_ONLY mode (catalogs only).
 *
 * <p>Securable types that support binding: - catalog - storage_credential - external_location
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface WorkspaceBindingsService {
  /**
   * Get catalog workspace bindings.
   *
   * <p>Gets workspace bindings of the catalog. The caller must be a metastore admin or an owner of
   * the catalog.
   */
  CurrentWorkspaceBindings get(GetWorkspaceBindingRequest getWorkspaceBindingRequest);

  /**
   * Get securable workspace bindings.
   *
   * <p>Gets workspace bindings of the securable. The caller must be a metastore admin or an owner
   * of the securable.
   */
  WorkspaceBindingsResponse getBindings(GetBindingsRequest getBindingsRequest);

  /**
   * Update catalog workspace bindings.
   *
   * <p>Updates workspace bindings of the catalog. The caller must be a metastore admin or an owner
   * of the catalog.
   */
  CurrentWorkspaceBindings update(UpdateWorkspaceBindings updateWorkspaceBindings);

  /**
   * Update securable workspace bindings.
   *
   * <p>Updates workspace bindings of the securable. The caller must be a metastore admin or an
   * owner of the securable.
   */
  WorkspaceBindingsResponse updateBindings(
      UpdateWorkspaceBindingsParameters updateWorkspaceBindingsParameters);
}
