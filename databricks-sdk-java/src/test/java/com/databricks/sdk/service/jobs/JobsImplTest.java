package com.databricks.sdk.service.jobs;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.http.Request;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class JobsImplTest {

  /*
   * API 2.1 pinned endpoints check
   * See: https://databricks.atlassian.net/browse/JOBS-19304
   */

  @Test
  public void testJobsCreateUsesApi2_1() throws IOException {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.1/jobs/create";
    when(apiClient.execute(any(), any())).thenReturn(null);
    when(apiClient.serialize(any())).thenReturn("");

    JobsService jobs = new JobsImpl(apiClient);
    jobs.create(new CreateJob());

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
                  return true;
                }),
            eq(CreateResponse.class));
  }

  @Test
  public void testJobsGetUsesApi2_1() throws IOException {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.1/jobs/get";
    when(apiClient.execute(any(), any())).thenReturn(null);

    JobsService jobs = new JobsImpl(apiClient);
    jobs.get(new GetJobRequest());

    verify(apiClient)
        .execute(
            argThat(
                (Request req) -> {
                  if (!req.getMethod().equals("GET")) {
                    return false;
                  }
                  if (!req.getUrl().equals(expectedPath)) {
                    return false;
                  }
                  return true;
                }),
            eq(Job.class));
  }

  @Test
  public void testJobsListUsesApi2_1() throws IOException {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.1/jobs/list";
    when(apiClient.execute(any(), any())).thenReturn(null);

    JobsService jobs = new JobsImpl(apiClient);
    jobs.list(new ListJobsRequest());

    verify(apiClient)
        .execute(
            argThat(
                (Request req) -> {
                  if (!req.getMethod().equals("GET")) {
                    return false;
                  }
                  if (!req.getUrl().equals(expectedPath)) {
                    return false;
                  }
                  return true;
                }),
            eq(ListJobsResponse.class));
  }

  @Test
  public void testJobsUpdateUsesApi2_1() throws IOException {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.1/jobs/update";
    when(apiClient.execute(any(), any())).thenReturn(null);

    JobsService jobs = new JobsImpl(apiClient);
    jobs.update(new UpdateJob());

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
                  return true;
                }),
            eq(UpdateResponse.class));
  }

  @Test
  public void testJobsResetUsesApi2_1() throws IOException {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.1/jobs/reset";
    when(apiClient.execute(any(), any())).thenReturn(null);
    when(apiClient.serialize(any())).thenReturn("");

    JobsService jobs = new JobsImpl(apiClient);
    jobs.reset(new ResetJob());

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
                  return true;
                }),
            eq(ResetResponse.class));
  }

  @Test
  public void testJobsListRunsUsesApi2_1() throws IOException {
    ApiClient apiClient = Mockito.mock(ApiClient.class);
    String expectedPath = "/api/2.1/jobs/runs/list";
    when(apiClient.execute(any(), any())).thenReturn(null);

    JobsService jobs = new JobsImpl(apiClient);
    jobs.listRuns(new ListRunsRequest());

    verify(apiClient)
        .execute(
            argThat(
                (Request req) -> {
                  if (!req.getMethod().equals("GET")) {
                    return false;
                  }
                  if (!req.getUrl().equals(expectedPath)) {
                    return false;
                  }
                  return true;
                }),
            eq(ListRunsResponse.class));
  }
}
