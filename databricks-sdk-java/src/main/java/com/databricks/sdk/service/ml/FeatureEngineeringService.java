// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * [description]
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface FeatureEngineeringService {
  /** Batch create materialized features. */
  BatchCreateMaterializedFeaturesResponse batchCreateMaterializedFeatures(
      BatchCreateMaterializedFeaturesRequest batchCreateMaterializedFeaturesRequest);

  /** Create a Feature. */
  Feature createFeature(CreateFeatureRequest createFeatureRequest);

  /**
   * Create a Kafka config. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  KafkaConfig createKafkaConfig(CreateKafkaConfigRequest createKafkaConfigRequest);

  /** Create a materialized feature. */
  MaterializedFeature createMaterializedFeature(
      CreateMaterializedFeatureRequest createMaterializedFeatureRequest);

  /** Create a Stream, a governed UC entity representing an external streaming data source. */
  Stream createStream(CreateStreamRequest createStreamRequest);

  /** Delete a Feature. */
  void deleteFeature(DeleteFeatureRequest deleteFeatureRequest);

  /**
   * Delete a Kafka config. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  void deleteKafkaConfig(DeleteKafkaConfigRequest deleteKafkaConfigRequest);

  /** Delete a materialized feature. */
  void deleteMaterializedFeature(DeleteMaterializedFeatureRequest deleteMaterializedFeatureRequest);

  /** Delete a Stream by its full three-part name (catalog.schema.stream). */
  void deleteStream(DeleteStreamRequest deleteStreamRequest);

  /** Get a Feature. */
  Feature getFeature(GetFeatureRequest getFeatureRequest);

  /**
   * Get a Kafka config. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  KafkaConfig getKafkaConfig(GetKafkaConfigRequest getKafkaConfigRequest);

  /** Get a materialized feature. */
  MaterializedFeature getMaterializedFeature(
      GetMaterializedFeatureRequest getMaterializedFeatureRequest);

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

  /** Update a Feature. */
  Feature updateFeature(UpdateFeatureRequest updateFeatureRequest);

  /**
   * Update a Kafka config. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  KafkaConfig updateKafkaConfig(UpdateKafkaConfigRequest updateKafkaConfigRequest);

  /** Update a materialized feature (pause/resume). */
  MaterializedFeature updateMaterializedFeature(
      UpdateMaterializedFeatureRequest updateMaterializedFeatureRequest);

  /** Update a Stream. Only fields listed in `update_mask` are mutated. */
  Stream updateStream(UpdateStreamRequest updateStreamRequest);
}
