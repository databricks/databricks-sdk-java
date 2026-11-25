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

  /** Reusable SQL filters, expressions, and measures. */
  @JsonProperty("sql_snippets")
  private GenieAgentSqlSnippets sqlSnippets;

  /** The general text instruction. */
  @JsonProperty("text_instruction")
  private GenieAgentTextInstruction textInstruction;

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

  public GenieAgentInstructions setSqlSnippets(GenieAgentSqlSnippets sqlSnippets) {
    this.sqlSnippets = sqlSnippets;
    return this;
  }

  public GenieAgentSqlSnippets getSqlSnippets() {
    return sqlSnippets;
  }

  public GenieAgentInstructions setTextInstruction(GenieAgentTextInstruction textInstruction) {
    this.textInstruction = textInstruction;
    return this;
  }

  public GenieAgentTextInstruction getTextInstruction() {
    return textInstruction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentInstructions that = (GenieAgentInstructions) o;
    return Objects.equals(exampleQuestionSqls, that.exampleQuestionSqls)
        && Objects.equals(joinSpecs, that.joinSpecs)
        && Objects.equals(sqlSnippets, that.sqlSnippets)
        && Objects.equals(textInstruction, that.textInstruction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exampleQuestionSqls, joinSpecs, sqlSnippets, textInstruction);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentInstructions.class)
        .add("exampleQuestionSqls", exampleQuestionSqls)
        .add("joinSpecs", joinSpecs)
        .add("sqlSnippets", sqlSnippets)
        .add("textInstruction", textInstruction)
        .toString();
  }
}
