// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import com.databricks.sdk.annotation.QueryParam;

/** Get status */
public class ContextStatusRequest {
  /** */
  @QueryParam("clusterId")
  private String clusterId;

  /** */
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
}
