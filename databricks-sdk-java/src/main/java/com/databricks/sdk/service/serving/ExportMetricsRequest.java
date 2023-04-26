// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Retrieve the metrics corresponding to a serving endpoint for the current time in Prometheus or
 * OpenMetrics exposition format
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ExportMetricsRequest {
  /** The name of the serving endpoint to retrieve metrics for. This field is required. */
  private String name;

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ExportMetricsRequest} object
   */
  public ExportMetricsRequest setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportMetricsRequest that = (ExportMetricsRequest) o;
    return Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ExportMetricsRequest.class).add("name", name).toString();
  }
}
