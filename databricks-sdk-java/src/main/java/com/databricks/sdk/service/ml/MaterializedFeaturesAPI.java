// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Materialized Features are columns in tables and views that can be directly used as features to
 * train and serve ML models.
 */
@Generated
public class MaterializedFeaturesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(MaterializedFeaturesAPI.class);

  private final MaterializedFeaturesService impl;

  /** Regular-use constructor */
  public MaterializedFeaturesAPI(ApiClient apiClient) {
    impl = new MaterializedFeaturesImpl(apiClient);
  }

  /** Constructor for mocks */
  public MaterializedFeaturesAPI(MaterializedFeaturesService mock) {
    impl = mock;
  }

  /** Creates a FeatureTag. */
  public FeatureTag createFeatureTag(CreateFeatureTagRequest request) {
    return impl.createFeatureTag(request);
  }

  public void deleteFeatureTag(String tableName, String featureName, String key) {
    deleteFeatureTag(
        new DeleteFeatureTagRequest()
            .setTableName(tableName)
            .setFeatureName(featureName)
            .setKey(key));
  }

  /** Deletes a FeatureTag. */
  public void deleteFeatureTag(DeleteFeatureTagRequest request) {
    impl.deleteFeatureTag(request);
  }

  public FeatureLineage getFeatureLineage(String tableName, String featureName) {
    return getFeatureLineage(
        new GetFeatureLineageRequest().setTableName(tableName).setFeatureName(featureName));
  }

  /** Get Feature Lineage. */
  public FeatureLineage getFeatureLineage(GetFeatureLineageRequest request) {
    return impl.getFeatureLineage(request);
  }

  public FeatureTag getFeatureTag(String tableName, String featureName, String key) {
    return getFeatureTag(
        new GetFeatureTagRequest().setTableName(tableName).setFeatureName(featureName).setKey(key));
  }

  /** Gets a FeatureTag. */
  public FeatureTag getFeatureTag(GetFeatureTagRequest request) {
    return impl.getFeatureTag(request);
  }

  public Iterable<FeatureTag> listFeatureTags(String tableName, String featureName) {
    return listFeatureTags(
        new ListFeatureTagsRequest().setTableName(tableName).setFeatureName(featureName));
  }

  /** Lists FeatureTags. */
  public Iterable<FeatureTag> listFeatureTags(ListFeatureTagsRequest request) {
    return new Paginator<>(
        request,
        impl::listFeatureTags,
        ListFeatureTagsResponse::getFeatureTags,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Updates a FeatureTag. */
  public FeatureTag updateFeatureTag(UpdateFeatureTagRequest request) {
    return impl.updateFeatureTag(request);
  }

  public MaterializedFeaturesService impl() {
    return impl;
  }
}
