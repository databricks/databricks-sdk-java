package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.utils.Environment;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests for host type detection, client type determination, and resolved host type from metadata.
 *
 * <p>Host type is determined by resolvedHostType (from /.well-known/databricks-config metadata)
 * when available, falling back to URL pattern matching. Host metadata resolution also populates
 * accountId, workspaceId, and discoveryUrl automatically during config init.
 */
public class UnifiedHostTest {

  // --- Host Type Detection Tests ---

  @Test
  public void testHostTypeWorkspace() {
    DatabricksConfig config =
        new DatabricksConfig().setHost("https://adb-123456789.0.azuredatabricks.net");
    assertEquals(HostType.WORKSPACE, config.getHostType());
  }

  @Test
  public void testHostTypeAccounts() {
    DatabricksConfig config =
        new DatabricksConfig().setHost("https://accounts.cloud.databricks.com");
    assertEquals(HostType.ACCOUNTS, config.getHostType());
  }

  @Test
  public void testHostTypeAccountsDod() {
    DatabricksConfig config =
        new DatabricksConfig().setHost("https://accounts-dod.cloud.databricks.us");
    assertEquals(HostType.ACCOUNTS, config.getHostType());
  }

  @Test
  public void testHostTypeForNonAccountsHost() {
    // A host that is not an accounts host is always WORKSPACE, regardless of any flags
    DatabricksConfig config = new DatabricksConfig().setHost("https://mycompany.databricks.com");
    assertEquals(HostType.WORKSPACE, config.getHostType());
  }

  @Test
  public void testHostTypeNullHost() {
    DatabricksConfig config = new DatabricksConfig();
    assertEquals(HostType.WORKSPACE, config.getHostType());
  }

  // --- Client Type Detection Tests ---

  private static Stream<Arguments> provideClientTypeTestCases() {
    return Stream.of(
        Arguments.of("Workspace host", "https://adb-123.azuredatabricks.net", ClientType.WORKSPACE),
        Arguments.of("Account host", "https://accounts.cloud.databricks.com", ClientType.ACCOUNT),
        Arguments.of(
            "Non-accounts host", "https://mycompany.databricks.com", ClientType.WORKSPACE));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideClientTypeTestCases")
  public void testClientType(String testName, String host, ClientType expected) {
    DatabricksConfig config = new DatabricksConfig().setHost(host);
    assertEquals(expected, config.getClientType());
  }

  // --- isAccountClient() Tests ---

  @Test
  public void testIsAccountClientForAccountsHost() {
    assertTrue(
        new DatabricksConfig().setHost("https://accounts.cloud.databricks.com").isAccountClient());
  }

  @Test
  public void testIsAccountClientForWorkspaceHost() {
    assertFalse(
        new DatabricksConfig().setHost("https://adb-123.azuredatabricks.net").isAccountClient());
  }

  @Test
  public void testIsAccountClientForNonAccountsHost() {
    // Non-accounts hosts are not account clients
    assertFalse(
        new DatabricksConfig().setHost("https://mycompany.databricks.com").isAccountClient());
  }

  // --- Environment Variable Tests ---

  @Test
  public void testWorkspaceIdFromEnvironmentVariables() throws IOException {
    try (FixtureServer server = new FixtureServer()) {
      Map<String, String> env = new HashMap<>();
      env.put("DATABRICKS_HOST", server.getUrl());
      env.put("DATABRICKS_WORKSPACE_ID", "987654321");
      env.put("DATABRICKS_ACCOUNT_ID", "account-abc");

      DatabricksConfig config = new DatabricksConfig();
      config.resolve(new Environment(env, new ArrayList<>(), System.getProperty("os.name")));

      assertEquals(HostType.WORKSPACE, config.getHostType());
      assertEquals("987654321", config.getWorkspaceId());
      assertEquals("account-abc", config.getAccountId());
      assertEquals(ClientType.WORKSPACE, config.getClientType());
    }
  }

  // --- Resolved host type from metadata tests ---

  @Test
  public void testMetadataWorkspaceOverridesAccountLikeUrl() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://accounts.cloud.databricks.com")
            .setResolvedHostType(HostType.WORKSPACE);
    assertEquals(HostType.WORKSPACE, config.getHostType());
  }

  @Test
  public void testMetadataAccountOverridesWorkspaceLikeUrl() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://my-workspace.cloud.databricks.com")
            .setResolvedHostType(HostType.ACCOUNTS);
    assertEquals(HostType.ACCOUNTS, config.getHostType());
  }

  @Test
  public void testMetadataUnifiedIsReturned() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://my-workspace.cloud.databricks.com")
            .setResolvedHostType(HostType.UNIFIED);
    assertEquals(HostType.UNIFIED, config.getHostType());
  }

  @Test
  public void testFallsBackToUrlMatchingWhenResolvedHostTypeNull() {
    DatabricksConfig config =
        new DatabricksConfig().setHost("https://accounts.cloud.databricks.com");
    // resolvedHostType is null by default
    assertEquals(HostType.ACCOUNTS, config.getHostType());
  }

  @Test
  public void testResolvedHostTypeTakesPriorityOverUrlMatching() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://my-workspace.cloud.databricks.com")
            .setResolvedHostType(HostType.ACCOUNTS);
    // Resolved host type takes priority over URL-based detection
    assertEquals(HostType.ACCOUNTS, config.getHostType());
  }

  @Test
  public void testEndToEndResolveToGetHostType() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://ws.databricks.com/oidc\","
            + "\"account_id\":\"test-account\","
            + "\"host_type\":\"unified\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(
          new Environment(new HashMap<>(), new ArrayList<>(), System.getProperty("os.name")));
      // After resolve(), tryResolveHostMetadata() should have set resolvedHostType
      assertEquals(HostType.UNIFIED, config.getHostType());
    }
  }
}
