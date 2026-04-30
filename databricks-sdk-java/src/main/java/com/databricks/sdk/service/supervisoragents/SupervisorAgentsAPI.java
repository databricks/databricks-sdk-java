// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** Manage Supervisor Agents and related resources. */
@Generated
public class SupervisorAgentsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SupervisorAgentsAPI.class);

  private final SupervisorAgentsService impl;

  /** Regular-use constructor */
  public SupervisorAgentsAPI(ApiClient apiClient) {
    impl = new SupervisorAgentsImpl(apiClient);
  }

  /** Constructor for mocks */
  public SupervisorAgentsAPI(SupervisorAgentsService mock) {
    impl = mock;
  }

  /** Creates a new Supervisor Agent. */
  public SupervisorAgent createSupervisorAgent(CreateSupervisorAgentRequest request) {
    return impl.createSupervisorAgent(request);
  }

  /**
   * Creates a Tool under a Supervisor Agent. Specify one of "genie_space", "knowledge_assistant",
   * "uc_function", "uc_connection", "app", "volume", "lakeview_dashboard", "uc_table",
   * "vector_search_index" in the request body.
   */
  public Tool createTool(CreateToolRequest request) {
    return impl.createTool(request);
  }

  public void deleteSupervisorAgent(String name) {
    deleteSupervisorAgent(new DeleteSupervisorAgentRequest().setName(name));
  }

  /** Deletes a Supervisor Agent. */
  public void deleteSupervisorAgent(DeleteSupervisorAgentRequest request) {
    impl.deleteSupervisorAgent(request);
  }

  public void deleteTool(String name) {
    deleteTool(new DeleteToolRequest().setName(name));
  }

  /** Deletes a Tool. */
  public void deleteTool(DeleteToolRequest request) {
    impl.deleteTool(request);
  }

  public SupervisorAgent getSupervisorAgent(String name) {
    return getSupervisorAgent(new GetSupervisorAgentRequest().setName(name));
  }

  /** Gets a Supervisor Agent. */
  public SupervisorAgent getSupervisorAgent(GetSupervisorAgentRequest request) {
    return impl.getSupervisorAgent(request);
  }

  public Tool getTool(String name) {
    return getTool(new GetToolRequest().setName(name));
  }

  /** Gets a Tool. */
  public Tool getTool(GetToolRequest request) {
    return impl.getTool(request);
  }

  /** Lists Supervisor Agents. */
  public Iterable<SupervisorAgent> listSupervisorAgents(ListSupervisorAgentsRequest request) {
    return new Paginator<>(
        request,
        impl::listSupervisorAgents,
        ListSupervisorAgentsResponse::getSupervisorAgents,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Tool> listTools(String parent) {
    return listTools(new ListToolsRequest().setParent(parent));
  }

  /** Lists Tools under a Supervisor Agent. */
  public Iterable<Tool> listTools(ListToolsRequest request) {
    return new Paginator<>(
        request,
        impl::listTools,
        ListToolsResponse::getTools,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Updates a Supervisor Agent. The fields that are required depend on the paths specified in
   * `update_mask`. Only fields included in the mask will be updated.
   */
  public SupervisorAgent updateSupervisorAgent(UpdateSupervisorAgentRequest request) {
    return impl.updateSupervisorAgent(request);
  }

  /**
   * Updates a Tool. Only the `description` field can be updated. To change immutable fields such as
   * tool type, spec, or tool ID, delete the tool and recreate it.
   */
  public Tool updateTool(UpdateToolRequest request) {
    return impl.updateTool(request);
  }

  public SupervisorAgentsService impl() {
    return impl;
  }
}
