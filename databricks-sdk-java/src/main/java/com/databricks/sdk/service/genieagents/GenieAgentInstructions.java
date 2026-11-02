// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Instructions and SQL that guide how a Genie Agent answers questions. */
@Generated
public class GenieAgentInstructions {
  /** Example questions paired with the SQL that answers them. */
  @JsonProperty("example_question_sqls")
  private Collection<GenieAgentExampleQuestionSql> exampleQuestionSqls;

  /** Predefined joins between tables or metric views. */
  @JsonProperty("join_specs")
  private Collection<GenieAgentJoinSpec> joinSpecs;

  /** Unity Catalog SQL functions the generated SQL may call. */
  @JsonProperty("sql_functions")
  private Collection<GenieAgentSqlFunction> sqlFunctions;

  /** Reusable SQL filters, expressions, and measures. */
  @JsonProperty("sql_snippets")
  private GenieAgentSqlSnippets sqlSnippets;

  /** General text instructions. At most one text instruction is supported. */
  @JsonProperty("text_instructions")
  private Collection<GenieAgentTextInstruction> textInstructions;

  public GenieAgentInstructions setExampleQuestionSqls(
      Collection<GenieAgentExampleQuestionSql> exampleQuestionSqls) {
    this.exampleQuestionSqls = exampleQuestionSqls;
    return this;
  }

  public Collection<GenieAgentExampleQuestionSql> getExampleQuestionSqls() {
    return exampleQuestionSqls;
  }

  public GenieAgentInstructions setJoinSpecs(Collection<GenieAgentJoinSpec> joinSpecs) {
    this.joinSpecs = joinSpecs;
    return this;
  }

  public Collection<GenieAgentJoinSpec> getJoinSpecs() {
    return joinSpecs;
  }

  public GenieAgentInstructions setSqlFunctions(Collection<GenieAgentSqlFunction> sqlFunctions) {
    this.sqlFunctions = sqlFunctions;
    return this;
  }

  public Collection<GenieAgentSqlFunction> getSqlFunctions() {
    return sqlFunctions;
  }

  public GenieAgentInstructions setSqlSnippets(GenieAgentSqlSnippets sqlSnippets) {
    this.sqlSnippets = sqlSnippets;
    return this;
  }

  public GenieAgentSqlSnippets getSqlSnippets() {
    return sqlSnippets;
  }

  public GenieAgentInstructions setTextInstructions(
      Collection<GenieAgentTextInstruction> textInstructions) {
    this.textInstructions = textInstructions;
    return this;
  }

  public Collection<GenieAgentTextInstruction> getTextInstructions() {
    return textInstructions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentInstructions that = (GenieAgentInstructions) o;
    return Objects.equals(exampleQuestionSqls, that.exampleQuestionSqls)
        && Objects.equals(joinSpecs, that.joinSpecs)
        && Objects.equals(sqlFunctions, that.sqlFunctions)
        && Objects.equals(sqlSnippets, that.sqlSnippets)
        && Objects.equals(textInstructions, that.textInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        exampleQuestionSqls, joinSpecs, sqlFunctions, sqlSnippets, textInstructions);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentInstructions.class)
        .add("exampleQuestionSqls", exampleQuestionSqls)
        .add("joinSpecs", joinSpecs)
        .add("sqlFunctions", sqlFunctions)
        .add("sqlSnippets", sqlSnippets)
        .add("textInstructions", textInstructions)
        .toString();
  }
}
