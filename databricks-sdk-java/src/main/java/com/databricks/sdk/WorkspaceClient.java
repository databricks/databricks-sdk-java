// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.ConfigLoader;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.mixin.ClustersExt;
import com.databricks.sdk.mixin.DbfsExt;
import com.databricks.sdk.mixin.SecretsExt;
import com.databricks.sdk.service.catalog.ArtifactAllowlistsAPI;
import com.databricks.sdk.service.catalog.ArtifactAllowlistsService;
import com.databricks.sdk.service.catalog.CatalogsAPI;
import com.databricks.sdk.service.catalog.CatalogsService;
import com.databricks.sdk.service.catalog.ConnectionsAPI;
import com.databricks.sdk.service.catalog.ConnectionsService;
import com.databricks.sdk.service.catalog.ExternalLocationsAPI;
import com.databricks.sdk.service.catalog.ExternalLocationsService;
import com.databricks.sdk.service.catalog.FunctionsAPI;
import com.databricks.sdk.service.catalog.FunctionsService;
import com.databricks.sdk.service.catalog.GrantsAPI;
import com.databricks.sdk.service.catalog.GrantsService;
import com.databricks.sdk.service.catalog.LakehouseMonitorsAPI;
import com.databricks.sdk.service.catalog.LakehouseMonitorsService;
import com.databricks.sdk.service.catalog.MetastoresAPI;
import com.databricks.sdk.service.catalog.MetastoresService;
import com.databricks.sdk.service.catalog.ModelVersionsAPI;
import com.databricks.sdk.service.catalog.ModelVersionsService;
import com.databricks.sdk.service.catalog.RegisteredModelsAPI;
import com.databricks.sdk.service.catalog.RegisteredModelsService;
import com.databricks.sdk.service.catalog.SchemasAPI;
import com.databricks.sdk.service.catalog.SchemasService;
import com.databricks.sdk.service.catalog.StorageCredentialsAPI;
import com.databricks.sdk.service.catalog.StorageCredentialsService;
import com.databricks.sdk.service.catalog.SystemSchemasAPI;
import com.databricks.sdk.service.catalog.SystemSchemasService;
import com.databricks.sdk.service.catalog.TableConstraintsAPI;
import com.databricks.sdk.service.catalog.TableConstraintsService;
import com.databricks.sdk.service.catalog.TablesAPI;
import com.databricks.sdk.service.catalog.TablesService;
import com.databricks.sdk.service.catalog.VolumesAPI;
import com.databricks.sdk.service.catalog.VolumesService;
import com.databricks.sdk.service.catalog.WorkspaceBindingsAPI;
import com.databricks.sdk.service.catalog.WorkspaceBindingsService;
import com.databricks.sdk.service.compute.ClusterPoliciesAPI;
import com.databricks.sdk.service.compute.ClusterPoliciesService;
import com.databricks.sdk.service.compute.ClustersService;
import com.databricks.sdk.service.compute.CommandExecutionAPI;
import com.databricks.sdk.service.compute.CommandExecutionService;
import com.databricks.sdk.service.compute.GlobalInitScriptsAPI;
import com.databricks.sdk.service.compute.GlobalInitScriptsService;
import com.databricks.sdk.service.compute.InstancePoolsAPI;
import com.databricks.sdk.service.compute.InstancePoolsService;
import com.databricks.sdk.service.compute.InstanceProfilesAPI;
import com.databricks.sdk.service.compute.InstanceProfilesService;
import com.databricks.sdk.service.compute.LibrariesAPI;
import com.databricks.sdk.service.compute.LibrariesService;
import com.databricks.sdk.service.compute.PolicyFamiliesAPI;
import com.databricks.sdk.service.compute.PolicyFamiliesService;
import com.databricks.sdk.service.dashboards.LakeviewAPI;
import com.databricks.sdk.service.dashboards.LakeviewService;
import com.databricks.sdk.service.files.DbfsService;
import com.databricks.sdk.service.files.FilesAPI;
import com.databricks.sdk.service.files.FilesService;
import com.databricks.sdk.service.iam.AccountAccessControlProxyAPI;
import com.databricks.sdk.service.iam.AccountAccessControlProxyService;
import com.databricks.sdk.service.iam.CurrentUserAPI;
import com.databricks.sdk.service.iam.CurrentUserService;
import com.databricks.sdk.service.iam.GroupsAPI;
import com.databricks.sdk.service.iam.GroupsService;
import com.databricks.sdk.service.iam.PermissionsAPI;
import com.databricks.sdk.service.iam.PermissionsService;
import com.databricks.sdk.service.iam.ServicePrincipalsAPI;
import com.databricks.sdk.service.iam.ServicePrincipalsService;
import com.databricks.sdk.service.iam.UsersAPI;
import com.databricks.sdk.service.iam.UsersService;
import com.databricks.sdk.service.jobs.JobsAPI;
import com.databricks.sdk.service.jobs.JobsService;
import com.databricks.sdk.service.ml.ExperimentsAPI;
import com.databricks.sdk.service.ml.ExperimentsService;
import com.databricks.sdk.service.ml.ModelRegistryAPI;
import com.databricks.sdk.service.ml.ModelRegistryService;
import com.databricks.sdk.service.pipelines.PipelinesAPI;
import com.databricks.sdk.service.pipelines.PipelinesService;
import com.databricks.sdk.service.serving.AppsAPI;
import com.databricks.sdk.service.serving.AppsService;
import com.databricks.sdk.service.serving.ServingEndpointsAPI;
import com.databricks.sdk.service.serving.ServingEndpointsService;
import com.databricks.sdk.service.settings.CredentialsManagerAPI;
import com.databricks.sdk.service.settings.CredentialsManagerService;
import com.databricks.sdk.service.settings.IpAccessListsAPI;
import com.databricks.sdk.service.settings.IpAccessListsService;
import com.databricks.sdk.service.settings.SettingsAPI;
import com.databricks.sdk.service.settings.SettingsService;
import com.databricks.sdk.service.settings.TokenManagementAPI;
import com.databricks.sdk.service.settings.TokenManagementService;
import com.databricks.sdk.service.settings.TokensAPI;
import com.databricks.sdk.service.settings.TokensService;
import com.databricks.sdk.service.settings.WorkspaceConfAPI;
import com.databricks.sdk.service.settings.WorkspaceConfService;
import com.databricks.sdk.service.sharing.CleanRoomsAPI;
import com.databricks.sdk.service.sharing.CleanRoomsService;
import com.databricks.sdk.service.sharing.ProvidersAPI;
import com.databricks.sdk.service.sharing.ProvidersService;
import com.databricks.sdk.service.sharing.RecipientActivationAPI;
import com.databricks.sdk.service.sharing.RecipientActivationService;
import com.databricks.sdk.service.sharing.RecipientsAPI;
import com.databricks.sdk.service.sharing.RecipientsService;
import com.databricks.sdk.service.sharing.SharesAPI;
import com.databricks.sdk.service.sharing.SharesService;
import com.databricks.sdk.service.sql.AlertsAPI;
import com.databricks.sdk.service.sql.AlertsService;
import com.databricks.sdk.service.sql.DashboardWidgetsAPI;
import com.databricks.sdk.service.sql.DashboardWidgetsService;
import com.databricks.sdk.service.sql.DashboardsAPI;
import com.databricks.sdk.service.sql.DashboardsService;
import com.databricks.sdk.service.sql.DataSourcesAPI;
import com.databricks.sdk.service.sql.DataSourcesService;
import com.databricks.sdk.service.sql.DbsqlPermissionsAPI;
import com.databricks.sdk.service.sql.DbsqlPermissionsService;
import com.databricks.sdk.service.sql.QueriesAPI;
import com.databricks.sdk.service.sql.QueriesService;
import com.databricks.sdk.service.sql.QueryHistoryAPI;
import com.databricks.sdk.service.sql.QueryHistoryService;
import com.databricks.sdk.service.sql.QueryVisualizationsAPI;
import com.databricks.sdk.service.sql.QueryVisualizationsService;
import com.databricks.sdk.service.sql.StatementExecutionAPI;
import com.databricks.sdk.service.sql.StatementExecutionService;
import com.databricks.sdk.service.sql.WarehousesAPI;
import com.databricks.sdk.service.sql.WarehousesService;
import com.databricks.sdk.service.vectorsearch.VectorSearchEndpointsAPI;
import com.databricks.sdk.service.vectorsearch.VectorSearchEndpointsService;
import com.databricks.sdk.service.vectorsearch.VectorSearchIndexesAPI;
import com.databricks.sdk.service.vectorsearch.VectorSearchIndexesService;
import com.databricks.sdk.service.workspace.GitCredentialsAPI;
import com.databricks.sdk.service.workspace.GitCredentialsService;
import com.databricks.sdk.service.workspace.ReposAPI;
import com.databricks.sdk.service.workspace.ReposService;
import com.databricks.sdk.service.workspace.SecretsService;
import com.databricks.sdk.service.workspace.WorkspaceAPI;
import com.databricks.sdk.service.workspace.WorkspaceService;
import com.databricks.sdk.support.Generated;

/** Entry point for accessing Databricks workspace-level APIs */
@Generated
public class WorkspaceClient {
  private final ApiClient apiClient;
  private final DatabricksConfig config;

  private AccountAccessControlProxyAPI accountAccessControlProxyAPI;
  private AlertsAPI alertsAPI;
  private AppsAPI appsAPI;
  private ArtifactAllowlistsAPI artifactAllowlistsAPI;
  private CatalogsAPI catalogsAPI;
  private CleanRoomsAPI cleanRoomsAPI;
  private ClusterPoliciesAPI clusterPoliciesAPI;
  private ClustersExt clustersAPI;
  private CommandExecutionAPI commandExecutionAPI;
  private ConnectionsAPI connectionsAPI;
  private CredentialsManagerAPI credentialsManagerAPI;
  private CurrentUserAPI currentUserAPI;
  private DashboardWidgetsAPI dashboardWidgetsAPI;
  private DashboardsAPI dashboardsAPI;
  private DataSourcesAPI dataSourcesAPI;
  private DbfsExt dbfsAPI;
  private DbsqlPermissionsAPI dbsqlPermissionsAPI;
  private ExperimentsAPI experimentsAPI;
  private ExternalLocationsAPI externalLocationsAPI;
  private FilesAPI filesAPI;
  private FunctionsAPI functionsAPI;
  private GitCredentialsAPI gitCredentialsAPI;
  private GlobalInitScriptsAPI globalInitScriptsAPI;
  private GrantsAPI grantsAPI;
  private GroupsAPI groupsAPI;
  private InstancePoolsAPI instancePoolsAPI;
  private InstanceProfilesAPI instanceProfilesAPI;
  private IpAccessListsAPI ipAccessListsAPI;
  private JobsAPI jobsAPI;
  private LakehouseMonitorsAPI lakehouseMonitorsAPI;
  private LakeviewAPI lakeviewAPI;
  private LibrariesAPI librariesAPI;
  private MetastoresAPI metastoresAPI;
  private ModelRegistryAPI modelRegistryAPI;
  private ModelVersionsAPI modelVersionsAPI;
  private PermissionsAPI permissionsAPI;
  private PipelinesAPI pipelinesAPI;
  private PolicyFamiliesAPI policyFamiliesAPI;
  private ProvidersAPI providersAPI;
  private QueriesAPI queriesAPI;
  private QueryHistoryAPI queryHistoryAPI;
  private QueryVisualizationsAPI queryVisualizationsAPI;
  private RecipientActivationAPI recipientActivationAPI;
  private RecipientsAPI recipientsAPI;
  private RegisteredModelsAPI registeredModelsAPI;
  private ReposAPI reposAPI;
  private SchemasAPI schemasAPI;
  private SecretsExt secretsAPI;
  private ServicePrincipalsAPI servicePrincipalsAPI;
  private ServingEndpointsAPI servingEndpointsAPI;
  private SettingsAPI settingsAPI;
  private SharesAPI sharesAPI;
  private StatementExecutionAPI statementExecutionAPI;
  private StorageCredentialsAPI storageCredentialsAPI;
  private SystemSchemasAPI systemSchemasAPI;
  private TableConstraintsAPI tableConstraintsAPI;
  private TablesAPI tablesAPI;
  private TokenManagementAPI tokenManagementAPI;
  private TokensAPI tokensAPI;
  private UsersAPI usersAPI;
  private VectorSearchEndpointsAPI vectorSearchEndpointsAPI;
  private VectorSearchIndexesAPI vectorSearchIndexesAPI;
  private VolumesAPI volumesAPI;
  private WarehousesAPI warehousesAPI;
  private WorkspaceAPI workspaceAPI;
  private WorkspaceBindingsAPI workspaceBindingsAPI;
  private WorkspaceConfAPI workspaceConfAPI;

