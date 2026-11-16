// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetAppDeploymentScanFindingRequest {
  /**
   * The resource name of the finding, in the form
   * `apps/{app}/deployments/{deployment}/scanFindings/{finding_id}`.
   */
  @JsonIgnore private String name;

  public GetAppDeploymentScanFindingRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAppDeploymentScanFindingRequest that = (GetAppDeploymentScanFindingRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAppDeploymentScanFindingRequest.class).add("name", name).toString();
  }
}
