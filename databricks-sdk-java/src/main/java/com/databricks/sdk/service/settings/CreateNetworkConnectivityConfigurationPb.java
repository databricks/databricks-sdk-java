// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Properties of the new network connectivity configuration. */
@Generated
class CreateNetworkConnectivityConfigurationPb {
  @JsonProperty("name")
  private String name;

  @JsonProperty("region")
  private String region;

  public CreateNetworkConnectivityConfigurationPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateNetworkConnectivityConfigurationPb setRegion(String region) {
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
    CreateNetworkConnectivityConfigurationPb that = (CreateNetworkConnectivityConfigurationPb) o;
    return Objects.equals(name, that.name) && Objects.equals(region, that.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateNetworkConnectivityConfigurationPb.class)
        .add("name", name)
        .add("region", region)
        .toString();
  }
}
