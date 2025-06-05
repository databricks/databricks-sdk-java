// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DbtCloudTask {
  /** The resource name of the UC connection that authenticates the dbt Cloud for this task */
  @JsonProperty("connection_resource_name")
  private String connectionResourceName;

  /** Id of the dbt Cloud job to be triggered */
  @JsonProperty("dbt_cloud_job_id")
  private Long dbtCloudJobId;

  public DbtCloudTask setConnectionResourceName(String connectionResourceName) {
    this.connectionResourceName = connectionResourceName;
    return this;
  }

  public String getConnectionResourceName() {
    return connectionResourceName;
  }

  public DbtCloudTask setDbtCloudJobId(Long dbtCloudJobId) {
    this.dbtCloudJobId = dbtCloudJobId;
    return this;
  }

  public Long getDbtCloudJobId() {
    return dbtCloudJobId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtCloudTask that = (DbtCloudTask) o;
    return Objects.equals(connectionResourceName, that.connectionResourceName)
        && Objects.equals(dbtCloudJobId, that.dbtCloudJobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionResourceName, dbtCloudJobId);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtCloudTask.class)
        .add("connectionResourceName", connectionResourceName)
        .add("dbtCloudJobId", dbtCloudJobId)
        .toString();
  }
}
