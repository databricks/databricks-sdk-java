// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A single telemetry export destination with its configuration and status. */
@Generated
public class TelemetryExportDestination {
  /** */
  @JsonProperty("unity_catalog")
  private UnityCatalog unityCatalog;

  public TelemetryExportDestination setUnityCatalog(UnityCatalog unityCatalog) {
    this.unityCatalog = unityCatalog;
    return this;
  }

  public UnityCatalog getUnityCatalog() {
    return unityCatalog;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TelemetryExportDestination that = (TelemetryExportDestination) o;
    return Objects.equals(unityCatalog, that.unityCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unityCatalog);
  }

  @Override
  public String toString() {
    return new ToStringer(TelemetryExportDestination.class)
        .add("unityCatalog", unityCatalog)
        .toString();
  }
}
