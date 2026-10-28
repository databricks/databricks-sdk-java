// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The calling user's spend against a single blocking threshold. Values may be omitted if live spend
 * or threshold data is temporarily unavailable.
 */
@Generated
public class AlertSpendStatus {
  /**
   * Percentage of the threshold consumed, as a decimal string rounded down to one decimal place
   * (for example, "68.4" means 68.4%). May exceed 100 when spend is over the threshold. Returns
   * "0.0" if there's no spend, and is omitted if the threshold is $0. For shared thresholds, this
   * is the only value returned; the absolute `spend` and `threshold` dollar amounts are withheld.
   */
  @JsonProperty("percent_consumed")
  private String percentConsumed;

  /**
   * Whether the threshold is evaluated per individual user
   * (`ALERT_CONFIGURATION_SCOPE_TYPE_PER_USER`) or on the shared spend across all users
   * (`ALERT_CONFIGURATION_SCOPE_TYPE_SHARED`).
   */
  @JsonProperty("scope_type")
  private AlertConfigurationScopeType scopeType;

  /**
   * The calling user's live spend against this threshold, in USD at list price. Returns "0" if the
   * caller has no usage. Omitted for shared thresholds, where only `percent_consumed` is returned.
   */
  @JsonProperty("spend")
  private String spend;

  /**
   * The calling user's effective threshold, in USD at list price. The effective threshold is the
   * actual threshold amount that applies to the user, after adjusting for any user or group
   * overrides. Omitted for shared thresholds, where only `percent_consumed` is returned.
   */
  @JsonProperty("threshold")
  private String threshold;

  /** The time window the threshold applies to, for example `MONTH`. */
  @JsonProperty("time_period")
  private AlertConfigurationTimePeriod timePeriod;

  public AlertSpendStatus setPercentConsumed(String percentConsumed) {
    this.percentConsumed = percentConsumed;
    return this;
  }

  public String getPercentConsumed() {
    return percentConsumed;
  }

  public AlertSpendStatus setScopeType(AlertConfigurationScopeType scopeType) {
    this.scopeType = scopeType;
    return this;
  }

  public AlertConfigurationScopeType getScopeType() {
    return scopeType;
  }

  public AlertSpendStatus setSpend(String spend) {
    this.spend = spend;
    return this;
  }

  public String getSpend() {
    return spend;
  }

  public AlertSpendStatus setThreshold(String threshold) {
    this.threshold = threshold;
    return this;
  }

  public String getThreshold() {
    return threshold;
  }

  public AlertSpendStatus setTimePeriod(AlertConfigurationTimePeriod timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  public AlertConfigurationTimePeriod getTimePeriod() {
    return timePeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertSpendStatus that = (AlertSpendStatus) o;
    return Objects.equals(percentConsumed, that.percentConsumed)
        && Objects.equals(scopeType, that.scopeType)
        && Objects.equals(spend, that.spend)
        && Objects.equals(threshold, that.threshold)
        && Objects.equals(timePeriod, that.timePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentConsumed, scopeType, spend, threshold, timePeriod);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertSpendStatus.class)
        .add("percentConsumed", percentConsumed)
        .add("scopeType", scopeType)
        .add("spend", spend)
        .add("threshold", threshold)
        .add("timePeriod", timePeriod)
        .toString();
  }
}
