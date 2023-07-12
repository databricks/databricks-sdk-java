// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Get status
 */
@Generated
public class ContextStatusRequest {
  /**
   
   */
  @QueryParam("clusterId")
  private String clusterId;
  
  /**
   
   */
  @QueryParam("contextId")
  private String contextId;
  
  public ContextStatusRequest setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }
  
  public ContextStatusRequest setContextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  public String getContextId() {
    return contextId;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContextStatusRequest that = (ContextStatusRequest) o;
    return Objects.equals(clusterId, that.clusterId)
    && Objects.equals(contextId, that.contextId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, contextId);
  }

  @Override
  public String toString() {
    return new ToStringer(ContextStatusRequest.class)
      .add("clusterId", clusterId)
      .add("contextId", contextId).toString();
  }
}
