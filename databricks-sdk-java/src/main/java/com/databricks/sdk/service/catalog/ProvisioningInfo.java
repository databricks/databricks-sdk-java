// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Status of an asynchronously provisioned resource. */
@Generated
public class ProvisioningInfo {
  /** */
  @JsonProperty("state")
  private ProvisioningInfoState state;

  public ProvisioningInfo setState(ProvisioningInfoState state) {
    this.state = state;
    return this;
  }

  public ProvisioningInfoState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProvisioningInfo that = (ProvisioningInfo) o;
    return Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state);
  }

  @Override
  public String toString() {
    return new ToStringer(ProvisioningInfo.class).add("state", state).toString();
  }
}
