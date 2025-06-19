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
@JsonSerialize(using = UpdateStateInfo.UpdateStateInfoSerializer.class)
@JsonDeserialize(using = UpdateStateInfo.UpdateStateInfoDeserializer.class)
public class UpdateStateInfo {
  /** */
  private String creationTime;

  /** The update state. */
  private UpdateStateInfoState state;

  /** */
  private String updateId;

  public UpdateStateInfo setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public UpdateStateInfo setState(UpdateStateInfoState state) {
    this.state = state;
    return this;
  }

  public UpdateStateInfoState getState() {
    return state;
  }

  public UpdateStateInfo setUpdateId(String updateId) {
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
    UpdateStateInfo that = (UpdateStateInfo) o;
    return Objects.equals(creationTime, that.creationTime)
        && Objects.equals(state, that.state)
        && Objects.equals(updateId, that.updateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, state, updateId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateStateInfo.class)
        .add("creationTime", creationTime)
        .add("state", state)
        .add("updateId", updateId)
        .toString();
  }

  UpdateStateInfoPb toPb() {
    UpdateStateInfoPb pb = new UpdateStateInfoPb();
    pb.setCreationTime(creationTime);
    pb.setState(state);
    pb.setUpdateId(updateId);

    return pb;
  }

  static UpdateStateInfo fromPb(UpdateStateInfoPb pb) {
    UpdateStateInfo model = new UpdateStateInfo();
    model.setCreationTime(pb.getCreationTime());
    model.setState(pb.getState());
    model.setUpdateId(pb.getUpdateId());

    return model;
  }

  public static class UpdateStateInfoSerializer extends JsonSerializer<UpdateStateInfo> {
    @Override
    public void serialize(UpdateStateInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateStateInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateStateInfoDeserializer extends JsonDeserializer<UpdateStateInfo> {
    @Override
    public UpdateStateInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateStateInfoPb pb = mapper.readValue(p, UpdateStateInfoPb.class);
      return UpdateStateInfo.fromPb(pb);
    }
  }
}
