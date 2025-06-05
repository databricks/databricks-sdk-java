// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Return billable usage logs */
@Generated
class DownloadRequestPb {
  @JsonIgnore
  @QueryParam("end_month")
  private String endMonth;

  @JsonIgnore
  @QueryParam("personal_data")
  private Boolean personalData;

  @JsonIgnore
  @QueryParam("start_month")
  private String startMonth;

  public DownloadRequestPb setEndMonth(String endMonth) {
    this.endMonth = endMonth;
    return this;
  }

  public String getEndMonth() {
    return endMonth;
  }

  public DownloadRequestPb setPersonalData(Boolean personalData) {
    this.personalData = personalData;
    return this;
  }

  public Boolean getPersonalData() {
    return personalData;
  }

  public DownloadRequestPb setStartMonth(String startMonth) {
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
    DownloadRequestPb that = (DownloadRequestPb) o;
    return Objects.equals(endMonth, that.endMonth)
        && Objects.equals(personalData, that.personalData)
        && Objects.equals(startMonth, that.startMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMonth, personalData, startMonth);
  }

  @Override
  public String toString() {
    return new ToStringer(DownloadRequestPb.class)
        .add("endMonth", endMonth)
        .add("personalData", personalData)
        .add("startMonth", startMonth)
        .toString();
  }
}
