// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.ConfigLoader;
import com.databricks.sdk.client.DatabricksConfig;

import com.databricks.sdk.service.billing.BillableUsageAPI;
import com.databricks.sdk.service.billing.BillableUsageService;
import com.databricks.sdk.service.billing.BudgetsAPI;
import com.databricks.sdk.service.billing.BudgetsService;
import com.databricks.sdk.service.deployment.CredentialsAPI;
import com.databricks.sdk.service.deployment.CredentialsService;
import com.databricks.sdk.service.deployment.EncryptionKeysAPI;
import com.databricks.sdk.service.deployment.EncryptionKeysService;
import com.databricks.sdk.service.scim.AccountGroupsAPI;
import com.databricks.sdk.service.scim.AccountGroupsService;
import com.databricks.sdk.service.billing.LogDeliveryAPI;
import com.databricks.sdk.service.billing.LogDeliveryService;
import com.databricks.sdk.service.unitycatalog.AccountMetastoreAssignmentsAPI;
import com.databricks.sdk.service.unitycatalog.AccountMetastoreAssignmentsService;
import com.databricks.sdk.service.unitycatalog.AccountMetastoresAPI;
import com.databricks.sdk.service.unitycatalog.AccountMetastoresService;
import com.databricks.sdk.service.deployment.NetworksAPI;
import com.databricks.sdk.service.deployment.NetworksService;
import com.databricks.sdk.service.deployment.PrivateAccessAPI;
import com.databricks.sdk.service.deployment.PrivateAccessService;
import com.databricks.sdk.service.scim.AccountServicePrincipalsAPI;
import com.databricks.sdk.service.scim.AccountServicePrincipalsService;
import com.databricks.sdk.service.deployment.StorageAPI;
import com.databricks.sdk.service.deployment.StorageService;
import com.databricks.sdk.service.unitycatalog.AccountStorageCredentialsAPI;
import com.databricks.sdk.service.unitycatalog.AccountStorageCredentialsService;
import com.databricks.sdk.service.scim.AccountUsersAPI;
import com.databricks.sdk.service.scim.AccountUsersService;
import com.databricks.sdk.service.deployment.VpcEndpointsAPI;
import com.databricks.sdk.service.deployment.VpcEndpointsService;
import com.databricks.sdk.service.permissions.WorkspaceAssignmentAPI;
import com.databricks.sdk.service.permissions.WorkspaceAssignmentService;
import com.databricks.sdk.service.deployment.WorkspacesAPI;
import com.databricks.sdk.service.deployment.WorkspacesService;

/**
 * Entry point for accessing Databricks account-level APIs
 */
public class DatabricksAccount {
    private final ApiClient apiClient;
    private final DatabricksConfig config;
    
    private BillableUsageService billableUsageService;
    private BudgetsService budgetsService;
    private CredentialsService credentialsService;
    private EncryptionKeysService encryptionKeysService;
    private AccountGroupsService accountGroupsService;
    private LogDeliveryService logDeliveryService;
    private AccountMetastoreAssignmentsService accountMetastoreAssignmentsService;
    private AccountMetastoresService accountMetastoresService;
    private NetworksService networksService;
    private PrivateAccessService privateAccessService;
    private AccountServicePrincipalsService accountServicePrincipalsService;
    private StorageService storageService;
    private AccountStorageCredentialsService accountStorageCredentialsService;
    private AccountUsersService accountUsersService;
    private VpcEndpointsService vpcEndpointsService;
    private WorkspaceAssignmentService workspaceAssignmentService;
    private WorkspacesService workspacesService;

    public DatabricksAccount() {
        this(ConfigLoader.getDefault());
    }

    public DatabricksAccount(DatabricksConfig config) {
        this.config = config;
        apiClient = new ApiClient(config);
        
        billableUsageService = new BillableUsageAPI(apiClient);
        budgetsService = new BudgetsAPI(apiClient);
        credentialsService = new CredentialsAPI(apiClient);
        encryptionKeysService = new EncryptionKeysAPI(apiClient);
        accountGroupsService = new AccountGroupsAPI(apiClient);
        logDeliveryService = new LogDeliveryAPI(apiClient);
        accountMetastoreAssignmentsService = new AccountMetastoreAssignmentsAPI(apiClient);
        accountMetastoresService = new AccountMetastoresAPI(apiClient);
        networksService = new NetworksAPI(apiClient);
        privateAccessService = new PrivateAccessAPI(apiClient);
        accountServicePrincipalsService = new AccountServicePrincipalsAPI(apiClient);
        storageService = new StorageAPI(apiClient);
        accountStorageCredentialsService = new AccountStorageCredentialsAPI(apiClient);
        accountUsersService = new AccountUsersAPI(apiClient);
        vpcEndpointsService = new VpcEndpointsAPI(apiClient);
        workspaceAssignmentService = new WorkspaceAssignmentAPI(apiClient);
        workspacesService = new WorkspacesAPI(apiClient);
    }
    
