/*
 * BajajHotelManagementLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost5000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for HttpLocalhost5000ApiAdminbAdminloginrequest type.
 */
public class HttpLocalhost5000ApiAdminbAdminloginrequest {
    private String email;
    private String password;

    /**
     * Default constructor.
     */
    public HttpLocalhost5000ApiAdminbAdminloginrequest() {
    }

    /**
     * Initialization constructor.
     * @param  email  String value for email.
     * @param  password  String value for password.
     */
    public HttpLocalhost5000ApiAdminbAdminloginrequest(
            String email,
            String password) {
        this.email = email;
        this.password = password;
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
     * Getter for Password.
     * @return Returns the String
     */
    @JsonGetter("password")
    public String getPassword() {
        return password;
    }

    /**
     * Setter for Password.
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Converts this HttpLocalhost5000ApiAdminbAdminloginrequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "HttpLocalhost5000ApiAdminbAdminloginrequest [" + "email=" + email + ", password="
                + password + "]";
    }

    /**
     * Builds a new {@link HttpLocalhost5000ApiAdminbAdminloginrequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link HttpLocalhost5000ApiAdminbAdminloginrequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(email, password);
        return builder;
    }

    /**
     * Class to build instances of {@link HttpLocalhost5000ApiAdminbAdminloginrequest}.
     */
    public static class Builder {
        private String email;
        private String password;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  email  String value for email.
         * @param  password  String value for password.
         */
        public Builder(String email, String password) {
            this.email = email;
            this.password = password;
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
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Builds a new {@link HttpLocalhost5000ApiAdminbAdminloginrequest} object using the set
         * fields.
         * @return {@link HttpLocalhost5000ApiAdminbAdminloginrequest}
         */
        public HttpLocalhost5000ApiAdminbAdminloginrequest build() {
            return new HttpLocalhost5000ApiAdminbAdminloginrequest(email, password);
        }
    }
}
