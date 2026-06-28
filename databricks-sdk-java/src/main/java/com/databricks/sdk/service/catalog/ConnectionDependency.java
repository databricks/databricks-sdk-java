// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A connection that is dependent on a SQL object. */
@Generated
public class ConnectionDependency {
  /** Full name of the dependent connection, in the form of __connection_name__. */
  @JsonProperty("connection_name")
  private String connectionName;

  public ConnectionDependency setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConnectionDependency that = (ConnectionDependency) o;
    return Objects.equals(connectionName, that.connectionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionName);
  }

  @Override
  public String toString() {
    return new ToStringer(ConnectionDependency.class)
        .add("connectionName", connectionName)
        .toString();
  }
}