  public WorkspaceClient() {
    this(ConfigLoader.getDefault());
  }

  public WorkspaceClient(DatabricksConfig config) {
    this.config = config;
    apiClient = new ApiClient(config);

    accountAccessControlProxyAPI = new AccountAccessControlProxyAPI(apiClient);
    alertsAPI = new AlertsAPI(apiClient);
    appsAPI = new AppsAPI(apiClient);
    artifactAllowlistsAPI = new ArtifactAllowlistsAPI(apiClient);
    catalogsAPI = new CatalogsAPI(apiClient);
    cleanRoomsAPI = new CleanRoomsAPI(apiClient);
    clusterPoliciesAPI = new ClusterPoliciesAPI(apiClient);
    clustersAPI = new ClustersExt(apiClient);
    commandExecutionAPI = new CommandExecutionAPI(apiClient);
    connectionsAPI = new ConnectionsAPI(apiClient);
    credentialsManagerAPI = new CredentialsManagerAPI(apiClient);
    currentUserAPI = new CurrentUserAPI(apiClient);
    dashboardWidgetsAPI = new DashboardWidgetsAPI(apiClient);
    dashboardsAPI = new DashboardsAPI(apiClient);
    dataSourcesAPI = new DataSourcesAPI(apiClient);
    dbfsAPI = new DbfsExt(apiClient);
    dbsqlPermissionsAPI = new DbsqlPermissionsAPI(apiClient);
    experimentsAPI = new ExperimentsAPI(apiClient);
    externalLocationsAPI = new ExternalLocationsAPI(apiClient);
    filesAPI = new FilesAPI(apiClient);
    functionsAPI = new FunctionsAPI(apiClient);
    gitCredentialsAPI = new GitCredentialsAPI(apiClient);
    globalInitScriptsAPI = new GlobalInitScriptsAPI(apiClient);
    grantsAPI = new GrantsAPI(apiClient);
    groupsAPI = new GroupsAPI(apiClient);
    instancePoolsAPI = new InstancePoolsAPI(apiClient);
    instanceProfilesAPI = new InstanceProfilesAPI(apiClient);
    ipAccessListsAPI = new IpAccessListsAPI(apiClient);
    jobsAPI = new JobsAPI(apiClient);
    lakehouseMonitorsAPI = new LakehouseMonitorsAPI(apiClient);
    lakeviewAPI = new LakeviewAPI(apiClient);
    librariesAPI = new LibrariesAPI(apiClient);
    metastoresAPI = new MetastoresAPI(apiClient);
    modelRegistryAPI = new ModelRegistryAPI(apiClient);
    modelVersionsAPI = new ModelVersionsAPI(apiClient);
    permissionsAPI = new PermissionsAPI(apiClient);
    pipelinesAPI = new PipelinesAPI(apiClient);
    policyFamiliesAPI = new PolicyFamiliesAPI(apiClient);
    providersAPI = new ProvidersAPI(apiClient);
    queriesAPI = new QueriesAPI(apiClient);
    queryHistoryAPI = new QueryHistoryAPI(apiClient);
    queryVisualizationsAPI = new QueryVisualizationsAPI(apiClient);
    recipientActivationAPI = new RecipientActivationAPI(apiClient);
    recipientsAPI = new RecipientsAPI(apiClient);
    registeredModelsAPI = new RegisteredModelsAPI(apiClient);
    reposAPI = new ReposAPI(apiClient);
    schemasAPI = new SchemasAPI(apiClient);
    secretsAPI = new SecretsExt(apiClient);
    servicePrincipalsAPI = new ServicePrincipalsAPI(apiClient);
    servingEndpointsAPI = new ServingEndpointsAPI(apiClient);
    settingsAPI = new SettingsAPI(apiClient);
    sharesAPI = new SharesAPI(apiClient);
    statementExecutionAPI = new StatementExecutionAPI(apiClient);
    storageCredentialsAPI = new StorageCredentialsAPI(apiClient);
    systemSchemasAPI = new SystemSchemasAPI(apiClient);
    tableConstraintsAPI = new TableConstraintsAPI(apiClient);
    tablesAPI = new TablesAPI(apiClient);
    tokenManagementAPI = new TokenManagementAPI(apiClient);
    tokensAPI = new TokensAPI(apiClient);
    usersAPI = new UsersAPI(apiClient);
    vectorSearchEndpointsAPI = new VectorSearchEndpointsAPI(apiClient);
    vectorSearchIndexesAPI = new VectorSearchIndexesAPI(apiClient);
    volumesAPI = new VolumesAPI(apiClient);
    warehousesAPI = new WarehousesAPI(apiClient);
    workspaceAPI = new WorkspaceAPI(apiClient);
    workspaceBindingsAPI = new WorkspaceBindingsAPI(apiClient);
    workspaceConfAPI = new WorkspaceConfAPI(apiClient);
  }

  /** Constructor for mocks */
  public WorkspaceClient(boolean mock) {
    this(mock, null /* apiClient */);
  }

  /** Constructor for mocks */
  public WorkspaceClient(boolean mock, ApiClient apiClient) {
    this.apiClient = apiClient;
    this.config = null;
  }

  /**
   * These APIs manage access rules on resources in an account. Currently, only grant rules are
   * supported. A grant rule specifies a role assigned to a set of principals. A list of rules
   * attached to a resource is called a rule set. A workspace must belong to an account for these
   * APIs to work.
   */
  public AccountAccessControlProxyAPI accountAccessControlProxy() {
    return accountAccessControlProxyAPI;
  }

  /**
   * The alerts API can be used to perform CRUD operations on alerts. An alert is a Databricks SQL
   * object that periodically runs a query, evaluates a condition of its result, and notifies one or
   * more users and/or notification destinations if the condition was met. Alerts can be scheduled
   * using the `sql_task` type of the Jobs API, e.g. :method:jobs/create.
   */
  public AlertsAPI alerts() {
    return alertsAPI;
  }

  /**
   * Lakehouse Apps run directly on a customer’s Databricks instance, integrate with their data, use
   * and extend Databricks services, and enable users to interact through single sign-on.
   */
  public AppsAPI apps() {
    return appsAPI;
  }

  /**
   * In Databricks Runtime 13.3 and above, you can add libraries and init scripts to the `allowlist`
   * in UC so that users can leverage these artifacts on compute configured with shared access mode.
   */
  public ArtifactAllowlistsAPI artifactAllowlists() {
    return artifactAllowlistsAPI;
  }

  /**
   * A catalog is the first layer of Unity Catalog’s three-level namespace. It’s used to organize
   * your data assets. Users can see all catalogs on which they have been assigned the USE_CATALOG
   * data permission.
   *
   * <p>In Unity Catalog, admins and data stewards manage users and their access to data centrally
   * across all of the workspaces in a Databricks account. Users in different workspaces can share
   * access to the same data, depending on privileges granted centrally in Unity Catalog.
   */
  public CatalogsAPI catalogs() {
    return catalogsAPI;
  }

  /**
   * A clean room is a secure, privacy-protecting environment where two or more parties can share
   * sensitive enterprise data, including customer data, for measurements, insights, activation and
   * other use cases.
   *
   * <p>To create clean rooms, you must be a metastore admin or a user with the
   * **CREATE_CLEAN_ROOM** privilege.
   */
  public CleanRoomsAPI cleanRooms() {
    return cleanRoomsAPI;
  }

  /**
   * You can use cluster policies to control users' ability to configure clusters based on a set of
   * rules. These rules specify which attributes or attribute values can be used during cluster
   * creation. Cluster policies have ACLs that limit their use to specific users and groups.
   *
   * <p>With cluster policies, you can: - Auto-install cluster libraries on the next restart by
   * listing them in the policy's "libraries" field (Public Preview). - Limit users to creating
   * clusters with the prescribed settings. - Simplify the user interface, enabling more users to
   * create clusters, by fixing and hiding some fields. - Manage costs by setting limits on
   * attributes that impact the hourly rate.
   *
   * <p>Cluster policy permissions limit which policies a user can select in the Policy drop-down
   * when the user creates a cluster: - A user who has unrestricted cluster create permission can
   * select the Unrestricted policy and create fully-configurable clusters. - A user who has both
   * unrestricted cluster create permission and access to cluster policies can select the
   * Unrestricted policy and policies they have access to. - A user that has access to only cluster
   * policies, can select the policies they have access to.
   *
   * <p>If no policies exist in the workspace, the Policy drop-down doesn't appear. Only admin users
   * can create, edit, and delete policies. Admin users also have access to all policies.
   */
  public ClusterPoliciesAPI clusterPolicies() {
    return clusterPoliciesAPI;
  }

  /**
   * The Clusters API allows you to create, start, edit, list, terminate, and delete clusters.
   *
   * <p>Databricks maps cluster node instance types to compute units known as DBUs. See the instance
   * type pricing page for a list of the supported instance types and their corresponding DBUs.
   *
   * <p>A Databricks cluster is a set of computation resources and configurations on which you run
   * data engineering, data science, and data analytics workloads, such as production ETL pipelines,
   * streaming analytics, ad-hoc analytics, and machine learning.
   *
   * <p>You run these workloads as a set of commands in a notebook or as an automated job.
   * Databricks makes a distinction between all-purpose clusters and job clusters. You use
   * all-purpose clusters to analyze data collaboratively using interactive notebooks. You use job
   * clusters to run fast and robust automated jobs.
   *
   * <p>You can create an all-purpose cluster using the UI, CLI, or REST API. You can manually
   * terminate and restart an all-purpose cluster. Multiple users can share such clusters to do
   * collaborative interactive analysis.
   *
   * <p>IMPORTANT: Databricks retains cluster configuration information for up to 200 all-purpose
   * clusters terminated in the last 30 days and up to 30 job clusters recently terminated by the
   * job scheduler. To keep an all-purpose cluster configuration even after it has been terminated
   * for more than 30 days, an administrator can pin a cluster to the cluster list.
   */
  public ClustersExt clusters() {
    return clustersAPI;
  }

  /**
   * This API allows execution of Python, Scala, SQL, or R commands on running Databricks Clusters.
   */
  public CommandExecutionAPI commandExecution() {
    return commandExecutionAPI;
  }

