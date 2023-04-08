// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WrappedCreateLogDeliveryConfiguration {
  /** */
  @JsonProperty("log_delivery_configuration")
  private CreateLogDeliveryConfigurationParams logDeliveryConfiguration;

  public WrappedCreateLogDeliveryConfiguration setLogDeliveryConfiguration(
      CreateLogDeliveryConfigurationParams logDeliveryConfiguration) {
    this.logDeliveryConfiguration = logDeliveryConfiguration;
    return this;
  }

  public CreateLogDeliveryConfigurationParams getLogDeliveryConfiguration() {
    return logDeliveryConfiguration;
  }
}
