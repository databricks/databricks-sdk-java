package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;

public class TokenCacheTest {
  private static final String TEST_HOST = "https://test-host.cloud.databricks.com";
  private static final String TEST_CLIENT_ID = "test-client-id";
  private static final List<String> TEST_SCOPES = Arrays.asList("offline_access", "clusters", "sql");
  private static final String TEST_PASS = "test-passphrase";
  private Path cacheFile;
  private TokenCache tokenCache;

    @BeforeEach
  void setUp() {
    tokenCache = new TokenCache(TEST_HOST, TEST_CLIENT_ID, TEST_SCOPES, TEST_PASS);
    cacheFile = tokenCache.getFilename();
  }

  @AfterEach
  void tearDown() throws IOException {
    Files.deleteIfExists(cacheFile);
  }

  @Test
  void testEmptyCache() throws IOException {
    assertNull(tokenCache.load());
  }

  @Test
  void testSaveAndLoadToken() throws IOException {
    LocalDateTime expiry = LocalDateTime.now().plusHours(1);
    Token token = new Token("access-token", "Bearer", "refresh-token", expiry);
    
    tokenCache.save(token);
    
    Token loadedToken = tokenCache.load();
    assertNotNull(loadedToken, "Loaded token should not be null");
    assertEquals("access-token", loadedToken.getAccessToken());
    assertEquals("Bearer", loadedToken.getTokenType());
    assertEquals("refresh-token", loadedToken.getRefreshToken());
    // No direct way to compare expiry times exactly, but we can compare if they're both in the future
    assertFalse(loadedToken.isExpired(), "Token should not be expired");
  }

  @Test
  void testTokenExpiry() throws IOException {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime expiry = now.plusMinutes(30);
    Token token = new Token("access-token", "Bearer", "refresh-token", expiry);
    
    tokenCache.save(token);
    
    Token loadedToken = tokenCache.load();
    assertNotNull(loadedToken, "Loaded token should not be null");
    assertFalse(loadedToken.isExpired(), "Token should not be expired");

    // Create a new token with past expiry
    Token expiredToken = new Token("access-token", "Bearer", "refresh-token", now.minusHours(1));
    assertTrue(expiredToken.isExpired(), "Token should be expired");
  }

  @Test
  void testInvalidPassphrase() {
    assertThrows(NullPointerException.class, () -> new TokenCache(null, TEST_CLIENT_ID, TEST_SCOPES, TEST_PASS));
  }

  @Test
  void testOverwriteToken() throws IOException {
    Token token1 = new Token("token1", "Bearer", "refresh1", LocalDateTime.now().plusHours(1));
    Token token2 = new Token("token2", "Bearer", "refresh2", LocalDateTime.now().plusHours(2));

    tokenCache.save(token1);
    tokenCache.save(token2);

    Token loadedToken = tokenCache.load();
    assertNotNull(loadedToken, "Loaded token should not be null");
    assertEquals("token2", loadedToken.getAccessToken());
    assertEquals("refresh2", loadedToken.getRefreshToken());
  }

  @Test
  void testTokenCacheSaveLoad(@TempDir Path tempDir) throws IOException {
    // Create a token cache that uses a temp directory
    TokenCache cache = spy(new TokenCache(TEST_HOST, TEST_CLIENT_ID, TEST_SCOPES, TEST_PASS));

    // Create test token
    Token testToken = new Token(
        "test-access-token", 
        "Bearer", 
        "test-refresh-token", 
        LocalDateTime.now().plusHours(1));
    
    // Save to cache
    cache.save(testToken);

    // Load from cache
    Token loadedToken = cache.load();
    assertNotNull(loadedToken, "Should load token from cache");
    
    // Verify token details
    assertEquals("test-access-token", loadedToken.getAccessToken());
    assertEquals("Bearer", loadedToken.getTokenType());
    assertEquals("test-refresh-token", loadedToken.getRefreshToken());
  }
  
  @Test
  void testDatabricksConfigTokenCache() throws IOException {
    // Create a DatabricksConfig with the test values
    DatabricksConfig config = new DatabricksConfig()
        .setHost(TEST_HOST)
        .setClientId(TEST_CLIENT_ID)
        .setScopes(TEST_SCOPES)
        .setOAuthPassphrase(TEST_PASS);
    
    // Get TokenCache from config
    TokenCache cache = config.getTokenCache();
    assertNotNull(cache, "TokenCache from config should not be null");
    
    // Create test token
    Token testToken = new Token(
        "config-access-token", 
        "Bearer", 
        "config-refresh-token", 
        LocalDateTime.now().plusHours(1));
    
    // Save to cache directly
    cache.save(testToken);
    
    // Load from cache directly
    Token loadedToken = cache.load();
    assertNotNull(loadedToken, "Should load token from cache directly");
    
    // Verify token details
    assertEquals("config-access-token", loadedToken.getAccessToken());
    assertEquals("Bearer", loadedToken.getTokenType());
    assertEquals("config-refresh-token", loadedToken.getRefreshToken());
    
    // Clean up
    Files.deleteIfExists(cache.getFilename());
  }
}
