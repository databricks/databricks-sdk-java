// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class BaseClusterInfo {
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
     * An object containing a set of optional, user-specified Spark
     * configuration key-value pairs. Users can also pass in a string of extra
     * JVM options to the driver and the executors via
     * `spark.driver.extraJavaOptions` and `spark.executor.extraJavaOptions`
     * respectively.
     */
    @JsonProperty("spark_conf")
    private Map<String,String> sparkConf;
    
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
     
     */
    @JsonProperty("workload_type")
    private WorkloadType workloadType;
    
    public BaseClusterInfo setAutoscale(AutoScale autoscale) {
        this.autoscale = autoscale;
        return this;
    }

    public AutoScale getAutoscale() {
        return autoscale;
    }
    
    public BaseClusterInfo setAutoterminationMinutes(Long autoterminationMinutes) {
        this.autoterminationMinutes = autoterminationMinutes;
        return this;
    }

    public Long getAutoterminationMinutes() {
        return autoterminationMinutes;
    }
    
    public BaseClusterInfo setAwsAttributes(AwsAttributes awsAttributes) {
        this.awsAttributes = awsAttributes;
        return this;
    }

    public AwsAttributes getAwsAttributes() {
        return awsAttributes;
    }
    
    public BaseClusterInfo setAzureAttributes(AzureAttributes azureAttributes) {
        this.azureAttributes = azureAttributes;
        return this;
    }

    public AzureAttributes getAzureAttributes() {
        return azureAttributes;
    }
    
    public BaseClusterInfo setClusterLogConf(ClusterLogConf clusterLogConf) {
        this.clusterLogConf = clusterLogConf;
        return this;
    }

    public ClusterLogConf getClusterLogConf() {
        return clusterLogConf;
    }
    
    public BaseClusterInfo setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    public String getClusterName() {
        return clusterName;
    }
    
    public BaseClusterInfo setClusterSource(ClusterSource clusterSource) {
        this.clusterSource = clusterSource;
        return this;
    }

    public ClusterSource getClusterSource() {
        return clusterSource;
    }
    
    public BaseClusterInfo setCustomTags(Map<String,String> customTags) {
        this.customTags = customTags;
        return this;
    }

    public Map<String,String> getCustomTags() {
        return customTags;
    }
    
    public BaseClusterInfo setDriverInstancePoolId(String driverInstancePoolId) {
        this.driverInstancePoolId = driverInstancePoolId;
        return this;
    }

    public String getDriverInstancePoolId() {
        return driverInstancePoolId;
    }
    
    public BaseClusterInfo setDriverNodeTypeId(String driverNodeTypeId) {
        this.driverNodeTypeId = driverNodeTypeId;
        return this;
    }

    public String getDriverNodeTypeId() {
        return driverNodeTypeId;
    }
    
    public BaseClusterInfo setEnableElasticDisk(Boolean enableElasticDisk) {
        this.enableElasticDisk = enableElasticDisk;
        return this;
    }

    public Boolean getEnableElasticDisk() {
        return enableElasticDisk;
    }
    
    public BaseClusterInfo setEnableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
        this.enableLocalDiskEncryption = enableLocalDiskEncryption;
        return this;
    }

    public Boolean getEnableLocalDiskEncryption() {
        return enableLocalDiskEncryption;
    }
    
    public BaseClusterInfo setGcpAttributes(GcpAttributes gcpAttributes) {
        this.gcpAttributes = gcpAttributes;
        return this;
    }

    public GcpAttributes getGcpAttributes() {
        return gcpAttributes;
    }
    
    public BaseClusterInfo setInstancePoolId(String instancePoolId) {
        this.instancePoolId = instancePoolId;
        return this;
    }

    public String getInstancePoolId() {
        return instancePoolId;
    }
    
    public BaseClusterInfo setNodeTypeId(String nodeTypeId) {
        this.nodeTypeId = nodeTypeId;
        return this;
    }

    public String getNodeTypeId() {
        return nodeTypeId;
    }
    
    public BaseClusterInfo setNumWorkers(Long numWorkers) {
        this.numWorkers = numWorkers;
        return this;
    }

    public Long getNumWorkers() {
        return numWorkers;
    }
    
    public BaseClusterInfo setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }
    
    public BaseClusterInfo setRuntimeEngine(RuntimeEngine runtimeEngine) {
        this.runtimeEngine = runtimeEngine;
        return this;
    }

    public RuntimeEngine getRuntimeEngine() {
        return runtimeEngine;
    }
    
    public BaseClusterInfo setSparkConf(Map<String,String> sparkConf) {
        this.sparkConf = sparkConf;
        return this;
    }

    public Map<String,String> getSparkConf() {
        return sparkConf;
    }
    
    public BaseClusterInfo setSparkEnvVars(Map<String,String> sparkEnvVars) {
        this.sparkEnvVars = sparkEnvVars;
        return this;
    }

    public Map<String,String> getSparkEnvVars() {
        return sparkEnvVars;
    }
    
    public BaseClusterInfo setSparkVersion(String sparkVersion) {
        this.sparkVersion = sparkVersion;
        return this;
    }

    public String getSparkVersion() {
        return sparkVersion;
    }
    
    public BaseClusterInfo setSshPublicKeys(java.util.List<String> sshPublicKeys) {
        this.sshPublicKeys = sshPublicKeys;
        return this;
    }

    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }
    
    public BaseClusterInfo setWorkloadType(WorkloadType workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    public WorkloadType getWorkloadType() {
        return workloadType;
    }
    
}
