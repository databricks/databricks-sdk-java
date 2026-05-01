package com.databricks.sdk.core.error;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.platform.*;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class PlainTextErrorTest {

  @Test
  void plainTextForbiddenReturnsPermissionDenied() {
    DatabricksError error = getError(403, "Forbidden", "Invalid Token");
    assertInstanceOf(PermissionDenied.class, error);
    assertEquals("Invalid Token", error.getMessage());
  }

  @Test
  void plainTextUnauthorizedReturnsUnauthenticated() {
    DatabricksError error = getError(401, "Unauthorized", "Bad credentials");
    assertInstanceOf(Unauthenticated.class, error);
    assertEquals("Bad credentials", error.getMessage());
  }

  @Test
  void plainTextNotFoundReturnsNotFound() {
    DatabricksError error = getError(404, "Not Found", "no such endpoint");
    assertInstanceOf(NotFound.class, error);
    assertEquals("no such endpoint", error.getMessage());
  }

  @Test
  void htmlErrorExtractsPreContent() {
    String html = "<html><body><pre>some error message</pre></body></html>";
    DatabricksError error = getError(403, "Forbidden", html);
    assertInstanceOf(PermissionDenied.class, error);
    assertEquals("some error message", error.getMessage());
  }

  @Test
  void emptyBodyFallsBackToStatusCode() {
    Request request = new Request("GET", "https://example.com/api/2.0/clusters/get");
    Response response = new Response(request, 403, "Forbidden", Collections.emptyMap(), "");
    DatabricksError error = ApiErrors.getDatabricksError(response);
    assertInstanceOf(PermissionDenied.class, error);
  }

  @Test
  void nullBodyFallsBackToStatusCode() {
    Request request = new Request("GET", "https://example.com/api/2.0/clusters/get");
    Response response =
        new Response(request, 403, "Forbidden", Collections.emptyMap(), (String) null);
    DatabricksError error = ApiErrors.getDatabricksError(response);
    assertInstanceOf(PermissionDenied.class, error);
  }

  private static DatabricksError getError(int statusCode, String status, String body) {
    Request request = new Request("GET", "https://example.com/api/2.0/clusters/get");
    Response response = new Response(request, statusCode, status, Collections.emptyMap(), body);
    return ApiErrors.getDatabricksError(response);
  }
}
