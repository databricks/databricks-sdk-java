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
   * Disables the system schema and removes it from the system catalog. The caller must be an
   * account admin or a metastore admin.
   */
  void disable(DisableRequest disableRequest);

  /**
   * Enables the system schema and adds it to the system catalog. The caller must be an account
   * admin or a metastore admin.
   */
  void enable(EnableRequest enableRequest);

  /**
   * Gets an array of system schemas for a metastore. The caller must be an account admin or a
   * metastore admin.
   *
   * <p>NOTE: we recommend using max_results=0 to use the paginated version of this API. Unpaginated
   * calls will be deprecated soon.
   *
   * <p>PAGINATION BEHAVIOR: When using pagination (max_results >= 0), a page may contain zero
   * results while still providing a next_page_token. Clients must continue reading pages until
   * next_page_token is absent, which is the only indication that the end of results has been
   * reached. This behavior follows Google AIP-158 guidelines.
   */
  ListSystemSchemasResponse list(ListSystemSchemasRequest listSystemSchemasRequest);
}
