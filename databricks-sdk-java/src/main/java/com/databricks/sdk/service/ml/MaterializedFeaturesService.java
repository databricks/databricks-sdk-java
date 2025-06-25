// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * Materialized Features are columns in tables and views that can be directly used as features to
 * train and serve ML models.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface MaterializedFeaturesService {
  /** Creates a FeatureTag. */
  FeatureTag createFeatureTag(CreateFeatureTagRequest createFeatureTagRequest);

  /** Deletes a FeatureTag. */
  void deleteFeatureTag(DeleteFeatureTagRequest deleteFeatureTagRequest);

  /** Get Feature Lineage. */
  FeatureLineage getFeatureLineage(GetFeatureLineageRequest getFeatureLineageRequest);

  /** Gets a FeatureTag. */
  FeatureTag getFeatureTag(GetFeatureTagRequest getFeatureTagRequest);

  /** Lists FeatureTags. */
  ListFeatureTagsResponse listFeatureTags(ListFeatureTagsRequest listFeatureTagsRequest);

  /** Updates a FeatureTag. */
  FeatureTag updateFeatureTag(UpdateFeatureTagRequest updateFeatureTagRequest);
}
