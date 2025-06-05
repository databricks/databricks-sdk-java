// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/** Describes all of the metadata about a single Spark cluster in Databricks. */
@Generated
public class ClusterDetails {
  /**
   * Parameters needed in order to automatically scale clusters up and down based on load. Note:
   * autoscaling works best with DB runtime versions 3.0 or later.
   */
  @JsonProperty("autoscale")
  private AutoScale autoscale;

  /**
   * Automatically terminates the cluster after it is inactive for this time in minutes. If not set,
   * this cluster will not be automatically terminated. If specified, the threshold must be between
   * 10 and 10000 minutes. Users can also set this value to 0 to explicitly disable automatic
   * termination.
   */
  @JsonProperty("autotermination_minutes")
  private Long autoterminationMinutes;

  /**
   * Attributes related to clusters running on Amazon Web Services. If not specified at cluster
   * creation, a set of default values will be used.
   */
  @JsonProperty("aws_attributes")
  private AwsAttributes awsAttributes;

  /**
   * Attributes related to clusters running on Microsoft Azure. If not specified at cluster
   * creation, a set of default values will be used.
   */
  @JsonProperty("azure_attributes")
  private AzureAttributes azureAttributes;

  /**
   * Number of CPU cores available for this cluster. Note that this can be fractional, e.g. 7.5
   * cores, since certain node types are configured to share cores between Spark nodes on the same
   * instance.
   */
  @JsonProperty("cluster_cores")
  private Double clusterCores;

  /**
   * Canonical identifier for the cluster. This id is retained during cluster restarts and resizes,
   * while each new cluster has a globally unique id.
   */
  @JsonProperty("cluster_id")
  private String clusterId;

  /**
   * The configuration for delivering spark logs to a long-term storage destination. Three kinds of
   * destinations (DBFS, S3 and Unity Catalog volumes) are supported. Only one destination can be
   * specified for one cluster. If the conf is given, the logs will be delivered to the destination
   * every `5 mins`. The destination of driver logs is `$destination/$clusterId/driver`, while the
   * destination of executor logs is `$destination/$clusterId/executor`.
   */
  @JsonProperty("cluster_log_conf")
  private ClusterLogConf clusterLogConf;

  /** Cluster log delivery status. */
  @JsonProperty("cluster_log_status")
  private LogSyncStatus clusterLogStatus;

  /** Total amount of cluster memory, in megabytes */
  @JsonProperty("cluster_memory_mb")
  private Long clusterMemoryMb;

  /**
   * Cluster name requested by the user. This doesn't have to be unique. If not specified at
   * creation, the cluster name will be an empty string. For job clusters, the cluster name is
   * automatically set based on the job and job run IDs.
   */
  @JsonProperty("cluster_name")
  private String clusterName;

  /**
   * Determines whether the cluster was created by a user through the UI, created by the Databricks
   * Jobs Scheduler, or through an API request.
   */
  @JsonProperty("cluster_source")
  private ClusterSource clusterSource;

  /**
   * Creator user name. The field won't be included in the response if the user has already been
   * deleted.
   */
  @JsonProperty("creator_user_name")
  private String creatorUserName;

  /**
   * Additional tags for cluster resources. Databricks will tag all cluster resources (e.g., AWS
   * instances and EBS volumes) with these tags in addition to `default_tags`. Notes:
   *
   * <p>- Currently, Databricks allows at most 45 custom tags
   *
   * <p>- Clusters can only reuse cloud resources if the resources' tags are a subset of the cluster
   * tags
   */
  @JsonProperty("custom_tags")
  private Map<String, String> customTags;

