// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * Feature Engineering provides APIs for managing features and materialized features.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface FeatureEngineeringService {
  /** Backfill features. */
  Operation backfillFeatures(BackfillFeaturesRequest backfillFeaturesRequest);

  /** Batch create materialized features. */
  BatchCreateMaterializedFeaturesResponse batchCreateMaterializedFeatures(
      BatchCreateMaterializedFeaturesRequest batchCreateMaterializedFeaturesRequest);

  /** Cancel an operation. */
  void cancelOperation(CancelOperationRequest cancelOperationRequest);

  /** Create a Feature. */
  Feature createFeature(CreateFeatureRequest createFeatureRequest);

  /** Create a feature spec. */
  FeatureSpec createFeatureSpec(CreateFeatureSpecRequest createFeatureSpecRequest);

  /**
   * Create a Kafka config. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  KafkaConfig createKafkaConfig(CreateKafkaConfigRequest createKafkaConfigRequest);

  /** Create a materialization set. */
  Operation createMaterializationSet(
      CreateMaterializationSetRequest createMaterializationSetRequest);

  /** Create a materialized feature. */
  MaterializedFeature createMaterializedFeature(
      CreateMaterializedFeatureRequest createMaterializedFeatureRequest);

  /** Create a Stream, a governed UC entity representing an external streaming data source. */
  Stream createStream(CreateStreamRequest createStreamRequest);

  /** Delete a Feature. */
  void deleteFeature(DeleteFeatureRequest deleteFeatureRequest);

  /** Delete a feature spec. */
  void deleteFeatureSpec(DeleteFeatureSpecRequest deleteFeatureSpecRequest);

  /**
   * Delete a Kafka config. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  void deleteKafkaConfig(DeleteKafkaConfigRequest deleteKafkaConfigRequest);

  /**
   * Delete a materialization set and every materialized feature in it. The set is gone afterwards,
   * so a later read returns NOT_FOUND and the set id is free to use again.
   */
  Operation deleteMaterializationSet(
      DeleteMaterializationSetRequest deleteMaterializationSetRequest);

  /** Delete a materialized feature. */
  void deleteMaterializedFeature(DeleteMaterializedFeatureRequest deleteMaterializedFeatureRequest);

  /** Delete a Stream by its full three-part name (catalog.schema.stream). */
  void deleteStream(DeleteStreamRequest deleteStreamRequest);

  /** Get a Feature. */
  Feature getFeature(GetFeatureRequest getFeatureRequest);

  /** Get a feature spec. */
  FeatureSpec getFeatureSpec(GetFeatureSpecRequest getFeatureSpecRequest);

  /**
   * Get a Kafka config. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  KafkaConfig getKafkaConfig(GetKafkaConfigRequest getKafkaConfigRequest);

  /**
   * Get a materialization set and the materialized features in it. A set whose materialized feature
   * members have all been deleted is returned with an empty member list.
   */
  MaterializationSet getMaterializationSet(
      GetMaterializationSetRequest getMaterializationSetRequest);

  /** Get a materialized feature. */
  MaterializedFeature getMaterializedFeature(
      GetMaterializedFeatureRequest getMaterializedFeatureRequest);

  /** Get an operation. */
  Operation getOperation(GetOperationRequest getOperationRequest);

  /** Get a Stream by its full three-part name (catalog.schema.stream). */
  Stream getStream(GetStreamRequest getStreamRequest);

  /** List Features. */
  ListFeaturesResponse listFeatures(ListFeaturesRequest listFeaturesRequest);

  /**
   * List Kafka configs. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  ListKafkaConfigsResponse listKafkaConfigs(ListKafkaConfigsRequest listKafkaConfigsRequest);

  /** List materialized features. */
  ListMaterializedFeaturesResponse listMaterializedFeatures(
      ListMaterializedFeaturesRequest listMaterializedFeaturesRequest);

  /** List Streams under a given catalog.schema parent. */
  ListStreamsResponse listStreams(ListStreamsRequest listStreamsRequest);

  /** Purge materialized feature values for specified entities. */
  Operation purgeFeatureEntities(PurgeFeatureEntitiesRequest purgeFeatureEntitiesRequest);

  /**
   * Requests materialization of all members of the set. The set must be nonempty and contain only
   * batch materializations. Runs are allowed while automatic scheduling is paused. Requested runs
   * may wait in a queue, subject to queue limits and expiry.
   *
   * <p>Returns a long-running operation that completes when every requested run reaches a terminal
   * state. Success requires all runs and any required online synchronization to succeed. Individual
   * outcomes are available in `MaterializationSetTriggerProgress`.
   *
   * <p>Use `CancelOperation` to request cancellation of this operation's unfinished work.
   * Cancellation is best effort and does not undo completed writes. Online synchronization already
   * in progress may continue.
   *
   * <p>Runs use the features' configured windows and settling delay.
   */
  Operation triggerMaterializationSet(
      TriggerMaterializationSetRequest triggerMaterializationSetRequest);

  /** Update a Feature. */
  Feature updateFeature(UpdateFeatureRequest updateFeatureRequest);

  /**
   * Update a Kafka config. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  KafkaConfig updateKafkaConfig(UpdateKafkaConfigRequest updateKafkaConfigRequest);

  /**
   * Updates a materialization set. Supports changing pause settings and deleting materialized
   * features from the set.
   *
   * <p>Changes are not atomic. Some updates or deletions may succeed even if the operation fails.
   * Individual outcomes are available in `MaterializationSetUpdateProgress`.
   */
  Operation updateMaterializationSet(
      UpdateMaterializationSetRequest updateMaterializationSetRequest);

  /** Updates a materialized feature. */
  MaterializedFeature updateMaterializedFeature(
      UpdateMaterializedFeatureRequest updateMaterializedFeatureRequest);

  /** Update a Stream. Only fields listed in `update_mask` are mutated. */
  Stream updateStream(UpdateStreamRequest updateStreamRequest);
}
