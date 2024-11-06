package com.databricks.sdk.service.jobs;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.databricks.sdk.core.ApiClient;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class JobsImplTest {

  /*
   * API 2.1 pinned endpoints check
   * See: https://databricks.atlassian.net/browse/JOBS-19304
   */

  @Test
  public void testJobsCreateUsesApi2_1() {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.1/jobs/create";
    when(apiClient.POST(eq(expectedPath), any(), any(), any())).thenReturn(null);

    JobsService jobs = new JobsImpl(apiClient);
    jobs.create(new CreateJob());

    verify(apiClient).POST(eq(expectedPath), any(), any(), any());
  }

  @Test
  public void testJobsGetUsesApi2_1() {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.1/jobs/get";
    when(apiClient.GET(eq(expectedPath), any(), any(), any())).thenReturn(null);

    JobsService jobs = new JobsImpl(apiClient);
    jobs.get(new GetJobRequest());

    verify(apiClient).GET(eq(expectedPath), any(), any(), any());
  }

  @Test
  public void testJobsListUsesApi2_1() {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.1/jobs/list";
    when(apiClient.GET(eq(expectedPath), any(), any(), any())).thenReturn(null);

    JobsService jobs = new JobsImpl(apiClient);
    jobs.list(new ListJobsRequest());

    verify(apiClient).GET(eq(expectedPath), any(), any(), any());
  }

  @Test
  public void testJobsUpdateUsesApi2_1() {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.1/jobs/update";
    when(apiClient.POST(eq(expectedPath), any(), any(), any())).thenReturn(null);

    JobsService jobs = new JobsImpl(apiClient);
    jobs.update(new UpdateJob());

    verify(apiClient).POST(eq(expectedPath), any(), any(), any());
  }

  @Test
  public void testJobsResetUsesApi2_1() {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.1/jobs/reset";
    when(apiClient.POST(eq(expectedPath), any(), any(), any())).thenReturn(null);

    JobsService jobs = new JobsImpl(apiClient);
    jobs.reset(new ResetJob());

    verify(apiClient).POST(eq(expectedPath), any(), any(), any());
  }

  @Test
  public void testJobsListRunsUsesApi2_1() {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.1/jobs/runs/list";
    when(apiClient.GET(eq(expectedPath), any(), any(), any())).thenReturn(null);

    JobsService jobs = new JobsImpl(apiClient);
    jobs.listRuns(new ListRunsRequest());

    verify(apiClient).GET(eq(expectedPath), any(), any(), any());
  }
}
