/*
 * BajajHotelManagementLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost5000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Currentbooking3 type.
 */
public class Currentbooking3 {
    private String bookingid;
    private String fromdate;
    private String todate;
    private String userid;
    private String status;

    /**
     * Default constructor.
     */
    public Currentbooking3() {
    }

    /**
     * Initialization constructor.
     * @param  bookingid  String value for bookingid.
     * @param  fromdate  String value for fromdate.
     * @param  todate  String value for todate.
     * @param  userid  String value for userid.
     * @param  status  String value for status.
     */
    public Currentbooking3(
            String bookingid,
            String fromdate,
            String todate,
            String userid,
            String status) {
        this.bookingid = bookingid;
        this.fromdate = fromdate;
        this.todate = todate;
        this.userid = userid;
        this.status = status;
    }

    /**
     * Getter for Bookingid.
     * @return Returns the String
     */
    @JsonGetter("bookingid")
    public String getBookingid() {
        return bookingid;
    }

    /**
     * Setter for Bookingid.
     * @param bookingid Value for String
     */
    @JsonSetter("bookingid")
    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

    /**
     * Getter for Fromdate.
     * @return Returns the String
     */
    @JsonGetter("fromdate")
    public String getFromdate() {
        return fromdate;
    }

    /**
     * Setter for Fromdate.
     * @param fromdate Value for String
     */
    @JsonSetter("fromdate")
    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    /**
     * Getter for Todate.
     * @return Returns the String
     */
    @JsonGetter("todate")
    public String getTodate() {
        return todate;
    }

    /**
     * Setter for Todate.
     * @param todate Value for String
     */
    @JsonSetter("todate")
    public void setTodate(String todate) {
        this.todate = todate;
    }

    /**
     * Getter for Userid.
     * @return Returns the String
     */
    @JsonGetter("userid")
    public String getUserid() {
        return userid;
    }

    /**
     * Setter for Userid.
     * @param userid Value for String
     */
    @JsonSetter("userid")
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Converts this Currentbooking3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Currentbooking3 [" + "bookingid=" + bookingid + ", fromdate=" + fromdate
                + ", todate=" + todate + ", userid=" + userid + ", status=" + status + "]";
    }

    /**
     * Builds a new {@link Currentbooking3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Currentbooking3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(bookingid, fromdate, todate, userid, status);
        return builder;
    }

    /**
     * Class to build instances of {@link Currentbooking3}.
     */
    public static class Builder {
        private String bookingid;
        private String fromdate;
        private String todate;
        private String userid;
        private String status;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  bookingid  String value for bookingid.
         * @param  fromdate  String value for fromdate.
         * @param  todate  String value for todate.
         * @param  userid  String value for userid.
         * @param  status  String value for status.
         */
        public Builder(String bookingid, String fromdate, String todate, String userid,
                String status) {
            this.bookingid = bookingid;
            this.fromdate = fromdate;
            this.todate = todate;
            this.userid = userid;
            this.status = status;
        }

        /**
         * Setter for bookingid.
         * @param  bookingid  String value for bookingid.
         * @return Builder
         */
        public Builder bookingid(String bookingid) {
            this.bookingid = bookingid;
            return this;
        }

        /**
         * Setter for fromdate.
         * @param  fromdate  String value for fromdate.
         * @return Builder
         */
        public Builder fromdate(String fromdate) {
            this.fromdate = fromdate;
            return this;
        }

        /**
         * Setter for todate.
         * @param  todate  String value for todate.
         * @return Builder
         */
        public Builder todate(String todate) {
            this.todate = todate;
            return this;
        }

        /**
         * Setter for userid.
         * @param  userid  String value for userid.
         * @return Builder
         */
        public Builder userid(String userid) {
            this.userid = userid;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link Currentbooking3} object using the set fields.
         * @return {@link Currentbooking3}
         */
        public Currentbooking3 build() {
            return new Currentbooking3(bookingid, fromdate, todate, userid, status);
        }
    }
}