  /**
   * Connections allow for creating a connection to an external data source.
   *
   * <p>A connection is an abstraction of an external data source that can be connected from
   * Databricks Compute. Creating a connection object is the first step to managing external data
   * sources within Unity Catalog, with the second step being creating a data object (catalog,
   * schema, or table) using the connection. Data objects derived from a connection can be written
   * to or read from similar to other Unity Catalog data objects based on cloud storage. Users may
   * create different types of connections with each connection having a unique set of configuration
   * options to support credential management and other settings.
   */
  public ConnectionsAPI connections() {
    return connectionsAPI;
  }

  /**
   * Credentials manager interacts with with Identity Providers to to perform token exchanges using
   * stored credentials and refresh tokens.
   */
  public CredentialsManagerAPI credentialsManager() {
    return credentialsManagerAPI;
  }

  /**
   * This API allows retrieving information about currently authenticated user or service principal.
   */
  public CurrentUserAPI currentUser() {
    return currentUserAPI;
  }

  /**
   * This is an evolving API that facilitates the addition and removal of widgets from existing
   * dashboards within the Databricks Workspace. Data structures may change over time.
   */
  public DashboardWidgetsAPI dashboardWidgets() {
    return dashboardWidgetsAPI;
  }

  /**
   * In general, there is little need to modify dashboards using the API. However, it can be useful
   * to use dashboard objects to look-up a collection of related query IDs. The API can also be used
   * to duplicate multiple dashboards at once since you can get a dashboard definition with a GET
   * request and then POST it to create a new one. Dashboards can be scheduled using the `sql_task`
   * type of the Jobs API, e.g. :method:jobs/create.
   */
  public DashboardsAPI dashboards() {
    return dashboardsAPI;
  }

  /**
   * This API is provided to assist you in making new query objects. When creating a query object,
   * you may optionally specify a `data_source_id` for the SQL warehouse against which it will run.
   * If you don't already know the `data_source_id` for your desired SQL warehouse, this API will
   * help you find it.
   *
   * <p>This API does not support searches. It returns the full list of SQL warehouses in your
   * workspace. We advise you to use any text editor, REST client, or `grep` to search the response
   * from this API for the name of your SQL warehouse as it appears in Databricks SQL.
   */
  public DataSourcesAPI dataSources() {
    return dataSourcesAPI;
  }

  /**
   * DBFS API makes it simple to interact with various data sources without having to include a
   * users credentials every time to read a file.
   */
  public DbfsExt dbfs() {
    return dbfsAPI;
  }

  /**
   * The SQL Permissions API is similar to the endpoints of the :method:permissions/set. However,
   * this exposes only one endpoint, which gets the Access Control List for a given object. You
   * cannot modify any permissions using this API.
   *
   * <p>There are three levels of permission:
   *
   * <p>- `CAN_VIEW`: Allows read-only access
   *
   * <p>- `CAN_RUN`: Allows read access and run access (superset of `CAN_VIEW`)
   *
   * <p>- `CAN_MANAGE`: Allows all actions: read, run, edit, delete, modify permissions (superset of
   * `CAN_RUN`)
   */
  public DbsqlPermissionsAPI dbsqlPermissions() {
    return dbsqlPermissionsAPI;
  }

  /**
   * Experiments are the primary unit of organization in MLflow; all MLflow runs belong to an
   * experiment. Each experiment lets you visualize, search, and compare runs, as well as download
   * run artifacts or metadata for analysis in other tools. Experiments are maintained in a
   * Databricks hosted MLflow tracking server.
   *
   * <p>Experiments are located in the workspace file tree. You manage experiments using the same
   * tools you use to manage other workspace objects such as folders, notebooks, and libraries.
   */
  public ExperimentsAPI experiments() {
    return experimentsAPI;
  }

  /**
   * An external location is an object that combines a cloud storage path with a storage credential
   * that authorizes access to the cloud storage path. Each external location is subject to Unity
   * Catalog access-control policies that control which users and groups can access the credential.
   * If a user does not have access to an external location in Unity Catalog, the request fails and
   * Unity Catalog does not attempt to authenticate to your cloud tenant on the user’s behalf.
   *
   * <p>Databricks recommends using external locations rather than using storage credentials
   * directly.
   *
   * <p>To create external locations, you must be a metastore admin or a user with the
   * **CREATE_EXTERNAL_LOCATION** privilege.
   */
  public ExternalLocationsAPI externalLocations() {
    return externalLocationsAPI;
  }

  /**
   * The Files API allows you to read, write, and delete files and directories in Unity Catalog
   * volumes.
   */
  public FilesAPI files() {
    return filesAPI;
  }

  /**
   * Functions implement User-Defined Functions (UDFs) in Unity Catalog.
   *
   * <p>The function implementation can be any SQL expression or Query, and it can be invoked
   * wherever a table reference is allowed in a query. In Unity Catalog, a function resides at the
   * same level as a table, so it can be referenced with the form
   * __catalog_name__.__schema_name__.__function_name__.
   */
  public FunctionsAPI functions() {
    return functionsAPI;
  }

  /**
   * Registers personal access token for Databricks to do operations on behalf of the user.
   *
   * <p>See [more info].
   *
   * <p>[more info]: https://docs.databricks.com/repos/get-access-tokens-from-git-provider.html
   */
  public GitCredentialsAPI gitCredentials() {
    return gitCredentialsAPI;
  }

  /**
   * The Global Init Scripts API enables Workspace administrators to configure global initialization
   * scripts for their workspace. These scripts run on every node in every cluster in the workspace.
   *
   * <p>**Important:** Existing clusters must be restarted to pick up any changes made to global
   * init scripts. Global init scripts are run in order. If the init script returns with a bad exit
   * code, the Apache Spark container fails to launch and init scripts with later position are
   * skipped. If enough containers fail, the entire cluster fails with a
   * `GLOBAL_INIT_SCRIPT_FAILURE` error code.
   */
  public GlobalInitScriptsAPI globalInitScripts() {
    return globalInitScriptsAPI;
  }

  /**
   * In Unity Catalog, data is secure by default. Initially, users have no access to data in a
   * metastore. Access can be granted by either a metastore admin, the owner of an object, or the
   * owner of the catalog or schema that contains the object. Securable objects in Unity Catalog are
   * hierarchical and privileges are inherited downward.
   *
   * <p>Securable objects in Unity Catalog are hierarchical and privileges are inherited downward.
   * This means that granting a privilege on the catalog automatically grants the privilege to all
   * current and future objects within the catalog. Similarly, privileges granted on a schema are
   * inherited by all current and future objects within that schema.
   */
  public GrantsAPI grants() {
    return grantsAPI;
  }

  /**
   * Groups simplify identity management, making it easier to assign access to Databricks workspace,
   * data, and other securable objects.
   *
   * <p>It is best practice to assign access to workspaces and access-control policies in Unity
   * Catalog to groups, instead of to users individually. All Databricks workspace identities can be
   * assigned as members of groups, and members inherit permissions that are assigned to their
   * group.
   */
  public GroupsAPI groups() {
    return groupsAPI;
  }

  /**
   * Instance Pools API are used to create, edit, delete and list instance pools by using
   * ready-to-use cloud instances which reduces a cluster start and auto-scaling times.
   *
   * <p>Databricks pools reduce cluster start and auto-scaling times by maintaining a set of idle,
   * ready-to-use instances. When a cluster is attached to a pool, cluster nodes are created using
   * the pool’s idle instances. If the pool has no idle instances, the pool expands by allocating a
   * new instance from the instance provider in order to accommodate the cluster’s request. When a
   * cluster releases an instance, it returns to the pool and is free for another cluster to use.
   * Only clusters attached to a pool can use that pool’s idle instances.
   *
   * <p>You can specify a different pool for the driver node and worker nodes, or use the same pool
   * for both.
   *
   * <p>Databricks does not charge DBUs while instances are idle in the pool. Instance provider
   * billing does apply. See pricing.
   */
  public InstancePoolsAPI instancePools() {
    return instancePoolsAPI;
  }

  /**
   * The Instance Profiles API allows admins to add, list, and remove instance profiles that users
   * can launch clusters with. Regular users can list the instance profiles available to them. See
   * [Secure access to S3 buckets] using instance profiles for more information.
   *
   * <p>[Secure access to S3 buckets]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/instance-profiles.html
   */
  public InstanceProfilesAPI instanceProfiles() {
    return instanceProfilesAPI;
  }

  /**
   * IP Access List enables admins to configure IP access lists.
   *
   * <p>IP access lists affect web application access and REST API access to this workspace only. If
   * the feature is disabled for a workspace, all access is allowed for this workspace. There is
   * support for allow lists (inclusion) and block lists (exclusion).
   *
   * <p>When a connection is attempted: 1. **First, all block lists are checked.** If the connection
   * IP address matches any block list, the connection is rejected. 2. **If the connection was not
   * rejected by block lists**, the IP address is compared with the allow lists.
   *
   * <p>If there is at least one allow list for the workspace, the connection is allowed only if the
   * IP address matches an allow list. If there are no allow lists for the workspace, all IP
   * addresses are allowed.
   *
   * <p>For all allow lists and block lists combined, the workspace supports a maximum of 1000
   * IP/CIDR values, where one CIDR counts as a single value.
   *
   * <p>After changes to the IP access list feature, it can take a few minutes for changes to take
   * effect.
   */
  public IpAccessListsAPI ipAccessLists() {
    return ipAccessListsAPI;
  }

  /**
   * The Jobs API allows you to create, edit, and delete jobs.
   *
   * <p>You can use a Databricks job to run a data processing or data analysis task in a Databricks
   * cluster with scalable resources. Your job can consist of a single task or can be a large,
   * multi-task workflow with complex dependencies. Databricks manages the task orchestration,
   * cluster management, monitoring, and error reporting for all of your jobs. You can run your jobs
   * immediately or periodically through an easy-to-use scheduling system. You can implement job
   * tasks using notebooks, JARS, Delta Live Tables pipelines, or Python, Scala, Spark submit, and
   * Java applications.
   *
   * <p>You should never hard code secrets or store them in plain text. Use the [Secrets CLI] to
   * manage secrets in the [Databricks CLI]. Use the [Secrets utility] to reference secrets in
   * notebooks and jobs.
   *
   * <p>[Databricks CLI]: https://docs.databricks.com/dev-tools/cli/index.html [Secrets CLI]:
   * https://docs.databricks.com/dev-tools/cli/secrets-cli.html [Secrets utility]:
   * https://docs.databricks.com/dev-tools/databricks-utils.html#dbutils-secrets
   */
  public JobsAPI jobs() {
    return jobsAPI;
  }

  /**
   * A monitor computes and monitors data or model quality metrics for a table over time. It
   * generates metrics tables and a dashboard that you can use to monitor table health and set
   * alerts.
   *
   * <p>Most write operations require the user to be the owner of the table (or its parent schema or
   * parent catalog). Viewing the dashboard, computed metrics, or monitor configuration only
   * requires the user to have **SELECT** privileges on the table (along with **USE_SCHEMA** and
   * **USE_CATALOG**).
   */
  public LakehouseMonitorsAPI lakehouseMonitors() {
    return lakehouseMonitorsAPI;
  }

  /**
   * These APIs provide specific management operations for Lakeview dashboards. Generic resource
   * management can be done with Workspace API (import, export, get-status, list, delete).
   */
  public LakeviewAPI lakeview() {
    return lakeviewAPI;
  }

