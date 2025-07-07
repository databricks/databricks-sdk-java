// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Warehouse to be selected by default for users in this workspace. Covers SQL workloads only and
 * can be overridden by users.
 */
@Generated
public class DefaultWarehouseIdAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DefaultWarehouseIdAPI.class);

  private final DefaultWarehouseIdService impl;

  /** Regular-use constructor */
  public DefaultWarehouseIdAPI(ApiClient apiClient) {
    impl = new DefaultWarehouseIdImpl(apiClient);
  }

  /** Constructor for mocks */
  public DefaultWarehouseIdAPI(DefaultWarehouseIdService mock) {
    impl = mock;
  }

  /** Reverts the Default Warehouse Id setting to its default value. */
  public DeleteDefaultWarehouseIdResponse delete(DeleteDefaultWarehouseIdRequest request) {
    return impl.delete(request);
  }

  /** Gets the Default Warehouse Id setting. */
  public DefaultWarehouseId get(GetDefaultWarehouseIdRequest request) {
    return impl.get(request);
  }

  public DefaultWarehouseId update(
      boolean allowMissing, DefaultWarehouseId setting, String fieldMask) {
    return update(
        new UpdateDefaultWarehouseIdRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /** Updates the Default Warehouse Id setting. */
  public DefaultWarehouseId update(UpdateDefaultWarehouseIdRequest request) {
    return impl.update(request);
  }

  public DefaultWarehouseIdService impl() {
    return impl;
  }
}
