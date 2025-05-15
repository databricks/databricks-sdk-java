package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.DatabricksException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Tests for FileIDTokenSource. */
public class FileIDTokenSourceTest {
  private static final String TEST_TOKEN = "test-id-token";
  private static final String TEST_AUDIENCE = "test-audience";

  @TempDir Path tempDir;

  private static Stream<Arguments> provideTestCases() {
    return Stream.of(
        // Test case name, fileContent, fileToReadFrom, expected token, expected exception
        Arguments.of("Valid token file", TEST_TOKEN, "token.txt", TEST_TOKEN, null),
        Arguments.of(
            "Token with whitespace", "  " + TEST_TOKEN + "  ", "token.txt", TEST_TOKEN, null),
        Arguments.of("Empty file", "", "token.txt", null, DatabricksException.class),
        Arguments.of(
            "File with only whitespace", "   ", "token.txt", null, DatabricksException.class),
        Arguments.of("Null file path", TEST_TOKEN, null, null, IllegalArgumentException.class),
        Arguments.of("Empty file path", TEST_TOKEN, "", null, IllegalArgumentException.class),
        Arguments.of(
            "Non-existent file", TEST_TOKEN, "nonexistent.txt", null, DatabricksException.class));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideTestCases")
  void testGetIDToken(
      String testName,
      String fileContent,
      String fileToReadFrom,
      String expectedToken,
      Class<? extends Exception> expectedException)
      throws IOException {
    // Always create token.txt with the specified content
    Path tokenFile = tempDir.resolve("token.txt");
    Files.write(tokenFile, fileContent.getBytes(StandardCharsets.UTF_8));

    String filePathToRead = null;
    // If fileToReadFrom is null, we want to simulate passing a null path to FileIDTokenSource (for
    // error cases).
    // If fileToReadFrom is an empty string, we want to simulate passing an empty path (also for
    // error cases).
    // Otherwise, resolve the file name relative to the temp directory to get the full path.
    if (fileToReadFrom != null) {
      if (fileToReadFrom.equals("")) {
        filePathToRead = "";
      } else {
        filePathToRead = tempDir.resolve(fileToReadFrom).toString();
      }
    }

    FileIDTokenSource source = new FileIDTokenSource(filePathToRead);

    if (expectedException != null) {
      assertThrows(expectedException, () -> source.getIDToken(TEST_AUDIENCE));
    } else {
      IDToken token = source.getIDToken(TEST_AUDIENCE);
      assertNotNull(token);
      assertEquals(expectedToken, token.getValue());
    }
  }
}
