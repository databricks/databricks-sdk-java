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
  /** Create a Feature. */
  Feature createFeature(CreateFeatureRequest createFeatureRequest);

  /** Create a materialized feature. */
  MaterializedFeature createMaterializedFeature(
      CreateMaterializedFeatureRequest createMaterializedFeatureRequest);

  /** Delete a Feature. */
  void deleteFeature(DeleteFeatureRequest deleteFeatureRequest);

  /** Delete a materialized feature. */
  void deleteMaterializedFeature(DeleteMaterializedFeatureRequest deleteMaterializedFeatureRequest);

  /** Get a Feature. */
  Feature getFeature(GetFeatureRequest getFeatureRequest);

  /** Get a materialized feature. */
  MaterializedFeature getMaterializedFeature(
      GetMaterializedFeatureRequest getMaterializedFeatureRequest);

  /** List Features. */
  ListFeaturesResponse listFeatures(ListFeaturesRequest listFeaturesRequest);

  /** List materialized features. */
  ListMaterializedFeaturesResponse listMaterializedFeatures(
      ListMaterializedFeaturesRequest listMaterializedFeaturesRequest);

  /** Update a Feature. */
  Feature updateFeature(UpdateFeatureRequest updateFeatureRequest);

  /** Update a materialized feature (pause/resume). */
  MaterializedFeature updateMaterializedFeature(
      UpdateMaterializedFeatureRequest updateMaterializedFeatureRequest);
}
