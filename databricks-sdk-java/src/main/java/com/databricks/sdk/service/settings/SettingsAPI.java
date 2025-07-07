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

  private DashboardEmailSubscriptionsAPI dashboardEmailSubscriptionsAPI;

  private DefaultNamespaceAPI defaultNamespaceAPI;

  private DefaultWarehouseIdAPI defaultWarehouseIdAPI;

  private DisableLegacyAccessAPI disableLegacyAccessAPI;

  private DisableLegacyDbfsAPI disableLegacyDbfsAPI;

  private EnableExportNotebookAPI enableExportNotebookAPI;

  private EnableNotebookTableClipboardAPI enableNotebookTableClipboardAPI;

  private EnableResultsDownloadingAPI enableResultsDownloadingAPI;

  private EnhancedSecurityMonitoringAPI enhancedSecurityMonitoringAPI;

  private LlmProxyPartnerPoweredWorkspaceAPI llmProxyPartnerPoweredWorkspaceAPI;

  private RestrictWorkspaceAdminsAPI restrictWorkspaceAdminsAPI;

  private SqlResultsDownloadAPI sqlResultsDownloadAPI;

  /** Regular-use constructor */
  public SettingsAPI(ApiClient apiClient) {
    impl = new SettingsImpl(apiClient);

    aibiDashboardEmbeddingAccessPolicyAPI = new AibiDashboardEmbeddingAccessPolicyAPI(apiClient);

    aibiDashboardEmbeddingApprovedDomainsAPI =
        new AibiDashboardEmbeddingApprovedDomainsAPI(apiClient);

    automaticClusterUpdateAPI = new AutomaticClusterUpdateAPI(apiClient);

    complianceSecurityProfileAPI = new ComplianceSecurityProfileAPI(apiClient);

    dashboardEmailSubscriptionsAPI = new DashboardEmailSubscriptionsAPI(apiClient);

    defaultNamespaceAPI = new DefaultNamespaceAPI(apiClient);

    defaultWarehouseIdAPI = new DefaultWarehouseIdAPI(apiClient);

    disableLegacyAccessAPI = new DisableLegacyAccessAPI(apiClient);

    disableLegacyDbfsAPI = new DisableLegacyDbfsAPI(apiClient);

    enableExportNotebookAPI = new EnableExportNotebookAPI(apiClient);

    enableNotebookTableClipboardAPI = new EnableNotebookTableClipboardAPI(apiClient);

    enableResultsDownloadingAPI = new EnableResultsDownloadingAPI(apiClient);

    enhancedSecurityMonitoringAPI = new EnhancedSecurityMonitoringAPI(apiClient);

    llmProxyPartnerPoweredWorkspaceAPI = new LlmProxyPartnerPoweredWorkspaceAPI(apiClient);

    restrictWorkspaceAdminsAPI = new RestrictWorkspaceAdminsAPI(apiClient);

    sqlResultsDownloadAPI = new SqlResultsDownloadAPI(apiClient);
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
   * Controls whether schedules or workload tasks for refreshing AI/BI Dashboards in the workspace
   * can send subscription emails containing PDFs and/or images of the dashboard.
   */
  public DashboardEmailSubscriptionsAPI DashboardEmailSubscriptions() {
    return dashboardEmailSubscriptionsAPI;
  }

  /**
   * The default namespace setting API allows users to configure the default namespace for a
   * Databricks workspace.
   */
  public DefaultNamespaceAPI DefaultNamespace() {
    return defaultNamespaceAPI;
  }

  /** Warehouse to be selected by default for users in this workspace. */
  public DefaultWarehouseIdAPI DefaultWarehouseId() {
    return defaultWarehouseIdAPI;
  }

  /** 'Disabling legacy access' has the following impacts: 1. */
  public DisableLegacyAccessAPI DisableLegacyAccess() {
    return disableLegacyAccessAPI;
  }

  /** Disabling legacy DBFS has the following implications: 1. */
  public DisableLegacyDbfsAPI DisableLegacyDbfs() {
    return disableLegacyDbfsAPI;
  }

  /** Controls whether users can export notebooks and files from the Workspace UI. */
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

  /** Determines if partner powered models are enabled or not for a specific workspace. */
  public LlmProxyPartnerPoweredWorkspaceAPI LlmProxyPartnerPoweredWorkspace() {
    return llmProxyPartnerPoweredWorkspaceAPI;
  }

  /**
   * The Restrict Workspace Admins setting lets you control the capabilities of workspace admins.
   */
  public RestrictWorkspaceAdminsAPI RestrictWorkspaceAdmins() {
    return restrictWorkspaceAdminsAPI;
  }

  /**
   * Controls whether users within the workspace are allowed to download results from the SQL Editor
   * and AI/BI Dashboards UIs.
   */
  public SqlResultsDownloadAPI SqlResultsDownload() {
    return sqlResultsDownloadAPI;
  }

  public SettingsService impl() {
    return impl;
  }
}
