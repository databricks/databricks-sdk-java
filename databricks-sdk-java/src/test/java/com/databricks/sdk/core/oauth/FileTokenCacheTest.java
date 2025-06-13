package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** Tests for the FileTokenCache implementation of TokenCache. */
public class FileTokenCacheTest {
  private static final String TEST_HOST = "https://test-host.cloud.databricks.com";
  private static final String TEST_CLIENT_ID = "test-client-id";
  private static final List<String> TEST_SCOPES =
      Arrays.asList("offline_access", "clusters", "sql");
  private Path cacheFile;
  private FileTokenCache tokenCache;

  @BeforeEach
  void setUp() {
    cacheFile = TokenCacheUtils.getCacheFilePath(TEST_HOST, TEST_CLIENT_ID, TEST_SCOPES);
    tokenCache = new FileTokenCache(cacheFile);
  }

  @AfterEach
  void tearDown() throws IOException {
    Files.deleteIfExists(cacheFile);
  }

  @Test
  void testEmptyCache() {
    // When no cache file exists
    assertNull(tokenCache.load(), "Loading from non-existent cache should return null");
  }

  @Test
  void testSaveAndLoadToken() {
    // Given a token
    Instant expiry = Instant.now().plusSeconds(3600);
    Token token = new Token("access-token", "Bearer", "refresh-token", expiry);

    // When saving and loading the token
    tokenCache.save(token);
    Token loadedToken = tokenCache.load();

    // Then the loaded token should match the original
    assertNotNull(loadedToken, "Loaded token should not be null");
    assertEquals("access-token", loadedToken.getAccessToken());
    assertEquals("Bearer", loadedToken.getTokenType());
    assertEquals("refresh-token", loadedToken.getRefreshToken());
    assertFalse(loadedToken.isExpired(), "Token should not be expired");
  }

  @Test
  void testTokenExpiry() {
    // Create an expired token
    Instant pastTime = Instant.now().minusSeconds(3600);
    Token expiredToken = new Token("access-token", "Bearer", "refresh-token", pastTime);

    // Verify it's marked as expired
    assertTrue(expiredToken.isExpired(), "Token should be expired");

    // Create a valid token
    Instant futureTime = Instant.now().plusSeconds(1800);
    Token validToken = new Token("access-token", "Bearer", "refresh-token", futureTime);

    // Verify it's not marked as expired
    assertFalse(validToken.isExpired(), "Token should not be expired");
  }

  @Test
  void testNullPathRejection() {
    // FileTokenCache should reject null path
    assertThrows(
        NullPointerException.class,
        () -> new FileTokenCache(null),
        "Should throw NullPointerException for null path");
  }

  @Test
  void testOverwriteToken() {
    // Given two tokens saved in sequence
    Token token1 = new Token("token1", "Bearer", "refresh1", Instant.now().plusSeconds(3600));
    Token token2 = new Token("token2", "Bearer", "refresh2", Instant.now().plusSeconds(7200));

    tokenCache.save(token1);
    tokenCache.save(token2);

    // When loading from cache
    Token loadedToken = tokenCache.load();

    // Then the second token should be loaded
    assertNotNull(loadedToken, "Loaded token should not be null");
    assertEquals("token2", loadedToken.getAccessToken());
    assertEquals("refresh2", loadedToken.getRefreshToken());
  }

  @Test
  void testWithCustomPath(@TempDir Path tempDir) {
    // Given a token cache with a custom path
    Path tempPath = tempDir.resolve("custom-token-cache");
    FileTokenCache cache = new FileTokenCache(tempPath);

    // And a token
    Token testToken =
        new Token(
            "test-access-token", "Bearer", "test-refresh-token", Instant.now().plusSeconds(3600));

    // When saving and loading
    cache.save(testToken);
    Token loadedToken = cache.load();

    // Then the token should be loaded from the custom path
    assertNotNull(loadedToken, "Should load token from custom cache path");
    assertEquals("test-access-token", loadedToken.getAccessToken());
    assertEquals("Bearer", loadedToken.getTokenType());
    assertEquals("test-refresh-token", loadedToken.getRefreshToken());

    // Verify the file exists
    assertTrue(Files.exists(tempPath), "Cache file should exist at custom path");
  }
}
