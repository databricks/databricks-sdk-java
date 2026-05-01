// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SupervisorAgentPermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<SupervisorAgentAccessControlRequest> accessControlList;

  /** The supervisor agent for which to get or manage permissions. */
  @JsonIgnore private String supervisorAgentId;

  public SupervisorAgentPermissionsRequest setAccessControlList(
      Collection<SupervisorAgentAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<SupervisorAgentAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public SupervisorAgentPermissionsRequest setSupervisorAgentId(String supervisorAgentId) {
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
    SupervisorAgentPermissionsRequest that = (SupervisorAgentPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(supervisorAgentId, that.supervisorAgentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, supervisorAgentId);
  }

  @Override
  public String toString() {
    return new ToStringer(SupervisorAgentPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("supervisorAgentId", supervisorAgentId)
        .toString();
  }
}
