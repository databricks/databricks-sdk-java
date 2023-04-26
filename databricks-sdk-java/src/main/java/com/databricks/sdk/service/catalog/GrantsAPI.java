// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * In Unity Catalog, data is secure by default. Initially, users have no access to data in a
 * metastore. Access can be granted by either a metastore admin, the owner of an object, or the
 * owner of the catalog or schema that contains the object. Securable objects in Unity Catalog are
 * hierarchical and privileges are inherited downward.
 *
 * <p>Securable objects in Unity Catalog are hierarchical and privileges are inherited downward.
 * This means that granting a privilege on the catalog automatically grants the privilege to all
 * current and future objects within the catalog. Similarly, privileges granted on a schema are
 * inherited by all current and future objects within that schema.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GrantsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(GrantsAPI.class);

  private final GrantsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public GrantsAPI(ApiClient apiClient) {
    impl = new GrantsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.catalog.GrantsService} object
   */
  public GrantsAPI(GrantsService mock) {
    impl = mock;
  }

  /**
   * <p>get.</p>
   *
   * @param securableType a {@link com.databricks.sdk.service.catalog.SecurableType} object
   * @param fullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.PermissionsList} object
   */
  public PermissionsList get(SecurableType securableType, String fullName) {
    return get(new GetGrantRequest().setSecurableType(securableType).setFullName(fullName));
  }

  /**
   * Get permissions.
   *
   * <p>Gets the permissions for a securable.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.GetGrantRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.PermissionsList} object
   */
  public PermissionsList get(GetGrantRequest request) {
    return impl.get(request);
  }

  /**
   * <p>getEffective.</p>
   *
   * @param securableType a {@link com.databricks.sdk.service.catalog.SecurableType} object
   * @param fullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.EffectivePermissionsList} object
   */
  public EffectivePermissionsList getEffective(SecurableType securableType, String fullName) {
    return getEffective(
        new GetEffectiveRequest().setSecurableType(securableType).setFullName(fullName));
  }

  /**
   * Get effective permissions.
   *
   * <p>Gets the effective permissions for a securable.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.GetEffectiveRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.EffectivePermissionsList} object
   */
  public EffectivePermissionsList getEffective(GetEffectiveRequest request) {
    return impl.getEffective(request);
  }

  /**
   * <p>update.</p>
   *
   * @param securableType a {@link com.databricks.sdk.service.catalog.SecurableType} object
   * @param fullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.PermissionsList} object
   */
  public PermissionsList update(SecurableType securableType, String fullName) {
    return update(new UpdatePermissions().setSecurableType(securableType).setFullName(fullName));
  }

  /**
   * Update permissions.
   *
   * <p>Updates the permissions for a securable.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.UpdatePermissions} object
   * @return a {@link com.databricks.sdk.service.catalog.PermissionsList} object
   */
  public PermissionsList update(UpdatePermissions request) {
    return impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.GrantsService} object
   */
  public GrantsService impl() {
    return impl;
  }
}
