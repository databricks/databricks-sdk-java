// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GetLogDeliveryConfigurationResponse {
  /** The fetched log delivery configuration */
  @JsonProperty("log_delivery_configuration")
  private LogDeliveryConfiguration logDeliveryConfiguration;

  public GetLogDeliveryConfigurationResponse setLogDeliveryConfiguration(
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
    GetLogDeliveryConfigurationResponse that = (GetLogDeliveryConfigurationResponse) o;
    return Objects.equals(logDeliveryConfiguration, that.logDeliveryConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfiguration);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLogDeliveryConfigurationResponse.class)
        .add("logDeliveryConfiguration", logDeliveryConfiguration)
        .toString();
  }
}
