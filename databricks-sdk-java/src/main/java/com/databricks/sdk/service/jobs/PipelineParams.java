// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PipelineParams class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PipelineParams {
  /** If true, triggers a full refresh on the delta live table. */
  @JsonProperty("full_refresh")
  private Boolean fullRefresh;

  /**
   * <p>Setter for the field <code>fullRefresh</code>.</p>
   *
   * @param fullRefresh a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.PipelineParams} object
   */
  public PipelineParams setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullRefresh</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineParams that = (PipelineParams) o;
    return Objects.equals(fullRefresh, that.fullRefresh);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(fullRefresh);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PipelineParams.class).add("fullRefresh", fullRefresh).toString();
  }
}
