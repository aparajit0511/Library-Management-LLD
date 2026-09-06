package librarymanagement;

import java.util.UUID;

public class Member {

    private String memberId;
    private String memberName;

    public Member( String memberName) {
        this.memberId =  UUID.randomUUID().toString();;
        this.memberName = memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
