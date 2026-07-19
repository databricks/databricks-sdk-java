// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GcpPscEndpointInfo {
  /**
   * The GCP region of the PSC connection endpoint. Provided by the customer when registering an
   * existing PSC endpoint. GCP supports only same-region PSC, so this must match the workspace
   * region.
   */
  @JsonProperty("endpoint_region")
  private String endpointRegion;

  /**
   * The GCP consumer project ID in which this PSC endpoint is created. Provided by the customer
   * when registering an existing PSC endpoint.
   */
  @JsonProperty("project_id")
  private String projectId;

  /**
   * The ID of the underlying Private Service Connect connection in the GCP consumer project,
   * assigned by GCP when the PSC connection is created.
   */
  @JsonProperty("psc_connection_id")
  private String pscConnectionId;

  /**
   * The name of this PSC connection in the GCP consumer project. Provided by the customer when
   * registering an existing PSC endpoint.
   */
  @JsonProperty("psc_endpoint")
  private String pscEndpoint;

  /** The ID of the Databricks service attachment this PSC endpoint connects to. */
  @JsonProperty("service_attachment_id")
  private String serviceAttachmentId;

  public GcpPscEndpointInfo setEndpointRegion(String endpointRegion) {
    this.endpointRegion = endpointRegion;
    return this;
  }

  public String getEndpointRegion() {
    return endpointRegion;
  }

  public GcpPscEndpointInfo setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public GcpPscEndpointInfo setPscConnectionId(String pscConnectionId) {
    this.pscConnectionId = pscConnectionId;
    return this;
  }

  public String getPscConnectionId() {
    return pscConnectionId;
  }

  public GcpPscEndpointInfo setPscEndpoint(String pscEndpoint) {
    this.pscEndpoint = pscEndpoint;
    return this;
  }

  public String getPscEndpoint() {
    return pscEndpoint;
  }

  public GcpPscEndpointInfo setServiceAttachmentId(String serviceAttachmentId) {
    this.serviceAttachmentId = serviceAttachmentId;
    return this;
  }

  public String getServiceAttachmentId() {
    return serviceAttachmentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpPscEndpointInfo that = (GcpPscEndpointInfo) o;
    return Objects.equals(endpointRegion, that.endpointRegion)
        && Objects.equals(projectId, that.projectId)
        && Objects.equals(pscConnectionId, that.pscConnectionId)
        && Objects.equals(pscEndpoint, that.pscEndpoint)
        && Objects.equals(serviceAttachmentId, that.serviceAttachmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        endpointRegion, projectId, pscConnectionId, pscEndpoint, serviceAttachmentId);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpPscEndpointInfo.class)
        .add("endpointRegion", endpointRegion)
        .add("projectId", projectId)
        .add("pscConnectionId", pscConnectionId)
        .add("pscEndpoint", pscEndpoint)
        .add("serviceAttachmentId", serviceAttachmentId)
        .toString();
  }
}
