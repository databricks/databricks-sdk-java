// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Warehouse to be selected by default for users in this workspace. Covers SQL workloads only and
 * can be overridden by users.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DefaultWarehouseIdService {
  /** Reverts the Default Warehouse Id setting to its default value. */
  DeleteDefaultWarehouseIdResponse delete(
      DeleteDefaultWarehouseIdRequest deleteDefaultWarehouseIdRequest);

  /** Gets the Default Warehouse Id setting. */
  DefaultWarehouseId get(GetDefaultWarehouseIdRequest getDefaultWarehouseIdRequest);

  /** Updates the Default Warehouse Id setting. */
  DefaultWarehouseId update(UpdateDefaultWarehouseIdRequest updateDefaultWarehouseIdRequest);
}
