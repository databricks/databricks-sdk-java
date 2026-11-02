// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A reusable non-aggregated SQL expression (dimension). */
@Generated
public class GenieAgentSqlExpression {
  /** The alias the Genie Agent uses for the expression in generated SQL. */
  @JsonProperty("alias")
  private String alias;

  /** Display name of the expression. */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * Identifier of the expression: 32 lowercase hexadecimal characters, unique within the Genie
   * Agent.
   */
  @JsonProperty("id")
  private String id;

  /** Guidance on when to use the expression. */
  @JsonProperty("instruction")
  private String instruction;

  /** The SQL of the expression. */
  @JsonProperty("sql")
  private String sql;

  /** Synonyms for the expression. */
  @JsonProperty("synonyms")
  private Collection<String> synonyms;

  public GenieAgentSqlExpression setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public GenieAgentSqlExpression setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public GenieAgentSqlExpression setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieAgentSqlExpression setInstruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

  public String getInstruction() {
    return instruction;
  }

  public GenieAgentSqlExpression setSql(String sql) {
    this.sql = sql;
    return this;
  }

  public String getSql() {
    return sql;
  }

  public GenieAgentSqlExpression setSynonyms(Collection<String> synonyms) {
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
    GenieAgentSqlExpression that = (GenieAgentSqlExpression) o;
    return Objects.equals(alias, that.alias)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id)
        && Objects.equals(instruction, that.instruction)
        && Objects.equals(sql, that.sql)
        && Objects.equals(synonyms, that.synonyms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, displayName, id, instruction, sql, synonyms);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentSqlExpression.class)
        .add("alias", alias)
        .add("displayName", displayName)
        .add("id", id)
        .add("instruction", instruction)
        .add("sql", sql)
        .add("synonyms", synonyms)
        .toString();
  }
}
