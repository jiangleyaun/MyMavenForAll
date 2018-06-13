package com.leyuan.jiang.pojo.po;

public class Sanctuary {
    private Long id;

    private String sanctuaryNo;

    private String sanctuaryImage;

    private String sanctuaryIco;

    private String name;

    private String address;

    private String busInfo;

    private String contractNumber;

    private String latitude;

    private String leader;

    private String longitude;

    private String phoneNumber;

    private Long organizationId;

    private Long sanctuaryAdminUserId;

    private String passWord;

    private String modeOfTransportation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSanctuaryNo() {
        return sanctuaryNo;
    }

    public void setSanctuaryNo(String sanctuaryNo) {
        this.sanctuaryNo = sanctuaryNo == null ? null : sanctuaryNo.trim();
    }

    public String getSanctuaryImage() {
        return sanctuaryImage;
    }

    public void setSanctuaryImage(String sanctuaryImage) {
        this.sanctuaryImage = sanctuaryImage == null ? null : sanctuaryImage.trim();
    }

    public String getSanctuaryIco() {
        return sanctuaryIco;
    }

    public void setSanctuaryIco(String sanctuaryIco) {
        this.sanctuaryIco = sanctuaryIco == null ? null : sanctuaryIco.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBusInfo() {
        return busInfo;
    }

    public void setBusInfo(String busInfo) {
        this.busInfo = busInfo == null ? null : busInfo.trim();
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber == null ? null : contractNumber.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getSanctuaryAdminUserId() {
        return sanctuaryAdminUserId;
    }

    public void setSanctuaryAdminUserId(Long sanctuaryAdminUserId) {
        this.sanctuaryAdminUserId = sanctuaryAdminUserId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getModeOfTransportation() {
        return modeOfTransportation;
    }

    public void setModeOfTransportation(String modeOfTransportation) {
        this.modeOfTransportation = modeOfTransportation == null ? null : modeOfTransportation.trim();
    }
}