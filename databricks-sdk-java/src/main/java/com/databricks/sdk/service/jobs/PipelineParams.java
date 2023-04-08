// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PipelineParams {
  /** If true, triggers a full refresh on the delta live table. */
  @JsonProperty("full_refresh")
  private Boolean fullRefresh;

  public PipelineParams setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  public Boolean getFullRefresh() {
    return fullRefresh;
  }
}
