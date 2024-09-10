package com.databricks.sdk.core;

public class ProxyConfig {
  private String host;
  private Integer port;
  private String username;
  private String password;
  private ProxyAuthType proxyAuthType;
  private Boolean useSystemProperties;
  // a list of hosts that should be reached directly, bypassing the proxy.
  // This is a list of patterns separated by '|'. The patterns may start or end with a '*' for
  // wildcards.
  // Any host matching one of these patterns will be reached through a direct connection instead of
  // through a proxy.
  // More info here: https://docs.oracle.com/javase/8/docs/technotes/guides/net/proxies.html
  private String nonProxyHosts;

  public enum ProxyAuthType {
    // Currently we only support BASIC and SPNEGO
    NONE,
    BASIC,
    // We only support kerberos for negotiate
    SPNEGO
  }

  public ProxyConfig() {}

  public String getHost() {
    return host;
  }

  public ProxyConfig setHost(String host) {
    this.host = host;
    return this;
  }

  public Integer getPort() {
    return port;
  }

  public ProxyConfig setPort(Integer port) {
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

  public Boolean getUseSystemProperties() {
    return useSystemProperties;
  }

  public ProxyConfig setUseSystemProperties(Boolean useSystemProperties) {
    this.useSystemProperties = useSystemProperties;
    return this;
  }

  public String getNonProxyHosts() {
    return nonProxyHosts;
  }

  /**
   * @param nonProxyHosts a list of hosts that should be reached directly, bypassing the proxy. This
   *     is a list of patterns separated by '|'. The patterns may start or end with a '*' for
   *     wildcards.
   * @return the current ProxyConfig object
   */
  public ProxyConfig setNonProxyHosts(String nonProxyHosts) {
    this.nonProxyHosts = nonProxyHosts;
    return this;
  }
}
