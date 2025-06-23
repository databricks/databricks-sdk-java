// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A dependency of a SQL object. One of the following fields must be defined: __table__,
 * __function__, __connection__, or __credential__.
 */
@Generated
public class Dependency {
  /** A connection that is dependent on a SQL object. */
  @JsonProperty("connection")
  private ConnectionDependency connection;

  /** A credential that is dependent on a SQL object. */
  @JsonProperty("credential")
  private CredentialDependency credential;

  /** A function that is dependent on a SQL object. */
  @JsonProperty("function")
  private FunctionDependency function;

  /** A table that is dependent on a SQL object. */
  @JsonProperty("table")
  private TableDependency table;

  public Dependency setConnection(ConnectionDependency connection) {
    this.connection = connection;
    return this;
  }

  public ConnectionDependency getConnection() {
    return connection;
  }

  public Dependency setCredential(CredentialDependency credential) {
    this.credential = credential;
    return this;
  }

  public CredentialDependency getCredential() {
    return credential;
  }

  public Dependency setFunction(FunctionDependency function) {
    this.function = function;
    return this;
  }

  public FunctionDependency getFunction() {
    return function;
  }

  public Dependency setTable(TableDependency table) {
    this.table = table;
    return this;
  }

  public TableDependency getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dependency that = (Dependency) o;
    return Objects.equals(connection, that.connection)
        && Objects.equals(credential, that.credential)
        && Objects.equals(function, that.function)
        && Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connection, credential, function, table);
  }

  @Override
  public String toString() {
    return new ToStringer(Dependency.class)
        .add("connection", connection)
        .add("credential", credential)
        .add("function", function)
        .add("table", table)
        .toString();
  }
}