  /**
   * Data security mode decides what data governance model to use when accessing data from a
   * cluster.
   *
   * <p>The following modes can only be used when `kind = CLASSIC_PREVIEW`. *
   * `DATA_SECURITY_MODE_AUTO`: Databricks will choose the most appropriate access mode depending on
   * your compute configuration. * `DATA_SECURITY_MODE_STANDARD`: Alias for `USER_ISOLATION`. *
   * `DATA_SECURITY_MODE_DEDICATED`: Alias for `SINGLE_USER`.
   *
   * <p>The following modes can be used regardless of `kind`. * `NONE`: No security isolation for
   * multiple users sharing the cluster. Data governance features are not available in this mode. *
   * `SINGLE_USER`: A secure cluster that can only be exclusively used by a single user specified in
   * `single_user_name`. Most programming languages, cluster features and data governance features
   * are available in this mode. * `USER_ISOLATION`: A secure cluster that can be shared by multiple
   * users. Cluster users are fully isolated so that they cannot see each other's data and
   * credentials. Most data governance features are supported in this mode. But programming
   * languages and cluster features might be limited.
   *
   * <p>The following modes are deprecated starting with Databricks Runtime 15.0 and will be removed
   * for future Databricks Runtime versions:
   *
   * <p>* `LEGACY_TABLE_ACL`: This mode is for users migrating from legacy Table ACL clusters. *
   * `LEGACY_PASSTHROUGH`: This mode is for users migrating from legacy Passthrough on high
   * concurrency clusters. * `LEGACY_SINGLE_USER`: This mode is for users migrating from legacy
   * Passthrough on standard clusters. * `LEGACY_SINGLE_USER_STANDARD`: This mode provides a way
   * that doesn’t have UC nor passthrough enabled.
   */
  @JsonProperty("data_security_mode")
  private DataSecurityMode dataSecurityMode;

  /**
   * Tags that are added by Databricks regardless of any `custom_tags`, including:
   *
   * <p>- Vendor: Databricks
   *
   * <p>- Creator: <username_of_creator>
   *
   * <p>- ClusterName: <name_of_cluster>
   *
   * <p>- ClusterId: <id_of_cluster>
   *
   * <p>- Name: <Databricks internal use>
   */
  @JsonProperty("default_tags")
  private Map<String, String> defaultTags;

  /** Custom docker image BYOC */
  @JsonProperty("docker_image")
  private DockerImage dockerImage;

  /**
   * Node on which the Spark driver resides. The driver node contains the Spark master and the
   * Databricks application that manages the per-notebook Spark REPLs.
   */
  @JsonProperty("driver")
  private SparkNode driver;

  /**
   * The optional ID of the instance pool for the driver of the cluster belongs. The pool cluster
   * uses the instance pool with id (instance_pool_id) if the driver pool is not assigned.
   */
  @JsonProperty("driver_instance_pool_id")
  private String driverInstancePoolId;

  /**
   * The node type of the Spark driver. Note that this field is optional; if unset, the driver node
   * type will be set as the same value as `node_type_id` defined above.
   *
   * <p>This field, along with node_type_id, should not be set if virtual_cluster_size is set. If
   * both driver_node_type_id, node_type_id, and virtual_cluster_size are specified,
   * driver_node_type_id and node_type_id take precedence.
   */
  @JsonProperty("driver_node_type_id")
  private String driverNodeTypeId;

  /**
   * Autoscaling Local Storage: when enabled, this cluster will dynamically acquire additional disk
   * space when its Spark workers are running low on disk space. This feature requires specific AWS
   * permissions to function correctly - refer to the User Guide for more details.
   */
  @JsonProperty("enable_elastic_disk")
  private Boolean enableElasticDisk;

  /** Whether to enable LUKS on cluster VMs' local disks */
  @JsonProperty("enable_local_disk_encryption")
  private Boolean enableLocalDiskEncryption;

  /** Nodes on which the Spark executors reside. */
  @JsonProperty("executors")
  private Collection<SparkNode> executors;

  /**
   * Attributes related to clusters running on Google Cloud Platform. If not specified at cluster
   * creation, a set of default values will be used.
   */
  @JsonProperty("gcp_attributes")
  private GcpAttributes gcpAttributes;

  /**
   * The configuration for storing init scripts. Any number of destinations can be specified. The
   * scripts are executed sequentially in the order provided. If `cluster_log_conf` is specified,
   * init script logs are sent to `<destination>/<cluster-ID>/init_scripts`.
   */
  @JsonProperty("init_scripts")
  private Collection<InitScriptInfo> initScripts;

  /** The optional ID of the instance pool to which the cluster belongs. */
  @JsonProperty("instance_pool_id")
  private String instancePoolId;

  /**
   * This field can only be used when `kind = CLASSIC_PREVIEW`.
   *
   * <p>When set to true, Databricks will automatically set single node related `custom_tags`,
   * `spark_conf`, and `num_workers`
   */
  @JsonProperty("is_single_node")
  private Boolean isSingleNode;

  /**
   * Port on which Spark JDBC server is listening, in the driver nod. No service will be listeningon
   * on this port in executor nodes.
   */
  @JsonProperty("jdbc_port")
  private Long jdbcPort;

