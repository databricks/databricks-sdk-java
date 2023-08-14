package com.databricks.sdk.mixin;

import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.service.workspace.SecretMetadata;
import java.io.IOException;
import java.util.List;

import com.databricks.sdk.service.workspace.SecretScope;
import org.junit.jupiter.api.Test;

public class SecretsExtTest {

  @Test
  void listTest() throws IOException {
    try (FixtureServer fixtures = new FixtureServer()) {
      SecretsExt secretsExt = new SecretsExt();
      List<SecretMetadata> metadataList = secretsExt.list("testScope");
      assert (metadataList.isEmpty());
    }
  }

  @Test
  void listScopes() throws IOException {
    try (FixtureServer fixtures = new FixtureServer()) {
      SecretsExt secretsExt = new SecretsExt();
      List<SecretScope> metadataList = secretsExt.listScopes();
      assert (metadataList.isEmpty());
    }
  }
}
