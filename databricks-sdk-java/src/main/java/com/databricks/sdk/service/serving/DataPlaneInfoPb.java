// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Details necessary to query this object's API through the DataPlane APIs. */
@Generated
class DataPlaneInfoPb {
  @JsonProperty("authorization_details")
  private String authorizationDetails;

  @JsonProperty("endpoint_url")
  private String endpointUrl;

  public DataPlaneInfoPb setAuthorizationDetails(String authorizationDetails) {
    this.authorizationDetails = authorizationDetails;
    return this;
  }

  public String getAuthorizationDetails() {
    return authorizationDetails;
  }

  public DataPlaneInfoPb setEndpointUrl(String endpointUrl) {
    this.endpointUrl = endpointUrl;
    return this;
  }

  public String getEndpointUrl() {
    return endpointUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataPlaneInfoPb that = (DataPlaneInfoPb) o;
    return Objects.equals(authorizationDetails, that.authorizationDetails)
        && Objects.equals(endpointUrl, that.endpointUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationDetails, endpointUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(DataPlaneInfoPb.class)
        .add("authorizationDetails", authorizationDetails)
        .add("endpointUrl", endpointUrl)
        .toString();
  }
}