  /**
   * The Libraries API allows you to install and uninstall libraries and get the status of libraries
   * on a cluster.
   *
   * <p>To make third-party or custom code available to notebooks and jobs running on your clusters,
   * you can install a library. Libraries can be written in Python, Java, Scala, and R. You can
   * upload Java, Scala, and Python libraries and point to external packages in PyPI, Maven, and
   * CRAN repositories.
   *
   * <p>Cluster libraries can be used by all notebooks running on a cluster. You can install a
   * cluster library directly from a public repository such as PyPI or Maven, using a previously
   * installed workspace library, or using an init script.
   *
   * <p>When you install a library on a cluster, a notebook already attached to that cluster will
   * not immediately see the new library. You must first detach and then reattach the notebook to
   * the cluster.
   *
   * <p>When you uninstall a library from a cluster, the library is removed only when you restart
   * the cluster. Until you restart the cluster, the status of the uninstalled library appears as
   * Uninstall pending restart.
   */
  public LibrariesAPI libraries() {
    return librariesAPI;
  }

  /**
   * A metastore is the top-level container of objects in Unity Catalog. It stores data assets
   * (tables and views) and the permissions that govern access to them. Databricks account admins
   * can create metastores and assign them to Databricks workspaces to control which workloads use
   * each metastore. For a workspace to use Unity Catalog, it must have a Unity Catalog metastore
   * attached.
   *
   * <p>Each metastore is configured with a root storage location in a cloud storage account. This
   * storage location is used for metadata and managed tables data.
   *
   * <p>NOTE: This metastore is distinct from the metastore included in Databricks workspaces
   * created before Unity Catalog was released. If your workspace includes a legacy Hive metastore,
   * the data in that metastore is available in a catalog named hive_metastore.
   */
  public MetastoresAPI metastores() {
    return metastoresAPI;
  }

  /**
   * Note: This API reference documents APIs for the Workspace Model Registry. Databricks recommends
   * using [Models in Unity Catalog](/api/workspace/registeredmodels) instead. Models in Unity
   * Catalog provides centralized model governance, cross-workspace access, lineage, and deployment.
   * Workspace Model Registry will be deprecated in the future.
   *
   * <p>The Workspace Model Registry is a centralized model repository and a UI and set of APIs that
   * enable you to manage the full lifecycle of MLflow Models.
   */
  public ModelRegistryAPI modelRegistry() {
    return modelRegistryAPI;
  }

  /**
   * Databricks provides a hosted version of MLflow Model Registry in Unity Catalog. Models in Unity
   * Catalog provide centralized access control, auditing, lineage, and discovery of ML models
   * across Databricks workspaces.
   *
   * <p>This API reference documents the REST endpoints for managing model versions in Unity
   * Catalog. For more details, see the [registered models API
   * docs](/api/workspace/registeredmodels).
   */
  public ModelVersionsAPI modelVersions() {
    return modelVersionsAPI;
  }

  /**
   * Permissions API are used to create read, write, edit, update and manage access for various
   * users on different objects and endpoints.
   *
   * <p>* **[Cluster permissions](:service:clusters)** — Manage which users can manage, restart, or
   * attach to clusters.
   *
   * <p>* **[Cluster policy permissions](:service:clusterpolicies)** — Manage which users can use
   * cluster policies.
   *
   * <p>* **[Delta Live Tables pipeline permissions](:service:pipelines)** — Manage which users can
   * view, manage, run, cancel, or own a Delta Live Tables pipeline.
   *
   * <p>* **[Job permissions](:service:jobs)** — Manage which users can view, manage, trigger,
   * cancel, or own a job.
   *
   * <p>* **[MLflow experiment permissions](:service:experiments)** — Manage which users can read,
   * edit, or manage MLflow experiments.
   *
   * <p>* **[MLflow registered model permissions](:service:modelregistry)** — Manage which users can
   * read, edit, or manage MLflow registered models.
   *
   * <p>* **[Password permissions](:service:users)** — Manage which users can use password login
   * when SSO is enabled.
   *
   * <p>* **[Instance Pool permissions](:service:instancepools)** — Manage which users can manage or
   * attach to pools.
   *
   * <p>* **[Repo permissions](repos)** — Manage which users can read, run, edit, or manage a repo.
   *
   * <p>* **[Serving endpoint permissions](:service:servingendpoints)** — Manage which users can
   * view, query, or manage a serving endpoint.
   *
   * <p>* **[SQL warehouse permissions](:service:warehouses)** — Manage which users can use or
   * manage SQL warehouses.
   *
   * <p>* **[Token permissions](:service:tokenmanagement)** — Manage which users can create or use
   * tokens.
   *
   * <p>* **[Workspace object permissions](:service:workspace)** — Manage which users can read, run,
   * edit, or manage directories, files, and notebooks.
   *
   * <p>For the mapping of the required permissions for specific actions or abilities and other
   * important information, see [Access Control].
   *
   * <p>[Access Control]: https://docs.databricks.com/security/auth-authz/access-control/index.html
   */
  public PermissionsAPI permissions() {
    return permissionsAPI;
  }

  /**
   * The Delta Live Tables API allows you to create, edit, delete, start, and view details about
   * pipelines.
   *
   * <p>Delta Live Tables is a framework for building reliable, maintainable, and testable data
   * processing pipelines. You define the transformations to perform on your data, and Delta Live
   * Tables manages task orchestration, cluster management, monitoring, data quality, and error
   * handling.
   *
   * <p>Instead of defining your data pipelines using a series of separate Apache Spark tasks, Delta
   * Live Tables manages how your data is transformed based on a target schema you define for each
   * processing step. You can also enforce data quality with Delta Live Tables expectations.
   * Expectations allow you to define expected data quality and specify how to handle records that
   * fail those expectations.
   */
  public PipelinesAPI pipelines() {
    return pipelinesAPI;
  }

  /**
   * View available policy families. A policy family contains a policy definition providing best
   * practices for configuring clusters for a particular use case.
   *
   * <p>Databricks manages and provides policy families for several common cluster use cases. You
   * cannot create, edit, or delete policy families.
   *
   * <p>Policy families cannot be used directly to create clusters. Instead, you create cluster
   * policies using a policy family. Cluster policies created using a policy family inherit the
   * policy family's policy definition.
   */
  public PolicyFamiliesAPI policyFamilies() {
    return policyFamiliesAPI;
  }

  /**
   * A data provider is an object representing the organization in the real world who shares the
   * data. A provider contains shares which further contain the shared data.
   */
  public ProvidersAPI providers() {
    return providersAPI;
  }

  /**
   * These endpoints are used for CRUD operations on query definitions. Query definitions include
   * the target SQL warehouse, query text, name, description, tags, parameters, and visualizations.
   * Queries can be scheduled using the `sql_task` type of the Jobs API, e.g. :method:jobs/create.
   */
  public QueriesAPI queries() {
    return queriesAPI;
  }

  /** Access the history of queries through SQL warehouses. */
  public QueryHistoryAPI queryHistory() {
    return queryHistoryAPI;
  }

  /**
   * This is an evolving API that facilitates the addition and removal of vizualisations from
   * existing queries within the Databricks Workspace. Data structures may change over time.
   */
  public QueryVisualizationsAPI queryVisualizations() {
    return queryVisualizationsAPI;
  }

  /**
   * The Recipient Activation API is only applicable in the open sharing model where the recipient
   * object has the authentication type of `TOKEN`. The data recipient follows the activation link
   * shared by the data provider to download the credential file that includes the access token. The
   * recipient will then use the credential file to establish a secure connection with the provider
   * to receive the shared data.
   *
   * <p>Note that you can download the credential file only once. Recipients should treat the
   * downloaded credential as a secret and must not share it outside of their organization.
   */
  public RecipientActivationAPI recipientActivation() {
    return recipientActivationAPI;
  }

  /**
   * A recipient is an object you create using :method:recipients/create to represent an
   * organization which you want to allow access shares. The way how sharing works differs depending
   * on whether or not your recipient has access to a Databricks workspace that is enabled for Unity
   * Catalog:
   *
   * <p>- For recipients with access to a Databricks workspace that is enabled for Unity Catalog,
   * you can create a recipient object along with a unique sharing identifier you get from the
   * recipient. The sharing identifier is the key identifier that enables the secure connection.
   * This sharing mode is called **Databricks-to-Databricks sharing**.
   *
   * <p>- For recipients without access to a Databricks workspace that is enabled for Unity Catalog,
   * when you create a recipient object, Databricks generates an activation link you can send to the
   * recipient. The recipient follows the activation link to download the credential file, and then
   * uses the credential file to establish a secure connection to receive the shared data. This
   * sharing mode is called **open sharing**.
   */
  public RecipientsAPI recipients() {
    return recipientsAPI;
  }

  /**
   * Databricks provides a hosted version of MLflow Model Registry in Unity Catalog. Models in Unity
   * Catalog provide centralized access control, auditing, lineage, and discovery of ML models
   * across Databricks workspaces.
   *
   * <p>An MLflow registered model resides in the third layer of Unity Catalog’s three-level
   * namespace. Registered models contain model versions, which correspond to actual ML models
   * (MLflow models). Creating new model versions currently requires use of the MLflow Python
   * client. Once model versions are created, you can load them for batch inference using MLflow
   * Python client APIs, or deploy them for real-time serving using Databricks Model Serving.
   *
   * <p>All operations on registered models and model versions require USE_CATALOG permissions on
   * the enclosing catalog and USE_SCHEMA permissions on the enclosing schema. In addition, the
   * following additional privileges are required for various operations:
   *
   * <p>* To create a registered model, users must additionally have the CREATE_MODEL permission on
   * the target schema. * To view registered model or model version metadata, model version data
   * files, or invoke a model version, users must additionally have the EXECUTE permission on the
   * registered model * To update registered model or model version tags, users must additionally
   * have APPLY TAG permissions on the registered model * To update other registered model or model
   * version metadata (comments, aliases) create a new model version, or update permissions on the
   * registered model, users must be owners of the registered model.
   *
   * <p>Note: The securable type for models is "FUNCTION". When using REST APIs (e.g. tagging,
   * grants) that specify a securable type, use "FUNCTION" as the securable type.
   */
  public RegisteredModelsAPI registeredModels() {
    return registeredModelsAPI;
  }

  /**
   * The Repos API allows users to manage their git repos. Users can use the API to access all repos
   * that they have manage permissions on.
   *
   * <p>Databricks Repos is a visual Git client in Databricks. It supports common Git operations
   * such a cloning a repository, committing and pushing, pulling, branch management, and visual
   * comparison of diffs when committing.
   *
   * <p>Within Repos you can develop code in notebooks or other files and follow data science and
   * engineering code development best practices using Git for version control, collaboration, and
   * CI/CD.
   */
  public ReposAPI repos() {
    return reposAPI;
  }

  /**
   * A schema (also called a database) is the second layer of Unity Catalog’s three-level namespace.
   * A schema organizes tables, views and functions. To access (or list) a table or view in a
   * schema, users must have the USE_SCHEMA data permission on the schema and its parent catalog,
   * and they must have the SELECT permission on the table or view.
   */
  public SchemasAPI schemas() {
    return schemasAPI;
  }

  /**
   * The Secrets API allows you to manage secrets, secret scopes, and access permissions.
   *
   * <p>Sometimes accessing data requires that you authenticate to external data sources through
   * JDBC. Instead of directly entering your credentials into a notebook, use Databricks secrets to
   * store your credentials and reference them in notebooks and jobs.
   *
   * <p>Administrators, secret creators, and users granted permission can read Databricks secrets.
   * While Databricks makes an effort to redact secret values that might be displayed in notebooks,
   * it is not possible to prevent such users from reading secrets.
   */
  public SecretsExt secrets() {
    return secretsAPI;
  }

