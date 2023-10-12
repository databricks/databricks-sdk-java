// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 * <p>Securables that support binding: - catalog
 */
@Generated
public class WorkspaceBindingsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(WorkspaceBindingsAPI.class);

  private final WorkspaceBindingsService impl;

  /** Regular-use constructor */
  public WorkspaceBindingsAPI(ApiClient apiClient) {
    impl = new WorkspaceBindingsImpl(apiClient);
  }

  /** Constructor for mocks */
  public WorkspaceBindingsAPI(WorkspaceBindingsService mock) {
    impl = mock;
  }

  public CurrentWorkspaceBindings get(String name) {
    return get(new GetWorkspaceBindingRequest().setName(name));
  }

  /**
   * Get catalog workspace bindings.
   *
   * <p>Gets workspace bindings of the catalog. The caller must be a metastore admin or an owner of
   * the catalog.
   */
  public CurrentWorkspaceBindings get(GetWorkspaceBindingRequest request) {
    return impl.get(request);
  }

  public WorkspaceBindingsResponse getBindings(String securableType, String securableName) {
    return getBindings(
        new GetBindingsRequest().setSecurableType(securableType).setSecurableName(securableName));
  }

  /**
   * Get securable workspace bindings.
   *
   * <p>Gets workspace bindings of the securable. The caller must be a metastore admin or an owner
   * of the securable.
   */
  public WorkspaceBindingsResponse getBindings(GetBindingsRequest request) {
    return impl.getBindings(request);
  }

  public CurrentWorkspaceBindings update(String name) {
    return update(new UpdateWorkspaceBindings().setName(name));
  }

  /**
   * Update catalog workspace bindings.
   *
   * <p>Updates workspace bindings of the catalog. The caller must be a metastore admin or an owner
   * of the catalog.
   */
  public CurrentWorkspaceBindings update(UpdateWorkspaceBindings request) {
    return impl.update(request);
  }

  public WorkspaceBindingsResponse updateBindings(String securableType, String securableName) {
    return updateBindings(
        new UpdateWorkspaceBindingsParameters()
            .setSecurableType(securableType)
            .setSecurableName(securableName));
  }

  /**
   * Update securable workspace bindings.
   *
   * <p>Updates workspace bindings of the securable. The caller must be a metastore admin or an
   * owner of the securable.
   */
  public WorkspaceBindingsResponse updateBindings(UpdateWorkspaceBindingsParameters request) {
    return impl.updateBindings(request);
  }

  public WorkspaceBindingsService impl() {
    return impl;
  }
}
