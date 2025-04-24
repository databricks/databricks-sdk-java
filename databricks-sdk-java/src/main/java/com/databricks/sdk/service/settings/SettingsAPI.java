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

  private AibiDashboardEmbeddingAccessPolicyAPI aibiDashboardEmbeddingAccessPolicyAPI;

  private AibiDashboardEmbeddingApprovedDomainsAPI aibiDashboardEmbeddingApprovedDomainsAPI;

  private AutomaticClusterUpdateAPI automaticClusterUpdateAPI;

  private ComplianceSecurityProfileAPI complianceSecurityProfileAPI;

  private DefaultNamespaceAPI defaultNamespaceAPI;

  private DisableLegacyAccessAPI disableLegacyAccessAPI;

  private DisableLegacyDbfsAPI disableLegacyDbfsAPI;

  private EnableExportNotebookAPI enableExportNotebookAPI;

  private EnableNotebookTableClipboardAPI enableNotebookTableClipboardAPI;

  private EnableResultsDownloadingAPI enableResultsDownloadingAPI;

  private EnhancedSecurityMonitoringAPI enhancedSecurityMonitoringAPI;

  private RestrictWorkspaceAdminsAPI restrictWorkspaceAdminsAPI;

  /** Regular-use constructor */
  public SettingsAPI(ApiClient apiClient) {
    impl = new SettingsImpl(apiClient);

    aibiDashboardEmbeddingAccessPolicyAPI = new AibiDashboardEmbeddingAccessPolicyAPI(apiClient);

    aibiDashboardEmbeddingApprovedDomainsAPI =
        new AibiDashboardEmbeddingApprovedDomainsAPI(apiClient);

    automaticClusterUpdateAPI = new AutomaticClusterUpdateAPI(apiClient);

    complianceSecurityProfileAPI = new ComplianceSecurityProfileAPI(apiClient);

    defaultNamespaceAPI = new DefaultNamespaceAPI(apiClient);

    disableLegacyAccessAPI = new DisableLegacyAccessAPI(apiClient);

    disableLegacyDbfsAPI = new DisableLegacyDbfsAPI(apiClient);

    enableExportNotebookAPI = new EnableExportNotebookAPI(apiClient);

    enableNotebookTableClipboardAPI = new EnableNotebookTableClipboardAPI(apiClient);

    enableResultsDownloadingAPI = new EnableResultsDownloadingAPI(apiClient);

    enhancedSecurityMonitoringAPI = new EnhancedSecurityMonitoringAPI(apiClient);

    restrictWorkspaceAdminsAPI = new RestrictWorkspaceAdminsAPI(apiClient);
  }

  /** Constructor for mocks */
  public SettingsAPI(SettingsService mock) {
    impl = mock;
  }

  /**
   * Controls whether AI/BI published dashboard embedding is enabled, conditionally enabled, or
   * disabled at the workspace level.
   */
  public AibiDashboardEmbeddingAccessPolicyAPI AibiDashboardEmbeddingAccessPolicy() {
    return aibiDashboardEmbeddingAccessPolicyAPI;
  }

  /** Controls the list of domains approved to host the embedded AI/BI dashboards. */
  public AibiDashboardEmbeddingApprovedDomainsAPI AibiDashboardEmbeddingApprovedDomains() {
    return aibiDashboardEmbeddingApprovedDomainsAPI;
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

  /** 'Disabling legacy access' has the following impacts: 1. */
  public DisableLegacyAccessAPI DisableLegacyAccess() {
    return disableLegacyAccessAPI;
  }

  /**
   * When this setting is on, access to DBFS root and DBFS mounts is disallowed (as well as creation
   * of new mounts).
   */
  public DisableLegacyDbfsAPI DisableLegacyDbfs() {
    return disableLegacyDbfsAPI;
  }

  /** Controls whether users can export notebooks and files from the Workspace. */
  public EnableExportNotebookAPI EnableExportNotebook() {
    return enableExportNotebookAPI;
  }

  /** Controls whether users can copy tabular data to the clipboard via the UI. */
  public EnableNotebookTableClipboardAPI EnableNotebookTableClipboard() {
    return enableNotebookTableClipboardAPI;
  }

  /** Controls whether users can download notebook results. */
  public EnableResultsDownloadingAPI EnableResultsDownloading() {
    return enableResultsDownloadingAPI;
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
