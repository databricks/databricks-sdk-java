package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockConstruction;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.databricks.sdk.core.utils.Environment;
import com.databricks.sdk.core.utils.OSUtilities;
import com.databricks.sdk.core.utils.OSUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;

class DatabricksCliCredentialsProviderTest {

  private static final String CLI_PATH = "/usr/local/bin/databricks";
  private static final String HOST = "https://my-workspace.cloud.databricks.com";
  private static final String ACCOUNT_HOST = "https://accounts.cloud.databricks.com";
  private static final String ACCOUNT_ID = "test-account-123";
  private static final String PROFILE = "my-profile";

  private final DatabricksCliCredentialsProvider provider = new DatabricksCliCredentialsProvider();

  @BeforeEach
  void resetVersionCache() {
    DatabricksCliCredentialsProvider.clearVersionCache();
  }

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

  @Test
  void testBuildHostCommand_NullHost_ThrowsClearError() {
    DatabricksConfig config = new DatabricksConfig(); // no host

    DatabricksException ex =
        assertThrows(DatabricksException.class, () -> provider.buildHostArgs(CLI_PATH, config));
    assertTrue(ex.getMessage().contains("host is required"), ex.getMessage());
  }

  @Test
  void testBuildCliCommand_ProfileWithNullHost_ThrowsClearError() {
    // profile + null host + old CLI → would fall through to buildHostArgs and emit ["--host",
    // null]. The buildHostArgs guard turns that into a clear DatabricksException instead.
    DatabricksConfig config = new DatabricksConfig().setProfile(PROFILE);

    assertThrows(
        DatabricksException.class,
        () -> provider.buildCliCommand(CLI_PATH, config, new DatabricksCliVersion(0, 207, 0)));
  }

  // ---- buildCliCommand tests ----

