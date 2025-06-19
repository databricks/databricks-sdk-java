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
class ClusterDetailsPb {
  @JsonProperty("autoscale")
  private AutoScale autoscale;

  @JsonProperty("autotermination_minutes")
  private Long autoterminationMinutes;

  @JsonProperty("aws_attributes")
  private AwsAttributes awsAttributes;

  @JsonProperty("azure_attributes")
  private AzureAttributes azureAttributes;

  @JsonProperty("cluster_cores")
  private Double clusterCores;

  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("cluster_log_conf")
  private ClusterLogConf clusterLogConf;

  @JsonProperty("cluster_log_status")
  private LogSyncStatus clusterLogStatus;

  @JsonProperty("cluster_memory_mb")
  private Long clusterMemoryMb;

  @JsonProperty("cluster_name")
  private String clusterName;

  @JsonProperty("cluster_source")
  private ClusterSource clusterSource;

  @JsonProperty("creator_user_name")
  private String creatorUserName;

  @JsonProperty("custom_tags")
  private Map<String, String> customTags;

  @JsonProperty("data_security_mode")
  private DataSecurityMode dataSecurityMode;

  @JsonProperty("default_tags")
  private Map<String, String> defaultTags;

  @JsonProperty("docker_image")
  private DockerImage dockerImage;

  @JsonProperty("driver")
  private SparkNode driver;

  @JsonProperty("driver_instance_pool_id")
  private String driverInstancePoolId;

  @JsonProperty("driver_node_type_id")
  private String driverNodeTypeId;

  @JsonProperty("enable_elastic_disk")
  private Boolean enableElasticDisk;

  @JsonProperty("enable_local_disk_encryption")
  private Boolean enableLocalDiskEncryption;

  @JsonProperty("executors")
  private Collection<SparkNode> executors;

  @JsonProperty("gcp_attributes")
  private GcpAttributes gcpAttributes;

  @JsonProperty("init_scripts")
  private Collection<InitScriptInfo> initScripts;

  @JsonProperty("instance_pool_id")
  private String instancePoolId;

  @JsonProperty("is_single_node")
  private Boolean isSingleNode;

  @JsonProperty("jdbc_port")
  private Long jdbcPort;

  @JsonProperty("kind")
  private Kind kind;

  @JsonProperty("last_restarted_time")
  private Long lastRestartedTime;

  @JsonProperty("last_state_loss_time")
  private Long lastStateLossTime;

  @JsonProperty("node_type_id")
  private String nodeTypeId;

  @JsonProperty("num_workers")
  private Long numWorkers;

  @JsonProperty("policy_id")
  private String policyId;

  @JsonProperty("runtime_engine")
  private RuntimeEngine runtimeEngine;

  @JsonProperty("single_user_name")
  private String singleUserName;

  @JsonProperty("spark_conf")
  private Map<String, String> sparkConf;

  @JsonProperty("spark_context_id")
  private Long sparkContextId;

  @JsonProperty("spark_env_vars")
  private Map<String, String> sparkEnvVars;

  @JsonProperty("spark_version")
  private String sparkVersion;

  @JsonProperty("spec")
  private ClusterSpec spec;

  @JsonProperty("ssh_public_keys")
  private Collection<String> sshPublicKeys;

  @JsonProperty("start_time")
  private Long startTime;

  @JsonProperty("state")
  private State state;

  @JsonProperty("state_message")
  private String stateMessage;

  @JsonProperty("terminated_time")
  private Long terminatedTime;

  @JsonProperty("termination_reason")
  private TerminationReason terminationReason;

  @JsonProperty("use_ml_runtime")
  private Boolean useMlRuntime;

  @JsonProperty("workload_type")
  private WorkloadType workloadType;

