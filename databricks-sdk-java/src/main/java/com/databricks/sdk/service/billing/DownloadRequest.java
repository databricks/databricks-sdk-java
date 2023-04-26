// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Return billable usage logs
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DownloadRequest {
  /** Format: `YYYY-MM`. Last month to return billable usage logs for. This field is required. */
  @QueryParam("end_month")
  private String endMonth;

  /**
   * Specify whether to include personally identifiable information in the billable usage logs, for
   * example the email addresses of cluster creators. Handle this information with care. Defaults to
   * false.
   */
  @QueryParam("personal_data")
  private Boolean personalData;

  /** Format: `YYYY-MM`. First month to return billable usage logs for. This field is required. */
  @QueryParam("start_month")
  private String startMonth;

  /**
   * <p>Setter for the field <code>endMonth</code>.</p>
   *
   * @param endMonth a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.DownloadRequest} object
   */
  public DownloadRequest setEndMonth(String endMonth) {
    this.endMonth = endMonth;
    return this;
  }

  /**
   * <p>Getter for the field <code>endMonth</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEndMonth() {
    return endMonth;
  }

  /**
   * <p>Setter for the field <code>personalData</code>.</p>
   *
   * @param personalData a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.billing.DownloadRequest} object
   */
  public DownloadRequest setPersonalData(Boolean personalData) {
    this.personalData = personalData;
    return this;
  }

  /**
   * <p>Getter for the field <code>personalData</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getPersonalData() {
    return personalData;
  }

  /**
   * <p>Setter for the field <code>startMonth</code>.</p>
   *
   * @param startMonth a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.DownloadRequest} object
   */
  public DownloadRequest setStartMonth(String startMonth) {
    this.startMonth = startMonth;
    return this;
  }

  /**
   * <p>Getter for the field <code>startMonth</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStartMonth() {
    return startMonth;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DownloadRequest that = (DownloadRequest) o;
    return Objects.equals(endMonth, that.endMonth)
        && Objects.equals(personalData, that.personalData)
        && Objects.equals(startMonth, that.startMonth);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(endMonth, personalData, startMonth);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DownloadRequest.class)
        .add("endMonth", endMonth)
        .add("personalData", personalData)
        .add("startMonth", startMonth)
        .toString();
  }
}
