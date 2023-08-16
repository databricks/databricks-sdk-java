package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.mixin.SecretsExt;
import com.databricks.sdk.service.workspace.PutSecret;
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

    try (SecretsTestResource ignored = SecretsTestResource.makeScope(secretsExt, scope)) {

      try (SecretsTestResource ignored1 =
          SecretsTestResource.makeSecret(secretsExt, scope, key, value)) {

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

    try (SecretsTestResource ignored = SecretsTestResource.makeScope(secretsExt, scope)) {

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

  private static class SecretsTestResource implements AutoCloseable {
    private final Runnable cleanup;

    private SecretsTestResource(Runnable cleanup) {
      this.cleanup = cleanup;
    }

    public static SecretsTestResource makeSecret(
        SecretsExt secretsExt, String scope, String key, String value) {
      secretsExt.putSecret(new PutSecret().setScope(scope).setKey(key).setStringValue(value));
      return new SecretsTestResource(() -> secretsExt.deleteSecret(scope, key));
    }

    public static SecretsTestResource makeScope(SecretsExt secretsExt, String scope) {
      secretsExt.createScope(scope);
      return new SecretsTestResource(() -> secretsExt.deleteScope(scope));
    }

    @Override
    public void close() {
      cleanup.run();
    }
  }
}
