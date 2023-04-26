// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>WrappedLogDeliveryConfigurations class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class WrappedLogDeliveryConfigurations {
  /** */
  @JsonProperty("log_delivery_configurations")
  private Collection<LogDeliveryConfiguration> logDeliveryConfigurations;

  /**
   * <p>Setter for the field <code>logDeliveryConfigurations</code>.</p>
   *
   * @param logDeliveryConfigurations a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.billing.WrappedLogDeliveryConfigurations} object
   */
  public WrappedLogDeliveryConfigurations setLogDeliveryConfigurations(
      Collection<LogDeliveryConfiguration> logDeliveryConfigurations) {
    this.logDeliveryConfigurations = logDeliveryConfigurations;
    return this;
  }

  /**
   * <p>Getter for the field <code>logDeliveryConfigurations</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<LogDeliveryConfiguration> getLogDeliveryConfigurations() {
    return logDeliveryConfigurations;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WrappedLogDeliveryConfigurations that = (WrappedLogDeliveryConfigurations) o;
    return Objects.equals(logDeliveryConfigurations, that.logDeliveryConfigurations);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfigurations);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(WrappedLogDeliveryConfigurations.class)
        .add("logDeliveryConfigurations", logDeliveryConfigurations)
        .toString();
  }
}
