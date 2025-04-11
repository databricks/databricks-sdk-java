package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.utils.SerDeUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** A TokenCache implementation that stores tokens as plain files. */
public class FileTokenCache implements TokenCache {
  private static final Logger LOGGER = LoggerFactory.getLogger(FileTokenCache.class);

  private final Path cacheFile;
  private final ObjectMapper mapper;

  /**
   * Constructs a new SimpleFileTokenCache instance.
   *
   * @param cacheFilePath The path where the token cache will be stored
   */
  public FileTokenCache(Path cacheFilePath) {
    Objects.requireNonNull(cacheFilePath, "cacheFilePath must be defined");

    this.cacheFile = cacheFilePath;
    this.mapper = SerDeUtils.createMapper();
  }

  @Override
  public void save(Token token) {
    try {
      Files.createDirectories(cacheFile.getParent());

      // Serialize token to JSON
      String json = mapper.writeValueAsString(token);
      byte[] dataToWrite = json.getBytes(StandardCharsets.UTF_8);

      Files.write(cacheFile, dataToWrite);
      // Set file permissions to be readable only by the owner (equivalent to 0600)
      cacheFile.toFile().setReadable(false, false);
      cacheFile.toFile().setReadable(true, true);
      cacheFile.toFile().setWritable(false, false);
      cacheFile.toFile().setWritable(true, true);

      LOGGER.debug("Successfully saved token to cache: {}", cacheFile);
    } catch (Exception e) {
      LOGGER.warn("Failed to save token to cache: {}", cacheFile, e);
    }
  }

  @Override
  public Token load() {
    try {
      if (!Files.exists(cacheFile)) {
        LOGGER.debug("No token cache file found at: {}", cacheFile);
        return null;
      }

      byte[] fileContent = Files.readAllBytes(cacheFile);

      // Deserialize token from JSON
      String json = new String(fileContent, StandardCharsets.UTF_8);
      Token token = mapper.readValue(json, Token.class);
      LOGGER.debug("Successfully loaded token from cache: {}", cacheFile);
      return token;
    } catch (Exception e) {
      // If there's any issue loading the token, return null
      // to allow a fresh token to be obtained
      LOGGER.warn("Failed to load token from cache: {}", e.getMessage());
      return null;
    }
  }
}
