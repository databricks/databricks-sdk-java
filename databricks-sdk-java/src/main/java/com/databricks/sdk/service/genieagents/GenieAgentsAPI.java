// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * Genie provides a no-code experience for business users, powered by AI/BI. Analysts set up Genie
 * Agents that business users can use to ask questions using natural language. Genie uses data
 * registered to Unity Catalog and requires at least CAN USE permission on a Pro or Serverless SQL
 * warehouse. Also, Databricks Assistant must be enabled.
 */
@Generated
public class GenieAgentsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(GenieAgentsAPI.class);

  private final GenieAgentsService impl;

  /** Regular-use constructor */
  public GenieAgentsAPI(ApiClient apiClient) {
    impl = new GenieAgentsImpl(apiClient);
  }

  /** Constructor for mocks */
  public GenieAgentsAPI(GenieAgentsService mock) {
    impl = mock;
  }

  /** Creates a Genie Agent. */
  public GenieAgent createGenieAgent(CreateGenieAgentRequest request) {
    return impl.createGenieAgent(request);
  }

  public void deleteGenieAgent(String name) {
    deleteGenieAgent(new DeleteGenieAgentRequest().setName(name));
  }

  /** Deletes a Genie Agent, moving it to trash. */
  public void deleteGenieAgent(DeleteGenieAgentRequest request) {
    impl.deleteGenieAgent(request);
  }

  public GenieAgent getGenieAgent(String name) {
    return getGenieAgent(new GetGenieAgentRequest().setName(name));
  }

  /** Gets a Genie Agent. */
  public GenieAgent getGenieAgent(GetGenieAgentRequest request) {
    return impl.getGenieAgent(request);
  }

  /**
   * Lists the Genie Agents in the workspace. Genie Agents created from an integration (for example,
   * from a dashboard) are not listed.
   */
  public Iterable<GenieAgent> listGenieAgents(ListGenieAgentsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listGenieAgents,
        ListGenieAgentsResponse::getGenieAgents,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Updates a Genie Agent. Only the fields named in update_mask are applied. */
  public GenieAgent updateGenieAgent(UpdateGenieAgentRequest request) {
    return impl.updateGenieAgent(request);
  }

  public GenieAgentsService impl() {
    return impl;
  }
}
