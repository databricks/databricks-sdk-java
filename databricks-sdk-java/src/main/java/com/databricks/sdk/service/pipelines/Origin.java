// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Origin {
  /** The id of a batch. Unique within a flow. */
  @JsonProperty("batch_id")
  private Long batchId;

  /** The cloud provider, e.g., AWS or Azure. */
  @JsonProperty("cloud")
  private String cloud;

  /** The id of the cluster where an execution happens. Unique within a region. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** The name of a dataset. Unique within a pipeline. */
  @JsonProperty("dataset_name")
  private String datasetName;

  /**
   * The id of the flow. Globally unique. Incremental queries will generally reuse the same id while
   * complete queries will have a new id per update.
   */
  @JsonProperty("flow_id")
  private String flowId;

  /** The name of the flow. Not unique. */
  @JsonProperty("flow_name")
  private String flowName;

  /** The optional host name where the event was triggered */
  @JsonProperty("host")
  private String host;

  /** The id of a maintenance run. Globally unique. */
  @JsonProperty("maintenance_id")
  private String maintenanceId;

  /** Materialization name. */
  @JsonProperty("materialization_name")
  private String materializationName;

  /** The org id of the user. Unique within a cloud. */
  @JsonProperty("org_id")
  private Long orgId;

  /** The id of the pipeline. Globally unique. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /** The name of the pipeline. Not unique. */
  @JsonProperty("pipeline_name")
  private String pipelineName;

  /** The cloud region. */
  @JsonProperty("region")
  private String region;

  /** The id of the request that caused an update. */
  @JsonProperty("request_id")
  private String requestId;

  /** The id of a (delta) table. Globally unique. */
  @JsonProperty("table_id")
  private String tableId;

  /** The Unity Catalog id of the MV or ST being updated. */
  @JsonProperty("uc_resource_id")
  private String ucResourceId;

  /** The id of an execution. Globally unique. */
  @JsonProperty("update_id")
  private String updateId;

  public Origin setBatchId(Long batchId) {
    this.batchId = batchId;
    return this;
  }

  public Long getBatchId() {
    return batchId;
  }

  public Origin setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public Origin setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public Origin setDatasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  public String getDatasetName() {
    return datasetName;
  }

  public Origin setFlowId(String flowId) {
    this.flowId = flowId;
    return this;
  }

  public String getFlowId() {
    return flowId;
  }

  public Origin setFlowName(String flowName) {
    this.flowName = flowName;
    return this;
  }

  public String getFlowName() {
    return flowName;
  }

  public Origin setHost(String host) {
    this.host = host;
    return this;
  }

  public String getHost() {
    return host;
  }

  public Origin setMaintenanceId(String maintenanceId) {
    this.maintenanceId = maintenanceId;
    return this;
  }

  public String getMaintenanceId() {
    return maintenanceId;
  }

  public Origin setMaterializationName(String materializationName) {
    this.materializationName = materializationName;
    return this;
  }

  public String getMaterializationName() {
    return materializationName;
  }

  public Origin setOrgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  public Long getOrgId() {
    return orgId;
  }

  public Origin setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public Origin setPipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
    return this;
  }

  public String getPipelineName() {
    return pipelineName;
  }

  public Origin setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public Origin setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  public Origin setTableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  public String getTableId() {
    return tableId;
  }

  public Origin setUcResourceId(String ucResourceId) {
    this.ucResourceId = ucResourceId;
    return this;
  }

  public String getUcResourceId() {
    return ucResourceId;
  }

  public Origin setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  public String getUpdateId() {
    return updateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Origin that = (Origin) o;
    return Objects.equals(batchId, that.batchId)
        && Objects.equals(cloud, that.cloud)
        && Objects.equals(clusterId, that.clusterId)
        && Objects.equals(datasetName, that.datasetName)
        && Objects.equals(flowId, that.flowId)
        && Objects.equals(flowName, that.flowName)
        && Objects.equals(host, that.host)
        && Objects.equals(maintenanceId, that.maintenanceId)
        && Objects.equals(materializationName, that.materializationName)
        && Objects.equals(orgId, that.orgId)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(pipelineName, that.pipelineName)
        && Objects.equals(region, that.region)
        && Objects.equals(requestId, that.requestId)
        && Objects.equals(tableId, that.tableId)
        && Objects.equals(ucResourceId, that.ucResourceId)
        && Objects.equals(updateId, that.updateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        batchId,
        cloud,
        clusterId,
        datasetName,
        flowId,
        flowName,
        host,
        maintenanceId,
        materializationName,
        orgId,
        pipelineId,
        pipelineName,
        region,
        requestId,
        tableId,
        ucResourceId,
        updateId);
  }

  @Override
  public String toString() {
    return new ToStringer(Origin.class)
        .add("batchId", batchId)
        .add("cloud", cloud)
        .add("clusterId", clusterId)
        .add("datasetName", datasetName)
        .add("flowId", flowId)
        .add("flowName", flowName)
        .add("host", host)
        .add("maintenanceId", maintenanceId)
        .add("materializationName", materializationName)
        .add("orgId", orgId)
        .add("pipelineId", pipelineId)
        .add("pipelineName", pipelineName)
        .add("region", region)
        .add("requestId", requestId)
        .add("tableId", tableId)
        .add("ucResourceId", ucResourceId)
        .add("updateId", updateId)
        .toString();
  }
}
