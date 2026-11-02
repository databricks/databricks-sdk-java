// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateGenieAgentRequest {
  /** The Genie Agent to create. */
  @JsonProperty("genie_agent")
  private GenieAgent genieAgent;

  /**
   * The ID for the new Genie Agent: 32 lowercase hexadecimal characters (a UUID without dashes),
   * not all zeros. Assigned by the server if omitted. Fails with ALREADY_EXISTS if the ID is in use
   * in the workspace, including by a Genie Agent in the trash, or PERMISSION_DENIED if the caller
   * cannot view the Genie Agent using it.
   */
  @JsonIgnore
  @QueryParam("genie_agent_id")
  private String genieAgentId;

  public CreateGenieAgentRequest setGenieAgent(GenieAgent genieAgent) {
    this.genieAgent = genieAgent;
    return this;
  }

  public GenieAgent getGenieAgent() {
    return genieAgent;
  }

  public CreateGenieAgentRequest setGenieAgentId(String genieAgentId) {
    this.genieAgentId = genieAgentId;
    return this;
  }

  public String getGenieAgentId() {
    return genieAgentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateGenieAgentRequest that = (CreateGenieAgentRequest) o;
    return Objects.equals(genieAgent, that.genieAgent)
        && Objects.equals(genieAgentId, that.genieAgentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genieAgent, genieAgentId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateGenieAgentRequest.class)
        .add("genieAgent", genieAgent)
        .add("genieAgentId", genieAgentId)
        .toString();
  }
}
