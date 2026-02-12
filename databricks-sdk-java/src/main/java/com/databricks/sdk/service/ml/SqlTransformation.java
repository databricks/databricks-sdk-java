// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SqlTransformation {
  /** The alias of the output column. */
  @JsonProperty("output_alias")
  private String outputAlias;

  /**
   * The SQL expression to evaluate. Will be row-wise evaluated (no aggregations). Conditionals and
   * projections are supported.
   */
  @JsonProperty("sql")
  private String sql;

  public SqlTransformation setOutputAlias(String outputAlias) {
    this.outputAlias = outputAlias;
    return this;
  }

  public String getOutputAlias() {
    return outputAlias;
  }

  public SqlTransformation setSql(String sql) {
    this.sql = sql;
    return this;
  }

  public String getSql() {
    return sql;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTransformation that = (SqlTransformation) o;
    return Objects.equals(outputAlias, that.outputAlias) && Objects.equals(sql, that.sql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputAlias, sql);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTransformation.class)
        .add("outputAlias", outputAlias)
        .add("sql", sql)
        .toString();
  }
}
