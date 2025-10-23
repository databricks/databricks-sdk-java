// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListAlertsV2Response {
  /** */
  @JsonProperty("alerts")
  private Collection<AlertV2> alerts;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListAlertsV2Response setAlerts(Collection<AlertV2> alerts) {
    this.alerts = alerts;
    return this;
  }

  public Collection<AlertV2> getAlerts() {
    return alerts;
  }

  public ListAlertsV2Response setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAlertsV2Response that = (ListAlertsV2Response) o;
    return Objects.equals(alerts, that.alerts) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alerts, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAlertsV2Response.class)
        .add("alerts", alerts)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