  private static Stream<Arguments> buildCliCommandCases() {
    return Stream.of(
        Arguments.of(
            "host only — old CLI",
            new DatabricksConfig().setHost(HOST),
            new DatabricksCliVersion(0, 200, 0),
            Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST)),
        Arguments.of(
            "account host — old CLI",
            new DatabricksConfig().setHost(ACCOUNT_HOST).setAccountId(ACCOUNT_ID),
            new DatabricksCliVersion(0, 200, 0),
            Arrays.asList(
                CLI_PATH, "auth", "token", "--host", ACCOUNT_HOST, "--account-id", ACCOUNT_ID)),
        Arguments.of(
            "profile with new CLI — uses --profile",
            new DatabricksConfig().setProfile(PROFILE).setHost(HOST),
            DatabricksCliCredentialsProvider.CLI_VERSION_FOR_PROFILE,
            Arrays.asList(CLI_PATH, "auth", "token", "--profile", PROFILE)),
        Arguments.of(
            "profile with old CLI — falls back to --host",
            new DatabricksConfig().setProfile(PROFILE).setHost(HOST),
            new DatabricksCliVersion(0, 207, 0),
            Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST)),
        Arguments.of(
            "unknown version — falls back to --host",
            new DatabricksConfig().setProfile(PROFILE).setHost(HOST),
            DatabricksCliVersion.UNKNOWN,
            Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST)),
        Arguments.of(
            "dev build — falls back to --host",
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
    assertEquals(new DatabricksCliVersion(0, 295, 0), provider.parseCliVersion(json));
  }

  @Test
  void testParseCliVersion_ProfileVersion() {
    String json = "{\"Version\":\"v0.207.1\",\"Major\":0,\"Minor\":207,\"Patch\":1}";
    assertEquals(new DatabricksCliVersion(0, 207, 1), provider.parseCliVersion(json));
  }

  @Test
  void testParseCliVersion_DevBuild() {
    String json =
        "{\"Version\":\"v0.0.0-dev+abc123\",\"Major\":0,\"Minor\":0,\"Patch\":0,\"Prerelease\":\"dev\"}";
    assertEquals(new DatabricksCliVersion(0, 0, 0), provider.parseCliVersion(json));
  }

  @Test
  void testParseCliVersion_MissingFields() {
    String json = "{\"Version\":\"v0.295.0\"}";
    assertEquals(DatabricksCliVersion.UNKNOWN, provider.parseCliVersion(json));
  }

  @Test
  void testParseCliVersion_MalformedJson() {
    assertEquals(DatabricksCliVersion.UNKNOWN, provider.parseCliVersion("not json"));
  }

  @Test
  void testParseCliVersion_EmptyString() {
    assertEquals(DatabricksCliVersion.UNKNOWN, provider.parseCliVersion(""));
  }

  @ParameterizedTest(name = "non-integer field: {0}")
  @ValueSource(
      strings = {
        // Major as string
        "{\"Major\":\"v0\",\"Minor\":295,\"Patch\":0}",
        // Minor as string
        "{\"Major\":0,\"Minor\":\"bad\",\"Patch\":0}",
        // Patch as string
        "{\"Major\":0,\"Minor\":295,\"Patch\":\"x\"}",
        // Major as JSON null
        "{\"Major\":null,\"Minor\":295,\"Patch\":0}",
        // Major as array
        "{\"Major\":[0],\"Minor\":295,\"Patch\":0}",
        // Major as object
        "{\"Major\":{\"v\":0},\"Minor\":295,\"Patch\":0}",
        // Major as boolean
        "{\"Major\":true,\"Minor\":295,\"Patch\":0}",
        // Major as floating-point (not integral)
        "{\"Major\":0.5,\"Minor\":295,\"Patch\":0}"
      })
  void testParseCliVersion_NonIntegerFields(String json) {
    assertEquals(DatabricksCliVersion.UNKNOWN, provider.parseCliVersion(json));
  }

  // ---- getCliVersion cache tests ----

  /**
   * Subclassable provider whose {@code probeCliVersion} returns canned values and counts
   * invocations. Lets cache tests verify cache hit/miss without spawning real subprocesses.
   */
  private static class FakeProvider extends DatabricksCliCredentialsProvider {
    final AtomicInteger probeCount = new AtomicInteger();
    DatabricksCliVersion[] sequence;
    IOException throwOnFirstCall;

    FakeProvider(DatabricksCliVersion... sequence) {
      this.sequence = sequence;
    }

    @Override
    DatabricksCliVersion probeCliVersion(String cliPath, Environment env) throws IOException {
      int call = probeCount.getAndIncrement();
      if (call == 0 && throwOnFirstCall != null) {
        throw throwOnFirstCall;
      }
      return sequence[Math.min(call, sequence.length - 1)];
    }
  }

  @Test
  void testGetCliVersion_SuccessIsCached() {
    FakeProvider p = new FakeProvider(new DatabricksCliVersion(0, 295, 0));
    Environment env = mock(Environment.class);

    DatabricksCliVersion first = p.getCliVersion(CLI_PATH, env);
    DatabricksCliVersion second = p.getCliVersion(CLI_PATH, env);

    assertEquals(new DatabricksCliVersion(0, 295, 0), first);
    assertEquals(first, second);
    assertEquals(1, p.probeCount.get(), "Successful probe should be cached and reused");
  }

  @Test
  void testGetCliVersion_ThrownProbeIsNotCached() {
    FakeProvider p = new FakeProvider(new DatabricksCliVersion(0, 295, 0));
    p.throwOnFirstCall = new IOException("transient failure");
    Environment env = mock(Environment.class);

    assertEquals(DatabricksCliVersion.UNKNOWN, p.getCliVersion(CLI_PATH, env));
    assertEquals(new DatabricksCliVersion(0, 295, 0), p.getCliVersion(CLI_PATH, env));
    assertEquals(2, p.probeCount.get(), "Failed probe should be retried, not cached");
  }

  @Test
  void testGetCliVersion_UnknownReturnIsNotCached() {
    // probe returns UNKNOWN (parseable-but-malformed JSON) on the first call, real version after.
    FakeProvider p =
        new FakeProvider(DatabricksCliVersion.UNKNOWN, new DatabricksCliVersion(0, 295, 0));
    Environment env = mock(Environment.class);

    assertEquals(DatabricksCliVersion.UNKNOWN, p.getCliVersion(CLI_PATH, env));
    assertEquals(new DatabricksCliVersion(0, 295, 0), p.getCliVersion(CLI_PATH, env));
    assertEquals(2, p.probeCount.get(), "UNKNOWN result should not pin the cache");
  }

  @Test
  void testGetCliVersion_DistinctCliPathsKeptSeparate() {
    DatabricksCliCredentialsProvider p =
        new DatabricksCliCredentialsProvider() {
          @Override
          DatabricksCliVersion probeCliVersion(String cliPath, Environment env) {
            return cliPath.equals("/cli-a")
                ? new DatabricksCliVersion(0, 200, 0)
                : new DatabricksCliVersion(0, 300, 0);
          }
        };
    Environment env = mock(Environment.class);

    assertEquals(new DatabricksCliVersion(0, 200, 0), p.getCliVersion("/cli-a", env));
    assertEquals(new DatabricksCliVersion(0, 300, 0), p.getCliVersion("/cli-b", env));
    // Both paths should now be cached and consistent across re-reads.
    assertEquals(new DatabricksCliVersion(0, 200, 0), p.getCliVersion("/cli-a", env));
    assertEquals(new DatabricksCliVersion(0, 300, 0), p.getCliVersion("/cli-b", env));
  }

  @Test
  void testGetCliVersion_NormalizedPathsShareCacheEntry() {
    AtomicInteger probeCount = new AtomicInteger();
    DatabricksCliCredentialsProvider p =
        new DatabricksCliCredentialsProvider() {
          @Override
          DatabricksCliVersion probeCliVersion(String cliPath, Environment env) {
            probeCount.incrementAndGet();
            return new DatabricksCliVersion(0, 295, 0);
          }
        };
    Environment env = mock(Environment.class);

    // All three forms normalize to /usr/local/bin/databricks.
    p.getCliVersion("/usr/local/bin/databricks", env);
    p.getCliVersion("/usr/local/bin/./databricks", env);
    p.getCliVersion("/usr/local/bin/../bin/databricks", env);

    assertEquals(1, probeCount.get(), "Normalized cliPaths should share a cache entry");
  }

  @Test
  void testGetCliVersion_ConcurrentColdCallsProbeOnce() throws Exception {
    AtomicInteger probeCount = new AtomicInteger();
    CountDownLatch start = new CountDownLatch(1);
    DatabricksCliCredentialsProvider p =
        new DatabricksCliCredentialsProvider() {
          @Override
          DatabricksCliVersion probeCliVersion(String cliPath, Environment env) {
            probeCount.incrementAndGet();
            // Hold the per-bucket lock long enough that any other concurrent caller is
            // forced to wait inside computeIfAbsent and observe the cached value rather
            // than launching a duplicate probe.
            try {
              Thread.sleep(50);
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
            return new DatabricksCliVersion(0, 295, 0);
          }
        };
    Environment env = mock(Environment.class);

    int threads = 4;
    ExecutorService pool = Executors.newFixedThreadPool(threads);
    try {
      List<Future<DatabricksCliVersion>> futures = new ArrayList<>();
      for (int i = 0; i < threads; i++) {
        futures.add(
            pool.submit(
                () -> {
                  start.await();
                  return p.getCliVersion(CLI_PATH, env);
                }));
      }
      start.countDown();
      for (Future<DatabricksCliVersion> f : futures) {
        assertEquals(new DatabricksCliVersion(0, 295, 0), f.get());
      }
    } finally {
      pool.shutdown();
    }
    assertEquals(1, probeCount.get(), "Concurrent cold-cache calls should single-flight");
  }

  // ---- probeCliVersion subprocess tests ----

  /** Builds a mock Process whose merged-output stream returns {@code stdout}. */
  private static Process mockProcess(String stdout, int exitCode, boolean exited) throws Exception {
    Process process = mock(Process.class);
    when(process.getInputStream())
        .thenReturn(new ByteArrayInputStream(stdout.getBytes(StandardCharsets.UTF_8)));
    when(process.getOutputStream()).thenReturn(new ByteArrayOutputStream());
    when(process.waitFor(anyLong(), any(TimeUnit.class))).thenReturn(exited);
    when(process.exitValue()).thenReturn(exitCode);
    // destroyForcibly() returns the Process so callers can chain .waitFor(...) on it.
    when(process.destroyForcibly()).thenReturn(process);
    return process;
  }

  private static Environment mockEnv() {
    Environment env = mock(Environment.class);
    when(env.getEnv()).thenReturn(new HashMap<>());
    return env;
  }

  private static OSUtilities passthroughOsUtils() {
    OSUtilities osUtils = mock(OSUtilities.class);
    when(osUtils.getCliExecutableCommand(any())).thenAnswer(inv -> inv.getArgument(0));
    return osUtils;
  }

  @Test
  void testProbeCliVersion_SuccessReturnsParsedVersion() throws Exception {
    Environment env = mockEnv();
    OSUtilities osUtils = passthroughOsUtils();
    Process process =
        mockProcess("{\"Version\":\"v0.295.0\",\"Major\":0,\"Minor\":295,\"Patch\":0}", 0, true);

    try (MockedStatic<OSUtils> mockedOSUtils = mockStatic(OSUtils.class);
        MockedConstruction<ProcessBuilder> mocked =
            mockConstruction(
                ProcessBuilder.class,
                (pb, ctx) -> {
                  when(pb.redirectErrorStream(anyBoolean())).thenReturn(pb);
                  when(pb.start()).thenReturn(process);
                })) {
      mockedOSUtils.when(() -> OSUtils.get(any())).thenReturn(osUtils);

      DatabricksCliVersion version = provider.probeCliVersion(CLI_PATH, env);

      assertEquals(new DatabricksCliVersion(0, 295, 0), version);
      // The argument passed to the OS wrapper should be the un-wrapped command.
      verify(osUtils)
          .getCliExecutableCommand(Arrays.asList(CLI_PATH, "version", "--output", "json"));
      // Regression guard: destroyForcibly on an already-exited process closes the parent end
      // of the stdout pipe on Linux/OpenJDK 11+, breaking the subsequent readStream call.
      // Only the timeout/interrupted paths should ever destroy.
      verify(process, never()).destroyForcibly();
    }
  }

  @Test
  void testProbeCliVersion_TimeoutThrowsAndDestroys() throws Exception {
    Environment env = mockEnv();
    OSUtilities osUtils = passthroughOsUtils();
    Process process = mockProcess("", 0, /* exited= */ false);

    try (MockedStatic<OSUtils> mockedOSUtils = mockStatic(OSUtils.class);
        MockedConstruction<ProcessBuilder> mocked =
            mockConstruction(
                ProcessBuilder.class,
                (pb, ctx) -> {
                  when(pb.redirectErrorStream(anyBoolean())).thenReturn(pb);
                  when(pb.start()).thenReturn(process);
                })) {
      mockedOSUtils.when(() -> OSUtils.get(any())).thenReturn(osUtils);

      IOException ex =
          assertThrows(IOException.class, () -> provider.probeCliVersion(CLI_PATH, env));
      assertTrue(ex.getMessage().contains("timed out"), ex.getMessage());
      verify(process, atLeastOnce()).destroyForcibly();
    }
  }

  @Test
  void testProbeCliVersion_NonZeroExitSurfacesOutput() throws Exception {
    Environment env = mockEnv();
    OSUtilities osUtils = passthroughOsUtils();
    String stderr = "command not found";
    Process process = mockProcess(stderr, 1, true);

    try (MockedStatic<OSUtils> mockedOSUtils = mockStatic(OSUtils.class);
        MockedConstruction<ProcessBuilder> mocked =
            mockConstruction(
                ProcessBuilder.class,
                (pb, ctx) -> {
                  when(pb.redirectErrorStream(anyBoolean())).thenReturn(pb);
                  when(pb.start()).thenReturn(process);
                })) {
      mockedOSUtils.when(() -> OSUtils.get(any())).thenReturn(osUtils);

      IOException ex =
          assertThrows(IOException.class, () -> provider.probeCliVersion(CLI_PATH, env));
      assertTrue(ex.getMessage().contains("exited with code 1"), ex.getMessage());
      assertTrue(ex.getMessage().contains(stderr), ex.getMessage());
      // Same regression guard as the success path: the process exited on its own, so we must
      // not destroy (which would close the stdout FD before we read it).
      verify(process, never()).destroyForcibly();
    }
  }
}
