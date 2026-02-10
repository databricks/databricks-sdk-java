package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.iam.ListAccountServicePrincipalsRequest;
import com.databricks.sdk.service.iam.ServicePrincipal;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ExtendWith(EnvTest.class)
@EnvContext("account")
public class DatabricksOidcAccountIT {
  private static final Logger LOG = LoggerFactory.getLogger(DatabricksOidcAccountIT.class);

  @Test
  void testAccountOAuthM2MAuth(
      @EnvOrSkip("CLOUD_ENV") String cloudEnv,
      @EnvOrSkip("DATABRICKS_HOST") String host,
      @EnvOrSkip("DATABRICKS_ACCOUNT_ID") String accountId,
      @EnvOrSkip("TEST_DATABRICKS_CLIENT_ID") String clientId,
      @EnvOrSkip("TEST_DATABRICKS_CLIENT_SECRET") String clientSecret) {
    LOG.info("Cloud environment: {}", cloudEnv);

    // Create account client with OAuth M2M authentication
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(host)
            .setAccountId(accountId)
            .setClientId(clientId)
            .setClientSecret(clientSecret)
            .setAuthType("oauth-m2m");

    AccountClient ac = new AccountClient(config);

    // List service principals to verify authentication works
    Iterable<ServicePrincipal> servicePrincipals =
        ac.servicePrincipals().list(new ListAccountServicePrincipalsRequest());
    servicePrincipals.iterator().next();
  }

  @Test
  void testAccountAzureClientSecretAuth(
      @EnvOrSkip("CLOUD_ENV") String cloudEnv,
      @EnvOrSkip("DATABRICKS_HOST") String host,
      @EnvOrSkip("DATABRICKS_ACCOUNT_ID") String accountId,
      @EnvOrSkip("ARM_CLIENT_ID") String azureClientId,
      @EnvOrSkip("ARM_CLIENT_SECRET") String azureClientSecret,
      @EnvOrSkip("ARM_TENANT_ID") String azureTenantId) {
    LOG.info("Cloud environment: {}", cloudEnv);

    // Create account client with Azure client secret authentication
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(host)
            .setAccountId(accountId)
            .setAzureClientId(azureClientId)
            .setAzureClientSecret(azureClientSecret)
            .setAzureTenantId(azureTenantId)
            .setAuthType("azure-client-secret");

    AccountClient ac = new AccountClient(config);

    // List service principals to verify authentication works
    Iterable<ServicePrincipal> servicePrincipals =
        ac.servicePrincipals().list(new ListAccountServicePrincipalsRequest());
    servicePrincipals.iterator().next();
  }
}
