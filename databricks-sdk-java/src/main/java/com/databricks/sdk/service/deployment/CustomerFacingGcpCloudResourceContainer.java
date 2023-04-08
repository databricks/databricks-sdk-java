// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The general workspace configurations that are specific to Google Cloud. */
public class CustomerFacingGcpCloudResourceContainer {
  /**
   * The Google Cloud project ID, which the workspace uses to instantiate cloud resources for your
   * workspace.
   */
  @JsonProperty("project_id")
  private String projectId;

  public CustomerFacingGcpCloudResourceContainer setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingGcpCloudResourceContainer that = (CustomerFacingGcpCloudResourceContainer) o;
    return Objects.equals(projectId, that.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingGcpCloudResourceContainer.class)
        .add("projectId", projectId)
        .toString();
  }
}
