package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import org.junit.jupiter.api.Test;

class DefaultCredentialsProviderTest {

  /** A credentials provider that records whether configure() was called. */
  private static class RecordingCredentialsProvider implements CredentialsProvider {
    private final String name;
    private boolean called = false;

    RecordingCredentialsProvider(String name) {
      this.name = name;
    }

    @Override
    public String authType() {
      return name;
    }

    @Override
    public HeaderFactory configure(DatabricksConfig config) {
      called = true;
      return null;
    }

    public boolean wasCalled() {
      return called;
    }
  }

  /**
   * In auto-detect mode (authType not set), azure-cli must be skipped on a GCP host because the
   * detected cloud does not match the strategy's required cloud (AZURE).
   */
  @Test
  void testCloudFiltering_SkipsOnCloudMismatch() {
    RecordingCredentialsProvider azureCli = new RecordingCredentialsProvider("azure-cli");
    DefaultCredentialsProvider provider =
        new DefaultCredentialsProvider(Collections.singletonList(azureCli));

    DatabricksConfig config = new DatabricksConfig().setHost("https://xyz.gcp.databricks.com/");
    // configure() throws because no provider succeeds; that's expected
    assertThrows(DatabricksException.class, () -> provider.configure(config));

    assertFalse(
        azureCli.wasCalled(),
        "azure-cli should be skipped on a GCP host in auto-detect mode");
  }

  /**
   * When authType is explicitly set, cloud filtering is bypassed so that the named strategy is
   * always attempted regardless of the detected host cloud.
   */
  @Test
  void testCloudFiltering_BypassesOnExplicitAuthType() {
    RecordingCredentialsProvider azureCli = new RecordingCredentialsProvider("azure-cli");
    DefaultCredentialsProvider provider =
        new DefaultCredentialsProvider(Collections.singletonList(azureCli));

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://xyz.gcp.databricks.com/")
            .setAuthType("azure-cli");
    // configure() throws because azure-cli returns null; that's expected
    assertThrows(DatabricksException.class, () -> provider.configure(config));

    assertTrue(
        azureCli.wasCalled(),
        "azure-cli should be called when authType is explicitly set, even on a GCP host");
  }
}
