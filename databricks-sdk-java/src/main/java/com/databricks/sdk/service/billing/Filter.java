// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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
 * Structured representation of a filter to be applied to a list of policies. All specified filters
 * will be applied in conjunction.
 */
@Generated
@JsonSerialize(using = Filter.FilterSerializer.class)
@JsonDeserialize(using = Filter.FilterDeserializer.class)
public class Filter {
  /**
   * The policy creator user id to be filtered on. If unspecified, all policies will be returned.
   */
  private Long creatorUserId;

  /**
   * The policy creator user name to be filtered on. If unspecified, all policies will be returned.
   */
  private String creatorUserName;

  /**
   * The partial name of policies to be filtered on. If unspecified, all policies will be returned.
   */
  private String policyName;

  public Filter setCreatorUserId(Long creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

  public Long getCreatorUserId() {
    return creatorUserId;
  }

  public Filter setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public Filter setPolicyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  public String getPolicyName() {
    return policyName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Filter that = (Filter) o;
    return Objects.equals(creatorUserId, that.creatorUserId)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(policyName, that.policyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorUserId, creatorUserName, policyName);
  }

  @Override
  public String toString() {
    return new ToStringer(Filter.class)
        .add("creatorUserId", creatorUserId)
        .add("creatorUserName", creatorUserName)
        .add("policyName", policyName)
        .toString();
  }

  FilterPb toPb() {
    FilterPb pb = new FilterPb();
    pb.setCreatorUserId(creatorUserId);
    pb.setCreatorUserName(creatorUserName);
    pb.setPolicyName(policyName);

    return pb;
  }

  static Filter fromPb(FilterPb pb) {
    Filter model = new Filter();
    model.setCreatorUserId(pb.getCreatorUserId());
    model.setCreatorUserName(pb.getCreatorUserName());
    model.setPolicyName(pb.getPolicyName());

    return model;
  }

  public static class FilterSerializer extends JsonSerializer<Filter> {
    @Override
    public void serialize(Filter value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FilterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FilterDeserializer extends JsonDeserializer<Filter> {
    @Override
    public Filter deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FilterPb pb = mapper.readValue(p, FilterPb.class);
      return Filter.fromPb(pb);
    }
  }
}
