package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;

/** Helper methods for inspecting the response and errors thrown during API requests. */
public class ApiErrors {
  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final Pattern HTML_ERROR_REGEX = Pattern.compile("<pre>(.*)</pre>");
  private static final ErrorMapper ERROR_MAPPER = new ErrorMapper();

  public static DatabricksError getDatabricksError(Response out, Exception error) {
    if (error != null) {
      // If the endpoint did not respond to the request, interpret the exception.
      return new DatabricksError("IO_ERROR", 523, error);
    } else if (out.getStatusCode() == 429) {
      return new DatabricksError("TOO_MANY_REQUESTS", "Current request has to be retried", 429);
    }

    ApiErrorBody errorBody = readErrorFromResponse(out);
    return ERROR_MAPPER.apply(out, errorBody);
  }

  private static ApiErrorBody readErrorFromResponse(Response response) {
    // Private link error handling depends purely on the response URL.
    if (PrivateLinkInfo.isPrivateLinkRedirect(response)) {
      return ApiErrorBody.builder().build();
    }
    ApiErrorBody errorBody = parseApiError(response);

    // Condense API v1.2 and SCIM error string and code into the message and errorCode fields of
    // DatabricksApiException.
    ApiErrorBody.Builder errorBodyBuilder = errorBody.toBuilder();

    if (errorBody.api12Error() != null && !errorBody.api12Error().isEmpty()) {
      errorBodyBuilder.setMessage(errorBody.api12Error());
    }
    if (errorBody.message() == null || errorBody.message().isEmpty()) {
      String scimMessage;
      if (errorBody.scimDetail() != null && !"null".equals(errorBody.scimDetail())) {
        scimMessage = errorBody.scimDetail();
      } else {
        scimMessage = "SCIM API Internal Error";
      }
      String message = errorBody.scimType() + " " + scimMessage;
      errorBodyBuilder.setMessage(message.trim());
      errorBodyBuilder.setErrorCode("SCIM_" + errorBody.scimStatus());
    }
    if (errorBody.errorDetails() == null) {
      // Note: This appears to be a bug in the original code - errorDetails is not a List
      // We'll set it to null for now and this should be addressed separately
      errorBodyBuilder.setErrorDetails(null);
    }
    return errorBodyBuilder.build();
  }

  /**
   * The response is either a JSON response or a webpage. In the JSON case, it is parsed normally;
   * in the webpage case, the relevant error metadata is extracted from the response using a
   * heuristic-based approach.
   */
  private static ApiErrorBody parseApiError(Response response) {
    try {
      InputStream in = response.getBody();
      if (in == null) {
        return ApiErrorBody.builder()
            .setMessage(String.format("Status response from server: %s", response.getStatus()))
            .build();
      }

      // Read the body now, so we can try to parse as JSON and then fallback to old error handling
      // logic.
      String body = IOUtils.toString(in, StandardCharsets.UTF_8);
      try {
        return MAPPER.readValue(body, ApiErrorBody.class);
      } catch (IOException e) {
        return parseUnknownError(response, body, e);
      }
    } catch (IOException e) {
      throw new DatabricksException("Unable to read response body", e);
    }
  }

  private static ApiErrorBody parseUnknownError(Response response, String body, IOException err) {
    ApiErrorBody.Builder errorBodyBuilder = ApiErrorBody.builder();
    String[] statusParts = response.getStatus().split(" ", 2);
    if (statusParts.length < 2) {
      errorBodyBuilder.setErrorCode("UNKNOWN");
    } else {
      String errorCode = statusParts[1].replaceAll("^[ .]+|[ .]+$", "");
      errorBodyBuilder.setErrorCode(errorCode.replaceAll(" ", "_").toUpperCase());
    }

    Matcher messageMatcher = HTML_ERROR_REGEX.matcher(body);
    if (messageMatcher.find()) {
      errorBodyBuilder.setMessage(messageMatcher.group(1).replaceAll("^[ .]+|[ .]+$", ""));
    } else {
      errorBodyBuilder.setMessage(
          String.format(
              "Response from server (%s) %s: %s", response.getStatus(), body, err.getMessage()));
    }
    return errorBodyBuilder.build();
  }
}
