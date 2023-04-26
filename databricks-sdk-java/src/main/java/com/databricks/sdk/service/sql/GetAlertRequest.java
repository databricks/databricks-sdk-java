// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get an alert
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetAlertRequest {
  /** */
  private String alertId;

  /**
   * <p>Setter for the field <code>alertId</code>.</p>
   *
   * @param alertId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.GetAlertRequest} object
   */
  public GetAlertRequest setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  /**
   * <p>Getter for the field <code>alertId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAlertId() {
    return alertId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAlertRequest that = (GetAlertRequest) o;
    return Objects.equals(alertId, that.alertId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(alertId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetAlertRequest.class).add("alertId", alertId).toString();
  }
}
