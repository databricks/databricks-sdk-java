package com.databricks.sdk.core.commons;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.utils.CustomCloseInputStream;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.ProxyAuthenticationStrategy;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.Principal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.apache.http.entity.ContentType.APPLICATION_JSON;

public class CommonsHttpClient implements HttpClient {
  private static final Logger LOG = LoggerFactory.getLogger(CommonsHttpClient.class);
  private final PoolingHttpClientConnectionManager connectionManager =
      new PoolingHttpClientConnectionManager();
  private final CloseableHttpClient hc;
  private int timeout;

  public CommonsHttpClient(int timeoutSeconds) {
    timeout = timeoutSeconds * 1000;
    connectionManager.setMaxTotal(100);
    hc = makeClosableHttpClient();
  }

  public CommonsHttpClient(int timeoutSeconds, DatabricksConfig config) {
    timeout = timeoutSeconds * 1000;
    connectionManager.setMaxTotal(100);
    hc = makeClosableHttpClient(config);
  }


  private CloseableHttpClient makeClosableHttpClient(DatabricksConfig config) {
    HttpClientBuilder builder = HttpClientBuilder.create()
            .setConnectionManager(connectionManager)
            .setDefaultRequestConfig(makeRequestConfig());
    setupProxy(config, builder);
    return builder.build();
  }

  public static void setupProxy(DatabricksConfig config, HttpClientBuilder builder) {
    String proxyHost = null;
    Integer proxyPort = null;
    String proxyUser = null;
    String proxyPassword = null;
    if (config.getUseSystemProxy() != null && config.getUseSystemProxy()) {
      builder.useSystemProperties();
      proxyHost = System.getProperty("https.proxyHost");
      proxyPort = Integer.parseInt(System.getProperty("https.proxyPort"));
      proxyUser = System.getProperty("https.proxyUser");
      proxyPassword = System.getProperty("https.proxyPassword");
    }
    if (config.getUseProxy() != null && config.getUseProxy()) {
      proxyHost = config.getProxyHost();
      proxyPort = config.getProxyPort();
      proxyUser = config.getProxyUser();
      proxyPassword = config.getProxyPassword();
      builder.setProxy(new HttpHost(proxyHost, proxyPort));
    }
    if (config.getProxyAuth() != null) {
      setupProxyAuth(proxyHost, proxyPort, config.getProxyAuth(), proxyUser, proxyPassword, builder);
    }
  }

  public static void setupProxyAuth(String proxyHost, Integer proxyPort, Integer proxyAuth,
                                    String proxyUser, String proxyPassword, HttpClientBuilder builder) {
    AuthScope authScope = new AuthScope(proxyHost, proxyPort);
    switch (proxyAuth) {
      case 0:
        break;
      case 1:
        setupBasicProxyAuth(builder, authScope, proxyUser, proxyPassword);
        break;
      case 2:
        setupKerberosProxyAuth(builder, authScope);
        break;
      default:
        throw new DatabricksException("Unknown proxy auth type: " + proxyAuth);
    }
  }

  public static void setupKerberosProxyAuth(HttpClientBuilder builder, AuthScope authScope) {
    LOG.debug("Existing krb5.conf: " + System.getProperty("java.security.krb5.conf"));
//    System.setProperty("java.security.krb5.conf", "/etc/krb5.conf");
//    System.setProperty("java.security.auth.login.config", "/media/psf/Home/Desktop/login.conf");
    System.setProperty("javax.security.auth.useSubjectCredsOnly", "false");
    System.setProperty("sun.security.krb5.debug", "true");
    System.setProperty("sun.security.jgss.debug", "true");
    Credentials use_jaas_creds = new Credentials() {
      public String getPassword() {
        return null;
      }

      public Principal getUserPrincipal() {
        return null;
      }
    };

    CredentialsProvider credsProvider = new BasicCredentialsProvider();
    credsProvider.setCredentials(authScope, use_jaas_creds);
    builder.setDefaultCredentialsProvider(credsProvider)
            .setDefaultAuthSchemeRegistry(RegistryBuilder.<AuthSchemeProvider>create()
                    .register(AuthSchemes.SPNEGO, new SPNegoSchemeFactory(true))
                    .build());
  }

  public static void setupBasicProxyAuth(HttpClientBuilder builder, AuthScope authScope, String proxyUser, String proxyPassword) {
    CredentialsProvider credsProvider = new BasicCredentialsProvider();
    credsProvider.setCredentials(
        authScope,
        new UsernamePasswordCredentials(proxyUser, proxyPassword));
    builder.setDefaultCredentialsProvider(credsProvider)
            .setProxyAuthenticationStrategy(new ProxyAuthenticationStrategy());
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
    boolean handleRedirects = in.getRedirectionBehavior().orElse(true);
    if (!handleRedirects) {
      request.getParams().setParameter("http.protocol.handle-redirects", false);
    }
    in.getHeaders().forEach(request::setHeader);
    CloseableHttpResponse response = hc.execute(request);
    return computeResponse(in, response);
  }

  private Response computeResponse(Request in, CloseableHttpResponse response) throws IOException {
    HttpEntity entity = response.getEntity();
    StatusLine statusLine = response.getStatusLine();
    Map<String, List<String>> hs =
        Arrays.stream(response.getAllHeaders())
            .collect(
                Collectors.groupingBy(
                    NameValuePair::getName,
                    Collectors.mapping(NameValuePair::getValue, Collectors.toList())));
    if (entity == null) {
      response.close();
      return new Response(in, statusLine.getStatusCode(), statusLine.getReasonPhrase(), hs);
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
          in, statusLine.getStatusCode(), statusLine.getReasonPhrase(), hs, inputStream);
    }

    try (InputStream inputStream = entity.getContent()) {
      String body = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
      return new Response(in, statusLine.getStatusCode(), statusLine.getReasonPhrase(), hs, body);
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
