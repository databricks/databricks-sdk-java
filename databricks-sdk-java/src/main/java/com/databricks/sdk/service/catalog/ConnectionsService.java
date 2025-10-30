// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

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
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ConnectionsService {
  /**
   * Creates a new connection
   *
   * <p>Creates a new connection to an external data source. It allows users to specify connection
   * details and configurations for interaction with the external server.
   */
  ConnectionInfo create(CreateConnection createConnection);

  /** Deletes the connection that matches the supplied name. */
  void delete(DeleteConnectionRequest deleteConnectionRequest);

  /** Gets a connection from it's name. */
  ConnectionInfo get(GetConnectionRequest getConnectionRequest);

  /**
   * List all connections.
   *
   * <p>NOTE: we recommend using max_results=0 to use the paginated version of this API. Unpaginated
   * calls will be deprecated soon.
   *
   * <p>PAGINATION BEHAVIOR: When using pagination (max_results >= 0), a page may contain zero
   * results while still providing a next_page_token. Clients must continue reading pages until
   * next_page_token is absent, which is the only indication that the end of results has been
   * reached.
   */
  ListConnectionsResponse list(ListConnectionsRequest listConnectionsRequest);

  /** Updates the connection that matches the supplied name. */
  ConnectionInfo update(UpdateConnection updateConnection);
}
