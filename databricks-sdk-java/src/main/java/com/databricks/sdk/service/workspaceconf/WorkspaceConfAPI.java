// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspaceconf;

import com.databricks.sdk.client.ApiClient;
import java.util.Map;
import org.apache.http.client.methods.*;

/** This API allows updating known workspace settings for advanced users. */
public class WorkspaceConfAPI {
  private final WorkspaceConfService impl;

  /** Regular-use constructor */
  public WorkspaceConfAPI(ApiClient apiClient) {
    impl = new WorkspaceConfImpl(apiClient);
  }

  /** Constructor for mocks */
  public WorkspaceConfAPI(WorkspaceConfService mock) {
    impl = mock;
  }

  /**
   * Check configuration status.
   *
   * <p>Gets the configuration status for a workspace.
   */
  public Map<String, String> getStatus(GetStatus request) {
    return impl.getStatus(request);
  }

  /**
   * Enable/disable features.
   *
   * <p>Sets the configuration status for a workspace, including enabling or disabling it.
   */
  public void setStatus(Map<String, String> request) {
    impl.setStatus(request);
  }

  public WorkspaceConfService impl() {
    return impl;
  }
}
