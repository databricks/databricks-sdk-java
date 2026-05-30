// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Destination for the Databricks-managed Delta table that holds an offline copy of the streaming
 * data for querying and training.
 */
@Generated
public class IngestionDestination {
  /**
   * The full three-part name (catalog, schema, name) of the Delta table to be created for
   * ingestion.
   */
  @JsonProperty("delta_table_name")
  private String deltaTableName;

  public IngestionDestination setDeltaTableName(String deltaTableName) {
    this.deltaTableName = deltaTableName;
    return this;
  }

  public String getDeltaTableName() {
    return deltaTableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IngestionDestination that = (IngestionDestination) o;
    return Objects.equals(deltaTableName, that.deltaTableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaTableName);
  }

  @Override
  public String toString() {
    return new ToStringer(IngestionDestination.class)
        .add("deltaTableName", deltaTableName)
        .toString();
  }
}
