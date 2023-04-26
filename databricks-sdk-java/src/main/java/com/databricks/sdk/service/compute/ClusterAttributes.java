// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * <p>ClusterAttributes class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ClusterAttributes {
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
   * The configuration for delivering spark logs to a long-term storage destination. Two kinds of
   * destinations (dbfs and s3) are supported. Only one destination can be specified for one
   * cluster. If the conf is given, the logs will be delivered to the destination every `5 mins`.
   * The destination of driver logs is `$destination/$clusterId/driver`, while the destination of
   * executor logs is `$destination/$clusterId/executor`.
   */
  @JsonProperty("cluster_log_conf")
  private ClusterLogConf clusterLogConf;

  /**
   * Cluster name requested by the user. This doesn't have to be unique. If not specified at
   * creation, the cluster name will be an empty string.
   */
  @JsonProperty("cluster_name")
  private String clusterName;

  /**
   * Determines whether the cluster was created by a user through the UI, created by the Databricks
   * Jobs Scheduler, or through an API request. This is the same as cluster_creator, but read only.
   */
  @JsonProperty("cluster_source")
  private ClusterSource clusterSource;

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
   * The optional ID of the instance pool for the driver of the cluster belongs. The pool cluster
   * uses the instance pool with id (instance_pool_id) if the driver pool is not assigned.
   */
  @JsonProperty("driver_instance_pool_id")
  private String driverInstancePoolId;

  /**
   * The node type of the Spark driver. Note that this field is optional; if unset, the driver node
   * type will be set as the same value as `node_type_id` defined above.
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

  /** The optional ID of the instance pool to which the cluster belongs. */
  @JsonProperty("instance_pool_id")
  private String instancePoolId;

  /**
   * This field encodes, through a single value, the resources available to each of the Spark nodes
   * in this cluster. For example, the Spark nodes can be provisioned and optimized for memory or
   * compute intensive workloads. A list of available node types can be retrieved by using the
   * :method:clusters/listNodeTypes API call.
   */
  @JsonProperty("node_type_id")
  private String nodeTypeId;

  /** The ID of the cluster policy used to create the cluster if applicable. */
  @JsonProperty("policy_id")
  private String policyId;

  /**
   * Decides which runtime engine to be use, e.g. Standard vs. Photon. If unspecified, the runtime
   * engine is inferred from spark_version.
   */
  @JsonProperty("runtime_engine")
  private RuntimeEngine runtimeEngine;

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

  /** */
  @JsonProperty("workload_type")
  private WorkloadType workloadType;

  /**
   * <p>Setter for the field <code>autoterminationMinutes</code>.</p>
   *
   * @param autoterminationMinutes a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setAutoterminationMinutes(Long autoterminationMinutes) {
    this.autoterminationMinutes = autoterminationMinutes;
    return this;
  }

  /**
   * <p>Getter for the field <code>autoterminationMinutes</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getAutoterminationMinutes() {
    return autoterminationMinutes;
  }

  /**
   * <p>Setter for the field <code>awsAttributes</code>.</p>
   *
   * @param awsAttributes a {@link com.databricks.sdk.service.compute.AwsAttributes} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setAwsAttributes(AwsAttributes awsAttributes) {
    this.awsAttributes = awsAttributes;
    return this;
  }

  /**
   * <p>Getter for the field <code>awsAttributes</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.AwsAttributes} object
   */
  public AwsAttributes getAwsAttributes() {
    return awsAttributes;
  }

  /**
   * <p>Setter for the field <code>azureAttributes</code>.</p>
   *
   * @param azureAttributes a {@link com.databricks.sdk.service.compute.AzureAttributes} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setAzureAttributes(AzureAttributes azureAttributes) {
    this.azureAttributes = azureAttributes;
    return this;
  }

  /**
   * <p>Getter for the field <code>azureAttributes</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.AzureAttributes} object
   */
  public AzureAttributes getAzureAttributes() {
    return azureAttributes;
  }

  /**
   * <p>Setter for the field <code>clusterLogConf</code>.</p>
   *
   * @param clusterLogConf a {@link com.databricks.sdk.service.compute.ClusterLogConf} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setClusterLogConf(ClusterLogConf clusterLogConf) {
    this.clusterLogConf = clusterLogConf;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterLogConf</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.ClusterLogConf} object
   */
  public ClusterLogConf getClusterLogConf() {
    return clusterLogConf;
  }

  /**
   * <p>Setter for the field <code>clusterName</code>.</p>
   *
   * @param clusterName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setClusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClusterName() {
    return clusterName;
  }

  /**
   * <p>Setter for the field <code>clusterSource</code>.</p>
   *
   * @param clusterSource a {@link com.databricks.sdk.service.compute.ClusterSource} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setClusterSource(ClusterSource clusterSource) {
    this.clusterSource = clusterSource;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterSource</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.ClusterSource} object
   */
  public ClusterSource getClusterSource() {
    return clusterSource;
  }

  /**
   * <p>Setter for the field <code>customTags</code>.</p>
   *
   * @param customTags a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  /**
   * <p>Getter for the field <code>customTags</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getCustomTags() {
    return customTags;
  }

  /**
   * <p>Setter for the field <code>driverInstancePoolId</code>.</p>
   *
   * @param driverInstancePoolId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setDriverInstancePoolId(String driverInstancePoolId) {
    this.driverInstancePoolId = driverInstancePoolId;
    return this;
  }

  /**
   * <p>Getter for the field <code>driverInstancePoolId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDriverInstancePoolId() {
    return driverInstancePoolId;
  }

  /**
   * <p>Setter for the field <code>driverNodeTypeId</code>.</p>
   *
   * @param driverNodeTypeId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setDriverNodeTypeId(String driverNodeTypeId) {
    this.driverNodeTypeId = driverNodeTypeId;
    return this;
  }

  /**
   * <p>Getter for the field <code>driverNodeTypeId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDriverNodeTypeId() {
    return driverNodeTypeId;
  }

  /**
   * <p>Setter for the field <code>enableElasticDisk</code>.</p>
   *
   * @param enableElasticDisk a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setEnableElasticDisk(Boolean enableElasticDisk) {
    this.enableElasticDisk = enableElasticDisk;
    return this;
  }

  /**
   * <p>Getter for the field <code>enableElasticDisk</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnableElasticDisk() {
    return enableElasticDisk;
  }

  /**
   * <p>Setter for the field <code>enableLocalDiskEncryption</code>.</p>
   *
   * @param enableLocalDiskEncryption a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setEnableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
    this.enableLocalDiskEncryption = enableLocalDiskEncryption;
    return this;
  }

  /**
   * <p>Getter for the field <code>enableLocalDiskEncryption</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnableLocalDiskEncryption() {
    return enableLocalDiskEncryption;
  }

  /**
   * <p>Setter for the field <code>gcpAttributes</code>.</p>
   *
   * @param gcpAttributes a {@link com.databricks.sdk.service.compute.GcpAttributes} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setGcpAttributes(GcpAttributes gcpAttributes) {
    this.gcpAttributes = gcpAttributes;
    return this;
  }

  /**
   * <p>Getter for the field <code>gcpAttributes</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.GcpAttributes} object
   */
  public GcpAttributes getGcpAttributes() {
    return gcpAttributes;
  }

  /**
   * <p>Setter for the field <code>instancePoolId</code>.</p>
   *
   * @param instancePoolId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  /**
   * <p>Getter for the field <code>instancePoolId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstancePoolId() {
    return instancePoolId;
  }

  /**
   * <p>Setter for the field <code>nodeTypeId</code>.</p>
   *
   * @param nodeTypeId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  /**
   * <p>Getter for the field <code>nodeTypeId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNodeTypeId() {
    return nodeTypeId;
  }

  /**
   * <p>Setter for the field <code>policyId</code>.</p>
   *
   * @param policyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * <p>Getter for the field <code>policyId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPolicyId() {
    return policyId;
  }

  /**
   * <p>Setter for the field <code>runtimeEngine</code>.</p>
   *
   * @param runtimeEngine a {@link com.databricks.sdk.service.compute.RuntimeEngine} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setRuntimeEngine(RuntimeEngine runtimeEngine) {
    this.runtimeEngine = runtimeEngine;
    return this;
  }

  /**
   * <p>Getter for the field <code>runtimeEngine</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.RuntimeEngine} object
   */
  public RuntimeEngine getRuntimeEngine() {
    return runtimeEngine;
  }

  /**
   * <p>Setter for the field <code>sparkConf</code>.</p>
   *
   * @param sparkConf a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setSparkConf(Map<String, String> sparkConf) {
    this.sparkConf = sparkConf;
    return this;
  }

  /**
   * <p>Getter for the field <code>sparkConf</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getSparkConf() {
    return sparkConf;
  }

  /**
   * <p>Setter for the field <code>sparkEnvVars</code>.</p>
   *
   * @param sparkEnvVars a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setSparkEnvVars(Map<String, String> sparkEnvVars) {
    this.sparkEnvVars = sparkEnvVars;
    return this;
  }

  /**
   * <p>Getter for the field <code>sparkEnvVars</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getSparkEnvVars() {
    return sparkEnvVars;
  }

  /**
   * <p>Setter for the field <code>sparkVersion</code>.</p>
   *
   * @param sparkVersion a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setSparkVersion(String sparkVersion) {
    this.sparkVersion = sparkVersion;
    return this;
  }

  /**
   * <p>Getter for the field <code>sparkVersion</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSparkVersion() {
    return sparkVersion;
  }

  /**
   * <p>Setter for the field <code>sshPublicKeys</code>.</p>
   *
   * @param sshPublicKeys a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setSshPublicKeys(Collection<String> sshPublicKeys) {
    this.sshPublicKeys = sshPublicKeys;
    return this;
  }

  /**
   * <p>Getter for the field <code>sshPublicKeys</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getSshPublicKeys() {
    return sshPublicKeys;
  }

  /**
   * <p>Setter for the field <code>workloadType</code>.</p>
   *
   * @param workloadType a {@link com.databricks.sdk.service.compute.WorkloadType} object
   * @return a {@link com.databricks.sdk.service.compute.ClusterAttributes} object
   */
  public ClusterAttributes setWorkloadType(WorkloadType workloadType) {
    this.workloadType = workloadType;
    return this;
  }

  /**
   * <p>Getter for the field <code>workloadType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.WorkloadType} object
   */
  public WorkloadType getWorkloadType() {
    return workloadType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterAttributes that = (ClusterAttributes) o;
    return Objects.equals(autoterminationMinutes, that.autoterminationMinutes)
        && Objects.equals(awsAttributes, that.awsAttributes)
        && Objects.equals(azureAttributes, that.azureAttributes)
        && Objects.equals(clusterLogConf, that.clusterLogConf)
        && Objects.equals(clusterName, that.clusterName)
        && Objects.equals(clusterSource, that.clusterSource)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(driverInstancePoolId, that.driverInstancePoolId)
        && Objects.equals(driverNodeTypeId, that.driverNodeTypeId)
        && Objects.equals(enableElasticDisk, that.enableElasticDisk)
        && Objects.equals(enableLocalDiskEncryption, that.enableLocalDiskEncryption)
        && Objects.equals(gcpAttributes, that.gcpAttributes)
        && Objects.equals(instancePoolId, that.instancePoolId)
        && Objects.equals(nodeTypeId, that.nodeTypeId)
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(runtimeEngine, that.runtimeEngine)
        && Objects.equals(sparkConf, that.sparkConf)
        && Objects.equals(sparkEnvVars, that.sparkEnvVars)
        && Objects.equals(sparkVersion, that.sparkVersion)
        && Objects.equals(sshPublicKeys, that.sshPublicKeys)
        && Objects.equals(workloadType, that.workloadType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        autoterminationMinutes,
        awsAttributes,
        azureAttributes,
        clusterLogConf,
        clusterName,
        clusterSource,
        customTags,
        driverInstancePoolId,
        driverNodeTypeId,
        enableElasticDisk,
        enableLocalDiskEncryption,
        gcpAttributes,
        instancePoolId,
        nodeTypeId,
        policyId,
        runtimeEngine,
        sparkConf,
        sparkEnvVars,
        sparkVersion,
        sshPublicKeys,
        workloadType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ClusterAttributes.class)
        .add("autoterminationMinutes", autoterminationMinutes)
        .add("awsAttributes", awsAttributes)
        .add("azureAttributes", azureAttributes)
        .add("clusterLogConf", clusterLogConf)
        .add("clusterName", clusterName)
        .add("clusterSource", clusterSource)
        .add("customTags", customTags)
        .add("driverInstancePoolId", driverInstancePoolId)
        .add("driverNodeTypeId", driverNodeTypeId)
        .add("enableElasticDisk", enableElasticDisk)
        .add("enableLocalDiskEncryption", enableLocalDiskEncryption)
        .add("gcpAttributes", gcpAttributes)
        .add("instancePoolId", instancePoolId)
        .add("nodeTypeId", nodeTypeId)
        .add("policyId", policyId)
        .add("runtimeEngine", runtimeEngine)
        .add("sparkConf", sparkConf)
        .add("sparkEnvVars", sparkEnvVars)
        .add("sparkVersion", sparkVersion)
        .add("sshPublicKeys", sshPublicKeys)
        .add("workloadType", workloadType)
        .toString();
  }
}
