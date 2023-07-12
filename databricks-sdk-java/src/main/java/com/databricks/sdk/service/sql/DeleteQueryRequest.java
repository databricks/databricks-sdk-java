// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Delete a query
 */
@Generated
public class DeleteQueryRequest {
  /**
   
   */
  
  private String queryId;
  
  public DeleteQueryRequest setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteQueryRequest that = (DeleteQueryRequest) o;
    return Objects.equals(queryId, that.queryId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteQueryRequest.class)
      .add("queryId", queryId).toString();
  }
}
