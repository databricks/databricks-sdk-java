// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GoogleAdsConfig {
  /**
   * (Required) Manager Account ID (also called MCC Account ID) used to list and access customer
   * accounts under this manager account. This is required for fetching the list of customer
   * accounts during source selection. If the same field is also set in the object-level
   * GoogleAdsOptions (connector_options), the object-level value takes precedence over this
   * top-level config.
   */
  @JsonProperty("manager_account_id")
  private String managerAccountId;

  public GoogleAdsConfig setManagerAccountId(String managerAccountId) {
    this.managerAccountId = managerAccountId;
    return this;
  }

  public String getManagerAccountId() {
    return managerAccountId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GoogleAdsConfig that = (GoogleAdsConfig) o;
    return Objects.equals(managerAccountId, that.managerAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managerAccountId);
  }

  @Override
  public String toString() {
    return new ToStringer(GoogleAdsConfig.class)
        .add("managerAccountId", managerAccountId)
        .toString();
  }
}
