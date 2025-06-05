// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** SHIELD feature: ESM */
@Generated
class EnhancedSecurityMonitoringPb {
  @JsonProperty("is_enabled")
  private Boolean isEnabled;

  public EnhancedSecurityMonitoringPb setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  public Boolean getIsEnabled() {
    return isEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnhancedSecurityMonitoringPb that = (EnhancedSecurityMonitoringPb) o;
    return Objects.equals(isEnabled, that.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled);
  }

  @Override
  public String toString() {
    return new ToStringer(EnhancedSecurityMonitoringPb.class)
        .add("isEnabled", isEnabled)
        .toString();
  }
}
