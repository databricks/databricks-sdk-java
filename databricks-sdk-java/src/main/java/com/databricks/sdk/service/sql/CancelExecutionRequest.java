// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Cancel statement execution
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CancelExecutionRequest {
  /** */
  private String statementId;

  /**
   * <p>Setter for the field <code>statementId</code>.</p>
   *
   * @param statementId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.CancelExecutionRequest} object
   */
  public CancelExecutionRequest setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * <p>Getter for the field <code>statementId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStatementId() {
    return statementId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CancelExecutionRequest that = (CancelExecutionRequest) o;
    return Objects.equals(statementId, that.statementId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(statementId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CancelExecutionRequest.class).add("statementId", statementId).toString();
  }
}
