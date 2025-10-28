package fashionmanager.develop.dto;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class InsertMemberDTO {
    private String memberId;
    private String memberPwd;
    private String memberEmail;
    private String memberName;
    private int memberAge;
    private char memberGender;
    private int memberHeight;
    private int memberWeight;

    // 새로 추가된 DB 컬럼(전화번호, 주소)
    private String memberPhone;
    private String memberAddress;

    private String memberStatus = "활동중";
    private boolean memberMessageAllow = true;
}