  /**
   * Identities for use with jobs, automated tools, and systems such as scripts, apps, and CI/CD
   * platforms. Databricks recommends creating service principals to run production jobs or modify
   * production data. If all processes that act on production data run with service principals,
   * interactive users do not need any write, delete, or modify privileges in production. This
   * eliminates the risk of a user overwriting production data by accident.
   */
  public ServicePrincipalsAPI servicePrincipals() {
    return servicePrincipalsAPI;
  }

  /**
   * The Serving Endpoints API allows you to create, update, and delete model serving endpoints.
   *
   * <p>You can use a serving endpoint to serve models from the Databricks Model Registry or from
   * Unity Catalog. Endpoints expose the underlying models as scalable REST API endpoints using
   * serverless compute. This means the endpoints and associated compute resources are fully managed
   * by Databricks and will not appear in your cloud account. A serving endpoint can consist of one
   * or more MLflow models from the Databricks Model Registry, called served entities. A serving
   * endpoint can have at most ten served entities. You can configure traffic settings to define how
   * requests should be routed to your served entities behind an endpoint. Additionally, you can
   * configure the scale of resources that should be applied to each served entity.
   */
  public ServingEndpointsAPI servingEndpoints() {
    return servingEndpointsAPI;
  }

  /**
   * The default namespace setting API allows users to configure the default namespace for a
   * Databricks workspace.
   *
   * <p>Through this API, users can retrieve, set, or modify the default namespace used when queries
   * do not reference a fully qualified three-level name. For example, if you use the API to set
   * 'retail_prod' as the default catalog, then a query 'SELECT * FROM myTable' would reference the
   * object 'retail_prod.default.myTable' (the schema 'default' is always assumed).
   *
   * <p>This setting requires a restart of clusters and SQL warehouses to take effect. Additionally,
   * the default namespace only applies when using Unity Catalog-enabled compute.
   */
  public SettingsAPI settings() {
    return settingsAPI;
  }

  /**
   * A share is a container instantiated with :method:shares/create. Once created you can
   * iteratively register a collection of existing data assets defined within the metastore using
   * :method:shares/update. You can register data assets under their original name, qualified by
   * their original schema, or provide alternate exposed names.
   */
  public SharesAPI shares() {
    return sharesAPI;
  }

  /**
   * The Databricks SQL Statement Execution API can be used to execute SQL statements on a SQL
   * warehouse and fetch the result.
   *
   * <p>**Getting started**
   *
   * <p>We suggest beginning with the [Databricks SQL Statement Execution API tutorial].
   *
   * <p>**Overview of statement execution and result fetching**
   *
   * <p>Statement execution begins by issuing a :method:statementexecution/executeStatement request
   * with a valid SQL statement and warehouse ID, along with optional parameters such as the data
   * catalog and output format. If no other parameters are specified, the server will wait for up to
   * 10s before returning a response. If the statement has completed within this timespan, the
   * response will include the result data as a JSON array and metadata. Otherwise, if no result is
   * available after the 10s timeout expired, the response will provide the statement ID that can be
   * used to poll for results by using a :method:statementexecution/getStatement request.
   *
   * <p>You can specify whether the call should behave synchronously, asynchronously or start
   * synchronously with a fallback to asynchronous execution. This is controlled with the
   * `wait_timeout` and `on_wait_timeout` settings. If `wait_timeout` is set between 5-50 seconds
   * (default: 10s), the call waits for results up to the specified timeout; when set to `0s`, the
   * call is asynchronous and responds immediately with a statement ID. The `on_wait_timeout`
   * setting specifies what should happen when the timeout is reached while the statement execution
   * has not yet finished. This can be set to either `CONTINUE`, to fallback to asynchronous mode,
   * or it can be set to `CANCEL`, which cancels the statement.
   *
   * <p>In summary: - Synchronous mode - `wait_timeout=30s` and `on_wait_timeout=CANCEL` - The call
   * waits up to 30 seconds; if the statement execution finishes within this time, the result data
   * is returned directly in the response. If the execution takes longer than 30 seconds, the
   * execution is canceled and the call returns with a `CANCELED` state. - Asynchronous mode -
   * `wait_timeout=0s` (`on_wait_timeout` is ignored) - The call doesn't wait for the statement to
   * finish but returns directly with a statement ID. The status of the statement execution can be
   * polled by issuing :method:statementexecution/getStatement with the statement ID. Once the
   * execution has succeeded, this call also returns the result and metadata in the response. -
   * Hybrid mode (default) - `wait_timeout=10s` and `on_wait_timeout=CONTINUE` - The call waits for
   * up to 10 seconds; if the statement execution finishes within this time, the result data is
   * returned directly in the response. If the execution takes longer than 10 seconds, a statement
   * ID is returned. The statement ID can be used to fetch status and results in the same way as in
   * the asynchronous mode.
   *
   * <p>Depending on the size, the result can be split into multiple chunks. If the statement
   * execution is successful, the statement response contains a manifest and the first chunk of the
   * result. The manifest contains schema information and provides metadata for each chunk in the
   * result. Result chunks can be retrieved by index with
   * :method:statementexecution/getStatementResultChunkN which may be called in any order and in
   * parallel. For sequential fetching, each chunk, apart from the last, also contains a
   * `next_chunk_index` and `next_chunk_internal_link` that point to the next chunk.
   *
   * <p>A statement can be canceled with :method:statementexecution/cancelExecution.
   *
   * <p>**Fetching result data: format and disposition**
   *
   * <p>To specify the format of the result data, use the `format` field, which can be set to one of
   * the following options: `JSON_ARRAY` (JSON), `ARROW_STREAM` ([Apache Arrow Columnar]), or `CSV`.
   *
   * <p>There are two ways to receive statement results, controlled by the `disposition` setting,
   * which can be either `INLINE` or `EXTERNAL_LINKS`:
   *
   * <p>- `INLINE`: In this mode, the result data is directly included in the response. It's best
   * suited for smaller results. This mode can only be used with the `JSON_ARRAY` format.
   *
   * <p>- `EXTERNAL_LINKS`: In this mode, the response provides links that can be used to download
   * the result data in chunks separately. This approach is ideal for larger results and offers
   * higher throughput. This mode can be used with all the formats: `JSON_ARRAY`, `ARROW_STREAM`,
   * and `CSV`.
   *
   * <p>By default, the API uses `format=JSON_ARRAY` and `disposition=INLINE`.
   *
   * <p>**Limits and limitations**
   *
   * <p>Note: The byte limit for INLINE disposition is based on internal storage metrics and will
   * not exactly match the byte count of the actual payload.
   *
   * <p>- Statements with `disposition=INLINE` are limited to 25 MiB and will fail when this limit
   * is exceeded. - Statements with `disposition=EXTERNAL_LINKS` are limited to 100 GiB. Result sets
   * larger than this limit will be truncated. Truncation is indicated by the `truncated` field in
   * the result manifest. - The maximum query text size is 16 MiB. - Cancelation might silently
   * fail. A successful response from a cancel request indicates that the cancel request was
   * successfully received and sent to the processing engine. However, an outstanding statement
   * might have already completed execution when the cancel request arrives. Polling for status
   * until a terminal state is reached is a reliable way to determine the final state. - Wait
   * timeouts are approximate, occur server-side, and cannot account for things such as caller
   * delays and network latency from caller to service. - The system will auto-close a statement
   * after one hour if the client stops polling and thus you must poll at least once an hour. - The
   * results are only available for one hour after success; polling does not extend this.
   *
   * <p>[Apache Arrow Columnar]: https://arrow.apache.org/overview/ [Databricks SQL Statement
   * Execution API tutorial]: https://docs.databricks.com/sql/api/sql-execution-tutorial.html
   */
  public StatementExecutionAPI statementExecution() {
    return statementExecutionAPI;
  }

  /**
   * A storage credential represents an authentication and authorization mechanism for accessing
   * data stored on your cloud tenant. Each storage credential is subject to Unity Catalog
   * access-control policies that control which users and groups can access the credential. If a
   * user does not have access to a storage credential in Unity Catalog, the request fails and Unity
   * Catalog does not attempt to authenticate to your cloud tenant on the user’s behalf.
   *
   * <p>Databricks recommends using external locations rather than using storage credentials
   * directly.
   *
   * <p>To create storage credentials, you must be a Databricks account admin. The account admin who
   * creates the storage credential can delegate ownership to another user or group to manage
   * permissions on it.
   */
  public StorageCredentialsAPI storageCredentials() {
    return storageCredentialsAPI;
  }

  /**
   * A system schema is a schema that lives within the system catalog. A system schema may contain
   * information about customer usage of Unity Catalog such as audit-logs, billing-logs, lineage
   * information, etc.
   */
  public SystemSchemasAPI systemSchemas() {
    return systemSchemasAPI;
  }

  /**
   * Primary key and foreign key constraints encode relationships between fields in tables.
   *
   * <p>Primary and foreign keys are informational only and are not enforced. Foreign keys must
   * reference a primary key in another table. This primary key is the parent constraint of the
   * foreign key and the table this primary key is on is the parent table of the foreign key.
   * Similarly, the foreign key is the child constraint of its referenced primary key; the table of
   * the foreign key is the child table of the primary key.
   *
   * <p>You can declare primary keys and foreign keys as part of the table specification during
   * table creation. You can also add or drop constraints on existing tables.
   */
  public TableConstraintsAPI tableConstraints() {
    return tableConstraintsAPI;
  }

  /**
   * A table resides in the third layer of Unity Catalog’s three-level namespace. It contains rows
   * of data. To create a table, users must have CREATE_TABLE and USE_SCHEMA permissions on the
   * schema, and they must have the USE_CATALOG permission on its parent catalog. To query a table,
   * users must have the SELECT permission on the table, and they must have the USE_CATALOG
   * permission on its parent catalog and the USE_SCHEMA permission on its parent schema.
   *
   * <p>A table can be managed or external. From an API perspective, a __VIEW__ is a particular kind
   * of table (rather than a managed or external table).
   */
  public TablesAPI tables() {
    return tablesAPI;
  }

  /**
   * Enables administrators to get all tokens and delete tokens for other users. Admins can either
   * get every token, get a specific token by ID, or get all tokens for a particular user.
   */
  public TokenManagementAPI tokenManagement() {
    return tokenManagementAPI;
  }

  /**
   * The Token API allows you to create, list, and revoke tokens that can be used to authenticate
   * and access Databricks REST APIs.
   */
  public TokensAPI tokens() {
    return tokensAPI;
  }

  /**
   * User identities recognized by Databricks and represented by email addresses.
   *
   * <p>Databricks recommends using SCIM provisioning to sync users and groups automatically from
   * your identity provider to your Databricks workspace. SCIM streamlines onboarding a new employee
   * or team by using your identity provider to create users and groups in Databricks workspace and
   * give them the proper level of access. When a user leaves your organization or no longer needs
   * access to Databricks workspace, admins can terminate the user in your identity provider and
   * that user’s account will also be removed from Databricks workspace. This ensures a consistent
   * offboarding process and prevents unauthorized users from accessing sensitive data.
   */
  public UsersAPI users() {
    return usersAPI;
  }

  /** **Endpoint**: Represents the compute resources to host vector search indexes. */
  public VectorSearchEndpointsAPI vectorSearchEndpoints() {
    return vectorSearchEndpointsAPI;
  }

