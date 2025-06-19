// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using =
        GetPublishedDashboardTokenInfoResponse.GetPublishedDashboardTokenInfoResponseSerializer
            .class)
@JsonDeserialize(
    using =
        GetPublishedDashboardTokenInfoResponse.GetPublishedDashboardTokenInfoResponseDeserializer
            .class)
public class GetPublishedDashboardTokenInfoResponse {
  /**
   * Authorization constraints for accessing the published dashboard. Currently includes
   * `workspace_rule_set` and could be enriched with `unity_catalog_privileges` before oAuth token
   * generation.
   */
  private Collection<AuthorizationDetails> authorizationDetails;

  /**
   * Custom claim generated from external_value and external_viewer_id. Format:
   * `urn:aibi:external_data:<external_value>:<external_viewer_id>:<dashboard_id>`
   */
  private String customClaim;

  /** Scope defining access permissions. */
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

  GetPublishedDashboardTokenInfoResponsePb toPb() {
    GetPublishedDashboardTokenInfoResponsePb pb = new GetPublishedDashboardTokenInfoResponsePb();
    pb.setAuthorizationDetails(authorizationDetails);
    pb.setCustomClaim(customClaim);
    pb.setScope(scope);

    return pb;
  }

  static GetPublishedDashboardTokenInfoResponse fromPb(
      GetPublishedDashboardTokenInfoResponsePb pb) {
    GetPublishedDashboardTokenInfoResponse model = new GetPublishedDashboardTokenInfoResponse();
    model.setAuthorizationDetails(pb.getAuthorizationDetails());
    model.setCustomClaim(pb.getCustomClaim());
    model.setScope(pb.getScope());

    return model;
  }

  public static class GetPublishedDashboardTokenInfoResponseSerializer
      extends JsonSerializer<GetPublishedDashboardTokenInfoResponse> {
    @Override
    public void serialize(
        GetPublishedDashboardTokenInfoResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetPublishedDashboardTokenInfoResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPublishedDashboardTokenInfoResponseDeserializer
      extends JsonDeserializer<GetPublishedDashboardTokenInfoResponse> {
    @Override
    public GetPublishedDashboardTokenInfoResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPublishedDashboardTokenInfoResponsePb pb =
          mapper.readValue(p, GetPublishedDashboardTokenInfoResponsePb.class);
      return GetPublishedDashboardTokenInfoResponse.fromPb(pb);
    }
  }
}
