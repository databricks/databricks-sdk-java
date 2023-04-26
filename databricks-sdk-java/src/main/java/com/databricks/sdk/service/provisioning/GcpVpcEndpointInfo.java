// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The Google Cloud specific information for this Private Service Connect endpoint.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GcpVpcEndpointInfo {
  /** Region of the PSC endpoint. */
  @JsonProperty("endpoint_region")
  private String endpointRegion;

  /** The Google Cloud project ID of the VPC network where the PSC connection resides. */
  @JsonProperty("project_id")
  private String projectId;

  /** The unique ID of this PSC connection. */
  @JsonProperty("psc_connection_id")
  private String pscConnectionId;

  /** The name of the PSC endpoint in the Google Cloud project. */
  @JsonProperty("psc_endpoint_name")
  private String pscEndpointName;

  /** The service attachment this PSC connection connects to. */
  @JsonProperty("service_attachment_id")
  private String serviceAttachmentId;

  /**
   * <p>Setter for the field <code>endpointRegion</code>.</p>
   *
   * @param endpointRegion a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GcpVpcEndpointInfo} object
   */
  public GcpVpcEndpointInfo setEndpointRegion(String endpointRegion) {
    this.endpointRegion = endpointRegion;
    return this;
  }

  /**
   * <p>Getter for the field <code>endpointRegion</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEndpointRegion() {
    return endpointRegion;
  }

  /**
   * <p>Setter for the field <code>projectId</code>.</p>
   *
   * @param projectId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GcpVpcEndpointInfo} object
   */
  public GcpVpcEndpointInfo setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * <p>Getter for the field <code>projectId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * <p>Setter for the field <code>pscConnectionId</code>.</p>
   *
   * @param pscConnectionId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GcpVpcEndpointInfo} object
   */
  public GcpVpcEndpointInfo setPscConnectionId(String pscConnectionId) {
    this.pscConnectionId = pscConnectionId;
    return this;
  }

  /**
   * <p>Getter for the field <code>pscConnectionId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPscConnectionId() {
    return pscConnectionId;
  }

  /**
   * <p>Setter for the field <code>pscEndpointName</code>.</p>
   *
   * @param pscEndpointName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GcpVpcEndpointInfo} object
   */
  public GcpVpcEndpointInfo setPscEndpointName(String pscEndpointName) {
    this.pscEndpointName = pscEndpointName;
    return this;
  }

  /**
   * <p>Getter for the field <code>pscEndpointName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPscEndpointName() {
    return pscEndpointName;
  }

  /**
   * <p>Setter for the field <code>serviceAttachmentId</code>.</p>
   *
   * @param serviceAttachmentId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GcpVpcEndpointInfo} object
   */
  public GcpVpcEndpointInfo setServiceAttachmentId(String serviceAttachmentId) {
    this.serviceAttachmentId = serviceAttachmentId;
    return this;
  }

  /**
   * <p>Getter for the field <code>serviceAttachmentId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getServiceAttachmentId() {
    return serviceAttachmentId;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        endpointRegion, projectId, pscConnectionId, pscEndpointName, serviceAttachmentId);
  }

  /** {@inheritDoc} */
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
