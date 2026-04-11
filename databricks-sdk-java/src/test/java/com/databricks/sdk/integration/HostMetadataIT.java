package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Integration test for host metadata resolution via /.well-known/databricks-config. Port of Go SDK
 * #1546.
 */
@ExtendWith(EnvTest.class)
@EnvContext("ucws")
public class HostMetadataIT {
  private static final Logger LOG = LoggerFactory.getLogger(HostMetadataIT.class);

  @Test
  void testResolvePopulatesFieldsFromMetadata(@EnvOrSkip("DATABRICKS_HOST") String host) {
    DatabricksConfig config = new DatabricksConfig().setHost(host);
    config.resolve();

    LOG.info(
        "Resolved metadata for {}: accountId={}, workspaceId={}, discoveryUrl={}",
        host,
        config.getAccountId(),
        config.getWorkspaceId(),
        config.getDiscoveryUrl());

    // After resolve(), host metadata should have been resolved
    assertNotNull(config.getDiscoveryUrl(), "Expected discoveryUrl to be populated after resolve");
    assertFalse(config.getDiscoveryUrl().isEmpty(), "Expected non-empty discoveryUrl");
    assertNotNull(config.getAccountId(), "Expected accountId to be populated after resolve");
    assertFalse(config.getAccountId().isEmpty(), "Expected non-empty accountId");
  }
}
