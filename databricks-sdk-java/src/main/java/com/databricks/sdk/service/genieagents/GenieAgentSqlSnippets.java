// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Reusable SQL snippets. */
@Generated
public class GenieAgentSqlSnippets {
  /** Non-aggregated expressions (dimensions), such as `price * units`. */
  @JsonProperty("expressions")
  private Collection<GenieAgentSqlExpression> expressions;

  /** Filters, such as `state = 'CA'`. */
  @JsonProperty("filters")
  private Collection<GenieAgentSqlFilter> filters;

  /** Aggregated measures, such as `SUM(price * units)`. */
  @JsonProperty("measures")
  private Collection<GenieAgentSqlMeasure> measures;

  public GenieAgentSqlSnippets setExpressions(Collection<GenieAgentSqlExpression> expressions) {
    this.expressions = expressions;
    return this;
  }

  public Collection<GenieAgentSqlExpression> getExpressions() {
    return expressions;
  }

  public GenieAgentSqlSnippets setFilters(Collection<GenieAgentSqlFilter> filters) {
    this.filters = filters;
    return this;
  }

  public Collection<GenieAgentSqlFilter> getFilters() {
    return filters;
  }

  public GenieAgentSqlSnippets setMeasures(Collection<GenieAgentSqlMeasure> measures) {
    this.measures = measures;
    return this;
  }

  public Collection<GenieAgentSqlMeasure> getMeasures() {
    return measures;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentSqlSnippets that = (GenieAgentSqlSnippets) o;
    return Objects.equals(expressions, that.expressions)
        && Objects.equals(filters, that.filters)
        && Objects.equals(measures, that.measures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressions, filters, measures);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentSqlSnippets.class)
        .add("expressions", expressions)
        .add("filters", filters)
        .add("measures", measures)
        .toString();
  }
}