    /**
     * This API allows you to download billable usage logs for the specified
     * account and date range. This feature works with all account types.
     */
    public BillableUsageService billableUsage() {
        return billableUsageService;
    }
    
    /**
     * These APIs manage budget configuration including notifications for
     * exceeding a budget for a period. They can also retrieve the status of
     * each budget.
     */
    public BudgetsService budgets() {
        return budgetsService;
    }
    
    /**
     * These APIs manage credential configurations for this workspace.
     * Databricks needs access to a cross-account service IAM role in your AWS
     * account so that Databricks can deploy clusters in the appropriate VPC for
     * the new workspace. A credential configuration encapsulates this role
     * information, and its ID is used when creating a new workspace.
     */
    public CredentialsService credentials() {
        return credentialsService;
    }
    
    /**
     * These APIs manage encryption key configurations for this workspace
     * (optional). A key configuration encapsulates the AWS KMS key information
     * and some information about how the key configuration can be used. There
     * are two possible uses for key configurations:
     * 
     * * Managed services: A key configuration can be used to encrypt a
     * workspace's notebook and secret data in the control plane, as well as
     * Databricks SQL queries and query history. * Storage: A key configuration
     * can be used to encrypt a workspace's DBFS and EBS data in the data plane.
     * 
     * In both of these cases, the key configuration's ID is used when creating
     * a new workspace. This Preview feature is available if your account is on
     * the E2 version of the platform. Updating a running workspace with
     * workspace storage encryption requires that the workspace is on the E2
     * version of the platform. If you have an older workspace, it might not be
     * on the E2 version of the platform. If you are not sure, contact your
     * Databricks reprsentative.
     */
    public EncryptionKeysService encryptionKeys() {
        return encryptionKeysService;
    }
    
    /**
     * Groups simplify identity management, making it easier to assign access to
     * Databricks Account, data, and other securable objects.
     * 
     * It is best practice to assign access to workspaces and access-control
     * policies in Unity Catalog to groups, instead of to users individually.
     * All Databricks Account identities can be assigned as members of groups,
     * and members inherit permissions that are assigned to their group.
     */
    public AccountGroupsService accountGroups() {
        return accountGroupsService;
    }
    
    /**
     * These APIs manage log delivery configurations for this account. The two
     * supported log types for this API are _billable usage logs_ and _audit
     * logs_. This feature is in Public Preview. This feature works with all
     * account ID types.
     * 
     * Log delivery works with all account types. However, if your account is on
     * the E2 version of the platform or on a select custom plan that allows
     * multiple workspaces per account, you can optionally configure different
     * storage destinations for each workspace. Log delivery status is also
     * provided to know the latest status of log delivery attempts. The
     * high-level flow of billable usage delivery:
     * 
     * 1. **Create storage**: In AWS, [create a new AWS S3 bucket] with a
     * specific bucket policy. Using Databricks APIs, call the Account API to
     * create a [storage configuration object](#operation/create-storage-config)
     * that uses the bucket name. 2. **Create credentials**: In AWS, create the
     * appropriate AWS IAM role. For full details, including the required IAM
     * role policies and trust relationship, see [Billable usage log delivery].
     * Using Databricks APIs, call the Account API to create a [credential
     * configuration object](#operation/create-credential-config) that uses the
     * IAM role's ARN. 3. **Create log delivery configuration**: Using
     * Databricks APIs, call the Account API to [create a log delivery
     * configuration](#operation/create-log-delivery-config) that uses the
     * credential and storage configuration objects from previous steps. You can
     * specify if the logs should include all events of that log type in your
     * account (_Account level_ delivery) or only events for a specific set of
     * workspaces (_workspace level_ delivery). Account level log delivery
     * applies to all current and future workspaces plus account level logs,
     * while workspace level log delivery solely delivers logs related to the
     * specified workspaces. You can create multiple types of delivery
     * configurations per account.
     * 
     * For billable usage delivery: * For more information about billable usage
     * logs, see [Billable usage log delivery]. For the CSV schema, see the
     * [Usage page]. * The delivery location is
     * `<bucket-name>/<prefix>/billable-usage/csv/`, where `<prefix>` is the
     * name of the optional delivery path prefix you set up during log delivery
     * configuration. Files are named
     * `workspaceId=<workspace-id>-usageMonth=<month>.csv`. * All billable usage
     * logs apply to specific workspaces (_workspace level_ logs). You can
     * aggregate usage for your entire account by creating an _account level_
     * delivery configuration that delivers logs for all current and future
     * workspaces in your account. * The files are delivered daily by
     * overwriting the month's CSV file for each workspace.
     * 
     * For audit log delivery: * For more information about about audit log
     * delivery, see [Audit log delivery], which includes information about the
     * used JSON schema. * The delivery location is
     * `<bucket-name>/<delivery-path-prefix>/workspaceId=<workspaceId>/date=<yyyy-mm-dd>/auditlogs_<internal-id>.json`.
     * Files may get overwritten with the same content multiple times to achieve
     * exactly-once delivery. * If the audit log delivery configuration included
     * specific workspace IDs, only _workspace-level_ audit logs for those
     * workspaces are delivered. If the log delivery configuration applies to
     * the entire account (_account level_ delivery configuration), the audit
     * log delivery includes workspace-level audit logs for all workspaces in
     * the account as well as account-level audit logs. See [Audit log delivery]
     * for details. * Auditable events are typically available in logs within 15
     * minutes.
     * 
     * [Audit log delivery]: https://docs.databricks.com/administration-guide/account-settings/audit-logs.html
     * [Billable usage log delivery]: https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
     * [Usage page]: https://docs.databricks.com/administration-guide/account-settings/usage.html
     * [create a new AWS S3 bucket]: https://docs.databricks.com/administration-guide/account-api/aws-storage.html
     */
    public LogDeliveryService logDelivery() {
        return logDeliveryService;
    }
    
