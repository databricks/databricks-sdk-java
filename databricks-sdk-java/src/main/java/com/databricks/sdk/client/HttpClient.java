package com.databricks.sdk.client;

import com.databricks.sdk.support.QueryParam;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Random;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * Simplified REST API client with retries, JSON POJO SerDe through Jackson and exception POJO
 * guessing
 */
public class HttpClient {
  interface RequestPreparer {
    public void prepareRequest(HttpRequestBase request);
  }

  private final int maxRetries;
  private final int maxConnections;
  private final int timeout;

  private final RequestConfig requestConfig;

  private final ObjectMapper mapper;

  private final CloseableHttpClient hc;

  private final Random random;

  private final String host;

  private final RequestPreparer rp;

  public HttpClient(
      HttpClientConnectionManager connectionManager,
      int httpTimeoutSeconds,
      int rateLimit,
      int debugTruncateBytes,
      String host,
      RequestPreparer rp) {
    if (httpTimeoutSeconds == 0) {
      httpTimeoutSeconds = 300;
    }

    if (rateLimit == 0) {
      rateLimit = 15;
    }

    if (debugTruncateBytes == 0) {
      debugTruncateBytes = 96;
    }

    timeout = httpTimeoutSeconds * 1000;
    this.host = host;

    maxConnections = 20;
    maxRetries = 3;

    requestConfig = makeRequestConfig();
    hc = makeClosableHttpClient(connectionManager);
    mapper = makeObjectMapper();
    random = new Random();
    if (rp == null) {
      this.rp =
          new RequestPreparer() {
            @Override
            public void prepareRequest(HttpRequestBase request) {}
          };
    } else {
      this.rp = rp;
    }
  }

  private ObjectMapper makeObjectMapper() {
    ObjectMapper mapper = new ObjectMapper();
    mapper
        .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
        .configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, true)
        .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
        .configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true)
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
        .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)
        .setSerializationInclusion(JsonInclude.Include.NON_NULL);
    return mapper;
  }

  private CloseableHttpClient makeClosableHttpClient(
      HttpClientConnectionManager connectionManager) {
    return HttpClientBuilder.create()
        .setConnectionManager(connectionManager)
        .setDefaultRequestConfig(requestConfig)
        .build();
  }

  private RequestConfig makeRequestConfig() {
    return RequestConfig.custom()
        .setConnectionRequestTimeout(timeout)
        .setConnectTimeout(timeout)
        .setSocketTimeout(timeout)
        .build();
  }

  private <I> void addQueryParameters(URIBuilder uriBuilder, I entity) {
    if (entity == null) {
      return;
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
        uriBuilder.addParameter(param.value(), value.toString());
      }
    } catch (IllegalAccessException e) {
      throw new DatabricksException("Cannot create query string: " + e.getMessage(), e);
    }
  }

  private <I> URI uriFromRequest(String path, I in) {
    try {
      URIBuilder uriBuilder = new URIBuilder(path);
      if (uriBuilder.getHost() == null) {
        if (host == null) {
          throw new DatabricksException(
              "Host neither provided nor configured when requesting "
                  + path
                  + ". Ensure "
                  + "that the provided path includes a host or the host is configured in HttpClient");
        }
        uriBuilder = new URIBuilder(host + path);
      }
      addQueryParameters(uriBuilder, in);
      return uriBuilder.build();
    } catch (URISyntaxException e) {
      throw new DatabricksException("URL syntax error: " + e.getMessage(), e);
    }
  }

  public <O> O GET(String path, Class<O> target) {
    return GET(path, null, target);
  }

  public <I, O> O GET(String path, I in, Class<O> target) {
    return execute(new HttpGet(uriFromRequest(path, in)), target);
  }

  public <I, O> O POST(String path, I in, Class<O> target) {
    return execute(withEntity(new HttpPost(uriFromRequest(path, in)), in), target);
  }

  public <I, O> O PUT(String path, I in, Class<O> target) {
    return execute(withEntity(new HttpPut(uriFromRequest(path, in)), in), target);
  }

  public <I, O> O PATCH(String path, I in, Class<O> target) {
    return execute(withEntity(new HttpPatch(uriFromRequest(path, in)), in), target);
  }

  public <I, O> O DELETE(String path, I in, Class<O> target) {
    return execute(new HttpDelete(uriFromRequest(path, in)), target);
  }

  /**
   * Executes HTTP request with couple of retries and converts it to proper POJO
   *
   * @param request Commons HTTP request
   * @param target Expected pojo type
   * @return POJO of requested type
   */
  public <T> T execute(HttpRequestBase request, Class<T> target) {
    try {
      return execute0(request, target);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  public <T> T execute0(HttpRequestBase request, Class<T> target) throws IOException {
    int attemptNumber = 0;
    CloseableHttpResponse success = null;
    CloseableHttpResponse lastResponse = null;
    // log.info(s"Requesting ${request.getRequestLine}")

    String userAgent = UserAgent.asString();
    // TODO: add auth/<auth-type> once PR#9 is merged
    request.setHeader("User-Agent", userAgent);
    request.setHeader("Accept", "application/json");

    while (attemptNumber <= maxRetries && success == null) {
      try {
        attemptNumber++;
        rp.prepareRequest(request);
        lastResponse = hc.execute(request);
        int status = lastResponse.getStatusLine().getStatusCode();
        if (status >= 400) {
          throw new IOException("Retry ${request.getRequestLine} because of $status");
        }
        success = lastResponse;
      } catch (IOException e) {
        if (maxRetries == attemptNumber) {
          assert lastResponse != null;
          throw convertException(lastResponse.getEntity().getContent());
        }
        int sleep = random.nextInt(500);
        // log.debug(s"Retry ${request.getRequestLine} in $sleep ms", e)
        try {
          Thread.sleep(sleep);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      } finally {
        if (success == null && lastResponse != null) {
          // prevent memory leaks
          EntityUtils.consumeQuietly(lastResponse.getEntity());
        }
      }
    }
    if (success == null) {
      // technically this should not be reachable
      throw new DatabricksException(
          "Did not receive any successful response for ${request.getRequestLine}");
    }
    try {
      if (target == Void.class) {
        return null;
      }
      String content = IOUtils.toString(success.getEntity().getContent(), Charset.defaultCharset());
      return deserialize(content, target);
    } finally {
      success.close();
    }
  }

  private DatabricksException convertException(InputStream content) throws IOException {
    // TODO: implement
    return new DatabricksException(IOUtils.toString(content, Charset.defaultCharset()));
  }

  /**
   * Syntactic sugar for POST/PUT requests to serialize POJOs into JSON
   *
   * @param request Commons HTTP request
   * @param body any Jackson-annotated POJO class
   * @return same request, but enriched with entity
   */
  public <T> HttpRequestBase withEntity(HttpEntityEnclosingRequestBase request, T body) {
    try {
      String json = serialize(body);
      request.setEntity(new StringEntity(json));
      request.setHeader("Content-Type", "application/json");
      return request;
    } catch (IOException e) {
      throw new DatabricksException("Unable to construct entity: " + e.getMessage(), e);
    }
  }

  public <T> T deserialize(String body, Class<T> target) throws JsonProcessingException {
    return mapper.readValue(body, target);
  }

  private String serialize(Object body) throws JsonProcessingException {
    return mapper.writeValueAsString(body);
  }
}
