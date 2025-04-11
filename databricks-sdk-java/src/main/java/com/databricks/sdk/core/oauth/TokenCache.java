package com.databricks.sdk.core.oauth;

/**
 * TokenCache interface for storing and retrieving OAuth tokens. Implementations can use different
 * storage mechanisms and security approaches.
 */
public interface TokenCache {
  /**
   * Saves a Token to the cache.
   *
   * @param token The Token to save
   */
  void save(Token token);

  /**
   * Loads a Token from the cache.
   *
   * @return The Token from the cache or null if the cache doesn't exist or is invalid
   */
  Token load();
}
