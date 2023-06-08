// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListConnectionsResponse {
  /** An array of connection information objects. */
  @JsonProperty("connections")
  private Collection<ConnectionInfo> connections;

  public ListConnectionsResponse setConnections(Collection<ConnectionInfo> connections) {
    this.connections = connections;
    return this;
  }

  public Collection<ConnectionInfo> getConnections() {
    return connections;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListConnectionsResponse that = (ListConnectionsResponse) o;
    return Objects.equals(connections, that.connections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connections);
  }

  @Override
  public String toString() {
    return new ToStringer(ListConnectionsResponse.class).add("connections", connections).toString();
  }
}