  /**
   * The kind of compute described by this compute specification.
   *
   * <p>Depending on `kind`, different validations and default values will be applied.
   *
   * <p>Clusters with `kind = CLASSIC_PREVIEW` support the following fields, whereas clusters with
   * no specified `kind` do not. * [is_single_node](/api/workspace/clusters/create#is_single_node) *
   * [use_ml_runtime](/api/workspace/clusters/create#use_ml_runtime) *
   * [data_security_mode](/api/workspace/clusters/create#data_security_mode) set to
   * `DATA_SECURITY_MODE_AUTO`, `DATA_SECURITY_MODE_DEDICATED`, or `DATA_SECURITY_MODE_STANDARD`
   *
   * <p>By using the [simple form], your clusters are automatically using `kind = CLASSIC_PREVIEW`.
   *
   * <p>[simple form]: https://docs.databricks.com/compute/simple-form.html
   */
  @JsonProperty("kind")
  private Kind kind;

  /** the timestamp that the cluster was started/restarted */
  @JsonProperty("last_restarted_time")
  private Long lastRestartedTime;

  /** Time when the cluster driver last lost its state (due to a restart or driver failure). */
  @JsonProperty("last_state_loss_time")
  private Long lastStateLossTime;

  /**
   * This field encodes, through a single value, the resources available to each of the Spark nodes
   * in this cluster. For example, the Spark nodes can be provisioned and optimized for memory or
   * compute intensive workloads. A list of available node types can be retrieved by using the
   * :method:clusters/listNodeTypes API call.
   */
  @JsonProperty("node_type_id")
  private String nodeTypeId;

  /**
   * Number of worker nodes that this cluster should have. A cluster has one Spark Driver and
   * `num_workers` Executors for a total of `num_workers` + 1 Spark nodes.
   *
   * <p>Note: When reading the properties of a cluster, this field reflects the desired number of
   * workers rather than the actual current number of workers. For instance, if a cluster is resized
   * from 5 to 10 workers, this field will immediately be updated to reflect the target size of 10
   * workers, whereas the workers listed in `spark_info` will gradually increase from 5 to 10 as the
   * new nodes are provisioned.
   */
  @JsonProperty("num_workers")
  private Long numWorkers;

  /** The ID of the cluster policy used to create the cluster if applicable. */
  @JsonProperty("policy_id")
  private String policyId;

  /**
   * Determines the cluster's runtime engine, either standard or Photon.
   *
   * <p>This field is not compatible with legacy `spark_version` values that contain `-photon-`.
   * Remove `-photon-` from the `spark_version` and set `runtime_engine` to `PHOTON`.
   *
   * <p>If left unspecified, the runtime engine defaults to standard unless the spark_version
   * contains -photon-, in which case Photon will be used.
   */
  @JsonProperty("runtime_engine")
  private RuntimeEngine runtimeEngine;

  /** Single user name if data_security_mode is `SINGLE_USER` */
  @JsonProperty("single_user_name")
  private String singleUserName;

  /**
   * An object containing a set of optional, user-specified Spark configuration key-value pairs.
   * Users can also pass in a string of extra JVM options to the driver and the executors via
   * `spark.driver.extraJavaOptions` and `spark.executor.extraJavaOptions` respectively.
   */
  @JsonProperty("spark_conf")
  private Map<String, String> sparkConf;

  /**
   * A canonical SparkContext identifier. This value *does* change when the Spark driver restarts.
   * The pair `(cluster_id, spark_context_id)` is a globally unique identifier over all Spark
   * contexts.
   */
  @JsonProperty("spark_context_id")
  private Long sparkContextId;

  /**
   * An object containing a set of optional, user-specified environment variable key-value pairs.
   * Please note that key-value pair of the form (X,Y) will be exported as is (i.e., `export X='Y'`)
   * while launching the driver and workers.
   *
   * <p>In order to specify an additional set of `SPARK_DAEMON_JAVA_OPTS`, we recommend appending
   * them to `$SPARK_DAEMON_JAVA_OPTS` as shown in the example below. This ensures that all default
   * databricks managed environmental variables are included as well.
   *
   * <p>Example Spark environment variables: `{"SPARK_WORKER_MEMORY": "28000m", "SPARK_LOCAL_DIRS":
   * "/local_disk0"}` or `{"SPARK_DAEMON_JAVA_OPTS": "$SPARK_DAEMON_JAVA_OPTS
   * -Dspark.shuffle.service.enabled=true"}`
   */
  @JsonProperty("spark_env_vars")
  private Map<String, String> sparkEnvVars;

