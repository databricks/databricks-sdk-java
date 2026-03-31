package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HostTypeTest {

  @Test
  public void testFromApiValueWorkspace() {
    assertEquals(HostType.WORKSPACE, HostType.fromApiValue("workspace"));
  }

  @Test
  public void testFromApiValueAccount() {
    assertEquals(HostType.ACCOUNTS, HostType.fromApiValue("account"));
  }

  @Test
  public void testFromApiValueUnified() {
    assertEquals(HostType.UNIFIED, HostType.fromApiValue("unified"));
  }

  @Test
  public void testFromApiValueCaseInsensitive() {
    assertEquals(HostType.WORKSPACE, HostType.fromApiValue("WORKSPACE"));
    assertEquals(HostType.ACCOUNTS, HostType.fromApiValue("Account"));
    assertEquals(HostType.UNIFIED, HostType.fromApiValue("UNIFIED"));
  }

  @Test
  public void testFromApiValueNull() {
    assertNull(HostType.fromApiValue(null));
  }

  @Test
  public void testFromApiValueEmpty() {
    assertNull(HostType.fromApiValue(""));
  }

  @Test
  public void testFromApiValueUnknown() {
    assertNull(HostType.fromApiValue("unknown"));
    assertNull(HostType.fromApiValue("something_else"));
  }
}
