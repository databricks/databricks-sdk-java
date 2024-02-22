// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * A system schema is a schema that lives within the system catalog. A system schema may contain
 * information about customer usage of Unity Catalog such as audit-logs, billing-logs, lineage
 * information, etc.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface SystemSchemasService {
  /**
   * Disable a system schema.
   *
   * <p>Disables the system schema and removes it from the system catalog. The caller must be an
   * account admin or a metastore admin.
   */
  DisableResponse disable(DisableRequest disableRequest);

  /**
   * Enable a system schema.
   *
   * <p>Enables the system schema and adds it to the system catalog. The caller must be an account
   * admin or a metastore admin.
   */
  EnableResponse enable(EnableRequest enableRequest);

  /**
   * List system schemas.
   *
   * <p>Gets an array of system schemas for a metastore. The caller must be an account admin or a
   * metastore admin.
   */
  ListSystemSchemasResponse list(ListSystemSchemasRequest listSystemSchemasRequest);
}
