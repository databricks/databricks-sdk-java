// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Return billable usage logs
 */
@Generated
public class DownloadRequest {
  /**
   * Format: `YYYY-MM`. Last month to return billable usage logs for. This field
   * is required.
   */
  @QueryParam("end_month")
  private String endMonth;
  
  /**
   * Specify whether to include personally identifiable information in the
   * billable usage logs, for example the email addresses of cluster creators.
   * Handle this information with care. Defaults to false.
   */
  @QueryParam("personal_data")
  private Boolean personalData;
  
  /**
   * Format: `YYYY-MM`. First month to return billable usage logs for. This
   * field is required.
   */
  @QueryParam("start_month")
  private String startMonth;
  
  public DownloadRequest setEndMonth(String endMonth) {
    this.endMonth = endMonth;
    return this;
  }

  public String getEndMonth() {
    return endMonth;
  }
  
  public DownloadRequest setPersonalData(Boolean personalData) {
    this.personalData = personalData;
    return this;
  }

  public Boolean getPersonalData() {
    return personalData;
  }
  
  public DownloadRequest setStartMonth(String startMonth) {
    this.startMonth = startMonth;
    return this;
  }

  public String getStartMonth() {
    return startMonth;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DownloadRequest that = (DownloadRequest) o;
    return Objects.equals(endMonth, that.endMonth)
    && Objects.equals(personalData, that.personalData)
    && Objects.equals(startMonth, that.startMonth)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMonth, personalData, startMonth);
  }

  @Override
  public String toString() {
    return new ToStringer(DownloadRequest.class)
      .add("endMonth", endMonth)
      .add("personalData", personalData)
      .add("startMonth", startMonth).toString();
  }
}
