package com.databricks.sdk.core.commons;

import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

public class CommonsHttpClient implements HttpClient {
  private final PoolingHttpClientConnectionManager connectionManager =
      new PoolingHttpClientConnectionManager();
  private final CloseableHttpClient hc;
  private int timeout;

  public CommonsHttpClient(int timeoutSeconds) {
    timeout = timeoutSeconds * 1000;
    connectionManager.setMaxTotal(100);
    hc = makeClosableHttpClient();
  }

  private RequestConfig makeRequestConfig() {
    return RequestConfig.custom()
        .setConnectionRequestTimeout(timeout)
        .setConnectTimeout(timeout)
        .setSocketTimeout(timeout)
        .build();
  }

  private CloseableHttpClient makeClosableHttpClient() {
    return HttpClientBuilder.create()
        .setConnectionManager(connectionManager)
        .setDefaultRequestConfig(makeRequestConfig())
        .build();
  }

  @Override
  public Response execute(Request in) throws IOException {
    HttpUriRequest request = transformRequest(in);
    in.getHeaders().forEach(request::setHeader);
    try (CloseableHttpResponse response = hc.execute(request)) {
      HttpEntity entity = response.getEntity();
      StatusLine statusLine = response.getStatusLine();
      Map<String, List<String>> hs =
          Arrays.stream(response.getAllHeaders())
              .collect(
                  Collectors.groupingBy(
                      NameValuePair::getName,
                      Collectors.mapping(NameValuePair::getValue, Collectors.toList())));
      String body = null;
      if (entity != null) {
        try (InputStream inputStream = entity.getContent()) {
          body = IOUtils.toString(inputStream, Charset.defaultCharset());
        }
      }
      return new Response(in, statusLine.getStatusCode(), statusLine.getReasonPhrase(), hs, body);
    }
  }

  private HttpUriRequest transformRequest(Request in) {
    switch (in.getMethod()) {
      case Request.GET:
        return new HttpGet(in.getUri());
      case Request.DELETE:
        return new HttpDelete(in.getUri());
      case Request.POST:
        return withEntity(new HttpPost(in.getUri()), in.getBody());
      case Request.PUT:
        return withEntity(new HttpPut(in.getUri()), in.getBody());
      case Request.PATCH:
        return withEntity(new HttpPatch(in.getUri()), in.getBody());
      default:
        throw new IllegalArgumentException("Unknown method: " + in.getMethod());
    }
  }

  private HttpRequestBase withEntity(HttpEntityEnclosingRequestBase request, String body) {
    try {
      request.setEntity(new StringEntity(body));
      return request;
    } catch (UnsupportedEncodingException e) {
      throw new IllegalArgumentException(e);
    }
  }
}
