/*
 * BajajHotelManagementLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost5000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for HttpLocalhost5000ApiUsersLogin type.
 */
public class HttpLocalhost5000ApiUsersLogin {
    private String name;
    private String email;
    private boolean isAdmin;
    private String id;

    /**
     * Default constructor.
     */
    public HttpLocalhost5000ApiUsersLogin() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  email  String value for email.
     * @param  isAdmin  boolean value for isAdmin.
     * @param  id  String value for id.
     */
    public HttpLocalhost5000ApiUsersLogin(
            String name,
            String email,
            boolean isAdmin,
            String id) {
        this.name = name;
        this.email = email;
        this.isAdmin = isAdmin;
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Email.
     * @return Returns the String
     */
    @JsonGetter("email")
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for IsAdmin.
     * @return Returns the boolean
     */
    @JsonGetter("isAdmin")
    public boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * Setter for IsAdmin.
     * @param isAdmin Value for boolean
     */
    @JsonSetter("isAdmin")
    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("_id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("_id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Converts this HttpLocalhost5000ApiUsersLogin into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "HttpLocalhost5000ApiUsersLogin [" + "name=" + name + ", email=" + email
                + ", isAdmin=" + isAdmin + ", id=" + id + "]";
    }

    /**
     * Builds a new {@link HttpLocalhost5000ApiUsersLogin.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link HttpLocalhost5000ApiUsersLogin.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, email, isAdmin, id);
        return builder;
    }

    /**
     * Class to build instances of {@link HttpLocalhost5000ApiUsersLogin}.
     */
    public static class Builder {
        private String name;
        private String email;
        private boolean isAdmin;
        private String id;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  email  String value for email.
         * @param  isAdmin  boolean value for isAdmin.
         * @param  id  String value for id.
         */
        public Builder(String name, String email, boolean isAdmin, String id) {
            this.name = name;
            this.email = email;
            this.isAdmin = isAdmin;
            this.id = id;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for isAdmin.
         * @param  isAdmin  boolean value for isAdmin.
         * @return Builder
         */
        public Builder isAdmin(boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link HttpLocalhost5000ApiUsersLogin} object using the set fields.
         * @return {@link HttpLocalhost5000ApiUsersLogin}
         */
        public HttpLocalhost5000ApiUsersLogin build() {
            return new HttpLocalhost5000ApiUsersLogin(name, email, isAdmin, id);
        }
    }
}
