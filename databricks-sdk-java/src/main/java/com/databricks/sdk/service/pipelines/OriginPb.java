// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class OriginPb {
  @JsonProperty("batch_id")
  private Long batchId;

  @JsonProperty("cloud")
  private String cloud;

  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("dataset_name")
  private String datasetName;

  @JsonProperty("flow_id")
  private String flowId;

  @JsonProperty("flow_name")
  private String flowName;

  @JsonProperty("host")
  private String host;

  @JsonProperty("maintenance_id")
  private String maintenanceId;

  @JsonProperty("materialization_name")
  private String materializationName;

  @JsonProperty("org_id")
  private Long orgId;

  @JsonProperty("pipeline_id")
  private String pipelineId;

  @JsonProperty("pipeline_name")
  private String pipelineName;

  @JsonProperty("region")
  private String region;

  @JsonProperty("request_id")
  private String requestId;

  @JsonProperty("table_id")
  private String tableId;

  @JsonProperty("uc_resource_id")
  private String ucResourceId;

  @JsonProperty("update_id")
  private String updateId;

  public OriginPb setBatchId(Long batchId) {
    this.batchId = batchId;
    return this;
  }

  public Long getBatchId() {
    return batchId;
  }

  public OriginPb setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public OriginPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public OriginPb setDatasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  public String getDatasetName() {
    return datasetName;
  }

  public OriginPb setFlowId(String flowId) {
    this.flowId = flowId;
    return this;
  }

  public String getFlowId() {
    return flowId;
  }

  public OriginPb setFlowName(String flowName) {
    this.flowName = flowName;
    return this;
  }

  public String getFlowName() {
    return flowName;
  }

  public OriginPb setHost(String host) {
    this.host = host;
    return this;
  }

  public String getHost() {
    return host;
  }

  public OriginPb setMaintenanceId(String maintenanceId) {
    this.maintenanceId = maintenanceId;
    return this;
  }

  public String getMaintenanceId() {
    return maintenanceId;
  }

  public OriginPb setMaterializationName(String materializationName) {
    this.materializationName = materializationName;
    return this;
  }

  public String getMaterializationName() {
    return materializationName;
  }

  public OriginPb setOrgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  public Long getOrgId() {
    return orgId;
  }

  public OriginPb setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public OriginPb setPipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
    return this;
  }

  public String getPipelineName() {
    return pipelineName;
  }

  public OriginPb setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public OriginPb setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  public OriginPb setTableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  public String getTableId() {
    return tableId;
  }

  public OriginPb setUcResourceId(String ucResourceId) {
    this.ucResourceId = ucResourceId;
    return this;
  }

  public String getUcResourceId() {
    return ucResourceId;
  }

  public OriginPb setUpdateId(String updateId) {
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
    OriginPb that = (OriginPb) o;
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
    return new ToStringer(OriginPb.class)
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
