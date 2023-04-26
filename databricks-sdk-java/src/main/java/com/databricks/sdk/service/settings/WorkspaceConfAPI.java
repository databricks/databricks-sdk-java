// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.client.ApiClient;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This API allows updating known workspace settings for advanced users.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class WorkspaceConfAPI {
  private static final Logger LOG = LoggerFactory.getLogger(WorkspaceConfAPI.class);

  private final WorkspaceConfService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public WorkspaceConfAPI(ApiClient apiClient) {
    impl = new WorkspaceConfImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.settings.WorkspaceConfService} object
   */
  public WorkspaceConfAPI(WorkspaceConfService mock) {
    impl = mock;
  }

  /**
   * <p>getStatus.</p>
   *
   * @param keys a {@link java.lang.String} object
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getStatus(String keys) {
    return getStatus(new GetStatusRequest().setKeys(keys));
  }

  /**
   * Check configuration status.
   *
   * <p>Gets the configuration status for a workspace.
   *
   * @param request a {@link com.databricks.sdk.service.settings.GetStatusRequest} object
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getStatus(GetStatusRequest request) {
    return impl.getStatus(request);
  }

  /**
   * Enable/disable features.
   *
   * <p>Sets the configuration status for a workspace, including enabling or disabling it.
   *
   * @param request a {@link java.util.Map} object
   */
  public void setStatus(Map<String, String> request) {
    impl.setStatus(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.settings.WorkspaceConfService} object
   */
  public WorkspaceConfService impl() {
    return impl;
  }
}
