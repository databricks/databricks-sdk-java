// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** An example question paired with the SQL that answers it. */
@Generated
public class GenieAgentExampleQuestionSql {
  /**
   * Identifier of the example: 32 lowercase hexadecimal characters, unique within the Genie Agent.
   */
  @JsonProperty("id")
  private String id;

  /** Parameters used in the SQL, in the order given. */
  @JsonProperty("parameters")
  private Collection<GenieAgentSqlParameter> parameters;

  /** The question. */
  @JsonProperty("question")
  private String question;

  /** The SQL that answers the question. */
  @JsonProperty("sql")
  private String sql;

  /** Guidance on when to use this example. */
  @JsonProperty("usage_guidance")
  private String usageGuidance;

  public GenieAgentExampleQuestionSql setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieAgentExampleQuestionSql setParameters(Collection<GenieAgentSqlParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<GenieAgentSqlParameter> getParameters() {
    return parameters;
  }

  public GenieAgentExampleQuestionSql setQuestion(String question) {
    this.question = question;
    return this;
  }

  public String getQuestion() {
    return question;
  }

  public GenieAgentExampleQuestionSql setSql(String sql) {
    this.sql = sql;
    return this;
  }

  public String getSql() {
    return sql;
  }

  public GenieAgentExampleQuestionSql setUsageGuidance(String usageGuidance) {
    this.usageGuidance = usageGuidance;
    return this;
  }

  public String getUsageGuidance() {
    return usageGuidance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentExampleQuestionSql that = (GenieAgentExampleQuestionSql) o;
    return Objects.equals(id, that.id)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(question, that.question)
        && Objects.equals(sql, that.sql)
        && Objects.equals(usageGuidance, that.usageGuidance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parameters, question, sql, usageGuidance);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentExampleQuestionSql.class)
        .add("id", id)
        .add("parameters", parameters)
        .add("question", question)
        .add("sql", sql)
        .add("usageGuidance", usageGuidance)
        .toString();
  }
}
