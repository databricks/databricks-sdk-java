// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** This API allows updating known workspace settings for advanced users. */
@Generated
public class WorkspaceConfAPI {
  private static final Logger LOG = LoggerFactory.getLogger(WorkspaceConfAPI.class);

  private final WorkspaceConfService impl;

  /** Regular-use constructor */
  public WorkspaceConfAPI(ApiClient apiClient) {
    impl = new WorkspaceConfImpl(apiClient);
  }

  /** Constructor for mocks */
  public WorkspaceConfAPI(WorkspaceConfService mock) {
    impl = mock;
  }

  public Map<String, String> getStatus(String keys) {
    return getStatus(new GetStatusRequest().setKeys(keys));
  }

  /**
   * Check configuration status.
   *
   * <p>Gets the configuration status for a workspace.
   */
  public Map<String, String> getStatus(GetStatusRequest request) {
    return impl.getStatus(request);
  }

  /**
   * Enable/disable features.
   *
   * <p>Sets the configuration status for a workspace, including enabling or disabling it.
   */
  public SetStatusResponse setStatus(Map<String, String> request) {
    return impl.setStatus(request);
  }

  public WorkspaceConfService impl() {
    return impl;
  }
}
