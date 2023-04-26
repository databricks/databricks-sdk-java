// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>WrappedLogDeliveryConfiguration class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class WrappedLogDeliveryConfiguration {
  /** */
  @JsonProperty("log_delivery_configuration")
  private LogDeliveryConfiguration logDeliveryConfiguration;

  /**
   * <p>Setter for the field <code>logDeliveryConfiguration</code>.</p>
   *
   * @param logDeliveryConfiguration a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   * @return a {@link com.databricks.sdk.service.billing.WrappedLogDeliveryConfiguration} object
   */
  public WrappedLogDeliveryConfiguration setLogDeliveryConfiguration(
      LogDeliveryConfiguration logDeliveryConfiguration) {
    this.logDeliveryConfiguration = logDeliveryConfiguration;
    return this;
  }

  /**
   * <p>Getter for the field <code>logDeliveryConfiguration</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration getLogDeliveryConfiguration() {
    return logDeliveryConfiguration;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WrappedLogDeliveryConfiguration that = (WrappedLogDeliveryConfiguration) o;
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
    return new ToStringer(WrappedLogDeliveryConfiguration.class)
        .add("logDeliveryConfiguration", logDeliveryConfiguration)
        .toString();
  }
}
