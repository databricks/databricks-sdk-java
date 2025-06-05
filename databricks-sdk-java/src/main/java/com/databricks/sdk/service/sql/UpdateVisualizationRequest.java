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
@JsonSerialize(using = UpdateVisualizationRequest.UpdateVisualizationRequestSerializer.class)
@JsonDeserialize(using = UpdateVisualizationRequest.UpdateVisualizationRequestDeserializer.class)
public class UpdateVisualizationRequest {
  /** */
  private String id;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
   */
  private String updateMask;

  /** */
  private UpdateVisualizationRequestVisualization visualization;

  public UpdateVisualizationRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateVisualizationRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  public UpdateVisualizationRequest setVisualization(
      UpdateVisualizationRequestVisualization visualization) {
    this.visualization = visualization;
    return this;
  }

  public UpdateVisualizationRequestVisualization getVisualization() {
    return visualization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateVisualizationRequest that = (UpdateVisualizationRequest) o;
    return Objects.equals(id, that.id)
        && Objects.equals(updateMask, that.updateMask)
        && Objects.equals(visualization, that.visualization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, updateMask, visualization);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateVisualizationRequest.class)
        .add("id", id)
        .add("updateMask", updateMask)
        .add("visualization", visualization)
        .toString();
  }

  UpdateVisualizationRequestPb toPb() {
    UpdateVisualizationRequestPb pb = new UpdateVisualizationRequestPb();
    pb.setId(id);
    pb.setUpdateMask(updateMask);
    pb.setVisualization(visualization);

    return pb;
  }

  static UpdateVisualizationRequest fromPb(UpdateVisualizationRequestPb pb) {
    UpdateVisualizationRequest model = new UpdateVisualizationRequest();
    model.setId(pb.getId());
    model.setUpdateMask(pb.getUpdateMask());
    model.setVisualization(pb.getVisualization());

    return model;
  }

  public static class UpdateVisualizationRequestSerializer
      extends JsonSerializer<UpdateVisualizationRequest> {
    @Override
    public void serialize(
        UpdateVisualizationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateVisualizationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateVisualizationRequestDeserializer
      extends JsonDeserializer<UpdateVisualizationRequest> {
    @Override
    public UpdateVisualizationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateVisualizationRequestPb pb = mapper.readValue(p, UpdateVisualizationRequestPb.class);
      return UpdateVisualizationRequest.fromPb(pb);
    }
  }
}
