package com.easybusiness.attendancepersistence.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_MASTER")
public class EmployeeMaster {

    @Id
    @Column(name = "EB_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ebId;

    @Column(name = "EB_FIXED_ID")
    private String ebFixedId;

    @Column(name = "EB_NO")
    private String ebNo;
    
    @Column(name = "WRK_NAME")
    private String wrkName;
    
    @Column(name = "DATE_OF_BIRTH")
    private String dateOfBirth;
    
    @Column(name = "SEX")
    private String sex;
    
    @Column(name = "FATHER_HUSBAND_NAME")
    private String fatherHusbandName;
    
    @Column(name = "RELIGION")
    private String religion;
    
    @Column(name = "DEPT_ID")
    private String deptId;
    
    @Column(name = "OCCU_ID")
    private String occuId;
    
    @Column(name = "DATE_OF_JOINING")
    private String dateOfJoining;
    
    @Column(name = "DATE_OF_PF_JOINING")
    private String dateOfPFjoining;
    
    @Column(name = "ACTIVE")
    private String active;
    
    @Column(name = "DATE_OF_INACTIVE")
    private String dateOfInactive;

    @Column(name = "CATA_ID")
    private String cataId;
    
    @Column(name = "WORKING_RELEY")
    private String workingReley;
    
    @Column(name = "QUARTER")
    private String quarter;
    
    @Column(name = "QUARTER_NO")
    private String quarterNo;
    
    @Column(name = "ESI_MEMBER")
    private String esiMember;
    
    @Column(name = "PF_MEMBER")
    private String pfMember;
    
    @Column(name = "FPF_MEMBER")
    private String fpfMember;
    
    @Column(name = "ESI_NO")
    private String esiNo;
    
    @Column(name = "PF_NO")
    private String pfNo;
    
    @Column(name = "FPF_NO")
    private String fpfNo;
    
    @Column(name = "EDUCATION")
    private String education;

    
    @Column(name = "EDUCATION_READ")
    private String educationRead;

    @Column(name = "EDUCATION_WRITE")
    private String educationWrite;
    
    @Column(name = "PREV_EMPLOYMENT")
    private String previousEmployment;
    
    @Column(name = "IDENTICAL_MARKS")
    private String identicalMarks;
    
    @Column(name = "PERMANENT_ADD1")
    private String permAddress1;
    
    @Column(name = "PERMANENT_ADD2")
    private String permAddress2;
    
    @Column(name = "PERMANENT_ADD3")
    private String permAddress3;
    
    @Column(name = "PERMANENT_ADD4")
    private String permAddress4;
    
    @Column(name = "LOCAL_ADD1")
    private String localAddress1;
    
    @Column(name = "LOCAL_ADD2")
    private String localAddress2;
    
    @Column(name = "LOCAL_ADD3")
    private String localAddress3;
    
    @Column(name = "LOCAL_ADD4")
    private String localAddress4;

    @Column(name = "PHONE_NO")
    private String phoneNumber;

    @Column(name = "MOBILE_NO")
    private String mobileNumber;
    
    @Column(name = "OFFDAY")
    private String offday;
    
    @Column(name = "PHOTO_DIR")
    private String photoDir;
    
    @Column(name = "UPDATED")
    private String updated;
    
    @Column(name = "USER_ID")
    private String userId;
    
    @Column(name = "OCCU_CODE")
    private String occuCode;
    
    @Column(name = "WRK_TYPE")
    private String workType;
    
    @Column(name = "PHOTOFILE")
    private String photoFile;
    
    @Column(name = "CHK_OLD")
    private String checkOld;
    
    @Column(name = "OLD_EB")
    private String oldEB;
    


    public EmployeeMaster() {
	super();
    }



    public String getEbId() {
        return ebId;
    }



    public void setEbId(String ebId) {
        this.ebId = ebId;
    }



    public String getEbFixedId() {
        return ebFixedId;
    }



    public void setEbFixedId(String ebFixedId) {
        this.ebFixedId = ebFixedId;
    }



    public String getEbNo() {
        return ebNo;
    }



    public void setEbNo(String ebNo) {
        this.ebNo = ebNo;
    }



    public String getWrkName() {
        return wrkName;
    }



    public void setWrkName(String wrkName) {
        this.wrkName = wrkName;
    }



    public String getDateOfBirth() {
        return dateOfBirth;
    }



    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    public String getSex() {
        return sex;
    }



    public void setSex(String sex) {
        this.sex = sex;
    }



    public String getFatherHusbandName() {
        return fatherHusbandName;
    }



    public void setFatherHusbandName(String fatherHusbandName) {
        this.fatherHusbandName = fatherHusbandName;
    }



    public String getReligion() {
        return religion;
    }



    public void setReligion(String religion) {
        this.religion = religion;
    }



    public String getDeptId() {
        return deptId;
    }



    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }



