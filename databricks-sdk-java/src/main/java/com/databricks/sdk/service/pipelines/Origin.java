// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = Origin.OriginSerializer.class)
@JsonDeserialize(using = Origin.OriginDeserializer.class)
public class Origin {
  /** The id of a batch. Unique within a flow. */
  private Long batchId;

  /** The cloud provider, e.g., AWS or Azure. */
  private String cloud;

  /** The id of the cluster where an execution happens. Unique within a region. */
  private String clusterId;

  /** The name of a dataset. Unique within a pipeline. */
  private String datasetName;

  /**
   * The id of the flow. Globally unique. Incremental queries will generally reuse the same id while
   * complete queries will have a new id per update.
   */
  private String flowId;

  /** The name of the flow. Not unique. */
  private String flowName;

  /** The optional host name where the event was triggered */
  private String host;

  /** The id of a maintenance run. Globally unique. */
  private String maintenanceId;

  /** Materialization name. */
  private String materializationName;

  /** The org id of the user. Unique within a cloud. */
  private Long orgId;

  /** The id of the pipeline. Globally unique. */
  private String pipelineId;

  /** The name of the pipeline. Not unique. */
  private String pipelineName;

  /** The cloud region. */
  private String region;

  /** The id of the request that caused an update. */
  private String requestId;

  /** The id of a (delta) table. Globally unique. */
  private String tableId;

  /** The Unity Catalog id of the MV or ST being updated. */
  private String ucResourceId;

  /** The id of an execution. Globally unique. */
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

  OriginPb toPb() {
    OriginPb pb = new OriginPb();
    pb.setBatchId(batchId);
    pb.setCloud(cloud);
    pb.setClusterId(clusterId);
    pb.setDatasetName(datasetName);
    pb.setFlowId(flowId);
    pb.setFlowName(flowName);
    pb.setHost(host);
    pb.setMaintenanceId(maintenanceId);
    pb.setMaterializationName(materializationName);
    pb.setOrgId(orgId);
    pb.setPipelineId(pipelineId);
    pb.setPipelineName(pipelineName);
    pb.setRegion(region);
    pb.setRequestId(requestId);
    pb.setTableId(tableId);
    pb.setUcResourceId(ucResourceId);
    pb.setUpdateId(updateId);

    return pb;
  }

  static Origin fromPb(OriginPb pb) {
    Origin model = new Origin();
    model.setBatchId(pb.getBatchId());
    model.setCloud(pb.getCloud());
    model.setClusterId(pb.getClusterId());
    model.setDatasetName(pb.getDatasetName());
    model.setFlowId(pb.getFlowId());
    model.setFlowName(pb.getFlowName());
    model.setHost(pb.getHost());
    model.setMaintenanceId(pb.getMaintenanceId());
    model.setMaterializationName(pb.getMaterializationName());
    model.setOrgId(pb.getOrgId());
    model.setPipelineId(pb.getPipelineId());
    model.setPipelineName(pb.getPipelineName());
    model.setRegion(pb.getRegion());
    model.setRequestId(pb.getRequestId());
    model.setTableId(pb.getTableId());
    model.setUcResourceId(pb.getUcResourceId());
    model.setUpdateId(pb.getUpdateId());

    return model;
  }

  public static class OriginSerializer extends JsonSerializer<Origin> {
    @Override
    public void serialize(Origin value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      OriginPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class OriginDeserializer extends JsonDeserializer<Origin> {
    @Override
    public Origin deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      OriginPb pb = mapper.readValue(p, OriginPb.class);
      return Origin.fromPb(pb);
    }
  }
}
