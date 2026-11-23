// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateSupervisorAgentRequest {
  /**
   * The resource name of the Supervisor Agent. Format: supervisor-agents/{supervisor_agent_id} The
   * server assigns the name when the agent is created.
   */
  @JsonIgnore private String name;

  /**
   * The Supervisor Agent to update. `name` identifies the agent. The other fields carry the new
   * values for the paths listed in `update_mask`.
   */
  @JsonProperty("supervisor_agent")
  private SupervisorAgent supervisorAgent;

  /**
   * Comma-separated list of the fields to update. Supported values are `display_name`,
   * `description` and `instructions`. The request fails if the mask is empty or names any other
   * field.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateSupervisorAgentRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSupervisorAgentRequest setSupervisorAgent(SupervisorAgent supervisorAgent) {
    this.supervisorAgent = supervisorAgent;
    return this;
  }

  public SupervisorAgent getSupervisorAgent() {
    return supervisorAgent;
  }

  public UpdateSupervisorAgentRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateSupervisorAgentRequest that = (UpdateSupervisorAgentRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(supervisorAgent, that.supervisorAgent)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, supervisorAgent, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSupervisorAgentRequest.class)
        .add("name", name)
        .add("supervisorAgent", supervisorAgent)
        .add("updateMask", updateMask)
        .toString();
  }
}
