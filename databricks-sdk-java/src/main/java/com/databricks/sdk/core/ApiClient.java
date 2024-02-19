package com.databricks.sdk.core;

import com.databricks.sdk.core.error.ApiErrors;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.utils.SystemTimer;
import com.databricks.sdk.core.utils.Timer;
import com.databricks.sdk.support.Header;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simplified REST API client with retries, JSON POJO SerDe through Jackson and exception POJO
 * guessing
 */
public class ApiClient {
  private static final Logger LOG = LoggerFactory.getLogger(ApiClient.class);

  private final int maxAttempts;

  private final ObjectMapper mapper;

  private final DatabricksConfig config;

  private final Random random;

  private final HttpClient httpClient;
  private final BodyLogger bodyLogger;
  private final Timer timer;

  public ApiClient() {
    this(ConfigLoader.getDefault());
  }

  public String configuredAccountID() {
    return config.getAccountId();
  }

  public ApiClient(DatabricksConfig config) {
    this(config, new SystemTimer());
  }

  public ApiClient(DatabricksConfig config, Timer timer) {
    this.config = config;
    config.resolve();

    Integer rateLimit = config.getRateLimit();
    if (rateLimit == null) {
      rateLimit = 15;
    }

    Integer debugTruncateBytes = config.getDebugTruncateBytes();
    if (debugTruncateBytes == null) {
      debugTruncateBytes = 96;
    }

    maxAttempts = 3;
    mapper = makeObjectMapper();
    random = new Random();
    httpClient = config.getHttpClient();
    bodyLogger = new BodyLogger(mapper, 1024, debugTruncateBytes);
    this.timer = timer;
  }

