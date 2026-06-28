// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class QuotaInfo {
  /** The timestamp that indicates when the quota count was last updated. */
  @JsonProperty("last_refreshed_at")
  private Long lastRefreshedAt;

  /** Name of the parent resource. Returns metastore ID if the parent is a metastore. */
  @JsonProperty("parent_full_name")
  private String parentFullName;

  /** The quota parent securable type. */
  @JsonProperty("parent_securable_type")
  private SecurableType parentSecurableType;

  /** The current usage of the resource quota. */
  @JsonProperty("quota_count")
  private Long quotaCount;

  /** The current limit of the resource quota. */
  @JsonProperty("quota_limit")
  private Long quotaLimit;

  /** The name of the quota. */
  @JsonProperty("quota_name")
  private String quotaName;

  public QuotaInfo setLastRefreshedAt(Long lastRefreshedAt) {
    this.lastRefreshedAt = lastRefreshedAt;
    return this;
  }

  public Long getLastRefreshedAt() {
    return lastRefreshedAt;
  }

  public QuotaInfo setParentFullName(String parentFullName) {
    this.parentFullName = parentFullName;
    return this;
  }

  public String getParentFullName() {
    return parentFullName;
  }

  public QuotaInfo setParentSecurableType(SecurableType parentSecurableType) {
    this.parentSecurableType = parentSecurableType;
    return this;
  }

  public SecurableType getParentSecurableType() {
    return parentSecurableType;
  }

  public QuotaInfo setQuotaCount(Long quotaCount) {
    this.quotaCount = quotaCount;
    return this;
  }

  public Long getQuotaCount() {
    return quotaCount;
  }

  public QuotaInfo setQuotaLimit(Long quotaLimit) {
    this.quotaLimit = quotaLimit;
    return this;
  }

  public Long getQuotaLimit() {
    return quotaLimit;
  }

  public QuotaInfo setQuotaName(String quotaName) {
    this.quotaName = quotaName;
    return this;
  }

  public String getQuotaName() {
    return quotaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuotaInfo that = (QuotaInfo) o;
    return Objects.equals(lastRefreshedAt, that.lastRefreshedAt)
        && Objects.equals(parentFullName, that.parentFullName)
        && Objects.equals(parentSecurableType, that.parentSecurableType)
        && Objects.equals(quotaCount, that.quotaCount)
        && Objects.equals(quotaLimit, that.quotaLimit)
        && Objects.equals(quotaName, that.quotaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lastRefreshedAt, parentFullName, parentSecurableType, quotaCount, quotaLimit, quotaName);
  }

  @Override
  public String toString() {
    return new ToStringer(QuotaInfo.class)
        .add("lastRefreshedAt", lastRefreshedAt)
        .add("parentFullName", parentFullName)
        .add("parentSecurableType", parentSecurableType)
        .add("quotaCount", quotaCount)
        .add("quotaLimit", quotaLimit)
        .add("quotaName", quotaName)
        .toString();
  }
}
