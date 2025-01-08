// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DataPlaneInfo {
  /** Authorization details as a string. */
  @JsonProperty("authorization_details")
  private String authorizationDetails;

  /** The URL of the endpoint for this operation in the dataplane. */
  @JsonProperty("endpoint_url")
  private String endpointUrl;

  public DataPlaneInfo setAuthorizationDetails(String authorizationDetails) {
    this.authorizationDetails = authorizationDetails;
    return this;
  }

  public String getAuthorizationDetails() {
    return authorizationDetails;
  }

  public DataPlaneInfo setEndpointUrl(String endpointUrl) {
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
    DataPlaneInfo that = (DataPlaneInfo) o;
    return Objects.equals(authorizationDetails, that.authorizationDetails)
        && Objects.equals(endpointUrl, that.endpointUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationDetails, endpointUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(DataPlaneInfo.class)
        .add("authorizationDetails", authorizationDetails)
        .add("endpointUrl", endpointUrl)
        .toString();
  }
}
