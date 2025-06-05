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

/**
 * Write-only setting. Specifies the user or service principal that the job runs as. If not
 * specified, the job runs as the user who created the job.
 *
 * <p>Either `user_name` or `service_principal_name` should be specified. If not, an error is
 * thrown.
 */
@Generated
@JsonSerialize(using = JobRunAs.JobRunAsSerializer.class)
@JsonDeserialize(using = JobRunAs.JobRunAsDeserializer.class)
public class JobRunAs {
  /**
   * Application ID of an active service principal. Setting this field requires the
   * `servicePrincipal/user` role.
   */
  private String servicePrincipalName;

  /**
   * The email of an active workspace user. Non-admin users can only set this field to their own
   * email.
   */
  private String userName;

  public JobRunAs setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public JobRunAs setUserName(String userName) {
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
    JobRunAs that = (JobRunAs) o;
    return Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(JobRunAs.class)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  JobRunAsPb toPb() {
    JobRunAsPb pb = new JobRunAsPb();
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static JobRunAs fromPb(JobRunAsPb pb) {
    JobRunAs model = new JobRunAs();
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class JobRunAsSerializer extends JsonSerializer<JobRunAs> {
    @Override
    public void serialize(JobRunAs value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobRunAsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobRunAsDeserializer extends JsonDeserializer<JobRunAs> {
    @Override
    public JobRunAs deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobRunAsPb pb = mapper.readValue(p, JobRunAsPb.class);
      return JobRunAs.fromPb(pb);
    }
  }
}
