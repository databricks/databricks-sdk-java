// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GcpEndpoint {
  /** All Google APIs that support VPC Service Controls (a subset of all Google APIs). */
  @JsonProperty("all_vpc_sc_services")
  private Boolean allVpcScServices;

  /** Selected Google API hostnames, e.g. "storage.googleapis.com", "bigquery.googleapis.com". */
  @JsonProperty("google_api_endpoints")
  private GoogleApiEndpoints googleApiEndpoints;

  /** Output only. The URI of the created PSC endpoint. */
  @JsonProperty("psc_endpoint_uri")
  private String pscEndpointUri;

  /**
   * The full url of the target service attachment. Example:
   * projects/my-gcp-project/regions/us-east4/serviceAttachments/my-service-attachment
   */
  @JsonProperty("service_attachment")
  private String serviceAttachment;

  public GcpEndpoint setAllVpcScServices(Boolean allVpcScServices) {
    this.allVpcScServices = allVpcScServices;
    return this;
  }

  public Boolean getAllVpcScServices() {
    return allVpcScServices;
  }

  public GcpEndpoint setGoogleApiEndpoints(GoogleApiEndpoints googleApiEndpoints) {
    this.googleApiEndpoints = googleApiEndpoints;
    return this;
  }

  public GoogleApiEndpoints getGoogleApiEndpoints() {
    return googleApiEndpoints;
  }

  public GcpEndpoint setPscEndpointUri(String pscEndpointUri) {
    this.pscEndpointUri = pscEndpointUri;
    return this;
  }

  public String getPscEndpointUri() {
    return pscEndpointUri;
  }

  public GcpEndpoint setServiceAttachment(String serviceAttachment) {
    this.serviceAttachment = serviceAttachment;
    return this;
  }

  public String getServiceAttachment() {
    return serviceAttachment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpEndpoint that = (GcpEndpoint) o;
    return Objects.equals(allVpcScServices, that.allVpcScServices)
        && Objects.equals(googleApiEndpoints, that.googleApiEndpoints)
        && Objects.equals(pscEndpointUri, that.pscEndpointUri)
        && Objects.equals(serviceAttachment, that.serviceAttachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allVpcScServices, googleApiEndpoints, pscEndpointUri, serviceAttachment);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpEndpoint.class)
        .add("allVpcScServices", allVpcScServices)
        .add("googleApiEndpoints", googleApiEndpoints)
        .add("pscEndpointUri", pscEndpointUri)
        .add("serviceAttachment", serviceAttachment)
        .toString();
  }
}