    public String getOccuId() {
        return occuId;
    }



    public void setOccuId(String occuId) {
        this.occuId = occuId;
    }



    public String getDateOfJoining() {
        return dateOfJoining;
    }



    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }



    public String getDateOfPFjoining() {
        return dateOfPFjoining;
    }



    public void setDateOfPFjoining(String dateOfPFjoining) {
        this.dateOfPFjoining = dateOfPFjoining;
    }



    public String getActive() {
        return active;
    }



    public void setActive(String active) {
        this.active = active;
    }



    public String getDateOfInactive() {
        return dateOfInactive;
    }



    public void setDateOfInactive(String dateOfInactive) {
        this.dateOfInactive = dateOfInactive;
    }



    public String getCataId() {
        return cataId;
    }



    public void setCataId(String cataId) {
        this.cataId = cataId;
    }



    public String getWorkingReley() {
        return workingReley;
    }



    public void setWorkingReley(String workingReley) {
        this.workingReley = workingReley;
    }



    public String getQuarter() {
        return quarter;
    }



    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }



    public String getQuarterNo() {
        return quarterNo;
    }



    public void setQuarterNo(String quarterNo) {
        this.quarterNo = quarterNo;
    }



    public String getEsiMember() {
        return esiMember;
    }



    public void setEsiMember(String esiMember) {
        this.esiMember = esiMember;
    }



    public String getPfMember() {
        return pfMember;
    }



    public void setPfMember(String pfMember) {
        this.pfMember = pfMember;
    }



    public String getFpfMember() {
        return fpfMember;
    }



    public void setFpfMember(String fpfMember) {
        this.fpfMember = fpfMember;
    }



    public String getEsiNo() {
        return esiNo;
    }



    public void setEsiNo(String esiNo) {
        this.esiNo = esiNo;
    }



    public String getPfNo() {
        return pfNo;
    }



    public void setPfNo(String pfNo) {
        this.pfNo = pfNo;
    }



    public String getFpfNo() {
        return fpfNo;
    }



    public void setFpfNo(String fpfNo) {
        this.fpfNo = fpfNo;
    }



    public String getEducation() {
        return education;
    }



    public void setEducation(String education) {
        this.education = education;
    }



    public String getEducationRead() {
        return educationRead;
    }



    public void setEducationRead(String educationRead) {
        this.educationRead = educationRead;
    }



    public String getEducationWrite() {
        return educationWrite;
    }



    public void setEducationWrite(String educationWrite) {
        this.educationWrite = educationWrite;
    }



    public String getPreviousEmployment() {
        return previousEmployment;
    }



    public void setPreviousEmployment(String previousEmployment) {
        this.previousEmployment = previousEmployment;
    }



    public String getIdenticalMarks() {
        return identicalMarks;
    }



    public void setIdenticalMarks(String identicalMarks) {
        this.identicalMarks = identicalMarks;
    }



    public String getPermAddress1() {
        return permAddress1;
    }



    public void setPermAddress1(String permAddress1) {
        this.permAddress1 = permAddress1;
    }



    public String getPermAddress2() {
        return permAddress2;
    }



    public void setPermAddress2(String permAddress2) {
        this.permAddress2 = permAddress2;
    }



    public String getPermAddress3() {
        return permAddress3;
    }



    public void setPermAddress3(String permAddress3) {
        this.permAddress3 = permAddress3;
    }



    public String getPermAddress4() {
        return permAddress4;
    }



    public void setPermAddress4(String permAddress4) {
        this.permAddress4 = permAddress4;
    }



    public String getLocalAddress1() {
        return localAddress1;
    }



    public void setLocalAddress1(String localAddress1) {
        this.localAddress1 = localAddress1;
    }



    public String getLocalAddress2() {
        return localAddress2;
    }



    public void setLocalAddress2(String localAddress2) {
        this.localAddress2 = localAddress2;
    }



    public String getLocalAddress3() {
        return localAddress3;
    }



    public void setLocalAddress3(String localAddress3) {
        this.localAddress3 = localAddress3;
    }



    public String getLocalAddress4() {
        return localAddress4;
    }



    public void setLocalAddress4(String localAddress4) {
        this.localAddress4 = localAddress4;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }



    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public String getMobileNumber() {
        return mobileNumber;
    }



    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }



    public String getOffday() {
        return offday;
    }



    public void setOffday(String offday) {
        this.offday = offday;
    }



    public String getPhotoDir() {
        return photoDir;
    }



    public void setPhotoDir(String photoDir) {
        this.photoDir = photoDir;
    }



    public String getUpdated() {
        return updated;
    }



    public void setUpdated(String updated) {
        this.updated = updated;
    }



    public String getUserId() {
        return userId;
    }



    public void setUserId(String userId) {
        this.userId = userId;
    }



    public String getOccuCode() {
        return occuCode;
    }



    public void setOccuCode(String occuCode) {
        this.occuCode = occuCode;
    }



    public String getWorkType() {
        return workType;
    }



    public void setWorkType(String workType) {
        this.workType = workType;
    }



    public String getPhotoFile() {
        return photoFile;
    }



    public void setPhotoFile(String photoFile) {
        this.photoFile = photoFile;
    }



    public String getCheckOld() {
        return checkOld;
    }



    public void setCheckOld(String checkOld) {
        this.checkOld = checkOld;
    }



    public String getOldEB() {
        return oldEB;
    }



    public void setOldEB(String oldEB) {
        this.oldEB = oldEB;
    }



    @Override
    public String toString() {
	return "EmployeeMaster [ebId=" + ebId + ", ebFixedId=" + ebFixedId + ", ebNo=" + ebNo + ", wrkName=" + wrkName
		+ ", dateOfBirth=" + dateOfBirth + ", sex=" + sex + ", fatherHusbandName=" + fatherHusbandName
		+ ", religion=" + religion + ", deptId=" + deptId + ", occuId=" + occuId + ", dateOfJoining="
		+ dateOfJoining + ", dateOfPFjoining=" + dateOfPFjoining + ", active=" + active + ", dateOfInactive="
		+ dateOfInactive + ", cataId=" + cataId + ", workingReley=" + workingReley + ", quarter=" + quarter
		+ ", quarterNo=" + quarterNo + ", esiMember=" + esiMember + ", pfMember=" + pfMember + ", fpfMember="
		+ fpfMember + ", esiNo=" + esiNo + ", pfNo=" + pfNo + ", fpfNo=" + fpfNo + ", education=" + education
		+ ", educationRead=" + educationRead + ", educationWrite=" + educationWrite + ", previousEmployment="
		+ previousEmployment + ", identicalMarks=" + identicalMarks + ", permAddress1=" + permAddress1
		+ ", permAddress2=" + permAddress2 + ", permAddress3=" + permAddress3 + ", permAddress4=" + permAddress4
		+ ", localAddress1=" + localAddress1 + ", localAddress2=" + localAddress2 + ", localAddress3="
		+ localAddress3 + ", localAddress4=" + localAddress4 + ", phoneNumber=" + phoneNumber
		+ ", mobileNumber=" + mobileNumber + ", offday=" + offday + ", photoDir=" + photoDir + ", updated="
		+ updated + ", userId=" + userId + ", occuCode=" + occuCode + ", workType=" + workType + ", photoFile="
		+ photoFile + ", checkOld=" + checkOld + ", oldEB=" + oldEB + "]";
    }


    
    

}
