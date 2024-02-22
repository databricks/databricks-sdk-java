// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Online tables provide lower latency and higher QPS access to data from Delta tables.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface OnlineTablesService {
  /**
   * Create an Online Table.
   *
   * <p>Create a new Online Table.
   */
  OnlineTable create(ViewData viewData);

  /**
   * Delete an Online Table.
   *
   * <p>Delete an online table. Warning: This will delete all the data in the online table. If the
   * source Delta table was deleted or modified since this Online Table was created, this will lose
   * the data forever!
   */
  DeleteResponse delete(DeleteOnlineTableRequest deleteOnlineTableRequest);

  /**
   * Get an Online Table.
   *
   * <p>Get information about an existing online table and its status.
   */
  OnlineTable get(GetOnlineTableRequest getOnlineTableRequest);
}
