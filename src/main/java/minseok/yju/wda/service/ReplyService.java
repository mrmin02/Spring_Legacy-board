package minseok.yju.wda.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import minseok.yju.wda.domain.Criteria;
import minseok.yju.wda.domain.ReplyVO;

public interface ReplyService {
	
	public int register(ReplyVO vo);
	
	public ReplyVO get(int rno);
	
	public int remove(int rno);
	
	public int modify(ReplyVO vo);
	
	public List<ReplyVO> getList(@Param("crt") Criteria crt, @Param("bno") int bno);
}
