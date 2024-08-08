// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A system schema is a schema that lives within the system catalog. A system schema may contain
 * information about customer usage of Unity Catalog such as audit-logs, billing-logs, lineage
 * information, etc.
 */
@Generated
public class SystemSchemasAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SystemSchemasAPI.class);

  private final SystemSchemasService impl;

  /** Regular-use constructor */
  public SystemSchemasAPI(ApiClient apiClient) {
    impl = new SystemSchemasImpl(apiClient);
  }

  /** Constructor for mocks */
  public SystemSchemasAPI(SystemSchemasService mock) {
    impl = mock;
  }

  public void disable(String metastoreId, String schemaName) {
    disable(new DisableRequest().setMetastoreId(metastoreId).setSchemaName(schemaName));
  }

  /**
   * Disable a system schema.
   *
   * <p>Disables the system schema and removes it from the system catalog. The caller must be an
   * account admin or a metastore admin.
   */
  public void disable(DisableRequest request) {
    impl.disable(request);
  }

  public void enable(String metastoreId, String schemaName) {
    enable(new EnableRequest().setMetastoreId(metastoreId).setSchemaName(schemaName));
  }

  /**
   * Enable a system schema.
   *
   * <p>Enables the system schema and adds it to the system catalog. The caller must be an account
   * admin or a metastore admin.
   */
  public void enable(EnableRequest request) {
    impl.enable(request);
  }

  public Iterable<SystemSchemaInfo> list(String metastoreId) {
    return list(new ListSystemSchemasRequest().setMetastoreId(metastoreId));
  }

  /**
   * List system schemas.
   *
   * <p>Gets an array of system schemas for a metastore. The caller must be an account admin or a
   * metastore admin.
   */
  public Iterable<SystemSchemaInfo> list(ListSystemSchemasRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListSystemSchemasResponse::getSchemas,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public SystemSchemasService impl() {
    return impl;
  }
}
