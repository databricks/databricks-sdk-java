package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.utils.Environment;
import java.util.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests for host type detection, client type determination, and header injection.
 *
 * <p>After removing the UNIFIED host type, host type is determined solely from the URL pattern.
 * Host metadata resolution (via /.well-known/databricks-config) populates accountId, workspaceId,
 * and discoveryUrl automatically during config init.
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
        new DatabricksConfig()
            .setHost("https://mycompany.databricks.com")
            .isAccountClient());
  }

  // --- Environment Variable Tests ---

  @Test
  public void testWorkspaceIdFromEnvironmentVariables() {
    Map<String, String> env = new HashMap<>();
    env.put("DATABRICKS_HOST", "https://mycompany.databricks.com");
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
