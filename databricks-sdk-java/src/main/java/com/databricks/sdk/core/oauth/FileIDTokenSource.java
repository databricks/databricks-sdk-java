package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.google.common.base.Strings;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Implementation of {@link IDTokenSource} that reads the ID token from a file. The token is read
 * using UTF-8 encoding and any leading/trailing whitespace is trimmed.
 *
 * @see IDTokenSource
 */
public class FileIDTokenSource implements IDTokenSource {
  /* The path to the file containing the ID token. */
  private final String filePath;

  /**
   * Creates a new FileIDTokenSource that reads from the specified file.
   *
   * @param filePath Path to the file containing the ID token. The file should contain a single line
   *     with the token value.
   * @throws IllegalArgumentException if the file path is null or empty.
   */
  public FileIDTokenSource(String filePath) {
    this.filePath = filePath;
  }

  /**
   * Retrieves an ID Token from the file. The file is read using UTF-8 encoding and the first line
   * is used as the token value. Any leading or trailing whitespace in the token is trimmed.
   *
   * @param audience The intended recipient of the ID Token. This parameter is not used in this
   *     implementation as the token is read directly from the file.
   * @return An {@link IDToken} containing the token value from the file.
   * @throws IllegalArgumentException if the file path is null or empty.
   * @throws DatabricksException in the following cases:
   *     <ul>
   *       <li>If the file path is invalid or malformed
   *       <li>If the file does not exist
   *       <li>If there are security permission issues accessing the file
   *       <li>If the file is empty or contains only whitespace
   *       <li>If the file cannot be read due to I/O errors
   *       <li>If the token format in the file is invalid
   *     </ul>
   */
  @Override
  public IDToken getIDToken(String audience) {
    if (Strings.isNullOrEmpty(filePath)) {
      throw new IllegalArgumentException("File path cannot be null or empty");
    }

    Path path;
    try {
      path = Paths.get(filePath);
    } catch (InvalidPathException e) {
      throw new DatabricksException("Invalid file path: " + filePath, e);
    }

    try {
      if (!Files.exists(path)) {
        throw new DatabricksException("File " + filePath + " does not exist");
      }
    } catch (SecurityException e) {
      throw new DatabricksException(
          "Security permission denied when checking if file "
              + filePath
              + " exists: "
              + e.getMessage(),
          e);
    }

    List<String> lines;
    try {
      lines = Files.readAllLines(path, StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new DatabricksException(
          "Failed to read ID token from file " + filePath + ": " + e.getMessage(), e);
    } catch (SecurityException e) {
      throw new DatabricksException(
          "Security permission denied when reading file " + filePath + ": " + e.getMessage(), e);
    }

    if (lines.isEmpty()) {
      throw new DatabricksException("File " + filePath + " is empty");
    }

    String token;
    try {
      token = lines.get(0).trim();
    } catch (IndexOutOfBoundsException e) {
      throw new DatabricksException("Invalid token format in file " + filePath);
    }

    try {
      return new IDToken(token);
    } catch (IllegalArgumentException e) {
      throw new DatabricksException("Received empty ID token from file " + filePath);
    }
  }
}
