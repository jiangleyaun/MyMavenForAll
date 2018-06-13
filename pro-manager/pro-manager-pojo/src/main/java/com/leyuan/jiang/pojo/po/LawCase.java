package com.leyuan.jiang.pojo.po;

import java.util.Date;

public class LawCase {
    private Long id;

    private String type;

    private Long respondentId;

    private Long applyId;

    private Long counselorAndMediatorsId;

    private String suitPersonId;

    private String caseNo;

    private Date createDate;

    private Long organizationId;

    private Long agreementBookId;

    private Long videoId;

    private String name;

    private Date caseCompleteTime;

    private String status;

    private Date reserveDate;

    private String areasCode;

    private Long disputeDictId;

    private String dictCode;

    private Date createTime;

    private Date updateTime;

    private String isSend;

    private Boolean isconfirmmb;

    private Boolean isconfirmpro;

    private Boolean isconfirmrep;

    private String tab;

    private String userType;

    private String areasName;

    private String address;

    private String origin;

    private Integer orgCofirm;

    private Long disputesId;

    private Long adjustBookId;

    private Long lawNoDisputeFactId;

    private String isSendNoDf;

    private String isSendJudgle;

    private Long lawJudgleBookId;

    private String isSendLawPromise;

    private String isSendLawMsch;

    private Long lawPromiseId;

    private Long lawMschemeId;

    private Long lawAdjustBookId;

    private Integer suitCount;

    private String mediateTypes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Long getRespondentId() {
        return respondentId;
    }

    public void setRespondentId(Long respondentId) {
        this.respondentId = respondentId;
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public Long getCounselorAndMediatorsId() {
        return counselorAndMediatorsId;
    }

    public void setCounselorAndMediatorsId(Long counselorAndMediatorsId) {
        this.counselorAndMediatorsId = counselorAndMediatorsId;
    }

    public String getSuitPersonId() {
        return suitPersonId;
    }

    public void setSuitPersonId(String suitPersonId) {
        this.suitPersonId = suitPersonId == null ? null : suitPersonId.trim();
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getAgreementBookId() {
        return agreementBookId;
    }

    public void setAgreementBookId(Long agreementBookId) {
        this.agreementBookId = agreementBookId;
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCaseCompleteTime() {
        return caseCompleteTime;
    }

    public void setCaseCompleteTime(Date caseCompleteTime) {
        this.caseCompleteTime = caseCompleteTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
    }

    public String getAreasCode() {
        return areasCode;
    }

    public void setAreasCode(String areasCode) {
        this.areasCode = areasCode == null ? null : areasCode.trim();
    }

    public Long getDisputeDictId() {
        return disputeDictId;
    }

    public void setDisputeDictId(Long disputeDictId) {
        this.disputeDictId = disputeDictId;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend == null ? null : isSend.trim();
    }

    public Boolean getIsconfirmmb() {
        return isconfirmmb;
    }

    public void setIsconfirmmb(Boolean isconfirmmb) {
        this.isconfirmmb = isconfirmmb;
    }

    public Boolean getIsconfirmpro() {
        return isconfirmpro;
    }

    public void setIsconfirmpro(Boolean isconfirmpro) {
        this.isconfirmpro = isconfirmpro;
    }

    public Boolean getIsconfirmrep() {
        return isconfirmrep;
    }

    public void setIsconfirmrep(Boolean isconfirmrep) {
        this.isconfirmrep = isconfirmrep;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab == null ? null : tab.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getAreasName() {
        return areasName;
    }

    public void setAreasName(String areasName) {
        this.areasName = areasName == null ? null : areasName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public Integer getOrgCofirm() {
        return orgCofirm;
    }

    public void setOrgCofirm(Integer orgCofirm) {
        this.orgCofirm = orgCofirm;
    }

    public Long getDisputesId() {
        return disputesId;
    }

    public void setDisputesId(Long disputesId) {
        this.disputesId = disputesId;
    }

    public Long getAdjustBookId() {
        return adjustBookId;
    }

    public void setAdjustBookId(Long adjustBookId) {
        this.adjustBookId = adjustBookId;
    }

    public Long getLawNoDisputeFactId() {
        return lawNoDisputeFactId;
    }

    public void setLawNoDisputeFactId(Long lawNoDisputeFactId) {
        this.lawNoDisputeFactId = lawNoDisputeFactId;
    }

    public String getIsSendNoDf() {
        return isSendNoDf;
    }

    public void setIsSendNoDf(String isSendNoDf) {
        this.isSendNoDf = isSendNoDf == null ? null : isSendNoDf.trim();
    }

    public String getIsSendJudgle() {
        return isSendJudgle;
    }

    public void setIsSendJudgle(String isSendJudgle) {
        this.isSendJudgle = isSendJudgle == null ? null : isSendJudgle.trim();
    }

    public Long getLawJudgleBookId() {
        return lawJudgleBookId;
    }

    public void setLawJudgleBookId(Long lawJudgleBookId) {
        this.lawJudgleBookId = lawJudgleBookId;
    }

    public String getIsSendLawPromise() {
        return isSendLawPromise;
    }

    public void setIsSendLawPromise(String isSendLawPromise) {
        this.isSendLawPromise = isSendLawPromise == null ? null : isSendLawPromise.trim();
    }

    public String getIsSendLawMsch() {
        return isSendLawMsch;
    }

    public void setIsSendLawMsch(String isSendLawMsch) {
        this.isSendLawMsch = isSendLawMsch == null ? null : isSendLawMsch.trim();
    }

    public Long getLawPromiseId() {
        return lawPromiseId;
    }

    public void setLawPromiseId(Long lawPromiseId) {
        this.lawPromiseId = lawPromiseId;
    }

    public Long getLawMschemeId() {
        return lawMschemeId;
    }

    public void setLawMschemeId(Long lawMschemeId) {
        this.lawMschemeId = lawMschemeId;
    }

    public Long getLawAdjustBookId() {
        return lawAdjustBookId;
    }

    public void setLawAdjustBookId(Long lawAdjustBookId) {
        this.lawAdjustBookId = lawAdjustBookId;
    }

    public Integer getSuitCount() {
        return suitCount;
    }

    public void setSuitCount(Integer suitCount) {
        this.suitCount = suitCount;
    }

    public String getMediateTypes() {
        return mediateTypes;
    }

    public void setMediateTypes(String mediateTypes) {
        this.mediateTypes = mediateTypes == null ? null : mediateTypes.trim();
    }
}