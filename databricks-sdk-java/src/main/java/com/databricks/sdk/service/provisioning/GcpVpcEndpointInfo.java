// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GcpVpcEndpointInfo {
  /** */
  @JsonProperty("endpoint_region")
  private String endpointRegion;

  /** */
  @JsonProperty("project_id")
  private String projectId;

  /** */
  @JsonProperty("psc_connection_id")
  private String pscConnectionId;

  /** */
  @JsonProperty("psc_endpoint_name")
  private String pscEndpointName;

  /** */
  @JsonProperty("service_attachment_id")
  private String serviceAttachmentId;

  public GcpVpcEndpointInfo setEndpointRegion(String endpointRegion) {
    this.endpointRegion = endpointRegion;
    return this;
  }

  public String getEndpointRegion() {
    return endpointRegion;
  }

  public GcpVpcEndpointInfo setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public GcpVpcEndpointInfo setPscConnectionId(String pscConnectionId) {
    this.pscConnectionId = pscConnectionId;
    return this;
  }

  public String getPscConnectionId() {
    return pscConnectionId;
  }

  public GcpVpcEndpointInfo setPscEndpointName(String pscEndpointName) {
    this.pscEndpointName = pscEndpointName;
    return this;
  }

  public String getPscEndpointName() {
    return pscEndpointName;
  }

  public GcpVpcEndpointInfo setServiceAttachmentId(String serviceAttachmentId) {
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
    GcpVpcEndpointInfo that = (GcpVpcEndpointInfo) o;
    return Objects.equals(endpointRegion, that.endpointRegion)
        && Objects.equals(projectId, that.projectId)
        && Objects.equals(pscConnectionId, that.pscConnectionId)
        && Objects.equals(pscEndpointName, that.pscEndpointName)
        && Objects.equals(serviceAttachmentId, that.serviceAttachmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        endpointRegion, projectId, pscConnectionId, pscEndpointName, serviceAttachmentId);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpVpcEndpointInfo.class)
        .add("endpointRegion", endpointRegion)
        .add("projectId", projectId)
        .add("pscConnectionId", pscConnectionId)
        .add("pscEndpointName", pscEndpointName)
        .add("serviceAttachmentId", serviceAttachmentId)
        .toString();
  }
}
