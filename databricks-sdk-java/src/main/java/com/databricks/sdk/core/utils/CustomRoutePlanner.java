package com.databricks.sdk.core.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.protocol.HttpContext;

/**
 * Custom route planner that routes requests via a proxy, except for hosts that match a list of
 * non-proxy hosts.
 */
public class CustomRoutePlanner implements HttpRoutePlanner {
  private final DefaultProxyRoutePlanner defaultRoutePlanner;
  private final List<Pattern> nonProxyHostRegex;

  public CustomRoutePlanner(HttpHost proxy, String nonProxyHosts) {
    this.defaultRoutePlanner = new DefaultProxyRoutePlanner(proxy);
    if (nonProxyHosts == null || nonProxyHosts.isEmpty()) {
      this.nonProxyHostRegex = new ArrayList<>();
    } else {
      this.nonProxyHostRegex =
          Arrays.stream(nonProxyHosts.split("\\|"))
              .map(host -> host.replace(".", "\\.").replace("*", ".*"))
              .map(Pattern::compile)
              .collect(Collectors.toList());
    }
  }

  @Override
  public HttpRoute determineRoute(HttpHost target, HttpRequest request, HttpContext context)
      throws HttpException {
    String targetHostName = target.getHostName();
    if (nonProxyHostRegex.stream().anyMatch(pattern -> pattern.matcher(targetHostName).matches())) {
      return new HttpRoute(target); // Direct route, no proxy
    }
    return defaultRoutePlanner.determineRoute(target, request, context); // Route via proxy
  }
}
