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
  public void testAgentProviderCopilotCli() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("COPILOT_CLI", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/copilot-cli"));
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
  public void testAgentProviderOpenclaw() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("OPENCLAW_SHELL", "exec");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/openclaw"));
  }

  @Test
  public void testAgentProviderAmp() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AMP_CURRENT_THREAD_ID", "thread-123");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/amp"));
  }

  @Test
  public void testAgentProviderAugment() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AUGMENT_AGENT", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/augment"));
  }

  @Test
  public void testAgentProviderCopilotVscode() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("COPILOT_MODEL", "gpt-4");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/copilot-vscode"));
  }

  @Test
  public void testAgentProviderGoose() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("GOOSE_TERMINAL", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/goose"));
  }

  @Test
  public void testAgentProviderKiro() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("KIRO", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/kiro"));
  }

  @Test
  public void testAgentProviderWindsurf() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("WINDSURF_AGENT", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/windsurf"));
  }

  @Test
  public void testAgentProviderAgentEnvGoose() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "goose");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/goose"));
  }

  @Test
  public void testAgentProviderGooseBothMatchers() {
    // GOOSE_TERMINAL and AGENT=goose both fire the goose matcher. Since they
    // both identify the same agent, this is NOT ambiguous.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("GOOSE_TERMINAL", "1");
            put("AGENT", "goose");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/goose"));
  }

  @Test
  public void testAgentProviderAmpBothMatchers() {
    // AMP_CURRENT_THREAD_ID and AGENT=amp both identify amp, not ambiguous.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AMP_CURRENT_THREAD_ID", "thread-123");
            put("AGENT", "amp");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/amp"));
  }

  @Test
  public void testAgentProviderAgentEnvUnknown() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "someweirdthing");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/unknown"));
  }

  @Test
  public void testAgentProviderAgentEnvEmpty() {
    // AGENT="" should not trigger the unknown fallback.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "");
          }
        });
    Assertions.assertFalse(UserAgent.asString().contains("agent/"));
  }

  @Test
  public void testAgentProviderAgentEnvAmbiguity() {
    // AGENT=goose fires goose, CLAUDECODE=1 fires claude-code. Ambiguity.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "goose");
            put("CLAUDECODE", "1");
          }
        });
    Assertions.assertFalse(UserAgent.asString().contains("agent/"));
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
  public void testAgentProviderEmptyValueStillSet() {
    // Empty string still counts as "set" for presence-only matchers,
    // matching databricks-sdk-go semantics.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("CLAUDECODE", "");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/claude-code"));
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
