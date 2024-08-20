package com.databricks.sdk.core.commons;

import static org.apache.http.entity.ContentType.APPLICATION_JSON;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.ProxyConfig;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.utils.CustomCloseInputStream;
import com.databricks.sdk.core.utils.ProxyUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.http.*;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonsHttpClient implements HttpClient {
  private static final Logger LOG = LoggerFactory.getLogger(CommonsHttpClient.class);
  private final PoolingHttpClientConnectionManager connectionManager =
      new PoolingHttpClientConnectionManager();
  private final CloseableHttpClient hc;
  private int timeout;

  public CommonsHttpClient(int timeoutSeconds) {
    timeout = timeoutSeconds * 1000;
    connectionManager.setMaxTotal(100);
    hc = makeClosableHttpClientBuilder().build();
  }

  public CommonsHttpClient(DatabricksConfig databricksConfig) {
    this(
        databricksConfig.getHttpTimeoutSeconds() == null
            ? 300
            : databricksConfig.getHttpTimeoutSeconds(),
        new ProxyConfig(databricksConfig));
  }

  public CommonsHttpClient(int timeoutSeconds, ProxyConfig proxyConfig) {
    timeout = timeoutSeconds * 1000;
    connectionManager.setMaxTotal(100);
    HttpClientBuilder builder = makeClosableHttpClientBuilder();
    ProxyUtils.setupProxy(proxyConfig, builder);
    hc = builder.build();
  }

  public CommonsHttpClient(int timeoutSeconds, ProxyConfig proxyConfig, SSLConnectionSocketFactory sslSocketFactory) {
    timeout = timeoutSeconds * 1000;
    connectionManager.setMaxTotal(100);
    HttpClientBuilder builder = makeClosableHttpClientBuilder();
    ProxyUtils.setupProxy(proxyConfig, builder);
    builder.setSSLSocketFactory(sslSocketFactory);
    hc = builder.build();
  }

  public CommonsHttpClient(int timeoutSeconds, SSLConnectionSocketFactory sslSocketFactory) {
    timeout = timeoutSeconds * 1000;
    connectionManager.setMaxTotal(100);
    HttpClientBuilder builder = makeClosableHttpClientBuilder();
    builder.setSSLSocketFactory(sslSocketFactory);
    hc = builder.build();
  }

  private RequestConfig makeRequestConfig() {
    return RequestConfig.custom()
        .setConnectionRequestTimeout(timeout)
        .setConnectTimeout(timeout)
        .setSocketTimeout(timeout)
        .build();
  }

  private HttpClientBuilder makeClosableHttpClientBuilder() {
    HttpClientBuilder builder =
            HttpClientBuilder.create()
                    .setConnectionManager(connectionManager)
                    .setDefaultRequestConfig(makeRequestConfig());
    return builder;
  }

  @Override
  public Response execute(Request in) throws IOException {
    HttpUriRequest request = transformRequest(in);
    boolean handleRedirects = in.getRedirectionBehavior().orElse(true);
    if (!handleRedirects) {
      request.getParams().setParameter("http.protocol.handle-redirects", false);
    }
    in.getHeaders().forEach(request::setHeader);
    HttpContext context = new BasicHttpContext();
    CloseableHttpResponse response = hc.execute(request, context);
    return computeResponse(in, context, response);
  }

  private URL getTargetUrl(HttpContext context) {
    try {
      HttpHost targetHost = (HttpHost) context.getAttribute("http.target_host");
      HttpRequest request = (HttpRequest) context.getAttribute("http.request");
      URI uri = new URI(request.getRequestLine().getUri());
      uri =
          new URI(
              targetHost.getSchemeName(),
              null,
              targetHost.getHostName(),
              targetHost.getPort(),
              uri.getPath(),
              uri.getQuery(),
              uri.getFragment());
      return uri.toURL();
    } catch (MalformedURLException | URISyntaxException e) {
      throw new DatabricksException("Unable to get target URL", e);
    }
  }

  private Response computeResponse(Request in, HttpContext context, CloseableHttpResponse response)
      throws IOException {
    HttpEntity entity = response.getEntity();
    StatusLine statusLine = response.getStatusLine();
    Map<String, List<String>> hs =
        Arrays.stream(response.getAllHeaders())
            .collect(
                Collectors.groupingBy(
                    NameValuePair::getName,
                    Collectors.mapping(NameValuePair::getValue, Collectors.toList())));
    URL url = getTargetUrl(context);
    if (entity == null) {
      response.close();
      return new Response(in, url, statusLine.getStatusCode(), statusLine.getReasonPhrase(), hs);
    }

    // The Databricks SDK is currently designed to treat all non-application/json responses as
    // InputStreams, leaving the caller to decide how to read and parse the response. The caller
    // is responsible for closing the InputStream to release the HTTP Connection.
    //
    // The client only streams responses when the caller has explicitly requested a non-JSON
    // response and the server has responded with a non-JSON Content-Type. The Databricks API
    // error response is either JSON or HTML and is safe to read fully into memory.
    boolean streamResponse =
        in.getHeaders().containsKey("Accept")
            && !APPLICATION_JSON.getMimeType().equals(in.getHeaders().get("Accept"))
            && !APPLICATION_JSON
                .getMimeType()
                .equals(response.getFirstHeader("Content-Type").getValue());
    if (streamResponse) {
      CustomCloseInputStream inputStream =
          new CustomCloseInputStream(
              entity.getContent(),
              () -> {
                try {
                  response.close();
                } catch (Exception e) {
                  throw new DatabricksException("Unable to close connection", e);
                }
              });
      return new Response(
          in, url, statusLine.getStatusCode(), statusLine.getReasonPhrase(), hs, inputStream);
    }

    try (InputStream inputStream = entity.getContent()) {
      String body = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
      return new Response(
          in, url, statusLine.getStatusCode(), statusLine.getReasonPhrase(), hs, body);
    } finally {
      response.close();
    }
  }

  private HttpUriRequest transformRequest(Request in) {
    switch (in.getMethod()) {
      case Request.GET:
        return new HttpGet(in.getUri());
      case Request.HEAD:
        return new HttpHead(in.getUri());
      case Request.DELETE:
        return new HttpDelete(in.getUri());
      case Request.POST:
        return withEntity(new HttpPost(in.getUri()), in);
      case Request.PUT:
        return withEntity(new HttpPut(in.getUri()), in);
      case Request.PATCH:
        return withEntity(new HttpPatch(in.getUri()), in);
      default:
        throw new IllegalArgumentException("Unknown method: " + in.getMethod());
    }
  }

  private HttpRequestBase withEntity(HttpEntityEnclosingRequestBase request, Request in) {
    if (in.isBodyString()) {
      request.setEntity(new StringEntity(in.getBodyString(), StandardCharsets.UTF_8));
    } else if (in.isBodyStreaming()) {
      request.setEntity(new InputStreamEntity(in.getBodyStream()));
    } else {
      LOG.warn(
          "withEntity called with a request with no body, so no request entity will be set. URI: {}",
          in.getUri());
    }
    return request;
  }
}
