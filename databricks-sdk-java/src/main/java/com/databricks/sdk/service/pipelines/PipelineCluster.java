// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class PipelineCluster {
  /** Note: This field won't be persisted. Only API users will check this field. */
  @JsonProperty("apply_policy_default_values")
  private Boolean applyPolicyDefaultValues;

  /**
   * Parameters needed in order to automatically scale clusters up and down based on load. Note:
   * autoscaling works best with DB runtime versions 3.0 or later.
   */
  @JsonProperty("autoscale")
  private Object /* MISSING TYPE */ autoscale;

  /**
   * Attributes related to clusters running on Amazon Web Services. If not specified at cluster
   * creation, a set of default values will be used.
   */
  @JsonProperty("aws_attributes")
  private Object /* MISSING TYPE */ awsAttributes;

  /**
   * Attributes related to clusters running on Amazon Web Services. If not specified at cluster
   * creation, a set of default values will be used.
   */
  @JsonProperty("azure_attributes")
  private Object /* MISSING TYPE */ azureAttributes;

  /**
   * The configuration for delivering spark logs to a long-term storage destination. Two kinds of
   * destinations (dbfs and s3) are supported. Only one destination can be specified for one
   * cluster. If the conf is given, the logs will be delivered to the destination every `5 mins`.
   * The destination of driver logs is `$destination/$clusterId/driver`, while the destination of
   * executor logs is `$destination/$clusterId/executor`.
   */
  @JsonProperty("cluster_log_conf")
  private Object /* MISSING TYPE */ clusterLogConf;

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
   * Attributes related to clusters running on Google Cloud Platform. If not specified at cluster
   * creation, a set of default values will be used.
   */
  @JsonProperty("gcp_attributes")
  private Object /* MISSING TYPE */ gcpAttributes;

  /** The optional ID of the instance pool to which the cluster belongs. */
  @JsonProperty("instance_pool_id")
  private String instancePoolId;

  /**
   * A label for the cluster specification, either `default` to configure the default cluster, or
   * `maintenance` to configure the maintenance cluster. This field is optional. The default value
   * is `default`.
   */
  @JsonProperty("label")
  private String label;

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
   * An object containing a set of optional, user-specified Spark configuration key-value pairs. See
   * :method:clusters/create for more details.
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
   * SSH public key contents that will be added to each Spark node in this cluster. The
   * corresponding private keys can be used to login with the user name `ubuntu` on port `2200`. Up
   * to 10 keys can be specified.
   */
  @JsonProperty("ssh_public_keys")
  private Collection<String> sshPublicKeys;

  public PipelineCluster setApplyPolicyDefaultValues(Boolean applyPolicyDefaultValues) {
    this.applyPolicyDefaultValues = applyPolicyDefaultValues;
    return this;
  }

  public Boolean getApplyPolicyDefaultValues() {
    return applyPolicyDefaultValues;
  }

  public PipelineCluster setAutoscale(Object /* MISSING TYPE */ autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  public Object /* MISSING TYPE */ getAutoscale() {
    return autoscale;
  }

  public PipelineCluster setAwsAttributes(Object /* MISSING TYPE */ awsAttributes) {
    this.awsAttributes = awsAttributes;
    return this;
  }

  public Object /* MISSING TYPE */ getAwsAttributes() {
    return awsAttributes;
  }

  public PipelineCluster setAzureAttributes(Object /* MISSING TYPE */ azureAttributes) {
    this.azureAttributes = azureAttributes;
    return this;
  }

  public Object /* MISSING TYPE */ getAzureAttributes() {
    return azureAttributes;
  }

  public PipelineCluster setClusterLogConf(Object /* MISSING TYPE */ clusterLogConf) {
    this.clusterLogConf = clusterLogConf;
    return this;
  }

  public Object /* MISSING TYPE */ getClusterLogConf() {
    return clusterLogConf;
  }

  public PipelineCluster setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public PipelineCluster setDriverInstancePoolId(String driverInstancePoolId) {
    this.driverInstancePoolId = driverInstancePoolId;
    return this;
  }

  public String getDriverInstancePoolId() {
    return driverInstancePoolId;
  }

  public PipelineCluster setDriverNodeTypeId(String driverNodeTypeId) {
    this.driverNodeTypeId = driverNodeTypeId;
    return this;
  }

  public String getDriverNodeTypeId() {
    return driverNodeTypeId;
  }

  public PipelineCluster setGcpAttributes(Object /* MISSING TYPE */ gcpAttributes) {
    this.gcpAttributes = gcpAttributes;
    return this;
  }

  public Object /* MISSING TYPE */ getGcpAttributes() {
    return gcpAttributes;
  }

  public PipelineCluster setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  public PipelineCluster setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public PipelineCluster setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }

  public PipelineCluster setNumWorkers(Long numWorkers) {
    this.numWorkers = numWorkers;
    return this;
  }

  public Long getNumWorkers() {
    return numWorkers;
  }

  public PipelineCluster setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public PipelineCluster setSparkConf(Map<String, String> sparkConf) {
    this.sparkConf = sparkConf;
    return this;
  }

  public Map<String, String> getSparkConf() {
    return sparkConf;
  }

  public PipelineCluster setSparkEnvVars(Map<String, String> sparkEnvVars) {
    this.sparkEnvVars = sparkEnvVars;
    return this;
  }

  public Map<String, String> getSparkEnvVars() {
    return sparkEnvVars;
  }

  public PipelineCluster setSshPublicKeys(Collection<String> sshPublicKeys) {
    this.sshPublicKeys = sshPublicKeys;
    return this;
  }

  public Collection<String> getSshPublicKeys() {
    return sshPublicKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineCluster that = (PipelineCluster) o;
    return Objects.equals(applyPolicyDefaultValues, that.applyPolicyDefaultValues)
        && Objects.equals(autoscale, that.autoscale)
        && Objects.equals(awsAttributes, that.awsAttributes)
        && Objects.equals(azureAttributes, that.azureAttributes)
        && Objects.equals(clusterLogConf, that.clusterLogConf)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(driverInstancePoolId, that.driverInstancePoolId)
        && Objects.equals(driverNodeTypeId, that.driverNodeTypeId)
        && Objects.equals(gcpAttributes, that.gcpAttributes)
        && Objects.equals(instancePoolId, that.instancePoolId)
        && Objects.equals(label, that.label)
        && Objects.equals(nodeTypeId, that.nodeTypeId)
        && Objects.equals(numWorkers, that.numWorkers)
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(sparkConf, that.sparkConf)
        && Objects.equals(sparkEnvVars, that.sparkEnvVars)
        && Objects.equals(sshPublicKeys, that.sshPublicKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applyPolicyDefaultValues,
        autoscale,
        awsAttributes,
        azureAttributes,
        clusterLogConf,
        customTags,
        driverInstancePoolId,
        driverNodeTypeId,
        gcpAttributes,
        instancePoolId,
        label,
        nodeTypeId,
        numWorkers,
        policyId,
        sparkConf,
        sparkEnvVars,
        sshPublicKeys);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineCluster.class)
        .add("applyPolicyDefaultValues", applyPolicyDefaultValues)
        .add("autoscale", autoscale)
        .add("awsAttributes", awsAttributes)
        .add("azureAttributes", azureAttributes)
        .add("clusterLogConf", clusterLogConf)
        .add("customTags", customTags)
        .add("driverInstancePoolId", driverInstancePoolId)
        .add("driverNodeTypeId", driverNodeTypeId)
        .add("gcpAttributes", gcpAttributes)
        .add("instancePoolId", instancePoolId)
        .add("label", label)
        .add("nodeTypeId", nodeTypeId)
        .add("numWorkers", numWorkers)
        .add("policyId", policyId)
        .add("sparkConf", sparkConf)
        .add("sparkEnvVars", sparkEnvVars)
        .add("sshPublicKeys", sshPublicKeys)
        .toString();
  }
}
