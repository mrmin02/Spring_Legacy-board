package minseok.yju.wda.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import minseok.yju.wda.domain.Criteria;
import minseok.yju.wda.domain.ReplyVO;

public interface ReplyMapper {
	
	public int insert(ReplyVO vo);
	
	public ReplyVO read(int rno);
	
	public int delete(int rno);
	
	public int update(ReplyVO vo);
	
	public ReplyVO[] readAll();
	
	public List<ReplyVO> getListWithPaging(@Param("crt") Criteria crt, @Param("bno") int bno);
}
