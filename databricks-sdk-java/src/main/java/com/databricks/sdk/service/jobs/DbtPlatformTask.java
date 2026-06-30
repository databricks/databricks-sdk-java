// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DbtPlatformTask {
  /** The resource name of the UC connection that authenticates the dbt platform for this task */
  @JsonProperty("connection_resource_name")
  private String connectionResourceName;

  /**
   * Id of the dbt platform job to be triggered. Specified as a string for maximum compatibility
   * with clients.
   */
  @JsonProperty("dbt_platform_job_id")
  private String dbtPlatformJobId;

  public DbtPlatformTask setConnectionResourceName(String connectionResourceName) {
    this.connectionResourceName = connectionResourceName;
    return this;
  }

  public String getConnectionResourceName() {
    return connectionResourceName;
  }

  public DbtPlatformTask setDbtPlatformJobId(String dbtPlatformJobId) {
    this.dbtPlatformJobId = dbtPlatformJobId;
    return this;
  }

  public String getDbtPlatformJobId() {
    return dbtPlatformJobId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtPlatformTask that = (DbtPlatformTask) o;
    return Objects.equals(connectionResourceName, that.connectionResourceName)
        && Objects.equals(dbtPlatformJobId, that.dbtPlatformJobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionResourceName, dbtPlatformJobId);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtPlatformTask.class)
        .add("connectionResourceName", connectionResourceName)
        .add("dbtPlatformJobId", dbtPlatformJobId)
        .toString();
  }
}
