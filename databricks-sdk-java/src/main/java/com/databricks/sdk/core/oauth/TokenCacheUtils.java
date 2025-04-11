package com.databricks.sdk.core.oauth;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/** Utility methods for TokenCache implementations. */
public class TokenCacheUtils {
  // Base path for token cache files
  private static final String BASE_PATH = ".config/databricks-sdk-java/oauth";

  /**
   * Returns the path to the cache file for the given configuration. The filename is based on a hash
   * of the host, client ID, and scopes.
   *
   * @param host The Databricks host URL
   * @param clientId The OAuth client ID
   * @param scopes The OAuth scopes requested
   * @return The path to the token cache file
   */
  public static Path getCacheFilePath(String host, String clientId, List<String> scopes) {
    try {
      // Create SHA-256 hash of host, client_id, and scopes
      MessageDigest hash = MessageDigest.getInstance("SHA-256");
      for (String chunk : new String[] {host, clientId, String.join(",", scopes)}) {
        hash.update(chunk.getBytes(StandardCharsets.UTF_8));
      }

      // Convert hash bytes to hexadecimal string
      StringBuilder hexString = new StringBuilder();
      for (byte b : hash.digest()) {
        String hex = Integer.toHexString(0xff & b);
        if (hex.length() == 1) {
          hexString.append('0');
        }
        hexString.append(hex);
      }

      String userHome = System.getProperty("user.home");
      Path basePath = Paths.get(userHome, BASE_PATH);
      return basePath.resolve(hexString.toString());
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException("Failed to create hash for token cache filename", e);
    }
  }
}
