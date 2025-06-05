// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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

/**
 * A representation of all DataPlaneInfo for operations that can be done on a model through Data
 * Plane APIs.
 */
@Generated
@JsonSerialize(using = ModelDataPlaneInfo.ModelDataPlaneInfoSerializer.class)
@JsonDeserialize(using = ModelDataPlaneInfo.ModelDataPlaneInfoDeserializer.class)
public class ModelDataPlaneInfo {
  /** Information required to query DataPlane API 'query' endpoint. */
  private DataPlaneInfo queryInfo;

  public ModelDataPlaneInfo setQueryInfo(DataPlaneInfo queryInfo) {
    this.queryInfo = queryInfo;
    return this;
  }

  public DataPlaneInfo getQueryInfo() {
    return queryInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelDataPlaneInfo that = (ModelDataPlaneInfo) o;
    return Objects.equals(queryInfo, that.queryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelDataPlaneInfo.class).add("queryInfo", queryInfo).toString();
  }

  ModelDataPlaneInfoPb toPb() {
    ModelDataPlaneInfoPb pb = new ModelDataPlaneInfoPb();
    pb.setQueryInfo(queryInfo);

    return pb;
  }

  static ModelDataPlaneInfo fromPb(ModelDataPlaneInfoPb pb) {
    ModelDataPlaneInfo model = new ModelDataPlaneInfo();
    model.setQueryInfo(pb.getQueryInfo());

    return model;
  }

  public static class ModelDataPlaneInfoSerializer extends JsonSerializer<ModelDataPlaneInfo> {
    @Override
    public void serialize(ModelDataPlaneInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ModelDataPlaneInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ModelDataPlaneInfoDeserializer extends JsonDeserializer<ModelDataPlaneInfo> {
    @Override
    public ModelDataPlaneInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ModelDataPlaneInfoPb pb = mapper.readValue(p, ModelDataPlaneInfoPb.class);
      return ModelDataPlaneInfo.fromPb(pb);
    }
  }
}
