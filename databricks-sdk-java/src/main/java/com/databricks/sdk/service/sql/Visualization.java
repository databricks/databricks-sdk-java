// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = Visualization.VisualizationSerializer.class)
@JsonDeserialize(using = Visualization.VisualizationDeserializer.class)
public class Visualization {
  /** The timestamp indicating when the visualization was created. */
  private String createTime;

  /** The display name of the visualization. */
  private String displayName;

  /** UUID identifying the visualization. */
  private String id;

  /** UUID of the query that the visualization is attached to. */
  private String queryId;

  /**
   * The visualization options varies widely from one visualization type to the next and is
   * unsupported. Databricks does not recommend modifying visualization options directly.
   */
  private String serializedOptions;

  /**
   * The visualization query plan varies widely from one visualization type to the next and is
   * unsupported. Databricks does not recommend modifying the visualization query plan directly.
   */
  private String serializedQueryPlan;

  /** The type of visualization: counter, table, funnel, and so on. */
  private String typeValue;

  /** The timestamp indicating when the visualization was updated. */
  private String updateTime;

  public Visualization setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public Visualization setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Visualization setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Visualization setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public Visualization setSerializedOptions(String serializedOptions) {
    this.serializedOptions = serializedOptions;
    return this;
  }

  public String getSerializedOptions() {
    return serializedOptions;
  }

  public Visualization setSerializedQueryPlan(String serializedQueryPlan) {
    this.serializedQueryPlan = serializedQueryPlan;
    return this;
  }

  public String getSerializedQueryPlan() {
    return serializedQueryPlan;
  }

  public Visualization setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public Visualization setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Visualization that = (Visualization) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(serializedOptions, that.serializedOptions)
        && Objects.equals(serializedQueryPlan, that.serializedQueryPlan)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        displayName,
        id,
        queryId,
        serializedOptions,
        serializedQueryPlan,
        typeValue,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Visualization.class)
        .add("createTime", createTime)
        .add("displayName", displayName)
        .add("id", id)
        .add("queryId", queryId)
        .add("serializedOptions", serializedOptions)
        .add("serializedQueryPlan", serializedQueryPlan)
        .add("typeValue", typeValue)
        .add("updateTime", updateTime)
        .toString();
  }

  VisualizationPb toPb() {
    VisualizationPb pb = new VisualizationPb();
    pb.setCreateTime(createTime);
    pb.setDisplayName(displayName);
    pb.setId(id);
    pb.setQueryId(queryId);
    pb.setSerializedOptions(serializedOptions);
    pb.setSerializedQueryPlan(serializedQueryPlan);
    pb.setType(typeValue);
    pb.setUpdateTime(updateTime);

    return pb;
  }

  static Visualization fromPb(VisualizationPb pb) {
    Visualization model = new Visualization();
    model.setCreateTime(pb.getCreateTime());
    model.setDisplayName(pb.getDisplayName());
    model.setId(pb.getId());
    model.setQueryId(pb.getQueryId());
    model.setSerializedOptions(pb.getSerializedOptions());
    model.setSerializedQueryPlan(pb.getSerializedQueryPlan());
    model.setType(pb.getType());
    model.setUpdateTime(pb.getUpdateTime());

    return model;
  }

  public static class VisualizationSerializer extends JsonSerializer<Visualization> {
    @Override
    public void serialize(Visualization value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      VisualizationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class VisualizationDeserializer extends JsonDeserializer<Visualization> {
    @Override
    public Visualization deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      VisualizationPb pb = mapper.readValue(p, VisualizationPb.class);
      return Visualization.fromPb(pb);
    }
  }
}