  /**
   * The Spark version of the cluster, e.g. `3.3.x-scala2.11`. A list of available Spark versions
   * can be retrieved by using the :method:clusters/sparkVersions API call.
   */
  @JsonProperty("spark_version")
  private String sparkVersion;

  /**
   * The spec contains a snapshot of the latest user specified settings that were used to
   * create/edit the cluster. Note: not included in the response of the ListClusters API.
   */
  @JsonProperty("spec")
  private ClusterSpec spec;

  /**
   * SSH public key contents that will be added to each Spark node in this cluster. The
   * corresponding private keys can be used to login with the user name `ubuntu` on port `2200`. Up
   * to 10 keys can be specified.
   */
  @JsonProperty("ssh_public_keys")
  private Collection<String> sshPublicKeys;

  /**
   * Time (in epoch milliseconds) when the cluster creation request was received (when the cluster
   * entered a `PENDING` state).
   */
  @JsonProperty("start_time")
  private Long startTime;

  /** Current state of the cluster. */
  @JsonProperty("state")
  private State state;

  /**
   * A message associated with the most recent state transition (e.g., the reason why the cluster
   * entered a `TERMINATED` state).
   */
  @JsonProperty("state_message")
  private String stateMessage;

  /** Time (in epoch milliseconds) when the cluster was terminated, if applicable. */
  @JsonProperty("terminated_time")
  private Long terminatedTime;

  /**
   * Information about why the cluster was terminated. This field only appears when the cluster is
   * in a `TERMINATING` or `TERMINATED` state.
   */
  @JsonProperty("termination_reason")
  private TerminationReason terminationReason;

  /**
   * This field can only be used when `kind = CLASSIC_PREVIEW`.
   *
   * <p>`effective_spark_version` is determined by `spark_version` (DBR release), this field
   * `use_ml_runtime`, and whether `node_type_id` is gpu node or not.
   */
  @JsonProperty("use_ml_runtime")
  private Boolean useMlRuntime;

  /** Cluster Attributes showing for clusters workload types. */
  @JsonProperty("workload_type")
  private WorkloadType workloadType;

  public ClusterDetails setAutoscale(AutoScale autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  public AutoScale getAutoscale() {
    return autoscale;
  }

  public ClusterDetails setAutoterminationMinutes(Long autoterminationMinutes) {
    this.autoterminationMinutes = autoterminationMinutes;
    return this;
  }

  public Long getAutoterminationMinutes() {
    return autoterminationMinutes;
  }

  public ClusterDetails setAwsAttributes(AwsAttributes awsAttributes) {
    this.awsAttributes = awsAttributes;
    return this;
  }

  public AwsAttributes getAwsAttributes() {
    return awsAttributes;
  }

  public ClusterDetails setAzureAttributes(AzureAttributes azureAttributes) {
    this.azureAttributes = azureAttributes;
    return this;
  }

  public AzureAttributes getAzureAttributes() {
    return azureAttributes;
  }

  public ClusterDetails setClusterCores(Double clusterCores) {
    this.clusterCores = clusterCores;
    return this;
  }

  public Double getClusterCores() {
    return clusterCores;
  }

  public ClusterDetails setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ClusterDetails setClusterLogConf(ClusterLogConf clusterLogConf) {
    this.clusterLogConf = clusterLogConf;
    return this;
  }

  public ClusterLogConf getClusterLogConf() {
    return clusterLogConf;
  }

  public ClusterDetails setClusterLogStatus(LogSyncStatus clusterLogStatus) {
    this.clusterLogStatus = clusterLogStatus;
    return this;
  }

  public LogSyncStatus getClusterLogStatus() {
    return clusterLogStatus;
  }

  public ClusterDetails setClusterMemoryMb(Long clusterMemoryMb) {
    this.clusterMemoryMb = clusterMemoryMb;
    return this;
  }

  public Long getClusterMemoryMb() {
    return clusterMemoryMb;
  }

  public ClusterDetails setClusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  public String getClusterName() {
    return clusterName;
  }

  public ClusterDetails setClusterSource(ClusterSource clusterSource) {
    this.clusterSource = clusterSource;
    return this;
  }

  public ClusterSource getClusterSource() {
    return clusterSource;
  }

  public ClusterDetails setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public ClusterDetails setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public ClusterDetails setDataSecurityMode(DataSecurityMode dataSecurityMode) {
    this.dataSecurityMode = dataSecurityMode;
    return this;
  }

  public DataSecurityMode getDataSecurityMode() {
    return dataSecurityMode;
  }

  public ClusterDetails setDefaultTags(Map<String, String> defaultTags) {
    this.defaultTags = defaultTags;
    return this;
  }

  public Map<String, String> getDefaultTags() {
    return defaultTags;
  }

  public ClusterDetails setDockerImage(DockerImage dockerImage) {
    this.dockerImage = dockerImage;
    return this;
  }

  public DockerImage getDockerImage() {
    return dockerImage;
  }

  public ClusterDetails setDriver(SparkNode driver) {
    this.driver = driver;
    return this;
  }

  public SparkNode getDriver() {
    return driver;
  }

  public ClusterDetails setDriverInstancePoolId(String driverInstancePoolId) {
    this.driverInstancePoolId = driverInstancePoolId;
    return this;
  }

  public String getDriverInstancePoolId() {
    return driverInstancePoolId;
  }

  public ClusterDetails setDriverNodeTypeId(String driverNodeTypeId) {
    this.driverNodeTypeId = driverNodeTypeId;
    return this;
  }

  public String getDriverNodeTypeId() {
    return driverNodeTypeId;
  }

  public ClusterDetails setEnableElasticDisk(Boolean enableElasticDisk) {
    this.enableElasticDisk = enableElasticDisk;
    return this;
  }

  public Boolean getEnableElasticDisk() {
    return enableElasticDisk;
  }

  public ClusterDetails setEnableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
    this.enableLocalDiskEncryption = enableLocalDiskEncryption;
    return this;
  }

