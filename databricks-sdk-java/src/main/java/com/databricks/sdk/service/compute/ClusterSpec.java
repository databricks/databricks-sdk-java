// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * Contains a snapshot of the latest user specified settings that were used to create/edit the
 * cluster.
 */
@Generated
public class ClusterSpec {
  /**
   * When set to true, fixed and default values from the policy will be used for fields that are
   * omitted. When set to false, only fixed values from the policy will be applied.
   */
  @JsonProperty("apply_policy_default_values")
  private Boolean applyPolicyDefaultValues;

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
   * The configuration for delivering spark logs to a long-term storage destination. Three kinds of
   * destinations (DBFS, S3 and Unity Catalog volumes) are supported. Only one destination can be
   * specified for one cluster. If the conf is given, the logs will be delivered to the destination
   * every `5 mins`. The destination of driver logs is `$destination/$clusterId/driver`, while the
   * destination of executor logs is `$destination/$clusterId/executor`.
   */
  @JsonProperty("cluster_log_conf")
  private ClusterLogConf clusterLogConf;

  /**
   * Cluster name requested by the user. This doesn't have to be unique. If not specified at
   * creation, the cluster name will be an empty string. For job clusters, the cluster name is
   * automatically set based on the job and job run IDs.
   */
  @JsonProperty("cluster_name")
  private String clusterName;

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

  /** Custom docker image BYOC */
  @JsonProperty("docker_image")
  private DockerImage dockerImage;

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

  /** If set, what the configurable IOPS for the remote shuffle disk is. */
  @JsonProperty("remote_shuffle_disk_iops")
  private Long remoteShuffleDiskIops;

  /** If set, what the configurable throughput (in Mb/s) for the remote shuffle disk is. */
  @JsonProperty("remote_shuffle_disk_throughput")
  private Long remoteShuffleDiskThroughput;

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
   * SSH public key contents that will be added to each Spark node in this cluster. The
   * corresponding private keys can be used to login with the user name `ubuntu` on port `2200`. Up
   * to 10 keys can be specified.
   */
  @JsonProperty("ssh_public_keys")
  private Collection<String> sshPublicKeys;

  /** If set, what the total initial volume size (in GB) of the remote shuffle disks should be. */
  @JsonProperty("total_initial_remote_shuffle_disk_size")
  private Long totalInitialRemoteShuffleDiskSize;

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

  public ClusterSpec setApplyPolicyDefaultValues(Boolean applyPolicyDefaultValues) {
    this.applyPolicyDefaultValues = applyPolicyDefaultValues;
    return this;
  }

  public Boolean getApplyPolicyDefaultValues() {
    return applyPolicyDefaultValues;
  }

  public ClusterSpec setAutoscale(AutoScale autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  public AutoScale getAutoscale() {
    return autoscale;
  }

  public ClusterSpec setAutoterminationMinutes(Long autoterminationMinutes) {
    this.autoterminationMinutes = autoterminationMinutes;
    return this;
  }

  public Long getAutoterminationMinutes() {
    return autoterminationMinutes;
  }

  public ClusterSpec setAwsAttributes(AwsAttributes awsAttributes) {
    this.awsAttributes = awsAttributes;
    return this;
  }

  public AwsAttributes getAwsAttributes() {
    return awsAttributes;
  }

  public ClusterSpec setAzureAttributes(AzureAttributes azureAttributes) {
    this.azureAttributes = azureAttributes;
    return this;
  }

  public AzureAttributes getAzureAttributes() {
    return azureAttributes;
  }

  public ClusterSpec setClusterLogConf(ClusterLogConf clusterLogConf) {
    this.clusterLogConf = clusterLogConf;
    return this;
  }

  public ClusterLogConf getClusterLogConf() {
    return clusterLogConf;
  }

  public ClusterSpec setClusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  public String getClusterName() {
    return clusterName;
  }

  public ClusterSpec setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public ClusterSpec setDataSecurityMode(DataSecurityMode dataSecurityMode) {
    this.dataSecurityMode = dataSecurityMode;
    return this;
  }

  public DataSecurityMode getDataSecurityMode() {
    return dataSecurityMode;
  }

  public ClusterSpec setDockerImage(DockerImage dockerImage) {
    this.dockerImage = dockerImage;
    return this;
  }

  public DockerImage getDockerImage() {
    return dockerImage;
  }

  public ClusterSpec setDriverInstancePoolId(String driverInstancePoolId) {
    this.driverInstancePoolId = driverInstancePoolId;
    return this;
  }

  public String getDriverInstancePoolId() {
    return driverInstancePoolId;
  }

  public ClusterSpec setDriverNodeTypeId(String driverNodeTypeId) {
    this.driverNodeTypeId = driverNodeTypeId;
    return this;
  }

  public String getDriverNodeTypeId() {
    return driverNodeTypeId;
  }

  public ClusterSpec setEnableElasticDisk(Boolean enableElasticDisk) {
    this.enableElasticDisk = enableElasticDisk;
    return this;
  }

  public Boolean getEnableElasticDisk() {
    return enableElasticDisk;
  }

  public ClusterSpec setEnableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
    this.enableLocalDiskEncryption = enableLocalDiskEncryption;
    return this;
  }