  /**
   * **Index**: An efficient representation of your embedding vectors that supports real-time and
   * efficient approximate nearest neighbor (ANN) search queries.
   *
   * <p>There are 2 types of Vector Search indexes: * **Delta Sync Index**: An index that
   * automatically syncs with a source Delta Table, automatically and incrementally updating the
   * index as the underlying data in the Delta Table changes. * **Direct Vector Access Index**: An
   * index that supports direct read and write of vectors and metadata through our REST and SDK
   * APIs. With this model, the user manages index updates.
   */
  public VectorSearchIndexesAPI vectorSearchIndexes() {
    return vectorSearchIndexesAPI;
  }

  /**
   * Volumes are a Unity Catalog (UC) capability for accessing, storing, governing, organizing and
   * processing files. Use cases include running machine learning on unstructured data such as
   * image, audio, video, or PDF files, organizing data sets during the data exploration stages in
   * data science, working with libraries that require access to the local file system on cluster
   * machines, storing library and config files of arbitrary formats such as .whl or .txt centrally
   * and providing secure access across workspaces to it, or transforming and querying non-tabular
   * data files in ETL.
   */
  public VolumesAPI volumes() {
    return volumesAPI;
  }

  /**
   * A SQL warehouse is a compute resource that lets you run SQL commands on data objects within
   * Databricks SQL. Compute resources are infrastructure resources that provide processing
   * capabilities in the cloud.
   */
  public WarehousesAPI warehouses() {
    return warehousesAPI;
  }

  /**
   * The Workspace API allows you to list, import, export, and delete notebooks and folders.
   *
   * <p>A notebook is a web-based interface to a document that contains runnable code,
   * visualizations, and explanatory text.
   */
  public WorkspaceAPI workspace() {
    return workspaceAPI;
  }

  /**
   * A securable in Databricks can be configured as __OPEN__ or __ISOLATED__. An __OPEN__ securable
   * can be accessed from any workspace, while an __ISOLATED__ securable can only be accessed from a
   * configured list of workspaces. This API allows you to configure (bind) securables to
   * workspaces.
   *
   * <p>NOTE: The __isolation_mode__ is configured for the securable itself (using its Update
   * method) and the workspace bindings are only consulted when the securable's __isolation_mode__
   * is set to __ISOLATED__.
   *
   * <p>A securable's workspace bindings can be configured by a metastore admin or the owner of the
   * securable.
   *
   * <p>The original path (/api/2.1/unity-catalog/workspace-bindings/catalogs/{name}) is deprecated.
   * Please use the new path (/api/2.1/unity-catalog/bindings/{securable_type}/{securable_name})
   * which introduces the ability to bind a securable in READ_ONLY mode (catalogs only).
   *
   * <p>Securables that support binding: - catalog
   */
  public WorkspaceBindingsAPI workspaceBindings() {
    return workspaceBindingsAPI;
  }

  /** This API allows updating known workspace settings for advanced users. */
  public WorkspaceConfAPI workspaceConf() {
    return workspaceConfAPI;
  }

  /** Replace the default AccountAccessControlProxyService with a custom implementation. */
  public WorkspaceClient withAccountAccessControlProxyImpl(
      AccountAccessControlProxyService accountAccessControlProxy) {
    return this.withAccountAccessControlProxyAPI(
        new AccountAccessControlProxyAPI(accountAccessControlProxy));
  }

  /** Replace the default AccountAccessControlProxyAPI with a custom implementation. */
  public WorkspaceClient withAccountAccessControlProxyAPI(
      AccountAccessControlProxyAPI accountAccessControlProxy) {
    this.accountAccessControlProxyAPI = accountAccessControlProxy;
    return this;
  }

  /** Replace the default AlertsService with a custom implementation. */
  public WorkspaceClient withAlertsImpl(AlertsService alerts) {
    return this.withAlertsAPI(new AlertsAPI(alerts));
  }

  /** Replace the default AlertsAPI with a custom implementation. */
  public WorkspaceClient withAlertsAPI(AlertsAPI alerts) {
    this.alertsAPI = alerts;
    return this;
  }

  /** Replace the default AppsService with a custom implementation. */
  public WorkspaceClient withAppsImpl(AppsService apps) {
    return this.withAppsAPI(new AppsAPI(apps));
  }

  /** Replace the default AppsAPI with a custom implementation. */
  public WorkspaceClient withAppsAPI(AppsAPI apps) {
    this.appsAPI = apps;
    return this;
  }

  /** Replace the default ArtifactAllowlistsService with a custom implementation. */
  public WorkspaceClient withArtifactAllowlistsImpl(ArtifactAllowlistsService artifactAllowlists) {
    return this.withArtifactAllowlistsAPI(new ArtifactAllowlistsAPI(artifactAllowlists));
  }

  /** Replace the default ArtifactAllowlistsAPI with a custom implementation. */
  public WorkspaceClient withArtifactAllowlistsAPI(ArtifactAllowlistsAPI artifactAllowlists) {
    this.artifactAllowlistsAPI = artifactAllowlists;
    return this;
  }

  /** Replace the default CatalogsService with a custom implementation. */
  public WorkspaceClient withCatalogsImpl(CatalogsService catalogs) {
    return this.withCatalogsAPI(new CatalogsAPI(catalogs));
  }

  /** Replace the default CatalogsAPI with a custom implementation. */
  public WorkspaceClient withCatalogsAPI(CatalogsAPI catalogs) {
    this.catalogsAPI = catalogs;
    return this;
  }

  /** Replace the default CleanRoomsService with a custom implementation. */
  public WorkspaceClient withCleanRoomsImpl(CleanRoomsService cleanRooms) {
    return this.withCleanRoomsAPI(new CleanRoomsAPI(cleanRooms));
  }

  /** Replace the default CleanRoomsAPI with a custom implementation. */
  public WorkspaceClient withCleanRoomsAPI(CleanRoomsAPI cleanRooms) {
    this.cleanRoomsAPI = cleanRooms;
    return this;
  }

  /** Replace the default ClusterPoliciesService with a custom implementation. */
  public WorkspaceClient withClusterPoliciesImpl(ClusterPoliciesService clusterPolicies) {
    return this.withClusterPoliciesAPI(new ClusterPoliciesAPI(clusterPolicies));
  }

  /** Replace the default ClusterPoliciesAPI with a custom implementation. */
  public WorkspaceClient withClusterPoliciesAPI(ClusterPoliciesAPI clusterPolicies) {
    this.clusterPoliciesAPI = clusterPolicies;
    return this;
  }

  /** Replace the default ClustersService with a custom implementation. */
  public WorkspaceClient withClustersImpl(ClustersService clusters) {
    return this.withClustersAPI(new ClustersExt(clusters));
  }

  /** Replace the default ClustersAPI with a custom implementation. */
  public WorkspaceClient withClustersAPI(ClustersExt clusters) {
    this.clustersAPI = clusters;
    return this;
  }

  /** Replace the default CommandExecutionService with a custom implementation. */
  public WorkspaceClient withCommandExecutionImpl(CommandExecutionService commandExecution) {
    return this.withCommandExecutionAPI(new CommandExecutionAPI(commandExecution));
  }

  /** Replace the default CommandExecutionAPI with a custom implementation. */
  public WorkspaceClient withCommandExecutionAPI(CommandExecutionAPI commandExecution) {
    this.commandExecutionAPI = commandExecution;
    return this;
  }

  /** Replace the default ConnectionsService with a custom implementation. */
  public WorkspaceClient withConnectionsImpl(ConnectionsService connections) {
    return this.withConnectionsAPI(new ConnectionsAPI(connections));
  }

  /** Replace the default ConnectionsAPI with a custom implementation. */
  public WorkspaceClient withConnectionsAPI(ConnectionsAPI connections) {
    this.connectionsAPI = connections;
    return this;
  }

  /** Replace the default CredentialsManagerService with a custom implementation. */
  public WorkspaceClient withCredentialsManagerImpl(CredentialsManagerService credentialsManager) {
    return this.withCredentialsManagerAPI(new CredentialsManagerAPI(credentialsManager));
  }

  /** Replace the default CredentialsManagerAPI with a custom implementation. */
  public WorkspaceClient withCredentialsManagerAPI(CredentialsManagerAPI credentialsManager) {
    this.credentialsManagerAPI = credentialsManager;
    return this;
  }

  /** Replace the default CurrentUserService with a custom implementation. */
  public WorkspaceClient withCurrentUserImpl(CurrentUserService currentUser) {
    return this.withCurrentUserAPI(new CurrentUserAPI(currentUser));
  }

  /** Replace the default CurrentUserAPI with a custom implementation. */
  public WorkspaceClient withCurrentUserAPI(CurrentUserAPI currentUser) {
    this.currentUserAPI = currentUser;
    return this;
  }

  /** Replace the default DashboardWidgetsService with a custom implementation. */
  public WorkspaceClient withDashboardWidgetsImpl(DashboardWidgetsService dashboardWidgets) {
    return this.withDashboardWidgetsAPI(new DashboardWidgetsAPI(dashboardWidgets));
  }

  /** Replace the default DashboardWidgetsAPI with a custom implementation. */
  public WorkspaceClient withDashboardWidgetsAPI(DashboardWidgetsAPI dashboardWidgets) {
    this.dashboardWidgetsAPI = dashboardWidgets;
    return this;
  }

  /** Replace the default DashboardsService with a custom implementation. */
  public WorkspaceClient withDashboardsImpl(DashboardsService dashboards) {
    return this.withDashboardsAPI(new DashboardsAPI(dashboards));
  }

  /** Replace the default DashboardsAPI with a custom implementation. */
  public WorkspaceClient withDashboardsAPI(DashboardsAPI dashboards) {
    this.dashboardsAPI = dashboards;
    return this;
  }

  /** Replace the default DataSourcesService with a custom implementation. */
  public WorkspaceClient withDataSourcesImpl(DataSourcesService dataSources) {
    return this.withDataSourcesAPI(new DataSourcesAPI(dataSources));
  }

  /** Replace the default DataSourcesAPI with a custom implementation. */
  public WorkspaceClient withDataSourcesAPI(DataSourcesAPI dataSources) {
    this.dataSourcesAPI = dataSources;
    return this;
  }

  /** Replace the default DbfsService with a custom implementation. */
  public WorkspaceClient withDbfsImpl(DbfsService dbfs) {
    return this.withDbfsAPI(new DbfsExt(dbfs));
  }

  /** Replace the default DbfsAPI with a custom implementation. */
  public WorkspaceClient withDbfsAPI(DbfsExt dbfs) {
    this.dbfsAPI = dbfs;
    return this;
  }

  /** Replace the default DbsqlPermissionsService with a custom implementation. */
  public WorkspaceClient withDbsqlPermissionsImpl(DbsqlPermissionsService dbsqlPermissions) {
    return this.withDbsqlPermissionsAPI(new DbsqlPermissionsAPI(dbsqlPermissions));
  }

  /** Replace the default DbsqlPermissionsAPI with a custom implementation. */
  public WorkspaceClient withDbsqlPermissionsAPI(DbsqlPermissionsAPI dbsqlPermissions) {
    this.dbsqlPermissionsAPI = dbsqlPermissions;
    return this;
  }

  /** Replace the default ExperimentsService with a custom implementation. */
  public WorkspaceClient withExperimentsImpl(ExperimentsService experiments) {
    return this.withExperimentsAPI(new ExperimentsAPI(experiments));
  }

  /** Replace the default ExperimentsAPI with a custom implementation. */
  public WorkspaceClient withExperimentsAPI(ExperimentsAPI experiments) {
    this.experimentsAPI = experiments;
    return this;
  }

