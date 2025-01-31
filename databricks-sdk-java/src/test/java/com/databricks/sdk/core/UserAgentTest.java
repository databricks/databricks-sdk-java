package com.databricks.sdk.core;

import com.databricks.sdk.core.utils.Environment;
import java.util.ArrayList;
import java.util.HashMap;
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
  public void testUserAgentCicdNoProvider() {
    UserAgent.cicdProvider = null;
    UserAgent.env =
        new Environment(new HashMap<>(), new ArrayList<>(), System.getProperty("os.name"));
    Assertions.assertFalse(UserAgent.asString().contains("cicd"));
    UserAgent.env = null;
  }

  @Test
  public void testUserAgentCicdOneProvider() {
    UserAgent.cicdProvider = null;
    UserAgent.env =
        new Environment(
            new HashMap<String, String>() {
              {
                put("GITHUB_ACTIONS", "true");
              }
            },
            new ArrayList<>(),
            System.getProperty("os.name"));
    Assertions.assertTrue(UserAgent.asString().contains("cicd/github"));
    UserAgent.env = null;
  }

  @Test
  public void testUserAgentCicdTwoProvider() {
    UserAgent.cicdProvider = null;
    UserAgent.env =
        new Environment(
            new HashMap<String, String>() {
              {
                put("GITLAB_CI", "true");
                put("JENKINS_URL", "");
              }
            },
            new ArrayList<>(),
            System.getProperty("os.name"));
    Assertions.assertTrue(UserAgent.asString().contains("cicd/gitlab"));
    UserAgent.env = null;
  }
}
