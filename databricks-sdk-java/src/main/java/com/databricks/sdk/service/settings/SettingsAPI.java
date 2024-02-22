// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Wrapper for Workspace Settings services */
@Generated
public class SettingsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SettingsAPI.class);

  private final SettingsService impl;

  private DefaultNamespaceAPI defaultNamespaceAPI;

  private RestrictWorkspaceAdminsAPI restrictWorkspaceAdminsAPI;

  /** Regular-use constructor */
  public SettingsAPI(ApiClient apiClient) {
    impl = new SettingsImpl(apiClient);

    defaultNamespaceAPI = new DefaultNamespaceAPI(apiClient);

    restrictWorkspaceAdminsAPI = new RestrictWorkspaceAdminsAPI(apiClient);
  }

  /** Constructor for mocks */
  public SettingsAPI(SettingsService mock) {
    impl = mock;
  }

  /**
   * The default namespace setting API allows users to configure the default namespace for a
   * Databricks workspace.
   */
  public DefaultNamespaceAPI DefaultNamespace() {
    return defaultNamespaceAPI;
  }

  /**
   * The Restrict Workspace Admins setting lets you control the capabilities of workspace admins.
   */
  public RestrictWorkspaceAdminsAPI RestrictWorkspaceAdmins() {
    return restrictWorkspaceAdminsAPI;
  }

  public SettingsService impl() {
    return impl;
  }
}
