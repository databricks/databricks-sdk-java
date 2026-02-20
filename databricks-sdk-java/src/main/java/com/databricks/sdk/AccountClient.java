// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.ConfigLoader;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.HostType;
import com.databricks.sdk.core.utils.AzureUtils;
import com.databricks.sdk.service.billing.BillableUsageAPI;
import com.databricks.sdk.service.billing.BillableUsageService;
import com.databricks.sdk.service.billing.BudgetPolicyAPI;
import com.databricks.sdk.service.billing.BudgetPolicyService;
import com.databricks.sdk.service.billing.BudgetsAPI;
import com.databricks.sdk.service.billing.BudgetsService;
import com.databricks.sdk.service.billing.LogDeliveryAPI;
import com.databricks.sdk.service.billing.LogDeliveryService;
import com.databricks.sdk.service.billing.UsageDashboardsAPI;
import com.databricks.sdk.service.billing.UsageDashboardsService;
import com.databricks.sdk.service.catalog.AccountMetastoreAssignmentsAPI;
import com.databricks.sdk.service.catalog.AccountMetastoreAssignmentsService;
import com.databricks.sdk.service.catalog.AccountMetastoresAPI;
import com.databricks.sdk.service.catalog.AccountMetastoresService;
import com.databricks.sdk.service.catalog.AccountStorageCredentialsAPI;
import com.databricks.sdk.service.catalog.AccountStorageCredentialsService;
import com.databricks.sdk.service.iam.AccountAccessControlAPI;
import com.databricks.sdk.service.iam.AccountAccessControlService;
import com.databricks.sdk.service.iam.AccountGroupsAPI;
import com.databricks.sdk.service.iam.AccountGroupsService;
import com.databricks.sdk.service.iam.AccountGroupsV2API;
import com.databricks.sdk.service.iam.AccountGroupsV2Service;
import com.databricks.sdk.service.iam.AccountServicePrincipalsAPI;
import com.databricks.sdk.service.iam.AccountServicePrincipalsService;
import com.databricks.sdk.service.iam.AccountServicePrincipalsV2API;
import com.databricks.sdk.service.iam.AccountServicePrincipalsV2Service;
import com.databricks.sdk.service.iam.AccountUsersAPI;
import com.databricks.sdk.service.iam.AccountUsersService;
import com.databricks.sdk.service.iam.AccountUsersV2API;
import com.databricks.sdk.service.iam.AccountUsersV2Service;
import com.databricks.sdk.service.iam.WorkspaceAssignmentAPI;
import com.databricks.sdk.service.iam.WorkspaceAssignmentService;
import com.databricks.sdk.service.iamv2.AccountIamV2API;
import com.databricks.sdk.service.iamv2.AccountIamV2Service;
import com.databricks.sdk.service.networking.EndpointsAPI;
import com.databricks.sdk.service.networking.EndpointsService;
import com.databricks.sdk.service.oauth2.AccountFederationPolicyAPI;
import com.databricks.sdk.service.oauth2.AccountFederationPolicyService;
import com.databricks.sdk.service.oauth2.CustomAppIntegrationAPI;
import com.databricks.sdk.service.oauth2.CustomAppIntegrationService;
import com.databricks.sdk.service.oauth2.OAuthPublishedAppsAPI;
import com.databricks.sdk.service.oauth2.OAuthPublishedAppsService;
import com.databricks.sdk.service.oauth2.PublishedAppIntegrationAPI;
import com.databricks.sdk.service.oauth2.PublishedAppIntegrationService;
import com.databricks.sdk.service.oauth2.ServicePrincipalFederationPolicyAPI;
import com.databricks.sdk.service.oauth2.ServicePrincipalFederationPolicyService;
import com.databricks.sdk.service.oauth2.ServicePrincipalSecretsAPI;
import com.databricks.sdk.service.oauth2.ServicePrincipalSecretsService;
import com.databricks.sdk.service.provisioning.*;
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
import com.databricks.sdk.service.settings.AccountSettingsAPI;
import com.databricks.sdk.service.settings.AccountSettingsService;
import com.databricks.sdk.service.settings.NetworkConnectivityAPI;
import com.databricks.sdk.service.settings.NetworkConnectivityService;
import com.databricks.sdk.service.settings.NetworkPoliciesAPI;
import com.databricks.sdk.service.settings.NetworkPoliciesService;
import com.databricks.sdk.service.settings.WorkspaceNetworkConfigurationAPI;
import com.databricks.sdk.service.settings.WorkspaceNetworkConfigurationService;
import com.databricks.sdk.service.settingsv2.AccountSettingsV2API;
import com.databricks.sdk.service.settingsv2.AccountSettingsV2Service;
import com.databricks.sdk.support.Generated;

/** Entry point for accessing Databricks account-level APIs */
@Generated
public class AccountClient {
  private final ApiClient apiClient;
  private final DatabricksConfig config;

  private AccountAccessControlAPI accessControlAPI;
  private BillableUsageAPI billableUsageAPI;
  private BudgetPolicyAPI budgetPolicyAPI;
  private BudgetsAPI budgetsAPI;
  private CredentialsAPI credentialsAPI;
  private CustomAppIntegrationAPI customAppIntegrationAPI;
  private EncryptionKeysAPI encryptionKeysAPI;
  private EndpointsAPI endpointsAPI;
  private AccountFederationPolicyAPI federationPolicyAPI;
  private AccountGroupsV2API groupsV2API;
  private AccountIamV2API iamV2API;
  private AccountIpAccessListsAPI ipAccessListsAPI;
  private LogDeliveryAPI logDeliveryAPI;
  private AccountMetastoreAssignmentsAPI metastoreAssignmentsAPI;
  private AccountMetastoresAPI metastoresAPI;
  private NetworkConnectivityAPI networkConnectivityAPI;
  private NetworkPoliciesAPI networkPoliciesAPI;
  private NetworksAPI networksAPI;
  private OAuthPublishedAppsAPI oAuthPublishedAppsAPI;
  private PrivateAccessAPI privateAccessAPI;
  private PublishedAppIntegrationAPI publishedAppIntegrationAPI;
  private ServicePrincipalFederationPolicyAPI servicePrincipalFederationPolicyAPI;
  private ServicePrincipalSecretsAPI servicePrincipalSecretsAPI;
  private AccountServicePrincipalsV2API servicePrincipalsV2API;
  private AccountSettingsAPI settingsAPI;
  private AccountSettingsV2API settingsV2API;
  private StorageAPI storageAPI;
  private AccountStorageCredentialsAPI storageCredentialsAPI;
  private UsageDashboardsAPI usageDashboardsAPI;
  private AccountUsersV2API usersV2API;
  private VpcEndpointsAPI vpcEndpointsAPI;
  private WorkspaceAssignmentAPI workspaceAssignmentAPI;
  private WorkspaceNetworkConfigurationAPI workspaceNetworkConfigurationAPI;
  private WorkspacesAPI workspacesAPI;
  private AccountGroupsAPI groupsAPI;
  private AccountServicePrincipalsAPI servicePrincipalsAPI;
  private AccountUsersAPI usersAPI;

