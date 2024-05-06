// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Workspace Settings API allows users to manage settings at the workspace level. */
@Generated
public class SettingsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SettingsAPI.class);

  private final SettingsService impl;

  private AutomaticClusterUpdateAPI automaticClusterUpdateAPI;

  private ComplianceSecurityProfileAPI complianceSecurityProfileAPI;

  private DefaultNamespaceAPI defaultNamespaceAPI;

  private EnhancedSecurityMonitoringAPI enhancedSecurityMonitoringAPI;

  private RestrictWorkspaceAdminsAPI restrictWorkspaceAdminsAPI;

  /** Regular-use constructor */
  public SettingsAPI(ApiClient apiClient) {
    impl = new SettingsImpl(apiClient);

    automaticClusterUpdateAPI = new AutomaticClusterUpdateAPI(apiClient);

    complianceSecurityProfileAPI = new ComplianceSecurityProfileAPI(apiClient);

    defaultNamespaceAPI = new DefaultNamespaceAPI(apiClient);

    enhancedSecurityMonitoringAPI = new EnhancedSecurityMonitoringAPI(apiClient);

    restrictWorkspaceAdminsAPI = new RestrictWorkspaceAdminsAPI(apiClient);
  }

  /** Constructor for mocks */
  public SettingsAPI(SettingsService mock) {
    impl = mock;
  }

  /** Controls whether automatic cluster update is enabled for the current workspace. */
  public AutomaticClusterUpdateAPI AutomaticClusterUpdate() {
    return automaticClusterUpdateAPI;
  }

  /** Controls whether to enable the compliance security profile for the current workspace. */
  public ComplianceSecurityProfileAPI ComplianceSecurityProfile() {
    return complianceSecurityProfileAPI;
  }

  /**
   * The default namespace setting API allows users to configure the default namespace for a
   * Databricks workspace.
   */
  public DefaultNamespaceAPI DefaultNamespace() {
    return defaultNamespaceAPI;
  }

  /** Controls whether enhanced security monitoring is enabled for the current workspace. */
  public EnhancedSecurityMonitoringAPI EnhancedSecurityMonitoring() {
    return enhancedSecurityMonitoringAPI;
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
