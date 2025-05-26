package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.DatabricksException;
import org.junit.jupiter.api.Test;

public class ErrorTokenSourceTest {

  @Test
  public void testGetTokenThrowsException() {
    String errorMessage = "Test error message";
    ErrorTokenSource tokenSource = new ErrorTokenSource(errorMessage);

    DatabricksException exception =
        assertThrows(
            DatabricksException.class,
            () -> tokenSource.getToken(),
            "Expected getToken() to throw DatabricksException");

    assertEquals(
        errorMessage,
        exception.getMessage(),
        "Exception message should match the one provided in constructor");
  }

  @Test
  public void testConstructorWithNullErrorMessage() {
    assertThrows(
        NullPointerException.class,
        () -> new ErrorTokenSource(null),
        "Expected constructor to throw NullPointerException when error message is null");
  }
}
