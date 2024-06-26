# ActivitypubApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activitypubPerson**](ActivitypubApi.md#activitypubPerson) | **GET** /activitypub/user-id/{user-id} | Returns the Person actor for a user
[**activitypubPersonInbox**](ActivitypubApi.md#activitypubPersonInbox) | **POST** /activitypub/user-id/{user-id}/inbox | Send to the inbox

<a name="activitypubPerson"></a>
# **activitypubPerson**
> ActivityPub activitypubPerson(userId)

Returns the Person actor for a user

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.ActivitypubApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

ActivitypubApi apiInstance = new ActivitypubApi();
Integer userId = 56; // Integer | user ID of the user
try {
    ActivityPub result = apiInstance.activitypubPerson(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitypubApi#activitypubPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| user ID of the user |

### Return type

[**ActivityPub**](ActivityPub.md)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="activitypubPersonInbox"></a>
# **activitypubPersonInbox**
> activitypubPersonInbox(userId)

Send to the inbox

### Example
```java
// Import classes:
//import io.github.constasj.gitea.ApiClient;
//import io.github.constasj.gitea.ApiException;
//import io.github.constasj.gitea.Configuration;
//import io.github.constasj.gitea.auth.*;
//import io.github.constasj.gitea.api.ActivitypubApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AccessToken
ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
AccessToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AccessToken.setApiKeyPrefix("Token");

// Configure API key authorization: AuthorizationHeaderToken
ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
AuthorizationHeaderToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationHeaderToken.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: SudoHeader
ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
SudoHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoHeader.setApiKeyPrefix("Token");

// Configure API key authorization: SudoParam
ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
SudoParam.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SudoParam.setApiKeyPrefix("Token");

// Configure API key authorization: TOTPHeader
ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
TOTPHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TOTPHeader.setApiKeyPrefix("Token");

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

ActivitypubApi apiInstance = new ActivitypubApi();
Integer userId = 56; // Integer | user ID of the user
try {
    apiInstance.activitypubPersonInbox(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitypubApi#activitypubPersonInbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| user ID of the user |

### Return type

null (empty response body)

### Authorization

[AccessToken](../README.md#AccessToken)[AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken)[BasicAuth](../README.md#BasicAuth)[SudoHeader](../README.md#SudoHeader)[SudoParam](../README.md#SudoParam)[TOTPHeader](../README.md#TOTPHeader)[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

