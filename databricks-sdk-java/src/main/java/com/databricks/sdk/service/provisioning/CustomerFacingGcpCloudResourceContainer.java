// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CustomerFacingGcpCloudResourceContainer {
  /** */
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
