// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create a quality monitor */
@Generated
class CreateQualityMonitorRequestPb {
  @JsonProperty("quality_monitor")
  private QualityMonitor qualityMonitor;

  public CreateQualityMonitorRequestPb setQualityMonitor(QualityMonitor qualityMonitor) {
    this.qualityMonitor = qualityMonitor;
    return this;
  }

  public QualityMonitor getQualityMonitor() {
    return qualityMonitor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateQualityMonitorRequestPb that = (CreateQualityMonitorRequestPb) o;
    return Objects.equals(qualityMonitor, that.qualityMonitor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualityMonitor);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateQualityMonitorRequestPb.class)
        .add("qualityMonitor", qualityMonitor)
        .toString();
  }
}