    /**
     * These APIs manage metastore assignments to a workspace.
     */
    public AccountMetastoreAssignmentsService accountMetastoreAssignments() {
        return accountMetastoreAssignmentsService;
    }
    
    /**
     * These APIs manage Unity Catalog metastores for an account. A metastore
     * contains catalogs that can be associated with workspaces
     */
    public AccountMetastoresService accountMetastores() {
        return accountMetastoresService;
    }
    
    /**
     * These APIs manage network configurations for customer-managed VPCs
     * (optional). Its ID is used when creating a new workspace if you use
     * customer-managed VPCs.
     */
    public NetworksService networks() {
        return networksService;
    }
    
    /**
     * These APIs manage private access settings for this account. A private
     * access settings object specifies how your workspace is accessed using AWS
     * PrivateLink. Each workspace that has any PrivateLink connections must
     * include the ID for a private access settings object is in its workspace
     * configuration object. Your account must be enabled for PrivateLink to use
     * these APIs. Before configuring PrivateLink, it is important to read the
     * [Databricks article about PrivateLink].
     * 
     * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
     */
    public PrivateAccessService privateAccess() {
        return privateAccessService;
    }
    
    /**
     * Identities for use with jobs, automated tools, and systems such as
     * scripts, apps, and CI/CD platforms. Databricks recommends creating
     * service principals to run production jobs or modify production data. If
     * all processes that act on production data run with service principals,
     * interactive users do not need any write, delete, or modify privileges in
     * production. This eliminates the risk of a user overwriting production
     * data by accident.
     */
    public AccountServicePrincipalsService accountServicePrincipals() {
        return accountServicePrincipalsService;
    }
    
    /**
     * These APIs manage storage configurations for this workspace. A root
     * storage S3 bucket in your account is required to store objects like
     * cluster logs, notebook revisions, and job results. You can also use the
     * root storage S3 bucket for storage of non-production DBFS data. A storage
     * configuration encapsulates this bucket information, and its ID is used
     * when creating a new workspace.
     */
    public StorageService storage() {
        return storageService;
    }
    
    /**
     * These APIs manage storage credentials for a particular metastore.
     */
    public AccountStorageCredentialsService accountStorageCredentials() {
        return accountStorageCredentialsService;
    }
    
    /**
     * User identities recognized by Databricks and represented by email
     * addresses.
     * 
     * Databricks recommends using SCIM provisioning to sync users and groups
     * automatically from your identity provider to your Databricks Account.
     * SCIM streamlines onboarding a new employee or team by using your identity
     * provider to create users and groups in Databricks Account and give them
     * the proper level of access. When a user leaves your organization or no
     * longer needs access to Databricks Account, admins can terminate the user
     * in your identity provider and that user’s account will also be removed
     * from Databricks Account. This ensures a consistent offboarding process
     * and prevents unauthorized users from accessing sensitive data.
     */
    public AccountUsersService accountUsers() {
        return accountUsersService;
    }
    
    /**
     * These APIs manage VPC endpoint configurations for this account. This
     * object registers an AWS VPC endpoint in your Databricks account so your
     * workspace can use it with AWS PrivateLink. Your VPC endpoint connects to
     * one of two VPC endpoint services -- one for workspace (both for front-end
     * connection and for back-end connection to REST APIs) and one for the
     * back-end secure cluster connectivity relay from the data plane. Your
     * account must be enabled for PrivateLink to use these APIs. Before
     * configuring PrivateLink, it is important to read the [Databricks article
     * about PrivateLink].
     * 
     * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
     */
    public VpcEndpointsService vpcEndpoints() {
        return vpcEndpointsService;
    }
    
