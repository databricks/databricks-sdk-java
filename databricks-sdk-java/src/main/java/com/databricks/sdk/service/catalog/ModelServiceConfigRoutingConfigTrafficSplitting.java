// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Marker message selecting request-based traffic splitting across primary destinations. Split
 * weights are read from each DestinationConfig.traffic_percentage.
 */
@Generated
public class ModelServiceConfigRoutingConfigTrafficSplitting {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(ModelServiceConfigRoutingConfigTrafficSplitting.class).toString();
  }
}
