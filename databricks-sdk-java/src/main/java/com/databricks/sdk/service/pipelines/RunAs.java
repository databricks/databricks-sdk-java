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

/**
 * Write-only setting, available only in Create/Update calls. Specifies the user or service
 * principal that the pipeline runs as. If not specified, the pipeline runs as the user who created
 * the pipeline.
 *
 * <p>Only `user_name` or `service_principal_name` can be specified. If both are specified, an error
 * is thrown.
 */
@Generated
@JsonSerialize(using = RunAs.RunAsSerializer.class)
@JsonDeserialize(using = RunAs.RunAsDeserializer.class)
public class RunAs {
  /**
   * Application ID of an active service principal. Setting this field requires the
   * `servicePrincipal/user` role.
   */
  private String servicePrincipalName;

  /** The email of an active workspace user. Users can only set this field to their own email. */
  private String userName;

  public RunAs setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public RunAs setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunAs that = (RunAs) o;
    return Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(RunAs.class)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  RunAsPb toPb() {
    RunAsPb pb = new RunAsPb();
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static RunAs fromPb(RunAsPb pb) {
    RunAs model = new RunAs();
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class RunAsSerializer extends JsonSerializer<RunAs> {
    @Override
    public void serialize(RunAs value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunAsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunAsDeserializer extends JsonDeserializer<RunAs> {
    @Override
    public RunAs deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunAsPb pb = mapper.readValue(p, RunAsPb.class);
      return RunAs.fromPb(pb);
    }
  }
}
