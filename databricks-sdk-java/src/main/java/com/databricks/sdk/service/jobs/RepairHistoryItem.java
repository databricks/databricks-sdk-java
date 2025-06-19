// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = RepairHistoryItem.RepairHistoryItemSerializer.class)
@JsonDeserialize(using = RepairHistoryItem.RepairHistoryItemDeserializer.class)
public class RepairHistoryItem {
  /**
   * The actual performance target used by the serverless run during execution. This can differ from
   * the client-set performance target on the request depending on whether the performance mode is
   * supported by the job type.
   *
   * <p>* `STANDARD`: Enables cost-efficient execution of serverless workloads. *
   * `PERFORMANCE_OPTIMIZED`: Prioritizes fast startup and execution times through rapid scaling and
   * optimized cluster performance.
   */
  private PerformanceTarget effectivePerformanceTarget;

  /** The end time of the (repaired) run. */
  private Long endTime;

  /**
   * The ID of the repair. Only returned for the items that represent a repair in `repair_history`.
   */
  private Long id;

  /** The start time of the (repaired) run. */
  private Long startTime;

  /** Deprecated. Please use the `status` field instead. */
  private RunState state;

  /** The current status of the run */
  private RunStatus status;

  /** The run IDs of the task runs that ran as part of this repair history item. */
  private Collection<Long> taskRunIds;

  /** The repair history item type. Indicates whether a run is the original run or a repair run. */
  private RepairHistoryItemType typeValue;

  public RepairHistoryItem setEffectivePerformanceTarget(
      PerformanceTarget effectivePerformanceTarget) {
    this.effectivePerformanceTarget = effectivePerformanceTarget;
    return this;
  }

  public PerformanceTarget getEffectivePerformanceTarget() {
    return effectivePerformanceTarget;
  }

  public RepairHistoryItem setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public RepairHistoryItem setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }

  public RepairHistoryItem setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public RepairHistoryItem setState(RunState state) {
    this.state = state;
    return this;
  }

  public RunState getState() {
    return state;
  }

  public RepairHistoryItem setStatus(RunStatus status) {
    this.status = status;
    return this;
  }

  public RunStatus getStatus() {
    return status;
  }

  public RepairHistoryItem setTaskRunIds(Collection<Long> taskRunIds) {
    this.taskRunIds = taskRunIds;
    return this;
  }

  public Collection<Long> getTaskRunIds() {
    return taskRunIds;
  }

  public RepairHistoryItem setType(RepairHistoryItemType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public RepairHistoryItemType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepairHistoryItem that = (RepairHistoryItem) o;
    return Objects.equals(effectivePerformanceTarget, that.effectivePerformanceTarget)
        && Objects.equals(endTime, that.endTime)
        && Objects.equals(id, that.id)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(state, that.state)
        && Objects.equals(status, that.status)
        && Objects.equals(taskRunIds, that.taskRunIds)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        effectivePerformanceTarget, endTime, id, startTime, state, status, taskRunIds, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(RepairHistoryItem.class)
        .add("effectivePerformanceTarget", effectivePerformanceTarget)
        .add("endTime", endTime)
        .add("id", id)
        .add("startTime", startTime)
        .add("state", state)
        .add("status", status)
        .add("taskRunIds", taskRunIds)
        .add("typeValue", typeValue)
        .toString();
  }

  RepairHistoryItemPb toPb() {
    RepairHistoryItemPb pb = new RepairHistoryItemPb();
    pb.setEffectivePerformanceTarget(effectivePerformanceTarget);
    pb.setEndTime(endTime);
    pb.setId(id);
    pb.setStartTime(startTime);
    pb.setState(state);
    pb.setStatus(status);
    pb.setTaskRunIds(taskRunIds);
    pb.setType(typeValue);

    return pb;
  }

  static RepairHistoryItem fromPb(RepairHistoryItemPb pb) {
    RepairHistoryItem model = new RepairHistoryItem();
    model.setEffectivePerformanceTarget(pb.getEffectivePerformanceTarget());
    model.setEndTime(pb.getEndTime());
    model.setId(pb.getId());
    model.setStartTime(pb.getStartTime());
    model.setState(pb.getState());
    model.setStatus(pb.getStatus());
    model.setTaskRunIds(pb.getTaskRunIds());
    model.setType(pb.getType());

    return model;
  }

  public static class RepairHistoryItemSerializer extends JsonSerializer<RepairHistoryItem> {
    @Override
    public void serialize(RepairHistoryItem value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RepairHistoryItemPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RepairHistoryItemDeserializer extends JsonDeserializer<RepairHistoryItem> {
    @Override
    public RepairHistoryItem deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RepairHistoryItemPb pb = mapper.readValue(p, RepairHistoryItemPb.class);
      return RepairHistoryItem.fromPb(pb);
    }
  }
}
