package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DatabricksConfigTest {
  @Test
  public void testIsAccountHost() {
    assertTrue(
        new DatabricksConfig().setHost("https://accounts.azuredatabricks.net").isAccountClient());
  }

  @Test
  public void testIsAccountHostDod() {
    assertTrue(
        new DatabricksConfig()
            .setHost("https://accounts-dod.cloud.databricks.us")
            .isAccountClient());
  }

  @Test
  public void testIsAccountHostWorkspace() {
    assertFalse(
        new DatabricksConfig().setHost("https://westeurope.azuredatabricks.net").isAccountClient());
  }

  @Test
  public void testIsAzureForAwsHost() {
    assertFalse(
        new DatabricksConfig().setHost("https://my-workspace.cloud.databricks.com/").isAzure());
  }

  @Test
  public void testIsAzurePublic() {
    assertTrue(
        new DatabricksConfig().setHost("https://adb-1234567890.0.azuredatabricks.net/").isAzure());
  }

  @Test
  public void testIsAzureMooncake() {
    assertTrue(
        new DatabricksConfig().setHost("https://adb-1234567890.0.databricks.azure.cn/").isAzure());
  }

  @Test
  public void testIsAzureUsGov() {
    assertTrue(
        new DatabricksConfig().setHost("https://adb-1234567890.0.databricks.azure.us/").isAzure());
  }
}
