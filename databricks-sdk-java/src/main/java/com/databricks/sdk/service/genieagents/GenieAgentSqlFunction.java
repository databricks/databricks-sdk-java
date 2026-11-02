// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A Unity Catalog SQL function the generated SQL may call. */
@Generated
public class GenieAgentSqlFunction {
  /**
   * Identifier of the entry: 32 lowercase hexadecimal characters, unique within the Genie Agent.
   */
  @JsonProperty("id")
  private String id;

  /** The full three-level name of the function, for example `catalog.schema.function`. */
  @JsonProperty("identifier")
  private String identifier;

  public GenieAgentSqlFunction setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieAgentSqlFunction setIdentifier(String identifier) {
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
    GenieAgentSqlFunction that = (GenieAgentSqlFunction) o;
    return Objects.equals(id, that.id) && Objects.equals(identifier, that.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, identifier);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentSqlFunction.class)
        .add("id", id)
        .add("identifier", identifier)
        .toString();
  }
}
