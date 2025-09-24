package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.utils.Environment;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Tests for AzureDevOpsIDTokenSource. */
public class AzureDevOpsIDTokenSourceTest {

  private static final String TEST_ID_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9...";
  private static final String TEST_ACCESS_TOKEN = "test-access-token";
  private static final String TEST_COLLECTION_URI = "https://dev.azure.com/testorg";
  private static final String TEST_PLAN_ID = "test-plan-id";
  private static final String TEST_JOB_ID = "test-job-id";
  private static final String TEST_PROJECT_ID = "test-project-id";
  private static final String TEST_HOST_TYPE = "build";

  /** Creates a mock Environment with all required Azure DevOps environment variables. */
  private static Environment createValidEnvironment() {
    Map<String, String> envVars = new HashMap<>();
    envVars.put("SYSTEM_ACCESSTOKEN", TEST_ACCESS_TOKEN);
    envVars.put("SYSTEM_TEAMFOUNDATIONCOLLECTIONURI", TEST_COLLECTION_URI);
    envVars.put("SYSTEM_PLANID", TEST_PLAN_ID);
    envVars.put("SYSTEM_JOBID", TEST_JOB_ID);
    envVars.put("SYSTEM_TEAMPROJECTID", TEST_PROJECT_ID);
    envVars.put("SYSTEM_HOSTTYPE", TEST_HOST_TYPE);
    return new Environment(envVars, new String[0], "test");
  }

  /** Creates a mock Environment missing the specified environment variable. */
  private static Environment createEnvironmentMissing(String missingVar) {
    Map<String, String> envVars = new HashMap<>();
    envVars.put("SYSTEM_ACCESSTOKEN", TEST_ACCESS_TOKEN);
    envVars.put("SYSTEM_TEAMFOUNDATIONCOLLECTIONURI", TEST_COLLECTION_URI);
    envVars.put("SYSTEM_PLANID", TEST_PLAN_ID);
    envVars.put("SYSTEM_JOBID", TEST_JOB_ID);
    envVars.put("SYSTEM_TEAMPROJECTID", TEST_PROJECT_ID);
    envVars.put("SYSTEM_HOSTTYPE", TEST_HOST_TYPE);
    envVars.remove(missingVar); // Remove the specified variable
    return new Environment(envVars, new String[0], "test");
  }

  /** Creates a mock HttpClient that returns the specified response. */
  private static HttpClient createHttpMock(
      String responseBody, int statusCode, IOException exception) throws IOException {
    HttpClient client = mock(HttpClient.class);
    if (exception != null) {
      when(client.execute(any(Request.class))).thenThrow(exception);
    } else {
      when(client.execute(any(Request.class))).thenReturn(makeResponse(responseBody, statusCode));
    }
    return client;
  }

  /** Creates a Response with the specified body and status code. */
  private static Response makeResponse(String body, int statusCode) throws MalformedURLException {
    return new Response(body, statusCode, "OK", new URL("https://databricks.com/"));
  }

  /** Creates a mock HttpClient that returns a successful OIDC token response. */
  private static HttpClient createValidHttpMock() throws IOException {
    return createHttpMock("{\"oidcToken\":\"" + TEST_ID_TOKEN + "\"}", 200, null);
  }

  /** Predicate to validate that the HTTP request is constructed correctly. */
  private static final Predicate<Request> REQUEST_VALIDATOR =
      request ->
          request.getMethod().equals("POST")
              && request.getUri().toString().contains("api-version=7.2-preview.1")
              && request.getUri().toString().contains(TEST_COLLECTION_URI)
              && request.getUri().toString().contains(TEST_PROJECT_ID)
              && request.getUri().toString().contains(TEST_HOST_TYPE)
              && request.getUri().toString().contains(TEST_PLAN_ID)
              && request.getUri().toString().contains(TEST_JOB_ID)
              && request.getHeaders().get("Authorization").equals("Bearer " + TEST_ACCESS_TOKEN)
              && request.getHeaders().get("Content-Type").equals("application/json");

