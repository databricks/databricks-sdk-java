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
import java.util.Objects;

@Generated
@JsonSerialize(using = PowerBiModel.PowerBiModelSerializer.class)
@JsonDeserialize(using = PowerBiModel.PowerBiModelDeserializer.class)
public class PowerBiModel {
  /** How the published Power BI model authenticates to Databricks */
  private AuthenticationMethod authenticationMethod;

  /** The name of the Power BI model */
  private String modelName;

  /** Whether to overwrite existing Power BI models */
  private Boolean overwriteExisting;

  /** The default storage mode of the Power BI model */
  private StorageMode storageMode;

  /** The name of the Power BI workspace of the model */
  private String workspaceName;

  public PowerBiModel setAuthenticationMethod(AuthenticationMethod authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

  public AuthenticationMethod getAuthenticationMethod() {
    return authenticationMethod;
  }

  public PowerBiModel setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public PowerBiModel setOverwriteExisting(Boolean overwriteExisting) {
    this.overwriteExisting = overwriteExisting;
    return this;
  }

  public Boolean getOverwriteExisting() {
    return overwriteExisting;
  }

  public PowerBiModel setStorageMode(StorageMode storageMode) {
    this.storageMode = storageMode;
    return this;
  }

  public StorageMode getStorageMode() {
    return storageMode;
  }

  public PowerBiModel setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
  }

  public String getWorkspaceName() {
    return workspaceName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PowerBiModel that = (PowerBiModel) o;
    return Objects.equals(authenticationMethod, that.authenticationMethod)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(overwriteExisting, that.overwriteExisting)
        && Objects.equals(storageMode, that.storageMode)
        && Objects.equals(workspaceName, that.workspaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authenticationMethod, modelName, overwriteExisting, storageMode, workspaceName);
  }

  @Override
  public String toString() {
    return new ToStringer(PowerBiModel.class)
        .add("authenticationMethod", authenticationMethod)
        .add("modelName", modelName)
        .add("overwriteExisting", overwriteExisting)
        .add("storageMode", storageMode)
        .add("workspaceName", workspaceName)
        .toString();
  }

  PowerBiModelPb toPb() {
    PowerBiModelPb pb = new PowerBiModelPb();
    pb.setAuthenticationMethod(authenticationMethod);
    pb.setModelName(modelName);
    pb.setOverwriteExisting(overwriteExisting);
    pb.setStorageMode(storageMode);
    pb.setWorkspaceName(workspaceName);

    return pb;
  }

  static PowerBiModel fromPb(PowerBiModelPb pb) {
    PowerBiModel model = new PowerBiModel();
    model.setAuthenticationMethod(pb.getAuthenticationMethod());
    model.setModelName(pb.getModelName());
    model.setOverwriteExisting(pb.getOverwriteExisting());
    model.setStorageMode(pb.getStorageMode());
    model.setWorkspaceName(pb.getWorkspaceName());

    return model;
  }

  public static class PowerBiModelSerializer extends JsonSerializer<PowerBiModel> {
    @Override
    public void serialize(PowerBiModel value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PowerBiModelPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PowerBiModelDeserializer extends JsonDeserializer<PowerBiModel> {
    @Override
    public PowerBiModel deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PowerBiModelPb pb = mapper.readValue(p, PowerBiModelPb.class);
      return PowerBiModel.fromPb(pb);
    }
  }
}
