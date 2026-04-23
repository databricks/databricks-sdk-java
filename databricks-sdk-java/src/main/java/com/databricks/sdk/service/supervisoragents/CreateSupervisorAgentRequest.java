// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateSupervisorAgentRequest {
  /** The Supervisor Agent to create. */
  @JsonProperty("supervisor_agent")
  private SupervisorAgent supervisorAgent;

  public CreateSupervisorAgentRequest setSupervisorAgent(SupervisorAgent supervisorAgent) {
    this.supervisorAgent = supervisorAgent;
    return this;
  }

  public SupervisorAgent getSupervisorAgent() {
    return supervisorAgent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSupervisorAgentRequest that = (CreateSupervisorAgentRequest) o;
    return Objects.equals(supervisorAgent, that.supervisorAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supervisorAgent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSupervisorAgentRequest.class)
        .add("supervisorAgent", supervisorAgent)
        .toString();
  }
}
