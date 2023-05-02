// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineParams that = (PipelineParams) o;
    return Objects.equals(fullRefresh, that.fullRefresh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullRefresh);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineParams.class).add("fullRefresh", fullRefresh).toString();
  }
}
