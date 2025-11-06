// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.gentesting.unittests;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DummyCredentialsProvider;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.utils.SerDeUtils;
import com.databricks.sdk.service.httpcallv2.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HttpPathTest {
  private static final ObjectMapper objectMapper = SerDeUtils.createMapper();
  private static final String HOST = "http://test.databricks.com";

  static class TestCase {
    String name;
    Consumer<HttpCallV2API> invoke;
    String path;
    Supplier<String> expectedBody;

    TestCase(
        String name, Consumer<HttpCallV2API> invoke, String path, Supplier<String> expectedBody) {
      this.name = name;
      this.invoke = invoke;
      this.path = path;
      this.expectedBody = expectedBody;
    }
  }

  static List<TestCase> testCases() throws JsonProcessingException, JsonMappingException {
    return Arrays.asList(
        new TestCase(
            "LegacyHttpPostNoQueryParamsNoBody",
            client -> {
              try {
                client.createResource(
                    new CreateResourceRequest()
                        .setPathParamString("string_val")
                        .setPathParamInt(123L)
                        .setPathParamBool(true));
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/string_val/123/true",
            null),
        new TestCase(
            "LegacyHttpPostWithBody",
            client -> {
              try {
                client.createResource(
                    new CreateResourceRequest()
                        .setBodyField("request_body_content")
                        .setPathParamString("test_string")
                        .setPathParamInt(456L)
                        .setPathParamBool(false));
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/test_string/456/false",
            () -> {
              try {
                return objectMapper.writeValueAsString(
                    new CreateResourceRequest()
                        .setBodyField("request_body_content")
                        .setPathParamString("test_string")
                        .setPathParamInt(456L)
                        .setPathParamBool(false));
              } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
              }
            }),
        new TestCase(
            "UpdateResourceNoQueryParamsNoBody",
            client -> {
              try {
                client.updateResource(
                    new UpdateResourceRequest()
                        .setResource(
                            new Resource()
                                .setAnyField(
                                    new ObjectMapper()
                                        .readValue("{\"key\": \"value\"}", Object.class))
                                .setNestedPathParamBool(true)
                                .setNestedPathParamInt(789L)
                                .setNestedPathParamString("update_string"))
                        .setNestedPathParamString("update_string")
                        .setNestedPathParamInt(789L)
                        .setNestedPathParamBool(true));
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/update_string/789/true",
            () -> {
              try {
                return objectMapper.writeValueAsString(
                    new Resource()
                        .setAnyField(
                            new ObjectMapper().readValue("{\"key\": \"value\"}", Object.class))
                        .setNestedPathParamBool(true)
                        .setNestedPathParamInt(789L)
                        .setNestedPathParamString("update_string"));
              } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
              }
            }),
        new TestCase(
            "UpdateResourceWithBody",
            client -> {
              try {
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
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/update_string/789/true",
            () -> {
              try {
                return objectMapper.writeValueAsString(
                    new Resource()
                        .setBodyField("request_body_content")
                        .setNestedPathParamBool(true)
                        .setNestedPathParamInt(789L)
                        .setNestedPathParamString("update_string"));
              } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
              }
            }),
        new TestCase(
            "UpdateResourceWithSimpleQueryParams",
            client -> {
              try {
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
                        .setFieldMask(
                            FieldMask.newBuilder()
                                .addAllPaths(Arrays.asList("field.mask.value".split(", ")))
                                .build()));
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/update_string/789/true?field_mask=field.mask.value&query_param_bool=true&query_param_int=999&query_param_string=query_string_val",
            () -> {
              try {
                return objectMapper.writeValueAsString(
                    new Resource()
                        .setNestedPathParamBool(true)
                        .setNestedPathParamInt(789L)
                        .setNestedPathParamString("update_string"));
              } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
              }
            }),
        new TestCase(
            "UpdateResourceWithOneNestedQueryParam",
            client -> {
              try {
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
                                .setNestedOptionalQueryParam("nested_optional")));
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/update_string/789/true?optional_complex_query_param.nested_optional_query_param=nested_optional",
            () -> {
              try {
                return objectMapper.writeValueAsString(
                    new Resource()
                        .setNestedPathParamBool(true)
                        .setNestedPathParamInt(789L)
                        .setNestedPathParamString("update_string"));
              } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
              }
            }),
        new TestCase(
            "UpdateResourceWithRepeatedQueryParam",
            client -> {
              try {
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
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/update_string/789/true?repeated_query_param=item1&repeated_query_param=item2&repeated_query_param=item3",
            () -> {
              try {
                return objectMapper.writeValueAsString(
                    new Resource()
                        .setNestedPathParamBool(true)
                        .setNestedPathParamInt(789L)
                        .setNestedPathParamString("update_string"));
              } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
              }
            }),
        new TestCase(
            "UpdateResourceWithRepeatedNestedQueryParam",
            client -> {
              try {
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
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/update_string/789/true?optional_complex_query_param.nested_repeated_query_param=item1&optional_complex_query_param.nested_repeated_query_param=item2&optional_complex_query_param.nested_repeated_query_param=item3",
            () -> {
              try {
                return objectMapper.writeValueAsString(
                    new Resource()
                        .setNestedPathParamBool(true)
                        .setNestedPathParamInt(789L)
                        .setNestedPathParamString("update_string"));
              } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
              }
            }),
        new TestCase(
            "UpdateResourceWithDoubleRepeatedNestedQueryParam",
            client -> {
              try {
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
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/update_string/789/true?repeated_complex_query_param=ComplexQueryParam%5BnestedRepeatedQueryParam%3D%5Bitem1%2C+item2%2C+item3%5D%5D&repeated_complex_query_param=ComplexQueryParam%5BnestedRepeatedQueryParam%3D%5Bitem4%2C+item5%2C+item6%5D%5D",
            () -> {
              try {
                return objectMapper.writeValueAsString(
                    new Resource()
                        .setNestedPathParamBool(true)
                        .setNestedPathParamInt(789L)
                        .setNestedPathParamString("update_string"));
              } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
              }
            }),
        new TestCase(
            "GetResourceNoQueryParams",
            client -> {
              try {
                client.getResource(
                    new GetResourceRequest()
                        .setPathParamString("get_string")
                        .setPathParamInt(123L)
                        .setPathParamBool(true));
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/get_string/123/true",
            null),
        new TestCase(
            "GetResourceWithSimpleQueryParams",
            client -> {
              try {
                client.getResource(
                    new GetResourceRequest()
                        .setPathParamString("get_string")
                        .setPathParamInt(456L)
                        .setPathParamBool(false)
                        .setQueryParamString("query_string_val")
                        .setQueryParamInt(999L)
                        .setQueryParamBool(true)
                        .setFieldMask(
                            FieldMask.newBuilder()
                                .addAllPaths(Arrays.asList("field.mask.value".split(", ")))
                                .build()));
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/get_string/456/false?field_mask=field.mask.value&query_param_bool=true&query_param_int=999&query_param_string=query_string_val",
            null),
        new TestCase(
            "GetResourceWithOneNestedQueryParam",
            client -> {
              try {
                client.getResource(
                    new GetResourceRequest()
                        .setPathParamString("get_string")
                        .setPathParamInt(789L)
                        .setPathParamBool(true)
                        .setOptionalComplexQueryParam(
                            new ComplexQueryParam()
                                .setNestedOptionalQueryParam("nested_optional")));
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/get_string/789/true?optional_complex_query_param.nested_optional_query_param=nested_optional",
            null),
        new TestCase(
            "GetResourceWithRepeatedQueryParam",
            client -> {
              try {
                client.getResource(
                    new GetResourceRequest()
                        .setPathParamString("get_string")
                        .setPathParamInt(101L)
                        .setPathParamBool(false)
                        .setRepeatedQueryParam(Arrays.asList("item1", "item2", "item3")));
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/get_string/101/false?repeated_query_param=item1&repeated_query_param=item2&repeated_query_param=item3",
            null),
        new TestCase(
            "GetResourceWithRepeatedNestedQueryParam",
            client -> {
              try {
                client.getResource(
                    new GetResourceRequest()
                        .setPathParamString("get_string")
                        .setPathParamInt(202L)
                        .setPathParamBool(true)
                        .setOptionalComplexQueryParam(
                            new ComplexQueryParam()
                                .setNestedRepeatedQueryParam(
                                    Arrays.asList("item1", "item2", "item3"))));
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/get_string/202/true?optional_complex_query_param.nested_repeated_query_param=item1&optional_complex_query_param.nested_repeated_query_param=item2&optional_complex_query_param.nested_repeated_query_param=item3",
            null),
        new TestCase(
            "GetResourceWithDoubleRepeatedNestedQueryParam",
            client -> {
              try {
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
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            "/api/2.0/http-call/get_string/303/false?repeated_complex_query_param=ComplexQueryParam%5BnestedRepeatedQueryParam%3D%5Bitem1%2C+item2%2C+item3%5D%5D&repeated_complex_query_param=ComplexQueryParam%5BnestedRepeatedQueryParam%3D%5Bitem4%2C+item5%2C+item6%5D%5D",
            null));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("testCases")
  void testHttpPath(TestCase testCase) throws Exception {
    HttpClient mock = mock(HttpClient.class);
    HttpCallV2API client = prepareClient(mock, testCase);

    testCase.invoke.accept(client);
  }

  private HttpCallV2API prepareClient(HttpClient mock, TestCase testCase) throws IOException {

    // Configure mock to return a successful dummy response for the test case.
    Response successResponse = new Response("{}", 200, "OK", new URL(HOST));

    // Validate the request is the expected request.
    when(mock.execute(any()))
        .thenAnswer(
            invocation -> {
              Request request = invocation.getArgument(0);
              String expectedUrl = HOST + testCase.path;
              if (!request.getUri().toString().equals(expectedUrl)) {
                throw new AssertionError(
                    "Expected request URL: "
                        + expectedUrl
                        + " but got: "
                        + request.getUri().toString());
              }
              if (testCase.expectedBody != null) {
                if (!request.getBodyString().equals(testCase.expectedBody.get())) {
                  throw new AssertionError(
                      "Expected request body: "
                          + testCase.expectedBody.get()
                          + " but got: "
                          + request.getBodyString());
                }
              }
              return successResponse;
            });

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
}
