package com.databricks.sdk.mixin;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.service.workspace.SecretMetadata;
import com.databricks.sdk.service.workspace.SecretScope;
import com.databricks.sdk.service.workspace.SecretsAPI;

import java.util.List;
import java.util.Base64;
import java.util.ArrayList;

/**
 * Remote equivalent of secrets util.
 */
public class SecretsExt {
    private final SecretsAPI api;

    public SecretsExt() {
        this.api = new SecretsAPI(new ApiClient());
    }

    /**
     * Gets the bytes representation of a secret value for the specified scope and key.
     */
    public byte[] getBytes(String scope, String key) {
        Query query = new Query(scope, key);
        RawResponse raw = this.api.getSecretBytes("/api/2.0/secrets/get", query); // If REST works, else use command execution apis
        return Base64.getDecoder().decode(raw.getValue());
    }

    /**
     * Gets the string representation of a secret value for the specified secrets scope and key.
     */
    public String get(String scope, String key) {
        byte[] val = this.getBytes(scope, key);
        return new String(val);
    }

    /**
     * Lists the metadata for secrets within the specified scope.
     * Transform from SDK dataclass to equivalent Java class.
     */
    public List<SecretMetadata> list(String scope) {
        Iterable<SecretMetadata> secretMetadatas = this.api.listSecrets(scope);
        List<SecretMetadata> secretMetadataList = new ArrayList<>();
        for(SecretMetadata s: secretMetadatas) {
            secretMetadataList.add(s);
        }
        return secretMetadataList;
    }

    /**
     * Lists the available scopes.
     * Transform from SDK dataclass to equivalent Java class.
     */
    public List<SecretScope> listScopes() {
        Iterable<SecretScope> secretScopes = this.api.listScopes();
        List<SecretScope> secretScopeList = new ArrayList<>();
        for(SecretScope s: secretScopes) {
            secretScopeList.add(s);
        }
        return secretScopeList;
    }
}

// TODO: Change the below to input / output of API call or if we decide to go forward with command execution api

class Query {
    private final String scope;
    private final String key;

    public Query(String scope, String key) {
        this.scope = scope;
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }

    public String getScope() {
        return this.scope;
    }
}

class RawResponse {
    private final String value;

    public RawResponse(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

