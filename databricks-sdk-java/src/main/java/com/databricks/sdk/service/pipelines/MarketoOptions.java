// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Marketo specific options for ingestion */
@Generated
public class MarketoOptions {
  /**
   * (Optional) Start date for the initial sync in YYYY-MM-DD format. This determines the earliest
   * date from which to sync historical data. If not specified, complete history is ingested.
   */
  @JsonProperty("sync_start_date")
  private String syncStartDate;

  public MarketoOptions setSyncStartDate(String syncStartDate) {
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
    MarketoOptions that = (MarketoOptions) o;
    return Objects.equals(syncStartDate, that.syncStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncStartDate);
  }

  @Override
  public String toString() {
    return new ToStringer(MarketoOptions.class).add("syncStartDate", syncStartDate).toString();
  }
}
