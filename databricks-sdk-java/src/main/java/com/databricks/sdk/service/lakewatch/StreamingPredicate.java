// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Stateless row predicate for a streaming detection rule. */
@Generated
public class StreamingPredicate {
  /**
   * A SQL expression suitable for a WHERE clause, not a SELECT query. Evaluated per input row; only
   * stateless, row-local expressions are accepted.
   */
  @JsonProperty("expression")
  private String expression;

  public StreamingPredicate setExpression(String expression) {
    this.expression = expression;
    return this;
  }

  public String getExpression() {
    return expression;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StreamingPredicate that = (StreamingPredicate) o;
    return Objects.equals(expression, that.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression);
  }

  @Override
  public String toString() {
    return new ToStringer(StreamingPredicate.class).add("expression", expression).toString();
  }
}
