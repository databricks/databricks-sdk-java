// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;

/**
 * The Lakeflow Spark Declarative Pipelines API allows you to create, edit, delete, start, and view
 * details about pipelines.
 *
 * <p>Spark Declarative Pipelines is a framework for building reliable, maintainable, and testable
 * data processing pipelines. You define the transformations to perform on your data, and Spark
 * Declarative Pipelines manages task orchestration, cluster management, monitoring, data quality,
 * and error handling.
 *
 * <p>Instead of defining your data pipelines using a series of separate Apache Spark tasks, Spark
 * Declarative Pipelines manages how your data is transformed based on a target schema you define
 * for each processing step. You can also enforce data quality with Spark Declarative Pipelines
 * expectations. Expectations allow you to define expected data quality and specify how to handle
 * records that fail those expectations.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PipelinesService {
  /**
   * Creates a new pipeline using Unity Catalog from a pipeline using Hive Metastore. This method
   * returns the ID of the newly created clone. Additionally, this method starts an update for the
   * newly created pipeline.
   */
  ClonePipelineResponse clone(ClonePipelineRequest clonePipelineRequest);

  /**
   * Creates a new data processing pipeline based on the requested configuration. If successful,
   * this method returns the ID of the new pipeline.
   */
  CreatePipelineResponse create(CreatePipeline createPipeline);

  /**
   * Deletes a pipeline. If the pipeline publishes to Unity Catalog, pipeline deletion will cascade
   * to all pipeline tables. Please reach out to Databricks support for assistance to undo this
   * action.
   */
  void delete(DeletePipelineRequest deletePipelineRequest);

  /** Get a pipeline. */
  GetPipelineResponse get(GetPipelineRequest getPipelineRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetPipelinePermissionLevelsResponse getPermissionLevels(
      GetPipelinePermissionLevelsRequest getPipelinePermissionLevelsRequest);

  /**
   * Gets the permissions of a pipeline. Pipelines can inherit permissions from their root object.
   */
  PipelinePermissions getPermissions(GetPipelinePermissionsRequest getPipelinePermissionsRequest);

  /** Gets an update from an active pipeline. */
  GetUpdateResponse getUpdate(GetUpdateRequest getUpdateRequest);

  /** Retrieves events for a pipeline. */
  ListPipelineEventsResponse listPipelineEvents(
      ListPipelineEventsRequest listPipelineEventsRequest);

  /** Lists pipelines defined in the Spark Declarative Pipelines system. */
  ListPipelinesResponse listPipelines(ListPipelinesRequest listPipelinesRequest);

  /** List updates for an active pipeline. */
  ListUpdatesResponse listUpdates(ListUpdatesRequest listUpdatesRequest);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  PipelinePermissions setPermissions(PipelinePermissionsRequest pipelinePermissionsRequest);

  /**
   * Starts a new update for the pipeline. If there is already an active update for the pipeline,
   * the request will fail and the active update will remain running.
   */
  StartUpdateResponse startUpdate(StartUpdate startUpdate);

  /**
   * Stops the pipeline by canceling the active update. If there is no active update for the
   * pipeline, this request is a no-op.
   */
  void stop(StopRequest stopRequest);

  /** Updates a pipeline with the supplied configuration. */
  void update(EditPipeline editPipeline);

  /**
   * Updates the permissions on a pipeline. Pipelines can inherit permissions from their root
   * object.
   */
  PipelinePermissions updatePermissions(PipelinePermissionsRequest pipelinePermissionsRequest);
}
