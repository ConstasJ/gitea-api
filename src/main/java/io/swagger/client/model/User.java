/*
 * Gitea API
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.21.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * User represents a user
 */
@Schema(description = "User represents a user")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class User {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("avatar_url")
  private String avatarUrl = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("followers_count")
  private Long followersCount = null;

  @SerializedName("following_count")
  private Long followingCount = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("is_admin")
  private Boolean isAdmin = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("last_login")
  private OffsetDateTime lastLogin = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("login")
  private String login = null;

  @SerializedName("login_name")
  private String loginName = "empty";

  @SerializedName("prohibit_login")
  private Boolean prohibitLogin = null;

  @SerializedName("restricted")
  private Boolean restricted = null;

  @SerializedName("starred_repos_count")
  private Long starredReposCount = null;

  @SerializedName("visibility")
  private String visibility = null;

  @SerializedName("website")
  private String website = null;

  public User active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Is user active
   * @return active
  **/
  @Schema(description = "Is user active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public User avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * URL to the user&#x27;s avatar
   * @return avatarUrl
  **/
  @Schema(description = "URL to the user's avatar")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public User created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public User description(String description) {
    this.description = description;
    return this;
  }

   /**
   * the user&#x27;s description
   * @return description
  **/
  @Schema(description = "the user's description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User followersCount(Long followersCount) {
    this.followersCount = followersCount;
    return this;
  }

   /**
   * user counts
   * @return followersCount
  **/
  @Schema(description = "user counts")
  public Long getFollowersCount() {
    return followersCount;
  }

  public void setFollowersCount(Long followersCount) {
    this.followersCount = followersCount;
  }

  public User followingCount(Long followingCount) {
    this.followingCount = followingCount;
    return this;
  }

   /**
   * Get followingCount
   * @return followingCount
  **/
  @Schema(description = "")
  public Long getFollowingCount() {
    return followingCount;
  }

  public void setFollowingCount(Long followingCount) {
    this.followingCount = followingCount;
  }

  public User fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * the user&#x27;s full name
   * @return fullName
  **/
  @Schema(description = "the user's full name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public User id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * the user&#x27;s id
   * @return id
  **/
  @Schema(description = "the user's id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Is the user an administrator
   * @return isAdmin
  **/
  @Schema(description = "Is the user an administrator")
  public Boolean isIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public User language(String language) {
    this.language = language;
    return this;
  }

   /**
   * User locale
   * @return language
  **/
  @Schema(description = "User locale")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public User lastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @Schema(description = "")
  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }

  public User location(String location) {
    this.location = location;
    return this;
  }

   /**
   * the user&#x27;s location
   * @return location
  **/
  @Schema(description = "the user's location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public User login(String login) {
    this.login = login;
    return this;
  }

   /**
   * the user&#x27;s username
   * @return login
  **/
  @Schema(description = "the user's username")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public User loginName(String loginName) {
    this.loginName = loginName;
    return this;
  }

   /**
   * the user&#x27;s authentication sign-in name.
   * @return loginName
  **/
  @Schema(description = "the user's authentication sign-in name.")
  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public User prohibitLogin(Boolean prohibitLogin) {
    this.prohibitLogin = prohibitLogin;
    return this;
  }

   /**
   * Is user login prohibited
   * @return prohibitLogin
  **/
  @Schema(description = "Is user login prohibited")
  public Boolean isProhibitLogin() {
    return prohibitLogin;
  }

  public void setProhibitLogin(Boolean prohibitLogin) {
    this.prohibitLogin = prohibitLogin;
  }

  public User restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

   /**
   * Is user restricted
   * @return restricted
  **/
  @Schema(description = "Is user restricted")
  public Boolean isRestricted() {
    return restricted;
  }

  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  public User starredReposCount(Long starredReposCount) {
    this.starredReposCount = starredReposCount;
    return this;
  }

   /**
   * Get starredReposCount
   * @return starredReposCount
  **/
  @Schema(description = "")
  public Long getStarredReposCount() {
    return starredReposCount;
  }

  public void setStarredReposCount(Long starredReposCount) {
    this.starredReposCount = starredReposCount;
  }

  public User visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * User visibility level option: public, limited, private
   * @return visibility
  **/
  @Schema(description = "User visibility level option: public, limited, private")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public User website(String website) {
    this.website = website;
    return this;
  }

   /**
   * the user&#x27;s website
   * @return website
  **/
  @Schema(description = "the user's website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.active, user.active) &&
        Objects.equals(this.avatarUrl, user.avatarUrl) &&
        Objects.equals(this.created, user.created) &&
        Objects.equals(this.description, user.description) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.followersCount, user.followersCount) &&
        Objects.equals(this.followingCount, user.followingCount) &&
        Objects.equals(this.fullName, user.fullName) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.isAdmin, user.isAdmin) &&
        Objects.equals(this.language, user.language) &&
        Objects.equals(this.lastLogin, user.lastLogin) &&
        Objects.equals(this.location, user.location) &&
        Objects.equals(this.login, user.login) &&
        Objects.equals(this.loginName, user.loginName) &&
        Objects.equals(this.prohibitLogin, user.prohibitLogin) &&
        Objects.equals(this.restricted, user.restricted) &&
        Objects.equals(this.starredReposCount, user.starredReposCount) &&
        Objects.equals(this.visibility, user.visibility) &&
        Objects.equals(this.website, user.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, avatarUrl, created, description, email, followersCount, followingCount, fullName, id, isAdmin, language, lastLogin, location, login, loginName, prohibitLogin, restricted, starredReposCount, visibility, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
    sb.append("    followingCount: ").append(toIndentedString(followingCount)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    loginName: ").append(toIndentedString(loginName)).append("\n");
    sb.append("    prohibitLogin: ").append(toIndentedString(prohibitLogin)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    starredReposCount: ").append(toIndentedString(starredReposCount)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}