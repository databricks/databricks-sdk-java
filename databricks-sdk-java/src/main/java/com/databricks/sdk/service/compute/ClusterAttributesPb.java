// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * Common set of attributes set during cluster creation. These attributes cannot be changed over the
 * lifetime of a cluster.
 */
@Generated
class ClusterAttributesPb {
  @JsonProperty("autotermination_minutes")
  private Long autoterminationMinutes;

  @JsonProperty("aws_attributes")
  private AwsAttributes awsAttributes;

  @JsonProperty("azure_attributes")
  private AzureAttributes azureAttributes;

  @JsonProperty("cluster_log_conf")
  private ClusterLogConf clusterLogConf;

  @JsonProperty("cluster_name")
  private String clusterName;

  @JsonProperty("custom_tags")
  private Map<String, String> customTags;

  @JsonProperty("data_security_mode")
  private DataSecurityMode dataSecurityMode;

  @JsonProperty("docker_image")
  private DockerImage dockerImage;

  @JsonProperty("driver_instance_pool_id")
  private String driverInstancePoolId;

  @JsonProperty("driver_node_type_id")
  private String driverNodeTypeId;

  @JsonProperty("enable_elastic_disk")
  private Boolean enableElasticDisk;

  @JsonProperty("enable_local_disk_encryption")
  private Boolean enableLocalDiskEncryption;

  @JsonProperty("gcp_attributes")
  private GcpAttributes gcpAttributes;

  @JsonProperty("init_scripts")
  private Collection<InitScriptInfo> initScripts;

  @JsonProperty("instance_pool_id")
  private String instancePoolId;

  @JsonProperty("is_single_node")
  private Boolean isSingleNode;

  @JsonProperty("kind")
  private Kind kind;

  @JsonProperty("node_type_id")
  private String nodeTypeId;

  @JsonProperty("policy_id")
  private String policyId;

  @JsonProperty("remote_disk_throughput")
  private Long remoteDiskThroughput;

  @JsonProperty("runtime_engine")
  private RuntimeEngine runtimeEngine;

  @JsonProperty("single_user_name")
  private String singleUserName;

  @JsonProperty("spark_conf")
  private Map<String, String> sparkConf;

  @JsonProperty("spark_env_vars")
  private Map<String, String> sparkEnvVars;

  @JsonProperty("spark_version")
  private String sparkVersion;

  @JsonProperty("ssh_public_keys")
  private Collection<String> sshPublicKeys;

  @JsonProperty("total_initial_remote_disk_size")
  private Long totalInitialRemoteDiskSize;

  @JsonProperty("use_ml_runtime")
  private Boolean useMlRuntime;

  @JsonProperty("workload_type")
  private WorkloadType workloadType;

  public ClusterAttributesPb setAutoterminationMinutes(Long autoterminationMinutes) {
    this.autoterminationMinutes = autoterminationMinutes;
    return this;
  }

  public Long getAutoterminationMinutes() {
    return autoterminationMinutes;
  }

  public ClusterAttributesPb setAwsAttributes(AwsAttributes awsAttributes) {
    this.awsAttributes = awsAttributes;
    return this;
  }

  public AwsAttributes getAwsAttributes() {
    return awsAttributes;
  }

  public ClusterAttributesPb setAzureAttributes(AzureAttributes azureAttributes) {
    this.azureAttributes = azureAttributes;
    return this;
  }

  public AzureAttributes getAzureAttributes() {
    return azureAttributes;
  }

  public ClusterAttributesPb setClusterLogConf(ClusterLogConf clusterLogConf) {
    this.clusterLogConf = clusterLogConf;
    return this;
  }

  public ClusterLogConf getClusterLogConf() {
    return clusterLogConf;
  }

  public ClusterAttributesPb setClusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  public String getClusterName() {
    return clusterName;
  }

  public ClusterAttributesPb setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public ClusterAttributesPb setDataSecurityMode(DataSecurityMode dataSecurityMode) {
    this.dataSecurityMode = dataSecurityMode;
    return this;
  }

  public DataSecurityMode getDataSecurityMode() {
    return dataSecurityMode;
  }

  public ClusterAttributesPb setDockerImage(DockerImage dockerImage) {
    this.dockerImage = dockerImage;
    return this;
  }

  public DockerImage getDockerImage() {
    return dockerImage;
  }

  public ClusterAttributesPb setDriverInstancePoolId(String driverInstancePoolId) {
    this.driverInstancePoolId = driverInstancePoolId;
    return this;
  }

  public String getDriverInstancePoolId() {
    return driverInstancePoolId;
  }

  public ClusterAttributesPb setDriverNodeTypeId(String driverNodeTypeId) {
    this.driverNodeTypeId = driverNodeTypeId;
    return this;
  }

  public String getDriverNodeTypeId() {
    return driverNodeTypeId;
  }

  public ClusterAttributesPb setEnableElasticDisk(Boolean enableElasticDisk) {
    this.enableElasticDisk = enableElasticDisk;
    return this;
  }

  public Boolean getEnableElasticDisk() {
    return enableElasticDisk;
  }

