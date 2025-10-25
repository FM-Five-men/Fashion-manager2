package fashionmanager.mapper;

import fashionmanager.dto.InfluencerPageResponseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InfluencerPageMapper {

    // 인플루언서 페이지를 4가지의 속성으로 조회, 혹은 param 안 붙이면 전체조회
    List<InfluencerPageResponseDTO> selectResultPage(@Param("title") String title,
                                                     @Param("insta") String insta,
                                                     @Param("phone") String phone,
                                                     @Param("memberNum") Integer memberNum);


    // 페이지네이션
    List<InfluencerPageResponseDTO> selectResultPageWithPaging(
                                                    @Param("title") String title,
                                                    @Param("insta") String insta,
                                                    @Param("phone") String phone,
                                                    @Param("memberNum") Integer memberNum,
                                                    @Param("offset") int offset,
                                                    @Param("limit") int limit
    );

    // ✅ 추가: 해당 member의 뱃지 이름들만 뽑아오는 쿼리
    List<String> selectInfluencerBadges(Integer memberNum);
}