  public Boolean getEnableLocalDiskEncryption() {
    return enableLocalDiskEncryption;
  }

  public ClusterSpec setGcpAttributes(GcpAttributes gcpAttributes) {
    this.gcpAttributes = gcpAttributes;
    return this;
  }

  public GcpAttributes getGcpAttributes() {
    return gcpAttributes;
  }

  public ClusterSpec setInitScripts(Collection<InitScriptInfo> initScripts) {
    this.initScripts = initScripts;
    return this;
  }

  public Collection<InitScriptInfo> getInitScripts() {
    return initScripts;
  }

  public ClusterSpec setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  public ClusterSpec setIsSingleNode(Boolean isSingleNode) {
    this.isSingleNode = isSingleNode;
    return this;
  }

  public Boolean getIsSingleNode() {
    return isSingleNode;
  }

  public ClusterSpec setKind(Kind kind) {
    this.kind = kind;
    return this;
  }

  public Kind getKind() {
    return kind;
  }

  public ClusterSpec setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }

  public ClusterSpec setNumWorkers(Long numWorkers) {
    this.numWorkers = numWorkers;
    return this;
  }

  public Long getNumWorkers() {
    return numWorkers;
  }

  public ClusterSpec setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public ClusterSpec setRemoteShuffleDiskIops(Long remoteShuffleDiskIops) {
    this.remoteShuffleDiskIops = remoteShuffleDiskIops;
    return this;
  }

  public Long getRemoteShuffleDiskIops() {
    return remoteShuffleDiskIops;
  }

  public ClusterSpec setRemoteShuffleDiskThroughput(Long remoteShuffleDiskThroughput) {
    this.remoteShuffleDiskThroughput = remoteShuffleDiskThroughput;
    return this;
  }

  public Long getRemoteShuffleDiskThroughput() {
    return remoteShuffleDiskThroughput;
  }

  public ClusterSpec setRuntimeEngine(RuntimeEngine runtimeEngine) {
    this.runtimeEngine = runtimeEngine;
    return this;
  }

  public RuntimeEngine getRuntimeEngine() {
    return runtimeEngine;
  }

  public ClusterSpec setSingleUserName(String singleUserName) {
    this.singleUserName = singleUserName;
    return this;
  }

  public String getSingleUserName() {
    return singleUserName;
  }

  public ClusterSpec setSparkConf(Map<String, String> sparkConf) {
    this.sparkConf = sparkConf;
    return this;
  }

  public Map<String, String> getSparkConf() {
    return sparkConf;
  }

  public ClusterSpec setSparkEnvVars(Map<String, String> sparkEnvVars) {
    this.sparkEnvVars = sparkEnvVars;
    return this;
  }

  public Map<String, String> getSparkEnvVars() {
    return sparkEnvVars;
  }

  public ClusterSpec setSparkVersion(String sparkVersion) {
    this.sparkVersion = sparkVersion;
    return this;
  }

  public String getSparkVersion() {
    return sparkVersion;
  }

  public ClusterSpec setSshPublicKeys(Collection<String> sshPublicKeys) {
    this.sshPublicKeys = sshPublicKeys;
    return this;
  }

  public Collection<String> getSshPublicKeys() {
    return sshPublicKeys;
  }

  public ClusterSpec setTotalInitialRemoteShuffleDiskSize(Long totalInitialRemoteShuffleDiskSize) {
    this.totalInitialRemoteShuffleDiskSize = totalInitialRemoteShuffleDiskSize;
    return this;
  }

  public Long getTotalInitialRemoteShuffleDiskSize() {
    return totalInitialRemoteShuffleDiskSize;
  }

  public ClusterSpec setUseMlRuntime(Boolean useMlRuntime) {
    this.useMlRuntime = useMlRuntime;
    return this;
  }

  public Boolean getUseMlRuntime() {
    return useMlRuntime;
  }

  public ClusterSpec setWorkloadType(WorkloadType workloadType) {
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
    ClusterSpec that = (ClusterSpec) o;
    return Objects.equals(applyPolicyDefaultValues, that.applyPolicyDefaultValues)
        && Objects.equals(autoscale, that.autoscale)
        && Objects.equals(autoterminationMinutes, that.autoterminationMinutes)
        && Objects.equals(awsAttributes, that.awsAttributes)
        && Objects.equals(azureAttributes, that.azureAttributes)
        && Objects.equals(clusterLogConf, that.clusterLogConf)
        && Objects.equals(clusterName, that.clusterName)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(dataSecurityMode, that.dataSecurityMode)
        && Objects.equals(dockerImage, that.dockerImage)
        && Objects.equals(driverInstancePoolId, that.driverInstancePoolId)
        && Objects.equals(driverNodeTypeId, that.driverNodeTypeId)
        && Objects.equals(enableElasticDisk, that.enableElasticDisk)
        && Objects.equals(enableLocalDiskEncryption, that.enableLocalDiskEncryption)
        && Objects.equals(gcpAttributes, that.gcpAttributes)
        && Objects.equals(initScripts, that.initScripts)
        && Objects.equals(instancePoolId, that.instancePoolId)
        && Objects.equals(isSingleNode, that.isSingleNode)
        && Objects.equals(kind, that.kind)
        && Objects.equals(nodeTypeId, that.nodeTypeId)
        && Objects.equals(numWorkers, that.numWorkers)
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(remoteShuffleDiskIops, that.remoteShuffleDiskIops)
        && Objects.equals(remoteShuffleDiskThroughput, that.remoteShuffleDiskThroughput)
        && Objects.equals(runtimeEngine, that.runtimeEngine)
        && Objects.equals(singleUserName, that.singleUserName)
        && Objects.equals(sparkConf, that.sparkConf)
        && Objects.equals(sparkEnvVars, that.sparkEnvVars)
        && Objects.equals(sparkVersion, that.sparkVersion)
        && Objects.equals(sshPublicKeys, that.sshPublicKeys)
        && Objects.equals(totalInitialRemoteShuffleDiskSize, that.totalInitialRemoteShuffleDiskSize)
        && Objects.equals(useMlRuntime, that.useMlRuntime)
        && Objects.equals(workloadType, that.workloadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applyPolicyDefaultValues,
        autoscale,
        autoterminationMinutes,
        awsAttributes,
        azureAttributes,
        clusterLogConf,
        clusterName,
        customTags,
        dataSecurityMode,
        dockerImage,
        driverInstancePoolId,
        driverNodeTypeId,
        enableElasticDisk,
        enableLocalDiskEncryption,
        gcpAttributes,
        initScripts,
        instancePoolId,
        isSingleNode,
        kind,
        nodeTypeId,
        numWorkers,
        policyId,
        remoteShuffleDiskIops,
        remoteShuffleDiskThroughput,
        runtimeEngine,
        singleUserName,
        sparkConf,
        sparkEnvVars,
        sparkVersion,
        sshPublicKeys,
        totalInitialRemoteShuffleDiskSize,
        useMlRuntime,
        workloadType);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterSpec.class)
        .add("applyPolicyDefaultValues", applyPolicyDefaultValues)
        .add("autoscale", autoscale)
        .add("autoterminationMinutes", autoterminationMinutes)
        .add("awsAttributes", awsAttributes)
        .add("azureAttributes", azureAttributes)
        .add("clusterLogConf", clusterLogConf)
        .add("clusterName", clusterName)
        .add("customTags", customTags)
        .add("dataSecurityMode", dataSecurityMode)
        .add("dockerImage", dockerImage)
        .add("driverInstancePoolId", driverInstancePoolId)
        .add("driverNodeTypeId", driverNodeTypeId)
        .add("enableElasticDisk", enableElasticDisk)
        .add("enableLocalDiskEncryption", enableLocalDiskEncryption)
        .add("gcpAttributes", gcpAttributes)
        .add("initScripts", initScripts)
        .add("instancePoolId", instancePoolId)
        .add("isSingleNode", isSingleNode)
        .add("kind", kind)
        .add("nodeTypeId", nodeTypeId)
        .add("numWorkers", numWorkers)
        .add("policyId", policyId)
        .add("remoteShuffleDiskIops", remoteShuffleDiskIops)
        .add("remoteShuffleDiskThroughput", remoteShuffleDiskThroughput)
        .add("runtimeEngine", runtimeEngine)
        .add("singleUserName", singleUserName)
        .add("sparkConf", sparkConf)
        .add("sparkEnvVars", sparkEnvVars)
        .add("sparkVersion", sparkVersion)
        .add("sshPublicKeys", sshPublicKeys)
        .add("totalInitialRemoteShuffleDiskSize", totalInitialRemoteShuffleDiskSize)
        .add("useMlRuntime", useMlRuntime)
        .add("workloadType", workloadType)
        .toString();
  }
}
