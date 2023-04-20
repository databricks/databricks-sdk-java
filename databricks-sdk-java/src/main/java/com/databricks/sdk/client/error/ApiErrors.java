package com.databricks.sdk.client.error;

import com.databricks.sdk.client.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Helper methods for inspecting the response and errors thrown during API requests. */
public class ApiErrors {
  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final Pattern HTML_ERROR_REGEX = Pattern.compile("<pre>(.*)</pre>");

  public static CheckForRetryResult checkForRetry(Response out, Exception error) {
    // If the endpoint did not respond to the request, interpret the exception.
    DatabricksApiException apiError = null;
    if (error != null) {
      apiError = new DatabricksApiException("IO_ERROR", 523, error);
    } else if (out.getStatusCode() == 429) {
      apiError =
          new DatabricksApiException("TOO_MANY_REQUESTS", "Current request has to be retried", 429);
    } else if (out.getStatusCode() >= 400) {
      apiError = parseErrorFromResponse(out);
    }

    if (apiError == null) {
      // The request succeeded; do not retry.
      return new CheckForRetryResult(false);
    }

    return new CheckForRetryResult(apiError.isRetriable(), apiError);
  }

  private static DatabricksApiException parseErrorFromResponse(Response response) {
    ApiErrorBody errorBody;
    // The response is either a JSON response or a webpage. In the JSON case, it is parsed normally;
    // in the webpage
    // case, the relevant error metadata is extracted from the response using a heuristic-based
    // approach.
    try {
      errorBody = MAPPER.readValue(response.getBody(), ApiErrorBody.class);
    } catch (IOException e) {
      errorBody = parseUnknownError(response, e);
    }

    // Condense API v1.2 and SCIM error string and code into the message and errorCode fields of
    // DatabricksApiException.
    if (errorBody.getApi12Error() != null && !errorBody.getApi12Error().isEmpty()) {
      errorBody.setMessage(errorBody.getApi12Error());
    }
    if (errorBody.getMessage() == null || errorBody.getMessage().isEmpty()) {
      if (errorBody.getScimDetail() != null && !errorBody.getScimDetail().equals("null")) {
        errorBody.setMessage(errorBody.getScimDetail());
      } else {
        errorBody.setMessage("SCIM API Internal Error");
      }
      String message = errorBody.getScimType() + " " + errorBody.getMessage();
      errorBody.setMessage(message.trim());
      errorBody.setErrorCode("SCIM_" + errorBody.getScimStatus());
    }
    return new DatabricksApiException(
        errorBody.getErrorCode(), errorBody.getMessage(), response.getStatusCode());
  }

  private static ApiErrorBody parseUnknownError(Response response, IOException err) {
    ApiErrorBody errorBody = new ApiErrorBody();
    String[] statusParts = response.getStatus().split(" ", 2);
    if (statusParts.length < 2) {
      errorBody.setErrorCode("UNKNOWN");
    } else {
      String errorCode = statusParts[1].replaceAll("^[ .]+|[ .]+$", "");
      errorBody.setErrorCode(errorCode.replaceAll(" ", "_").toUpperCase());
    }

    Matcher messageMatcher = HTML_ERROR_REGEX.matcher(response.getBody());
    if (messageMatcher.find()) {
      errorBody.setMessage(messageMatcher.group(1).replaceAll("^[ .]+|[ .]+$", ""));
    } else {
      errorBody.setMessage(
          String.format(
              "Response from server (%s) %s: %s",
              response.getStatus(), response.getBody(), err.getMessage()));
    }
    return errorBody;
  }
}
