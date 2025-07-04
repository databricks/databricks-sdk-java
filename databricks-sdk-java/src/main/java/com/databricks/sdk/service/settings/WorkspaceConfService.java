// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import java.util.Map;

/**
 * This API allows updating known workspace settings for advanced users.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface WorkspaceConfService {
  /** Gets the configuration status for a workspace. */
  Map<String, String> getStatus(GetStatusRequest getStatusRequest);

  /** Sets the configuration status for a workspace, including enabling or disabling it. */
  void setStatus(Map<String, String> workspaceConf);
}
