/*
 * BajajHotelManagementLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost5000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for HttpLocalhost5000ApiRoomsGetroombyidrequest type.
 */
public class HttpLocalhost5000ApiRoomsGetroombyidrequest {
    private String id;

    /**
     * Default constructor.
     */
    public HttpLocalhost5000ApiRoomsGetroombyidrequest() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     */
    public HttpLocalhost5000ApiRoomsGetroombyidrequest(
            String id) {
        this.id = id;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Converts this HttpLocalhost5000ApiRoomsGetroombyidrequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "HttpLocalhost5000ApiRoomsGetroombyidrequest [" + "id=" + id + "]";
    }

    /**
     * Builds a new {@link HttpLocalhost5000ApiRoomsGetroombyidrequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link HttpLocalhost5000ApiRoomsGetroombyidrequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id);
        return builder;
    }

    /**
     * Class to build instances of {@link HttpLocalhost5000ApiRoomsGetroombyidrequest}.
     */
    public static class Builder {
        private String id;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         */
        public Builder(String id) {
            this.id = id;
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
         * Builds a new {@link HttpLocalhost5000ApiRoomsGetroombyidrequest} object using the set
         * fields.
         * @return {@link HttpLocalhost5000ApiRoomsGetroombyidrequest}
         */
        public HttpLocalhost5000ApiRoomsGetroombyidrequest build() {
            return new HttpLocalhost5000ApiRoomsGetroombyidrequest(id);
        }
    }
}
