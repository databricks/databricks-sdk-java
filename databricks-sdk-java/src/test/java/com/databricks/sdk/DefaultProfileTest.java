package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.databricks.sdk.core.ConfigResolving;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.utils.TestOSUtils;
import org.junit.jupiter.api.Test;

public class DefaultProfileTest implements ConfigResolving {

  private DatabricksConfig createConfigWithMockClient() {
    HttpClient mockClient = mock(HttpClient.class);
    return new DatabricksConfig().setHttpClient(mockClient);
  }

  /** Test 1: default_profile resolves correctly and is written back to config */
  @Test
  public void testDefaultProfileResolvesCorrectly() {
    StaticEnv env =
        new StaticEnv().with("HOME", TestOSUtils.resource("/testdata/default_profile"));
    DatabricksConfig config = createConfigWithMockClient();
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("pat", config.getAuthType());
    assertEquals("https://my-workspace.cloud.databricks.com", config.getHost());
    assertEquals("my-workspace", config.getProfile());
  }

  /** Test 2: default_profile takes precedence over [DEFAULT] */
  @Test
  public void testDefaultProfileTakesPrecedenceOverDefault() {
    StaticEnv env =
        new StaticEnv()
            .with("HOME", TestOSUtils.resource("/testdata/default_profile_precedence"));
    DatabricksConfig config = createConfigWithMockClient();
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("pat", config.getAuthType());
    assertEquals("https://my-workspace.cloud.databricks.com", config.getHost());
  }

  /** Test 3: Legacy fallback when no [__settings__] */
  @Test
  public void testLegacyFallbackWhenNoSettings() {
    StaticEnv env = new StaticEnv().with("HOME", TestOSUtils.resource("/testdata"));
    DatabricksConfig config = createConfigWithMockClient();
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("pat", config.getAuthType());
    assertEquals("https://dbc-XXXXXXXX-YYYY.cloud.databricks.com", config.getHost());
  }

  /** Test 4: Legacy fallback when default_profile is empty */
  @Test
  public void testLegacyFallbackWhenDefaultProfileEmpty() {
    StaticEnv env =
        new StaticEnv()
            .with("HOME", TestOSUtils.resource("/testdata/default_profile_empty_settings"));
    DatabricksConfig config = createConfigWithMockClient();
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("pat", config.getAuthType());
    assertEquals("https://default.cloud.databricks.com", config.getHost());
  }

  /** Test 5: default_profile = __settings__ is rejected and falls back to DEFAULT */
  @Test
  public void testSettingsSelfReferenceIsRejected() {
    StaticEnv env =
        new StaticEnv()
            .with("HOME", TestOSUtils.resource("/testdata/default_profile_settings_self_ref"));
    DatabricksConfig config = createConfigWithMockClient();
    resolveConfig(config, env);
    config.authenticate();

    // __settings__ as a profile target should be ignored, falling back to [DEFAULT]
    assertEquals("https://default.cloud.databricks.com", config.getHost());
    assertEquals("pat", config.getAuthType());
  }

  /** Test 6: Explicit --profile overrides default_profile */
  @Test
  public void testExplicitProfileOverridesDefaultProfile() {
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_CONFIG_PROFILE", "other")
            .with("HOME", TestOSUtils.resource("/testdata/default_profile_explicit_override"));
    DatabricksConfig config = createConfigWithMockClient();
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("pat", config.getAuthType());
    assertEquals("https://other.cloud.databricks.com", config.getHost());
  }

  /** Test 7: default_profile pointing to nonexistent section */
  @Test
  public void testDefaultProfileNonexistentSection() {
    StaticEnv env =
        new StaticEnv()
            .with("HOME", TestOSUtils.resource("/testdata/default_profile_nonexistent"));
    DatabricksConfig config = createConfigWithMockClient();

    DatabricksException ex =
        assertThrows(
            DatabricksException.class,
            () -> {
              resolveConfig(config, env);
              config.authenticate();
            });
    assertTrue(
        ex.getMessage().contains("deleted-profile"),
        "Error should mention the missing profile name: " + ex.getMessage());
  }
}
