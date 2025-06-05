// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = ExchangeFilter.ExchangeFilterSerializer.class)
@JsonDeserialize(using = ExchangeFilter.ExchangeFilterDeserializer.class)
public class ExchangeFilter {
  /** */
  private Long createdAt;

  /** */
  private String createdBy;

  /** */
  private String exchangeId;

  /** */
  private ExchangeFilterType filterType;

  /** */
  private String filterValue;

  /** */
  private String id;

  /** */
  private String name;

  /** */
  private Long updatedAt;

  /** */
  private String updatedBy;

  public ExchangeFilter setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ExchangeFilter setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ExchangeFilter setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

  public String getExchangeId() {
    return exchangeId;
  }

  public ExchangeFilter setFilterType(ExchangeFilterType filterType) {
    this.filterType = filterType;
    return this;
  }

  public ExchangeFilterType getFilterType() {
    return filterType;
  }

  public ExchangeFilter setFilterValue(String filterValue) {
    this.filterValue = filterValue;
    return this;
  }

  public String getFilterValue() {
    return filterValue;
  }

  public ExchangeFilter setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ExchangeFilter setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExchangeFilter setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public ExchangeFilter setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeFilter that = (ExchangeFilter) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(exchangeId, that.exchangeId)
        && Objects.equals(filterType, that.filterType)
        && Objects.equals(filterValue, that.filterValue)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, createdBy, exchangeId, filterType, filterValue, id, name, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(ExchangeFilter.class)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("exchangeId", exchangeId)
        .add("filterType", filterType)
        .add("filterValue", filterValue)
        .add("id", id)
        .add("name", name)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }

  ExchangeFilterPb toPb() {
    ExchangeFilterPb pb = new ExchangeFilterPb();
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setExchangeId(exchangeId);
    pb.setFilterType(filterType);
    pb.setFilterValue(filterValue);
    pb.setId(id);
    pb.setName(name);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static ExchangeFilter fromPb(ExchangeFilterPb pb) {
    ExchangeFilter model = new ExchangeFilter();
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setExchangeId(pb.getExchangeId());
    model.setFilterType(pb.getFilterType());
    model.setFilterValue(pb.getFilterValue());
    model.setId(pb.getId());
    model.setName(pb.getName());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class ExchangeFilterSerializer extends JsonSerializer<ExchangeFilter> {
    @Override
    public void serialize(ExchangeFilter value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExchangeFilterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExchangeFilterDeserializer extends JsonDeserializer<ExchangeFilter> {
    @Override
    public ExchangeFilter deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExchangeFilterPb pb = mapper.readValue(p, ExchangeFilterPb.class);
      return ExchangeFilter.fromPb(pb);
    }
  }
}
