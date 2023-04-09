// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListInstancePools {
  /** */
  @JsonProperty("instance_pools")
  private Collection<InstancePoolAndStats> instancePools;

  public ListInstancePools setInstancePools(Collection<InstancePoolAndStats> instancePools) {
    this.instancePools = instancePools;
    return this;
  }

  public Collection<InstancePoolAndStats> getInstancePools() {
    return instancePools;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListInstancePools that = (ListInstancePools) o;
    return Objects.equals(instancePools, that.instancePools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancePools);
  }

  @Override
  public String toString() {
    return new ToStringer(ListInstancePools.class).add("instancePools", instancePools).toString();
  }
}
