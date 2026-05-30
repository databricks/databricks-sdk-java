// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** [description] */
@Generated
public class FeatureEngineeringAPI {
  private static final Logger LOG = LoggerFactory.getLogger(FeatureEngineeringAPI.class);

  private final FeatureEngineeringService impl;

  /** Regular-use constructor */
  public FeatureEngineeringAPI(ApiClient apiClient) {
    impl = new FeatureEngineeringImpl(apiClient);
  }

  /** Constructor for mocks */
  public FeatureEngineeringAPI(FeatureEngineeringService mock) {
    impl = mock;
  }

  /** Batch create materialized features. */
  public BatchCreateMaterializedFeaturesResponse batchCreateMaterializedFeatures(
      BatchCreateMaterializedFeaturesRequest request) {
    return impl.batchCreateMaterializedFeatures(request);
  }

  /** Create a Feature. */
  public Feature createFeature(CreateFeatureRequest request) {
    return impl.createFeature(request);
  }

  /**
   * Create a Kafka config. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  public KafkaConfig createKafkaConfig(CreateKafkaConfigRequest request) {
    return impl.createKafkaConfig(request);
  }

  /** Create a materialized feature. */
  public MaterializedFeature createMaterializedFeature(CreateMaterializedFeatureRequest request) {
    return impl.createMaterializedFeature(request);
  }

  /** Create a Stream, a governed UC entity representing an external streaming data source. */
  public Stream createStream(CreateStreamRequest request) {
    return impl.createStream(request);
  }

  public void deleteFeature(String fullName) {
    deleteFeature(new DeleteFeatureRequest().setFullName(fullName));
  }

  /** Delete a Feature. */
  public void deleteFeature(DeleteFeatureRequest request) {
    impl.deleteFeature(request);
  }

  public void deleteKafkaConfig(String name) {
    deleteKafkaConfig(new DeleteKafkaConfigRequest().setName(name));
  }

  /**
   * Delete a Kafka config. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  public void deleteKafkaConfig(DeleteKafkaConfigRequest request) {
    impl.deleteKafkaConfig(request);
  }

  public void deleteMaterializedFeature(String materializedFeatureId) {
    deleteMaterializedFeature(
        new DeleteMaterializedFeatureRequest().setMaterializedFeatureId(materializedFeatureId));
  }

  /** Delete a materialized feature. */
  public void deleteMaterializedFeature(DeleteMaterializedFeatureRequest request) {
    impl.deleteMaterializedFeature(request);
  }

  public void deleteStream(String name) {
    deleteStream(new DeleteStreamRequest().setName(name));
  }

  /** Delete a Stream by its full three-part name (catalog.schema.stream). */
  public void deleteStream(DeleteStreamRequest request) {
    impl.deleteStream(request);
  }

  public Feature getFeature(String fullName) {
    return getFeature(new GetFeatureRequest().setFullName(fullName));
  }

  /** Get a Feature. */
  public Feature getFeature(GetFeatureRequest request) {
    return impl.getFeature(request);
  }

  public KafkaConfig getKafkaConfig(String name) {
    return getKafkaConfig(new GetKafkaConfigRequest().setName(name));
  }

  /**
   * Get a Kafka config. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  public KafkaConfig getKafkaConfig(GetKafkaConfigRequest request) {
    return impl.getKafkaConfig(request);
  }

  public MaterializedFeature getMaterializedFeature(String materializedFeatureId) {
    return getMaterializedFeature(
        new GetMaterializedFeatureRequest().setMaterializedFeatureId(materializedFeatureId));
  }

  /** Get a materialized feature. */
  public MaterializedFeature getMaterializedFeature(GetMaterializedFeatureRequest request) {
    return impl.getMaterializedFeature(request);
  }

  public Stream getStream(String name) {
    return getStream(new GetStreamRequest().setName(name));
  }

  /** Get a Stream by its full three-part name (catalog.schema.stream). */
  public Stream getStream(GetStreamRequest request) {
    return impl.getStream(request);
  }

  public Iterable<Feature> listFeatures(String catalogName, String schemaName) {
    return listFeatures(
        new ListFeaturesRequest().setCatalogName(catalogName).setSchemaName(schemaName));
  }

  /** List Features. */
  public Iterable<Feature> listFeatures(ListFeaturesRequest request) {
    return new Paginator<>(
        request,
        impl::listFeatures,
        ListFeaturesResponse::getFeatures,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * List Kafka configs. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  public Iterable<KafkaConfig> listKafkaConfigs(ListKafkaConfigsRequest request) {
    return new Paginator<>(
        request,
        impl::listKafkaConfigs,
        ListKafkaConfigsResponse::getKafkaConfigs,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** List materialized features. */
  public Iterable<MaterializedFeature> listMaterializedFeatures(
      ListMaterializedFeaturesRequest request) {
    return new Paginator<>(
        request,
        impl::listMaterializedFeatures,
        ListMaterializedFeaturesResponse::getMaterializedFeatures,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** List Streams under a given catalog.schema parent. */
  public Iterable<Stream> listStreams(ListStreamsRequest request) {
    return new Paginator<>(
        request,
        impl::listStreams,
        ListStreamsResponse::getStreams,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Update a Feature. */
  public Feature updateFeature(UpdateFeatureRequest request) {
    return impl.updateFeature(request);
  }

  /**
   * Update a Kafka config. During PrPr, Kafka configs can be read and used when creating features
   * under the entire metastore. Only the creator of the Kafka config can delete it.
   */
  public KafkaConfig updateKafkaConfig(UpdateKafkaConfigRequest request) {
    return impl.updateKafkaConfig(request);
  }

  /** Update a materialized feature (pause/resume). */
  public MaterializedFeature updateMaterializedFeature(UpdateMaterializedFeatureRequest request) {
    return impl.updateMaterializedFeature(request);
  }

  /** Update a Stream. Only fields listed in `update_mask` are mutated. */
  public Stream updateStream(UpdateStreamRequest request) {
    return impl.updateStream(request);
  }

  public FeatureEngineeringService impl() {
    return impl;
  }
}
