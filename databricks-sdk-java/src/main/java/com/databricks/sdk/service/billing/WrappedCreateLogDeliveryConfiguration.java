// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>WrappedCreateLogDeliveryConfiguration class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class WrappedCreateLogDeliveryConfiguration {
  /** */
  @JsonProperty("log_delivery_configuration")
  private CreateLogDeliveryConfigurationParams logDeliveryConfiguration;

  /**
   * <p>Setter for the field <code>logDeliveryConfiguration</code>.</p>
   *
   * @param logDeliveryConfiguration a {@link com.databricks.sdk.service.billing.CreateLogDeliveryConfigurationParams} object
   * @return a {@link com.databricks.sdk.service.billing.WrappedCreateLogDeliveryConfiguration} object
   */
  public WrappedCreateLogDeliveryConfiguration setLogDeliveryConfiguration(
      CreateLogDeliveryConfigurationParams logDeliveryConfiguration) {
    this.logDeliveryConfiguration = logDeliveryConfiguration;
    return this;
  }

  /**
   * <p>Getter for the field <code>logDeliveryConfiguration</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.billing.CreateLogDeliveryConfigurationParams} object
   */
  public CreateLogDeliveryConfigurationParams getLogDeliveryConfiguration() {
    return logDeliveryConfiguration;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WrappedCreateLogDeliveryConfiguration that = (WrappedCreateLogDeliveryConfiguration) o;
    return Objects.equals(logDeliveryConfiguration, that.logDeliveryConfiguration);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfiguration);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(WrappedCreateLogDeliveryConfiguration.class)
        .add("logDeliveryConfiguration", logDeliveryConfiguration)
        .toString();
  }
}
