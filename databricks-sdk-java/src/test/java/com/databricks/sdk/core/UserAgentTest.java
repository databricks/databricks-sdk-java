package com.databricks.sdk.core;

import java.util.Properties;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserAgentTest {
  private static final Logger log = LoggerFactory.getLogger(UserAgentTest.class);

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

  private Properties originalProperties;

  @BeforeEach
  public void clearCICD() {
    // Save original system properties
    originalProperties = (Properties) System.getProperties().clone();

    // Clear all system properties
    System.getProperties().clear();
  }

  @AfterEach
  public void restoreProperties() {
    // Restore original system properties
    System.setProperties(originalProperties);
  }

  @Test
  public void testUserAgentCicdNoProvider() {
    Assertions.assertEquals("", UserAgent.cicdProvider());
  }

  @Test
  public void testUserAgentCicdOneProvider() {
    System.setProperty("GITHUB_ACTIONS", "true");
    Assertions.assertEquals("github", UserAgent.cicdProvider());
  }

  @Test
  public void testUserAgentCicdMultipleProviders() {
    System.setProperty("GITHUB_ACTIONS", "true");
    System.setProperty("GITLAB_CI", "true");
    Assertions.assertEquals("github", UserAgent.cicdProvider());
  }
}
