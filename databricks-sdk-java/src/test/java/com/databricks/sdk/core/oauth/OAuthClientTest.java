package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OAuthClientTest {

  @AutoValue
  public abstract static class UrlEncodeTestCase {
    public abstract String description();

    public abstract String baseUrl();

    public abstract Map<String, String> params();

    public abstract String expectedResult();

    public static UrlEncodeTestCase create(
        String description, String baseUrl, Map<String, String> params, String expectedResult) {
      return new AutoValue_OAuthClientTest_UrlEncodeTestCase(
          description, baseUrl, params, expectedResult);
    }
  }

  private static Stream<UrlEncodeTestCase> urlEncodeTestCases() {
    return Stream.of(
        UrlEncodeTestCase.create(
            "Basic parameters",
            "https://example.com/auth",
            createParams("client_id", "test-client", "response_type", "code"),
            "https://example.com/auth?client_id=test-client&response_type=code"),
        UrlEncodeTestCase.create(
            "Empty parameters",
            "https://example.com/auth",
            createParams(),
            "https://example.com/auth"),
        UrlEncodeTestCase.create(
            "Special characters in parameters",
            "https://example.com/auth",
            createParams(
                "redirect_uri",
                "http://localhost:8080/callback?extra=value",
                "scope",
                "read write",
                "state",
                "test&value=123"),
            "https://example.com/auth?redirect_uri=http%3A%2F%2Flocalhost%3A8080%2Fcallback%3Fextra%3Dvalue&scope=read+write&state=test%26value%3D123"),
        UrlEncodeTestCase.create(
            "URL with existing query parameters",
            "https://example.com/auth?existing=param",
            createParams("client_id", "test-client"),
            "https://example.com/auth?existing=param&client_id=test-client"),
        UrlEncodeTestCase.create(
            "Complex OAuth parameters",
            "https://accounts.cloud.databricks.com/oidc/v1/authorize",
            createParams(
                "client_id",
                "databricks-client",
                "code_challenge",
                "E9Melhoa2OwvFrEMTJguCHaoeK1t8URWbuGJSstw-cM",
                "code_challenge_method",
                "S256",
                "redirect_uri",
                "https://app.example.com/callback?session=abc123",
                "response_type",
                "code",
                "scope",
                "sql clusters repos",
                "state",
                "random-state-123"),
            "https://accounts.cloud.databricks.com/oidc/v1/authorize?client_id=databricks-client&code_challenge=E9Melhoa2OwvFrEMTJguCHaoeK1t8URWbuGJSstw-cM&code_challenge_method=S256&redirect_uri=https%3A%2F%2Fapp.example.com%2Fcallback%3Fsession%3Dabc123&response_type=code&scope=sql+clusters+repos&state=random-state-123"),
        UrlEncodeTestCase.create(
            "Parameter encoding with spaces",
            "https://example.com",
            createParams("scope", "read write admin"),
            "https://example.com?scope=read+write+admin"),
        UrlEncodeTestCase.create(
            "Parameter encoding with special characters",
            "https://example.com",
            createParams("state", "value&with=special?chars#fragment"),
            "https://example.com?state=value%26with%3Dspecial%3Fchars%23fragment"),
        UrlEncodeTestCase.create(
            "Parameter encoding with URL as value",
            "https://example.com",
            createParams("redirect_uri", "https://example.com/callback?param=value"),
            "https://example.com?redirect_uri=https%3A%2F%2Fexample.com%2Fcallback%3Fparam%3Dvalue"),
        UrlEncodeTestCase.create(
            "Parameter encoding with plus signs",
            "https://example.com",
            createParams("scope", "scope+with+plus"),
            "https://example.com?scope=scope%2Bwith%2Bplus"),
        UrlEncodeTestCase.create(
            "Parameter encoding with empty string",
            "https://example.com",
            createParams("empty", ""),
            "https://example.com?empty="),
        UrlEncodeTestCase.create(
            "Parameter encoding with Unicode characters",
            "https://example.com",
            createParams("unicode", "测试数据"),
            "https://example.com?unicode=%E6%B5%8B%E8%AF%95%E6%95%B0%E6%8D%AE"),
        UrlEncodeTestCase.create(
            "Integration OAuth flow with complex parameters",
            "https://accounts.cloud.databricks.com/oidc/v1/authorize",
            createParams(
                "redirect_uri",
                "https://app.example.com/oauth/callback?session=abc123&return=/dashboard",
                "scope",
                "sql clusters repos notebooks",
                "state",
                "test&state=value"),
            "https://accounts.cloud.databricks.com/oidc/v1/authorize?redirect_uri=https%3A%2F%2Fapp.example.com%2Foauth%2Fcallback%3Fsession%3Dabc123%26return%3D%2Fdashboard&scope=sql+clusters+repos+notebooks&state=test%26state%3Dvalue"));
  }

  private static Map<String, String> createParams(String... keyValuePairs) {
    Map<String, String> params = new HashMap<>();
    for (int i = 0; i < keyValuePairs.length; i += 2) {
      params.put(keyValuePairs[i], keyValuePairs[i + 1]);
    }
    return params;
  }

  @ParameterizedTest
  @MethodSource("urlEncodeTestCases")
  public void testUrlEncode(UrlEncodeTestCase testCase) {
    String result = OAuthClient.urlEncode(testCase.baseUrl(), testCase.params());
    assertEquals(testCase.expectedResult(), result, testCase.description());
  }

  @Test
  public void testDeterministicParameterOrdering() {
    // Test that parameters are always in the same order regardless of insertion order
    Map<String, String> params1 = new HashMap<>();
    params1.put("z_param", "value1");
    params1.put("a_param", "value2");
    params1.put("m_param", "value3");

    Map<String, String> params2 = new HashMap<>();
    params2.put("m_param", "value3");
    params2.put("z_param", "value1");
    params2.put("a_param", "value2");

    String result1 = OAuthClient.urlEncode("https://example.com", params1);
    String result2 = OAuthClient.urlEncode("https://example.com", params2);

    // Both should produce identical results (sorted by key)
    assertEquals(result1, result2);
    assertEquals("https://example.com?a_param=value2&m_param=value3&z_param=value1", result1);
  }
}
