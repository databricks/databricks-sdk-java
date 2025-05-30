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
import java.util.stream.Collectors;

/**
 * Implementation of {@link IDTokenSource} that reads the ID token from a file. The token is read
 * using UTF-8 encoding and any leading/trailing whitespace is trimmed. The file should contain
 * exactly one non-empty line with the token value. Files with multiple non-empty lines or only
 * empty lines will result in an error.
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

    boolean isFileExists;
    try {
      isFileExists = Files.exists(path);
    } catch (SecurityException e) {
      throw new DatabricksException(
          String.format(
              "Security permission denied when checking if file %s exists: %s",
              filePath, e.getMessage()),
          e);
    }

    if (!isFileExists) {
      throw new DatabricksException(String.format("File %s does not exist", filePath));
    }

    List<String> rawLines;
    try {
      rawLines = Files.readAllLines(path, StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new DatabricksException(
          String.format("Failed to read ID token from file %s: %s", filePath, e.getMessage()), e);
    } catch (SecurityException e) {
      throw new DatabricksException(
          String.format(
              "Security permission denied when reading file %s: %s", filePath, e.getMessage()),
          e);
    }

    // Filter out empty lines
    List<String> nonEmptyLines =
        rawLines.stream()
            .map(String::trim)
            .filter(line -> !line.isEmpty())
            .collect(Collectors.toList());

    if (nonEmptyLines.isEmpty()) {
      throw new DatabricksException(String.format("File %s contains only empty lines", filePath));
    }

    if (nonEmptyLines.size() > 1) {
      throw new DatabricksException(
          String.format(
              "The token should be a single line but the file %s contains %d non-empty lines",
              filePath, nonEmptyLines.size()));
    }

    String token = nonEmptyLines.get(0);

    try {
      return new IDToken(token);
    } catch (IllegalArgumentException e) {
      throw new DatabricksException(
          String.format("Received empty ID token from file %s", filePath));
    }
  }
}