  public ClusterAttributesPb setEnableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
    this.enableLocalDiskEncryption = enableLocalDiskEncryption;
    return this;
  }

  public Boolean getEnableLocalDiskEncryption() {
    return enableLocalDiskEncryption;
  }

  public ClusterAttributesPb setGcpAttributes(GcpAttributes gcpAttributes) {
    this.gcpAttributes = gcpAttributes;
    return this;
  }

  public GcpAttributes getGcpAttributes() {
    return gcpAttributes;
  }

  public ClusterAttributesPb setInitScripts(Collection<InitScriptInfo> initScripts) {
    this.initScripts = initScripts;
    return this;
  }

  public Collection<InitScriptInfo> getInitScripts() {
    return initScripts;
  }

  public ClusterAttributesPb setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  public ClusterAttributesPb setIsSingleNode(Boolean isSingleNode) {
    this.isSingleNode = isSingleNode;
    return this;
  }

  public Boolean getIsSingleNode() {
    return isSingleNode;
  }

  public ClusterAttributesPb setKind(Kind kind) {
    this.kind = kind;
    return this;
  }

  public Kind getKind() {
    return kind;
  }

  public ClusterAttributesPb setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }

  public ClusterAttributesPb setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public ClusterAttributesPb setRemoteDiskThroughput(Long remoteDiskThroughput) {
    this.remoteDiskThroughput = remoteDiskThroughput;
    return this;
  }

  public Long getRemoteDiskThroughput() {
    return remoteDiskThroughput;
  }

  public ClusterAttributesPb setRuntimeEngine(RuntimeEngine runtimeEngine) {
    this.runtimeEngine = runtimeEngine;
    return this;
  }

  public RuntimeEngine getRuntimeEngine() {
    return runtimeEngine;
  }

  public ClusterAttributesPb setSingleUserName(String singleUserName) {
    this.singleUserName = singleUserName;
    return this;
  }

  public String getSingleUserName() {
    return singleUserName;
  }

  public ClusterAttributesPb setSparkConf(Map<String, String> sparkConf) {
    this.sparkConf = sparkConf;
    return this;
  }

  public Map<String, String> getSparkConf() {
    return sparkConf;
  }

  public ClusterAttributesPb setSparkEnvVars(Map<String, String> sparkEnvVars) {
    this.sparkEnvVars = sparkEnvVars;
    return this;
  }

  public Map<String, String> getSparkEnvVars() {
    return sparkEnvVars;
  }

  public ClusterAttributesPb setSparkVersion(String sparkVersion) {
    this.sparkVersion = sparkVersion;
    return this;
  }

  public String getSparkVersion() {
    return sparkVersion;
  }

  public ClusterAttributesPb setSshPublicKeys(Collection<String> sshPublicKeys) {
    this.sshPublicKeys = sshPublicKeys;
    return this;
  }

  public Collection<String> getSshPublicKeys() {
    return sshPublicKeys;
  }

  public ClusterAttributesPb setTotalInitialRemoteDiskSize(Long totalInitialRemoteDiskSize) {
    this.totalInitialRemoteDiskSize = totalInitialRemoteDiskSize;
    return this;
  }

  public Long getTotalInitialRemoteDiskSize() {
    return totalInitialRemoteDiskSize;
  }

  public ClusterAttributesPb setUseMlRuntime(Boolean useMlRuntime) {
    this.useMlRuntime = useMlRuntime;
    return this;
  }

  public Boolean getUseMlRuntime() {
    return useMlRuntime;
  }

  public ClusterAttributesPb setWorkloadType(WorkloadType workloadType) {
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
    ClusterAttributesPb that = (ClusterAttributesPb) o;
    return Objects.equals(autoterminationMinutes, that.autoterminationMinutes)
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
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(remoteDiskThroughput, that.remoteDiskThroughput)
        && Objects.equals(runtimeEngine, that.runtimeEngine)
        && Objects.equals(singleUserName, that.singleUserName)
        && Objects.equals(sparkConf, that.sparkConf)
        && Objects.equals(sparkEnvVars, that.sparkEnvVars)
        && Objects.equals(sparkVersion, that.sparkVersion)
        && Objects.equals(sshPublicKeys, that.sshPublicKeys)
        && Objects.equals(totalInitialRemoteDiskSize, that.totalInitialRemoteDiskSize)
        && Objects.equals(useMlRuntime, that.useMlRuntime)
        && Objects.equals(workloadType, that.workloadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
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
        policyId,
        remoteDiskThroughput,
        runtimeEngine,
        singleUserName,
        sparkConf,
        sparkEnvVars,
        sparkVersion,
        sshPublicKeys,
        totalInitialRemoteDiskSize,
        useMlRuntime,
        workloadType);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterAttributesPb.class)
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
        .add("policyId", policyId)
        .add("remoteDiskThroughput", remoteDiskThroughput)
        .add("runtimeEngine", runtimeEngine)
        .add("singleUserName", singleUserName)
        .add("sparkConf", sparkConf)
        .add("sparkEnvVars", sparkEnvVars)
        .add("sparkVersion", sparkVersion)
        .add("sshPublicKeys", sshPublicKeys)
        .add("totalInitialRemoteDiskSize", totalInitialRemoteDiskSize)
        .add("useMlRuntime", useMlRuntime)
        .add("workloadType", workloadType)
        .toString();
  }
}
