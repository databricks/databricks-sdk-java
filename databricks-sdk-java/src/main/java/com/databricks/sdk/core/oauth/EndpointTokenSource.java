package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndpointTokenSource extends RefreshableTokenSource {
    private static final Logger LOG = LoggerFactory.getLogger(EndpointTokenSource.class);
    private static final String JWT_GRANT_TYPE = "urn:ietf:params:oauth:grant-type:jwt-bearer";
    private static final String GRANT_TYPE_PARAM = "grant_type";
    private static final String AUTHORIZATION_DETAILS_PARAM = "authorization_details";
    private static final String ASSERTION_PARAM = "assertion";

    private final DatabricksOAuthTokenSource cpTokenSource;
    private final String authDetails;
    private final String tokenEndpoint;
    private final HttpClient httpClient;

    public EndpointTokenSource(
            DatabricksOAuthTokenSource cpTokenSource, 
            String authDetails, 
            HttpClient httpClient,
            String tokenEndpoint) {

        validate(cpTokenSource, "ControlPlaneTokenSource");
        validate(authDetails, "AuthDetails");
        validate(httpClient, "HttpClient");
        validate(tokenEndpoint, "TokenEndpoint");

        this.cpTokenSource = cpTokenSource;
        this.authDetails = authDetails;
        this.tokenEndpoint = tokenEndpoint;
        this.httpClient = httpClient;
    }

    private static void validate(Object value, String fieldName) {
        if (value == null) {
            LOG.error("Required parameter '{}' is null", fieldName);
            throw new IllegalArgumentException(
                String.format("Required parameter '%s' cannot be null", fieldName));
        }
        if (value instanceof String && ((String) value).isEmpty()) {
            LOG.error("Required parameter '{}' is empty", fieldName);
            throw new IllegalArgumentException(
                String.format("Required parameter '%s' cannot be empty", fieldName));
        }
    }

    @Override
    protected Token refresh() {
        Token cpToken = cpTokenSource.getToken();
        
        Map<String, String> params = new HashMap<>();
        params.put(GRANT_TYPE_PARAM, JWT_GRANT_TYPE);
        params.put(AUTHORIZATION_DETAILS_PARAM, authDetails);
        params.put(ASSERTION_PARAM, cpToken.getAccessToken());
        
        OAuthResponse oauthResponse;
        try {
            oauthResponse = TokenEndpointClient.requestToken(this.httpClient, this.tokenEndpoint, params);
        } catch (DatabricksException e) {
            LOG.error(
                "Failed to fetch token for endpoint source using {}: {}",
                this.tokenEndpoint,
                e.getMessage(),
                e);
            throw e;
        }

        LocalDateTime expiry = LocalDateTime.now().plusSeconds(oauthResponse.getExpiresIn());
        return new Token(
            oauthResponse.getAccessToken(), 
            oauthResponse.getTokenType(), 
            oauthResponse.getRefreshToken(), 
            expiry);
    }
}
