// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;

/**
 * Manage Supervisor Agents and related resources.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface SupervisorAgentsService {
  /** Creates a new Supervisor Agent. */
  SupervisorAgent createSupervisorAgent(CreateSupervisorAgentRequest createSupervisorAgentRequest);

  /**
   * Creates a Tool under a Supervisor Agent. Specify one of "genie_space", "knowledge_assistant",
   * "uc_function", "uc_connection", "app", "volume", "lakeview_dashboard", "uc_table",
   * "vector_search_index" in the request body.
   */
  Tool createTool(CreateToolRequest createToolRequest);

  /** Deletes a Supervisor Agent. */
  void deleteSupervisorAgent(DeleteSupervisorAgentRequest deleteSupervisorAgentRequest);

  /** Deletes a Tool. */
  void deleteTool(DeleteToolRequest deleteToolRequest);

  /** Gets a Supervisor Agent. */
  SupervisorAgent getSupervisorAgent(GetSupervisorAgentRequest getSupervisorAgentRequest);

  /** Gets a Tool. */
  Tool getTool(GetToolRequest getToolRequest);

  /** Lists Supervisor Agents. */
  ListSupervisorAgentsResponse listSupervisorAgents(
      ListSupervisorAgentsRequest listSupervisorAgentsRequest);

  /** Lists Tools under a Supervisor Agent. */
  ListToolsResponse listTools(ListToolsRequest listToolsRequest);

  /**
   * Updates a Supervisor Agent. The fields that are required depend on the paths specified in
   * `update_mask`. Only fields included in the mask will be updated.
   */
  SupervisorAgent updateSupervisorAgent(UpdateSupervisorAgentRequest updateSupervisorAgentRequest);

  /**
   * Updates a Tool. Only the `description` field can be updated. To change immutable fields such as
   * tool type, spec, or tool ID, delete the tool and recreate it.
   */
  Tool updateTool(UpdateToolRequest updateToolRequest);
}
