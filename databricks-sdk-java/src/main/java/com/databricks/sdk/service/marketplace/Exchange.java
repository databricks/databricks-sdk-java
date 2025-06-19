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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = Exchange.ExchangeSerializer.class)
@JsonDeserialize(using = Exchange.ExchangeDeserializer.class)
public class Exchange {
  /** */
  private String comment;

  /** */
  private Long createdAt;

  /** */
  private String createdBy;

  /** */
  private Collection<ExchangeFilter> filters;

  /** */
  private String id;

  /** */
  private Collection<ExchangeListing> linkedListings;

  /** */
  private String name;

  /** */
  private Long updatedAt;

  /** */
  private String updatedBy;

  public Exchange setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public Exchange setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public Exchange setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public Exchange setFilters(Collection<ExchangeFilter> filters) {
    this.filters = filters;
    return this;
  }

  public Collection<ExchangeFilter> getFilters() {
    return filters;
  }

  public Exchange setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Exchange setLinkedListings(Collection<ExchangeListing> linkedListings) {
    this.linkedListings = linkedListings;
    return this;
  }

  public Collection<ExchangeListing> getLinkedListings() {
    return linkedListings;
  }

  public Exchange setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Exchange setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public Exchange setUpdatedBy(String updatedBy) {
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
    Exchange that = (Exchange) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(filters, that.filters)
        && Objects.equals(id, that.id)
        && Objects.equals(linkedListings, that.linkedListings)
        && Objects.equals(name, that.name)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment, createdAt, createdBy, filters, id, linkedListings, name, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(Exchange.class)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("filters", filters)
        .add("id", id)
        .add("linkedListings", linkedListings)
        .add("name", name)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }

  ExchangePb toPb() {
    ExchangePb pb = new ExchangePb();
    pb.setComment(comment);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setFilters(filters);
    pb.setId(id);
    pb.setLinkedListings(linkedListings);
    pb.setName(name);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static Exchange fromPb(ExchangePb pb) {
    Exchange model = new Exchange();
    model.setComment(pb.getComment());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setFilters(pb.getFilters());
    model.setId(pb.getId());
    model.setLinkedListings(pb.getLinkedListings());
    model.setName(pb.getName());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class ExchangeSerializer extends JsonSerializer<Exchange> {
    @Override
    public void serialize(Exchange value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExchangePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExchangeDeserializer extends JsonDeserializer<Exchange> {
    @Override
    public Exchange deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExchangePb pb = mapper.readValue(p, ExchangePb.class);
      return Exchange.fromPb(pb);
    }
  }
}
