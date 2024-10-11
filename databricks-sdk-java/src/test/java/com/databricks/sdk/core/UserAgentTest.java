package com.databricks.sdk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserAgentTest {
  @Test
  public void testUserAgent() {
    UserAgent.withProduct("product", "productVersion");
    String userAgent = UserAgent.asString();
    Assertions.assertTrue(userAgent.contains("product/productVersion"));
    Assertions.assertTrue(userAgent.contains("databricks-sdk-java/"));
    Assertions.assertTrue(userAgent.contains("os/"));
    Assertions.assertTrue(userAgent.contains("jvm/"));
  }

  @Test
  public void testUserAgentWithPartner() {
    UserAgent.withPartner("partner1");
    UserAgent.withPartner("partner2");
    String userAgent = UserAgent.asString();
    Assertions.assertTrue(userAgent.contains("partner/partner1"));
    Assertions.assertTrue(userAgent.contains("partner/partner2"));
  }

  @Test
  public void testUserAgentWithOtherInfo() {
    UserAgent.withOtherInfo("key1", "value1");
    UserAgent.withOtherInfo("key2", "value2");
    String userAgent = UserAgent.asString();
    Assertions.assertTrue(userAgent.contains("key1/value1"));
    Assertions.assertTrue(userAgent.contains("key2/value2"));
  }

  @Test
  public void testUserAgentWithInvalidKey() {
    Assertions.assertThrows(
        IllegalArgumentException.class,
        () -> {
          UserAgent.withOtherInfo("key1!", "value1");
        });
  }

  @Test
  public void testUserAgentWithInvalidValue() {
    Assertions.assertThrows(
        IllegalArgumentException.class,
        () -> {
          UserAgent.withOtherInfo("key1", "value1!");
        });
  }

  @Test
  public void testUserAgentWithSemverValue() {
    UserAgent.withOtherInfo("key1", "1.0.0-dev+metadata");
    String userAgent = UserAgent.asString();
    Assertions.assertTrue(userAgent.contains("key1/1.0.0-dev+metadata"));
  }

  @Test
  public void testUserAgentWithSQLDriverUserAgent() {
    UserAgent.withOtherInfo("Java", "SQLExecHttpClient/HC TEST/42.2.0.2712019");
    String userAgent = UserAgent.asString();
    Assertions.assertTrue(userAgent.contains("Java/SQLExecHttpClient/HC TEST/42.2.0.2712019"));
  }
}
