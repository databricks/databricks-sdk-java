// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connections allow for creating a connection to an external data source.
 *
 * <p>A connection is an abstraction of an external data source that can be connected from
 * Databricks Compute. Creating a connection object is the first step to managing external data
 * sources within Unity Catalog, with the second step being creating a data object (catalog, schema,
 * or table) using the connection. Data objects derived from a connection can be written to or read
 * from similar to other Unity Catalog data objects based on cloud storage. Users may create
 * different types of connections with each connection having a unique set of configuration options
 * to support credential management and other settings.
 */
@Generated
public class ConnectionsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ConnectionsAPI.class);

  private final ConnectionsService impl;

  /** Regular-use constructor */
  public ConnectionsAPI(ApiClient apiClient) {
    impl = new ConnectionsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ConnectionsAPI(ConnectionsService mock) {
    impl = mock;
  }

  /**
   * Creates a new connection
   *
   * <p>Creates a new connection to an external data source. It allows users to specify connection
   * details and configurations for interaction with the external server.
   */
  public ConnectionInfo create(CreateConnection request) {
    return impl.create(request);
  }

  public void delete(String name) {
    delete(new DeleteConnectionRequest().setName(name));
  }

  /** Deletes the connection that matches the supplied name. */
  public void delete(DeleteConnectionRequest request) {
    impl.delete(request);
  }

  public ConnectionInfo get(String name) {
    return get(new GetConnectionRequest().setName(name));
  }

  /** Gets a connection from it's name. */
  public ConnectionInfo get(GetConnectionRequest request) {
    return impl.get(request);
  }

  /** List all connections. */
  public Iterable<ConnectionInfo> list(ListConnectionsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListConnectionsResponse::getConnections,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Updates the connection that matches the supplied name. */
  public ConnectionInfo update(UpdateConnection request) {
    return impl.update(request);
  }

  public ConnectionsService impl() {
    return impl;
  }
}
