package com.example.hustarmobileappproject.Database;

public class Member {
    private int memberSeq;
    private String memberName;
    private String memberId;
    private String memberPassword;
    private String memberPhoneNumber;
    private String memberGender;
    private String memberBirth;
    private int memberAuthority;

    public Member(int memberSeq, String memberName, String memberId,
                  String memberPassword, String memberPhoneNumber, String memberGender,
                  String memberBirth, int memberAuthority) {
        this.memberSeq = memberSeq;
        this.memberName = memberName;
        this.memberId = memberId;
        this.memberPassword = memberPassword;
        this.memberPhoneNumber = memberPhoneNumber;
        this.memberGender = memberGender;
        this.memberBirth = memberBirth;
        this.memberAuthority = memberAuthority;
    }

    public int getMemberSeq() {
        return memberSeq;
    }

    public void setMemberSeq(int memberSeq) {
        this.memberSeq = memberSeq;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberPhoneNumber() {
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber(String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    public String getMemberBirth() {
        return memberBirth;
    }

    public void setMemberBirth(String memberBirth) {
        this.memberBirth = memberBirth;
    }

    public int getMemberAuthority() {
        return memberAuthority;
    }

    public void setMemberAuthority(int memberAuthority) {
        this.memberAuthority = memberAuthority;
    }
}
