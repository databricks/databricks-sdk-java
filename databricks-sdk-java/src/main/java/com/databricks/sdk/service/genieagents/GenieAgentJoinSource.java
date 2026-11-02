// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** One side of a join. */
@Generated
public class GenieAgentJoinSource {
  /** The alias the join condition uses for this side. */
  @JsonProperty("alias")
  private String alias;

  /** The full three-level name of the table or metric view. */
  @JsonProperty("identifier")
  private String identifier;

  public GenieAgentJoinSource setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public GenieAgentJoinSource setIdentifier(String identifier) {
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
    GenieAgentJoinSource that = (GenieAgentJoinSource) o;
    return Objects.equals(alias, that.alias) && Objects.equals(identifier, that.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, identifier);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentJoinSource.class)
        .add("alias", alias)
        .add("identifier", identifier)
        .toString();
  }
}
