// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/** Get result chunk by index */
public class GetStatementResultChunkNRequest {
  /** */
  private Long chunkIndex;

  /** */
  private String statementId;

  public GetStatementResultChunkNRequest setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public GetStatementResultChunkNRequest setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }
}