  public ClusterDetailsPb setAutoscale(AutoScale autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  public AutoScale getAutoscale() {
    return autoscale;
  }

  public ClusterDetailsPb setAutoterminationMinutes(Long autoterminationMinutes) {
    this.autoterminationMinutes = autoterminationMinutes;
    return this;
  }

  public Long getAutoterminationMinutes() {
    return autoterminationMinutes;
  }

  public ClusterDetailsPb setAwsAttributes(AwsAttributes awsAttributes) {
    this.awsAttributes = awsAttributes;
    return this;
  }

  public AwsAttributes getAwsAttributes() {
    return awsAttributes;
  }

  public ClusterDetailsPb setAzureAttributes(AzureAttributes azureAttributes) {
    this.azureAttributes = azureAttributes;
    return this;
  }

  public AzureAttributes getAzureAttributes() {
    return azureAttributes;
  }

  public ClusterDetailsPb setClusterCores(Double clusterCores) {
    this.clusterCores = clusterCores;
    return this;
  }

  public Double getClusterCores() {
    return clusterCores;
  }

  public ClusterDetailsPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ClusterDetailsPb setClusterLogConf(ClusterLogConf clusterLogConf) {
    this.clusterLogConf = clusterLogConf;
    return this;
  }

  public ClusterLogConf getClusterLogConf() {
    return clusterLogConf;
  }

  public ClusterDetailsPb setClusterLogStatus(LogSyncStatus clusterLogStatus) {
    this.clusterLogStatus = clusterLogStatus;
    return this;
  }

  public LogSyncStatus getClusterLogStatus() {
    return clusterLogStatus;
  }

  public ClusterDetailsPb setClusterMemoryMb(Long clusterMemoryMb) {
    this.clusterMemoryMb = clusterMemoryMb;
    return this;
  }

  public Long getClusterMemoryMb() {
    return clusterMemoryMb;
  }

  public ClusterDetailsPb setClusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  public String getClusterName() {
    return clusterName;
  }

  public ClusterDetailsPb setClusterSource(ClusterSource clusterSource) {
    this.clusterSource = clusterSource;
    return this;
  }

  public ClusterSource getClusterSource() {
    return clusterSource;
  }

  public ClusterDetailsPb setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public ClusterDetailsPb setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public ClusterDetailsPb setDataSecurityMode(DataSecurityMode dataSecurityMode) {
    this.dataSecurityMode = dataSecurityMode;
    return this;
  }

  public DataSecurityMode getDataSecurityMode() {
    return dataSecurityMode;
  }

  public ClusterDetailsPb setDefaultTags(Map<String, String> defaultTags) {
    this.defaultTags = defaultTags;
    return this;
  }

  public Map<String, String> getDefaultTags() {
    return defaultTags;
  }

  public ClusterDetailsPb setDockerImage(DockerImage dockerImage) {
    this.dockerImage = dockerImage;
    return this;
  }

  public DockerImage getDockerImage() {
    return dockerImage;
  }

  public ClusterDetailsPb setDriver(SparkNode driver) {
    this.driver = driver;
    return this;
  }

  public SparkNode getDriver() {
    return driver;
  }

  public ClusterDetailsPb setDriverInstancePoolId(String driverInstancePoolId) {
    this.driverInstancePoolId = driverInstancePoolId;
    return this;
  }

  public String getDriverInstancePoolId() {
    return driverInstancePoolId;
  }

  public ClusterDetailsPb setDriverNodeTypeId(String driverNodeTypeId) {
    this.driverNodeTypeId = driverNodeTypeId;
    return this;
  }

  public String getDriverNodeTypeId() {
    return driverNodeTypeId;
  }

  public ClusterDetailsPb setEnableElasticDisk(Boolean enableElasticDisk) {
    this.enableElasticDisk = enableElasticDisk;
    return this;
  }

  public Boolean getEnableElasticDisk() {
    return enableElasticDisk;
  }

  public ClusterDetailsPb setEnableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
    this.enableLocalDiskEncryption = enableLocalDiskEncryption;
    return this;
  }

  public Boolean getEnableLocalDiskEncryption() {
    return enableLocalDiskEncryption;
  }

  public ClusterDetailsPb setExecutors(Collection<SparkNode> executors) {
    this.executors = executors;
    return this;
  }

  public Collection<SparkNode> getExecutors() {
    return executors;
  }

  public ClusterDetailsPb setGcpAttributes(GcpAttributes gcpAttributes) {
    this.gcpAttributes = gcpAttributes;
    return this;
  }

  public GcpAttributes getGcpAttributes() {
    return gcpAttributes;
  }

  public ClusterDetailsPb setInitScripts(Collection<InitScriptInfo> initScripts) {
    this.initScripts = initScripts;
    return this;
  }

  public Collection<InitScriptInfo> getInitScripts() {
    return initScripts;
  }

  public ClusterDetailsPb setInstancePoolId(String instancePoolId) {
    this.instancePoolId = instancePoolId;
    return this;
  }

  public String getInstancePoolId() {
    return instancePoolId;
  }

