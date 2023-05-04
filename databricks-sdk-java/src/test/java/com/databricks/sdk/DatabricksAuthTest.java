// These are auto-generated tests for Unified Authentication
// In case of editing this file, make sure the change is propagated to all Databricks SDK codebases

package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.client.ConfigResolving;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.utils.GitHubUtils;
import com.databricks.sdk.client.utils.TestOSUtils;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

public class DatabricksAuthTest implements TestOSUtils, GitHubUtils, ConfigResolving {

  private static String prefixPath;

  public DatabricksAuthTest() {
    setPermissionOnTestAz();
    prefixPath = System.getProperty("user.dir") + getTestDir();
  }

  @Test
  public void testTestConfigNoParams() {

    raises(
        "default auth: cannot configure default credentials",
        () -> {
          DatabricksConfig config = new DatabricksConfig();

          config.authenticate();
        });
  }

  @Test
  public void testTestConfigHostEnv() {
    // Set environment variables
    StaticEnv env = new StaticEnv().with("DATABRICKS_HOST", "x");
    raises(
        "default auth: cannot configure default credentials. Config: host=https://x. Env: DATABRICKS_HOST",
        () -> {
          DatabricksConfig config = new DatabricksConfig();
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigTokenEnv() {
    // Set environment variables
    StaticEnv env = new StaticEnv().with("DATABRICKS_TOKEN", "x");
    raises(
        "default auth: cannot configure default credentials. Config: token=***. Env: DATABRICKS_TOKEN",
        () -> {
          DatabricksConfig config = new DatabricksConfig();
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigHostTokenEnv() {
    // Set environment variables
    StaticEnv env = new StaticEnv().with("DATABRICKS_HOST", "x").with("DATABRICKS_TOKEN", "x");
    DatabricksConfig config = new DatabricksConfig();
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("pat", config.getAuthType());
    assertEquals("https://x", config.getHost());
  }

  @Test
  public void testTestConfigHostParamTokenEnv() {
    // Set environment variables
    StaticEnv env = new StaticEnv().with("DATABRICKS_TOKEN", "x");
    DatabricksConfig config = new DatabricksConfig().setHost("https://x");
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("pat", config.getAuthType());
    assertEquals("https://x", config.getHost());
  }

  @Test
  public void testTestConfigUserPasswordEnv() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv().with("DATABRICKS_PASSWORD", "x").with("DATABRICKS_USERNAME", "x");
    raises(
        "default auth: cannot configure default credentials. Config: username=x, password=***. Env: DATABRICKS_USERNAME, DATABRICKS_PASSWORD",
        () -> {
          DatabricksConfig config = new DatabricksConfig();
          resolveConfig(config, env);
          config.authenticate();

          assertEquals("https://x", config.getHost());
        });
  }

  @Test
  public void testTestConfigBasicAuth() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_HOST", "x")
            .with("DATABRICKS_PASSWORD", "x")
            .with("DATABRICKS_USERNAME", "x");
    DatabricksConfig config = new DatabricksConfig();
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("basic", config.getAuthType());
    assertEquals("https://x", config.getHost());
  }

  @Test
  public void testTestConfigAttributePrecedence() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_HOST", "x")
            .with("DATABRICKS_PASSWORD", "x")
            .with("DATABRICKS_USERNAME", "x");
    DatabricksConfig config = new DatabricksConfig().setHost("y");
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("basic", config.getAuthType());
    assertEquals("https://y", config.getHost());
  }

  @Test
  public void testTestConfigBasicAuthMix() {
    // Set environment variables
    StaticEnv env = new StaticEnv().with("DATABRICKS_PASSWORD", "x");
    DatabricksConfig config = new DatabricksConfig().setHost("y").setUsername("x");
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("basic", config.getAuthType());
    assertEquals("https://y", config.getHost());
  }

  @Test
  public void testTestConfigBasicAuthAttrs() {

    DatabricksConfig config = new DatabricksConfig().setHost("y").setUsername("x").setPassword("x");

    config.authenticate();

    assertEquals("basic", config.getAuthType());
    assertEquals("https://y", config.getHost());
  }

  @Test
  public void testTestConfigConflictingEnvs() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_HOST", "x")
            .with("DATABRICKS_PASSWORD", "x")
            .with("DATABRICKS_TOKEN", "x")
            .with("DATABRICKS_USERNAME", "x");
    raises(
        "validate: more than one authorization method configured: basic and pat. Config: host=x, token=***, username=x, password=***. Env: DATABRICKS_HOST, DATABRICKS_TOKEN, DATABRICKS_USERNAME, DATABRICKS_PASSWORD",
        () -> {
          DatabricksConfig config = new DatabricksConfig();
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigConflictingEnvsAuthType() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_HOST", "x")
            .with("DATABRICKS_PASSWORD", "x")
            .with("DATABRICKS_TOKEN", "x")
            .with("DATABRICKS_USERNAME", "x");
    DatabricksConfig config = new DatabricksConfig().setAuthType("basic");
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("basic", config.getAuthType());
    assertEquals("https://x", config.getHost());
  }

  @Test
  public void testTestConfigConfigFile() {
    // Set environment variables
    StaticEnv env = new StaticEnv().with("DATABRICKS_CONFIG_FILE", "x");
    raises(
        "default auth: cannot configure default credentials. Config: config_file=x. Env: DATABRICKS_CONFIG_FILE",
        () -> {
          DatabricksConfig config = new DatabricksConfig();
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigConfigFileSkipDefaultProfileIfHostSpecified() {
    // Set environment variables
    StaticEnv env = new StaticEnv().with("HOME", resource("/testdata"));
    raises(
        "default auth: cannot configure default credentials. Config: host=https://x",
        () -> {
          DatabricksConfig config = new DatabricksConfig().setHost("x");
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigPatFromDatabricksCfg() {
    // Set environment variables
    StaticEnv env = new StaticEnv().with("HOME", resource("/testdata"));
    DatabricksConfig config = new DatabricksConfig();
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("pat", config.getAuthType());
    assertEquals("https://dbc-XXXXXXXX-YYYY.cloud.databricks.com", config.getHost());
  }

  @Test
  public void testTestConfigPatFromDatabricksCfgDotProfile() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_CONFIG_PROFILE", "pat.with.dot")
            .with("HOME", resource("/testdata"));
    DatabricksConfig config = new DatabricksConfig();
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("pat", config.getAuthType());
    assertEquals("https://dbc-XXXXXXXX-YYYY.cloud.databricks.com", config.getHost());
  }

  @Test
  public void testTestConfigPatFromDatabricksCfgNohostProfile() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_CONFIG_PROFILE", "nohost")
            .with("HOME", resource("/testdata"));
    raises(
        "default auth: cannot configure default credentials. Config: token=***, profile=nohost. Env: DATABRICKS_CONFIG_PROFILE",
        () -> {
          DatabricksConfig config = new DatabricksConfig();
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigConfigProfileAndToken() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_CONFIG_PROFILE", "nohost")
            .with("DATABRICKS_TOKEN", "x")
            .with("HOME", resource("/testdata"));
    raises(
        "default auth: cannot configure default credentials. Config: token=***, profile=nohost. Env: DATABRICKS_TOKEN, DATABRICKS_CONFIG_PROFILE",
        () -> {
          DatabricksConfig config = new DatabricksConfig();
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigConfigProfileAndPassword() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_CONFIG_PROFILE", "nohost")
            .with("DATABRICKS_USERNAME", "x")
            .with("HOME", resource("/testdata"));
    raises(
        "validate: more than one authorization method configured: basic and pat. Config: token=***, username=x, profile=nohost. Env: DATABRICKS_USERNAME, DATABRICKS_CONFIG_PROFILE",
        () -> {
          DatabricksConfig config = new DatabricksConfig();
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigAzurePat() {

    DatabricksConfig config =
        new DatabricksConfig().setHost("https://adb-xxx.y.azuredatabricks.net/").setToken("y");

    config.authenticate();

    assertEquals("pat", config.getAuthType());
    assertEquals("https://adb-xxx.y.azuredatabricks.net", config.getHost());
    assertTrue(config.isAzure());
  }

  @Test
  public void testTestConfigAzureCliHost() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv().with("HOME", resource("/testdata/azure")).with("PATH", "testdata:/bin");
    DatabricksConfig config =
        new DatabricksConfig().setHost("x").setAzureWorkspaceResourceId("/sub/rg/ws");
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("azure-cli", config.getAuthType());
    assertEquals("https://x", config.getHost());
    assertTrue(config.isAzure());
  }

  @Test
  public void testTestConfigAzureCliHostFail() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("FAIL", "yes")
            .with("HOME", resource("/testdata/azure"))
            .with("PATH", "testdata:/bin");
    raises(
        "default auth: azure-cli: cannot get access token: This is just a failing script.\n. Config: azure_workspace_resource_id=/sub/rg/ws",
        () -> {
          DatabricksConfig config =
              new DatabricksConfig().setAzureWorkspaceResourceId("/sub/rg/ws");
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigAzureCliHostAzNotInstalled() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv().with("HOME", resource("/testdata/azure")).with("PATH", "whatever");
    raises(
        "default auth: cannot configure default credentials. Config: azure_workspace_resource_id=/sub/rg/ws",
        () -> {
          DatabricksConfig config =
              new DatabricksConfig().setAzureWorkspaceResourceId("/sub/rg/ws");
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigAzureCliHostPatConflictWithConfigFilePresentWithoutDefaultProfile() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv().with("HOME", resource("/testdata/azure")).with("PATH", "testdata:/bin");
    raises(
        "validate: more than one authorization method configured: azure and pat. Config: token=***, azure_workspace_resource_id=/sub/rg/ws",
        () -> {
          DatabricksConfig config =
              new DatabricksConfig().setToken("x").setAzureWorkspaceResourceId("/sub/rg/ws");
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigAzureCliHostAndResourceId() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv().with("HOME", resource("/testdata")).with("PATH", "testdata:/bin");
    DatabricksConfig config =
        new DatabricksConfig().setHost("x").setAzureWorkspaceResourceId("/sub/rg/ws");
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("azure-cli", config.getAuthType());
    assertEquals("https://x", config.getHost());
    assertTrue(config.isAzure());
  }

  @Test
  public void testTestConfigAzureCliHostAndResourceIDConfigurationPrecedence() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_CONFIG_PROFILE", "justhost")
            .with("HOME", resource("/testdata/azure"))
            .with("PATH", "testdata:/bin");
    DatabricksConfig config =
        new DatabricksConfig().setHost("x").setAzureWorkspaceResourceId("/sub/rg/ws");
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("azure-cli", config.getAuthType());
    assertEquals("https://x", config.getHost());
    assertTrue(config.isAzure());
  }

  @Test
  public void testTestConfigAzureAndPasswordConflict() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_USERNAME", "x")
            .with("HOME", resource("/testdata/azure"))
            .with("PATH", "testdata:/bin");
    raises(
        "validate: more than one authorization method configured: azure and basic. Config: host=x, username=x, azure_workspace_resource_id=/sub/rg/ws. Env: DATABRICKS_USERNAME",
        () -> {
          DatabricksConfig config =
              new DatabricksConfig().setHost("x").setAzureWorkspaceResourceId("/sub/rg/ws");
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigCorruptConfig() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_CONFIG_PROFILE", "DEFAULT")
            .with("HOME", resource("/testdata/corrupt"));
    raises(
        "resolve: testdata/corrupt/.databrickscfg has no DEFAULT profile configured. Config: profile=DEFAULT. Env: DATABRICKS_CONFIG_PROFILE",
        () -> {
          DatabricksConfig config = new DatabricksConfig();
          resolveConfig(config, env);
          config.authenticate();
        });
  }

  @Test
  public void testTestConfigAuthTypeFromEnv() {
    // Set environment variables
    StaticEnv env =
        new StaticEnv()
            .with("DATABRICKS_AUTH_TYPE", "basic")
            .with("DATABRICKS_PASSWORD", "password")
            .with("DATABRICKS_TOKEN", "token")
            .with("DATABRICKS_USERNAME", "user");
    DatabricksConfig config = new DatabricksConfig().setHost("x");
    resolveConfig(config, env);
    config.authenticate();

    assertEquals("basic", config.getAuthType());
    assertEquals("https://x", config.getHost());
  }

  private String resource(String file) {
    URL resource = getClass().getResource(file);
    if (resource == null) {
      fail("Asset not found: " + file);
    }
    return resource.getFile();
  }

  static class StaticEnv implements Supplier<Map<String, String>> {
    private final Map<String, String> env = new HashMap<>();

    public StaticEnv with(String key, String value) {
      if (key.equals("PATH")) {
        value = prefixPath + value;
      }
      env.put(key, value);
      return this;
    }

    @Override
    public Map<String, String> get() {
      return env;
    }
  }

  private void raises(String contains, Runnable cb) {
    boolean raised = false;
    try {
      cb.run();
    } catch (Exception e) {
      raised = true;
      String message = e.getMessage();
      message =
          message.replace(
              File.separator,
              "/"); // We would need to do this upstream also for making paths compatible with
      // windows
      message = message.replace(prefixPath, "");
      if (!message.contains(contains)) {
        fail(String.format("Expected exception to contain '%s'", contains), e);
      }
    }
    if (!raised) {
      fail("Expected exception, none thrown");
    }
  }
}
