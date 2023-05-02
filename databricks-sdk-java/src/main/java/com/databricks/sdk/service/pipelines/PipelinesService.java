// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;

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
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PipelinesService {
  /**
   * Create a pipeline.
   *
   * <p>Creates a new data processing pipeline based on the requested configuration. If successful,
   * this method returns the ID of the new pipeline.
   */
  CreatePipelineResponse create(CreatePipeline createPipeline);

  /**
   * Delete a pipeline.
   *
   * <p>Deletes a pipeline.
   */
  void delete(DeletePipelineRequest deletePipelineRequest);

  /** Get a pipeline. */
  GetPipelineResponse get(GetPipelineRequest getPipelineRequest);

  /**
   * Get a pipeline update.
   *
   * <p>Gets an update from an active pipeline.
   */
  GetUpdateResponse getUpdate(GetUpdateRequest getUpdateRequest);

  /**
   * List pipeline events.
   *
   * <p>Retrieves events for a pipeline.
   */
  ListPipelineEventsResponse listPipelineEvents(
      ListPipelineEventsRequest listPipelineEventsRequest);

  /**
   * List pipelines.
   *
   * <p>Lists pipelines defined in the Delta Live Tables system.
   */
  ListPipelinesResponse listPipelines(ListPipelinesRequest listPipelinesRequest);

  /**
   * List pipeline updates.
   *
   * <p>List updates for an active pipeline.
   */
  ListUpdatesResponse listUpdates(ListUpdatesRequest listUpdatesRequest);

  /**
   * Reset a pipeline.
   *
   * <p>Resets a pipeline.
   */
  void reset(ResetRequest resetRequest);

  /**
   * Queue a pipeline update.
   *
   * <p>Starts or queues a pipeline update.
   */
  StartUpdateResponse startUpdate(StartUpdate startUpdate);

  /**
   * Stop a pipeline.
   *
   * <p>Stops a pipeline.
   */
  void stop(StopRequest stopRequest);

  /**
   * Edit a pipeline.
   *
   * <p>Updates a pipeline with the supplied configuration.
   */
  void update(EditPipeline editPipeline);
}
