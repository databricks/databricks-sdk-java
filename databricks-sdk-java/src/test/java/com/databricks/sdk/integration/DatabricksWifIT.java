package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.iam.*;
import com.databricks.sdk.service.oauth2.CreateServicePrincipalFederationPolicyRequest;
import com.databricks.sdk.service.oauth2.FederationPolicy;
import com.databricks.sdk.service.oauth2.OidcFederationPolicy;
import java.util.Collections;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("ucacct")
@ExtendWith(EnvTest.class)
public class DatabricksWifIT {
  // This test cannot run on local machines. We use ACTIONS_ID_TOKEN_REQUEST_URL
  // to determine whether we are running in the GitHub Actions,
  // and we skip the test if we are not.
  @Test
  void workspace(
      AccountClient a,
      @EnvOrSkip("TEST_WORKSPACE_ID") String workspaceId,
      @EnvOrSkip("TEST_WORKSPACE_URL") String workspaceUrl,
      @EnvOrSkip("ACTIONS_ID_TOKEN_REQUEST_URL") String userId) {
    String spName = "java-sdk-sp" + UUID.randomUUID();

    // Create SP with access to the workspace
    ServicePrincipal sp =
        a.servicePrincipals().create(new ServicePrincipal().setActive(true).setDisplayName(spName));

    a.workspaceAssignment()
        .update(
            new UpdateWorkspaceAssignments()
                .setWorkspaceId(Long.valueOf(workspaceId))
                .setPrincipalId(Long.valueOf(sp.getId()))
                .setPermissions(Collections.singleton(WorkspacePermission.ADMIN)));

    // Setup Federation Policy
    OidcFederationPolicy policy =
        new OidcFederationPolicy()
            .setIssuer("https://token.actions.githubusercontent.com")
            .setSubject("repo:databricks-eng/eng-dev-ecosystem:environment:integration-tests")
            .setAudiences(Collections.singleton("https://github.com/databricks-eng"));

    a.servicePrincipalFederationPolicy()
        .create(
            new CreateServicePrincipalFederationPolicyRequest()
                .setServicePrincipalId(Long.valueOf(sp.getId()))
                .setPolicy(new FederationPolicy().setOidcPolicy(policy)));

    // Test WIF login
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(workspaceUrl)
            .setClientId(sp.getApplicationId())
            .setAuthType("github-oidc")
            .setTokenAudience("https://github.com/databricks-eng");

    WorkspaceClient ws = new WorkspaceClient(config);

    ws.currentUser().me();
  }

  // This test cannot run on local machines. We use ACTIONS_ID_TOKEN_REQUEST_URL
  // to determine whether we are running in the GitHub Actions,
  // and we skip the test if we are not.
  @Test
  void account(AccountClient a, @EnvOrSkip("ACTIONS_ID_TOKEN_REQUEST_URL") String userId) {
    String spName = "java-sdk-sp" + UUID.randomUUID();

    // Create SP
    ServicePrincipal sp =
        a.servicePrincipals()
            .create(
                new ServicePrincipal()
                    .setActive(true)
                    .setDisplayName(spName)
                    .setRoles(Collections.singleton(new ComplexValue().setValue("account_admin"))));

    // Setup Federation Policy
    OidcFederationPolicy policy =
        new OidcFederationPolicy()
            .setIssuer("https://token.actions.githubusercontent.com")
            .setSubject("repo:databricks-eng/eng-dev-ecosystem:environment:integration-tests")
            .setAudiences(Collections.singleton("https://github.com/databricks-eng"));

    a.servicePrincipalFederationPolicy()
        .create(
            new CreateServicePrincipalFederationPolicyRequest()
                .setServicePrincipalId(Long.valueOf(sp.getId()))
                .setPolicy(new FederationPolicy().setOidcPolicy(policy)));

    // Test WIF login
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(a.config().getHost())
            .setAccountId(a.config().getAccountId())
            .setClientId(sp.getApplicationId())
            .setAuthType("github-oidc")
            .setTokenAudience("https://github.com/databricks-eng");

    AccountClient ac = new AccountClient(config);

    Iterable<Group> groups = ac.groups().list(new ListAccountGroupsRequest());
    groups.iterator().next();
  }
}
