/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author bonay
 */
public class Record {
    
    private String username = "";
    private String activity = "";
    private String account_name = "";
    private String start_time = "";
    private String end_time = "";
    private String aht = "";
    private String remarks = "";
    private String volume = "";
    private String process_name = "";

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the activity
     */
    public String getActivity() {
        return activity;
    }

    /**
     * @param activity the activity to set
     */
    public void setActivity(String activity) {
        this.activity = activity;
    }

    /**
     * @return the account_name
     */
    public String getAccount_name() {
        return account_name;
    }

    /**
     * @param account_name the account_name to set
     */
    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    /**
     * @return the start_time
     */
    public String getStart_time() {
        return start_time;
    }

    /**
     * @param start_time the start_time to set
     */
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    /**
     * @return the end_time
     */
    public String getEnd_time() {
        return end_time;
    }

    /**
     * @param end_time the end_time to set
     */
    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    /**
     * @return the aht
     */
    public String getAht() {
        return aht;
    }

    /**
     * @param aht the aht to set
     */
    public void setAht(String aht) {
        this.aht = aht;
    }

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * @return the process_name
     */
    public String getProcess_name() {
        return process_name;
    }

    /**
     * @param process_name the process_name to set
     */
    public void setProcess_name(String process_name) {
        this.process_name = process_name;
    }
}