  public Boolean getEnableLocalDiskEncryption() {
    return enableLocalDiskEncryption;
  }

  public ClusterDetails setExecutors(Collection<SparkNode> executors) {
    this.executors = executors;
    return this;
  }

  public Collection<SparkNode> getExecutors() {
    return executors;
  }

  public ClusterDetails setGcpAttributes(GcpAttributes gcpAttributes) {
    this.gcpAttributes = gcpAttributes;
    return this;
  }

  public GcpAttributes getGcpAttributes() {
    return gcpAttributes;
  }

  public ClusterDetails setInitScripts(Collection<InitScriptInfo> initScripts) {
    this.initScripts = initScripts;
    return this;
  }

  public Collection<InitScriptInfo> getInitScripts() {
    return initScripts;
  }

  public ClusterDetails setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  public ClusterDetails setIsSingleNode(Boolean isSingleNode) {
    this.isSingleNode = isSingleNode;
    return this;
  }

  public Boolean getIsSingleNode() {
    return isSingleNode;
  }

  public ClusterDetails setJdbcPort(Long jdbcPort) {
    this.jdbcPort = jdbcPort;
    return this;
  }

  public Long getJdbcPort() {
    return jdbcPort;
  }

  public ClusterDetails setKind(Kind kind) {
    this.kind = kind;
    return this;
  }

  public Kind getKind() {
    return kind;
  }

  public ClusterDetails setLastRestartedTime(Long lastRestartedTime) {
    this.lastRestartedTime = lastRestartedTime;
    return this;
  }

  public Long getLastRestartedTime() {
    return lastRestartedTime;
  }

  public ClusterDetails setLastStateLossTime(Long lastStateLossTime) {
    this.lastStateLossTime = lastStateLossTime;
    return this;
  }

  public Long getLastStateLossTime() {
    return lastStateLossTime;
  }

