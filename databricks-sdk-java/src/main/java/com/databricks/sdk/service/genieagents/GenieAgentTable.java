// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A Unity Catalog table, view, or metric view the Genie Agent can access. */
@Generated
public class GenieAgentTable {
  /** Column settings for the table, sorted by `column`. */
  @JsonProperty("column_configs")
  private Collection<GenieAgentColumnConfig> columnConfigs;

  /** Description of the table. */
  @JsonProperty("description")
  private String description;

  /** The full three-level name, for example `catalog.schema.table`. */
  @JsonProperty("identifier")
  private String identifier;

  public GenieAgentTable setColumnConfigs(Collection<GenieAgentColumnConfig> columnConfigs) {
    this.columnConfigs = columnConfigs;
    return this;
  }

  public Collection<GenieAgentColumnConfig> getColumnConfigs() {
    return columnConfigs;
  }

  public GenieAgentTable setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieAgentTable setIdentifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  public String getIdentifier() {
    return identifier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentTable that = (GenieAgentTable) o;
    return Objects.equals(columnConfigs, that.columnConfigs)
        && Objects.equals(description, that.description)
        && Objects.equals(identifier, that.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnConfigs, description, identifier);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentTable.class)
        .add("columnConfigs", columnConfigs)
        .add("description", description)
        .add("identifier", identifier)
        .toString();
  }
}
