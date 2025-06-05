// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
class PipelineClusterPb {
  @JsonProperty("apply_policy_default_values")
  private Boolean applyPolicyDefaultValues;

  @JsonProperty("autoscale")
  private PipelineClusterAutoscale autoscale;

  @JsonProperty("aws_attributes")
  private com.databricks.sdk.service.compute.AwsAttributes awsAttributes;

  @JsonProperty("azure_attributes")
  private com.databricks.sdk.service.compute.AzureAttributes azureAttributes;

  @JsonProperty("cluster_log_conf")
  private com.databricks.sdk.service.compute.ClusterLogConf clusterLogConf;

  @JsonProperty("custom_tags")
  private Map<String, String> customTags;

  @JsonProperty("driver_instance_pool_id")
  private String driverInstancePoolId;

  @JsonProperty("driver_node_type_id")
  private String driverNodeTypeId;

  @JsonProperty("enable_local_disk_encryption")
  private Boolean enableLocalDiskEncryption;

  @JsonProperty("gcp_attributes")
  private com.databricks.sdk.service.compute.GcpAttributes gcpAttributes;

  @JsonProperty("init_scripts")
  private Collection<com.databricks.sdk.service.compute.InitScriptInfo> initScripts;

  @JsonProperty("instance_pool_id")
  private String instancePoolId;

  @JsonProperty("label")
  private String label;

  @JsonProperty("node_type_id")
  private String nodeTypeId;

  @JsonProperty("num_workers")
  private Long numWorkers;

  @JsonProperty("policy_id")
  private String policyId;

  @JsonProperty("spark_conf")
  private Map<String, String> sparkConf;

  @JsonProperty("spark_env_vars")
  private Map<String, String> sparkEnvVars;

  @JsonProperty("ssh_public_keys")
  private Collection<String> sshPublicKeys;

  public PipelineClusterPb setApplyPolicyDefaultValues(Boolean applyPolicyDefaultValues) {
    this.applyPolicyDefaultValues = applyPolicyDefaultValues;
    return this;
  }

  public Boolean getApplyPolicyDefaultValues() {
    return applyPolicyDefaultValues;
  }

  public PipelineClusterPb setAutoscale(PipelineClusterAutoscale autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  public PipelineClusterAutoscale getAutoscale() {
    return autoscale;
  }

  public PipelineClusterPb setAwsAttributes(
      com.databricks.sdk.service.compute.AwsAttributes awsAttributes) {
    this.awsAttributes = awsAttributes;
    return this;
  }

  public com.databricks.sdk.service.compute.AwsAttributes getAwsAttributes() {
    return awsAttributes;
  }

  public PipelineClusterPb setAzureAttributes(
      com.databricks.sdk.service.compute.AzureAttributes azureAttributes) {
    this.azureAttributes = azureAttributes;
    return this;
  }

  public com.databricks.sdk.service.compute.AzureAttributes getAzureAttributes() {
    return azureAttributes;
  }

  public PipelineClusterPb setClusterLogConf(
      com.databricks.sdk.service.compute.ClusterLogConf clusterLogConf) {
    this.clusterLogConf = clusterLogConf;
    return this;
  }

  public com.databricks.sdk.service.compute.ClusterLogConf getClusterLogConf() {
    return clusterLogConf;
  }

  public PipelineClusterPb setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public PipelineClusterPb setDriverInstancePoolId(String driverInstancePoolId) {
    this.driverInstancePoolId = driverInstancePoolId;
    return this;
  }

  public String getDriverInstancePoolId() {
    return driverInstancePoolId;
  }

  public PipelineClusterPb setDriverNodeTypeId(String driverNodeTypeId) {
    this.driverNodeTypeId = driverNodeTypeId;
    return this;
  }

  public String getDriverNodeTypeId() {
    return driverNodeTypeId;
  }

  public PipelineClusterPb setEnableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
    this.enableLocalDiskEncryption = enableLocalDiskEncryption;
    return this;
  }

  public Boolean getEnableLocalDiskEncryption() {
    return enableLocalDiskEncryption;
  }

  public PipelineClusterPb setGcpAttributes(
      com.databricks.sdk.service.compute.GcpAttributes gcpAttributes) {
    this.gcpAttributes = gcpAttributes;
    return this;
  }

  public com.databricks.sdk.service.compute.GcpAttributes getGcpAttributes() {
    return gcpAttributes;
  }

  public PipelineClusterPb setInitScripts(
      Collection<com.databricks.sdk.service.compute.InitScriptInfo> initScripts) {
    this.initScripts = initScripts;
    return this;
  }

  public Collection<com.databricks.sdk.service.compute.InitScriptInfo> getInitScripts() {
    return initScripts;
  }

  public PipelineClusterPb setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  public PipelineClusterPb setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public PipelineClusterPb setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }

  public PipelineClusterPb setNumWorkers(Long numWorkers) {
    this.numWorkers = numWorkers;
    return this;
  }

  public Long getNumWorkers() {
    return numWorkers;
  }

  public PipelineClusterPb setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public PipelineClusterPb setSparkConf(Map<String, String> sparkConf) {
    this.sparkConf = sparkConf;
    return this;
  }

  public Map<String, String> getSparkConf() {
    return sparkConf;
  }

  public PipelineClusterPb setSparkEnvVars(Map<String, String> sparkEnvVars) {
    this.sparkEnvVars = sparkEnvVars;
    return this;
  }

  public Map<String, String> getSparkEnvVars() {
    return sparkEnvVars;
  }

  public PipelineClusterPb setSshPublicKeys(Collection<String> sshPublicKeys) {
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
    PipelineClusterPb that = (PipelineClusterPb) o;
    return Objects.equals(applyPolicyDefaultValues, that.applyPolicyDefaultValues)
        && Objects.equals(autoscale, that.autoscale)
        && Objects.equals(awsAttributes, that.awsAttributes)
        && Objects.equals(azureAttributes, that.azureAttributes)
        && Objects.equals(clusterLogConf, that.clusterLogConf)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(driverInstancePoolId, that.driverInstancePoolId)
        && Objects.equals(driverNodeTypeId, that.driverNodeTypeId)
        && Objects.equals(enableLocalDiskEncryption, that.enableLocalDiskEncryption)
        && Objects.equals(gcpAttributes, that.gcpAttributes)
        && Objects.equals(initScripts, that.initScripts)
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
        enableLocalDiskEncryption,
        gcpAttributes,
        initScripts,
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
    return new ToStringer(PipelineClusterPb.class)
        .add("applyPolicyDefaultValues", applyPolicyDefaultValues)
        .add("autoscale", autoscale)
        .add("awsAttributes", awsAttributes)
        .add("azureAttributes", azureAttributes)
        .add("clusterLogConf", clusterLogConf)
        .add("customTags", customTags)
        .add("driverInstancePoolId", driverInstancePoolId)
        .add("driverNodeTypeId", driverNodeTypeId)
        .add("enableLocalDiskEncryption", enableLocalDiskEncryption)
        .add("gcpAttributes", gcpAttributes)
        .add("initScripts", initScripts)
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
