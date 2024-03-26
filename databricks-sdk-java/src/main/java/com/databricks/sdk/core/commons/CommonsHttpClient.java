package com.databricks.sdk.core.commons;

import static org.apache.http.entity.ContentType.APPLICATION_JSON;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.ProxyConfig;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.utils.CustomCloseInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.Principal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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

  public CommonsHttpClient(int timeoutSeconds, ProxyConfig proxyConfig) {
    timeout = timeoutSeconds * 1000;
    connectionManager.setMaxTotal(100);
    hc = makeClosableHttpClient(proxyConfig);
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
        .useSystemProperties()
        .build();
  }

  private CloseableHttpClient makeClosableHttpClient(ProxyConfig proxyConfig) {
    HttpClientBuilder builder =
        HttpClientBuilder.create()
            .setConnectionManager(connectionManager)
            .setDefaultRequestConfig(makeRequestConfig());
    setupProxy(proxyConfig, builder);
    return builder.build();
  }

  public static void setupProxy(ProxyConfig config, HttpClientBuilder builder) {
    String proxyHost = null;
    Integer proxyPort = null;
    String proxyUser = null;
    String proxyPassword = null;
    if (config.isUseSystemProperties()) {
      builder.useSystemProperties();
      String protocol = System.getProperty("https.proxyHost") != null ? "https" : "http";
      proxyHost = System.getProperty(protocol + ".proxyHost");
      proxyPort = Integer.parseInt(System.getProperty(protocol + ".proxyPort"));
      proxyUser = System.getProperty(protocol + ".proxyUser");
      proxyPassword = System.getProperty(protocol + ".proxyPassword");
    }
    // Override system properties if proxy configuration is explicitly set
    if (config.getHost() != null) {
      proxyHost = config.getHost();
      proxyPort = config.getPort();
      proxyUser = config.getUsername();
      proxyPassword = config.getPassword();
      builder.setProxy(new HttpHost(proxyHost, proxyPort));
    }
    setupProxyAuth(
        proxyHost, proxyPort, config.getProxyAuthType(), proxyUser, proxyPassword, builder);
  }

  public static void setupProxyAuth(
      String proxyHost,
      Integer proxyPort,
      ProxyConfig.ProxyAuthType proxyAuthType,
      String proxyUser,
      String proxyPassword,
      HttpClientBuilder builder) {
    AuthScope authScope = new AuthScope(proxyHost, proxyPort);
    switch (proxyAuthType) {
      case NONE:
        break;
      case BASIC:
        setupBasicProxyAuth(builder, authScope, proxyUser, proxyPassword);
        break;
      case SPNEGO:
        setupNegotiateProxyAuth(builder, authScope);
        break;
      default:
        throw new DatabricksException("Unknown proxy auth type: " + proxyAuthType);
    }
  }

  public static void setupNegotiateProxyAuth(HttpClientBuilder builder, AuthScope authScope) {
    // We only support kerberos for negotiate as of now
    System.setProperty("javax.security.auth.useSubjectCredsOnly", "false");
    // "java.security.krb5.conf" system property needs to be set if krb5.conf is not in the default
    // location
    // Use "sun.security.krb5.debug" and "sun.security.jgss.debug" system properties for debugging
    Credentials use_jaas_creds =
        new Credentials() {
          public String getPassword() {
            return null;
          }

          public Principal getUserPrincipal() {
            return null;
          }
        };

    CredentialsProvider credsProvider = new BasicCredentialsProvider();
    credsProvider.setCredentials(authScope, use_jaas_creds);
    builder
        .setDefaultCredentialsProvider(credsProvider)
        .setDefaultAuthSchemeRegistry(
            RegistryBuilder.<AuthSchemeProvider>create()
                .register(AuthSchemes.SPNEGO, new SPNegoSchemeFactory(true))
                .build());
  }

  public static void setupBasicProxyAuth(
      HttpClientBuilder builder, AuthScope authScope, String proxyUser, String proxyPassword) {
    CredentialsProvider credsProvider = new BasicCredentialsProvider();
    credsProvider.setCredentials(
        authScope, new UsernamePasswordCredentials(proxyUser, proxyPassword));
    builder
        .setDefaultCredentialsProvider(credsProvider)
        .setProxyAuthenticationStrategy(new ProxyAuthenticationStrategy());
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
