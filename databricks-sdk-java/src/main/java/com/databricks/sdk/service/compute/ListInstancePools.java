// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListInstancePools class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListInstancePools {
  /** */
  @JsonProperty("instance_pools")
  private Collection<InstancePoolAndStats> instancePools;

  /**
   * <p>Setter for the field <code>instancePools</code>.</p>
   *
   * @param instancePools a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.ListInstancePools} object
   */
  public ListInstancePools setInstancePools(Collection<InstancePoolAndStats> instancePools) {
    this.instancePools = instancePools;
    return this;
  }

  /**
   * <p>Getter for the field <code>instancePools</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<InstancePoolAndStats> getInstancePools() {
    return instancePools;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListInstancePools that = (ListInstancePools) o;
    return Objects.equals(instancePools, that.instancePools);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(instancePools);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListInstancePools.class).add("instancePools", instancePools).toString();
  }
}
