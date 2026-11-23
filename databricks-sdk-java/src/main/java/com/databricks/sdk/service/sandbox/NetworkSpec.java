// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Network configuration for the sandbox. */
@Generated
public class NetworkSpec {
  /**
   * Whether the sandbox can reach the public internet. Defaults to true. Control-plane,
   * PrivateLink, and workspace/UC/Delta-shared storage stay reachable either way.
   */
  @JsonProperty("internet_access")
  private Boolean internetAccess;

  public NetworkSpec setInternetAccess(Boolean internetAccess) {
    this.internetAccess = internetAccess;
    return this;
  }

  public Boolean getInternetAccess() {
    return internetAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkSpec that = (NetworkSpec) o;
    return Objects.equals(internetAccess, that.internetAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internetAccess);
  }

  @Override
  public String toString() {
    return new ToStringer(NetworkSpec.class).add("internetAccess", internetAccess).toString();
  }
}
