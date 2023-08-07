// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ExperimentPermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<ExperimentAccessControlRequest> accessControlList;

  /** The experiment for which to get or manage permissions. */
  private String experimentId;

  public ExperimentPermissionsRequest setAccessControlList(
      Collection<ExperimentAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<ExperimentAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public ExperimentPermissionsRequest setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExperimentPermissionsRequest that = (ExperimentPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(experimentId, that.experimentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, experimentId);
  }

  @Override
  public String toString() {
    return new ToStringer(ExperimentPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("experimentId", experimentId)
        .toString();
  }
}
