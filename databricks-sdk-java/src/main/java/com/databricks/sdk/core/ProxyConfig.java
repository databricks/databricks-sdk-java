package com.databricks.sdk.core;

public class ProxyConfig {
  private String host;
  private int port;
  private String username;
  private String password;
  private ProxyAuthType proxyAuthType;
  private boolean useSystemProperties;

  public enum ProxyAuthType {
    // Currently we only support BASIC and SPNEGO
    NONE,
    BASIC,
    // We only support kerberos for negotiate
    SPNEGO
  }

  public ProxyConfig(DatabricksConfig config) {
    this.host = config.getProxyHost();
    this.port = config.getProxyPort();
    this.username = config.getProxyUsername();
    this.password = config.getProxyPassword();
    this.proxyAuthType = config.getProxyAuthType();
    this.useSystemProperties = config.isUseSystemPropertiesHttp();
  }

  public String getHost() {
    return host;
  }

  public ProxyConfig setHost(String host) {
    this.host = host;
    return this;
  }

  public int getPort() {
    return port;
  }

  public ProxyConfig setPort(int port) {
    this.port = port;
    return this;
  }

  public String getUsername() {
    return username;
  }

  public ProxyConfig setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public ProxyConfig setPassword(String password) {
    this.password = password;
    return this;
  }

  public ProxyAuthType getProxyAuthType() {
    return proxyAuthType;
  }

  public ProxyConfig setProxyAuthType(ProxyAuthType proxyAuthType) {
    this.proxyAuthType = proxyAuthType;
    return this;
  }

  public boolean isUseSystemProperties() {
    return useSystemProperties;
  }

  public ProxyConfig setUseSystemProperties(boolean useSystemProperties) {
    this.useSystemProperties = useSystemProperties;
    return this;
  }
}
