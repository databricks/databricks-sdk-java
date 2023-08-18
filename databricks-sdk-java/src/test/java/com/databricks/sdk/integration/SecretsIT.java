package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.integration.framework.ResourceWithCleanup;
import com.databricks.sdk.mixin.SecretsExt;
import com.databricks.sdk.service.workspace.SecretMetadata;
import com.databricks.sdk.service.workspace.SecretScope;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class SecretsIT {
  @Test
  void createAndGetSecretsTest(WorkspaceClient w) {
    SecretsExt secretsExt = w.secrets();
    int randomSuffix = (int) (Math.random() * 1000);
    String scope = "testScope-" + randomSuffix;
    String key = "testKey-" + randomSuffix;
    String value = "testValue-" + randomSuffix;

    try (ResourceWithCleanup ignored = ResourceWithCleanup.makeScope(secretsExt, scope)) {

      try (ResourceWithCleanup ignored1 =
          ResourceWithCleanup.makeSecret(secretsExt, scope, key, value)) {

        Iterable<SecretMetadata> response = secretsExt.listSecrets(scope);
        boolean foundSecret = false;
        for (SecretMetadata s : response) {
          if (s.getKey().equals(key)) {
            foundSecret = true;
            break;
          }
        }

        assertTrue(foundSecret);

        // TODO: Uncomment once secrets.get is enabled
        // String responseValue = secretResource.secretsExt.get(scope, key);
        // assertEquals(value, responseValue);
      }
    }
  }

  @Test
  void createAndListScopesTest(WorkspaceClient w) {
    SecretsExt secretsExt = w.secrets();
    int randomSuffix = (int) (Math.random() * 1000);
    String scope = "testScope-" + randomSuffix;

    try (ResourceWithCleanup ignored = ResourceWithCleanup.makeScope(secretsExt, scope)) {

      Iterable<SecretScope> response = secretsExt.listScopes();
      boolean foundScope = false;
      for (SecretScope s : response) {
        if (s.getName().equals(scope)) {
          foundScope = true;
          break;
        }
      }

      assertTrue(foundScope);
    }
  }
}
