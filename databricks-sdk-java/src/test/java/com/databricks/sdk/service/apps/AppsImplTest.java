package com.databricks.sdk.service.apps;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.http.Request;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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

  // On unified ("SPOG") hosts, workspace-scoped requests must carry an
  // X-Databricks-Workspace-Id header so the gateway can route them to the
  // correct workspace. When ApiClient#workspaceId() returns a value, every
  // generated *Impl must forward it on the request; when it returns null,
  // the header must be omitted (so calls to legacy single-workspace hosts
  // don't pick up an empty value).
  @Test
  public void testWorkspaceIdHeaderSentWhenConfigured() throws IOException {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    when(apiClient.workspaceId()).thenReturn("7474644166319138");
    when(apiClient.execute(any(), any())).thenReturn(null);

    AppsService apps = new AppsImpl(apiClient);
    apps.list(new ListAppsRequest());

    verify(apiClient)
        .execute(
            argThat(
                (Request req) ->
                    "7474644166319138".equals(req.getHeaders().get("X-Databricks-Workspace-Id"))),
            any());
  }

  @Test
  public void testWorkspaceIdHeaderOmittedWhenUnset() throws IOException {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    when(apiClient.workspaceId()).thenReturn(null);
    when(apiClient.execute(any(), any())).thenReturn(null);

    AppsService apps = new AppsImpl(apiClient);
    apps.list(new ListAppsRequest());

    verify(apiClient)
        .execute(
            argThat((Request req) -> !req.getHeaders().containsKey("X-Databricks-Workspace-Id")),
            any());
  }
}