  /** Replace the default ExternalLocationsService with a custom implementation. */
  public WorkspaceClient withExternalLocationsImpl(ExternalLocationsService externalLocations) {
    return this.withExternalLocationsAPI(new ExternalLocationsAPI(externalLocations));
  }

  /** Replace the default ExternalLocationsAPI with a custom implementation. */
  public WorkspaceClient withExternalLocationsAPI(ExternalLocationsAPI externalLocations) {
    this.externalLocationsAPI = externalLocations;
    return this;
  }

  /** Replace the default FilesService with a custom implementation. */
  public WorkspaceClient withFilesImpl(FilesService files) {
    return this.withFilesAPI(new FilesAPI(files));
  }

  /** Replace the default FilesAPI with a custom implementation. */
  public WorkspaceClient withFilesAPI(FilesAPI files) {
    this.filesAPI = files;
    return this;
  }

  /** Replace the default FunctionsService with a custom implementation. */
  public WorkspaceClient withFunctionsImpl(FunctionsService functions) {
    return this.withFunctionsAPI(new FunctionsAPI(functions));
  }

  /** Replace the default FunctionsAPI with a custom implementation. */
  public WorkspaceClient withFunctionsAPI(FunctionsAPI functions) {
    this.functionsAPI = functions;
    return this;
  }

  /** Replace the default GitCredentialsService with a custom implementation. */
  public WorkspaceClient withGitCredentialsImpl(GitCredentialsService gitCredentials) {
    return this.withGitCredentialsAPI(new GitCredentialsAPI(gitCredentials));
  }

  /** Replace the default GitCredentialsAPI with a custom implementation. */
  public WorkspaceClient withGitCredentialsAPI(GitCredentialsAPI gitCredentials) {
    this.gitCredentialsAPI = gitCredentials;
    return this;
  }

  /** Replace the default GlobalInitScriptsService with a custom implementation. */
  public WorkspaceClient withGlobalInitScriptsImpl(GlobalInitScriptsService globalInitScripts) {
    return this.withGlobalInitScriptsAPI(new GlobalInitScriptsAPI(globalInitScripts));
  }

  /** Replace the default GlobalInitScriptsAPI with a custom implementation. */
  public WorkspaceClient withGlobalInitScriptsAPI(GlobalInitScriptsAPI globalInitScripts) {
    this.globalInitScriptsAPI = globalInitScripts;
    return this;
  }

  /** Replace the default GrantsService with a custom implementation. */
  public WorkspaceClient withGrantsImpl(GrantsService grants) {
    return this.withGrantsAPI(new GrantsAPI(grants));
  }

  /** Replace the default GrantsAPI with a custom implementation. */
  public WorkspaceClient withGrantsAPI(GrantsAPI grants) {
    this.grantsAPI = grants;
    return this;
  }

  /** Replace the default GroupsService with a custom implementation. */
  public WorkspaceClient withGroupsImpl(GroupsService groups) {
    return this.withGroupsAPI(new GroupsAPI(groups));
  }

  /** Replace the default GroupsAPI with a custom implementation. */
  public WorkspaceClient withGroupsAPI(GroupsAPI groups) {
    this.groupsAPI = groups;
    return this;
  }

  /** Replace the default InstancePoolsService with a custom implementation. */
  public WorkspaceClient withInstancePoolsImpl(InstancePoolsService instancePools) {
    return this.withInstancePoolsAPI(new InstancePoolsAPI(instancePools));
  }

  /** Replace the default InstancePoolsAPI with a custom implementation. */
  public WorkspaceClient withInstancePoolsAPI(InstancePoolsAPI instancePools) {
    this.instancePoolsAPI = instancePools;
    return this;
  }

  /** Replace the default InstanceProfilesService with a custom implementation. */
  public WorkspaceClient withInstanceProfilesImpl(InstanceProfilesService instanceProfiles) {
    return this.withInstanceProfilesAPI(new InstanceProfilesAPI(instanceProfiles));
  }

  /** Replace the default InstanceProfilesAPI with a custom implementation. */
  public WorkspaceClient withInstanceProfilesAPI(InstanceProfilesAPI instanceProfiles) {
    this.instanceProfilesAPI = instanceProfiles;
    return this;
  }

  /** Replace the default IpAccessListsService with a custom implementation. */
  public WorkspaceClient withIpAccessListsImpl(IpAccessListsService ipAccessLists) {
    return this.withIpAccessListsAPI(new IpAccessListsAPI(ipAccessLists));
  }

  /** Replace the default IpAccessListsAPI with a custom implementation. */
  public WorkspaceClient withIpAccessListsAPI(IpAccessListsAPI ipAccessLists) {
    this.ipAccessListsAPI = ipAccessLists;
    return this;
  }

  /** Replace the default JobsService with a custom implementation. */
  public WorkspaceClient withJobsImpl(JobsService jobs) {
    return this.withJobsAPI(new JobsAPI(jobs));
  }

  /** Replace the default JobsAPI with a custom implementation. */
  public WorkspaceClient withJobsAPI(JobsAPI jobs) {
    this.jobsAPI = jobs;
    return this;
  }

  /** Replace the default LakehouseMonitorsService with a custom implementation. */
  public WorkspaceClient withLakehouseMonitorsImpl(LakehouseMonitorsService lakehouseMonitors) {
    return this.withLakehouseMonitorsAPI(new LakehouseMonitorsAPI(lakehouseMonitors));
  }

  /** Replace the default LakehouseMonitorsAPI with a custom implementation. */
  public WorkspaceClient withLakehouseMonitorsAPI(LakehouseMonitorsAPI lakehouseMonitors) {
    this.lakehouseMonitorsAPI = lakehouseMonitors;
    return this;
  }

  /** Replace the default LakeviewService with a custom implementation. */
  public WorkspaceClient withLakeviewImpl(LakeviewService lakeview) {
    return this.withLakeviewAPI(new LakeviewAPI(lakeview));
  }

  /** Replace the default LakeviewAPI with a custom implementation. */
  public WorkspaceClient withLakeviewAPI(LakeviewAPI lakeview) {
    this.lakeviewAPI = lakeview;
    return this;
  }

  /** Replace the default LibrariesService with a custom implementation. */
  public WorkspaceClient withLibrariesImpl(LibrariesService libraries) {
    return this.withLibrariesAPI(new LibrariesAPI(libraries));
  }

  /** Replace the default LibrariesAPI with a custom implementation. */
  public WorkspaceClient withLibrariesAPI(LibrariesAPI libraries) {
    this.librariesAPI = libraries;
    return this;
  }

  /** Replace the default MetastoresService with a custom implementation. */
  public WorkspaceClient withMetastoresImpl(MetastoresService metastores) {
    return this.withMetastoresAPI(new MetastoresAPI(metastores));
  }

  /** Replace the default MetastoresAPI with a custom implementation. */
  public WorkspaceClient withMetastoresAPI(MetastoresAPI metastores) {
    this.metastoresAPI = metastores;
    return this;
  }

  /** Replace the default ModelRegistryService with a custom implementation. */
  public WorkspaceClient withModelRegistryImpl(ModelRegistryService modelRegistry) {
    return this.withModelRegistryAPI(new ModelRegistryAPI(modelRegistry));
  }

  /** Replace the default ModelRegistryAPI with a custom implementation. */
  public WorkspaceClient withModelRegistryAPI(ModelRegistryAPI modelRegistry) {
    this.modelRegistryAPI = modelRegistry;
    return this;
  }

  /** Replace the default ModelVersionsService with a custom implementation. */
  public WorkspaceClient withModelVersionsImpl(ModelVersionsService modelVersions) {
    return this.withModelVersionsAPI(new ModelVersionsAPI(modelVersions));
  }

  /** Replace the default ModelVersionsAPI with a custom implementation. */
  public WorkspaceClient withModelVersionsAPI(ModelVersionsAPI modelVersions) {
    this.modelVersionsAPI = modelVersions;
    return this;
  }

  /** Replace the default PermissionsService with a custom implementation. */
  public WorkspaceClient withPermissionsImpl(PermissionsService permissions) {
    return this.withPermissionsAPI(new PermissionsAPI(permissions));
  }

  /** Replace the default PermissionsAPI with a custom implementation. */
  public WorkspaceClient withPermissionsAPI(PermissionsAPI permissions) {
    this.permissionsAPI = permissions;
    return this;
  }

  /** Replace the default PipelinesService with a custom implementation. */
  public WorkspaceClient withPipelinesImpl(PipelinesService pipelines) {
    return this.withPipelinesAPI(new PipelinesAPI(pipelines));
  }

  /** Replace the default PipelinesAPI with a custom implementation. */
  public WorkspaceClient withPipelinesAPI(PipelinesAPI pipelines) {
    this.pipelinesAPI = pipelines;
    return this;
  }

  /** Replace the default PolicyFamiliesService with a custom implementation. */
  public WorkspaceClient withPolicyFamiliesImpl(PolicyFamiliesService policyFamilies) {
    return this.withPolicyFamiliesAPI(new PolicyFamiliesAPI(policyFamilies));
  }

  /** Replace the default PolicyFamiliesAPI with a custom implementation. */
  public WorkspaceClient withPolicyFamiliesAPI(PolicyFamiliesAPI policyFamilies) {
    this.policyFamiliesAPI = policyFamilies;
    return this;
  }

  /** Replace the default ProvidersService with a custom implementation. */
  public WorkspaceClient withProvidersImpl(ProvidersService providers) {
    return this.withProvidersAPI(new ProvidersAPI(providers));
  }

  /** Replace the default ProvidersAPI with a custom implementation. */
  public WorkspaceClient withProvidersAPI(ProvidersAPI providers) {
    this.providersAPI = providers;
    return this;
  }

  /** Replace the default QueriesService with a custom implementation. */
  public WorkspaceClient withQueriesImpl(QueriesService queries) {
    return this.withQueriesAPI(new QueriesAPI(queries));
  }

  /** Replace the default QueriesAPI with a custom implementation. */
  public WorkspaceClient withQueriesAPI(QueriesAPI queries) {
    this.queriesAPI = queries;
    return this;
  }

  /** Replace the default QueryHistoryService with a custom implementation. */
  public WorkspaceClient withQueryHistoryImpl(QueryHistoryService queryHistory) {
    return this.withQueryHistoryAPI(new QueryHistoryAPI(queryHistory));
  }

  /** Replace the default QueryHistoryAPI with a custom implementation. */
  public WorkspaceClient withQueryHistoryAPI(QueryHistoryAPI queryHistory) {
    this.queryHistoryAPI = queryHistory;
    return this;
  }

  /** Replace the default QueryVisualizationsService with a custom implementation. */
  public WorkspaceClient withQueryVisualizationsImpl(
      QueryVisualizationsService queryVisualizations) {
    return this.withQueryVisualizationsAPI(new QueryVisualizationsAPI(queryVisualizations));
  }

  /** Replace the default QueryVisualizationsAPI with a custom implementation. */
  public WorkspaceClient withQueryVisualizationsAPI(QueryVisualizationsAPI queryVisualizations) {
    this.queryVisualizationsAPI = queryVisualizations;
    return this;
  }

  /** Replace the default RecipientActivationService with a custom implementation. */
  public WorkspaceClient withRecipientActivationImpl(
      RecipientActivationService recipientActivation) {
    return this.withRecipientActivationAPI(new RecipientActivationAPI(recipientActivation));
  }

