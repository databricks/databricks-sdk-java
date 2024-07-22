// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * This API is provided to assist you in making new query objects. When creating a query object, you
 * may optionally specify a `data_source_id` for the SQL warehouse against which it will run. If you
 * don't already know the `data_source_id` for your desired SQL warehouse, this API will help you
 * find it.
 *
 * <p>This API does not support searches. It returns the full list of SQL warehouses in your
 * workspace. We advise you to use any text editor, REST client, or `grep` to search the response
 * from this API for the name of your SQL warehouse as it appears in Databricks SQL.
 *
 * <p>**Note**: A new version of the Databricks SQL API is now available. Please see the latest
 * version.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DataSourcesService {
  /**
   * Get a list of SQL warehouses.
   *
   * <p>Retrieves a full list of SQL warehouses available in this workspace. All fields that appear
   * in this API response are enumerated for clarity. However, you need only a SQL warehouse's `id`
   * to create new queries against it.
   *
   * <p>**Note**: A new version of the Databricks SQL API is now available. Please use
   * :method:warehouses/list instead.
   */
  Collection<DataSource> list();
}
