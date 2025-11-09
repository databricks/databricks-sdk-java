// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
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
 * <p>Securable types that support binding: - catalog - storage_credential - credential -
 * external_location
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

  public GetCatalogWorkspaceBindingsResponse get(String name) {
    return get(new GetWorkspaceBindingRequest().setName(name));
  }

  /**
   * Gets workspace bindings of the catalog. The caller must be a metastore admin or an owner of the
   * catalog.
   */
  public GetCatalogWorkspaceBindingsResponse get(GetWorkspaceBindingRequest request) {
    return impl.get(request);
  }

  public Iterable<WorkspaceBinding> getBindings(String securableType, String securableName) {
    return getBindings(
        new GetBindingsRequest().setSecurableType(securableType).setSecurableName(securableName));
  }

  /**
   * Gets workspace bindings of the securable. The caller must be a metastore admin or an owner of
   * the securable.
   *
   * <p>NOTE: we recommend using max_results=0 to use the paginated version of this API. Unpaginated
   * calls will be deprecated soon.
   *
   * <p>PAGINATION BEHAVIOR: When using pagination (max_results >= 0), a page may contain zero
   * results while still providing a next_page_token. Clients must continue reading pages until
   * next_page_token is absent, which is the only indication that the end of results has been
   * reached.
   */
  public Iterable<WorkspaceBinding> getBindings(GetBindingsRequest request) {
    return new Paginator<>(
        request,
        impl::getBindings,
        GetWorkspaceBindingsResponse::getBindings,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Updates workspace bindings of the catalog. The caller must be a metastore admin or an owner of
   * the catalog.
   */
  public UpdateCatalogWorkspaceBindingsResponse update(UpdateWorkspaceBindings request) {
    return impl.update(request);
  }

  /**
   * Updates workspace bindings of the securable. The caller must be a metastore admin or an owner
   * of the securable.
   */
  public UpdateWorkspaceBindingsResponse updateBindings(UpdateWorkspaceBindingsParameters request) {
    return impl.updateBindings(request);
  }

  public WorkspaceBindingsService impl() {
    return impl;
  }
}
