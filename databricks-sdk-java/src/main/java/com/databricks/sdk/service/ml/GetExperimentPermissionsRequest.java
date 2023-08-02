// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get experiment permissions */
@Generated
public class GetExperimentPermissionsRequest {
  /** The experiment for which to get or manage permissions. */
  private String experimentId;

  public GetExperimentPermissionsRequest setExperimentId(String experimentId) {
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
    GetExperimentPermissionsRequest that = (GetExperimentPermissionsRequest) o;
    return Objects.equals(experimentId, that.experimentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExperimentPermissionsRequest.class)
        .add("experimentId", experimentId)
        .toString();
  }
}
