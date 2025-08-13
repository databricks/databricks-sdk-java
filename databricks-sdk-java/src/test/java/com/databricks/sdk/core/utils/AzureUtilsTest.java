package com.databricks.sdk.core.utils;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.commons.CommonsHttpClient;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class AzureUtilsTest {

  @Test
  public void testInferTenantId404() throws IOException {
    try (FixtureServer server = new FixtureServer().with("GET", "/aad/auth", "", 404)) {
      DatabricksConfig config = new DatabricksConfig();
      config.setHost(server.getUrl());
      config.setAzureWorkspaceResourceId(
          "/subscriptions/123/resourceGroups/rg/providers/Microsoft.Databricks/workspaces/ws");
      config.setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build());

      DatabricksException exception =
          assertThrows(
              DatabricksException.class,
              () -> {
                AzureUtils.inferTenantId(config);
              });
      assertEquals(
          "Failed to infer Azure tenant ID from " + server.getUrl() + "/aad/auth",
          exception.getMessage());

      assertNotNull(exception.getCause());
      assertInstanceOf(DatabricksException.class, exception.getCause());
      DatabricksException cause = (DatabricksException) exception.getCause();
      assertEquals(
          "Expected redirect (302) from " + server.getUrl() + "/aad/auth, got status code: 404",
          cause.getMessage());

      assertNull(config.getAzureTenantId());
    }
  }

  @Test
  public void testInferTenantIdNoLocationHeader() throws IOException {
    try (FixtureServer server = new FixtureServer().with("GET", "/aad/auth", "", 302)) {
      DatabricksConfig config = new DatabricksConfig();
      config.setHost(server.getUrl());
      config.setAzureWorkspaceResourceId(
          "/subscriptions/123/resourceGroups/rg/providers/Microsoft.Databricks/workspaces/ws");
      config.setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build());

      DatabricksException exception =
          assertThrows(
              DatabricksException.class,
              () -> {
                AzureUtils.inferTenantId(config);
              });
      assertEquals(
          "Failed to infer Azure tenant ID from " + server.getUrl() + "/aad/auth",
          exception.getMessage());

      assertNotNull(exception.getCause());
      assertInstanceOf(DatabricksException.class, exception.getCause());
      DatabricksException cause = (DatabricksException) exception.getCause();
      assertEquals(
          "No Location header in redirect response from " + server.getUrl() + "/aad/auth",
          cause.getMessage());

      assertNull(config.getAzureTenantId());
    }
  }

  @Test
  public void testInferTenantIdUnparsableLocationHeader() throws IOException {
    FixtureServer.FixtureMapping fixture =
        new FixtureServer.FixtureMapping.Builder()
            .validateMethod("GET")
            .validatePath("/aad/auth")
            .withRedirect("https://unexpected-location", 302)
            .build();

    try (FixtureServer server = new FixtureServer().with(fixture)) {
      DatabricksConfig config = new DatabricksConfig();
      config.setHost(server.getUrl());
      config.setAzureWorkspaceResourceId(
          "/subscriptions/123/resourceGroups/rg/providers/Microsoft.Databricks/workspaces/ws");
      config.setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build());

      DatabricksException exception =
          assertThrows(
              DatabricksException.class,
              () -> {
                AzureUtils.inferTenantId(config);
              });
      assertEquals(
          "Failed to infer Azure tenant ID from " + server.getUrl() + "/aad/auth",
          exception.getMessage());

      assertNotNull(exception.getCause());
      assertInstanceOf(DatabricksException.class, exception.getCause());
      DatabricksException cause = (DatabricksException) exception.getCause();
      assertEquals(
          "Failed to parse tenant ID from URL https://unexpected-location", cause.getMessage());

      assertNull(config.getAzureTenantId());
    }
  }

  @Test
  public void testInferTenantIdHappyPath() throws IOException {
    FixtureServer.FixtureMapping fixture =
        new FixtureServer.FixtureMapping.Builder()
            .validateMethod("GET")
            .validatePath("/aad/auth")
            .withRedirect("https://login.microsoftonline.com/test-tenant-id/oauth2/authorize", 302)
            .build();

    try (FixtureServer server = new FixtureServer().with(fixture)) {
      DatabricksConfig config = new DatabricksConfig();
      config.setHost(server.getUrl());
      config.setAzureWorkspaceResourceId(
          "/subscriptions/123/resourceGroups/rg/providers/Microsoft.Databricks/workspaces/ws");
      config.setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build());
      String result = AzureUtils.inferTenantId(config);
      assertEquals("test-tenant-id", result);
      assertNull(config.getAzureTenantId()); // Config should remain unchanged
    }
  }

  @Test
  public void testInferTenantIdSkipsWhenNotAzure() {
    DatabricksConfig config = new DatabricksConfig();
    config.setHost("https://my-workspace.cloud.databricks.com"); // non-azure host
    config.setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build());

    DatabricksException exception =
        assertThrows(
            DatabricksException.class,
            () -> {
              AzureUtils.inferTenantId(config);
            });
    assertEquals("Cannot infer tenant ID: workspace is not Azure", exception.getMessage());
    assertNull(config.getAzureTenantId());
  }

  @Test
  public void testInferTenantIdSkipsWhenAlreadySet() {
    DatabricksConfig config = new DatabricksConfig();
    config.setHost("https://adb-123.0.azuredatabricks.net");
    config.setAzureTenantId("existing-tenant-id");
    config.setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build());
    String result = AzureUtils.inferTenantId(config);
    assertEquals("existing-tenant-id", result);
    assertEquals("existing-tenant-id", config.getAzureTenantId()); // Config should remain unchanged
  }

  @Test
  public void testInferTenantIdSkipsWhenNoHost() {
    DatabricksConfig config = new DatabricksConfig();
    config.setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build());

    DatabricksException exception =
        assertThrows(
            DatabricksException.class,
            () -> {
              AzureUtils.inferTenantId(config);
            });
    assertEquals("Cannot infer tenant ID: host is missing", exception.getMessage());
    assertNull(config.getAzureTenantId());
  }
}
