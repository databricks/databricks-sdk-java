// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateRefreshSchedule {
  /** */
  private String alertId;

  /** Cron string representing the refresh schedule. */
  @JsonProperty("cron")
  private String cron;

  /**
   * ID of the SQL warehouse to refresh with. If `null`, query's SQL warehouse will be used to
   * refresh.
   */
  @JsonProperty("data_source_id")
  private String dataSourceId;

  public CreateRefreshSchedule setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  public CreateRefreshSchedule setCron(String cron) {
    this.cron = cron;
    return this;
  }

  public String getCron() {
    return cron;
  }

  public CreateRefreshSchedule setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public String getDataSourceId() {
    return dataSourceId;
  }
}
