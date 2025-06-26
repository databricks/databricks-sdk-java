// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A feature store is a centralized repository that enables data scientists to find and share
 * features. Using a feature store also ensures that the code used to compute feature values is the
 * same during model training and when the model is used for inference.
 *
 * <p>An online store is a low-latency database used for feature lookup during real-time model
 * inference or serve feature for real-time applications.
 */
@Generated
public class FeatureStoreAPI {
  private static final Logger LOG = LoggerFactory.getLogger(FeatureStoreAPI.class);

  private final FeatureStoreService impl;

  /** Regular-use constructor */
  public FeatureStoreAPI(ApiClient apiClient) {
    impl = new FeatureStoreImpl(apiClient);
  }

  /** Constructor for mocks */
  public FeatureStoreAPI(FeatureStoreService mock) {
    impl = mock;
  }

  public OnlineStore createOnlineStore(OnlineStore onlineStore) {
    return createOnlineStore(new CreateOnlineStoreRequest().setOnlineStore(onlineStore));
  }

  /** Create an Online Feature Store. */
  public OnlineStore createOnlineStore(CreateOnlineStoreRequest request) {
    return impl.createOnlineStore(request);
  }

  public void deleteOnlineStore(String name) {
    deleteOnlineStore(new DeleteOnlineStoreRequest().setName(name));
  }

  /** Delete an Online Feature Store. */
  public void deleteOnlineStore(DeleteOnlineStoreRequest request) {
    impl.deleteOnlineStore(request);
  }

  public OnlineStore getOnlineStore(String name) {
    return getOnlineStore(new GetOnlineStoreRequest().setName(name));
  }

  /** Get an Online Feature Store. */
  public OnlineStore getOnlineStore(GetOnlineStoreRequest request) {
    return impl.getOnlineStore(request);
  }

  /** List Online Feature Stores. */
  public Iterable<OnlineStore> listOnlineStores(ListOnlineStoresRequest request) {
    return new Paginator<>(
        request,
        impl::listOnlineStores,
        ListOnlineStoresResponse::getOnlineStores,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public PublishTableResponse publishTable(String sourceTableName, PublishSpec publishSpec) {
    return publishTable(
        new PublishTableRequest().setSourceTableName(sourceTableName).setPublishSpec(publishSpec));
  }

  /** Publish features. */
  public PublishTableResponse publishTable(PublishTableRequest request) {
    return impl.publishTable(request);
  }

  public OnlineStore updateOnlineStore(String name, OnlineStore onlineStore, String updateMask) {
    return updateOnlineStore(
        new UpdateOnlineStoreRequest()
            .setName(name)
            .setOnlineStore(onlineStore)
            .setUpdateMask(updateMask));
  }

  /** Update an Online Feature Store. */
  public OnlineStore updateOnlineStore(UpdateOnlineStoreRequest request) {
    return impl.updateOnlineStore(request);
  }

  public FeatureStoreService impl() {
    return impl;
  }
}