  public AccountClient() {
    this(ConfigLoader.getDefault());
  }

  public AccountClient(DatabricksConfig config) {
    this.config = config;
    apiClient = new ApiClient(config);

    accessControlAPI = new AccountAccessControlAPI(apiClient);
    billableUsageAPI = new BillableUsageAPI(apiClient);
    budgetPolicyAPI = new BudgetPolicyAPI(apiClient);
    budgetsAPI = new BudgetsAPI(apiClient);
    credentialsAPI = new CredentialsAPI(apiClient);
    customAppIntegrationAPI = new CustomAppIntegrationAPI(apiClient);
    encryptionKeysAPI = new EncryptionKeysAPI(apiClient);
    endpointsAPI = new EndpointsAPI(apiClient);
    federationPolicyAPI = new AccountFederationPolicyAPI(apiClient);
    groupsV2API = new AccountGroupsV2API(apiClient);
    iamV2API = new AccountIamV2API(apiClient);
    ipAccessListsAPI = new AccountIpAccessListsAPI(apiClient);
    logDeliveryAPI = new LogDeliveryAPI(apiClient);
    metastoreAssignmentsAPI = new AccountMetastoreAssignmentsAPI(apiClient);
    metastoresAPI = new AccountMetastoresAPI(apiClient);
    networkConnectivityAPI = new NetworkConnectivityAPI(apiClient);
    networkPoliciesAPI = new NetworkPoliciesAPI(apiClient);
    networksAPI = new NetworksAPI(apiClient);
    oAuthPublishedAppsAPI = new OAuthPublishedAppsAPI(apiClient);
    privateAccessAPI = new PrivateAccessAPI(apiClient);
    publishedAppIntegrationAPI = new PublishedAppIntegrationAPI(apiClient);
    servicePrincipalFederationPolicyAPI = new ServicePrincipalFederationPolicyAPI(apiClient);
    servicePrincipalSecretsAPI = new ServicePrincipalSecretsAPI(apiClient);
    servicePrincipalsV2API = new AccountServicePrincipalsV2API(apiClient);
    settingsAPI = new AccountSettingsAPI(apiClient);
    settingsV2API = new AccountSettingsV2API(apiClient);
    storageAPI = new StorageAPI(apiClient);
    storageCredentialsAPI = new AccountStorageCredentialsAPI(apiClient);
    usageDashboardsAPI = new UsageDashboardsAPI(apiClient);
    usersV2API = new AccountUsersV2API(apiClient);
    vpcEndpointsAPI = new VpcEndpointsAPI(apiClient);
    workspaceAssignmentAPI = new WorkspaceAssignmentAPI(apiClient);
    workspaceNetworkConfigurationAPI = new WorkspaceNetworkConfigurationAPI(apiClient);
    workspacesAPI = new WorkspacesAPI(apiClient);
    groupsAPI = new AccountGroupsAPI(apiClient);
    servicePrincipalsAPI = new AccountServicePrincipalsAPI(apiClient);
    usersAPI = new AccountUsersAPI(apiClient);
  }

  /** Constructor for mocks */
  public AccountClient(boolean mock) {
    apiClient = null;
    config = null;
  }

  /**
   * These APIs manage access rules on resources in an account. Currently, only grant rules are
   * supported. A grant rule specifies a role assigned to a set of principals. A list of rules
   * attached to a resource is called a rule set.
   */
  public AccountAccessControlAPI accessControl() {
    return accessControlAPI;
  }

  /**
   * This API allows you to download billable usage logs for the specified account and date range.
   * This feature works with all account types.
   */
  public BillableUsageAPI billableUsage() {
    return billableUsageAPI;
  }

  /** A service serves REST API about Budget policies */
  public BudgetPolicyAPI budgetPolicy() {
    return budgetPolicyAPI;
  }

  /**
   * These APIs manage budget configurations for this account. Budgets enable you to monitor usage
   * across your account. You can set up budgets to either track account-wide spending, or apply
   * filters to track the spending of specific teams, projects, or workspaces.
   */
  public BudgetsAPI budgets() {
    return budgetsAPI;
  }

  /**
   * These APIs manage credential configurations for this workspace. Databricks needs access to a
   * cross-account service IAM role in your AWS account so that Databricks can deploy clusters in
   * the appropriate VPC for the new workspace. A credential configuration encapsulates this role
   * information, and its ID is used when creating a new workspace.
   */
  public CredentialsAPI credentials() {
    return credentialsAPI;
  }

  /**
   * These APIs enable administrators to manage custom OAuth app integrations, which is required for
   * adding/using Custom OAuth App Integration like Tableau Cloud for Databricks in AWS cloud.
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
   */
  public EncryptionKeysAPI encryptionKeys() {
    return encryptionKeysAPI;
  }

  /** These APIs manage endpoint configurations for this account. */
  public EndpointsAPI endpoints() {
    return endpointsAPI;
  }