  /** Replace the default RecipientActivationAPI with a custom implementation. */
  public WorkspaceClient withRecipientActivationAPI(RecipientActivationAPI recipientActivation) {
    this.recipientActivationAPI = recipientActivation;
    return this;
  }

  /** Replace the default RecipientsService with a custom implementation. */
  public WorkspaceClient withRecipientsImpl(RecipientsService recipients) {
    return this.withRecipientsAPI(new RecipientsAPI(recipients));
  }

  /** Replace the default RecipientsAPI with a custom implementation. */
  public WorkspaceClient withRecipientsAPI(RecipientsAPI recipients) {
    this.recipientsAPI = recipients;
    return this;
  }

  /** Replace the default RegisteredModelsService with a custom implementation. */
  public WorkspaceClient withRegisteredModelsImpl(RegisteredModelsService registeredModels) {
    return this.withRegisteredModelsAPI(new RegisteredModelsAPI(registeredModels));
  }

  /** Replace the default RegisteredModelsAPI with a custom implementation. */
  public WorkspaceClient withRegisteredModelsAPI(RegisteredModelsAPI registeredModels) {
    this.registeredModelsAPI = registeredModels;
    return this;
  }

  /** Replace the default ReposService with a custom implementation. */
  public WorkspaceClient withReposImpl(ReposService repos) {
    return this.withReposAPI(new ReposAPI(repos));
  }

  /** Replace the default ReposAPI with a custom implementation. */
  public WorkspaceClient withReposAPI(ReposAPI repos) {
    this.reposAPI = repos;
    return this;
  }

  /** Replace the default SchemasService with a custom implementation. */
  public WorkspaceClient withSchemasImpl(SchemasService schemas) {
    return this.withSchemasAPI(new SchemasAPI(schemas));
  }

  /** Replace the default SchemasAPI with a custom implementation. */
  public WorkspaceClient withSchemasAPI(SchemasAPI schemas) {
    this.schemasAPI = schemas;
    return this;
  }

  /** Replace the default SecretsService with a custom implementation. */
  public WorkspaceClient withSecretsImpl(SecretsService secrets) {
    return this.withSecretsAPI(new SecretsExt(secrets));
  }

  /** Replace the default SecretsAPI with a custom implementation. */
  public WorkspaceClient withSecretsAPI(SecretsExt secrets) {
    this.secretsAPI = secrets;
    return this;
  }

  /** Replace the default ServicePrincipalsService with a custom implementation. */
  public WorkspaceClient withServicePrincipalsImpl(ServicePrincipalsService servicePrincipals) {
    return this.withServicePrincipalsAPI(new ServicePrincipalsAPI(servicePrincipals));
  }

  /** Replace the default ServicePrincipalsAPI with a custom implementation. */
  public WorkspaceClient withServicePrincipalsAPI(ServicePrincipalsAPI servicePrincipals) {
    this.servicePrincipalsAPI = servicePrincipals;
    return this;
  }

  /** Replace the default ServingEndpointsService with a custom implementation. */
  public WorkspaceClient withServingEndpointsImpl(ServingEndpointsService servingEndpoints) {
    return this.withServingEndpointsAPI(new ServingEndpointsAPI(servingEndpoints));
  }

  /** Replace the default ServingEndpointsAPI with a custom implementation. */
  public WorkspaceClient withServingEndpointsAPI(ServingEndpointsAPI servingEndpoints) {
    this.servingEndpointsAPI = servingEndpoints;
    return this;
  }

  /** Replace the default SettingsService with a custom implementation. */
  public WorkspaceClient withSettingsImpl(SettingsService settings) {
    return this.withSettingsAPI(new SettingsAPI(settings));
  }

  /** Replace the default SettingsAPI with a custom implementation. */
  public WorkspaceClient withSettingsAPI(SettingsAPI settings) {
    this.settingsAPI = settings;
    return this;
  }

  /** Replace the default SharesService with a custom implementation. */
  public WorkspaceClient withSharesImpl(SharesService shares) {
    return this.withSharesAPI(new SharesAPI(shares));
  }

  /** Replace the default SharesAPI with a custom implementation. */
  public WorkspaceClient withSharesAPI(SharesAPI shares) {
    this.sharesAPI = shares;
    return this;
  }

  /** Replace the default StatementExecutionService with a custom implementation. */
  public WorkspaceClient withStatementExecutionImpl(StatementExecutionService statementExecution) {
    return this.withStatementExecutionAPI(new StatementExecutionAPI(statementExecution));
  }

  /** Replace the default StatementExecutionAPI with a custom implementation. */
  public WorkspaceClient withStatementExecutionAPI(StatementExecutionAPI statementExecution) {
    this.statementExecutionAPI = statementExecution;
    return this;
  }

  /** Replace the default StorageCredentialsService with a custom implementation. */
  public WorkspaceClient withStorageCredentialsImpl(StorageCredentialsService storageCredentials) {
    return this.withStorageCredentialsAPI(new StorageCredentialsAPI(storageCredentials));
  }

  /** Replace the default StorageCredentialsAPI with a custom implementation. */
  public WorkspaceClient withStorageCredentialsAPI(StorageCredentialsAPI storageCredentials) {
    this.storageCredentialsAPI = storageCredentials;
    return this;
  }

  /** Replace the default SystemSchemasService with a custom implementation. */
  public WorkspaceClient withSystemSchemasImpl(SystemSchemasService systemSchemas) {
    return this.withSystemSchemasAPI(new SystemSchemasAPI(systemSchemas));
  }

  /** Replace the default SystemSchemasAPI with a custom implementation. */
  public WorkspaceClient withSystemSchemasAPI(SystemSchemasAPI systemSchemas) {
    this.systemSchemasAPI = systemSchemas;
    return this;
  }

  /** Replace the default TableConstraintsService with a custom implementation. */
  public WorkspaceClient withTableConstraintsImpl(TableConstraintsService tableConstraints) {
    return this.withTableConstraintsAPI(new TableConstraintsAPI(tableConstraints));
  }

  /** Replace the default TableConstraintsAPI with a custom implementation. */
  public WorkspaceClient withTableConstraintsAPI(TableConstraintsAPI tableConstraints) {
    this.tableConstraintsAPI = tableConstraints;
    return this;
  }

  /** Replace the default TablesService with a custom implementation. */
  public WorkspaceClient withTablesImpl(TablesService tables) {
    return this.withTablesAPI(new TablesAPI(tables));
  }

  /** Replace the default TablesAPI with a custom implementation. */
  public WorkspaceClient withTablesAPI(TablesAPI tables) {
    this.tablesAPI = tables;
    return this;
  }

  /** Replace the default TokenManagementService with a custom implementation. */
  public WorkspaceClient withTokenManagementImpl(TokenManagementService tokenManagement) {
    return this.withTokenManagementAPI(new TokenManagementAPI(tokenManagement));
  }

  /** Replace the default TokenManagementAPI with a custom implementation. */
  public WorkspaceClient withTokenManagementAPI(TokenManagementAPI tokenManagement) {
    this.tokenManagementAPI = tokenManagement;
    return this;
  }

  /** Replace the default TokensService with a custom implementation. */
  public WorkspaceClient withTokensImpl(TokensService tokens) {
    return this.withTokensAPI(new TokensAPI(tokens));
  }

  /** Replace the default TokensAPI with a custom implementation. */
  public WorkspaceClient withTokensAPI(TokensAPI tokens) {
    this.tokensAPI = tokens;
    return this;
  }

  /** Replace the default UsersService with a custom implementation. */
  public WorkspaceClient withUsersImpl(UsersService users) {
    return this.withUsersAPI(new UsersAPI(users));
  }

  /** Replace the default UsersAPI with a custom implementation. */
  public WorkspaceClient withUsersAPI(UsersAPI users) {
    this.usersAPI = users;
    return this;
  }

  /** Replace the default VectorSearchEndpointsService with a custom implementation. */
  public WorkspaceClient withVectorSearchEndpointsImpl(
      VectorSearchEndpointsService vectorSearchEndpoints) {
    return this.withVectorSearchEndpointsAPI(new VectorSearchEndpointsAPI(vectorSearchEndpoints));
  }

  /** Replace the default VectorSearchEndpointsAPI with a custom implementation. */
  public WorkspaceClient withVectorSearchEndpointsAPI(
      VectorSearchEndpointsAPI vectorSearchEndpoints) {
    this.vectorSearchEndpointsAPI = vectorSearchEndpoints;
    return this;
  }

  /** Replace the default VectorSearchIndexesService with a custom implementation. */
  public WorkspaceClient withVectorSearchIndexesImpl(
      VectorSearchIndexesService vectorSearchIndexes) {
    return this.withVectorSearchIndexesAPI(new VectorSearchIndexesAPI(vectorSearchIndexes));
  }

  /** Replace the default VectorSearchIndexesAPI with a custom implementation. */
  public WorkspaceClient withVectorSearchIndexesAPI(VectorSearchIndexesAPI vectorSearchIndexes) {
    this.vectorSearchIndexesAPI = vectorSearchIndexes;
    return this;
  }

  /** Replace the default VolumesService with a custom implementation. */
  public WorkspaceClient withVolumesImpl(VolumesService volumes) {
    return this.withVolumesAPI(new VolumesAPI(volumes));
  }

  /** Replace the default VolumesAPI with a custom implementation. */
  public WorkspaceClient withVolumesAPI(VolumesAPI volumes) {
    this.volumesAPI = volumes;
    return this;
  }

  /** Replace the default WarehousesService with a custom implementation. */
  public WorkspaceClient withWarehousesImpl(WarehousesService warehouses) {
    return this.withWarehousesAPI(new WarehousesAPI(warehouses));
  }

  /** Replace the default WarehousesAPI with a custom implementation. */
  public WorkspaceClient withWarehousesAPI(WarehousesAPI warehouses) {
    this.warehousesAPI = warehouses;
    return this;
  }

  /** Replace the default WorkspaceService with a custom implementation. */
  public WorkspaceClient withWorkspaceImpl(WorkspaceService workspace) {
    return this.withWorkspaceAPI(new WorkspaceAPI(workspace));
  }

  /** Replace the default WorkspaceAPI with a custom implementation. */
  public WorkspaceClient withWorkspaceAPI(WorkspaceAPI workspace) {
    this.workspaceAPI = workspace;
    return this;
  }

  /** Replace the default WorkspaceBindingsService with a custom implementation. */
  public WorkspaceClient withWorkspaceBindingsImpl(WorkspaceBindingsService workspaceBindings) {
    return this.withWorkspaceBindingsAPI(new WorkspaceBindingsAPI(workspaceBindings));
  }

  /** Replace the default WorkspaceBindingsAPI with a custom implementation. */
  public WorkspaceClient withWorkspaceBindingsAPI(WorkspaceBindingsAPI workspaceBindings) {
    this.workspaceBindingsAPI = workspaceBindings;
    return this;
  }

  /** Replace the default WorkspaceConfService with a custom implementation. */
  public WorkspaceClient withWorkspaceConfImpl(WorkspaceConfService workspaceConf) {
    return this.withWorkspaceConfAPI(new WorkspaceConfAPI(workspaceConf));
  }

  /** Replace the default WorkspaceConfAPI with a custom implementation. */
  public WorkspaceClient withWorkspaceConfAPI(WorkspaceConfAPI workspaceConf) {
    this.workspaceConfAPI = workspaceConf;
    return this;
  }

  public ApiClient apiClient() {
    return apiClient;
  }

  public DatabricksConfig config() {
    return config;
  }
}
