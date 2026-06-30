// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ConnectionParameters {
  /**
   * Source catalog for initial connection. This is necessary for schema exploration in some
   * database systems like Oracle, and optional but nice-to-have in some other database systems like
   * Postgres. For Oracle databases, this maps to a service name.
   */
  @JsonProperty("source_catalog")
  private String sourceCatalog;

  public ConnectionParameters setSourceCatalog(String sourceCatalog) {
    this.sourceCatalog = sourceCatalog;
    return this;
  }

  public String getSourceCatalog() {
    return sourceCatalog;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConnectionParameters that = (ConnectionParameters) o;
    return Objects.equals(sourceCatalog, that.sourceCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCatalog);
  }

  @Override
  public String toString() {
    return new ToStringer(ConnectionParameters.class)
        .add("sourceCatalog", sourceCatalog)
        .toString();
  }
}
