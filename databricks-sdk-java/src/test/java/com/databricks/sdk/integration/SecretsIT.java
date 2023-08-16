package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.databricks.sdk.core.ApiClient;
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
  void createAndGetSecretsTest() {
    SecretsExt secretsExt = new SecretsExt(new ApiClient());
    int randomSuffix = (int) (Math.random() * 1000);
    String scope = "testScope-" + randomSuffix;
    String key = "testKey-" + randomSuffix;
    String value = "testValue-" + randomSuffix;

    try (SecretsTestUtils.ScopeResource scopeResource =
        new SecretsTestUtils.ScopeResource(secretsExt, scope)) {
      scopeResource.getSecretsExt().createScope(scope);

      try (SecretsTestUtils.SecretResource secretResource =
          new SecretsTestUtils.SecretResource(secretsExt, scope, key)) {
        secretResource
            .getSecretsExt()
            .putSecret(new PutSecret().setScope(scope).setKey(key).setStringValue(value));

        Iterable<SecretMetadata> response = secretResource.getSecretsExt().listSecrets(scope);
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
  void createAndListScopesTest() {
    SecretsExt secretsExt = new SecretsExt(new ApiClient());
    int randomSuffix = (int) (Math.random() * 1000);
    String scope = "testScope-" + randomSuffix;

    try (SecretsTestUtils.ScopeResource scopeResource =
        new SecretsTestUtils.ScopeResource(secretsExt, scope)) {
      scopeResource.getSecretsExt().createScope(scope);

      Iterable<SecretScope> response = scopeResource.getSecretsExt().listScopes();
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

  private static class SecretsTestUtils {
    private static class SecretResource implements AutoCloseable {
      private final SecretsExt secretsExt;
      private final String scope;
      private final String key;

      public SecretsExt getSecretsExt() {
        return this.secretsExt;
      }

      public SecretResource(SecretsExt secretsExt, String scope, String key) {
        this.secretsExt = secretsExt;
        this.scope = scope;
        this.key = key;
      }

      @Override
      public void close() {
        secretsExt.deleteSecret(scope, key);
      }
    }

    private static class ScopeResource implements AutoCloseable {
      private final SecretsExt secretsExt;
      private final String scope;

      public SecretsExt getSecretsExt() {
        return this.secretsExt;
      }

      public ScopeResource(SecretsExt secretsExt, String scope) {
        this.secretsExt = secretsExt;
        this.scope = scope;
      }

      @Override
      public void close() {
        secretsExt.deleteScope(scope);
      }
    }
  }
}
