// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;

/**
 * Genie provides a no-code experience for business users, powered by AI/BI. Analysts set up Genie
 * Agents that business users can use to ask questions using natural language. Genie uses data
 * registered to Unity Catalog and requires at least CAN USE permission on a Pro or Serverless SQL
 * warehouse. Also, Databricks Assistant must be enabled.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface GenieAgentsService {
  /** Creates a Genie Agent. */
  GenieAgent createGenieAgent(CreateGenieAgentRequest createGenieAgentRequest);

  /** Deletes a Genie Agent, moving it to trash. */
  void deleteGenieAgent(DeleteGenieAgentRequest deleteGenieAgentRequest);

  /** Gets a Genie Agent. */
  GenieAgent getGenieAgent(GetGenieAgentRequest getGenieAgentRequest);

  /**
   * Lists the Genie Agents in the workspace. Genie Agents created from an integration (for example,
   * from a dashboard) are not listed.
   */
  ListGenieAgentsResponse listGenieAgents(ListGenieAgentsRequest listGenieAgentsRequest);

  /** Updates a Genie Agent. Only the fields named in update_mask are applied. */
  GenieAgent updateGenieAgent(UpdateGenieAgentRequest updateGenieAgentRequest);
}