    /**
     * Databricks Workspace Assignment REST API
     */
    public WorkspaceAssignmentService workspaceAssignment() {
        return workspaceAssignmentService;
    }
    
    /**
     * These APIs manage workspaces for this account. A Databricks workspace is
     * an environment for accessing all of your Databricks assets. The workspace
     * organizes objects (notebooks, libraries, and experiments) into folders,
     * and provides access to data and computational resources such as clusters
     * and jobs.
     * 
     * These endpoints are available if your account is on the E2 version of the
     * platform or on a select custom plan that allows multiple workspaces per
     * account.
     */
    public WorkspacesService workspaces() {
        return workspacesService;
    }
    
    
    /**
     * Override BillableUsageService with mock
     */
    public DatabricksAccount setBillableUsageService(BillableUsageService billableUsage) {
        billableUsageService = billableUsage;
        return this;
    }
    
    /**
     * Override BudgetsService with mock
     */
    public DatabricksAccount setBudgetsService(BudgetsService budgets) {
        budgetsService = budgets;
        return this;
    }
    
    /**
     * Override CredentialsService with mock
     */
    public DatabricksAccount setCredentialsService(CredentialsService credentials) {
        credentialsService = credentials;
        return this;
    }
    
    /**
     * Override EncryptionKeysService with mock
     */
    public DatabricksAccount setEncryptionKeysService(EncryptionKeysService encryptionKeys) {
        encryptionKeysService = encryptionKeys;
        return this;
    }
    
    /**
     * Override AccountGroupsService with mock
     */
    public DatabricksAccount setAccountGroupsService(AccountGroupsService accountGroups) {
        accountGroupsService = accountGroups;
        return this;
    }
    
    /**
     * Override LogDeliveryService with mock
     */
    public DatabricksAccount setLogDeliveryService(LogDeliveryService logDelivery) {
        logDeliveryService = logDelivery;
        return this;
    }
    
    /**
     * Override AccountMetastoreAssignmentsService with mock
     */
    public DatabricksAccount setAccountMetastoreAssignmentsService(AccountMetastoreAssignmentsService accountMetastoreAssignments) {
        accountMetastoreAssignmentsService = accountMetastoreAssignments;
        return this;
    }
    
    /**
     * Override AccountMetastoresService with mock
     */
    public DatabricksAccount setAccountMetastoresService(AccountMetastoresService accountMetastores) {
        accountMetastoresService = accountMetastores;
        return this;
    }
    
    /**
     * Override NetworksService with mock
     */
    public DatabricksAccount setNetworksService(NetworksService networks) {
        networksService = networks;
        return this;
    }
    
    /**
     * Override PrivateAccessService with mock
     */
    public DatabricksAccount setPrivateAccessService(PrivateAccessService privateAccess) {
        privateAccessService = privateAccess;
        return this;
    }
    
    /**
     * Override AccountServicePrincipalsService with mock
     */
    public DatabricksAccount setAccountServicePrincipalsService(AccountServicePrincipalsService accountServicePrincipals) {
        accountServicePrincipalsService = accountServicePrincipals;
        return this;
    }
    
    /**
     * Override StorageService with mock
     */
    public DatabricksAccount setStorageService(StorageService storage) {
        storageService = storage;
        return this;
    }
    
    /**
     * Override AccountStorageCredentialsService with mock
     */
    public DatabricksAccount setAccountStorageCredentialsService(AccountStorageCredentialsService accountStorageCredentials) {
        accountStorageCredentialsService = accountStorageCredentials;
        return this;
    }
    
    /**
     * Override AccountUsersService with mock
     */
    public DatabricksAccount setAccountUsersService(AccountUsersService accountUsers) {
        accountUsersService = accountUsers;
        return this;
    }
    
    /**
     * Override VpcEndpointsService with mock
     */
    public DatabricksAccount setVpcEndpointsService(VpcEndpointsService vpcEndpoints) {
        vpcEndpointsService = vpcEndpoints;
        return this;
    }
    
    /**
     * Override WorkspaceAssignmentService with mock
     */
    public DatabricksAccount setWorkspaceAssignmentService(WorkspaceAssignmentService workspaceAssignment) {
        workspaceAssignmentService = workspaceAssignment;
        return this;
    }
    
    /**
     * Override WorkspacesService with mock
     */
    public DatabricksAccount setWorkspacesService(WorkspacesService workspaces) {
        workspacesService = workspaces;
        return this;
    }
    
}
