// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class GetModelResponse {
  /**
   
   */
  @JsonProperty("registered_model_databricks")
  private ModelDatabricks registeredModelDatabricks;
  
  public GetModelResponse setRegisteredModelDatabricks(ModelDatabricks registeredModelDatabricks) {
    this.registeredModelDatabricks = registeredModelDatabricks;
    return this;
  }

  public ModelDatabricks getRegisteredModelDatabricks() {
    return registeredModelDatabricks;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelResponse that = (GetModelResponse) o;
    return Objects.equals(registeredModelDatabricks, that.registeredModelDatabricks)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredModelDatabricks);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelResponse.class)
      .add("registeredModelDatabricks", registeredModelDatabricks).toString();
  }
}
