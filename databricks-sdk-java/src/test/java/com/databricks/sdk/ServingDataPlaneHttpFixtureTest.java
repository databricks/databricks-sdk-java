package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.databricks.sdk.core.CredentialsProvider;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.FixtureServer.FixtureMapping;
import com.databricks.sdk.core.oauth.OAuthHeaderFactory;
import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.service.serving.QueryEndpointInput;
import com.databricks.sdk.service.serving.QueryEndpointResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

class ServingDataPlaneHttpFixtureTest {
  private static final String AUTHORIZATION_DETAILS =
      "{\"type\":\"query\",\"resource\":\"route-optimized\"}";

  @Test
  void queryDiscoversEndpointExchangesTokenAndCallsDataPlane() throws IOException {
    try (FixtureServer server = new FixtureServer()) {
      FixtureMapping discovery =
          new FixtureMapping.Builder()
              .validateMethod("GET")
              .validatePath("/api/2.0/serving-endpoints/route-optimized")
              .validateHeadersPresent(header("Authorization", "Bearer control-plane-token"))
              .withResponse(
                  "{\"name\":\"route-optimized\",\"data_plane_info\":{\"query_info\":{"
                      + "\"endpoint_url\":\""
                      + server.getUrl()
                      + "/invocations\",\"authorization_details\":\"{\\\"type\\\":\\\"query\\\",\\\"resource\\\":\\\"route-optimized\\\"}\"}}}",
                  200)
              .build();
      FixtureMapping tokenExchange =
          new FixtureMapping.Builder()
              .validateMethod("POST")
              .validatePath("/oidc/v1/token")
              .validateHeadersPresent(header("Content-Type", "application/x-www-form-urlencoded"))
              .validate(
                  exchange -> {
                    String decoded =
                        URLDecoder.decode(
                            IOUtils.toString(exchange.getRequestBody(), StandardCharsets.UTF_8),
                            StandardCharsets.UTF_8.name());
                    Set<String> parameters = new HashSet<>(Arrays.asList(decoded.split("&")));
                    assertTrue(
                        parameters.contains(
                            "grant_type=urn:ietf:params:oauth:grant-type:jwt-bearer"));
                    assertTrue(parameters.contains("assertion=control-plane-token"));
                    assertTrue(
                        parameters.contains("authorization_details=" + AUTHORIZATION_DETAILS));
                  })
              .withResponse(
                  "{\"access_token\":\"data-plane-token\",\"token_type\":\"Bearer\",\"expires_in\":3600}",
                  200)
              .build();
      FixtureMapping query =
          new FixtureMapping.Builder()
              .validateMethod("POST")
              .validatePath("/invocations")
              .validateHeadersPresent(header("Authorization", "Bearer data-plane-token"))
              .validateHeadersPresent(header("X-Databricks-Workspace-Id", "123"))
              .validateBody("{\"inputs\":[1.0,2.0]}")
              .withResponse("{\"predictions\":[0.75]}", 200)
              .withResponseHeaders(header("served-model-name", "model-v1"))
              .build();
      server.with(discovery).with(tokenExchange).with(query);

      WorkspaceClient workspace =
          new WorkspaceClient(
              new DatabricksConfig()
                  .setHost(server.getUrl())
                  .setWorkspaceId("123")
                  .setCredentialsProvider(controlPlaneCredentials())
                  .setDisableAsyncTokenRefresh(true)
                  .setDisableRetries(true));
      QueryEndpointResponse response =
          workspace
              .servingEndpointsDataPlane()
              .query(
                  new QueryEndpointInput()
                      .setName("route-optimized")
                      .setInputs(Arrays.asList(1.0, 2.0)));

      assertEquals(Collections.singletonList(0.75), response.getPredictions());
      assertEquals("model-v1", response.getServedModelName());
      assertEquals("fixture-oauth", workspace.config().getAuthType());
      server.assertAllFixturesConsumed();
    }
  }

  private static CredentialsProvider controlPlaneCredentials() {
    return CredentialsProvider.from(
        "fixture-oauth",
        config -> {
          Token token =
              new Token("control-plane-token", "Bearer", null, Instant.now().plusSeconds(3600));
          return OAuthHeaderFactory.fromSuppliers(
              () -> token,
              () -> Collections.singletonMap("Authorization", "Bearer control-plane-token"));
        });
  }

  private static Map<String, List<String>> header(String name, String value) {
    return Collections.singletonMap(name, Collections.singletonList(value));
  }
}
