// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;

/**
 * Manage legacy Supervisor Agents and related resources.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface SupervisorAgentsService {
  /** Creates an example for a Supervisor Agent. */
  Example createExample(CreateExampleRequest createExampleRequest);

  /**
   * Creates a Supervisor Agent together with its serving endpoint and MLflow experiment. Tools and
   * subagents are added to the agent afterwards with the Tool methods.
   */
  SupervisorAgent createSupervisorAgent(CreateSupervisorAgentRequest createSupervisorAgentRequest);

  /**
   * Creates a Tool under a Supervisor Agent. Specify one of "genie_space", "knowledge_assistant",
   * "uc_function", "uc_connection", "app", "volume", "dashboard", "table", "vector_search_index",
   * "catalog", "schema", "supervisor_agent", "databricks_web_search", "skill" in the request body.
   * The legacy values "lakeview_dashboard", "uc_table", and "web_search" are also accepted and
   * remain equivalent to "dashboard", "table", and "databricks_web_search" respectively. The
   * "databricks_web_search" tool_type maps to the `web_search` spec field.
   */
  Tool createTool(CreateToolRequest createToolRequest);

  /** Deletes an example from a Supervisor Agent. */
  void deleteExample(DeleteExampleRequest deleteExampleRequest);

  /**
   * Deletes a Supervisor Agent together with the resources created for it, including its tools,
   * examples, serving endpoint and MLflow experiment.
   */
  void deleteSupervisorAgent(DeleteSupervisorAgentRequest deleteSupervisorAgentRequest);

  /** Deletes a Tool. */
  void deleteTool(DeleteToolRequest deleteToolRequest);

  /** Gets an example from a Supervisor Agent. */
  Example getExample(GetExampleRequest getExampleRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetSupervisorAgentPermissionLevelsResponse getPermissionLevels(
      GetSupervisorAgentPermissionLevelsRequest getSupervisorAgentPermissionLevelsRequest);

  /**
   * Gets the permissions of a supervisor agent. Supervisor agents can inherit permissions from
   * their root object.
   */
  SupervisorAgentPermissions getPermissions(
      GetSupervisorAgentPermissionsRequest getSupervisorAgentPermissionsRequest);

  /** Gets a Supervisor Agent. */
  SupervisorAgent getSupervisorAgent(GetSupervisorAgentRequest getSupervisorAgentRequest);

  /** Gets a Tool. */
  Tool getTool(GetToolRequest getToolRequest);

  /** Lists examples under a Supervisor Agent. */
  ListExamplesResponse listExamples(ListExamplesRequest listExamplesRequest);

  /** Lists the Supervisor Agents in the workspace that the caller has permission to view. */
  ListSupervisorAgentsResponse listSupervisorAgents(
      ListSupervisorAgentsRequest listSupervisorAgentsRequest);

  /** Lists Tools under a Supervisor Agent. */
  ListToolsResponse listTools(ListToolsRequest listToolsRequest);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  SupervisorAgentPermissions setPermissions(
      SupervisorAgentPermissionsRequest supervisorAgentPermissionsRequest);

  /** Updates an example in a Supervisor Agent. */
  Example updateExample(UpdateExampleRequest updateExampleRequest);

  /**
   * Updates the permissions on a supervisor agent. Supervisor agents can inherit permissions from
   * their root object.
   */
  SupervisorAgentPermissions updatePermissions(
      SupervisorAgentPermissionsRequest supervisorAgentPermissionsRequest);

  /**
   * Updates a Supervisor Agent. Only the fields listed in `update_mask` are changed. All other
   * fields keep their current values.
   */
  SupervisorAgent updateSupervisorAgent(UpdateSupervisorAgentRequest updateSupervisorAgentRequest);

  /**
   * Updates a Tool. Only the `description` field can be updated. To change immutable fields such as
   * tool type, spec, or tool ID, delete the tool and recreate it.
   */
  Tool updateTool(UpdateToolRequest updateToolRequest);
}
