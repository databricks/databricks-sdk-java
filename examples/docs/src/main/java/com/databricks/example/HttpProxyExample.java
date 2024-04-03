package com.databricks.example;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.service.compute.ClusterDetails;
import com.databricks.sdk.service.compute.ListClustersRequest;

/**
 * This example demonstrates how to use the Databricks Java SDK with an HTTP proxy.
 *
 * To run this example, you must set the following system properties:
 * -Dhttps.proxyHost=<proxy host>
 *   The host name of the HTTP proxy server.
 * -Dhttps.proxyPort=<proxy port>
 *   The port number of the HTTP proxy server.
 */
class HttpProxyExample {
  public static void main(String[] args) {
    validateProxySettings();
    WorkspaceClient w = new WorkspaceClient();

    for (ClusterDetails c : w.clusters().list(new ListClustersRequest())) {
      System.out.println(c.getClusterName());
    }
  }

  private static void validateProxySettings() {
    String httpProxyHost = System.getProperty("https.proxyHost");
    String httpProxyPort = System.getProperty("https.proxyPort");
    if (httpProxyHost == null) {
      throw new IllegalArgumentException("https.proxyHost must be set");
    }
    if (httpProxyPort == null) {
      throw new IllegalArgumentException("https.proxyPort must be set");
    }
  }
}
