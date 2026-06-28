// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class WrappedLogDeliveryConfigurations {
  /** Log delivery configurations were returned successfully. */
  @JsonProperty("log_delivery_configurations")
  private Collection<LogDeliveryConfiguration> logDeliveryConfigurations;

  /**
   * Token which can be sent as `page_token` to retrieve the next page of results. If this field is
   * omitted, there are no subsequent budgets.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public WrappedLogDeliveryConfigurations setLogDeliveryConfigurations(
      Collection<LogDeliveryConfiguration> logDeliveryConfigurations) {
    this.logDeliveryConfigurations = logDeliveryConfigurations;
    return this;
  }

  public Collection<LogDeliveryConfiguration> getLogDeliveryConfigurations() {
    return logDeliveryConfigurations;
  }

  public WrappedLogDeliveryConfigurations setNextPageToken(String nextPageToken) {
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
    WrappedLogDeliveryConfigurations that = (WrappedLogDeliveryConfigurations) o;
    return Objects.equals(logDeliveryConfigurations, that.logDeliveryConfigurations)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfigurations, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(WrappedLogDeliveryConfigurations.class)
        .add("logDeliveryConfigurations", logDeliveryConfigurations)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
