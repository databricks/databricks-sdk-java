// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * A feature store is a centralized repository that enables data scientists to find and share
 * features. Using a feature store also ensures that the code used to compute feature values is the
 * same during model training and when the model is used for inference.
 *
 * <p>An online store is a low-latency database used for feature lookup during real-time model
 * inference or serve feature for real-time applications.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface FeatureStoreService {
  /** Create an Online Feature Store. */
  OnlineStore createOnlineStore(CreateOnlineStoreRequest createOnlineStoreRequest);

  /** Delete an Online Feature Store. */
  void deleteOnlineStore(DeleteOnlineStoreRequest deleteOnlineStoreRequest);

  /** Delete online table. */
  void deleteOnlineTable(DeleteOnlineTableRequest deleteOnlineTableRequest);

  /** Get an Online Feature Store. */
  OnlineStore getOnlineStore(GetOnlineStoreRequest getOnlineStoreRequest);

  /** List Online Feature Stores. */
  ListOnlineStoresResponse listOnlineStores(ListOnlineStoresRequest listOnlineStoresRequest);

  /** Publish features. */
  PublishTableResponse publishTable(PublishTableRequest publishTableRequest);

  /** Update an Online Feature Store. */
  OnlineStore updateOnlineStore(UpdateOnlineStoreRequest updateOnlineStoreRequest);
}
