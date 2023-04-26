// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SqlStatementOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SqlStatementOutput {
  /** A key that can be used to look up query details. */
  @JsonProperty("lookup_key")
  private String lookupKey;

  /**
   * <p>Setter for the field <code>lookupKey</code>.</p>
   *
   * @param lookupKey a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlStatementOutput} object
   */
  public SqlStatementOutput setLookupKey(String lookupKey) {
    this.lookupKey = lookupKey;
    return this;
  }

  /**
   * <p>Getter for the field <code>lookupKey</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLookupKey() {
    return lookupKey;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlStatementOutput that = (SqlStatementOutput) o;
    return Objects.equals(lookupKey, that.lookupKey);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(lookupKey);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SqlStatementOutput.class).add("lookupKey", lookupKey).toString();
  }
}
