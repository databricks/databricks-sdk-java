// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.ConfigLoader;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.service.billing.BillableUsageAPI;
import com.databricks.sdk.service.billing.BillableUsageService;
import com.databricks.sdk.service.billing.BudgetsAPI;
import com.databricks.sdk.service.billing.BudgetsService;
import com.databricks.sdk.service.billing.LogDeliveryAPI;
import com.databricks.sdk.service.billing.LogDeliveryService;
import com.databricks.sdk.service.catalog.AccountMetastoreAssignmentsAPI;
import com.databricks.sdk.service.catalog.AccountMetastoreAssignmentsService;
import com.databricks.sdk.service.catalog.AccountMetastoresAPI;
import com.databricks.sdk.service.catalog.AccountMetastoresService;
import com.databricks.sdk.service.catalog.AccountStorageCredentialsAPI;
import com.databricks.sdk.service.catalog.AccountStorageCredentialsService;
import com.databricks.sdk.service.iam.AccountGroupsAPI;
import com.databricks.sdk.service.iam.AccountGroupsService;
import com.databricks.sdk.service.iam.AccountServicePrincipalsAPI;
import com.databricks.sdk.service.iam.AccountServicePrincipalsService;
import com.databricks.sdk.service.iam.AccountUsersAPI;
import com.databricks.sdk.service.iam.AccountUsersService;
import com.databricks.sdk.service.iam.WorkspaceAssignmentAPI;
import com.databricks.sdk.service.iam.WorkspaceAssignmentService;
import com.databricks.sdk.service.oauth2.CustomAppIntegrationAPI;
import com.databricks.sdk.service.oauth2.CustomAppIntegrationService;
import com.databricks.sdk.service.oauth2.OAuthEnrollmentAPI;
import com.databricks.sdk.service.oauth2.OAuthEnrollmentService;
import com.databricks.sdk.service.oauth2.PublishedAppIntegrationAPI;
import com.databricks.sdk.service.oauth2.PublishedAppIntegrationService;
import com.databricks.sdk.service.provisioning.CredentialsAPI;
import com.databricks.sdk.service.provisioning.CredentialsService;
import com.databricks.sdk.service.provisioning.EncryptionKeysAPI;
import com.databricks.sdk.service.provisioning.EncryptionKeysService;
import com.databricks.sdk.service.provisioning.NetworksAPI;
import com.databricks.sdk.service.provisioning.NetworksService;
import com.databricks.sdk.service.provisioning.PrivateAccessAPI;
import com.databricks.sdk.service.provisioning.PrivateAccessService;
import com.databricks.sdk.service.provisioning.StorageAPI;
import com.databricks.sdk.service.provisioning.StorageService;
import com.databricks.sdk.service.provisioning.VpcEndpointsAPI;
import com.databricks.sdk.service.provisioning.VpcEndpointsService;
import com.databricks.sdk.service.provisioning.WorkspacesAPI;
import com.databricks.sdk.service.provisioning.WorkspacesService;
import com.databricks.sdk.service.settings.AccountIpAccessListsAPI;
import com.databricks.sdk.service.settings.AccountIpAccessListsService;