  public ClusterDetails setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }

  public ClusterDetails setNumWorkers(Long numWorkers) {
    this.numWorkers = numWorkers;
    return this;
  }

  public Long getNumWorkers() {
    return numWorkers;
  }

  public ClusterDetails setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public ClusterDetails setRuntimeEngine(RuntimeEngine runtimeEngine) {
    this.runtimeEngine = runtimeEngine;
    return this;
  }

  public RuntimeEngine getRuntimeEngine() {
    return runtimeEngine;
  }

  public ClusterDetails setSingleUserName(String singleUserName) {
    this.singleUserName = singleUserName;
    return this;
  }

  public String getSingleUserName() {
    return singleUserName;
  }

  public ClusterDetails setSparkConf(Map<String, String> sparkConf) {
    this.sparkConf = sparkConf;
    return this;
  }

  public Map<String, String> getSparkConf() {
    return sparkConf;
  }

  public ClusterDetails setSparkContextId(Long sparkContextId) {
    this.sparkContextId = sparkContextId;
    return this;
  }

  public Long getSparkContextId() {
    return sparkContextId;
  }

  public ClusterDetails setSparkEnvVars(Map<String, String> sparkEnvVars) {
    this.sparkEnvVars = sparkEnvVars;
    return this;
  }

  public Map<String, String> getSparkEnvVars() {
    return sparkEnvVars;
  }

  public ClusterDetails setSparkVersion(String sparkVersion) {
    this.sparkVersion = sparkVersion;
    return this;
  }

  public String getSparkVersion() {
    return sparkVersion;
  }

  public ClusterDetails setSpec(ClusterSpec spec) {
    this.spec = spec;
    return this;
  }

  public ClusterSpec getSpec() {
    return spec;
  }

  public ClusterDetails setSshPublicKeys(Collection<String> sshPublicKeys) {
    this.sshPublicKeys = sshPublicKeys;
    return this;
  }

  public Collection<String> getSshPublicKeys() {
    return sshPublicKeys;
  }

  public ClusterDetails setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public ClusterDetails setState(State state) {
    this.state = state;
    return this;
  }

  public State getState() {
    return state;
  }

  public ClusterDetails setStateMessage(String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
  }

  public String getStateMessage() {
    return stateMessage;
  }

  public ClusterDetails setTerminatedTime(Long terminatedTime) {
    this.terminatedTime = terminatedTime;
    return this;
  }

  public Long getTerminatedTime() {
    return terminatedTime;
  }

  public ClusterDetails setTerminationReason(TerminationReason terminationReason) {
    this.terminationReason = terminationReason;
    return this;
  }

  public TerminationReason getTerminationReason() {
    return terminationReason;
  }

  public ClusterDetails setUseMlRuntime(Boolean useMlRuntime) {
    this.useMlRuntime = useMlRuntime;
    return this;
  }

  public Boolean getUseMlRuntime() {
    return useMlRuntime;
  }

  public ClusterDetails setWorkloadType(WorkloadType workloadType) {
    this.workloadType = workloadType;
    return this;
  }

  public WorkloadType getWorkloadType() {
    return workloadType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterDetails that = (ClusterDetails) o;
    return Objects.equals(autoscale, that.autoscale)
        && Objects.equals(autoterminationMinutes, that.autoterminationMinutes)
        && Objects.equals(awsAttributes, that.awsAttributes)
        && Objects.equals(azureAttributes, that.azureAttributes)
        && Objects.equals(clusterCores, that.clusterCores)
        && Objects.equals(clusterId, that.clusterId)
        && Objects.equals(clusterLogConf, that.clusterLogConf)
        && Objects.equals(clusterLogStatus, that.clusterLogStatus)
        && Objects.equals(clusterMemoryMb, that.clusterMemoryMb)
        && Objects.equals(clusterName, that.clusterName)
        && Objects.equals(clusterSource, that.clusterSource)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(dataSecurityMode, that.dataSecurityMode)
        && Objects.equals(defaultTags, that.defaultTags)
        && Objects.equals(dockerImage, that.dockerImage)
        && Objects.equals(driver, that.driver)
        && Objects.equals(driverInstancePoolId, that.driverInstancePoolId)
        && Objects.equals(driverNodeTypeId, that.driverNodeTypeId)
        && Objects.equals(enableElasticDisk, that.enableElasticDisk)
        && Objects.equals(enableLocalDiskEncryption, that.enableLocalDiskEncryption)
        && Objects.equals(executors, that.executors)
        && Objects.equals(gcpAttributes, that.gcpAttributes)
        && Objects.equals(initScripts, that.initScripts)
        && Objects.equals(instancePoolId, that.instancePoolId)
        && Objects.equals(isSingleNode, that.isSingleNode)
        && Objects.equals(jdbcPort, that.jdbcPort)
        && Objects.equals(kind, that.kind)
        && Objects.equals(lastRestartedTime, that.lastRestartedTime)
        && Objects.equals(lastStateLossTime, that.lastStateLossTime)
        && Objects.equals(nodeTypeId, that.nodeTypeId)
        && Objects.equals(numWorkers, that.numWorkers)
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(runtimeEngine, that.runtimeEngine)
        && Objects.equals(singleUserName, that.singleUserName)
        && Objects.equals(sparkConf, that.sparkConf)
        && Objects.equals(sparkContextId, that.sparkContextId)
        && Objects.equals(sparkEnvVars, that.sparkEnvVars)
        && Objects.equals(sparkVersion, that.sparkVersion)
        && Objects.equals(spec, that.spec)
        && Objects.equals(sshPublicKeys, that.sshPublicKeys)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(state, that.state)
        && Objects.equals(stateMessage, that.stateMessage)
        && Objects.equals(terminatedTime, that.terminatedTime)
        && Objects.equals(terminationReason, that.terminationReason)
        && Objects.equals(useMlRuntime, that.useMlRuntime)
        && Objects.equals(workloadType, that.workloadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoscale,
        autoterminationMinutes,
        awsAttributes,
        azureAttributes,
        clusterCores,
        clusterId,
        clusterLogConf,
        clusterLogStatus,
        clusterMemoryMb,
        clusterName,
        clusterSource,
        creatorUserName,
        customTags,
        dataSecurityMode,
        defaultTags,
        dockerImage,
        driver,
        driverInstancePoolId,
        driverNodeTypeId,
        enableElasticDisk,
        enableLocalDiskEncryption,
        executors,
        gcpAttributes,
        initScripts,
        instancePoolId,
        isSingleNode,
        jdbcPort,
        kind,
        lastRestartedTime,
        lastStateLossTime,
        nodeTypeId,
        numWorkers,
        policyId,
        runtimeEngine,
        singleUserName,
        sparkConf,
        sparkContextId,
        sparkEnvVars,
        sparkVersion,
        spec,
        sshPublicKeys,
        startTime,
        state,
        stateMessage,
        terminatedTime,
        terminationReason,
        useMlRuntime,
        workloadType);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterDetails.class)
        .add("autoscale", autoscale)
        .add("autoterminationMinutes", autoterminationMinutes)
        .add("awsAttributes", awsAttributes)
        .add("azureAttributes", azureAttributes)
        .add("clusterCores", clusterCores)
        .add("clusterId", clusterId)
        .add("clusterLogConf", clusterLogConf)
        .add("clusterLogStatus", clusterLogStatus)
        .add("clusterMemoryMb", clusterMemoryMb)
        .add("clusterName", clusterName)
        .add("clusterSource", clusterSource)
        .add("creatorUserName", creatorUserName)
        .add("customTags", customTags)
        .add("dataSecurityMode", dataSecurityMode)
        .add("defaultTags", defaultTags)
        .add("dockerImage", dockerImage)
        .add("driver", driver)
        .add("driverInstancePoolId", driverInstancePoolId)
        .add("driverNodeTypeId", driverNodeTypeId)
        .add("enableElasticDisk", enableElasticDisk)
        .add("enableLocalDiskEncryption", enableLocalDiskEncryption)
        .add("executors", executors)
        .add("gcpAttributes", gcpAttributes)
        .add("initScripts", initScripts)
        .add("instancePoolId", instancePoolId)
        .add("isSingleNode", isSingleNode)
        .add("jdbcPort", jdbcPort)
        .add("kind", kind)
        .add("lastRestartedTime", lastRestartedTime)
        .add("lastStateLossTime", lastStateLossTime)
        .add("nodeTypeId", nodeTypeId)
        .add("numWorkers", numWorkers)
        .add("policyId", policyId)
        .add("runtimeEngine", runtimeEngine)
        .add("singleUserName", singleUserName)
        .add("sparkConf", sparkConf)
        .add("sparkContextId", sparkContextId)
        .add("sparkEnvVars", sparkEnvVars)
        .add("sparkVersion", sparkVersion)
        .add("spec", spec)
        .add("sshPublicKeys", sshPublicKeys)
        .add("startTime", startTime)
        .add("state", state)
        .add("stateMessage", stateMessage)
        .add("terminatedTime", terminatedTime)
        .add("terminationReason", terminationReason)
        .add("useMlRuntime", useMlRuntime)
        .add("workloadType", workloadType)
        .toString();
  }
}
