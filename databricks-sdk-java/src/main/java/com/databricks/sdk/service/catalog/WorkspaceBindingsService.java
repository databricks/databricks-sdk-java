// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * A securable in Databricks can be configured as <b>OPEN</b> or <b>ISOLATED</b>. An <b>OPEN</b>
 * securable can be accessed from any workspace, while an <b>ISOLATED</b> securable can only be
 * accessed from a configured list of workspaces. This API allows you to configure (bind) securables
 * to workspaces.
 *
 * <p>NOTE: The <b>isolation_mode</b> is configured for the securable itself (using its Update
 * method) and the workspace bindings are only consulted when the securable's <b>isolation_mode</b>
 * is set to <b>ISOLATED</b>.
 *
 * <p>A securable's workspace bindings can be configured by a metastore admin or the owner of the
 * securable.
 *
 * <p>The original path (/api/2.1/unity-catalog/workspace-bindings/catalogs/{name}) is deprecated.
 * Please use the new path (/api/2.1/unity-catalog/bindings/{securable_type}/{securable_name}) which
 * introduces the ability to bind a securable in READ_ONLY mode (catalogs only).
 *
 * <p>Securable types that support binding:
 *
 * <ul>
 *   <li>catalog
 *   <li>storage_credential
 *   <li>credential
 *   <li>external_location
 * </ul>
 *
 * This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface WorkspaceBindingsService {
  /**
   * Gets workspace bindings of the catalog. The caller must be a metastore admin or an owner of the
   * catalog.
   */
  GetCatalogWorkspaceBindingsResponse get(GetWorkspaceBindingRequest getWorkspaceBindingRequest);

  /**
   * Gets workspace bindings of the securable. The caller must be a metastore admin or an owner of
   * the securable.
   *
   * <p>NOTE: we recommend using max_results=0 to use the paginated version of this API. Unpaginated
   * calls will be deprecated soon.
   *
   * <p>PAGINATION BEHAVIOR: When using pagination (max_results &gt;= 0), a page may contain zero
   * results while still providing a next_page_token. Clients must continue reading pages until
   * next_page_token is absent, which is the only indication that the end of results has been
   * reached.
   */
  GetWorkspaceBindingsResponse getBindings(GetBindingsRequest getBindingsRequest);

  /**
   * Updates workspace bindings of the catalog. The caller must be a metastore admin or an owner of
   * the catalog.
   */
  UpdateCatalogWorkspaceBindingsResponse update(UpdateWorkspaceBindings updateWorkspaceBindings);

  /**
   * Updates workspace bindings of the securable. The caller must be a metastore admin or an owner
   * of the securable.
   */
  UpdateWorkspaceBindingsResponse updateBindings(
      UpdateWorkspaceBindingsParameters updateWorkspaceBindingsParameters);
}
