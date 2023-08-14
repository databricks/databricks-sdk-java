package com.databricks.sdk.mixin;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.service.files.DbfsService;
import com.databricks.sdk.service.workspace.*;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/** Remote equivalent of secrets util. */
public class SecretsExt extends SecretsAPI{

  public SecretsExt(ApiClient apiClient) {
    super(apiClient);
  }

  public SecretsExt(SecretsService mock) {
    super(mock);
  }

  /** Gets the bytes representation of a secret value for the specified scope and key. */
  public byte[] getBytes(String scope, String key) {
    GetSecretResponse response = this.getSecret(scope, key);
    return Base64.getDecoder().decode(response.getValue());
  }

  /** Gets the string representation of a secret value for the specified secrets scope and key. */
  public String get(String scope, String key) {
    byte[] val = this.getBytes(scope, key);
    return new String(val);
  }

  /**
   * Lists the metadata for secrets within the specified scope. Transform from SDK dataclass to
   * equivalent Java class.
   */
  public List<SecretMetadata> list(String scope) {
    Iterable<SecretMetadata> secretMetadatas = this.listSecrets(scope);
    List<SecretMetadata> secretMetadataList = new ArrayList<>();
    for (SecretMetadata s : secretMetadatas) {
      secretMetadataList.add(s);
    }
    return secretMetadataList;
  }

  /** Lists the available scopes. Transform from SDK dataclass to equivalent Java class. */
  public List<SecretScope> listScopes() {
    Iterable<SecretScope> secretScopes = this.listScopes();
    List<SecretScope> secretScopeList = new ArrayList<>();
    for (SecretScope s : secretScopes) {
      secretScopeList.add(s);
    }
    return secretScopeList;
  }
}