  /**
   * These APIs manage account federation policies.
   *
   * <p>Account federation policies allow users and service principals in your Databricks account to
   * securely access Databricks APIs using tokens from your trusted identity providers (IdPs).
   *
   * <p>With token federation, your users and service principals can exchange tokens from your IdP
   * for Databricks OAuth tokens, which can be used to access Databricks APIs. Token federation
   * eliminates the need to manage Databricks secrets, and allows you to centralize management of
   * token issuance policies in your IdP. Databricks token federation is typically used in
   * combination with [SCIM], so users in your IdP are synchronized into your Databricks account.
   *
   * <p>Token federation is configured in your Databricks account using an account federation
   * policy. An account federation policy specifies: * which IdP, or issuer, your Databricks account
   * should accept tokens from * how to determine which Databricks user, or subject, a token is
   * issued for
   *
   * <p>To configure a federation policy, you provide the following: * The required token
   * __issuer__, as specified in the “iss” claim of your tokens. The issuer is an https URL that
   * identifies your IdP. * The allowed token __audiences__, as specified in the “aud” claim of your
   * tokens. This identifier is intended to represent the recipient of the token. As long as the
   * audience in the token matches at least one audience in the policy, the token is considered a
   * match. If unspecified, the default value is your Databricks account id. * The __subject
   * claim__, which indicates which token claim contains the Databricks username of the user the
   * token was issued for. If unspecified, the default value is “sub”. * Optionally, the public keys
   * used to validate the signature of your tokens, in JWKS format. If unspecified (recommended),
   * Databricks automatically fetches the public keys from your issuer’s well known endpoint.
   * Databricks strongly recommends relying on your issuer’s well known endpoint for discovering
   * public keys.
   *
   * <p>An example federation policy is: ``` issuer: "https://idp.mycompany.com/oidc" audiences:
   * ["databricks"] subject_claim: "sub" ```
   *
   * <p>An example JWT token body that matches this policy and could be used to authenticate to
   * Databricks as user `username@mycompany.com` is: ``` { "iss": "https://idp.mycompany.com/oidc",
   * "aud": "databricks", "sub": "username@mycompany.com" } ```
   *
   * <p>You may also need to configure your IdP to generate tokens for your users to exchange with
   * Databricks, if your users do not already have the ability to generate tokens that are
   * compatible with your federation policy.
   *
   * <p>You do not need to configure an OAuth application in Databricks to use token federation.
   *
   * <p>[SCIM]: https://docs.databricks.com/admin/users-groups/scim/index.html
   */
  public AccountFederationPolicyAPI federationPolicy() {
    return federationPolicyAPI;
  }

  /**
   * Groups simplify identity management, making it easier to assign access to Databricks account,
   * data, and other securable objects.
   *
   * <p>It is best practice to assign access to workspaces and access-control policies in Unity
   * Catalog to groups, instead of to users individually. All Databricks account identities can be
   * assigned as members of groups, and members inherit permissions that are assigned to their
   * group.
   */
  public AccountGroupsV2API groupsV2() {
    return groupsV2API;
  }

