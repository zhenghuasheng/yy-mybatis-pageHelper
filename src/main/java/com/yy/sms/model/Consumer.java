package com.yy.sms.model;

import java.io.Serializable;

public class Consumer implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_consumer.id
     *
     * @mbggenerated Fri Jan 06 10:41:59 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_consumer.memberName
     *
     * @mbggenerated Fri Jan 06 10:41:59 CST 2017
     */
    private String membername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_consumer.memberId
     *
     * @mbggenerated Fri Jan 06 10:41:59 CST 2017
     */
    private String memberid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_consumer.memberIp
     *
     * @mbggenerated Fri Jan 06 10:41:59 CST 2017
     */
    private String memberip;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_consumer.id
     *
     * @return the value of t_consumer.id
     *
     * @mbggenerated Fri Jan 06 10:41:59 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_consumer.id
     *
     * @param id the value for t_consumer.id
     *
     * @mbggenerated Fri Jan 06 10:41:59 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_consumer.memberName
     *
     * @return the value of t_consumer.memberName
     *
     * @mbggenerated Fri Jan 06 10:41:59 CST 2017
     */
    public String getMembername() {
        return membername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_consumer.memberName
     *
     * @param membername the value for t_consumer.memberName
     *
     * @mbggenerated Fri Jan 06 10:41:59 CST 2017
     */
    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_consumer.memberId
     *
     * @return the value of t_consumer.memberId
     *
     * @mbggenerated Fri Jan 06 10:41:59 CST 2017
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_consumer.memberId
     *
     * @param memberid the value for t_consumer.memberId
     *
     * @mbggenerated Fri Jan 06 10:41:59 CST 2017
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_consumer.memberIp
     *
     * @return the value of t_consumer.memberIp
     *
     * @mbggenerated Fri Jan 06 10:41:59 CST 2017
     */
    public String getMemberip() {
        return memberip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_consumer.memberIp
     *
     * @param memberip the value for t_consumer.memberIp
     *
     * @mbggenerated Fri Jan 06 10:41:59 CST 2017
     */
    public void setMemberip(String memberip) {
        this.memberip = memberip == null ? null : memberip.trim();
    }
}