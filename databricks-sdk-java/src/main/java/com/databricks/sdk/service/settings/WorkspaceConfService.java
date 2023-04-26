// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import java.util.Map;

/**
 * This API allows updating known workspace settings for advanced users.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface WorkspaceConfService {
  /**
   * Check configuration status.
   *
   * <p>Gets the configuration status for a workspace.
   *
   * @param getStatusRequest a {@link com.databricks.sdk.service.settings.GetStatusRequest} object
   * @return a {@link java.util.Map} object
   */
  Map<String, String> getStatus(GetStatusRequest getStatusRequest);

  /**
   * Enable/disable features.
   *
   * <p>Sets the configuration status for a workspace, including enabling or disabling it.
   *
   * @param workspaceConf a {@link java.util.Map} object
   */
  void setStatus(Map<String, String> workspaceConf);
}
