// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GetLatestVersionProviderAnalyticsDashboardResponsePb {
  @JsonProperty("version")
  private Long version;

  public GetLatestVersionProviderAnalyticsDashboardResponsePb setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLatestVersionProviderAnalyticsDashboardResponsePb that =
        (GetLatestVersionProviderAnalyticsDashboardResponsePb) o;
    return Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLatestVersionProviderAnalyticsDashboardResponsePb.class)
        .add("version", version)
        .toString();
  }
}
