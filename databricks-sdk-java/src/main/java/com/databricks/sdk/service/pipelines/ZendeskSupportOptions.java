// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Zendesk Support specific options for ingestion */
@Generated
public class ZendeskSupportOptions {
  /**
   * (Optional) Start date in YYYY-MM-DD format for the initial sync. This determines the earliest
   * date from which to sync historical data.
   */
  @JsonProperty("start_date")
  private String startDate;

  public ZendeskSupportOptions setStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public String getStartDate() {
    return startDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ZendeskSupportOptions that = (ZendeskSupportOptions) o;
    return Objects.equals(startDate, that.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate);
  }

  @Override
  public String toString() {
    return new ToStringer(ZendeskSupportOptions.class).add("startDate", startDate).toString();
  }
}
