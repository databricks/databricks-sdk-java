package com.databricks.sdk.mixin;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DummyHttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ClustersExtTest {

  @Test
  void ensureClusterIsRunning() throws TimeoutException {
    DummyHttpClient httpClient =
        new DummyHttpClient()
            .with(
                new Request("GET", "https://localhost/api/2.0/clusters/get")
                    .withQueryParam("cluster_id", "abc"),
                new Response("{}"));

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://localhost")
            .setToken("bcd")
            .setHttpClient(httpClient);
    DatabricksConfig mockConfig = Mockito.spy(config);
    Mockito.doReturn(mockConfig).when(mockConfig).resolve();

    ClustersExt clustersExt = new ClustersExt(new ApiClient(mockConfig));

    clustersExt.ensureClusterIsRunning("abc");
  }
}
