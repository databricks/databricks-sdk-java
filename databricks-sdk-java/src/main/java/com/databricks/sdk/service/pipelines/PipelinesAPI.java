// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Delta Live Tables API allows you to create, edit, delete, start, and view details about
 * pipelines.
 *
 * <p>Delta Live Tables is a framework for building reliable, maintainable, and testable data
 * processing pipelines. You define the transformations to perform on your data, and Delta Live
 * Tables manages task orchestration, cluster management, monitoring, data quality, and error
 * handling.
 *
 * <p>Instead of defining your data pipelines using a series of separate Apache Spark tasks, Delta
 * Live Tables manages how your data is transformed based on a target schema you define for each
 * processing step. You can also enforce data quality with Delta Live Tables expectations.
 * Expectations allow you to define expected data quality and specify how to handle records that
 * fail those expectations.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PipelinesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PipelinesAPI.class);

  private final PipelinesService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public PipelinesAPI(ApiClient apiClient) {
    impl = new PipelinesImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.pipelines.PipelinesService} object
   */
  public PipelinesAPI(PipelinesService mock) {
    impl = mock;
  }

  /**
   * <p>waitGetPipelineIdle.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public GetPipelineResponse waitGetPipelineIdle(String pipelineId) throws TimeoutException {
    return waitGetPipelineIdle(pipelineId, Duration.ofMinutes(20), null);
  }

  /**
   * <p>waitGetPipelineIdle.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @param timeout a {@link java.time.Duration} object
   * @param callback a {@link java.util.function.Consumer} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public GetPipelineResponse waitGetPipelineIdle(
      String pipelineId, Duration timeout, Consumer<GetPipelineResponse> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<PipelineState> targetStates = Arrays.asList(PipelineState.IDLE);
    java.util.List<PipelineState> failureStates = Arrays.asList(PipelineState.FAILED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      GetPipelineResponse poll = get(new GetPipelineRequest().setPipelineId(pipelineId));
      PipelineState status = poll.getState();
      statusMessage = poll.getCause();
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach IDLE, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("pipelineId=%s", pipelineId);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  /**
   * <p>waitGetPipelineRunning.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public GetPipelineResponse waitGetPipelineRunning(String pipelineId) throws TimeoutException {
    return waitGetPipelineRunning(pipelineId, Duration.ofMinutes(20), null);
  }

  /**
   * <p>waitGetPipelineRunning.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @param timeout a {@link java.time.Duration} object
   * @param callback a {@link java.util.function.Consumer} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public GetPipelineResponse waitGetPipelineRunning(
      String pipelineId, Duration timeout, Consumer<GetPipelineResponse> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<PipelineState> targetStates = Arrays.asList(PipelineState.RUNNING);
    java.util.List<PipelineState> failureStates = Arrays.asList(PipelineState.FAILED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      GetPipelineResponse poll = get(new GetPipelineRequest().setPipelineId(pipelineId));
      PipelineState status = poll.getState();
      statusMessage = poll.getCause();
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach RUNNING, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("pipelineId=%s", pipelineId);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  /**
   * Create a pipeline.
   *
   * <p>Creates a new data processing pipeline based on the requested configuration. If successful,
   * this method returns the ID of the new pipeline.
   *
   * @param request a {@link com.databricks.sdk.service.pipelines.CreatePipeline} object
   * @return a {@link com.databricks.sdk.service.pipelines.CreatePipelineResponse} object
   */
  public CreatePipelineResponse create(CreatePipeline request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   */
  public void delete(String pipelineId) {
    delete(new DeletePipelineRequest().setPipelineId(pipelineId));
  }

  /**
   * Delete a pipeline.
   *
   * <p>Deletes a pipeline.
   *
   * @param request a {@link com.databricks.sdk.service.pipelines.DeletePipelineRequest} object
   */
  public void delete(DeletePipelineRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse get(String pipelineId) {
    return get(new GetPipelineRequest().setPipelineId(pipelineId));
  }

  /**
   * Get a pipeline.
   *
   * @param request a {@link com.databricks.sdk.service.pipelines.GetPipelineRequest} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse get(GetPipelineRequest request) {
    return impl.get(request);
  }

  /**
   * <p>getUpdate.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @param updateId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetUpdateResponse} object
   */
  public GetUpdateResponse getUpdate(String pipelineId, String updateId) {
    return getUpdate(new GetUpdateRequest().setPipelineId(pipelineId).setUpdateId(updateId));
  }

  /**
   * Get a pipeline update.
   *
   * <p>Gets an update from an active pipeline.
   *
   * @param request a {@link com.databricks.sdk.service.pipelines.GetUpdateRequest} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetUpdateResponse} object
   */
  public GetUpdateResponse getUpdate(GetUpdateRequest request) {
    return impl.getUpdate(request);
  }

  /**
   * <p>listPipelineEvents.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<PipelineEvent> listPipelineEvents(String pipelineId) {
    return listPipelineEvents(new ListPipelineEventsRequest().setPipelineId(pipelineId));
  }

  /**
   * List pipeline events.
   *
   * <p>Retrieves events for a pipeline.
   *
   * @param request a {@link com.databricks.sdk.service.pipelines.ListPipelineEventsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<PipelineEvent> listPipelineEvents(ListPipelineEventsRequest request) {
    return new Paginator<>(
        request,
        impl::listPipelineEvents,
        ListPipelineEventsResponse::getEvents,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * List pipelines.
   *
   * <p>Lists pipelines defined in the Delta Live Tables system.
   *
   * @param request a {@link com.databricks.sdk.service.pipelines.ListPipelinesRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<PipelineStateInfo> listPipelines(ListPipelinesRequest request) {
    return new Paginator<>(
        request,
        impl::listPipelines,
        ListPipelinesResponse::getStatuses,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * <p>listUpdates.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListUpdatesResponse} object
   */
  public ListUpdatesResponse listUpdates(String pipelineId) {
    return listUpdates(new ListUpdatesRequest().setPipelineId(pipelineId));
  }

  /**
   * List pipeline updates.
   *
   * <p>List updates for an active pipeline.
   *
   * @param request a {@link com.databricks.sdk.service.pipelines.ListUpdatesRequest} object
   * @return a {@link com.databricks.sdk.service.pipelines.ListUpdatesResponse} object
   */
  public ListUpdatesResponse listUpdates(ListUpdatesRequest request) {
    return impl.listUpdates(request);
  }

  /**
   * <p>reset.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetPipelineResponse, Void> reset(String pipelineId) {
    return reset(new ResetRequest().setPipelineId(pipelineId));
  }

  /**
   * Reset a pipeline.
   *
   * <p>Resets a pipeline.
   *
   * @param request a {@link com.databricks.sdk.service.pipelines.ResetRequest} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetPipelineResponse, Void> reset(ResetRequest request) {
    impl.reset(request);
    return new Wait<>(
        (timeout, callback) -> waitGetPipelineRunning(request.getPipelineId(), timeout, callback));
  }

  /**
   * <p>startUpdate.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.StartUpdateResponse} object
   */
  public StartUpdateResponse startUpdate(String pipelineId) {
    return startUpdate(new StartUpdate().setPipelineId(pipelineId));
  }

  /**
   * Queue a pipeline update.
   *
   * <p>Starts or queues a pipeline update.
   *
   * @param request a {@link com.databricks.sdk.service.pipelines.StartUpdate} object
   * @return a {@link com.databricks.sdk.service.pipelines.StartUpdateResponse} object
   */
  public StartUpdateResponse startUpdate(StartUpdate request) {
    return impl.startUpdate(request);
  }

  /**
   * <p>stop.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetPipelineResponse, Void> stop(String pipelineId) {
    return stop(new StopRequest().setPipelineId(pipelineId));
  }

  /**
   * Stop a pipeline.
   *
   * <p>Stops a pipeline.
   *
   * @param request a {@link com.databricks.sdk.service.pipelines.StopRequest} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<GetPipelineResponse, Void> stop(StopRequest request) {
    impl.stop(request);
    return new Wait<>(
        (timeout, callback) -> waitGetPipelineIdle(request.getPipelineId(), timeout, callback));
  }

  /**
   * <p>update.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   */
  public void update(String pipelineId) {
    update(new EditPipeline().setPipelineId(pipelineId));
  }

  /**
   * Edit a pipeline.
   *
   * <p>Updates a pipeline with the supplied configuration.
   *
   * @param request a {@link com.databricks.sdk.service.pipelines.EditPipeline} object
   */
  public void update(EditPipeline request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.PipelinesService} object
   */
  public PipelinesService impl() {
    return impl;
  }
}
