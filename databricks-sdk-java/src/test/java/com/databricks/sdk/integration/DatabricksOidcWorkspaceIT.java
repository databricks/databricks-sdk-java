package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.iam.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ExtendWith(EnvTest.class)
@EnvContext("ucws")
public class DatabricksOidcWorkspaceIT {
  private static final Logger LOG = LoggerFactory.getLogger(DatabricksOidcWorkspaceIT.class);

  @Test
  void testWorkspaceOAuthM2MAuth(
      @EnvOrSkip("CLOUD_ENV") String cloudEnv,
      @EnvOrSkip("DATABRICKS_HOST") String host,
      @EnvOrSkip("TEST_DATABRICKS_CLIENT_ID") String clientId,
      @EnvOrSkip("TEST_DATABRICKS_CLIENT_SECRET") String clientSecret) {
    LOG.info("Cloud environment: {}", cloudEnv);

    // Create workspace client with OAuth M2M authentication
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(host)
            .setClientId(clientId)
            .setClientSecret(clientSecret)
            .setAuthType("oauth-m2m");

    WorkspaceClient ws = new WorkspaceClient(config);

    // Call the "me" API
    User me = ws.currentUser().me();

    // Verify we got a valid response
    assertNotNull(me.getUserName(), "Expected non-empty UserName");
  }

  @Test
  void testWorkspaceAzureClientSecretAuth(
      @EnvOrSkip("CLOUD_ENV") String cloudEnv,
      @EnvOrSkip("DATABRICKS_HOST") String host,
      @EnvOrSkip("ARM_CLIENT_ID") String azureClientId,
      @EnvOrSkip("ARM_CLIENT_SECRET") String azureClientSecret,
      @EnvOrSkip("ARM_TENANT_ID") String azureTenantId) {
    LOG.info("Cloud environment: {}", cloudEnv);

    // Create workspace client with Azure client secret authentication
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(host)
            .setAzureClientId(azureClientId)
            .setAzureClientSecret(azureClientSecret)
            .setAzureTenantId(azureTenantId)
            .setAuthType("azure-client-secret");

    WorkspaceClient ws = new WorkspaceClient(config);

    // Call the "me" API
    User me = ws.currentUser().me();

    // Verify we got a valid response
    assertNotNull(me.getUserName(), "Expected non-empty UserName");
  }
}
