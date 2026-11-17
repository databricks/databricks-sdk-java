// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetPublishedDashboardTokenInfoResponse {
  /**
   * Authorization constraints that restrict the minted token to viewing the published dashboard.
   * Pass them to the OAuth token endpoint serialized as a JSON array.
   */
  @JsonProperty("authorization_details")
  private Collection<AuthorizationDetails> authorizationDetails;

  /**
   * Custom claim that carries `external_value` and `external_viewer_id` into the minted token. It
   * is only present when at least one of those query parameters was provided. Format:
   * `urn:aibi:external_data:<external_value>:<external_viewer_id>:<dashboard_id>`
   */
  @JsonProperty("custom_claim")
  private String customClaim;

  /** The space-separated OAuth scopes to request when minting the token. */
  @JsonProperty("scope")
  private String scope;

  public GetPublishedDashboardTokenInfoResponse setAuthorizationDetails(
      Collection<AuthorizationDetails> authorizationDetails) {
    this.authorizationDetails = authorizationDetails;
    return this;
  }

  public Collection<AuthorizationDetails> getAuthorizationDetails() {
    return authorizationDetails;
  }

  public GetPublishedDashboardTokenInfoResponse setCustomClaim(String customClaim) {
    this.customClaim = customClaim;
    return this;
  }

  public String getCustomClaim() {
    return customClaim;
  }

  public GetPublishedDashboardTokenInfoResponse setScope(String scope) {
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
    GetPublishedDashboardTokenInfoResponse that = (GetPublishedDashboardTokenInfoResponse) o;
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
    return new ToStringer(GetPublishedDashboardTokenInfoResponse.class)
        .add("authorizationDetails", authorizationDetails)
        .add("customClaim", customClaim)
        .add("scope", scope)
        .toString();
  }
}
