package com.environmental.entity;

import java.util.Date;

public class EnvAllinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.aqi
     *
     * @mbggenerated
     */
    private Integer aqi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.area
     *
     * @mbggenerated
     */
    private String area;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.co
     *
     * @mbggenerated
     */
    private Float co;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.co_24h
     *
     * @mbggenerated
     */
    private Float co24h;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.no2
     *
     * @mbggenerated
     */
    private Float no2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.no2_24h
     *
     * @mbggenerated
     */
    private Float no224h;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.o3
     *
     * @mbggenerated
     */
    private Float o3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.o3_8h
     *
     * @mbggenerated
     */
    private Float o38h;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.o3_8h_24h
     *
     * @mbggenerated
     */
    private Float o38h24h;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.pm10
     *
     * @mbggenerated
     */
    private Float pm10;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.pm2_5
     *
     * @mbggenerated
     */
    private Float pm25;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.pm10_24h
     *
     * @mbggenerated
     */
    private Float pm1024h;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.pm2_5_24h
     *
     * @mbggenerated
     */
    private Float pm2524h;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.position_name
     *
     * @mbggenerated
     */
    private String positionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.primary_pollutant
     *
     * @mbggenerated
     */
    private String primaryPollutant;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.quality
     *
     * @mbggenerated
     */
    private String quality;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.so2
     *
     * @mbggenerated
     */
    private Float so2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.so2_24h
     *
     * @mbggenerated
     */
    private Float so224h;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.station_code
     *
     * @mbggenerated
     */
    private String stationCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.o3_24h
     *
     * @mbggenerated
     */
    private Float o324h;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column env_allinfo.time_point
     *
     * @mbggenerated
     */
    private Date timePoint;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.id
     *
     * @return the value of env_allinfo.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.id
     *
     * @param id the value for env_allinfo.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.aqi
     *
     * @return the value of env_allinfo.aqi
     *
     * @mbggenerated
     */
    public Integer getAqi() {
        return aqi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.aqi
     *
     * @param aqi the value for env_allinfo.aqi
     *
     * @mbggenerated
     */
    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.area
     *
     * @return the value of env_allinfo.area
     *
     * @mbggenerated
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.area
     *
     * @param area the value for env_allinfo.area
     *
     * @mbggenerated
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.co
     *
     * @return the value of env_allinfo.co
     *
     * @mbggenerated
     */
    public Float getCo() {
        return co;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.co
     *
     * @param co the value for env_allinfo.co
     *
     * @mbggenerated
     */
    public void setCo(Float co) {
        this.co = co;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.co_24h
     *
     * @return the value of env_allinfo.co_24h
     *
     * @mbggenerated
     */
    public Float getCo24h() {
        return co24h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.co_24h
     *
     * @param co24h the value for env_allinfo.co_24h
     *
     * @mbggenerated
     */
    public void setCo24h(Float co24h) {
        this.co24h = co24h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.no2
     *
     * @return the value of env_allinfo.no2
     *
     * @mbggenerated
     */
    public Float getNo2() {
        return no2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.no2
     *
     * @param no2 the value for env_allinfo.no2
     *
     * @mbggenerated
     */
    public void setNo2(Float no2) {
        this.no2 = no2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.no2_24h
     *
     * @return the value of env_allinfo.no2_24h
     *
     * @mbggenerated
     */
    public Float getNo224h() {
        return no224h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.no2_24h
     *
     * @param no224h the value for env_allinfo.no2_24h
     *
     * @mbggenerated
     */
    public void setNo224h(Float no224h) {
        this.no224h = no224h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.o3
     *
     * @return the value of env_allinfo.o3
     *
     * @mbggenerated
     */
    public Float getO3() {
        return o3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.o3
     *
     * @param o3 the value for env_allinfo.o3
     *
     * @mbggenerated
     */
    public void setO3(Float o3) {
        this.o3 = o3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.o3_8h
     *
     * @return the value of env_allinfo.o3_8h
     *
     * @mbggenerated
     */
    public Float getO38h() {
        return o38h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.o3_8h
     *
     * @param o38h the value for env_allinfo.o3_8h
     *
     * @mbggenerated
     */
    public void setO38h(Float o38h) {
        this.o38h = o38h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.o3_8h_24h
     *
     * @return the value of env_allinfo.o3_8h_24h
     *
     * @mbggenerated
     */
    public Float getO38h24h() {
        return o38h24h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.o3_8h_24h
     *
     * @param o38h24h the value for env_allinfo.o3_8h_24h
     *
     * @mbggenerated
     */
    public void setO38h24h(Float o38h24h) {
        this.o38h24h = o38h24h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.pm10
     *
     * @return the value of env_allinfo.pm10
     *
     * @mbggenerated
     */
    public Float getPm10() {
        return pm10;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.pm10
     *
     * @param pm10 the value for env_allinfo.pm10
     *
     * @mbggenerated
     */
    public void setPm10(Float pm10) {
        this.pm10 = pm10;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.pm2_5
     *
     * @return the value of env_allinfo.pm2_5
     *
     * @mbggenerated
     */
    public Float getPm25() {
        return pm25;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.pm2_5
     *
     * @param pm25 the value for env_allinfo.pm2_5
     *
     * @mbggenerated
     */
    public void setPm25(Float pm25) {
        this.pm25 = pm25;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.pm10_24h
     *
     * @return the value of env_allinfo.pm10_24h
     *
     * @mbggenerated
     */
    public Float getPm1024h() {
        return pm1024h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.pm10_24h
     *
     * @param pm1024h the value for env_allinfo.pm10_24h
     *
     * @mbggenerated
     */
    public void setPm1024h(Float pm1024h) {
        this.pm1024h = pm1024h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.pm2_5_24h
     *
     * @return the value of env_allinfo.pm2_5_24h
     *
     * @mbggenerated
     */
    public Float getPm2524h() {
        return pm2524h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.pm2_5_24h
     *
     * @param pm2524h the value for env_allinfo.pm2_5_24h
     *
     * @mbggenerated
     */
    public void setPm2524h(Float pm2524h) {
        this.pm2524h = pm2524h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.position_name
     *
     * @return the value of env_allinfo.position_name
     *
     * @mbggenerated
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.position_name
     *
     * @param positionName the value for env_allinfo.position_name
     *
     * @mbggenerated
     */
    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.primary_pollutant
     *
     * @return the value of env_allinfo.primary_pollutant
     *
     * @mbggenerated
     */
    public String getPrimaryPollutant() {
        return primaryPollutant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.primary_pollutant
     *
     * @param primaryPollutant the value for env_allinfo.primary_pollutant
     *
     * @mbggenerated
     */
    public void setPrimaryPollutant(String primaryPollutant) {
        this.primaryPollutant = primaryPollutant == null ? null : primaryPollutant.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.quality
     *
     * @return the value of env_allinfo.quality
     *
     * @mbggenerated
     */
    public String getQuality() {
        return quality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.quality
     *
     * @param quality the value for env_allinfo.quality
     *
     * @mbggenerated
     */
    public void setQuality(String quality) {
        this.quality = quality == null ? null : quality.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.so2
     *
     * @return the value of env_allinfo.so2
     *
     * @mbggenerated
     */
    public Float getSo2() {
        return so2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.so2
     *
     * @param so2 the value for env_allinfo.so2
     *
     * @mbggenerated
     */
    public void setSo2(Float so2) {
        this.so2 = so2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.so2_24h
     *
     * @return the value of env_allinfo.so2_24h
     *
     * @mbggenerated
     */
    public Float getSo224h() {
        return so224h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.so2_24h
     *
     * @param so224h the value for env_allinfo.so2_24h
     *
     * @mbggenerated
     */
    public void setSo224h(Float so224h) {
        this.so224h = so224h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.station_code
     *
     * @return the value of env_allinfo.station_code
     *
     * @mbggenerated
     */
    public String getStationCode() {
        return stationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.station_code
     *
     * @param stationCode the value for env_allinfo.station_code
     *
     * @mbggenerated
     */
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode == null ? null : stationCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.o3_24h
     *
     * @return the value of env_allinfo.o3_24h
     *
     * @mbggenerated
     */
    public Float getO324h() {
        return o324h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.o3_24h
     *
     * @param o324h the value for env_allinfo.o3_24h
     *
     * @mbggenerated
     */
    public void setO324h(Float o324h) {
        this.o324h = o324h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column env_allinfo.time_point
     *
     * @return the value of env_allinfo.time_point
     *
     * @mbggenerated
     */
    public Date getTimePoint() {
        return timePoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column env_allinfo.time_point
     *
     * @param timePoint the value for env_allinfo.time_point
     *
     * @mbggenerated
     */
    public void setTimePoint(Date timePoint) {
        this.timePoint = timePoint;
    }
}