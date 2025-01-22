package com.databricks.sdk.service.apps;

import com.databricks.sdk.core.ApiClient;
import static org.mockito.ArgumentMatchers.*;
import com.databricks.sdk.core.http.Request;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AppsImplTest {
  @Test
  public void testCreateAppIncludesNoComputeParameter() throws IOException {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.0/apps";
    when(apiClient.execute(any(), any())).thenReturn(null);
    when(apiClient.serialize(any())).thenReturn("");

    AppsService apps = new AppsImpl(apiClient);
    apps.create(new CreateAppRequest().setNoCompute(true));

    verify(apiClient)
        .execute(
            argThat(
                (Request req) -> {
                  if (!req.getMethod().equals("POST")) {
                    return false;
                  }
                  if (!req.getUrl().equals(expectedPath)) {
                    return false;
                  }
                  if (!req.getQuery().containsKey("no_compute")) {
                    return false;
                  }
                  if (!req.getQuery().get("no_compute").get(0).equals("true")) {
                    return false;
                  }
                  return true;
                }),
            eq(App.class));
  }
}
