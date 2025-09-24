package com.databricks.sdk.service.agentbricks;

import com.databricks.sdk.core.ApiClient;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AgentBricksTest {

  @Test
  void testAgentBricks() {
    // TODO: Implement
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    AgentBricksAPI agentBricksAPI = new AgentBricksAPI(apiClient);

    agentBricksAPI.createCustomLlm(new CreateCustomLlmRequest());
  }
}
