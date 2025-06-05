// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = ListInstanceProfilesResponse.ListInstanceProfilesResponseSerializer.class)
@JsonDeserialize(
    using = ListInstanceProfilesResponse.ListInstanceProfilesResponseDeserializer.class)
public class ListInstanceProfilesResponse {
  /** A list of instance profiles that the user can access. */
  private Collection<InstanceProfile> instanceProfiles;

  public ListInstanceProfilesResponse setInstanceProfiles(
      Collection<InstanceProfile> instanceProfiles) {
    this.instanceProfiles = instanceProfiles;
    return this;
  }

  public Collection<InstanceProfile> getInstanceProfiles() {
    return instanceProfiles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListInstanceProfilesResponse that = (ListInstanceProfilesResponse) o;
    return Objects.equals(instanceProfiles, that.instanceProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfiles);
  }

  @Override
  public String toString() {
    return new ToStringer(ListInstanceProfilesResponse.class)
        .add("instanceProfiles", instanceProfiles)
        .toString();
  }

  ListInstanceProfilesResponsePb toPb() {
    ListInstanceProfilesResponsePb pb = new ListInstanceProfilesResponsePb();
    pb.setInstanceProfiles(instanceProfiles);

    return pb;
  }

  static ListInstanceProfilesResponse fromPb(ListInstanceProfilesResponsePb pb) {
    ListInstanceProfilesResponse model = new ListInstanceProfilesResponse();
    model.setInstanceProfiles(pb.getInstanceProfiles());

    return model;
  }

  public static class ListInstanceProfilesResponseSerializer
      extends JsonSerializer<ListInstanceProfilesResponse> {
    @Override
    public void serialize(
        ListInstanceProfilesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListInstanceProfilesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListInstanceProfilesResponseDeserializer
      extends JsonDeserializer<ListInstanceProfilesResponse> {
    @Override
    public ListInstanceProfilesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListInstanceProfilesResponsePb pb = mapper.readValue(p, ListInstanceProfilesResponsePb.class);
      return ListInstanceProfilesResponse.fromPb(pb);
    }
  }
}
