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

/** Search listings */
@Generated
@JsonSerialize(using = SearchListingsRequest.SearchListingsRequestSerializer.class)
@JsonDeserialize(using = SearchListingsRequest.SearchListingsRequestDeserializer.class)
public class SearchListingsRequest {
  /** Matches any of the following asset types */
  private Collection<AssetType> assets;

  /** Matches any of the following categories */
  private Collection<Category> categories;

  /** */
  private Boolean isFree;

  /** */
  private Boolean isPrivateExchange;

  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  /** Matches any of the following provider ids */
  private Collection<String> providerIds;

  /** Fuzzy matches query */
  private String query;

  public SearchListingsRequest setAssets(Collection<AssetType> assets) {
    this.assets = assets;
    return this;
  }

  public Collection<AssetType> getAssets() {
    return assets;
  }

  public SearchListingsRequest setCategories(Collection<Category> categories) {
    this.categories = categories;
    return this;
  }

  public Collection<Category> getCategories() {
    return categories;
  }

  public SearchListingsRequest setIsFree(Boolean isFree) {
    this.isFree = isFree;
    return this;
  }

  public Boolean getIsFree() {
    return isFree;
  }

  public SearchListingsRequest setIsPrivateExchange(Boolean isPrivateExchange) {
    this.isPrivateExchange = isPrivateExchange;
    return this;
  }

  public Boolean getIsPrivateExchange() {
    return isPrivateExchange;
  }

  public SearchListingsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public SearchListingsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public SearchListingsRequest setProviderIds(Collection<String> providerIds) {
    this.providerIds = providerIds;
    return this;
  }

  public Collection<String> getProviderIds() {
    return providerIds;
  }

  public SearchListingsRequest setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchListingsRequest that = (SearchListingsRequest) o;
    return Objects.equals(assets, that.assets)
        && Objects.equals(categories, that.categories)
        && Objects.equals(isFree, that.isFree)
        && Objects.equals(isPrivateExchange, that.isPrivateExchange)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(providerIds, that.providerIds)
        && Objects.equals(query, that.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assets, categories, isFree, isPrivateExchange, pageSize, pageToken, providerIds, query);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchListingsRequest.class)
        .add("assets", assets)
        .add("categories", categories)
        .add("isFree", isFree)
        .add("isPrivateExchange", isPrivateExchange)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("providerIds", providerIds)
        .add("query", query)
        .toString();
  }

  SearchListingsRequestPb toPb() {
    SearchListingsRequestPb pb = new SearchListingsRequestPb();
    pb.setAssets(assets);
    pb.setCategories(categories);
    pb.setIsFree(isFree);
    pb.setIsPrivateExchange(isPrivateExchange);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);
    pb.setProviderIds(providerIds);
    pb.setQuery(query);

    return pb;
  }

  static SearchListingsRequest fromPb(SearchListingsRequestPb pb) {
    SearchListingsRequest model = new SearchListingsRequest();
    model.setAssets(pb.getAssets());
    model.setCategories(pb.getCategories());
    model.setIsFree(pb.getIsFree());
    model.setIsPrivateExchange(pb.getIsPrivateExchange());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());
    model.setProviderIds(pb.getProviderIds());
    model.setQuery(pb.getQuery());

    return model;
  }

  public static class SearchListingsRequestSerializer
      extends JsonSerializer<SearchListingsRequest> {
    @Override
    public void serialize(
        SearchListingsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SearchListingsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SearchListingsRequestDeserializer
      extends JsonDeserializer<SearchListingsRequest> {
    @Override
    public SearchListingsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SearchListingsRequestPb pb = mapper.readValue(p, SearchListingsRequestPb.class);
      return SearchListingsRequest.fromPb(pb);
    }
  }
}
