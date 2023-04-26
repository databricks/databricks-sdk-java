// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The general workspace configurations that are specific to Google Cloud.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CustomerFacingGcpCloudResourceContainer {
  /**
   * The Google Cloud project ID, which the workspace uses to instantiate cloud resources for your
   * workspace.
   */
  @JsonProperty("project_id")
  private String projectId;

  /**
   * <p>Setter for the field <code>projectId</code>.</p>
   *
   * @param projectId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CustomerFacingGcpCloudResourceContainer} object
   */
  public CustomerFacingGcpCloudResourceContainer setProjectId(String projectId) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingGcpCloudResourceContainer that = (CustomerFacingGcpCloudResourceContainer) o;
    return Objects.equals(projectId, that.projectId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(projectId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CustomerFacingGcpCloudResourceContainer.class)
        .add("projectId", projectId)
        .toString();
  }
}
