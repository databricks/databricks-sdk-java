// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * A catalog in Databricks can be configured as __OPEN__ or __ISOLATED__. An __OPEN__ catalog can be
 * accessed from any workspace, while an __ISOLATED__ catalog can only be access from a configured
 * list of workspaces.
 *
 * <p>A catalog's workspace bindings can be configured by a metastore admin or the owner of the
 * catalog.
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
   * Update catalog workspace bindings.
   *
   * <p>Updates workspace bindings of the catalog. The caller must be a metastore admin or an owner
   * of the catalog.
   */
  CurrentWorkspaceBindings update(UpdateWorkspaceBindings updateWorkspaceBindings);
}