  /**
   * These APIs are used to manage identities and the workspace access of these identities in
   * <Databricks>.
   */
  public AccountIamV2API iamV2() {
    return iamV2API;
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
   * also provided to know the latest status of log delivery attempts.
   *
   * <p>The high-level flow of billable usage delivery:
   *
   * <p>1. **Create storage**: In AWS, [create a new AWS S3 bucket] with a specific bucket policy.
   * Using Databricks APIs, call the Account API to create a [storage configuration
   * object](:method:Storage/Create) that uses the bucket name.
   *
   * <p>2. **Create credentials**: In AWS, create the appropriate AWS IAM role. For full details,
   * including the required IAM role policies and trust relationship, see [Billable usage log
   * delivery]. Using Databricks APIs, call the Account API to create a [credential configuration
   * object](:method:Credentials/Create) that uses the IAM role's ARN.
   *
   * <p>3. **Create log delivery configuration**: Using Databricks APIs, call the Account API to
   * [create a log delivery configuration](:method:LogDelivery/Create) that uses the credential and
   * storage configuration objects from previous steps. You can specify if the logs should include
   * all events of that log type in your account (_Account level_ delivery) or only events for a
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
   */
  public LogDeliveryAPI logDelivery() {
    return logDeliveryAPI;
  }

  /** These APIs manage metastore assignments to a workspace. */
  public AccountMetastoreAssignmentsAPI metastoreAssignments() {
    return metastoreAssignmentsAPI;
  }

  /**
   * These APIs manage Unity Catalog metastores for an account. A metastore contains catalogs that
   * can be associated with workspaces
   */
  public AccountMetastoresAPI metastores() {
    return metastoresAPI;
  }

  /**
   * These APIs provide configurations for the network connectivity of your workspaces for
   * serverless compute resources. This API provides stable subnets for your workspace so that you
   * can configure your firewalls on your Azure Storage accounts to allow access from Databricks.
   * You can also use the API to provision private endpoints for Databricks to privately connect
   * serverless compute resources to your Azure resources using Azure Private Link. See [configure
   * serverless secure connectivity].
   *
   * <p>[configure serverless secure connectivity]:
   * https://learn.microsoft.com/azure/databricks/security/network/serverless-network-security
   */
  public NetworkConnectivityAPI networkConnectivity() {
    return networkConnectivityAPI;
  }

  /**
   * These APIs manage network policies for this account. Network policies control which network
   * destinations can be accessed from the Databricks environment. Each Databricks account includes
   * a default policy named 'default-policy'. 'default-policy' is associated with any workspace
   * lacking an explicit network policy assignment, and is automatically associated with each newly
   * created workspace. 'default-policy' is reserved and cannot be deleted, but it can be updated to
   * customize the default network access rules for your account.
   */
  public NetworkPoliciesAPI networkPolicies() {
    return networkPoliciesAPI;
  }

  /**
   * These APIs manage network configurations for customer-managed VPCs (optional). Its ID is used
   * when creating a new workspace if you use customer-managed VPCs.
   */
  public NetworksAPI networks() {
    return networksAPI;
  }

  /**
   * These APIs enable administrators to view all the available published OAuth applications in
   * Databricks. Administrators can add the published OAuth applications to their account through
   * the OAuth Published App Integration APIs.
   */
  public OAuthPublishedAppsAPI oAuthPublishedApps() {
    return oAuthPublishedAppsAPI;
  }

  /** These APIs manage private access settings for this account. */
  public PrivateAccessAPI privateAccess() {
    return privateAccessAPI;
  }

  /**
   * These APIs enable administrators to manage published OAuth app integrations, which is required
   * for adding/using Published OAuth App Integration like Tableau Desktop for Databricks in AWS
   * cloud.
   */
  public PublishedAppIntegrationAPI publishedAppIntegration() {
    return publishedAppIntegrationAPI;
  }

  /**
   * These APIs manage service principal federation policies.
   *
   * <p>Service principal federation, also known as Workload Identity Federation, allows your
   * automated workloads running outside of Databricks to securely access Databricks APIs without
   * the need for Databricks secrets. With Workload Identity Federation, your application (or
   * workload) authenticates to Databricks as a Databricks service principal, using tokens provided
   * by the workload runtime.
   *
   * <p>Databricks strongly recommends using Workload Identity Federation to authenticate to
   * Databricks from automated workloads, over alternatives such as OAuth client secrets or Personal
   * Access Tokens, whenever possible. Workload Identity Federation is supported by many popular
   * services, including Github Actions, Azure DevOps, GitLab, Terraform Cloud, and Kubernetes
   * clusters, among others.
   *
   * <p>Workload identity federation is configured in your Databricks account using a service
   * principal federation policy. A service principal federation policy specifies: * which IdP, or
   * issuer, the service principal is allowed to authenticate from * which workload identity, or
   * subject, is allowed to authenticate as the Databricks service principal
   *
   * <p>To configure a federation policy, you provide the following: * The required token
   * __issuer__, as specified in the “iss” claim of workload identity tokens. The issuer is an https
   * URL that identifies the workload identity provider. * The required token __subject__, as
   * specified in the “sub” claim of workload identity tokens. The subject uniquely identifies the
   * workload in the workload runtime environment. * The allowed token __audiences__, as specified
   * in the “aud” claim of workload identity tokens. The audience is intended to represent the
   * recipient of the token. As long as the audience in the token matches at least one audience in
   * the policy, the token is considered a match. If unspecified, the default value is your
   * Databricks account id. * Optionally, the public keys used to validate the signature of the
   * workload identity tokens, in JWKS format. If unspecified (recommended), Databricks
   * automatically fetches the public keys from the issuer’s well known endpoint. Databricks
   * strongly recommends relying on the issuer’s well known endpoint for discovering public keys.
   *
   * <p>An example service principal federation policy, for a Github Actions workload, is: ```
   * issuer: "https://token.actions.githubusercontent.com" audiences:
   * ["https://github.com/my-github-org"] subject: "repo:my-github-org/my-repo:environment:prod" ```
   *
   * <p>An example JWT token body that matches this policy and could be used to authenticate to
   * Databricks is: ``` { "iss": "https://token.actions.githubusercontent.com", "aud":
   * "https://github.com/my-github-org", "sub": "repo:my-github-org/my-repo:environment:prod" } ```
   *
   * <p>You may also need to configure the workload runtime to generate tokens for your workloads.
   *
   * <p>You do not need to configure an OAuth application in Databricks to use token federation.
   */
  public ServicePrincipalFederationPolicyAPI servicePrincipalFederationPolicy() {
    return servicePrincipalFederationPolicyAPI;
  }

  /**
   * These APIs enable administrators to manage service principal secrets.
   *
   * <p>You can use the generated secrets to obtain OAuth access tokens for a service principal,
   * which can then be used to access Databricks Accounts and Workspace APIs. For more information,
   * see [Authentication using OAuth tokens for service principals].
   *
   * <p>In addition, the generated secrets can be used to configure the Databricks Terraform
   * Provider to authenticate with the service principal. For more information, see [Databricks
   * Terraform Provider].
   *
   * <p>[Authentication using OAuth tokens for service principals]:
   * https://docs.databricks.com/dev-tools/authentication-oauth.html [Databricks Terraform
   * Provider]:
   * https://github.com/databricks/terraform-provider-databricks/blob/master/docs/index.md#authenticating-with-service-principal
   */
  public ServicePrincipalSecretsAPI servicePrincipalSecrets() {
    return servicePrincipalSecretsAPI;
  }

  /**
   * Identities for use with jobs, automated tools, and systems such as scripts, apps, and CI/CD
   * platforms. Databricks recommends creating service principals to run production jobs or modify
   * production data. If all processes that act on production data run with service principals,
   * interactive users do not need any write, delete, or modify privileges in production. This
   * eliminates the risk of a user overwriting production data by accident.
   */
  public AccountServicePrincipalsV2API servicePrincipalsV2() {
    return servicePrincipalsV2API;
  }

  /** Accounts Settings API allows users to manage settings at the account level. */
  public AccountSettingsAPI settings() {
    return settingsAPI;
  }

  /** APIs to manage account level settings */
  public AccountSettingsV2API settingsV2() {
    return settingsV2API;
  }

  /**
   * These APIs manage storage configurations for this workspace. A root storage S3 bucket in your
   * account is required to store objects like cluster logs, notebook revisions, and job results.
   * You can also use the root storage S3 bucket for storage of non-production DBFS data. A storage
   * configuration encapsulates this bucket information, and its ID is used when creating a new
   * workspace.
   */
  public StorageAPI storage() {
    return storageAPI;
  }

  /** These APIs manage storage credentials for a particular metastore. */
  public AccountStorageCredentialsAPI storageCredentials() {
    return storageCredentialsAPI;
  }

  /**
   * These APIs manage usage dashboards for this account. Usage dashboards enable you to gain
   * insights into your usage with pre-built dashboards: visualize breakdowns, analyze tag
   * attributions, and identify cost drivers.
   */
  public UsageDashboardsAPI usageDashboards() {
    return usageDashboardsAPI;
  }

  /**
   * User identities recognized by Databricks and represented by email addresses.
   *
   * <p>Databricks recommends using SCIM provisioning to sync users and groups automatically from
   * your identity provider to your Databricks account. SCIM streamlines onboarding a new employee
   * or team by using your identity provider to create users and groups in Databricks account and
   * give them the proper level of access. When a user leaves your organization or no longer needs
   * access to Databricks account, admins can terminate the user in your identity provider and that
   * user’s account will also be removed from Databricks account. This ensures a consistent
   * offboarding process and prevents unauthorized users from accessing sensitive data.
   */
  public AccountUsersV2API usersV2() {
    return usersV2API;
  }

  /** These APIs manage VPC endpoint configurations for this account. */
  public VpcEndpointsAPI vpcEndpoints() {
    return vpcEndpointsAPI;
  }

  /**
   * The Workspace Permission Assignment API allows you to manage workspace permissions for
   * principals in your account.
   */
  public WorkspaceAssignmentAPI workspaceAssignment() {
    return workspaceAssignmentAPI;
  }

  /**
   * These APIs allow configuration of network settings for Databricks workspaces by selecting which
   * network policy to associate with the workspace. Each workspace is always associated with
   * exactly one network policy that controls which network destinations can be accessed from the
   * Databricks environment. By default, workspaces are associated with the 'default-policy' network
   * policy. You cannot create or delete a workspace's network option, only update it to associate
   * the workspace with a different policy
   */
  public WorkspaceNetworkConfigurationAPI workspaceNetworkConfiguration() {
    return workspaceNetworkConfigurationAPI;
  }

  /**
   * These APIs manage workspaces for this account. A Databricks workspace is an environment for
   * accessing all of your Databricks assets. The workspace organizes objects (notebooks, libraries,
   * and experiments) into folders, and provides access to data and computational resources such as
   * clusters and jobs.
   *
   * <p>These endpoints are available if your account is on the E2 version of the platform or on a
   * select custom plan that allows multiple workspaces per account.
   */
  public WorkspacesAPI workspaces() {
    return workspacesAPI;
  }

  /**
   * Groups simplify identity management, making it easier to assign access to Databricks account,
   * data, and other securable objects.
   *
   * <p>It is best practice to assign access to workspaces and access-control policies in Unity
   * Catalog to groups, instead of to users individually. All Databricks account identities can be
   * assigned as members of groups, and members inherit permissions that are assigned to their
   * group.
   */
  public AccountGroupsAPI groups() {
    return groupsAPI;
  }
  /**
   * Identities for use with jobs, automated tools, and systems such as scripts, apps, and CI/CD
   * platforms. Databricks recommends creating service principals to run production jobs or modify
   * production data. If all processes that act on production data run with service principals,
   * interactive users do not need any write, delete, or modify privileges in production. This
   * eliminates the risk of a user overwriting production data by accident.
   */
  public AccountServicePrincipalsAPI servicePrincipals() {
    return servicePrincipalsAPI;
  }
  /**
   * User identities recognized by Databricks and represented by email addresses.
   *
   * <p>Databricks recommends using SCIM provisioning to sync users and groups automatically from
   * your identity provider to your Databricks account. SCIM streamlines onboarding a new employee
   * or team by using your identity provider to create users and groups in Databricks account and
   * give them the proper level of access. When a user leaves your organization or no longer needs
   * access to Databricks account, admins can terminate the user in your identity provider and that
   * user’s account will also be removed from Databricks account. This ensures a consistent
   * offboarding process and prevents unauthorized users from accessing sensitive data.
   */
  public AccountUsersAPI users() {
    return usersAPI;
  }

  /** Replace the default AccountAccessControlService with a custom implementation. */
  public AccountClient withAccessControlImpl(AccountAccessControlService accountAccessControl) {
    return this.withAccessControlAPI(new AccountAccessControlAPI(accountAccessControl));
  }

  /** Replace the default AccountAccessControlAPI with a custom implementation. */
  public AccountClient withAccessControlAPI(AccountAccessControlAPI accountAccessControl) {
    this.accessControlAPI = accountAccessControl;
    return this;
  }

  /** Replace the default BillableUsageService with a custom implementation. */
  public AccountClient withBillableUsageImpl(BillableUsageService billableUsage) {
    return this.withBillableUsageAPI(new BillableUsageAPI(billableUsage));
  }

  /** Replace the default BillableUsageAPI with a custom implementation. */
  public AccountClient withBillableUsageAPI(BillableUsageAPI billableUsage) {
    this.billableUsageAPI = billableUsage;
    return this;
  }

  /** Replace the default BudgetPolicyService with a custom implementation. */
  public AccountClient withBudgetPolicyImpl(BudgetPolicyService budgetPolicy) {
    return this.withBudgetPolicyAPI(new BudgetPolicyAPI(budgetPolicy));
  }

  /** Replace the default BudgetPolicyAPI with a custom implementation. */
  public AccountClient withBudgetPolicyAPI(BudgetPolicyAPI budgetPolicy) {
    this.budgetPolicyAPI = budgetPolicy;
    return this;
  }

  /** Replace the default BudgetsService with a custom implementation. */
  public AccountClient withBudgetsImpl(BudgetsService budgets) {
    return this.withBudgetsAPI(new BudgetsAPI(budgets));
  }

  /** Replace the default BudgetsAPI with a custom implementation. */
  public AccountClient withBudgetsAPI(BudgetsAPI budgets) {
    this.budgetsAPI = budgets;
    return this;
  }

  /** Replace the default CredentialsService with a custom implementation. */
  public AccountClient withCredentialsImpl(CredentialsService credentials) {
    return this.withCredentialsAPI(new CredentialsAPI(credentials));
  }

  /** Replace the default CredentialsAPI with a custom implementation. */
  public AccountClient withCredentialsAPI(CredentialsAPI credentials) {
    this.credentialsAPI = credentials;
    return this;
  }

  /** Replace the default CustomAppIntegrationService with a custom implementation. */
  public AccountClient withCustomAppIntegrationImpl(
      CustomAppIntegrationService customAppIntegration) {
    return this.withCustomAppIntegrationAPI(new CustomAppIntegrationAPI(customAppIntegration));
  }

  /** Replace the default CustomAppIntegrationAPI with a custom implementation. */
  public AccountClient withCustomAppIntegrationAPI(CustomAppIntegrationAPI customAppIntegration) {
    this.customAppIntegrationAPI = customAppIntegration;
    return this;
  }

  /** Replace the default EncryptionKeysService with a custom implementation. */
  public AccountClient withEncryptionKeysImpl(EncryptionKeysService encryptionKeys) {
    return this.withEncryptionKeysAPI(new EncryptionKeysAPI(encryptionKeys));
  }

  /** Replace the default EncryptionKeysAPI with a custom implementation. */
  public AccountClient withEncryptionKeysAPI(EncryptionKeysAPI encryptionKeys) {
    this.encryptionKeysAPI = encryptionKeys;
    return this;
  }

  /** Replace the default EndpointsService with a custom implementation. */
  public AccountClient withEndpointsImpl(EndpointsService endpoints) {
    return this.withEndpointsAPI(new EndpointsAPI(endpoints));
  }

  /** Replace the default EndpointsAPI with a custom implementation. */
  public AccountClient withEndpointsAPI(EndpointsAPI endpoints) {
    this.endpointsAPI = endpoints;
    return this;
  }

  /** Replace the default AccountFederationPolicyService with a custom implementation. */
  public AccountClient withFederationPolicyImpl(
      AccountFederationPolicyService accountFederationPolicy) {
    return this.withFederationPolicyAPI(new AccountFederationPolicyAPI(accountFederationPolicy));
  }

  /** Replace the default AccountFederationPolicyAPI with a custom implementation. */
  public AccountClient withFederationPolicyAPI(AccountFederationPolicyAPI accountFederationPolicy) {
    this.federationPolicyAPI = accountFederationPolicy;
    return this;
  }

  /** Replace the default AccountGroupsV2Service with a custom implementation. */
  public AccountClient withGroupsV2Impl(AccountGroupsV2Service accountGroupsV2) {
    return this.withGroupsV2API(new AccountGroupsV2API(accountGroupsV2));
  }

  /** Replace the default AccountGroupsV2API with a custom implementation. */
  public AccountClient withGroupsV2API(AccountGroupsV2API accountGroupsV2) {
    this.groupsV2API = accountGroupsV2;
    return this;
  }

  /** Replace the default AccountIamV2Service with a custom implementation. */
  public AccountClient withIamV2Impl(AccountIamV2Service accountIamV2) {
    return this.withIamV2API(new AccountIamV2API(accountIamV2));
  }

  /** Replace the default AccountIamV2API with a custom implementation. */
  public AccountClient withIamV2API(AccountIamV2API accountIamV2) {
    this.iamV2API = accountIamV2;
    return this;
  }

  /** Replace the default AccountIpAccessListsService with a custom implementation. */
  public AccountClient withIpAccessListsImpl(AccountIpAccessListsService accountIpAccessLists) {
    return this.withIpAccessListsAPI(new AccountIpAccessListsAPI(accountIpAccessLists));
  }

  /** Replace the default AccountIpAccessListsAPI with a custom implementation. */
  public AccountClient withIpAccessListsAPI(AccountIpAccessListsAPI accountIpAccessLists) {
    this.ipAccessListsAPI = accountIpAccessLists;
    return this;
  }

  /** Replace the default LogDeliveryService with a custom implementation. */
  public AccountClient withLogDeliveryImpl(LogDeliveryService logDelivery) {
    return this.withLogDeliveryAPI(new LogDeliveryAPI(logDelivery));
  }

  /** Replace the default LogDeliveryAPI with a custom implementation. */
  public AccountClient withLogDeliveryAPI(LogDeliveryAPI logDelivery) {
    this.logDeliveryAPI = logDelivery;
    return this;
  }

  /** Replace the default AccountMetastoreAssignmentsService with a custom implementation. */
  public AccountClient withMetastoreAssignmentsImpl(
      AccountMetastoreAssignmentsService accountMetastoreAssignments) {
    return this.withMetastoreAssignmentsAPI(
        new AccountMetastoreAssignmentsAPI(accountMetastoreAssignments));
  }

  /** Replace the default AccountMetastoreAssignmentsAPI with a custom implementation. */
  public AccountClient withMetastoreAssignmentsAPI(
      AccountMetastoreAssignmentsAPI accountMetastoreAssignments) {
    this.metastoreAssignmentsAPI = accountMetastoreAssignments;
    return this;
  }

  /** Replace the default AccountMetastoresService with a custom implementation. */
  public AccountClient withMetastoresImpl(AccountMetastoresService accountMetastores) {
    return this.withMetastoresAPI(new AccountMetastoresAPI(accountMetastores));
  }

  /** Replace the default AccountMetastoresAPI with a custom implementation. */
  public AccountClient withMetastoresAPI(AccountMetastoresAPI accountMetastores) {
    this.metastoresAPI = accountMetastores;
    return this;
  }

  /** Replace the default NetworkConnectivityService with a custom implementation. */
  public AccountClient withNetworkConnectivityImpl(NetworkConnectivityService networkConnectivity) {
    return this.withNetworkConnectivityAPI(new NetworkConnectivityAPI(networkConnectivity));
  }

  /** Replace the default NetworkConnectivityAPI with a custom implementation. */
  public AccountClient withNetworkConnectivityAPI(NetworkConnectivityAPI networkConnectivity) {
    this.networkConnectivityAPI = networkConnectivity;
    return this;
  }

  /** Replace the default NetworkPoliciesService with a custom implementation. */
  public AccountClient withNetworkPoliciesImpl(NetworkPoliciesService networkPolicies) {
    return this.withNetworkPoliciesAPI(new NetworkPoliciesAPI(networkPolicies));
  }

  /** Replace the default NetworkPoliciesAPI with a custom implementation. */
  public AccountClient withNetworkPoliciesAPI(NetworkPoliciesAPI networkPolicies) {
    this.networkPoliciesAPI = networkPolicies;
    return this;
  }

  /** Replace the default NetworksService with a custom implementation. */
  public AccountClient withNetworksImpl(NetworksService networks) {
    return this.withNetworksAPI(new NetworksAPI(networks));
  }

  /** Replace the default NetworksAPI with a custom implementation. */
  public AccountClient withNetworksAPI(NetworksAPI networks) {
    this.networksAPI = networks;
    return this;
  }

  /** Replace the default OAuthPublishedAppsService with a custom implementation. */
  public AccountClient withOAuthPublishedAppsImpl(OAuthPublishedAppsService oAuthPublishedApps) {
    return this.withOAuthPublishedAppsAPI(new OAuthPublishedAppsAPI(oAuthPublishedApps));
  }

  /** Replace the default OAuthPublishedAppsAPI with a custom implementation. */
  public AccountClient withOAuthPublishedAppsAPI(OAuthPublishedAppsAPI oAuthPublishedApps) {
    this.oAuthPublishedAppsAPI = oAuthPublishedApps;
    return this;
  }

  /** Replace the default PrivateAccessService with a custom implementation. */
  public AccountClient withPrivateAccessImpl(PrivateAccessService privateAccess) {
    return this.withPrivateAccessAPI(new PrivateAccessAPI(privateAccess));
  }

  /** Replace the default PrivateAccessAPI with a custom implementation. */
  public AccountClient withPrivateAccessAPI(PrivateAccessAPI privateAccess) {
    this.privateAccessAPI = privateAccess;
    return this;
  }

  /** Replace the default PublishedAppIntegrationService with a custom implementation. */
  public AccountClient withPublishedAppIntegrationImpl(
      PublishedAppIntegrationService publishedAppIntegration) {
    return this.withPublishedAppIntegrationAPI(
        new PublishedAppIntegrationAPI(publishedAppIntegration));
  }

  /** Replace the default PublishedAppIntegrationAPI with a custom implementation. */
  public AccountClient withPublishedAppIntegrationAPI(
      PublishedAppIntegrationAPI publishedAppIntegration) {
    this.publishedAppIntegrationAPI = publishedAppIntegration;
    return this;
  }

  /** Replace the default ServicePrincipalFederationPolicyService with a custom implementation. */
  public AccountClient withServicePrincipalFederationPolicyImpl(
      ServicePrincipalFederationPolicyService servicePrincipalFederationPolicy) {
    return this.withServicePrincipalFederationPolicyAPI(
        new ServicePrincipalFederationPolicyAPI(servicePrincipalFederationPolicy));
  }

  /** Replace the default ServicePrincipalFederationPolicyAPI with a custom implementation. */
  public AccountClient withServicePrincipalFederationPolicyAPI(
      ServicePrincipalFederationPolicyAPI servicePrincipalFederationPolicy) {
    this.servicePrincipalFederationPolicyAPI = servicePrincipalFederationPolicy;
    return this;
  }

  /** Replace the default ServicePrincipalSecretsService with a custom implementation. */
  public AccountClient withServicePrincipalSecretsImpl(
      ServicePrincipalSecretsService servicePrincipalSecrets) {
    return this.withServicePrincipalSecretsAPI(
        new ServicePrincipalSecretsAPI(servicePrincipalSecrets));
  }

  /** Replace the default ServicePrincipalSecretsAPI with a custom implementation. */
  public AccountClient withServicePrincipalSecretsAPI(
      ServicePrincipalSecretsAPI servicePrincipalSecrets) {
    this.servicePrincipalSecretsAPI = servicePrincipalSecrets;
    return this;
  }

  /** Replace the default AccountServicePrincipalsV2Service with a custom implementation. */
  public AccountClient withServicePrincipalsV2Impl(
      AccountServicePrincipalsV2Service accountServicePrincipalsV2) {
    return this.withServicePrincipalsV2API(
        new AccountServicePrincipalsV2API(accountServicePrincipalsV2));
  }

  /** Replace the default AccountServicePrincipalsV2API with a custom implementation. */
  public AccountClient withServicePrincipalsV2API(
      AccountServicePrincipalsV2API accountServicePrincipalsV2) {
    this.servicePrincipalsV2API = accountServicePrincipalsV2;
    return this;
  }

  /** Replace the default AccountSettingsService with a custom implementation. */
  public AccountClient withSettingsImpl(AccountSettingsService accountSettings) {
    return this.withSettingsAPI(new AccountSettingsAPI(accountSettings));
  }

  /** Replace the default AccountSettingsAPI with a custom implementation. */
  public AccountClient withSettingsAPI(AccountSettingsAPI accountSettings) {
    this.settingsAPI = accountSettings;
    return this;
  }

  /** Replace the default AccountSettingsV2Service with a custom implementation. */
  public AccountClient withSettingsV2Impl(AccountSettingsV2Service accountSettingsV2) {
    return this.withSettingsV2API(new AccountSettingsV2API(accountSettingsV2));
  }

  /** Replace the default AccountSettingsV2API with a custom implementation. */
  public AccountClient withSettingsV2API(AccountSettingsV2API accountSettingsV2) {
    this.settingsV2API = accountSettingsV2;
    return this;
  }

  /** Replace the default StorageService with a custom implementation. */
  public AccountClient withStorageImpl(StorageService storage) {
    return this.withStorageAPI(new StorageAPI(storage));
  }

  /** Replace the default StorageAPI with a custom implementation. */
  public AccountClient withStorageAPI(StorageAPI storage) {
    this.storageAPI = storage;
    return this;
  }

  /** Replace the default AccountStorageCredentialsService with a custom implementation. */
  public AccountClient withStorageCredentialsImpl(
      AccountStorageCredentialsService accountStorageCredentials) {
    return this.withStorageCredentialsAPI(
        new AccountStorageCredentialsAPI(accountStorageCredentials));
  }

  /** Replace the default AccountStorageCredentialsAPI with a custom implementation. */
  public AccountClient withStorageCredentialsAPI(
      AccountStorageCredentialsAPI accountStorageCredentials) {
    this.storageCredentialsAPI = accountStorageCredentials;
    return this;
  }

  /** Replace the default UsageDashboardsService with a custom implementation. */
  public AccountClient withUsageDashboardsImpl(UsageDashboardsService usageDashboards) {
    return this.withUsageDashboardsAPI(new UsageDashboardsAPI(usageDashboards));
  }

  /** Replace the default UsageDashboardsAPI with a custom implementation. */
  public AccountClient withUsageDashboardsAPI(UsageDashboardsAPI usageDashboards) {
    this.usageDashboardsAPI = usageDashboards;
    return this;
  }

  /** Replace the default AccountUsersV2Service with a custom implementation. */
  public AccountClient withUsersV2Impl(AccountUsersV2Service accountUsersV2) {
    return this.withUsersV2API(new AccountUsersV2API(accountUsersV2));
  }

  /** Replace the default AccountUsersV2API with a custom implementation. */
  public AccountClient withUsersV2API(AccountUsersV2API accountUsersV2) {
    this.usersV2API = accountUsersV2;
    return this;
  }

  /** Replace the default VpcEndpointsService with a custom implementation. */
  public AccountClient withVpcEndpointsImpl(VpcEndpointsService vpcEndpoints) {
    return this.withVpcEndpointsAPI(new VpcEndpointsAPI(vpcEndpoints));
  }

  /** Replace the default VpcEndpointsAPI with a custom implementation. */
  public AccountClient withVpcEndpointsAPI(VpcEndpointsAPI vpcEndpoints) {
    this.vpcEndpointsAPI = vpcEndpoints;
    return this;
  }

  /** Replace the default WorkspaceAssignmentService with a custom implementation. */
  public AccountClient withWorkspaceAssignmentImpl(WorkspaceAssignmentService workspaceAssignment) {
    return this.withWorkspaceAssignmentAPI(new WorkspaceAssignmentAPI(workspaceAssignment));
  }

  /** Replace the default WorkspaceAssignmentAPI with a custom implementation. */
  public AccountClient withWorkspaceAssignmentAPI(WorkspaceAssignmentAPI workspaceAssignment) {
    this.workspaceAssignmentAPI = workspaceAssignment;
    return this;
  }

  /** Replace the default WorkspaceNetworkConfigurationService with a custom implementation. */
  public AccountClient withWorkspaceNetworkConfigurationImpl(
      WorkspaceNetworkConfigurationService workspaceNetworkConfiguration) {
    return this.withWorkspaceNetworkConfigurationAPI(
        new WorkspaceNetworkConfigurationAPI(workspaceNetworkConfiguration));
  }

  /** Replace the default WorkspaceNetworkConfigurationAPI with a custom implementation. */
  public AccountClient withWorkspaceNetworkConfigurationAPI(
      WorkspaceNetworkConfigurationAPI workspaceNetworkConfiguration) {
    this.workspaceNetworkConfigurationAPI = workspaceNetworkConfiguration;
    return this;
  }

  /** Replace the default WorkspacesService with a custom implementation. */
  public AccountClient withWorkspacesImpl(WorkspacesService workspaces) {
    return this.withWorkspacesAPI(new WorkspacesAPI(workspaces));
  }

  /** Replace the default WorkspacesAPI with a custom implementation. */
  public AccountClient withWorkspacesAPI(WorkspacesAPI workspaces) {
    this.workspacesAPI = workspaces;
    return this;
  }

  /** Replace the default AccountGroupsService with a custom implementation. */
  public AccountClient withGroupsImpl(AccountGroupsService accountGroups) {
    return this.withGroupsAPI(new AccountGroupsAPI(accountGroups));
  }

  /** Replace the default AccountGroupsAPI with a custom implementation. */
  public AccountClient withGroupsAPI(AccountGroupsAPI accountGroups) {
    this.groupsAPI = accountGroups;
    return this;
  }

  /** Replace the default AccountServicePrincipalsService with a custom implementation. */
  public AccountClient withServicePrincipalsImpl(
      AccountServicePrincipalsService accountServicePrincipals) {
    return this.withServicePrincipalsAPI(new AccountServicePrincipalsAPI(accountServicePrincipals));
  }

  /** Replace the default AccountServicePrincipalsAPI with a custom implementation. */
  public AccountClient withServicePrincipalsAPI(
      AccountServicePrincipalsAPI accountServicePrincipals) {
    this.servicePrincipalsAPI = accountServicePrincipals;
    return this;
  }

  /** Replace the default AccountUsersService with a custom implementation. */
  public AccountClient withUsersImpl(AccountUsersService accountUsers) {
    return this.withUsersAPI(new AccountUsersAPI(accountUsers));
  }

  /** Replace the default AccountUsersAPI with a custom implementation. */
  public AccountClient withUsersAPI(AccountUsersAPI accountUsers) {
    this.usersAPI = accountUsers;
    return this;
  }

  public ApiClient apiClient() {
    return apiClient;
  }

  public DatabricksConfig config() {
    return config;
  }

  public WorkspaceClient getWorkspaceClient(Workspace workspace) {
    // For unified hosts, reuse the same host and set workspace ID
    if (this.config.getHostType() == HostType.UNIFIED) {
      this.config.setWorkspaceId(String.valueOf(workspace.getWorkspaceId()));
      return new WorkspaceClient(this.config);
    }

    // For traditional account hosts, get workspace deployment URL
    String host =
        this.config.getDatabricksEnvironment().getDeploymentUrl(workspace.getDeploymentName());
    DatabricksConfig config = this.config.newWithWorkspaceHost(host);
    AzureUtils.getAzureWorkspaceResourceId(workspace).map(config::setAzureWorkspaceResourceId);
    return new WorkspaceClient(config);
  }
}