  private static Stream<Arguments> provideAllTestScenarios() throws IOException {
    return Stream.of(
        // Constructor validation tests
        Arguments.of(
            "Null HttpClient",
            null,
            createValidEnvironment(),
            null,
            null,
            DatabricksException.class),
        Arguments.of(
            "Missing SYSTEM_ACCESSTOKEN",
            mock(HttpClient.class),
            createEnvironmentMissing("SYSTEM_ACCESSTOKEN"),
            null,
            null,
            DatabricksException.class),
        Arguments.of(
            "Missing SYSTEM_TEAMFOUNDATIONCOLLECTIONURI",
            mock(HttpClient.class),
            createEnvironmentMissing("SYSTEM_TEAMFOUNDATIONCOLLECTIONURI"),
            null,
            null,
            DatabricksException.class),
        Arguments.of(
            "Missing SYSTEM_PLANID",
            mock(HttpClient.class),
            createEnvironmentMissing("SYSTEM_PLANID"),
            null,
            null,
            DatabricksException.class),
        Arguments.of(
            "Missing SYSTEM_JOBID",
            mock(HttpClient.class),
            createEnvironmentMissing("SYSTEM_JOBID"),
            null,
            null,
            DatabricksException.class),
        Arguments.of(
            "Missing SYSTEM_TEAMPROJECTID",
            mock(HttpClient.class),
            createEnvironmentMissing("SYSTEM_TEAMPROJECTID"),
            null,
            null,
            DatabricksException.class),
        Arguments.of(
            "Missing SYSTEM_HOSTTYPE",
            mock(HttpClient.class),
            createEnvironmentMissing("SYSTEM_HOSTTYPE"),
            null,
            null,
            DatabricksException.class),

        // HTTP request/response tests
        Arguments.of(
            "Successful token retrieval",
            createValidHttpMock(),
            createValidEnvironment(),
            REQUEST_VALIDATOR,
            TEST_ID_TOKEN,
            null),
        Arguments.of(
            "HTTP request failure",
            createHttpMock(null, 0, new IOException("Network error")),
            createValidEnvironment(),
            null,
            null,
            DatabricksException.class),
        Arguments.of(
            "Non-200 status code",
            createHttpMock("Error message", 401, null),
            createValidEnvironment(),
            null,
            null,
            DatabricksException.class),
        Arguments.of(
            "Invalid JSON response",
            createHttpMock("invalid json", 200, null),
            createValidEnvironment(),
            null,
            null,
            DatabricksException.class),
        Arguments.of(
            "Missing oidcToken field",
            createHttpMock("{\"someOtherField\":\"value\"}", 200, null),
            createValidEnvironment(),
            null,
            null,
            DatabricksException.class),
        Arguments.of(
            "Empty oidcToken field",
            createHttpMock("{\"oidcToken\":\"\"}", 200, null),
            createValidEnvironment(),
            null,
            null,
            DatabricksException.class),
        Arguments.of(
            "Null oidcToken field",
            createHttpMock("{\"oidcToken\":null}", 200, null),
            createValidEnvironment(),
            null,
            null,
            DatabricksException.class));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideAllTestScenarios")
  void testAllScenarios(
      String testName,
      HttpClient httpClient,
      Environment environment,
      Predicate<Request> requestValidator,
      String expectedToken,
      Class<? extends Exception> expectedException) {

    if (expectedException != null) {
      // Test constructor or runtime exceptions
      assertThrows(
          expectedException,
          () -> {
            AzureDevOpsIDTokenSource tokenSource =
                new AzureDevOpsIDTokenSource(httpClient, environment);
            // If constructor succeeds, try getIDToken to trigger runtime exceptions
            tokenSource.getIDToken("ignored-audience");
          });
    } else {
      // Test successful cases
      AzureDevOpsIDTokenSource tokenSource = new AzureDevOpsIDTokenSource(httpClient, environment);
      IDToken token = tokenSource.getIDToken("ignored-audience");
      assertNotNull(token);
      assertEquals(expectedToken, token.getValue());

      // Verify the HTTP request was made correctly
      if (requestValidator != null) {
        try {
          verify(httpClient).execute(argThat(request -> requestValidator.test(request)));
        } catch (IOException e) {
          fail("Unexpected IOException during request verification: " + e.getMessage());
        }
      }
    }
  }
}
