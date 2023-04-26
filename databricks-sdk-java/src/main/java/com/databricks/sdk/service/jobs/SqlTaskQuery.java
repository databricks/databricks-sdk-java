// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SqlTaskQuery class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SqlTaskQuery {
  /** The canonical identifier of the SQL query. */
  @JsonProperty("query_id")
  private String queryId;

  /**
   * <p>Setter for the field <code>queryId</code>.</p>
   *
   * @param queryId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskQuery} object
   */
  public SqlTaskQuery setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * <p>Getter for the field <code>queryId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getQueryId() {
    return queryId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTaskQuery that = (SqlTaskQuery) o;
    return Objects.equals(queryId, that.queryId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(queryId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SqlTaskQuery.class).add("queryId", queryId).toString();
  }
}