  private ObjectMapper makeObjectMapper() {
    ObjectMapper mapper = new ObjectMapper();
    mapper
        .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
        .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
        .configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true)
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
        .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)
        .setSerializationInclusion(JsonInclude.Include.NON_NULL);
    return mapper;
  }

  private static <I> void setQuery(Request in, I entity) {
    if (entity == null) {
      return;
    }
    for (GrpcTranscodingQueryParamsSerializer.QueryParamPair e :
        GrpcTranscodingQueryParamsSerializer.serialize(entity)) {
      in.withQueryParam(e.getKey(), e.getValue());
    }
  }

  private static <I> void setHeaders(Request in, Map<String, String> headers) {
    if (headers == null) {
      return;
    }
    for (Map.Entry<String, String> e : headers.entrySet()) {
      in.withHeader(e.getKey(), e.getValue());
    }
  }

  public <I, O> Collection<O> getCollection(
      String path, I in, Class<O> element, Map<String, String> headers) {
    return withJavaType(
        path,
        in,
        mapper.getTypeFactory().constructCollectionType(Collection.class, element),
        headers);
  }

  public <I> Map<String, String> getStringMap(String path, I in, Map<String, String> headers) {
    return withJavaType(
        path,
        in,
        mapper.getTypeFactory().constructMapType(Map.class, String.class, String.class),
        headers);
  }

  protected <I, O> O withJavaType(
      String path, I in, JavaType javaType, Map<String, String> headers) {
    try {
      Request request = prepareRequest("GET", path, in, headers);
      Response response = getResponse(request);
      return deserialize(response.getBody(), javaType);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  public <O> O HEAD(String path, Class<O> target, Map<String, String> headers) {
    return HEAD(path, null, target, headers);
  }

  public <I, O> O HEAD(String path, I in, Class<O> target, Map<String, String> headers) {
    try {
      return execute(prepareRequest("HEAD", path, in, headers), target);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  public <O> O GET(String path, Class<O> target, Map<String, String> headers) {
    return GET(path, null, target, headers);
  }

  public <I, O> O GET(String path, I in, Class<O> target, Map<String, String> headers) {
    try {
      return execute(prepareRequest("GET", path, in, headers), target);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  public <I, O> O POST(String path, I in, Class<O> target, Map<String, String> headers) {
    try {
      return execute(prepareRequest("POST", path, in, headers), target);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  public <I, O> O PUT(String path, I in, Class<O> target, Map<String, String> headers) {
    try {
      return execute(prepareRequest("PUT", path, in, headers), target);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  public <I, O> O PATCH(String path, I in, Class<O> target, Map<String, String> headers) {
    try {
      return execute(prepareRequest("PATCH", path, in, headers), target);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  public <I, O> O DELETE(String path, I in, Class<O> target, Map<String, String> headers) {
    try {
      return execute(prepareRequest("DELETE", path, in, headers), target);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  private boolean hasBody(String method) {
    return !method.equals("GET") && !method.equals("DELETE") && !method.equals("HEAD");
  }

  private <I> Request prepareBaseRequest(String method, String path, I in)
      throws JsonProcessingException {
    if (in == null || !hasBody(method)) {
      return new Request(method, path);
    } else if (InputStream.class.isAssignableFrom(in.getClass())) {
      InputStream body = (InputStream) in;
      return new Request(method, path, body);
    } else {
      String body = serialize(in);
      return new Request(method, path, body);
    }
  }

  private <I> Request prepareRequest(String method, String path, I in, Map<String, String> headers)
      throws JsonProcessingException {
    Request req = prepareBaseRequest(method, path, in);
    setQuery(req, in);
    setHeaders(req, headers);
    return req;
  }

  /**
   * Executes HTTP request with retries and converts it to proper POJO
   *
   * @param in Commons HTTP request
   * @param target Expected pojo type
   * @return POJO of requested type
   */
  private <T> T execute(Request in, Class<T> target) throws IOException {
    Response out = getResponse(in);
    if (target == Void.class) {
      return null;
    }
    return deserialize(out, target);
  }

  private Response getResponse(Request in) {
    in.withUrl(config.getHost() + in.getUrl());
    return executeInner(in);
  }

  private Response executeInner(Request in) {
    int attemptNumber = 0;
    while (true) {
      attemptNumber++;

      IOException err = null;
      Response out = null;

      // Authenticate the request. Failures should not be retried.
      in.withHeaders(config.authenticate());

      // Set User-Agent with auth type info, which is available only
      // after the first invocation to config.authenticate()
      String userAgent = String.format("%s auth/%s", UserAgent.asString(), config.getAuthType());
      in.withHeader("User-Agent", userAgent);

      // Make the request, catching any exceptions, as we may want to retry.
      try {
        out = httpClient.execute(in);
        if (LOG.isDebugEnabled()) {
          LOG.debug(makeLogRecord(in, out));
        }
        if (out.getStatusCode() < 400) {
          return out;
        }
      } catch (IOException e) {
        err = e;
        LOG.debug("Request {} failed", in, e);
      }

      // The request is not retried under three conditions:
      // 1. The request succeeded (err == null, out != null). In this case, the response is
      // returned.
      // 2. The request failed with a non-retriable error (err != null, out == null).
      // 3. The request failed with a retriable error, but the number of attempts exceeds
      // maxAttempts.
      DatabricksError res = ApiErrors.checkForRetry(out, err);
      if (!res.isRetriable()) {
        if (res.getErrorCode() == null) {
          return out;
        }
        throw res;
      }
      if (attemptNumber == maxAttempts) {
        throw new DatabricksException(
            String.format("Request %s failed after %d retries", in, maxAttempts), err);
      }

      // Retry after a backoff.
      int sleepMillis = getBackoffMillis(attemptNumber);
      LOG.debug(String.format("Retry %s in %dms", in.getRequestLine(), sleepMillis));
      try {
        timer.wait(sleepMillis);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
    }
  }

  private int getBackoffMillis(int attemptNumber) {
    int maxWait = 10000;
    int minJitter = 50;
    int maxJitter = 750;

    int wait = Math.min(maxWait, attemptNumber * 1000);
    wait += random.nextInt(maxJitter - minJitter + 1) + minJitter;
    return wait;
  }

  private String makeLogRecord(Request in, Response out) {
    StringBuilder sb = new StringBuilder();
    sb.append("> ");
    sb.append(in.getRequestLine());
    if (config.isDebugHeaders()) {
      sb.append("\n * Host: ");
      sb.append(config.getHost());
      in.getHeaders()
          .forEach((header, value) -> sb.append(String.format("\n * %s: %s", header, value)));
    }
    if (in.isBodyStreaming()) {
      sb.append("\n> (streamed body)");
    } else {
      String requestBody = in.getBodyString();
      if (requestBody != null && !requestBody.isEmpty()) {
        for (String line : bodyLogger.redactedDump(requestBody).split("\n")) {
          sb.append("\n> ");
          sb.append(line);
        }
      }
    }
    sb.append("\n< ");
    sb.append(out.toString());
    for (String line : bodyLogger.redactedDump(out.getDebugBody()).split("\n")) {
      sb.append("\n< ");
      sb.append(line);
    }
    return sb.toString();
  }

  public <T> T deserialize(Response response, Class<T> target) throws IOException {
    if (target == InputStream.class) {
      return (T) response.getBody();
    }
    T object;
    try {
      object = target.getDeclaredConstructor().newInstance();
    } catch (Exception e) {
      throw new DatabricksException("Unable to initialize an instance of type " + target.getName());
    }
    deserialize(response, object);
    return object;
  }

  public <T> T deserialize(InputStream body, JavaType target) throws IOException {
    if (target == mapper.constructType(InputStream.class)) {
      return (T) body;
    }
    return mapper.readValue(body, target);
  }

  private <T> void fillInHeaders(T target, Response response) {
    for (Field field : target.getClass().getDeclaredFields()) {
      Header headerAnnotation = field.getAnnotation(Header.class);
      if (headerAnnotation == null) {
        continue;
      }
      String firstHeader = response.getFirstHeader(headerAnnotation.value());
      if (firstHeader == null) {
        continue;
      }
      try {
        field.setAccessible(true);
        if (field.getType() == String.class) {
          field.set(target, firstHeader);
        } else if (field.getType() == Long.class) {
          field.set(target, Long.parseLong(firstHeader));
        } else {
          LOG.warn("Unsupported header type: " + field.getType());
        }
      } catch (IllegalAccessException e) {
        throw new DatabricksException("Failed to unmarshal headers: " + e.getMessage(), e);
      } finally {
        field.setAccessible(false);
      }
    }
  }

  private <T> Optional<Field> getContentsField(T target) {
    for (Field field : target.getClass().getDeclaredFields()) {
      if (field.getName().equals("contents") && field.getType() == InputStream.class) {
        return Optional.of(field);
      }
    }
    return Optional.empty();
  }

  public <T> void deserialize(Response response, T object) throws IOException {
    fillInHeaders(object, response);
    Optional<Field> contentsField = getContentsField(object);
    if (contentsField.isPresent()) {
      Field field = contentsField.get();
      try {
        field.setAccessible(true);
        field.set(object, response.getBody());
      } catch (IllegalAccessException e) {
        throw new DatabricksException("Failed to unmarshal headers: " + e.getMessage(), e);
      } finally {
        field.setAccessible(false);
      }
    } else if (response.getBody() != null) {
      mapper.readerForUpdating(object).readValue(response.getBody());
    }
  }

  private String serialize(Object body) throws JsonProcessingException {
    if (body == null) {
      return null;
    }
    return mapper.writeValueAsString(body);
  }
}
