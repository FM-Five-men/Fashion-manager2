package fashionmanager.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class InfluencerPageResponseDTO {

    private Integer num;
    private String title;
    private String content;
    private String insta;
    private String phone;
    private Integer memberNum;

    private Integer likes;
    private Integer cheers;

    private String memberName;


    //  이미지 관련 코드
    private List<String> photoPaths;

}
