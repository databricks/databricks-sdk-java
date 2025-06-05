// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = WorkspaceBinding.WorkspaceBindingSerializer.class)
@JsonDeserialize(using = WorkspaceBinding.WorkspaceBindingDeserializer.class)
public class WorkspaceBinding {
  /** One of READ_WRITE/READ_ONLY. Default is READ_WRITE. */
  private WorkspaceBindingBindingType bindingType;

  /** Required */
  private Long workspaceId;

  public WorkspaceBinding setBindingType(WorkspaceBindingBindingType bindingType) {
    this.bindingType = bindingType;
    return this;
  }

  public WorkspaceBindingBindingType getBindingType() {
    return bindingType;
  }

  public WorkspaceBinding setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceBinding that = (WorkspaceBinding) o;
    return Objects.equals(bindingType, that.bindingType)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindingType, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceBinding.class)
        .add("bindingType", bindingType)
        .add("workspaceId", workspaceId)
        .toString();
  }

  WorkspaceBindingPb toPb() {
    WorkspaceBindingPb pb = new WorkspaceBindingPb();
    pb.setBindingType(bindingType);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static WorkspaceBinding fromPb(WorkspaceBindingPb pb) {
    WorkspaceBinding model = new WorkspaceBinding();
    model.setBindingType(pb.getBindingType());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class WorkspaceBindingSerializer extends JsonSerializer<WorkspaceBinding> {
    @Override
    public void serialize(WorkspaceBinding value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WorkspaceBindingPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WorkspaceBindingDeserializer extends JsonDeserializer<WorkspaceBinding> {
    @Override
    public WorkspaceBinding deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WorkspaceBindingPb pb = mapper.readValue(p, WorkspaceBindingPb.class);
      return WorkspaceBinding.fromPb(pb);
    }
  }
}
