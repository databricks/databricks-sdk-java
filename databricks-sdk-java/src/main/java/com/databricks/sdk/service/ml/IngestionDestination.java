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

  /**
   * The full three-part name (catalog, schema, name) of an existing view to use instead of creating
   * a Delta table. The view is dropped when the Stream is deleted.
   */
  @JsonProperty("view_name")
  private String viewName;

  public IngestionDestination setDeltaTableName(String deltaTableName) {
    this.deltaTableName = deltaTableName;
    return this;
  }

  public String getDeltaTableName() {
    return deltaTableName;
  }

  public IngestionDestination setViewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

  public String getViewName() {
    return viewName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IngestionDestination that = (IngestionDestination) o;
    return Objects.equals(deltaTableName, that.deltaTableName)
        && Objects.equals(viewName, that.viewName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaTableName, viewName);
  }

  @Override
  public String toString() {
    return new ToStringer(IngestionDestination.class)
        .add("deltaTableName", deltaTableName)
        .add("viewName", viewName)
        .toString();
  }
}
