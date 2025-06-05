// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * For Fleet-V2 using classic clusters, this object contains the information about the alternate
 * node type ids to use when attempting to launch a cluster. It can be used with both the driver and
 * worker node types.
 */
@Generated
class NodeTypeFlexibilityPb {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(NodeTypeFlexibilityPb.class).toString();
  }
}
