// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetSupervisorAgentPermissionsRequest {
  /** The supervisor agent for which to get or manage permissions. */
  @JsonIgnore private String supervisorAgentId;

  public GetSupervisorAgentPermissionsRequest setSupervisorAgentId(String supervisorAgentId) {
    this.supervisorAgentId = supervisorAgentId;
    return this;
  }

  public String getSupervisorAgentId() {
    return supervisorAgentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSupervisorAgentPermissionsRequest that = (GetSupervisorAgentPermissionsRequest) o;
    return Objects.equals(supervisorAgentId, that.supervisorAgentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supervisorAgentId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSupervisorAgentPermissionsRequest.class)
        .add("supervisorAgentId", supervisorAgentId)
        .toString();
  }
}
