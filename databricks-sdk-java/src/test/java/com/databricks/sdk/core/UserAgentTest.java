package com.databricks.sdk.core;

import com.databricks.sdk.core.utils.Environment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserAgentTest {

  @AfterEach
  void tearDown() {
    cleanupAgentEnv();
  }

  private void setupAgentEnv(Map<String, String> envMap) {
    UserAgent.agentProvider = null;
    UserAgent.cicdProvider = null;
    UserAgent.env = new Environment(envMap, new ArrayList<>(), System.getProperty("os.name"));
  }

  private void cleanupAgentEnv() {
    UserAgent.env = null;
    UserAgent.agentProvider = null;
    UserAgent.cicdProvider = null;
  }

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
  }

  @Test
  public void testAgentProviderAntigravity() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("ANTIGRAVITY_AGENT", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/antigravity"));
  }

  @Test
  public void testAgentProviderClaudeCode() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("CLAUDECODE", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/claude-code"));
  }

  @Test
  public void testAgentProviderCline() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("CLINE_ACTIVE", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/cline"));
  }

  @Test
  public void testAgentProviderCodex() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("CODEX_CI", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/codex"));
  }

  @Test
  public void testAgentProviderCursor() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("CURSOR_AGENT", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/cursor"));
  }

  @Test
  public void testAgentProviderGeminiCli() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("GEMINI_CLI", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/gemini-cli"));
  }

  @Test
  public void testAgentProviderOpencode() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("OPENCODE", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/opencode"));
  }

  @Test
  public void testAgentProviderNoAgent() {
    setupAgentEnv(new HashMap<>());
    Assertions.assertFalse(UserAgent.asString().contains("agent/"));
  }

  @Test
  public void testAgentProviderMultipleAgents() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("CLAUDECODE", "1");
            put("CURSOR_AGENT", "1");
          }
        });
    Assertions.assertFalse(UserAgent.asString().contains("agent/"));
  }

  @Test
  public void testAgentProviderEmptyValue() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("CLAUDECODE", "");
          }
        });
    Assertions.assertFalse(UserAgent.asString().contains("agent/"));
  }

  @Test
  public void testAgentProviderCached() {
    // Set up with cursor agent
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("CURSOR_AGENT", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/cursor"));

    // Change env after caching. Cached result should persist.
    UserAgent.env =
        new Environment(
            new HashMap<String, String>() {
              {
                put("CLAUDECODE", "1");
              }
            },
            new ArrayList<>(),
            System.getProperty("os.name"));
    Assertions.assertTrue(UserAgent.asString().contains("agent/cursor"));
    Assertions.assertFalse(UserAgent.asString().contains("agent/claude-code"));
  }
}
