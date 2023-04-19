package com.databricks.sdk.client;

import com.databricks.sdk.client.http.HttpClient;
import com.databricks.sdk.client.http.Request;
import com.databricks.sdk.client.http.Response;
import com.databricks.sdk.support.QueryParam;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simplified REST API client with retries, JSON POJO SerDe through Jackson and exception POJO
 * guessing
 */
public class ApiClient {
  private static final Logger LOG = LoggerFactory.getLogger(ApiClient.class);

  private final int maxRetries;

  private final ObjectMapper mapper;

  private final DatabricksConfig config;

  private final Random random;

  private final HttpClient httpClient;
  private final BodyLogger bodyLogger;

  public ApiClient() {
    this(ConfigLoader.getDefault());
  }

  public String configuredAccountID() {
    return config.getAccountId();
  }

  public ApiClient(DatabricksConfig config) {
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

    maxRetries = 3;
    mapper = makeObjectMapper();
    random = new Random();
    httpClient = config.getHttpClient();
    bodyLogger = new BodyLogger(mapper, 1024, debugTruncateBytes);
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

  private <I> Request withQuery(Request in, I entity) {
    if (entity == null) {
      return in;
    }
    try {
      // deterministic query string: in the order of class fields
      for (Field field : entity.getClass().getDeclaredFields()) {
        QueryParam param = field.getAnnotation(QueryParam.class);
        if (param == null) {
          continue;
        }
        field.setAccessible(true);
        Object value = field.get(entity);
        field.setAccessible(false);
        if (value == null) {
          continue;
        }
        in.withQueryParam(param.value(), value.toString());
      }
      return in;
    } catch (IllegalAccessException e) {
      throw new DatabricksException("Cannot create query string: " + e.getMessage(), e);
    }
  }

  public <O> O GET(String path, Class<O> target) {
    return GET(path, null, target);
  }

  public <I, O> O GET(String path, I in, Class<O> target) {
    try {
      return execute(withQuery(new Request("GET", path), in), target);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  public <I, O> O POST(String path, I in, Class<O> target) {
    try {
      return execute(new Request("POST", path, serialize(in)), target);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  public <I, O> O PUT(String path, I in, Class<O> target) {
    try {
      return execute(new Request("PUT", path, serialize(in)), target);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  public <I, O> O PATCH(String path, I in, Class<O> target) {
    try {
      return execute(new Request("PATCH", path, serialize(in)), target);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  public <I, O> O DELETE(String path, I in, Class<O> target) {
    try {
      return execute(withQuery(new Request("DELETE", path), in), target);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  /**
   * Executes HTTP request with couple of retries and converts it to proper POJO
   *
   * @param in Commons HTTP request
   * @param target Expected pojo type
   * @return POJO of requested type
   */
  private <T> T execute(Request in, Class<T> target) throws IOException {
    in.withUrl(config.getHost() + in.getUrl());

    int attemptNumber = 0;
    Response out = null;
    Response lastResponse = null;

    String userAgent = UserAgent.asString();
    // TODO: add auth/<auth-type> once PR#9 is merged
    in.withHeader("User-Agent", userAgent);
    in.withHeader("Accept", "application/json");

    while (attemptNumber <= maxRetries && out == null) {
      try {
        attemptNumber++;
        in.withHeaders(config.authenticate());

        lastResponse = httpClient.execute(in);
        if (LOG.isDebugEnabled()) {
          LOG.debug(makeLogRecord(in, lastResponse));
        }
        int status = lastResponse.getStatusCode();
        if (status >= 400) {
          throw new IOException(
              String.format(
                  "Retry %s because of %s", in.getRequestLine(), lastResponse.getStatus()));
        }
        out = lastResponse;
      } catch (IOException e) {
        if (maxRetries == attemptNumber) {
          assert lastResponse != null;
          throw convertException(lastResponse.getBody());
        }
        int sleep = random.nextInt(500);
        LOG.debug(String.format("Retry %s in %dms", in.getRequestLine(), sleep), e);
        try {
          Thread.sleep(sleep);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      }
    }
    if (out == null) {
      // technically this should not be reachable
      throw new IOException(
          "Did not receive any successful response for ${request.getRequestLine}");
    }
    if (target == Void.class) {
      return null;
    }
    return deserialize(out.getBody(), target);
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
    String requestBody = in.getBody();
    if (requestBody != null && !requestBody.isEmpty()) {
      for (String line : bodyLogger.redactedDump(requestBody).split("\n")) {
        sb.append("\n> ");
        sb.append(line);
      }
    }
    sb.append("\n< ");
    sb.append(out.toString());
    for (String line : bodyLogger.redactedDump(out.getBody()).split("\n")) {
      sb.append("\n< ");
      sb.append(line);
    }
    return sb.toString();
  }

  private IOException convertException(String body) {
    // TODO: implement
    return null;
  }

  public <T> T deserialize(String body, Class<T> target) throws IOException {
    return mapper.readValue(body, target);
  }

  private String serialize(Object body) throws JsonProcessingException {
    return mapper.writeValueAsString(body);
  }
}
