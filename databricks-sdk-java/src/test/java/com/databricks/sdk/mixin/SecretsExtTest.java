package com.databricks.sdk.mixin;

import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.service.workspace.SecretMetadata;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class SecretsExtTest {

    @Test
    void listTest() throws IOException {
        try (FixtureServer fixtures = new FixtureServer()) {
            SecretsExt secretsExt = new SecretsExt();
            List<SecretMetadata> metadataList = secretsExt.list("testScope");
            assert(metadataList.isEmpty());
        }

    }
}
