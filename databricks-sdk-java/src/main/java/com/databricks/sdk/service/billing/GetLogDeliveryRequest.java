// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get log delivery configuration
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetLogDeliveryRequest {
  /** Databricks log delivery configuration ID */
  private String logDeliveryConfigurationId;

  /**
   * <p>Setter for the field <code>logDeliveryConfigurationId</code>.</p>
   *
   * @param logDeliveryConfigurationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.GetLogDeliveryRequest} object
   */
  public GetLogDeliveryRequest setLogDeliveryConfigurationId(String logDeliveryConfigurationId) {
    this.logDeliveryConfigurationId = logDeliveryConfigurationId;
    return this;
  }

  /**
   * <p>Getter for the field <code>logDeliveryConfigurationId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLogDeliveryConfigurationId() {
    return logDeliveryConfigurationId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLogDeliveryRequest that = (GetLogDeliveryRequest) o;
    return Objects.equals(logDeliveryConfigurationId, that.logDeliveryConfigurationId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfigurationId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetLogDeliveryRequest.class)
        .add("logDeliveryConfigurationId", logDeliveryConfigurationId)
        .toString();
  }
}
