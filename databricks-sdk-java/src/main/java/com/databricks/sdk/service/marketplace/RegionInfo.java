// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RegionInfo {
  /** */
  @JsonProperty("cloud")
  private String cloud;

  /** */
  @JsonProperty("region")
  private String region;

  public RegionInfo setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public RegionInfo setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegionInfo that = (RegionInfo) o;
    return Objects.equals(cloud, that.cloud) && Objects.equals(region, that.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloud, region);
  }

  @Override
  public String toString() {
    return new ToStringer(RegionInfo.class).add("cloud", cloud).add("region", region).toString();
  }
}
