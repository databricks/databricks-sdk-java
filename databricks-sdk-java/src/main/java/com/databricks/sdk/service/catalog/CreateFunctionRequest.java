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
@JsonSerialize(using = CreateFunctionRequest.CreateFunctionRequestSerializer.class)
@JsonDeserialize(using = CreateFunctionRequest.CreateFunctionRequestDeserializer.class)
public class CreateFunctionRequest {
  /** Partial __FunctionInfo__ specifying the function to be created. */
  private CreateFunction functionInfo;

  public CreateFunctionRequest setFunctionInfo(CreateFunction functionInfo) {
    this.functionInfo = functionInfo;
    return this;
  }

  public CreateFunction getFunctionInfo() {
    return functionInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateFunctionRequest that = (CreateFunctionRequest) o;
    return Objects.equals(functionInfo, that.functionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFunctionRequest.class).add("functionInfo", functionInfo).toString();
  }

  CreateFunctionRequestPb toPb() {
    CreateFunctionRequestPb pb = new CreateFunctionRequestPb();
    pb.setFunctionInfo(functionInfo);

    return pb;
  }

  static CreateFunctionRequest fromPb(CreateFunctionRequestPb pb) {
    CreateFunctionRequest model = new CreateFunctionRequest();
    model.setFunctionInfo(pb.getFunctionInfo());

    return model;
  }

  public static class CreateFunctionRequestSerializer
      extends JsonSerializer<CreateFunctionRequest> {
    @Override
    public void serialize(
        CreateFunctionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateFunctionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateFunctionRequestDeserializer
      extends JsonDeserializer<CreateFunctionRequest> {
    @Override
    public CreateFunctionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateFunctionRequestPb pb = mapper.readValue(p, CreateFunctionRequestPb.class);
      return CreateFunctionRequest.fromPb(pb);
    }
  }
}
