// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A reusable SQL filter. */
@Generated
public class GenieAgentSqlFilter {
  /** Display name of the filter. */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * Identifier of the filter: 32 lowercase hexadecimal characters, unique within the Genie Agent.
   */
  @JsonProperty("id")
  private String id;

  /** Guidance on when to use the filter. */
  @JsonProperty("instruction")
  private String instruction;

  /** The SQL of the filter. */
  @JsonProperty("sql")
  private String sql;

  /** Synonyms for the filter. */
  @JsonProperty("synonyms")
  private Collection<String> synonyms;

  public GenieAgentSqlFilter setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public GenieAgentSqlFilter setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieAgentSqlFilter setInstruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

  public String getInstruction() {
    return instruction;
  }

  public GenieAgentSqlFilter setSql(String sql) {
    this.sql = sql;
    return this;
  }

  public String getSql() {
    return sql;
  }

  public GenieAgentSqlFilter setSynonyms(Collection<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public Collection<String> getSynonyms() {
    return synonyms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentSqlFilter that = (GenieAgentSqlFilter) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id)
        && Objects.equals(instruction, that.instruction)
        && Objects.equals(sql, that.sql)
        && Objects.equals(synonyms, that.synonyms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, id, instruction, sql, synonyms);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentSqlFilter.class)
        .add("displayName", displayName)
        .add("id", id)
        .add("instruction", instruction)
        .add("sql", sql)
        .add("synonyms", synonyms)
        .toString();
  }
}
