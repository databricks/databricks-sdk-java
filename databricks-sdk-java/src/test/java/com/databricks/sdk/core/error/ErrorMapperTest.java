package com.databricks.sdk.core.error;

import com.databricks.sdk.VariableSource;
import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.platform.*;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

public class ErrorMapperTest {
  static Stream<Arguments> arguments =
      Stream.of(
          Arguments.of(
              InvalidParameterValue.class,
              400,
              "{\"error_code\":\"INVALID_PARAMETER_VALUE\",\"message\":\"Invalid parameter value\"}"),
          Arguments.of(
              BadRequest.class,
              400,
              "{\"error_code\":\"BAD_REQUEST\",\"message\":\"the request is invalid\"}"),
          Arguments.of(
              Unauthenticated.class,
              401,
              "{\"error_code\":\"UNAUTHENTICATED\",\"message\":\"the request does not have valid authentication (AuthN) credentials for the operation\"}"),
          Arguments.of(
              PermissionDenied.class,
              403,
              "{\"error_code\":\"PERMISSION_DENIED\",\"message\":\"the caller does not have permission to execute the specified operation\"}"),
          Arguments.of(
              NotFound.class,
              404,
              "{\"error_code\":\"NOT_FOUND\",\"message\":\"the operation was performed on a resource that does not exist\"}"),
          Arguments.of(
              ResourceConflict.class,
              409,
              "{\"error_code\":\"RESOURCE_CONFLICT\",\"message\":\"maps to all HTTP 409 (Conflict) responses\"}"),
          Arguments.of(
              TooManyRequests.class,
              429,
              "{\"error_code\":\"TOO_MANY_REQUESTS\",\"message\":\"maps to HTTP code: 429 Too Many Requests\"}"),
          Arguments.of(
              Cancelled.class,
              499,
              "{\"error_code\":\"CANCELLED\",\"message\":\"the operation was explicitly canceled by the caller\"}"),
          Arguments.of(
              com.databricks.sdk.core.error.platform.InternalError.class,
              500,
              "{\"error_code\":\"INTERNAL_ERROR\",\"message\":\"some invariants expected by the underlying system have been broken\"}"),
          Arguments.of(
              NotImplemented.class,
              501,
              "{\"error_code\":\"NOT_IMPLEMENTED\",\"message\":\"the operation is not implemented or is not supported/enabled in this service\"}"),
          Arguments.of(
              TemporarilyUnavailable.class,
              503,
              "{\"error_code\":\"TEMPORARILY_UNAVAILABLE\",\"message\":\"the service is currently unavailable\"}"),
          Arguments.of(
              DeadlineExceeded.class,
              504,
              "{\"error_code\":\"DEADLINE_EXCEEDED\",\"message\":\"the deadline expired before the operation could complete\"}"),
          Arguments.of(
              ResourceDoesNotExist.class,
              404,
              "{\"error_code\":\"RESOURCE_DOES_NOT_EXIST\",\"message\":\"operation was performed on a resource that does not exist\"}"),
          Arguments.of(
              Aborted.class,
              409,
              "{\"error_code\":\"ABORTED\",\"message\":\"the operation was aborted, typically due to a concurrency issue such as a sequencer check failure\"}"),
          Arguments.of(
              AlreadyExists.class,
              409,
              "{\"error_code\":\"ALREADY_EXISTS\",\"message\":\"operation was rejected due a conflict with an existing resource\"}"),
          Arguments.of(
              ResourceAlreadyExists.class,
              409,
              "{\"error_code\":\"RESOURCE_ALREADY_EXISTS\",\"message\":\"operation was rejected due a conflict with an existing resource\"}"),
          Arguments.of(
              ResourceExhausted.class,
              429,
              "{\"error_code\":\"RESOURCE_EXHAUSTED\",\"message\":\"operation is rejected due to per-user rate limiting\"}"),
          Arguments.of(
              RequestLimitExceeded.class,
              429,
              "{\"error_code\":\"REQUEST_LIMIT_EXCEEDED\",\"message\":\"cluster request was rejected because it would exceed a resource limit\"}"),
          Arguments.of(
              Unknown.class,
              500,
              "{\"error_code\":\"UNKNOWN\",\"message\":\"this error is used as a fallback if the platform-side mapping is missing some reason\"}"),
          Arguments.of(
              DataLoss.class,
              500,
              "{\"error_code\":\"DATA_LOSS\",\"message\":\"unrecoverable data loss or corruption\"}"));

  @ParameterizedTest
  @VariableSource("arguments")
  void applyMapsErrorsCorrectly(Class<?> expectedClass, int statusCode, String errorBody)
      throws JsonProcessingException {
    ErrorMapper mapper = new ErrorMapper();
    ApiErrorBody apiErrorBody = new ObjectMapper().readValue(errorBody, ApiErrorBody.class);
    Request req = new Request("GET", "https://databricks.com/api/2.0/a/b/c");
    Response resp = new Response(req, statusCode, null, null);
    DatabricksError error = mapper.apply(resp, apiErrorBody);
    assert error.getClass().equals(expectedClass);
  }

  static final Stream<Arguments> overrideCases =
      Stream.of(
          Arguments.of(
              ResourceDoesNotExist.class,
              "GET",
              "https://my.databricks.workspace/api/2.1/clusters/get?cluster_id=123",
              400,
              "{\"error_code\":\"INVALID_PARAMETER_VALUE\",\"message\":\"Cluster 123 does not exist\"}"),
          Arguments.of(
              ResourceDoesNotExist.class,
              "GET",
              "https://my.databricks.workspace/api/2.1/jobs/get?job_id=123",
              400,
              "{\"error_code\":\"INVALID_PARAMETER_VALUE\",\"message\":\"Job 123 does not exist\"}"));

  @ParameterizedTest
  @VariableSource("overrideCases")
  void applyOverridesErrorsCorrectly(
      Class<?> expected, String method, String url, int statusCode, String errorBody)
      throws JsonProcessingException {
    ErrorMapper mapper = new ErrorMapper();
    ApiErrorBody apiErrorBody = new ObjectMapper().readValue(errorBody, ApiErrorBody.class);
    Request req = new Request(method, url);
    Response resp = new Response(req, statusCode, null, null);
    DatabricksError error = mapper.apply(resp, apiErrorBody);
    assert error.getClass().equals(expected);
  }
}
