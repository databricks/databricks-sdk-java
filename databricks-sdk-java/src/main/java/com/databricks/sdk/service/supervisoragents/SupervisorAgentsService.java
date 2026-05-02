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
  /** Creates an example for a Supervisor Agent. */
  Example createExample(CreateExampleRequest createExampleRequest);

  /** Creates a new Supervisor Agent. */
  SupervisorAgent createSupervisorAgent(CreateSupervisorAgentRequest createSupervisorAgentRequest);

  /**
   * Creates a Tool under a Supervisor Agent. Specify one of "genie_space", "knowledge_assistant",
   * "uc_function", "uc_connection", "app", "volume", "lakeview_dashboard", "uc_table",
   * "vector_search_index", "catalog", "schema", "supervisor_agent" in the request body.
   */
  Tool createTool(CreateToolRequest createToolRequest);

  /** Deletes an example from a Supervisor Agent. */
  void deleteExample(DeleteExampleRequest deleteExampleRequest);

  /** Deletes a Supervisor Agent. */
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

  /** Lists Supervisor Agents. */
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