  public ClusterDetailsPb setIsSingleNode(Boolean isSingleNode) {
    this.isSingleNode = isSingleNode;
    return this;
  }

  public Boolean getIsSingleNode() {
    return isSingleNode;
  }

  public ClusterDetailsPb setJdbcPort(Long jdbcPort) {
    this.jdbcPort = jdbcPort;
    return this;
  }

  public Long getJdbcPort() {
    return jdbcPort;
  }

  public ClusterDetailsPb setKind(Kind kind) {
    this.kind = kind;
    return this;
  }

  public Kind getKind() {
    return kind;
  }

  public ClusterDetailsPb setLastRestartedTime(Long lastRestartedTime) {
    this.lastRestartedTime = lastRestartedTime;
    return this;
  }

  public Long getLastRestartedTime() {
    return lastRestartedTime;
  }

  public ClusterDetailsPb setLastStateLossTime(Long lastStateLossTime) {
    this.lastStateLossTime = lastStateLossTime;
    return this;
  }

  public Long getLastStateLossTime() {
    return lastStateLossTime;
  }

  public ClusterDetailsPb setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }

  public ClusterDetailsPb setNumWorkers(Long numWorkers) {
    this.numWorkers = numWorkers;
    return this;
  }

  public Long getNumWorkers() {
    return numWorkers;
  }

  public ClusterDetailsPb setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public ClusterDetailsPb setRuntimeEngine(RuntimeEngine runtimeEngine) {
    this.runtimeEngine = runtimeEngine;
    return this;
  }

  public RuntimeEngine getRuntimeEngine() {
    return runtimeEngine;
  }

  public ClusterDetailsPb setSingleUserName(String singleUserName) {
    this.singleUserName = singleUserName;
    return this;
  }

  public String getSingleUserName() {
    return singleUserName;
  }

  public ClusterDetailsPb setSparkConf(Map<String, String> sparkConf) {
    this.sparkConf = sparkConf;
    return this;
  }

  public Map<String, String> getSparkConf() {
    return sparkConf;
  }

  public ClusterDetailsPb setSparkContextId(Long sparkContextId) {
    this.sparkContextId = sparkContextId;
    return this;
  }

  public Long getSparkContextId() {
    return sparkContextId;
  }

  public ClusterDetailsPb setSparkEnvVars(Map<String, String> sparkEnvVars) {
    this.sparkEnvVars = sparkEnvVars;
    return this;
  }

  public Map<String, String> getSparkEnvVars() {
    return sparkEnvVars;
  }

  public ClusterDetailsPb setSparkVersion(String sparkVersion) {
    this.sparkVersion = sparkVersion;
    return this;
  }

  public String getSparkVersion() {
    return sparkVersion;
  }

  public ClusterDetailsPb setSpec(ClusterSpec spec) {
    this.spec = spec;
    return this;
  }

  public ClusterSpec getSpec() {
    return spec;
  }

  public ClusterDetailsPb setSshPublicKeys(Collection<String> sshPublicKeys) {
    this.sshPublicKeys = sshPublicKeys;
    return this;
  }

  public Collection<String> getSshPublicKeys() {
    return sshPublicKeys;
  }

  public ClusterDetailsPb setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public ClusterDetailsPb setState(State state) {
    this.state = state;
    return this;
  }

  public State getState() {
    return state;
  }

  public ClusterDetailsPb setStateMessage(String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
  }

  public String getStateMessage() {
    return stateMessage;
  }

  public ClusterDetailsPb setTerminatedTime(Long terminatedTime) {
    this.terminatedTime = terminatedTime;
    return this;
  }

  public Long getTerminatedTime() {
    return terminatedTime;
  }

  public ClusterDetailsPb setTerminationReason(TerminationReason terminationReason) {
    this.terminationReason = terminationReason;
    return this;
  }

  public TerminationReason getTerminationReason() {
    return terminationReason;
  }

  public ClusterDetailsPb setUseMlRuntime(Boolean useMlRuntime) {
    this.useMlRuntime = useMlRuntime;
    return this;
  }

  public Boolean getUseMlRuntime() {
    return useMlRuntime;
  }

  public ClusterDetailsPb setWorkloadType(WorkloadType workloadType) {
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
    ClusterDetailsPb that = (ClusterDetailsPb) o;
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
    return new ToStringer(ClusterDetailsPb.class)
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
