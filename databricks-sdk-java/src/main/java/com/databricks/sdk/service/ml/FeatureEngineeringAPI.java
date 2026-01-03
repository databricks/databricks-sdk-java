// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

  public FeatureEngineeringService impl() {
    return impl;
  }
}
