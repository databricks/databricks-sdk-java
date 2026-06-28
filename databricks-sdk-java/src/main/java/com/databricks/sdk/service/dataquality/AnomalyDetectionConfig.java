// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Anomaly Detection Configurations. */
@Generated
public class AnomalyDetectionConfig {
  /** List of fully qualified table names to exclude from anomaly detection. */
  @JsonProperty("excluded_table_full_names")
  private Collection<String> excludedTableFullNames;

  public AnomalyDetectionConfig setExcludedTableFullNames(
      Collection<String> excludedTableFullNames) {
    this.excludedTableFullNames = excludedTableFullNames;
    return this;
  }

  public Collection<String> getExcludedTableFullNames() {
    return excludedTableFullNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnomalyDetectionConfig that = (AnomalyDetectionConfig) o;
    return Objects.equals(excludedTableFullNames, that.excludedTableFullNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedTableFullNames);
  }

  @Override
  public String toString() {
    return new ToStringer(AnomalyDetectionConfig.class)
        .add("excludedTableFullNames", excludedTableFullNames)
        .toString();
  }
}
