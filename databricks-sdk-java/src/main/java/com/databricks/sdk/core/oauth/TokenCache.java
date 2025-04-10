package com.databricks.sdk.core.oauth;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import com.databricks.sdk.core.utils.SerDeUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.annotations.VisibleForTesting;

/**
 * TokenCache stores OAuth tokens on disk to avoid repeated authentication.
 * It generates a unique cache filename based on the host, client ID, and scopes.
 * If a passphrase is provided, the token data is encrypted for added security.
 */
public class TokenCache {
  // Base path for token cache files, aligned with Python implementation
  private static final String BASE_PATH = ".config/databricks-sdk-java/oauth";
  
  // Encryption constants
  private static final String ALGORITHM = "AES";
  private static final String SECRET_KEY_ALGORITHM = "PBKDF2WithHmacSHA256";
  private static final byte[] SALT = "DatabricksTokenCache".getBytes(); // Fixed salt for simplicity
  private static final int ITERATION_COUNT = 65536;
  private static final int KEY_LENGTH = 256;

  private final String host;
  private final String clientId;
  private final List<String> scopes;
  private final Path cacheFile;
  private final String passphrase;
  private final ObjectMapper mapper;

  /**
   * Constructs a new TokenCache instance for OAuth token caching
   *
   * @param host The Databricks host URL
   * @param clientId The OAuth client ID
   * @param scopes The OAuth scopes requested (optional)
   * @param passphrase The passphrase used to encrypt/decrypt the token cache (optional)
   */
  public TokenCache(
      String host,
      String clientId,
      List<String> scopes,
      String passphrase) {
    this.host = Objects.requireNonNull(host, "host must be defined");
    this.clientId = Objects.requireNonNull(clientId, "clientId must be defined");
    this.scopes = scopes != null ? scopes : new ArrayList<>();
    this.passphrase = passphrase; // Can be null or empty, encryption will be skipped in that case
    this.mapper = SerDeUtils.createMapper();
    
    this.cacheFile = getFilename();
  }

  /**
   * Returns the path to the cache file for the current configuration.
   * The filename is based on a hash of the host, client ID, and scopes.
   * 
   * @return The path to the token cache file
   */
  @VisibleForTesting
  Path getFilename() {
    try {
      // Create SHA-256 hash of host, client_id, and scopes
      MessageDigest hash = MessageDigest.getInstance("SHA-256");
      for (String chunk : new String[] {
          this.host,
          this.clientId,
          String.join(",", this.scopes)
      }) {
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

  /**
   * Determines if encryption should be used based on whether a valid passphrase is provided
   * @return true if encryption should be used, false otherwise
   */
  private boolean shouldUseEncryption() {
    return passphrase != null && !passphrase.isEmpty();
  }

  /**
   * Saves a Token to the cache file, encrypting if a passphrase is provided
   *
   * @param token The Token to save
   * @throws IOException If an error occurs writing to the file
   */
  public void save(Token token) throws IOException {
    try {
      Files.createDirectories(cacheFile.getParent());
      
      byte[] dataToWrite;
      
      // Serialize token to JSON
      String json = mapper.writeValueAsString(token);
      dataToWrite = json.getBytes(StandardCharsets.UTF_8);
      
      // Encrypt data if a passphrase is provided
      if (shouldUseEncryption()) {
        dataToWrite = encrypt(dataToWrite);
      }
      
      Files.write(cacheFile, dataToWrite);
      // Set file permissions to be readable only by the owner (equivalent to 0600)
      cacheFile.toFile().setReadable(false, false);
      cacheFile.toFile().setReadable(true, true);
      cacheFile.toFile().setWritable(false, false);
      cacheFile.toFile().setWritable(true, true);
    } catch (Exception e) {
      throw new IOException("Failed to save token cache: " + e.getMessage(), e);
    }
  }

  /**
   * Loads a Token from the cache file, decrypting if a passphrase was provided
   *
   * @return The Token from the cache or null if the cache file doesn't exist or is invalid
   */
  public Token load() {
    try {
      if (!Files.exists(cacheFile)) {
        return null;
      }
      
      byte[] fileContent = Files.readAllBytes(cacheFile);
      byte[] decodedContent;
      
      if (shouldUseEncryption()) {
        try {
          decodedContent = decrypt(fileContent);
        } catch (Exception e) {
          // If decryption fails, it might be because the file was saved without encryption
          // or the passphrase is incorrect
          return null;
        }
      } else {
        decodedContent = fileContent;
      }
      
      // Deserialize token from JSON
      String json = new String(decodedContent, StandardCharsets.UTF_8);
      return mapper.readValue(json, Token.class);
    } catch (Exception e) {
      // If there's any issue loading the token, return null
      // to allow a fresh token to be obtained
      return null;
    }
  }
  
  /**
   * Generates a secret key from the passphrase using PBKDF2 with HMAC-SHA256.
   *
   * @return A SecretKey generated from the passphrase
   * @throws Exception If an error occurs generating the key
   */
  private SecretKey generateSecretKey() throws Exception {
    SecretKeyFactory factory = SecretKeyFactory.getInstance(SECRET_KEY_ALGORITHM);
    KeySpec spec = new PBEKeySpec(passphrase.toCharArray(), SALT, ITERATION_COUNT, KEY_LENGTH);
    return new SecretKeySpec(factory.generateSecret(spec).getEncoded(), ALGORITHM);
  }

  /**
   * Encrypts the given data using AES encryption with a key derived from the passphrase.
   *
   * @param data The data to encrypt
   * @return The encrypted data
   * @throws Exception If an error occurs during encryption
   */
  private byte[] encrypt(byte[] data) throws Exception {
    Cipher cipher = Cipher.getInstance(ALGORITHM);
    cipher.init(Cipher.ENCRYPT_MODE, generateSecretKey());
    return Base64.getEncoder().encode(cipher.doFinal(data));
  }

  /**
   * Decrypts the given encrypted data using AES decryption with a key derived from the passphrase.
   *
   * @param encryptedData The encrypted data, Base64 encoded
   * @return The decrypted data
   * @throws Exception If an error occurs during decryption
   */
  private byte[] decrypt(byte[] encryptedData) throws Exception {
    Cipher cipher = Cipher.getInstance(ALGORITHM);
    cipher.init(Cipher.DECRYPT_MODE, generateSecretKey());
    return cipher.doFinal(Base64.getDecoder().decode(encryptedData));
  }
}