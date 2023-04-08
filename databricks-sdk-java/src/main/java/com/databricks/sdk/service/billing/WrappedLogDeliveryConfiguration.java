// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class WrappedLogDeliveryConfiguration {
  /** */
  @JsonProperty("log_delivery_configuration")
  private LogDeliveryConfiguration logDeliveryConfiguration;

  public WrappedLogDeliveryConfiguration setLogDeliveryConfiguration(
      LogDeliveryConfiguration logDeliveryConfiguration) {
    this.logDeliveryConfiguration = logDeliveryConfiguration;
    return this;
  }

  public LogDeliveryConfiguration getLogDeliveryConfiguration() {
    return logDeliveryConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WrappedLogDeliveryConfiguration that = (WrappedLogDeliveryConfiguration) o;
    return Objects.equals(logDeliveryConfiguration, that.logDeliveryConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfiguration);
  }

  @Override
  public String toString() {
    return new ToStringer(WrappedLogDeliveryConfiguration.class)
        .add("logDeliveryConfiguration", logDeliveryConfiguration)
        .toString();
  }
}
