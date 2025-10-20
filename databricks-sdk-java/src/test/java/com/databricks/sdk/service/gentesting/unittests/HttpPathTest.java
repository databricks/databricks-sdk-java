// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.gentesting.unittests;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DummyCredentialsProvider;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.service.httpcallv2.*;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.function.Consumer;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HttpPathTest {
  private static final String HOST = "http://test.databricks.com";

  static class TestCase {
    String name;
    Consumer<HttpCallV2API> invoke;
    String path;

    TestCase(String name, Consumer<HttpCallV2API> invoke, String path) {
      this.name = name;
      this.invoke = invoke;
      this.path = path;
    }
  }

  static List<TestCase> testCases() {
    return Arrays.asList(
        new TestCase(
            "LegacyHttpPostNoQueryParamsNoBody",
            client -> {
              client.createResource(
                  new CreateResourceRequest()
                      .setPathParamString("string_val")
                      .setPathParamInt(123L)
                      .setPathParamBool(true));
            },
            "/api/2.0/http-call/string_val/123/true"),
        new TestCase(
            "LegacyHttpPostWithBody",
            client -> {
              client.createResource(
                  new CreateResourceRequest()
                      .setBodyField("request_body_content")
                      .setPathParamString("test_string")
                      .setPathParamInt(456L)
                      .setPathParamBool(false));
            },
            "/api/2.0/http-call/test_string/456/false"),
        new TestCase(
            "UpdateResourceWithBody",
            client -> {
              client.updateResource(
                  new UpdateResourceRequest()
                      .setResource(
                          new Resource()
                              .setBodyField("request_body_content")
                              .setNestedPathParamBool(true)
                              .setNestedPathParamInt(789L)
                              .setNestedPathParamString("update_string"))
                      .setNestedPathParamString("update_string")
                      .setNestedPathParamInt(789L)
                      .setNestedPathParamBool(true));
            },
            "/api/2.0/http-call/update_string/789/true"),
        new TestCase(
            "UpdateResourceWithSimpleQueryParams",
            client -> {
              client.updateResource(
                  new UpdateResourceRequest()
                      .setResource(
                          new Resource()
                              .setNestedPathParamBool(true)
                              .setNestedPathParamInt(789L)
                              .setNestedPathParamString("update_string"))
                      .setNestedPathParamString("update_string")
                      .setNestedPathParamInt(789L)
                      .setNestedPathParamBool(true)
                      .setQueryParamString("query_string_val")
                      .setQueryParamInt(999L)
                      .setQueryParamBool(true)
                      .setFieldMask("field.mask.value"));
            },
            "/api/2.0/http-call/update_string/789/true?field_mask=field.mask.value&query_param_bool=true&query_param_int=999&query_param_string=query_string_val"),
        new TestCase(
            "UpdateResourceWithOneNestedQueryParam",
            client -> {
              client.updateResource(
                  new UpdateResourceRequest()
                      .setResource(
                          new Resource()
                              .setNestedPathParamBool(true)
                              .setNestedPathParamInt(789L)
                              .setNestedPathParamString("update_string"))
                      .setNestedPathParamString("update_string")
                      .setNestedPathParamInt(789L)
                      .setNestedPathParamBool(true)
                      .setOptionalComplexQueryParam(
                          new ComplexQueryParam().setNestedOptionalQueryParam("nested_optional")));
            },
            "/api/2.0/http-call/update_string/789/true?optional_complex_query_param.nested_optional_query_param=nested_optional"),
        new TestCase(
            "UpdateResourceWithRepeatedQueryParam",
            client -> {
              client.updateResource(
                  new UpdateResourceRequest()
                      .setResource(
                          new Resource()
                              .setNestedPathParamBool(true)
                              .setNestedPathParamInt(789L)
                              .setNestedPathParamString("update_string"))
                      .setNestedPathParamString("update_string")
                      .setNestedPathParamInt(789L)
                      .setNestedPathParamBool(true)
                      .setRepeatedQueryParam(Arrays.asList("item1", "item2", "item3")));
            },
            "/api/2.0/http-call/update_string/789/true?repeated_query_param=item1&repeated_query_param=item2&repeated_query_param=item3"),
        new TestCase(
            "UpdateResourceWithRepeatedNestedQueryParam",
            client -> {
              client.updateResource(
                  new UpdateResourceRequest()
                      .setResource(
                          new Resource()
                              .setNestedPathParamBool(true)
                              .setNestedPathParamInt(789L)
                              .setNestedPathParamString("update_string"))
                      .setNestedPathParamString("update_string")
                      .setNestedPathParamInt(789L)
                      .setNestedPathParamBool(true)
                      .setOptionalComplexQueryParam(
                          new ComplexQueryParam()
                              .setNestedRepeatedQueryParam(
                                  Arrays.asList("item1", "item2", "item3"))));
            },
            "/api/2.0/http-call/update_string/789/true?optional_complex_query_param.nested_repeated_query_param=item1&optional_complex_query_param.nested_repeated_query_param=item2&optional_complex_query_param.nested_repeated_query_param=item3"),
        new TestCase(
            "UpdateResourceWithDoubleRepeatedNestedQueryParam",
            client -> {
              client.updateResource(
                  new UpdateResourceRequest()
                      .setResource(
                          new Resource()
                              .setNestedPathParamBool(true)
                              .setNestedPathParamInt(789L)
                              .setNestedPathParamString("update_string"))
                      .setNestedPathParamString("update_string")
                      .setNestedPathParamInt(789L)
                      .setNestedPathParamBool(true)
                      .setRepeatedComplexQueryParam(
                          Arrays.asList(
                              new ComplexQueryParam()
                                  .setNestedRepeatedQueryParam(
                                      Arrays.asList("item1", "item2", "item3")),
                              new ComplexQueryParam()
                                  .setNestedRepeatedQueryParam(
                                      Arrays.asList("item4", "item5", "item6")))));
            },
            "/api/2.0/http-call/update_string/789/true?repeated_complex_query_param=ComplexQueryParam[nestedRepeatedQueryParam=[item1,+item2,+item3]]&repeated_complex_query_param=ComplexQueryParam[nestedRepeatedQueryParam=[item4,+item5,+item6]]"),
        new TestCase(
            "GetResourceNoQueryParams",
            client -> {
              client.getResource(
                  new GetResourceRequest()
                      .setPathParamString("get_string")
                      .setPathParamInt(123L)
                      .setPathParamBool(true));
            },
            "/api/2.0/http-call/get_string/123/true"),
        new TestCase(
            "GetResourceWithSimpleQueryParams",
            client -> {
              client.getResource(
                  new GetResourceRequest()
                      .setPathParamString("get_string")
                      .setPathParamInt(456L)
                      .setPathParamBool(false)
                      .setQueryParamString("query_string_val")
                      .setQueryParamInt(999L)
                      .setQueryParamBool(true)
                      .setFieldMask("field.mask.value"));
            },
            "/api/2.0/http-call/get_string/456/false?field_mask=field.mask.value&query_param_bool=true&query_param_int=999&query_param_string=query_string_val"),
        new TestCase(
            "GetResourceWithOneNestedQueryParam",
            client -> {
              client.getResource(
                  new GetResourceRequest()
                      .setPathParamString("get_string")
                      .setPathParamInt(789L)
                      .setPathParamBool(true)
                      .setOptionalComplexQueryParam(
                          new ComplexQueryParam().setNestedOptionalQueryParam("nested_optional")));
            },
            "/api/2.0/http-call/get_string/789/true?optional_complex_query_param.nested_optional_query_param=nested_optional"),
        new TestCase(
            "GetResourceWithRepeatedQueryParam",
            client -> {
              client.getResource(
                  new GetResourceRequest()
                      .setPathParamString("get_string")
                      .setPathParamInt(101L)
                      .setPathParamBool(false)
                      .setRepeatedQueryParam(Arrays.asList("item1", "item2", "item3")));
            },
            "/api/2.0/http-call/get_string/101/false?repeated_query_param=item1&repeated_query_param=item2&repeated_query_param=item3"),
        new TestCase(
            "GetResourceWithRepeatedNestedQueryParam",
            client -> {
              client.getResource(
                  new GetResourceRequest()
                      .setPathParamString("get_string")
                      .setPathParamInt(202L)
                      .setPathParamBool(true)
                      .setOptionalComplexQueryParam(
                          new ComplexQueryParam()
                              .setNestedRepeatedQueryParam(
                                  Arrays.asList("item1", "item2", "item3"))));
            },
            "/api/2.0/http-call/get_string/202/true?optional_complex_query_param.nested_repeated_query_param=item1&optional_complex_query_param.nested_repeated_query_param=item2&optional_complex_query_param.nested_repeated_query_param=item3"),
        new TestCase(
            "GetResourceWithDoubleRepeatedNestedQueryParam",
            client -> {
              client.getResource(
                  new GetResourceRequest()
                      .setPathParamString("get_string")
                      .setPathParamInt(303L)
                      .setPathParamBool(false)
                      .setRepeatedComplexQueryParam(
                          Arrays.asList(
                              new ComplexQueryParam()
                                  .setNestedRepeatedQueryParam(
                                      Arrays.asList("item1", "item2", "item3")),
                              new ComplexQueryParam()
                                  .setNestedRepeatedQueryParam(
                                      Arrays.asList("item4", "item5", "item6")))));
            },
            "/api/2.0/http-call/get_string/303/false?repeated_complex_query_param=ComplexQueryParam[nestedRepeatedQueryParam=[item1,+item2,+item3]]&repeated_complex_query_param=ComplexQueryParam[nestedRepeatedQueryParam=[item4,+item5,+item6]]"));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("testCases")
  void testHttpPath(TestCase testCase) throws Exception {
    HttpClient mock = mock(HttpClient.class);
    HttpCallV2API client = prepareClient(mock);

    testCase.invoke.accept(client);

    verifyRequest(mock, testCase.path);
  }

  private HttpCallV2API prepareClient(HttpClient mock) throws IOException {

    // Configure mock to return a successful dummy response for the test case.
    Response successResponse = new Response("{}", 200, "OK", new URL(HOST));
    when(mock.execute(any())).thenReturn(successResponse);

    // Create DatabricksConfig with the mock HttpClient.
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(HOST)
            .setCredentialsProvider(new DummyCredentialsProvider())
            .setHttpClient(mock);

    // Create ApiClient with the config.
    ApiClient apiClient = new ApiClient(config);

    // Create HttpCallV2API with the ApiClient.
    return new HttpCallV2API(apiClient);
  }

  private void verifyRequest(HttpClient mock, String path) throws IOException {
    String expectedUrl = HOST + path;
    verify(mock).execute(argThat(request -> request.getUri().toString().equals(expectedUrl)));
  }
}