/**
 * Entry point for accessing Databricks account-level APIs
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DatabricksAccount {
  private final ApiClient apiClient;
  private final DatabricksConfig config;

  private BillableUsageAPI billableUsageAPI;
  private BudgetsAPI budgetsAPI;
  private CredentialsAPI credentialsAPI;
  private CustomAppIntegrationAPI customAppIntegrationAPI;
  private EncryptionKeysAPI encryptionKeysAPI;
  private AccountGroupsAPI groupsAPI;
  private AccountIpAccessListsAPI ipAccessListsAPI;
  private LogDeliveryAPI logDeliveryAPI;
  private AccountMetastoreAssignmentsAPI metastoreAssignmentsAPI;
  private AccountMetastoresAPI metastoresAPI;
  private NetworksAPI networksAPI;
  private OAuthEnrollmentAPI oAuthEnrollmentAPI;
  private PrivateAccessAPI privateAccessAPI;
  private PublishedAppIntegrationAPI publishedAppIntegrationAPI;
  private AccountServicePrincipalsAPI servicePrincipalsAPI;
  private StorageAPI storageAPI;
  private AccountStorageCredentialsAPI storageCredentialsAPI;
  private AccountUsersAPI usersAPI;
  private VpcEndpointsAPI vpcEndpointsAPI;
  private WorkspaceAssignmentAPI workspaceAssignmentAPI;
  private WorkspacesAPI workspacesAPI;

  /**
   * <p>Constructor for DatabricksAccount.</p>
   */
  public DatabricksAccount() {
    this(ConfigLoader.getDefault());
  }

  /**
   * <p>Constructor for DatabricksAccount.</p>
   *
   * @param config a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksAccount(DatabricksConfig config) {
    this.config = config;
    apiClient = new ApiClient(config);

    billableUsageAPI = new BillableUsageAPI(apiClient);
    budgetsAPI = new BudgetsAPI(apiClient);
    credentialsAPI = new CredentialsAPI(apiClient);
    customAppIntegrationAPI = new CustomAppIntegrationAPI(apiClient);
    encryptionKeysAPI = new EncryptionKeysAPI(apiClient);
    groupsAPI = new AccountGroupsAPI(apiClient);
    ipAccessListsAPI = new AccountIpAccessListsAPI(apiClient);
    logDeliveryAPI = new LogDeliveryAPI(apiClient);
    metastoreAssignmentsAPI = new AccountMetastoreAssignmentsAPI(apiClient);
    metastoresAPI = new AccountMetastoresAPI(apiClient);
    networksAPI = new NetworksAPI(apiClient);
    oAuthEnrollmentAPI = new OAuthEnrollmentAPI(apiClient);
    privateAccessAPI = new PrivateAccessAPI(apiClient);
    publishedAppIntegrationAPI = new PublishedAppIntegrationAPI(apiClient);
    servicePrincipalsAPI = new AccountServicePrincipalsAPI(apiClient);
    storageAPI = new StorageAPI(apiClient);
    storageCredentialsAPI = new AccountStorageCredentialsAPI(apiClient);
    usersAPI = new AccountUsersAPI(apiClient);
    vpcEndpointsAPI = new VpcEndpointsAPI(apiClient);
    workspaceAssignmentAPI = new WorkspaceAssignmentAPI(apiClient);
    workspacesAPI = new WorkspacesAPI(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a boolean
   */
  public DatabricksAccount(boolean mock) {
    apiClient = null;
    config = null;
  }

  /**
   * This API allows you to download billable usage logs for the specified account and date range.
   * This feature works with all account types.
   *
   * @return a {@link com.databricks.sdk.service.billing.BillableUsageAPI} object
   */
  public BillableUsageAPI billableUsage() {
    return billableUsageAPI;
  }

  /**
   * These APIs manage budget configuration including notifications for exceeding a budget for a
   * period. They can also retrieve the status of each budget.
   *
   * @return a {@link com.databricks.sdk.service.billing.BudgetsAPI} object
   */
  public BudgetsAPI budgets() {
    return budgetsAPI;
  }

  /**
   * These APIs manage credential configurations for this workspace. Databricks needs access to a
   * cross-account service IAM role in your AWS account so that Databricks can deploy clusters in
   * the appropriate VPC for the new workspace. A credential configuration encapsulates this role
   * information, and its ID is used when creating a new workspace.
   *
   * @return a {@link com.databricks.sdk.service.provisioning.CredentialsAPI} object
   */
  public CredentialsAPI credentials() {
    return credentialsAPI;
  }

  /**
   * These APIs enable administrators to manage custom oauth app integrations, which is required for
   * adding/using Custom OAuth App Integration like Tableau Cloud for Databricks in AWS cloud.
   *
   * <p>**Note:** You can only add/use the OAuth custom application integrations when OAuth
   * enrollment status is enabled. For more details see :method:OAuthEnrollment/create
   *
   * @return a {@link com.databricks.sdk.service.oauth2.CustomAppIntegrationAPI} object
   */
  public CustomAppIntegrationAPI customAppIntegration() {
    return customAppIntegrationAPI;
  }

  /**
   * These APIs manage encryption key configurations for this workspace (optional). A key
   * configuration encapsulates the AWS KMS key information and some information about how the key
   * configuration can be used. There are two possible uses for key configurations:
   *
   * <p>* Managed services: A key configuration can be used to encrypt a workspace's notebook and
   * secret data in the control plane, as well as Databricks SQL queries and query history. *
   * Storage: A key configuration can be used to encrypt a workspace's DBFS and EBS data in the data
   * plane.
   *
   * <p>In both of these cases, the key configuration's ID is used when creating a new workspace.
   * This Preview feature is available if your account is on the E2 version of the platform.
   * Updating a running workspace with workspace storage encryption requires that the workspace is
   * on the E2 version of the platform. If you have an older workspace, it might not be on the E2
   * version of the platform. If you are not sure, contact your Databricks representative.
   *
   * @return a {@link com.databricks.sdk.service.provisioning.EncryptionKeysAPI} object
   */
  public EncryptionKeysAPI encryptionKeys() {
    return encryptionKeysAPI;
  }

  /**
   * Groups simplify identity management, making it easier to assign access to Databricks Account,
   * data, and other securable objects.
   *
   * <p>It is best practice to assign access to workspaces and access-control policies in Unity
   * Catalog to groups, instead of to users individually. All Databricks Account identities can be
   * assigned as members of groups, and members inherit permissions that are assigned to their
   * group.
   *
   * @return a {@link com.databricks.sdk.service.iam.AccountGroupsAPI} object
   */
  public AccountGroupsAPI groups() {
    return groupsAPI;
  }

  /**
   * The Accounts IP Access List API enables account admins to configure IP access lists for access
   * to the account console.
   *
   * <p>Account IP Access Lists affect web application access and REST API access to the account
   * console and account APIs. If the feature is disabled for the account, all access is allowed for
   * this account. There is support for allow lists (inclusion) and block lists (exclusion).
   *
   * <p>When a connection is attempted: 1. **First, all block lists are checked.** If the connection
   * IP address matches any block list, the connection is rejected. 2. **If the connection was not
   * rejected by block lists**, the IP address is compared with the allow lists.
   *
   * <p>If there is at least one allow list for the account, the connection is allowed only if the
   * IP address matches an allow list. If there are no allow lists for the account, all IP addresses
   * are allowed.
   *
   * <p>For all allow lists and block lists combined, the account supports a maximum of 1000 IP/CIDR
   * values, where one CIDR counts as a single value.
   *
   * <p>After changes to the account-level IP access lists, it can take a few minutes for changes to
   * take effect.
   *
   * @return a {@link com.databricks.sdk.service.settings.AccountIpAccessListsAPI} object
   */
  public AccountIpAccessListsAPI ipAccessLists() {
    return ipAccessListsAPI;
  }

  /**
   * These APIs manage log delivery configurations for this account. The two supported log types for
   * this API are _billable usage logs_ and _audit logs_. This feature is in Public Preview. This
   * feature works with all account ID types.
   *
   * <p>Log delivery works with all account types. However, if your account is on the E2 version of
   * the platform or on a select custom plan that allows multiple workspaces per account, you can
   * optionally configure different storage destinations for each workspace. Log delivery status is
   * also provided to know the latest status of log delivery attempts. The high-level flow of
   * billable usage delivery:
   *
   * <p>1. **Create storage**: In AWS, [create a new AWS S3 bucket] with a specific bucket policy.
   * Using Databricks APIs, call the Account API to create a [storage configuration
   * object](#operation/create-storage-config) that uses the bucket name. 2. **Create credentials**:
   * In AWS, create the appropriate AWS IAM role. For full details, including the required IAM role
   * policies and trust relationship, see [Billable usage log delivery]. Using Databricks APIs, call
   * the Account API to create a [credential configuration
   * object](#operation/create-credential-config) that uses the IAM role's ARN. 3. **Create log
   * delivery configuration**: Using Databricks APIs, call the Account API to [create a log delivery
   * configuration](#operation/create-log-delivery-config) that uses the credential and storage
   * configuration objects from previous steps. You can specify if the logs should include all
   * events of that log type in your account (_Account level_ delivery) or only events for a
   * specific set of workspaces (_workspace level_ delivery). Account level log delivery applies to
   * all current and future workspaces plus account level logs, while workspace level log delivery
   * solely delivers logs related to the specified workspaces. You can create multiple types of
   * delivery configurations per account.
   *
   * <p>For billable usage delivery: * For more information about billable usage logs, see [Billable
   * usage log delivery]. For the CSV schema, see the [Usage page]. * The delivery location is
   * `<bucket-name>/<prefix>/billable-usage/csv/`, where `<prefix>` is the name of the optional
   * delivery path prefix you set up during log delivery configuration. Files are named
   * `workspaceId=<workspace-id>-usageMonth=<month>.csv`. * All billable usage logs apply to
   * specific workspaces (_workspace level_ logs). You can aggregate usage for your entire account
   * by creating an _account level_ delivery configuration that delivers logs for all current and
   * future workspaces in your account. * The files are delivered daily by overwriting the month's
   * CSV file for each workspace.
   *
   * <p>For audit log delivery: * For more information about about audit log delivery, see [Audit
   * log delivery], which includes information about the used JSON schema. * The delivery location
   * is
   * `<bucket-name>/<delivery-path-prefix>/workspaceId=<workspaceId>/date=<yyyy-mm-dd>/auditlogs_<internal-id>.json`.
   * Files may get overwritten with the same content multiple times to achieve exactly-once
   * delivery. * If the audit log delivery configuration included specific workspace IDs, only
   * _workspace-level_ audit logs for those workspaces are delivered. If the log delivery
   * configuration applies to the entire account (_account level_ delivery configuration), the audit
   * log delivery includes workspace-level audit logs for all workspaces in the account as well as
   * account-level audit logs. See [Audit log delivery] for details. * Auditable events are
   * typically available in logs within 15 minutes.
   *
   * <p>[Audit log delivery]:
   * https://docs.databricks.com/administration-guide/account-settings/audit-logs.html [Billable
   * usage log delivery]:
   * https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
   * [Usage page]: https://docs.databricks.com/administration-guide/account-settings/usage.html
   * [create a new AWS S3 bucket]:
   * https://docs.databricks.com/administration-guide/account-api/aws-storage.html
   *
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryAPI} object
   */
  public LogDeliveryAPI logDelivery() {
    return logDeliveryAPI;
  }

  /**
   * These APIs manage metastore assignments to a workspace.
   *
   * @return a {@link com.databricks.sdk.service.catalog.AccountMetastoreAssignmentsAPI} object
   */
  public AccountMetastoreAssignmentsAPI metastoreAssignments() {
    return metastoreAssignmentsAPI;
  }

  /**
   * These APIs manage Unity Catalog metastores for an account. A metastore contains catalogs that
   * can be associated with workspaces
   *
   * @return a {@link com.databricks.sdk.service.catalog.AccountMetastoresAPI} object
   */
  public AccountMetastoresAPI metastores() {
    return metastoresAPI;
  }

  /**
   * These APIs manage network configurations for customer-managed VPCs (optional). Its ID is used
   * when creating a new workspace if you use customer-managed VPCs.
   *
   * @return a {@link com.databricks.sdk.service.provisioning.NetworksAPI} object
   */
  public NetworksAPI networks() {
    return networksAPI;
  }

  /**
   * These APIs enable administrators to enroll OAuth for their accounts, which is required for
   * adding/using any OAuth published/custom application integration.
   *
   * <p>**Note:** Your account must be on the E2 version to use these APIs, this is because OAuth is
   * only supported on the E2 version.
   *
   * @return a {@link com.databricks.sdk.service.oauth2.OAuthEnrollmentAPI} object
   */
  public OAuthEnrollmentAPI oAuthEnrollment() {
    return oAuthEnrollmentAPI;
  }

  /**
   * These APIs manage private access settings for this account.
   *
   * @return a {@link com.databricks.sdk.service.provisioning.PrivateAccessAPI} object
   */
  public PrivateAccessAPI privateAccess() {
    return privateAccessAPI;
  }

  /**
   * These APIs enable administrators to manage published oauth app integrations, which is required
   * for adding/using Published OAuth App Integration like Tableau Cloud for Databricks in AWS
   * cloud.
   *
   * <p>**Note:** You can only add/use the OAuth published application integrations when OAuth
   * enrollment status is enabled. For more details see :method:OAuthEnrollment/create
   *
   * @return a {@link com.databricks.sdk.service.oauth2.PublishedAppIntegrationAPI} object
   */
  public PublishedAppIntegrationAPI publishedAppIntegration() {
    return publishedAppIntegrationAPI;
  }

  /**
   * Identities for use with jobs, automated tools, and systems such as scripts, apps, and CI/CD
   * platforms. Databricks recommends creating service principals to run production jobs or modify
   * production data. If all processes that act on production data run with service principals,
   * interactive users do not need any write, delete, or modify privileges in production. This
   * eliminates the risk of a user overwriting production data by accident.
   *
   * @return a {@link com.databricks.sdk.service.iam.AccountServicePrincipalsAPI} object
   */
  public AccountServicePrincipalsAPI servicePrincipals() {
    return servicePrincipalsAPI;
  }

  /**
   * These APIs manage storage configurations for this workspace. A root storage S3 bucket in your
   * account is required to store objects like cluster logs, notebook revisions, and job results.
   * You can also use the root storage S3 bucket for storage of non-production DBFS data. A storage
   * configuration encapsulates this bucket information, and its ID is used when creating a new
   * workspace.
   *
   * @return a {@link com.databricks.sdk.service.provisioning.StorageAPI} object
   */
  public StorageAPI storage() {
    return storageAPI;
  }

  /**
   * These APIs manage storage credentials for a particular metastore.
   *
   * @return a {@link com.databricks.sdk.service.catalog.AccountStorageCredentialsAPI} object
   */
  public AccountStorageCredentialsAPI storageCredentials() {
    return storageCredentialsAPI;
  }

  /**
   * User identities recognized by Databricks and represented by email addresses.
   *
   * <p>Databricks recommends using SCIM provisioning to sync users and groups automatically from
   * your identity provider to your Databricks Account. SCIM streamlines onboarding a new employee
   * or team by using your identity provider to create users and groups in Databricks Account and
   * give them the proper level of access. When a user leaves your organization or no longer needs
   * access to Databricks Account, admins can terminate the user in your identity provider and that
   * user’s account will also be removed from Databricks Account. This ensures a consistent
   * offboarding process and prevents unauthorized users from accessing sensitive data.
   *
   * @return a {@link com.databricks.sdk.service.iam.AccountUsersAPI} object
   */
  public AccountUsersAPI users() {
    return usersAPI;
  }

  /**
   * These APIs manage VPC endpoint configurations for this account.
   *
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpointsAPI} object
   */
  public VpcEndpointsAPI vpcEndpoints() {
    return vpcEndpointsAPI;
  }

  /**
   * The Workspace Permission Assignment API allows you to manage workspace permissions for
   * principals in your account.
   *
   * @return a {@link com.databricks.sdk.service.iam.WorkspaceAssignmentAPI} object
   */
  public WorkspaceAssignmentAPI workspaceAssignment() {
    return workspaceAssignmentAPI;
  }

  /**
   * These APIs manage workspaces for this account. A Databricks workspace is an environment for
   * accessing all of your Databricks assets. The workspace organizes objects (notebooks, libraries,
   * and experiments) into folders, and provides access to data and computational resources such as
   * clusters and jobs.
   *
   * <p>These endpoints are available if your account is on the E2 version of the platform or on a
   * select custom plan that allows multiple workspaces per account.
   *
   * @return a {@link com.databricks.sdk.service.provisioning.WorkspacesAPI} object
   */
  public WorkspacesAPI workspaces() {
    return workspacesAPI;
  }

  /**
   * Override BillableUsageAPI with mock
   *
   * @param billableUsage a {@link com.databricks.sdk.service.billing.BillableUsageService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withBillableUsageImpl(BillableUsageService billableUsage) {
    billableUsageAPI = new BillableUsageAPI(billableUsage);
    return this;
  }

  /**
   * Override BudgetsAPI with mock
   *
   * @param budgets a {@link com.databricks.sdk.service.billing.BudgetsService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withBudgetsImpl(BudgetsService budgets) {
    budgetsAPI = new BudgetsAPI(budgets);
    return this;
  }

  /**
   * Override CredentialsAPI with mock
   *
   * @param credentials a {@link com.databricks.sdk.service.provisioning.CredentialsService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withCredentialsImpl(CredentialsService credentials) {
    credentialsAPI = new CredentialsAPI(credentials);
    return this;
  }

  /**
   * Override CustomAppIntegrationAPI with mock
   *
   * @param customAppIntegration a {@link com.databricks.sdk.service.oauth2.CustomAppIntegrationService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withCustomAppIntegrationImpl(
      CustomAppIntegrationService customAppIntegration) {
    customAppIntegrationAPI = new CustomAppIntegrationAPI(customAppIntegration);
    return this;
  }

  /**
   * Override EncryptionKeysAPI with mock
   *
   * @param encryptionKeys a {@link com.databricks.sdk.service.provisioning.EncryptionKeysService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withEncryptionKeysImpl(EncryptionKeysService encryptionKeys) {
    encryptionKeysAPI = new EncryptionKeysAPI(encryptionKeys);
    return this;
  }

  /**
   * Override AccountGroupsAPI with mock
   *
   * @param accountGroups a {@link com.databricks.sdk.service.iam.AccountGroupsService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withGroupsImpl(AccountGroupsService accountGroups) {
    groupsAPI = new AccountGroupsAPI(accountGroups);
    return this;
  }

  /**
   * Override AccountIpAccessListsAPI with mock
   *
   * @param accountIpAccessLists a {@link com.databricks.sdk.service.settings.AccountIpAccessListsService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withIpAccessListsImpl(AccountIpAccessListsService accountIpAccessLists) {
    ipAccessListsAPI = new AccountIpAccessListsAPI(accountIpAccessLists);
    return this;
  }

  /**
   * Override LogDeliveryAPI with mock
   *
   * @param logDelivery a {@link com.databricks.sdk.service.billing.LogDeliveryService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withLogDeliveryImpl(LogDeliveryService logDelivery) {
    logDeliveryAPI = new LogDeliveryAPI(logDelivery);
    return this;
  }

  /**
   * Override AccountMetastoreAssignmentsAPI with mock
   *
   * @param accountMetastoreAssignments a {@link com.databricks.sdk.service.catalog.AccountMetastoreAssignmentsService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withMetastoreAssignmentsImpl(
      AccountMetastoreAssignmentsService accountMetastoreAssignments) {
    metastoreAssignmentsAPI = new AccountMetastoreAssignmentsAPI(accountMetastoreAssignments);
    return this;
  }

  /**
   * Override AccountMetastoresAPI with mock
   *
   * @param accountMetastores a {@link com.databricks.sdk.service.catalog.AccountMetastoresService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withMetastoresImpl(AccountMetastoresService accountMetastores) {
    metastoresAPI = new AccountMetastoresAPI(accountMetastores);
    return this;
  }

  /**
   * Override NetworksAPI with mock
   *
   * @param networks a {@link com.databricks.sdk.service.provisioning.NetworksService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withNetworksImpl(NetworksService networks) {
    networksAPI = new NetworksAPI(networks);
    return this;
  }

  /**
   * Override OAuthEnrollmentAPI with mock
   *
   * @param oAuthEnrollment a {@link com.databricks.sdk.service.oauth2.OAuthEnrollmentService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withOAuthEnrollmentImpl(OAuthEnrollmentService oAuthEnrollment) {
    oAuthEnrollmentAPI = new OAuthEnrollmentAPI(oAuthEnrollment);
    return this;
  }

  /**
   * Override PrivateAccessAPI with mock
   *
   * @param privateAccess a {@link com.databricks.sdk.service.provisioning.PrivateAccessService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withPrivateAccessImpl(PrivateAccessService privateAccess) {
    privateAccessAPI = new PrivateAccessAPI(privateAccess);
    return this;
  }

  /**
   * Override PublishedAppIntegrationAPI with mock
   *
   * @param publishedAppIntegration a {@link com.databricks.sdk.service.oauth2.PublishedAppIntegrationService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withPublishedAppIntegrationImpl(
      PublishedAppIntegrationService publishedAppIntegration) {
    publishedAppIntegrationAPI = new PublishedAppIntegrationAPI(publishedAppIntegration);
    return this;
  }

  /**
   * Override AccountServicePrincipalsAPI with mock
   *
   * @param accountServicePrincipals a {@link com.databricks.sdk.service.iam.AccountServicePrincipalsService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withServicePrincipalsImpl(
      AccountServicePrincipalsService accountServicePrincipals) {
    servicePrincipalsAPI = new AccountServicePrincipalsAPI(accountServicePrincipals);
    return this;
  }

  /**
   * Override StorageAPI with mock
   *
   * @param storage a {@link com.databricks.sdk.service.provisioning.StorageService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withStorageImpl(StorageService storage) {
    storageAPI = new StorageAPI(storage);
    return this;
  }

  /**
   * Override AccountStorageCredentialsAPI with mock
   *
   * @param accountStorageCredentials a {@link com.databricks.sdk.service.catalog.AccountStorageCredentialsService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withStorageCredentialsImpl(
      AccountStorageCredentialsService accountStorageCredentials) {
    storageCredentialsAPI = new AccountStorageCredentialsAPI(accountStorageCredentials);
    return this;
  }

  /**
   * Override AccountUsersAPI with mock
   *
   * @param accountUsers a {@link com.databricks.sdk.service.iam.AccountUsersService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withUsersImpl(AccountUsersService accountUsers) {
    usersAPI = new AccountUsersAPI(accountUsers);
    return this;
  }

  /**
   * Override VpcEndpointsAPI with mock
   *
   * @param vpcEndpoints a {@link com.databricks.sdk.service.provisioning.VpcEndpointsService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withVpcEndpointsImpl(VpcEndpointsService vpcEndpoints) {
    vpcEndpointsAPI = new VpcEndpointsAPI(vpcEndpoints);
    return this;
  }

  /**
   * Override WorkspaceAssignmentAPI with mock
   *
   * @param workspaceAssignment a {@link com.databricks.sdk.service.iam.WorkspaceAssignmentService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withWorkspaceAssignmentImpl(
      WorkspaceAssignmentService workspaceAssignment) {
    workspaceAssignmentAPI = new WorkspaceAssignmentAPI(workspaceAssignment);
    return this;
  }

  /**
   * Override WorkspacesAPI with mock
   *
   * @param workspaces a {@link com.databricks.sdk.service.provisioning.WorkspacesService} object
   * @return a {@link com.databricks.sdk.DatabricksAccount} object
   */
  public DatabricksAccount withWorkspacesImpl(WorkspacesService workspaces) {
    workspacesAPI = new WorkspacesAPI(workspaces);
    return this;
  }

  /**
   * <p>apiClient.</p>
   *
   * @return a {@link com.databricks.sdk.client.ApiClient} object
   */
  public ApiClient apiClient() {
    return apiClient;
  }

  /**
   * <p>config.</p>
   *
   * @return a {@link com.databricks.sdk.client.DatabricksConfig} object
   */
  public DatabricksConfig config() {
    return config;
  }
}
