// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
