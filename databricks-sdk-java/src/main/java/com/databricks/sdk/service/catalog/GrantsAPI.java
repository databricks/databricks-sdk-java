// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * In Unity Catalog, data is secure by default. Initially, users have no access to data in a
 * metastore. Access can be granted by either a metastore admin, the owner of an object, or the
 * owner of the catalog or schema that contains the object. Securable objects in Unity Catalog are
 * hierarchical and privileges are inherited downward.
 *
 * <p>This means that granting a privilege on the catalog automatically grants the privilege to all
 * current and future objects within the catalog. Similarly, privileges granted on a schema are
 * inherited by all current and future objects within that schema.
 */
@Generated
public class GrantsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(GrantsAPI.class);

  private final GrantsService impl;

  /** Regular-use constructor */
  public GrantsAPI(ApiClient apiClient) {
    impl = new GrantsImpl(apiClient);
  }

  /** Constructor for mocks */
  public GrantsAPI(GrantsService mock) {
    impl = mock;
  }

  public GetPermissionsResponse get(String securableType, String fullName) {
    return get(new GetGrantRequest().setSecurableType(securableType).setFullName(fullName));
  }

  /**
   * Gets the permissions for a securable. Does not include inherited permissions.
   *
   * <p>NOTE: we recommend using max_results=0 to use the paginated version of this API. Unpaginated
   * calls will be deprecated soon.
   *
   * <p>PAGINATION BEHAVIOR: When using pagination (max_results >= 0), a page may contain zero
   * results while still providing a next_page_token. Clients must continue reading pages until
   * next_page_token is absent, which is the only indication that the end of results has been
   * reached.
   */
  public GetPermissionsResponse get(GetGrantRequest request) {
    return impl.get(request);
  }

  public EffectivePermissionsList getEffective(String securableType, String fullName) {
    return getEffective(
        new GetEffectiveRequest().setSecurableType(securableType).setFullName(fullName));
  }

  /**
   * Gets the effective permissions for a securable. Includes inherited permissions from any parent
   * securables.
   *
   * <p>NOTE: we recommend using max_results=0 to use the paginated version of this API. Unpaginated
   * calls will be deprecated soon.
   *
   * <p>PAGINATION BEHAVIOR: When using pagination (max_results >= 0), a page may contain zero
   * results while still providing a next_page_token. Clients must continue reading pages until
   * next_page_token is absent, which is the only indication that the end of results has been
   * reached.
   */
  public EffectivePermissionsList getEffective(GetEffectiveRequest request) {
    return impl.getEffective(request);
  }

  public Iterable<PrivilegeAssignment> list(String securableType, String fullName) {
    return list(
        new ListPrivilegeAssignmentsRequest()
            .setSecurableType(securableType)
            .setFullName(fullName));
  }

  /**
   * Lists the privilege assignments for a securable. Does not include inherited privileges.
   * Paginated version of Get Permissions API.
   */
  public Iterable<PrivilegeAssignment> list(ListPrivilegeAssignmentsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::list,
        ListPrivilegeAssignmentsResponse::getPrivilegeAssignments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<EffectivePrivilegeAssignment> listEffective(
      String securableType, String fullName) {
    return listEffective(
        new ListEffectivePrivilegeAssignmentsRequest()
            .setSecurableType(securableType)
            .setFullName(fullName));
  }

  /**
   * Lists the effective privilege assignments for a securable. Includes inherited privileges.
   * Paginated version of Get Effective Permissions API.
   */
  public Iterable<EffectivePrivilegeAssignment> listEffective(
      ListEffectivePrivilegeAssignmentsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listEffective,
        ListEffectivePrivilegeAssignmentsResponse::getEffectivePrivilegeAssignments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Updates the permissions for a securable. */
  public UpdatePermissionsResponse update(UpdatePermissions request) {
    return impl.update(request);
  }

  public GrantsService impl() {
    return impl;
  }
}
