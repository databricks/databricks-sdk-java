// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetPublishedDashboardTokenInfoResponsePb {
  @JsonProperty("authorization_details")
  private Collection<AuthorizationDetails> authorizationDetails;

  @JsonProperty("custom_claim")
  private String customClaim;

  @JsonProperty("scope")
  private String scope;

  public GetPublishedDashboardTokenInfoResponsePb setAuthorizationDetails(
      Collection<AuthorizationDetails> authorizationDetails) {
    this.authorizationDetails = authorizationDetails;
    return this;
  }

  public Collection<AuthorizationDetails> getAuthorizationDetails() {
    return authorizationDetails;
  }

  public GetPublishedDashboardTokenInfoResponsePb setCustomClaim(String customClaim) {
    this.customClaim = customClaim;
    return this;
  }

  public String getCustomClaim() {
    return customClaim;
  }

  public GetPublishedDashboardTokenInfoResponsePb setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPublishedDashboardTokenInfoResponsePb that = (GetPublishedDashboardTokenInfoResponsePb) o;
    return Objects.equals(authorizationDetails, that.authorizationDetails)
        && Objects.equals(customClaim, that.customClaim)
        && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationDetails, customClaim, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedDashboardTokenInfoResponsePb.class)
        .add("authorizationDetails", authorizationDetails)
        .add("customClaim", customClaim)
        .add("scope", scope)
        .toString();
  }
}
