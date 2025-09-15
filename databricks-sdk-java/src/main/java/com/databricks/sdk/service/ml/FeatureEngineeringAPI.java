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

  /** Create a Feature. */
  public Feature createFeature(CreateFeatureRequest request) {
    return impl.createFeature(request);
  }

  public void deleteFeature(String fullName) {
    deleteFeature(new DeleteFeatureRequest().setFullName(fullName));
  }

  /** Delete a Feature. */
  public void deleteFeature(DeleteFeatureRequest request) {
    impl.deleteFeature(request);
  }

  public Feature getFeature(String fullName) {
    return getFeature(new GetFeatureRequest().setFullName(fullName));
  }

  /** Get a Feature. */
  public Feature getFeature(GetFeatureRequest request) {
    return impl.getFeature(request);
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

  /** Update a Feature. */
  public Feature updateFeature(UpdateFeatureRequest request) {
    return impl.updateFeature(request);
  }

  public FeatureEngineeringService impl() {
    return impl;
  }
}
