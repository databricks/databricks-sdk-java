// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GcpEndpointSpec {
  /** Output only. The URI of the created PSC endpoint. */
  @JsonProperty("psc_endpoint_uri")
  private String pscEndpointUri;

  /**
   * The full url of the target service attachment. Example:
   * projects/my-gcp-project/regions/us-east4/serviceAttachments/my-service-attachment
   */
  @JsonProperty("service_attachment")
  private String serviceAttachment;

  public GcpEndpointSpec setPscEndpointUri(String pscEndpointUri) {
    this.pscEndpointUri = pscEndpointUri;
    return this;
  }

  public String getPscEndpointUri() {
    return pscEndpointUri;
  }

  public GcpEndpointSpec setServiceAttachment(String serviceAttachment) {
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
    GcpEndpointSpec that = (GcpEndpointSpec) o;
    return Objects.equals(pscEndpointUri, that.pscEndpointUri)
        && Objects.equals(serviceAttachment, that.serviceAttachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pscEndpointUri, serviceAttachment);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpEndpointSpec.class)
        .add("pscEndpointUri", pscEndpointUri)
        .add("serviceAttachment", serviceAttachment)
        .toString();
  }
}
