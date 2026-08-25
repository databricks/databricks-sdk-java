package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.integration.framework.NameUtils;
import com.databricks.sdk.integration.framework.ResourceWithCleanup;
import com.databricks.sdk.service.iam.*;
import com.databricks.sdk.service.oauth2.CreateServicePrincipalFederationPolicyRequest;
import com.databricks.sdk.service.oauth2.DeleteServicePrincipalFederationPolicyRequest;
import com.databricks.sdk.service.oauth2.FederationPolicy;
import com.databricks.sdk.service.oauth2.OidcFederationPolicy;
import com.databricks.sdk.service.workspace.Import;
import com.databricks.sdk.service.workspace.ImportFormat;
import com.databricks.sdk.service.workspace.Language;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("ucacct")
@ExtendWith(EnvTest.class)
public class DatabricksWifIT {
  /** Creates the GitHub OIDC configuration shared by the normal and group-assuming clients. */
  private static DatabricksConfig wifConfig(String workspaceUrl, String clientId) {
    return new DatabricksConfig()
        .setHost(workspaceUrl)
        .setClientId(clientId)
        .setAuthType("github-oidc")
        .setTokenAudience("https://github.com/databricks-eng");
  }

  // Verifies that WIF can assume a group and use permissions granted only to that group, while the
  // same service principal without group assumption remains denied.
  @Test
  void workspaceGroupAssumption(
      AccountClient a,
      @EnvOrSkip("TEST_WORKSPACE_ID") String workspaceIdValue,
      @EnvOrSkip("TEST_WORKSPACE_URL") String workspaceUrl,
      @EnvOrSkip("ACTIONS_ID_TOKEN_REQUEST_URL") String ignoredOidcRequestUrl) {
    // Use the GitHub Actions OIDC environment and an account administrator to arrange the test.
    long workspaceId = Long.parseLong(workspaceIdValue);

    // Create an administrator client for workspace resources and permissions.
    WorkspaceClient workspaceAdmin =
        new WorkspaceClient(new DatabricksConfig().setHost(workspaceUrl));

    // Create the service principal whose normal and group-based WIF access will be tested.
    AccountServicePrincipal servicePrincipal =
        a.servicePrincipalsV2()
            .create(
                new CreateAccountServicePrincipalRequest()
                    .setActive(true)
                    .setDisplayName(NameUtils.uniqueName("java-sdk-wif-role-sp")));
    long servicePrincipalId = Long.parseLong(servicePrincipal.getId());

    try (ResourceWithCleanup ignoredServicePrincipal =
        new ResourceWithCleanup(() -> a.servicePrincipalsV2().delete(servicePrincipal.getId()))) {
      // Give the service principal basic workspace access without notebook access.
      a.workspaceAssignment()
          .update(
              new UpdateWorkspaceAssignments()
                  .setWorkspaceId(workspaceId)
                  .setPrincipalId(servicePrincipalId)
                  .setPermissions(Collections.singleton(WorkspacePermission.USER)));

      try (ResourceWithCleanup ignoredServicePrincipalAssignment =
          new ResourceWithCleanup(
              () ->
                  a.workspaceAssignment()
                      .delete(
                          new DeleteWorkspaceAssignmentRequest()
                              .setWorkspaceId(workspaceId)
                              .setPrincipalId(servicePrincipalId)))) {
        // Create the group that represents the temporary workspace role.
        AccountGroup group =
            a.groupsV2()
                .create(
                    new CreateAccountGroupRequest()
                        .setDisplayName(NameUtils.uniqueName("java-sdk-wif-role-group")));
        long groupId = Long.parseLong(group.getId());

        try (ResourceWithCleanup ignoredGroup =
            new ResourceWithCleanup(() -> a.groupsV2().delete(group.getId()))) {
          // Assign the group to the workspace so it can receive workspace permissions.
          a.workspaceAssignment()
              .update(
                  new UpdateWorkspaceAssignments()
                      .setWorkspaceId(workspaceId)
                      .setPrincipalId(groupId)
                      .setPermissions(Collections.singleton(WorkspacePermission.USER)));

          try (ResourceWithCleanup ignoredGroupAssignment =
              new ResourceWithCleanup(
                  () ->
                      a.workspaceAssignment()
                          .delete(
                              new DeleteWorkspaceAssignmentRequest()
                                  .setWorkspaceId(workspaceId)
                                  .setPrincipalId(groupId)))) {
            // Grant the service principal permission to assume the group.
            String ruleSetName =
                String.format(
                    "accounts/%s/groups/%s/ruleSets/default",
                    a.config().getAccountId(), group.getId());
            RuleSetResponse ruleSet = a.accessControl().getRuleSet(ruleSetName, null);
            ArrayList<GrantRule> grantRules =
                ruleSet.getGrantRules() == null
                    ? new ArrayList<>()
                    : new ArrayList<>(ruleSet.getGrantRules());
            grantRules.add(
                new GrantRule()
                    .setPrincipals(
                        Collections.singleton(
                            "servicePrincipals/" + servicePrincipal.getApplicationId()))
                    .setRole("roles/group.assumer"));
            a.accessControl()
                .updateRuleSet(
                    new UpdateRuleSetRequest()
                        .setName(ruleSetName)
                        .setRuleSet(
                            new RuleSetUpdateRequest()
                                .setName(ruleSetName)
                                .setEtag(ruleSet.getEtag())
                                .setGrantRules(grantRules)));

            // Trust this repository's GitHub OIDC identity to authenticate as the service
            // principal.
            OidcFederationPolicy oidcPolicy =
                new OidcFederationPolicy()
                    .setIssuer("https://token.actions.githubusercontent.com")
                    .setSubject(
                        "repo:databricks-eng/eng-dev-ecosystem:environment:integration-tests")
                    .setAudiences(Collections.singleton("https://github.com/databricks-eng"));
            FederationPolicy federationPolicy =
                a.servicePrincipalFederationPolicy()
                    .create(
                        new CreateServicePrincipalFederationPolicyRequest()
                            .setServicePrincipalId(servicePrincipalId)
                            .setPolicy(new FederationPolicy().setOidcPolicy(oidcPolicy)));

            try (ResourceWithCleanup ignoredFederationPolicy =
                new ResourceWithCleanup(
                    () ->
                        a.servicePrincipalFederationPolicy()
                            .delete(
                                new DeleteServicePrincipalFederationPolicyRequest()
                                    .setServicePrincipalId(servicePrincipalId)
                                    .setPolicyId(federationPolicy.getUid())))) {
              // Create a temporary notebook that distinguishes normal access from group access.
              String adminUserName = workspaceAdmin.currentUser().me(new MeRequest()).getUserName();
              String notebookPath =
                  "/Users/"
                      + adminUserName
                      + "/"
                      + NameUtils.uniqueName("java-sdk-wif-role-notebook");
              workspaceAdmin
                  .workspace()
                  .importContent(
                      new Import()
                          .setPath(notebookPath)
                          .setOverwrite(true)
                          .setFormat(ImportFormat.SOURCE)
                          .setLanguage(Language.PYTHON)
                          .setContent(
                              Base64.getEncoder()
                                  .encodeToString("print(1)".getBytes(StandardCharsets.UTF_8))));

              try (ResourceWithCleanup ignoredNotebook =
                  new ResourceWithCleanup(
                      () ->
                          workspaceAdmin
                              .workspace()
                              .delete(
                                  new com.databricks.sdk.service.workspace.Delete()
                                      .setPath(notebookPath)))) {
                // Give only the group permission to read the notebook.
                Long notebookId = workspaceAdmin.workspace().getStatus(notebookPath).getObjectId();
                workspaceAdmin
                    .permissions()
                    .update(
                        new UpdateObjectPermissions()
                            .setRequestObjectType("notebooks")
                            .setRequestObjectId(String.valueOf(notebookId))
                            .setAccessControlList(
                                Collections.singleton(
                                    new AccessControlRequest()
                                        .setGroupName(group.getDisplayName())
                                        .setPermissionLevel(PermissionLevel.CAN_READ))));

                // Authenticate with the group and verify that its notebook permission is usable.
                WorkspaceClient roleClient =
                    new WorkspaceClient(
                        wifConfig(workspaceUrl, servicePrincipal.getApplicationId())
                            .setGroupId(group.getId()));
                roleClient.workspace().getStatus(notebookPath);

                // Authenticate normally as the same service principal and verify that access is
                // denied.
                WorkspaceClient normalClient =
                    new WorkspaceClient(
                        wifConfig(workspaceUrl, servicePrincipal.getApplicationId()));
                assertThrows(
                    DatabricksException.class,
                    () -> normalClient.workspace().getStatus(notebookPath));
              }
            }
          }
        }
      }
    }
  }

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

    ws.currentUser().me(new MeRequest());
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
