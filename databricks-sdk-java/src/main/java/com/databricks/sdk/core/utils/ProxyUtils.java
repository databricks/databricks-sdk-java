package com.databricks.sdk.core.utils;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.ProxyConfig;
import java.security.Principal;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.ProxyAuthenticationStrategy;

public class ProxyUtils {

  public static void setupProxy(ProxyConfig config, HttpClientBuilder builder) {
    String proxyHost = null;
    Integer proxyPort = null;
    String proxyUser = null;
    String proxyPassword = null;
    if (config.isUseSystemProperties() != null && config.isUseSystemProperties()) {
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
    if (proxyAuthType == null) {
      return;
    }
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
    Credentials useJaasCreds =
        new Credentials() {
          public String getPassword() {
            return null;
          }

          public Principal getUserPrincipal() {
            return null;
          }
        };

    CredentialsProvider credsProvider = new BasicCredentialsProvider();
    credsProvider.setCredentials(authScope, useJaasCreds);
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
}
