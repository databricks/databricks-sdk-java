// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateAccessRequestDestinationsRequest {
  /**
   * The access request destinations to assign to the securable. For each destination, a
   * **destination_id** and **destination_type** must be defined.
   */
  @JsonProperty("access_request_destinations")
  private AccessRequestDestinations accessRequestDestinations;

  /**
   * The paths of the field mask are not evaluated, because an update always replaces the full list
   * of destinations.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateAccessRequestDestinationsRequest setAccessRequestDestinations(
      AccessRequestDestinations accessRequestDestinations) {
    this.accessRequestDestinations = accessRequestDestinations;
    return this;
  }

  public AccessRequestDestinations getAccessRequestDestinations() {
    return accessRequestDestinations;
  }

  public UpdateAccessRequestDestinationsRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateAccessRequestDestinationsRequest that = (UpdateAccessRequestDestinationsRequest) o;
    return Objects.equals(accessRequestDestinations, that.accessRequestDestinations)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequestDestinations, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAccessRequestDestinationsRequest.class)
        .add("accessRequestDestinations", accessRequestDestinations)
        .add("updateMask", updateMask)
        .toString();
  }
}
