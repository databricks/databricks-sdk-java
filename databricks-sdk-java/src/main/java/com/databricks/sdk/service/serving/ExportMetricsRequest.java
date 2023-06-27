// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Retrieve the metrics associated with a serving endpoint */
@Generated
public class ExportMetricsRequest {
  /** The name of the serving endpoint to retrieve metrics for. This field is required. */
  private String name;

  public ExportMetricsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportMetricsRequest that = (ExportMetricsRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportMetricsRequest.class).add("name", name).toString();
  }
}
