// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A catalog in Databricks can be configured as __OPEN__ or __ISOLATED__. An __OPEN__ catalog can be
 * accessed from any workspace, while an __ISOLATED__ catalog can only be access from a configured
 * list of workspaces.
 *
 * <p>A catalog's workspace bindings can be configured by a metastore admin or the owner of the
 * catalog.
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

  public WorkspaceBindingsService impl() {
    return impl;
  }
}
