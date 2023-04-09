// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class WrappedLogDeliveryConfigurations {
  /** */
  @JsonProperty("log_delivery_configurations")
  private Collection<LogDeliveryConfiguration> logDeliveryConfigurations;

  public WrappedLogDeliveryConfigurations setLogDeliveryConfigurations(
      Collection<LogDeliveryConfiguration> logDeliveryConfigurations) {
    this.logDeliveryConfigurations = logDeliveryConfigurations;
    return this;
  }

  public Collection<LogDeliveryConfiguration> getLogDeliveryConfigurations() {
    return logDeliveryConfigurations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WrappedLogDeliveryConfigurations that = (WrappedLogDeliveryConfigurations) o;
    return Objects.equals(logDeliveryConfigurations, that.logDeliveryConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfigurations);
  }

  @Override
  public String toString() {
    return new ToStringer(WrappedLogDeliveryConfigurations.class)
        .add("logDeliveryConfigurations", logDeliveryConfigurations)
        .toString();
  }
}
