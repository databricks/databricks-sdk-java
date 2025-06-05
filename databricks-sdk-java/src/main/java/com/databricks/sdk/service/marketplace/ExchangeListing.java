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
@JsonSerialize(using = ExchangeListing.ExchangeListingSerializer.class)
@JsonDeserialize(using = ExchangeListing.ExchangeListingDeserializer.class)
public class ExchangeListing {
  /** */
  private Long createdAt;

  /** */
  private String createdBy;

  /** */
  private String exchangeId;

  /** */
  private String exchangeName;

  /** */
  private String id;

  /** */
  private String listingId;

  /** */
  private String listingName;

  public ExchangeListing setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ExchangeListing setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ExchangeListing setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

  public String getExchangeId() {
    return exchangeId;
  }

  public ExchangeListing setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
    return this;
  }

  public String getExchangeName() {
    return exchangeName;
  }

  public ExchangeListing setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ExchangeListing setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public ExchangeListing setListingName(String listingName) {
    this.listingName = listingName;
    return this;
  }

  public String getListingName() {
    return listingName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeListing that = (ExchangeListing) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(exchangeId, that.exchangeId)
        && Objects.equals(exchangeName, that.exchangeName)
        && Objects.equals(id, that.id)
        && Objects.equals(listingId, that.listingId)
        && Objects.equals(listingName, that.listingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, exchangeId, exchangeName, id, listingId, listingName);
  }

  @Override
  public String toString() {
    return new ToStringer(ExchangeListing.class)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("exchangeId", exchangeId)
        .add("exchangeName", exchangeName)
        .add("id", id)
        .add("listingId", listingId)
        .add("listingName", listingName)
        .toString();
  }

  ExchangeListingPb toPb() {
    ExchangeListingPb pb = new ExchangeListingPb();
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setExchangeId(exchangeId);
    pb.setExchangeName(exchangeName);
    pb.setId(id);
    pb.setListingId(listingId);
    pb.setListingName(listingName);

    return pb;
  }

  static ExchangeListing fromPb(ExchangeListingPb pb) {
    ExchangeListing model = new ExchangeListing();
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setExchangeId(pb.getExchangeId());
    model.setExchangeName(pb.getExchangeName());
    model.setId(pb.getId());
    model.setListingId(pb.getListingId());
    model.setListingName(pb.getListingName());

    return model;
  }

  public static class ExchangeListingSerializer extends JsonSerializer<ExchangeListing> {
    @Override
    public void serialize(ExchangeListing value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExchangeListingPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExchangeListingDeserializer extends JsonDeserializer<ExchangeListing> {
    @Override
    public ExchangeListing deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExchangeListingPb pb = mapper.readValue(p, ExchangeListingPb.class);
      return ExchangeListing.fromPb(pb);
    }
  }
}
