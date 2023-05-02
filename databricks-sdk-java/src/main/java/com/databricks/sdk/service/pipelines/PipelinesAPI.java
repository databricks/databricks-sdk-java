// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
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
 */
@Generated
public class PipelinesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PipelinesAPI.class);

  private final PipelinesService impl;

  /** Regular-use constructor */
  public PipelinesAPI(ApiClient apiClient) {
    impl = new PipelinesImpl(apiClient);
  }

  /** Constructor for mocks */
  public PipelinesAPI(PipelinesService mock) {
    impl = mock;
  }

  public GetPipelineResponse waitGetPipelineIdle(String pipelineId) throws TimeoutException {
    return waitGetPipelineIdle(pipelineId, Duration.ofMinutes(20), null);
  }

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

  public GetPipelineResponse waitGetPipelineRunning(String pipelineId) throws TimeoutException {
    return waitGetPipelineRunning(pipelineId, Duration.ofMinutes(20), null);
  }

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
   */
  public CreatePipelineResponse create(CreatePipeline request) {
    return impl.create(request);
  }

  public void delete(String pipelineId) {
    delete(new DeletePipelineRequest().setPipelineId(pipelineId));
  }

  /**
   * Delete a pipeline.
   *
   * <p>Deletes a pipeline.
   */
  public void delete(DeletePipelineRequest request) {
    impl.delete(request);
  }

  public GetPipelineResponse get(String pipelineId) {
    return get(new GetPipelineRequest().setPipelineId(pipelineId));
  }

  /** Get a pipeline. */
  public GetPipelineResponse get(GetPipelineRequest request) {
    return impl.get(request);
  }

  public GetUpdateResponse getUpdate(String pipelineId, String updateId) {
    return getUpdate(new GetUpdateRequest().setPipelineId(pipelineId).setUpdateId(updateId));
  }

  /**
   * Get a pipeline update.
   *
   * <p>Gets an update from an active pipeline.
   */
  public GetUpdateResponse getUpdate(GetUpdateRequest request) {
    return impl.getUpdate(request);
  }

  public Iterable<PipelineEvent> listPipelineEvents(String pipelineId) {
    return listPipelineEvents(new ListPipelineEventsRequest().setPipelineId(pipelineId));
  }

  /**
   * List pipeline events.
   *
   * <p>Retrieves events for a pipeline.
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

  public ListUpdatesResponse listUpdates(String pipelineId) {
    return listUpdates(new ListUpdatesRequest().setPipelineId(pipelineId));
  }

  /**
   * List pipeline updates.
   *
   * <p>List updates for an active pipeline.
   */
  public ListUpdatesResponse listUpdates(ListUpdatesRequest request) {
    return impl.listUpdates(request);
  }

  public Wait<GetPipelineResponse, Void> reset(String pipelineId) {
    return reset(new ResetRequest().setPipelineId(pipelineId));
  }

  /**
   * Reset a pipeline.
   *
   * <p>Resets a pipeline.
   */
  public Wait<GetPipelineResponse, Void> reset(ResetRequest request) {
    impl.reset(request);
    return new Wait<>(
        (timeout, callback) -> waitGetPipelineRunning(request.getPipelineId(), timeout, callback));
  }

  public StartUpdateResponse startUpdate(String pipelineId) {
    return startUpdate(new StartUpdate().setPipelineId(pipelineId));
  }

  /**
   * Queue a pipeline update.
   *
   * <p>Starts or queues a pipeline update.
   */
  public StartUpdateResponse startUpdate(StartUpdate request) {
    return impl.startUpdate(request);
  }

  public Wait<GetPipelineResponse, Void> stop(String pipelineId) {
    return stop(new StopRequest().setPipelineId(pipelineId));
  }

  /**
   * Stop a pipeline.
   *
   * <p>Stops a pipeline.
   */
  public Wait<GetPipelineResponse, Void> stop(StopRequest request) {
    impl.stop(request);
    return new Wait<>(
        (timeout, callback) -> waitGetPipelineIdle(request.getPipelineId(), timeout, callback));
  }

  public void update(String pipelineId) {
    update(new EditPipeline().setPipelineId(pipelineId));
  }

  /**
   * Edit a pipeline.
   *
   * <p>Updates a pipeline with the supplied configuration.
   */
  public void update(EditPipeline request) {
    impl.update(request);
  }

  public PipelinesService impl() {
    return impl;
  }
}
