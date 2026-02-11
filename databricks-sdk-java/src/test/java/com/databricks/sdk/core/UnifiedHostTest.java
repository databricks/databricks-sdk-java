package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.oauth.OpenIDConnectEndpoints;
import com.databricks.sdk.core.utils.Environment;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests for unified host support (SPOG).
 *
 * <p>Covers host type detection, client type determination, header injection, and OIDC endpoint
 * resolution for unified hosts.
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
  public void testHostTypeUnifiedExplicitFlag() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://unified.databricks.com")
            .setExperimentalIsUnifiedHost(true);
    assertEquals(HostType.UNIFIED, config.getHostType());
  }

  @Test
  public void testHostTypeUnifiedOverridesAccounts() {
    // Even if host looks like accounts, explicit flag takes precedence
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://accounts.cloud.databricks.com")
            .setExperimentalIsUnifiedHost(true);
    assertEquals(HostType.UNIFIED, config.getHostType());
  }

  @Test
  public void testHostTypeNullHost() {
    DatabricksConfig config = new DatabricksConfig();
    assertEquals(HostType.WORKSPACE, config.getHostType());
  }

  // --- Client Type Detection Tests ---

  private static Stream<Arguments> provideClientTypeTestCases() {
    return Stream.of(
        Arguments.of(
            "Workspace host",
            "https://adb-123.azuredatabricks.net",
            null,
            false,
            ClientType.WORKSPACE),
        Arguments.of(
            "Account host",
            "https://accounts.cloud.databricks.com",
            null,
            false,
            ClientType.ACCOUNT),
        Arguments.of(
            "Unified without workspace ID",
            "https://unified.databricks.com",
            null,
            true,
            ClientType.ACCOUNT),
        Arguments.of(
            "Unified with workspace ID",
            "https://unified.databricks.com",
            "123456",
            true,
            ClientType.WORKSPACE));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideClientTypeTestCases")
  public void testClientType(
      String testName, String host, String workspaceId, boolean isUnified, ClientType expected) {
    DatabricksConfig config = new DatabricksConfig().setHost(host).setWorkspaceId(workspaceId);
    if (isUnified) {
      config.setExperimentalIsUnifiedHost(true);
    }
    assertEquals(expected, config.getClientType());
  }

  // --- OIDC Endpoint Tests ---

  @Test
  public void testOidcEndpointsForUnifiedHost() throws IOException {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://unified.databricks.com")
            .setExperimentalIsUnifiedHost(true)
            .setAccountId("test-account-123");

    OpenIDConnectEndpoints endpoints = config.getDatabricksOidcEndpoints();

    assertEquals(
        "https://unified.databricks.com/oidc/accounts/test-account-123/v1/authorize",
        endpoints.getAuthorizationEndpoint());
    assertEquals(
        "https://unified.databricks.com/oidc/accounts/test-account-123/v1/token",
        endpoints.getTokenEndpoint());
  }

  @Test
  public void testOidcEndpointsForUnifiedHostMissingAccountId() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://unified.databricks.com")
            .setExperimentalIsUnifiedHost(true);
    // No account ID set

    DatabricksException exception =
        assertThrows(DatabricksException.class, () -> config.getDatabricksOidcEndpoints());
    assertTrue(exception.getMessage().contains("account_id is required"));
  }

  // --- isAccountClient() Deprecation Tests ---

  @Test
  public void testIsAccountClientThrowsForUnifiedHost() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://unified.databricks.com")
            .setExperimentalIsUnifiedHost(true);

    DatabricksException exception =
        assertThrows(DatabricksException.class, config::isAccountClient);
    assertTrue(exception.getMessage().contains("Cannot determine account client status"));
    assertTrue(exception.getMessage().contains("getHostType()"));
  }

  @Test
  public void testIsAccountClientWorksFineForTraditionalHosts() {
    assertTrue(
        new DatabricksConfig().setHost("https://accounts.cloud.databricks.com").isAccountClient());

    assertFalse(
        new DatabricksConfig().setHost("https://adb-123.azuredatabricks.net").isAccountClient());
  }

  // --- Environment Variable Tests ---

  @Test
  public void testUnifiedHostFromEnvironmentVariables() {
    Map<String, String> env = new HashMap<>();
    env.put("DATABRICKS_HOST", "https://unified.databricks.com");
    env.put("DATABRICKS_EXPERIMENTAL_IS_UNIFIED_HOST", "true");
    env.put("DATABRICKS_WORKSPACE_ID", "987654321");
    env.put("DATABRICKS_ACCOUNT_ID", "account-abc");

    DatabricksConfig config = new DatabricksConfig();
    config.resolve(new Environment(env, new ArrayList<>(), System.getProperty("os.name")));

    assertEquals(HostType.UNIFIED, config.getHostType());
    assertEquals("987654321", config.getWorkspaceId());
    assertEquals("account-abc", config.getAccountId());
    assertEquals(ClientType.WORKSPACE, config.getClientType());
  }

  // --- Header Injection Tests ---

  @Test
  public void testHeaderInjectionForWorkspaceOnUnified() {
    String workspaceId = "123456789";

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://unified.databricks.com")
            .setExperimentalIsUnifiedHost(true)
            .setWorkspaceId(workspaceId)
            .setToken("test-token");

    Map<String, String> headers = config.authenticate();

    assertEquals("Bearer test-token", headers.get("Authorization"));
    assertEquals(workspaceId, headers.get("X-Databricks-Org-Id"));
  }

  @Test
  public void testNoHeaderInjectionForAccountOnUnified() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://unified.databricks.com")
            .setExperimentalIsUnifiedHost(true)
            .setToken("test-token");
    // No workspace ID set

    Map<String, String> headers = config.authenticate();

    assertEquals("Bearer test-token", headers.get("Authorization"));
    assertNull(headers.get("X-Databricks-Org-Id"));
  }

  @Test
  public void testNoHeaderInjectionForTraditionalWorkspace() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://adb-123.azuredatabricks.net")
            .setToken("test-token");

    Map<String, String> headers = config.authenticate();

    assertEquals("Bearer test-token", headers.get("Authorization"));
    assertNull(headers.get("X-Databricks-Org-Id"));
  }
}
