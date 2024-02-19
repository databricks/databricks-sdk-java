// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Online tables provide lower latency and higher QPS access to data from Delta tables. */
@Generated
public class OnlineTablesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(OnlineTablesAPI.class);

  private final OnlineTablesService impl;

  /** Regular-use constructor */
  public OnlineTablesAPI(ApiClient apiClient) {
    impl = new OnlineTablesImpl(apiClient);
  }

  /** Constructor for mocks */
  public OnlineTablesAPI(OnlineTablesService mock) {
    impl = mock;
  }

  /**
   * Create an Online Table.
   *
   * <p>Create a new Online Table.
   */
  public OnlineTable create(ViewData request) {
    return impl.create(request);
  }

  public void delete(String name) {
    delete(new DeleteOnlineTableRequest().setName(name));
  }

  /**
   * Delete an Online Table.
   *
   * <p>Delete an online table. Warning: This will delete all the data in the online table. If the
   * source Delta table was deleted or modified since this Online Table was created, this will lose
   * the data forever!
   */
  public void delete(DeleteOnlineTableRequest request) {
    impl.delete(request);
  }

  public OnlineTable get(String name) {
    return get(new GetOnlineTableRequest().setName(name));
  }

  /**
   * Get an Online Table.
   *
   * <p>Get information about an existing online table and its status.
   */
  public OnlineTable get(GetOnlineTableRequest request) {
    return impl.get(request);
  }

  public OnlineTablesService impl() {
    return impl;
  }
}
