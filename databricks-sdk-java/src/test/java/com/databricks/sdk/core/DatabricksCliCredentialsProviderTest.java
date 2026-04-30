package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DatabricksCliCredentialsProviderTest {

  private static final String CLI_PATH = "/usr/local/bin/databricks";
  private static final String HOST = "https://my-workspace.cloud.databricks.com";
  private static final String ACCOUNT_HOST = "https://accounts.cloud.databricks.com";
  private static final String ACCOUNT_ID = "test-account-123";
  private static final String PROFILE = "my-profile";

  private final DatabricksCliCredentialsProvider provider = new DatabricksCliCredentialsProvider();

  // ---- buildHostArgs tests ----

  @Test
  void testBuildHostCommand_WorkspaceHost() {
    DatabricksConfig config = new DatabricksConfig().setHost(HOST);

    List<String> cmd = provider.buildHostArgs(CLI_PATH, config);

    assertEquals(Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST), cmd);
  }

  @Test
  void testBuildHostCommand_AccountHost() {
    DatabricksConfig config = new DatabricksConfig().setHost(ACCOUNT_HOST).setAccountId(ACCOUNT_ID);

    List<String> cmd = provider.buildHostArgs(CLI_PATH, config);

    assertEquals(
        Arrays.asList(
            CLI_PATH, "auth", "token", "--host", ACCOUNT_HOST, "--account-id", ACCOUNT_ID),
        cmd);
  }

  @Test
  void testBuildHostCommand_NonAccountsHostWithAccountId() {
    // Non-accounts hosts should not pass --account-id even if accountId is set
    DatabricksConfig config = new DatabricksConfig().setHost(HOST).setAccountId(ACCOUNT_ID);

    List<String> cmd = provider.buildHostArgs(CLI_PATH, config);

    assertEquals(Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST), cmd);
  }

  // ---- buildCliCommand tests ----

  private static Stream<Arguments> buildCliCommandCases() {
    return Stream.of(
        Arguments.of(
            "host only — old CLI, no force-refresh",
            new DatabricksConfig().setHost(HOST),
            new DatabricksCliVersion(0, 200, 0),
            Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST)),
        Arguments.of(
            "host only — new CLI, with force-refresh",
            new DatabricksConfig().setHost(HOST),
            new DatabricksCliVersion(0, 296, 0),
            Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST, "--force-refresh")),
        Arguments.of(
            "account host — old CLI, no force-refresh",
            new DatabricksConfig().setHost(ACCOUNT_HOST).setAccountId(ACCOUNT_ID),
            new DatabricksCliVersion(0, 200, 0),
            Arrays.asList(
                CLI_PATH, "auth", "token", "--host", ACCOUNT_HOST, "--account-id", ACCOUNT_ID)),
        Arguments.of(
            "account host — new CLI, with force-refresh",
            new DatabricksConfig().setHost(ACCOUNT_HOST).setAccountId(ACCOUNT_ID),
            new DatabricksCliVersion(0, 296, 0),
            Arrays.asList(
                CLI_PATH,
                "auth",
                "token",
                "--host",
                ACCOUNT_HOST,
                "--account-id",
                ACCOUNT_ID,
                "--force-refresh")),
        Arguments.of(
            "profile with profile-supporting CLI — uses --profile, no force-refresh",
            new DatabricksConfig().setProfile(PROFILE).setHost(HOST),
            new DatabricksCliVersion(0, 207, 1),
            Arrays.asList(CLI_PATH, "auth", "token", "--profile", PROFILE)),
        Arguments.of(
            "profile with newest CLI — uses --profile and --force-refresh",
            new DatabricksConfig().setProfile(PROFILE).setHost(HOST),
            new DatabricksCliVersion(0, 296, 0),
            Arrays.asList(CLI_PATH, "auth", "token", "--profile", PROFILE, "--force-refresh")),
        Arguments.of(
            "profile with old CLI — falls back to --host, no force-refresh",
            new DatabricksConfig().setProfile(PROFILE).setHost(HOST),
            new DatabricksCliVersion(0, 207, 0),
            Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST)),
        Arguments.of(
            "unknown version — falls back to --host, no force-refresh",
            new DatabricksConfig().setProfile(PROFILE).setHost(HOST),
            DatabricksCliVersion.UNKNOWN,
            Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST)),
        Arguments.of(
            "dev build — falls back to --host, no force-refresh",
            new DatabricksConfig().setProfile(PROFILE).setHost(HOST),
            new DatabricksCliVersion(0, 0, 0),
            Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST)));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("buildCliCommandCases")
  void testBuildCliCommand(
      String name, DatabricksConfig config, DatabricksCliVersion version, List<String> expected) {
    assertEquals(expected, provider.buildCliCommand(CLI_PATH, config, version));
  }

  // ---- parseCliVersion tests ----

  @Test
  void testParseCliVersion_StandardOutput() {
    String json =
        "{\"Version\":\"v0.295.0\",\"Major\":0,\"Minor\":295,\"Patch\":0,\"Prerelease\":\"\",\"BuildMetadata\":\"\"}";
    assertEquals(
        new DatabricksCliVersion(0, 295, 0),
        DatabricksCliCredentialsProvider.parseCliVersion(json));
  }

  @Test
  void testParseCliVersion_ProfileVersion() {
    String json = "{\"Version\":\"v0.207.1\",\"Major\":0,\"Minor\":207,\"Patch\":1}";
    assertEquals(
        new DatabricksCliVersion(0, 207, 1),
        DatabricksCliCredentialsProvider.parseCliVersion(json));
  }

  @Test
  void testParseCliVersion_DevBuild() {
    String json =
        "{\"Version\":\"v0.0.0-dev+abc123\",\"Major\":0,\"Minor\":0,\"Patch\":0,\"Prerelease\":\"dev\"}";
    assertEquals(
        new DatabricksCliVersion(0, 0, 0), DatabricksCliCredentialsProvider.parseCliVersion(json));
  }

  @Test
  void testParseCliVersion_MissingFields() {
    String json = "{\"Version\":\"v0.295.0\"}";
    assertEquals(
        DatabricksCliVersion.UNKNOWN, DatabricksCliCredentialsProvider.parseCliVersion(json));
  }

  @Test
  void testParseCliVersion_MalformedJson() {
    assertEquals(
        DatabricksCliVersion.UNKNOWN, DatabricksCliCredentialsProvider.parseCliVersion("not json"));
  }

  @Test
  void testParseCliVersion_EmptyString() {
    assertEquals(
        DatabricksCliVersion.UNKNOWN, DatabricksCliCredentialsProvider.parseCliVersion(""));
  }
}
