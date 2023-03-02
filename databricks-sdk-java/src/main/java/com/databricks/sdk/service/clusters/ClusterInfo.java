// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ClusterInfo {
    /**
     * Parameters needed in order to automatically scale clusters up and down
     * based on load. Note: autoscaling works best with DB runtime versions 3.0
     * or later.
     */
    @JsonProperty("autoscale")
    private AutoScale autoscale;
    
    /**
     * Automatically terminates the cluster after it is inactive for this time
     * in minutes. If not set, this cluster will not be automatically
     * terminated. If specified, the threshold must be between 10 and 10000
     * minutes. Users can also set this value to 0 to explicitly disable
     * automatic termination.
     */
    @JsonProperty("autotermination_minutes")
    private Long autoterminationMinutes;
    
    /**
     * Attributes related to clusters running on Amazon Web Services. If not
     * specified at cluster creation, a set of default values will be used.
     */
    @JsonProperty("aws_attributes")
    private AwsAttributes awsAttributes;
    
    /**
     * Attributes related to clusters running on Microsoft Azure. If not
     * specified at cluster creation, a set of default values will be used.
     */
    @JsonProperty("azure_attributes")
    private AzureAttributes azureAttributes;
    
    /**
     * Number of CPU cores available for this cluster. Note that this can be
     * fractional, e.g. 7.5 cores, since certain node types are configured to
     * share cores between Spark nodes on the same instance.
     */
    @JsonProperty("cluster_cores")
    private Float clusterCores;
    
    /**
     * Canonical identifier for the cluster. This id is retained during cluster
     * restarts and resizes, while each new cluster has a globally unique id.
     */
    @JsonProperty("cluster_id")
    private String clusterId;
    
    /**
     * The configuration for delivering spark logs to a long-term storage
     * destination. Two kinds of destinations (dbfs and s3) are supported. Only
     * one destination can be specified for one cluster. If the conf is given,
     * the logs will be delivered to the destination every `5 mins`. The
     * destination of driver logs is `$destination/$clusterId/driver`, while the
     * destination of executor logs is `$destination/$clusterId/executor`.
     */
    @JsonProperty("cluster_log_conf")
    private ClusterLogConf clusterLogConf;
    
    /**
     * Cluster log delivery status.
     */
    @JsonProperty("cluster_log_status")
    private LogSyncStatus clusterLogStatus;
    
    /**
     * Total amount of cluster memory, in megabytes
     */
    @JsonProperty("cluster_memory_mb")
    private Long clusterMemoryMb;
    
    /**
     * Cluster name requested by the user. This doesn't have to be unique. If
     * not specified at creation, the cluster name will be an empty string.
     */
    @JsonProperty("cluster_name")
    private String clusterName;
    
    /**
     * Determines whether the cluster was created by a user through the UI,
     * created by the Databricks Jobs Scheduler, or through an API request. This
     * is the same as cluster_creator, but read only.
     */
    @JsonProperty("cluster_source")
    private ClusterSource clusterSource;
    
    /**
     * Creator user name. The field won't be included in the response if the
     * user has already been deleted.
     */
    @JsonProperty("creator_user_name")
    private String creatorUserName;
    
    /**
     * Additional tags for cluster resources. Databricks will tag all cluster
     * resources (e.g., AWS instances and EBS volumes) with these tags in
     * addition to `default_tags`. Notes:
     * 
     * - Currently, Databricks allows at most 45 custom tags
     * 
     * - Clusters can only reuse cloud resources if the resources' tags are a
     * subset of the cluster tags
     */
    @JsonProperty("custom_tags")
    private Map<String,String> customTags;
    
    /**
     * This describes an enum
     */
    @JsonProperty("data_security_mode")
    private DataSecurityMode dataSecurityMode;
    
    /**
     * Tags that are added by Databricks regardless of any `custom_tags`,
     * including:
     * 
     * - Vendor: Databricks
     * 
     * - Creator: <username_of_creator>
     * 
     * - ClusterName: <name_of_cluster>
     * 
     * - ClusterId: <id_of_cluster>
     * 
     * - Name: <Databricks internal use>
     */
    @JsonProperty("default_tags")
    private Map<String,String> defaultTags;
    
    /**
     * Node on which the Spark driver resides. The driver node contains the
     * Spark master and the Databricks application that manages the per-notebook
     * Spark REPLs.
     */
    @JsonProperty("driver")
    private SparkNode driver;
    
    /**
     * The optional ID of the instance pool for the driver of the cluster
     * belongs. The pool cluster uses the instance pool with id
     * (instance_pool_id) if the driver pool is not assigned.
     */
    @JsonProperty("driver_instance_pool_id")
    private String driverInstancePoolId;
    
    /**
     * The node type of the Spark driver. Note that this field is optional; if
     * unset, the driver node type will be set as the same value as
     * `node_type_id` defined above.
     */
    @JsonProperty("driver_node_type_id")
    private String driverNodeTypeId;
    
    /**
     * Autoscaling Local Storage: when enabled, this cluster will dynamically
     * acquire additional disk space when its Spark workers are running low on
     * disk space. This feature requires specific AWS permissions to function
     * correctly - refer to the User Guide for more details.
     */
    @JsonProperty("enable_elastic_disk")
    private Boolean enableElasticDisk;
    
    /**
     * Whether to enable LUKS on cluster VMs' local disks
     */
    @JsonProperty("enable_local_disk_encryption")
    private Boolean enableLocalDiskEncryption;
    
    /**
     * Nodes on which the Spark executors reside.
     */
    @JsonProperty("executors")
    private java.util.List<SparkNode> executors;
    
    /**
     * Attributes related to clusters running on Google Cloud Platform. If not
     * specified at cluster creation, a set of default values will be used.
     */
    @JsonProperty("gcp_attributes")
    private GcpAttributes gcpAttributes;
    
    /**
     * The optional ID of the instance pool to which the cluster belongs.
     */
    @JsonProperty("instance_pool_id")
    private String instancePoolId;
    
    /**
     * Port on which Spark JDBC server is listening, in the driver nod. No
     * service will be listeningon on this port in executor nodes.
     */
    @JsonProperty("jdbc_port")
    private Long jdbcPort;
    
    /**
     * the timestamp that the cluster was started/restarted
     */
    @JsonProperty("last_restarted_time")
    private Long lastRestartedTime;
    
    /**
     * Time when the cluster driver last lost its state (due to a restart or
     * driver failure).
     */
    @JsonProperty("last_state_loss_time")
    private Long lastStateLossTime;
    
    /**
     * This field encodes, through a single value, the resources available to
     * each of the Spark nodes in this cluster. For example, the Spark nodes can
     * be provisioned and optimized for memory or compute intensive workloads. A
     * list of available node types can be retrieved by using the
     * :method:clusters/listNodeTypes API call.
     */
    @JsonProperty("node_type_id")
    private String nodeTypeId;
    
    /**
     * Number of worker nodes that this cluster should have. A cluster has one
     * Spark Driver and `num_workers` Executors for a total of `num_workers` + 1
     * Spark nodes.
     * 
     * Note: When reading the properties of a cluster, this field reflects the
     * desired number of workers rather than the actual current number of
     * workers. For instance, if a cluster is resized from 5 to 10 workers, this
     * field will immediately be updated to reflect the target size of 10
     * workers, whereas the workers listed in `spark_info` will gradually
     * increase from 5 to 10 as the new nodes are provisioned.
     */
    @JsonProperty("num_workers")
    private Long numWorkers;
    
    /**
     * The ID of the cluster policy used to create the cluster if applicable.
     */
    @JsonProperty("policy_id")
    private String policyId;
    
    /**
     * Decides which runtime engine to be use, e.g. Standard vs. Photon. If
     * unspecified, the runtime engine is inferred from spark_version.
     */
    @JsonProperty("runtime_engine")
    private RuntimeEngine runtimeEngine;
    
    /**
     * Single user name if data_security_mode is `SINGLE_USER`
     */
    @JsonProperty("single_user_name")
    private String singleUserName;
    
    /**
     * An object containing a set of optional, user-specified Spark
     * configuration key-value pairs. Users can also pass in a string of extra
     * JVM options to the driver and the executors via
     * `spark.driver.extraJavaOptions` and `spark.executor.extraJavaOptions`
     * respectively.
     */
    @JsonProperty("spark_conf")
    private Map<String,String> sparkConf;
    
    /**
     * A canonical SparkContext identifier. This value *does* change when the
     * Spark driver restarts. The pair `(cluster_id, spark_context_id)` is a
     * globally unique identifier over all Spark contexts.
     */
    @JsonProperty("spark_context_id")
    private Long sparkContextId;
    
    /**
     * An object containing a set of optional, user-specified environment
     * variable key-value pairs. Please note that key-value pair of the form
     * (X,Y) will be exported as is (i.e., `export X='Y'`) while launching the
     * driver and workers.
     * 
     * In order to specify an additional set of `SPARK_DAEMON_JAVA_OPTS`, we
     * recommend appending them to `$SPARK_DAEMON_JAVA_OPTS` as shown in the
     * example below. This ensures that all default databricks managed
     * environmental variables are included as well.
     * 
     * Example Spark environment variables: `{"SPARK_WORKER_MEMORY": "28000m",
     * "SPARK_LOCAL_DIRS": "/local_disk0"}` or `{"SPARK_DAEMON_JAVA_OPTS":
     * "$SPARK_DAEMON_JAVA_OPTS -Dspark.shuffle.service.enabled=true"}`
     */
    @JsonProperty("spark_env_vars")
    private Map<String,String> sparkEnvVars;
    
    /**
     * The Spark version of the cluster, e.g. `3.3.x-scala2.11`. A list of
     * available Spark versions can be retrieved by using the
     * :method:clusters/sparkVersions API call.
     */
    @JsonProperty("spark_version")
    private String sparkVersion;
    
    /**
     * SSH public key contents that will be added to each Spark node in this
     * cluster. The corresponding private keys can be used to login with the
     * user name `ubuntu` on port `2200`. Up to 10 keys can be specified.
     */
    @JsonProperty("ssh_public_keys")
    private java.util.List<String> sshPublicKeys;
    
    /**
     * Time (in epoch milliseconds) when the cluster creation request was
     * received (when the cluster entered a `PENDING` state).
     */
    @JsonProperty("start_time")
    private Long startTime;
    
    /**
     * Current state of the cluster.
     */
    @JsonProperty("state")
    private State state;
    
    /**
     * A message associated with the most recent state transition (e.g., the
     * reason why the cluster entered a `TERMINATED` state).
     */
    @JsonProperty("state_message")
    private String stateMessage;
    
    /**
     * Time (in epoch milliseconds) when the cluster was terminated, if
     * applicable.
     */
    @JsonProperty("terminated_time")
    private Long terminatedTime;
    
    /**
     * Information about why the cluster was terminated. This field only appears
     * when the cluster is in a `TERMINATING` or `TERMINATED` state.
     */
    @JsonProperty("termination_reason")
    private TerminationReason terminationReason;
    
    /**
     
     */
    @JsonProperty("workload_type")
    private WorkloadType workloadType;
    
    public ClusterInfo setAutoscale(AutoScale autoscale) {
        this.autoscale = autoscale;
        return this;
    }

    public AutoScale getAutoscale() {
        return autoscale;
    }
    
    public ClusterInfo setAutoterminationMinutes(Long autoterminationMinutes) {
        this.autoterminationMinutes = autoterminationMinutes;
        return this;
    }

    public Long getAutoterminationMinutes() {
        return autoterminationMinutes;
    }
    
    public ClusterInfo setAwsAttributes(AwsAttributes awsAttributes) {
        this.awsAttributes = awsAttributes;
        return this;
    }

    public AwsAttributes getAwsAttributes() {
        return awsAttributes;
    }
    
    public ClusterInfo setAzureAttributes(AzureAttributes azureAttributes) {
        this.azureAttributes = azureAttributes;
        return this;
    }

    public AzureAttributes getAzureAttributes() {
        return azureAttributes;
    }
    
    public ClusterInfo setClusterCores(Float clusterCores) {
        this.clusterCores = clusterCores;
        return this;
    }

    public Float getClusterCores() {
        return clusterCores;
    }
    
    public ClusterInfo setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public String getClusterId() {
        return clusterId;
    }
    
    public ClusterInfo setClusterLogConf(ClusterLogConf clusterLogConf) {
        this.clusterLogConf = clusterLogConf;
        return this;
    }

    public ClusterLogConf getClusterLogConf() {
        return clusterLogConf;
    }
    
    public ClusterInfo setClusterLogStatus(LogSyncStatus clusterLogStatus) {
        this.clusterLogStatus = clusterLogStatus;
        return this;
    }

    public LogSyncStatus getClusterLogStatus() {
        return clusterLogStatus;
    }
    
    public ClusterInfo setClusterMemoryMb(Long clusterMemoryMb) {
        this.clusterMemoryMb = clusterMemoryMb;
        return this;
    }

    public Long getClusterMemoryMb() {
        return clusterMemoryMb;
    }
    
    public ClusterInfo setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    public String getClusterName() {
        return clusterName;
    }
    
    public ClusterInfo setClusterSource(ClusterSource clusterSource) {
        this.clusterSource = clusterSource;
        return this;
    }

    public ClusterSource getClusterSource() {
        return clusterSource;
    }
    
    public ClusterInfo setCreatorUserName(String creatorUserName) {
        this.creatorUserName = creatorUserName;
        return this;
    }

    public String getCreatorUserName() {
        return creatorUserName;
    }
    
    public ClusterInfo setCustomTags(Map<String,String> customTags) {
        this.customTags = customTags;
        return this;
    }

    public Map<String,String> getCustomTags() {
        return customTags;
    }
    
    public ClusterInfo setDataSecurityMode(DataSecurityMode dataSecurityMode) {
        this.dataSecurityMode = dataSecurityMode;
        return this;
    }

    public DataSecurityMode getDataSecurityMode() {
        return dataSecurityMode;
    }
    
    public ClusterInfo setDefaultTags(Map<String,String> defaultTags) {
        this.defaultTags = defaultTags;
        return this;
    }

    public Map<String,String> getDefaultTags() {
        return defaultTags;
    }
    
    public ClusterInfo setDriver(SparkNode driver) {
        this.driver = driver;
        return this;
    }

    public SparkNode getDriver() {
        return driver;
    }
    
    public ClusterInfo setDriverInstancePoolId(String driverInstancePoolId) {
        this.driverInstancePoolId = driverInstancePoolId;
        return this;
    }

    public String getDriverInstancePoolId() {
        return driverInstancePoolId;
    }
    
    public ClusterInfo setDriverNodeTypeId(String driverNodeTypeId) {
        this.driverNodeTypeId = driverNodeTypeId;
        return this;
    }

    public String getDriverNodeTypeId() {
        return driverNodeTypeId;
    }
    
    public ClusterInfo setEnableElasticDisk(Boolean enableElasticDisk) {
        this.enableElasticDisk = enableElasticDisk;
        return this;
    }

    public Boolean getEnableElasticDisk() {
        return enableElasticDisk;
    }
    
    public ClusterInfo setEnableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
        this.enableLocalDiskEncryption = enableLocalDiskEncryption;
        return this;
    }

    public Boolean getEnableLocalDiskEncryption() {
        return enableLocalDiskEncryption;
    }
    
    public ClusterInfo setExecutors(java.util.List<SparkNode> executors) {
        this.executors = executors;
        return this;
    }

    public java.util.List<SparkNode> getExecutors() {
        return executors;
    }
    
    public ClusterInfo setGcpAttributes(GcpAttributes gcpAttributes) {
        this.gcpAttributes = gcpAttributes;
        return this;
    }

    public GcpAttributes getGcpAttributes() {
        return gcpAttributes;
    }
    
    public ClusterInfo setInstancePoolId(String instancePoolId) {
        this.instancePoolId = instancePoolId;
        return this;
    }

    public String getInstancePoolId() {
        return instancePoolId;
    }
    
    public ClusterInfo setJdbcPort(Long jdbcPort) {
        this.jdbcPort = jdbcPort;
        return this;
    }

    public Long getJdbcPort() {
        return jdbcPort;
    }
    
    public ClusterInfo setLastRestartedTime(Long lastRestartedTime) {
        this.lastRestartedTime = lastRestartedTime;
        return this;
    }

    public Long getLastRestartedTime() {
        return lastRestartedTime;
    }
    
    public ClusterInfo setLastStateLossTime(Long lastStateLossTime) {
        this.lastStateLossTime = lastStateLossTime;
        return this;
    }

    public Long getLastStateLossTime() {
        return lastStateLossTime;
    }
    
    public ClusterInfo setNodeTypeId(String nodeTypeId) {
        this.nodeTypeId = nodeTypeId;
        return this;
    }

    public String getNodeTypeId() {
        return nodeTypeId;
    }
    
    public ClusterInfo setNumWorkers(Long numWorkers) {
        this.numWorkers = numWorkers;
        return this;
    }

    public Long getNumWorkers() {
        return numWorkers;
    }
    
    public ClusterInfo setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }
    
    public ClusterInfo setRuntimeEngine(RuntimeEngine runtimeEngine) {
        this.runtimeEngine = runtimeEngine;
        return this;
    }

    public RuntimeEngine getRuntimeEngine() {
        return runtimeEngine;
    }
    
    public ClusterInfo setSingleUserName(String singleUserName) {
        this.singleUserName = singleUserName;
        return this;
    }

    public String getSingleUserName() {
        return singleUserName;
    }
    
    public ClusterInfo setSparkConf(Map<String,String> sparkConf) {
        this.sparkConf = sparkConf;
        return this;
    }

    public Map<String,String> getSparkConf() {
        return sparkConf;
    }
    
    public ClusterInfo setSparkContextId(Long sparkContextId) {
        this.sparkContextId = sparkContextId;
        return this;
    }

    public Long getSparkContextId() {
        return sparkContextId;
    }
    
    public ClusterInfo setSparkEnvVars(Map<String,String> sparkEnvVars) {
        this.sparkEnvVars = sparkEnvVars;
        return this;
    }

    public Map<String,String> getSparkEnvVars() {
        return sparkEnvVars;
    }
    
    public ClusterInfo setSparkVersion(String sparkVersion) {
        this.sparkVersion = sparkVersion;
        return this;
    }

    public String getSparkVersion() {
        return sparkVersion;
    }
    
    public ClusterInfo setSshPublicKeys(java.util.List<String> sshPublicKeys) {
        this.sshPublicKeys = sshPublicKeys;
        return this;
    }

    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }
    
    public ClusterInfo setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    public Long getStartTime() {
        return startTime;
    }
    
    public ClusterInfo setState(State state) {
        this.state = state;
        return this;
    }

    public State getState() {
        return state;
    }
    
    public ClusterInfo setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
        return this;
    }

    public String getStateMessage() {
        return stateMessage;
    }
    
    public ClusterInfo setTerminatedTime(Long terminatedTime) {
        this.terminatedTime = terminatedTime;
        return this;
    }

    public Long getTerminatedTime() {
        return terminatedTime;
    }
    
    public ClusterInfo setTerminationReason(TerminationReason terminationReason) {
        this.terminationReason = terminationReason;
        return this;
    }

    public TerminationReason getTerminationReason() {
        return terminationReason;
    }
    
    public ClusterInfo setWorkloadType(WorkloadType workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    public WorkloadType getWorkloadType() {
        return workloadType;
    }
    
}
