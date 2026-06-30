// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Google Ads specific options for ingestion (object-level). When set, these values override the
 * corresponding fields in GoogleAdsConfig (source_configurations).
 */
@Generated
public class GoogleAdsOptions {
  /**
   * (Optional) Number of days to look back for report tables to capture late-arriving data. If not
   * specified, defaults to 30 days.
   */
  @JsonProperty("lookback_window_days")
  private Long lookbackWindowDays;

  /**
   * (Optional at this level) Manager Account ID (also called MCC Account ID) used to list and
   * access customer accounts under this manager account. Overrides
   * GoogleAdsConfig.manager_account_id from source_configurations when set.
   */
  @JsonProperty("manager_account_id")
  private String managerAccountId;

  /**
   * (Optional) Start date for the initial sync of report tables in YYYY-MM-DD format. This
   * determines the earliest date from which to sync historical data. If not specified, defaults to
   * 2 years of historical data.
   */
  @JsonProperty("sync_start_date")
  private String syncStartDate;

  public GoogleAdsOptions setLookbackWindowDays(Long lookbackWindowDays) {
    this.lookbackWindowDays = lookbackWindowDays;
    return this;
  }

  public Long getLookbackWindowDays() {
    return lookbackWindowDays;
  }

  public GoogleAdsOptions setManagerAccountId(String managerAccountId) {
    this.managerAccountId = managerAccountId;
    return this;
  }

  public String getManagerAccountId() {
    return managerAccountId;
  }

  public GoogleAdsOptions setSyncStartDate(String syncStartDate) {
    this.syncStartDate = syncStartDate;
    return this;
  }

  public String getSyncStartDate() {
    return syncStartDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GoogleAdsOptions that = (GoogleAdsOptions) o;
    return Objects.equals(lookbackWindowDays, that.lookbackWindowDays)
        && Objects.equals(managerAccountId, that.managerAccountId)
        && Objects.equals(syncStartDate, that.syncStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lookbackWindowDays, managerAccountId, syncStartDate);
  }

  @Override
  public String toString() {
    return new ToStringer(GoogleAdsOptions.class)
        .add("lookbackWindowDays", lookbackWindowDays)
        .add("managerAccountId", managerAccountId)
        .add("syncStartDate", syncStartDate)
        .toString();
  }
}
