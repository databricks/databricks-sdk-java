// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get result chunk by index
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetStatementResultChunkNRequest {
  /** */
  private Long chunkIndex;

  /** */
  private String statementId;

  /**
   * <p>Setter for the field <code>chunkIndex</code>.</p>
   *
   * @param chunkIndex a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.GetStatementResultChunkNRequest} object
   */
  public GetStatementResultChunkNRequest setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  /**
   * <p>Getter for the field <code>chunkIndex</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getChunkIndex() {
    return chunkIndex;
  }

  /**
   * <p>Setter for the field <code>statementId</code>.</p>
   *
   * @param statementId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetStatementResultChunkNRequest} object
   */
  public GetStatementResultChunkNRequest setStatementId(String statementId) {
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
    GetStatementResultChunkNRequest that = (GetStatementResultChunkNRequest) o;
    return Objects.equals(chunkIndex, that.chunkIndex)
        && Objects.equals(statementId, that.statementId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(chunkIndex, statementId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetStatementResultChunkNRequest.class)
        .add("chunkIndex", chunkIndex)
        .add("statementId", statementId)
        .toString();
  }
}
