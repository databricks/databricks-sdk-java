// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class InitialEndpointSpec {
  /** Settings for HA configuration of the endpoint */
  @JsonProperty("group")
  private EndpointGroupSpec group;

  public InitialEndpointSpec setGroup(EndpointGroupSpec group) {
    this.group = group;
    return this;
  }

  public EndpointGroupSpec getGroup() {
    return group;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InitialEndpointSpec that = (InitialEndpointSpec) o;
    return Objects.equals(group, that.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group);
  }

  @Override
  public String toString() {
    return new ToStringer(InitialEndpointSpec.class).add("group", group).toString();
  }
}
