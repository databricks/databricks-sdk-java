package com.databricks.sdk.mixin;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.DummyHttpClient;
import com.databricks.sdk.client.http.Request;
import com.databricks.sdk.client.http.Response;
import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.Test;

class ClustersExtTest {

  @Test
  void ensureClusterIsRunning() throws TimeoutException {
    DummyHttpClient httpClient =
        new DummyHttpClient()
            .with(
                new Request("GET", "https://localhost/api/2.0/clusters/get")
                    .withQueryParam("cluster_id", "abc"),
                new Response("{}"));
    ClustersExt clustersExt =
        new ClustersExt(
            new ApiClient(
                new DatabricksConfig()
                    .setHost("localhost")
                    .setToken("bcd")
                    .setHttpClient(httpClient)));

    clustersExt.ensureClusterIsRunning("abc");
  }
}
