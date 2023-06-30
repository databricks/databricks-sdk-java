package com.databricks.sdk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatabricksConfigTest {
  @Test
  public void testIsAccountHost() {
    assertTrue(new DatabricksConfig().setHost("https://accounts.azuredatabricks.net").isAccountClient());
  }

  @Test
  public void testIsAccountHostDod() {
    assertTrue(new DatabricksConfig().setHost("https://accounts-dod.cloud.databricks.us").isAccountClient());
  }

  @Test
  public void testIsAccountHostWorkspace() {
    assertFalse(new DatabricksConfig().setHost("https://westeurope.azuredatabricks.net").isAccountClient());
  }
}
