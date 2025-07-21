// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FailoverDatabaseInstanceRequest {
  /** */
  @JsonProperty("failover_target_database_instance_name")
  private String failoverTargetDatabaseInstanceName;

  /** Name of the instance to failover. */
  @JsonIgnore private String name;

  public FailoverDatabaseInstanceRequest setFailoverTargetDatabaseInstanceName(
      String failoverTargetDatabaseInstanceName) {
    this.failoverTargetDatabaseInstanceName = failoverTargetDatabaseInstanceName;
    return this;
  }

  public String getFailoverTargetDatabaseInstanceName() {
    return failoverTargetDatabaseInstanceName;
  }

  public FailoverDatabaseInstanceRequest setName(String name) {
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
    FailoverDatabaseInstanceRequest that = (FailoverDatabaseInstanceRequest) o;
    return Objects.equals(
            failoverTargetDatabaseInstanceName, that.failoverTargetDatabaseInstanceName)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failoverTargetDatabaseInstanceName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(FailoverDatabaseInstanceRequest.class)
        .add("failoverTargetDatabaseInstanceName", failoverTargetDatabaseInstanceName)
        .add("name", name)
        .toString();
  }
}
