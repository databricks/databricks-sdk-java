// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * Properties pertaining to the current state of the delta table as given by the commit server. This
 * does not contain **delta.*** (input) properties in __TableInfo.properties__.
 */
@Generated
public class DeltaRuntimePropertiesKvPairs {
  /** A map of key-value properties attached to the securable. */
  @JsonProperty("delta_runtime_properties")
  private Map<String, String> deltaRuntimeProperties;

  public DeltaRuntimePropertiesKvPairs setDeltaRuntimeProperties(
      Map<String, String> deltaRuntimeProperties) {
    this.deltaRuntimeProperties = deltaRuntimeProperties;
    return this;
  }

  public Map<String, String> getDeltaRuntimeProperties() {
    return deltaRuntimeProperties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaRuntimePropertiesKvPairs that = (DeltaRuntimePropertiesKvPairs) o;
    return Objects.equals(deltaRuntimeProperties, that.deltaRuntimeProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaRuntimeProperties);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaRuntimePropertiesKvPairs.class)
        .add("deltaRuntimeProperties", deltaRuntimeProperties)
        .toString();
  }
}
