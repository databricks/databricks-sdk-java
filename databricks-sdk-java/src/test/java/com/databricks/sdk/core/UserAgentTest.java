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
  public void testAgentProviderVscodeAgent() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("VSCODE_AGENT", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/vscode-agent"));
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
  public void testAgentProviderAgentEnvAmp() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "amp");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/amp"));
  }

  @Test
  public void testAgentProviderAgentEnvCursor() {
    // AGENT=cursor with no cursor-specific env var. Falls through to the
    // AGENT fallback and is passed through unchanged.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "cursor");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/cursor"));
  }

  @Test
  public void testAgentProviderKnownMatcherWinsOverAgentFallback() {
    // Known matchers always win over the AGENT fallback. AGENT=somethingweird
    // alone would yield "unknown", but CLAUDECODE=1 takes precedence.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "somethingweird");
            put("CLAUDECODE", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/claude-code"));
    Assertions.assertFalse(UserAgent.asString().contains("agent/unknown"));
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
  public void testAgentProviderAgentEnvUnrecognizedPassthrough() {
    // An unrecognized AGENT value is passed through as-is (no longer coerced
    // to "unknown"), after sanitization.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "someweirdthing");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/someweirdthing"));
    Assertions.assertFalse(UserAgent.asString().contains("agent/unknown"));
  }

  @Test
  public void testAgentProviderAgentEnvVersionedPassthrough() {
    // A versioned variant whose characters are all in the allowlist
    // ([0-9A-Za-z_.+-]) is passed through unchanged.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "my-tool-1.2.3");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/my-tool-1.2.3"));
  }

  @Test
  public void testAgentProviderAgentEnvSanitized() {
    // Characters outside the user agent allowlist [0-9A-Za-z_.+-] become
    // hyphens.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "weird agent!@#name");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/weird-agent---name"));
  }

  @Test
  public void testAgentProviderAgentEnvTruncated() {
    // Values longer than 64 characters are truncated to 64.
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      sb.append("a");
    }
    String longValue = sb.toString();
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", longValue);
          }
        });
    StringBuilder expected = new StringBuilder("agent/");
    for (int i = 0; i < 64; i++) {
      expected.append("a");
    }
    String userAgent = UserAgent.asString();
    Assertions.assertTrue(userAgent.contains(expected.toString()));
    // Must not contain a 65th 'a' after the prefix.
    Assertions.assertFalse(userAgent.contains(expected.toString() + "a"));
  }

  @Test
  public void testAgentProviderAgentEnvEmpty() {
    // AGENT="" should not trigger the fallback.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "");
          }
        });
    Assertions.assertFalse(UserAgent.asString().contains("agent/"));
  }

  @Test
  public void testAgentProviderAiAgentFallback() {
    // AI_AGENT is consulted when AGENT is unset.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AI_AGENT", "vercel-agent");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/vercel-agent"));
  }

  @Test
  public void testAgentProviderAgentWinsOverAiAgent() {
    // AGENT takes precedence over AI_AGENT when both are non-empty.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "primary");
            put("AI_AGENT", "secondary");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/primary"));
    Assertions.assertFalse(UserAgent.asString().contains("agent/secondary"));
  }

  @Test
  public void testAgentProviderEmptyAgentFallsBackToAiAgent() {
    // AGENT="" falls back to AI_AGENT.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "");
            put("AI_AGENT", "secondary");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/secondary"));
  }

  @Test
  public void testAgentProviderExplicitMatcherWinsOverAiAgent() {
    // An explicit matcher wins over AI_AGENT.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AI_AGENT", "vercel-agent");
            put("CLAUDECODE", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/claude-code"));
    Assertions.assertFalse(UserAgent.asString().contains("agent/vercel-agent"));
  }

  @Test
  public void testAgentProviderBothEmptyReturnsNone() {
    // Both AGENT and AI_AGENT empty yields no agent segment.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "");
            put("AI_AGENT", "");
          }
        });
    Assertions.assertFalse(UserAgent.asString().contains("agent/"));
  }

  @Test
  public void testAgentProviderExplicitEnvWinsOverAgentEnv() {
    // CLAUDECODE=1 is an explicit matcher and wins over AGENT=goose (which
    // is only consulted as a fallback when no explicit matcher fires).
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("AGENT", "goose");
            put("CLAUDECODE", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/claude-code"));
  }

  @Test
  public void testAgentProviderExplicitEnvWinsOverKnownAgentEnv() {
    // GOOSE_TERMINAL=1 is an explicit matcher; AGENT=cursor (even though
    // "cursor" is a known product name) is ignored because an explicit
    // matcher already fired.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("GOOSE_TERMINAL", "1");
            put("AGENT", "cursor");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/goose"));
    Assertions.assertFalse(UserAgent.asString().contains("agent/cursor"));
  }

  @Test
  public void testAgentProviderVscodeAgentAndCopilotCliReportsMultiple() {
    // VSCODE_AGENT can legitimately stack with other agents (e.g. running
    // Copilot CLI from a VS Code agent terminal).
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("VSCODE_AGENT", "1");
            put("COPILOT_CLI", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/multiple"));
  }

  @Test
  public void testAgentProviderNoAgent() {
    setupAgentEnv(new HashMap<>());
    Assertions.assertFalse(UserAgent.asString().contains("agent/"));
  }

  @Test
  public void testAgentProviderMultipleAgents() {
    // Nested agents (e.g. Claude Code spawning a Cursor CLI subagent) set
    // multiple explicit matchers on the same process.
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("CLAUDECODE", "1");
            put("CURSOR_AGENT", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/multiple"));
  }

  @Test
  public void testAgentProviderThreeStackedAgents() {
    setupAgentEnv(
        new HashMap<String, String>() {
          {
            put("CLAUDECODE", "1");
            put("CURSOR_AGENT", "1");
            put("AUGMENT_AGENT", "1");
          }
        });
    Assertions.assertTrue(UserAgent.asString().contains("agent/multiple"));
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
