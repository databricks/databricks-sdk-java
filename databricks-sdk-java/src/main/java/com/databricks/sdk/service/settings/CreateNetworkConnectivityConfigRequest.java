// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateNetworkConnectivityConfigRequest {
  /**
   * The name of the network connectivity configuration. The name can contain alphanumeric
   * characters, hyphens, and underscores. The length must be between 3 and 30 characters. The name
   * must match the regular expression `^[0-9a-zA-Z-_]{3,30}$`.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The Azure region for this network connectivity configuration. Only workspaces in the same Azure
   * region can be attached to this network connectivity configuration.
   */
  @JsonProperty("region")
  private String region;

  public CreateNetworkConnectivityConfigRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateNetworkConnectivityConfigRequest setRegion(String region) {
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
    CreateNetworkConnectivityConfigRequest that = (CreateNetworkConnectivityConfigRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(region, that.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateNetworkConnectivityConfigRequest.class)
        .add("name", name)
        .add("region", region)
        .toString();
  }
}
