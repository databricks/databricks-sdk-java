// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyAccountUiDestination {
  /** Must be set to true. */
  @JsonProperty("all_destinations")
  private Boolean allDestinations;

  public CustomerFacingIngressNetworkPolicyAccountUiDestination setAllDestinations(
      Boolean allDestinations) {
    this.allDestinations = allDestinations;
    return this;
  }

  public Boolean getAllDestinations() {
    return allDestinations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyAccountUiDestination that =
        (CustomerFacingIngressNetworkPolicyAccountUiDestination) o;
    return Objects.equals(allDestinations, that.allDestinations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allDestinations);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyAccountUiDestination.class)
        .add("allDestinations", allDestinations)
        .toString();
  }
}
