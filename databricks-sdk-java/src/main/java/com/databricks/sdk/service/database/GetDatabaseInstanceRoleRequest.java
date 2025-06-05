// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a role for a Database Instance */
@Generated
public class GetDatabaseInstanceRoleRequest {
  /** */
  @JsonIgnore private String instanceName;

  /** */
  @JsonIgnore private String name;

  public GetDatabaseInstanceRoleRequest setInstanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  public String getInstanceName() {
    return instanceName;
  }

  public GetDatabaseInstanceRoleRequest setName(String name) {
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
    GetDatabaseInstanceRoleRequest that = (GetDatabaseInstanceRoleRequest) o;
    return Objects.equals(instanceName, that.instanceName) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDatabaseInstanceRoleRequest.class)
        .add("instanceName", instanceName)
        .add("name", name)
        .toString();
  }
}
