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

  private Path createTestFile(String content) throws IOException {
    Path file = tempDir.resolve("test-token.txt");
    Files.write(file, content.getBytes(StandardCharsets.UTF_8));
    return file;
  }

  private static Stream<Arguments> provideTestCases() {
    return Stream.of(
        // Test case name, file path (null means create temp file), file content, expected token,
        // expected exception
        Arguments.of("Valid token file", null, TEST_TOKEN, TEST_TOKEN, null),
        Arguments.of("Token with whitespace", null, "  " + TEST_TOKEN + "  ", TEST_TOKEN, null),
        Arguments.of("Empty file", null, "", null, DatabricksException.class),
        Arguments.of("File with only whitespace", null, "   ", null, DatabricksException.class),
        Arguments.of("Null file path", null, null, null, IllegalArgumentException.class),
        Arguments.of("Empty file path", "", null, null, IllegalArgumentException.class),
        Arguments.of(
            "Non-existent file",
            "/path/to/nonexistent/file.txt",
            null,
            null,
            DatabricksException.class));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideTestCases")
  void testGetIDToken(
      String testName,
      String filePath,
      String fileContent,
      String expectedToken,
      Class<? extends Exception> expectedException)
      throws IOException {
    // If filePath is null, create a temporary test file
    String actualFilePath = filePath;
    if (filePath == null && fileContent != null) {
      actualFilePath = createTestFile(fileContent).toString();
    }

    FileIDTokenSource source = new FileIDTokenSource(actualFilePath);

    if (expectedException != null) {
      assertThrows(expectedException, () -> source.getIDToken(TEST_AUDIENCE));
    } else {
      IDToken token = source.getIDToken(TEST_AUDIENCE);
      assertNotNull(token);
      assertEquals(expectedToken, token.getValue());
    }
  }
}
