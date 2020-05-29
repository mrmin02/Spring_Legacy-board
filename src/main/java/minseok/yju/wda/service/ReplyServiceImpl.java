package minseok.yju.wda.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minseok.yju.wda.domain.Criteria;
import minseok.yju.wda.domain.ReplyVO;
import minseok.yju.wda.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService{
	
	@Autowired
	private ReplyMapper mapper;
	
	private Logger log = LoggerFactory.getLogger(ReplyServiceImpl.class);
	
	
	
	@Override
	public int register(ReplyVO vo) {
		// TODO Auto-generated method stub
		
		log.info("register....."+vo);
		return mapper.insert(vo);
	}

	@Override
	public ReplyVO get(int rno) {
		// TODO Auto-generated method stub
		log.info("get....."+rno);
		return mapper.read(rno);
	}

	@Override
	public int remove(int rno) {
		// TODO Auto-generated method stub
		log.info("remove....."+rno);
		return mapper.delete(rno);
	}

	@Override
	public int modify(ReplyVO vo) {
		// TODO Auto-generated method stub
		log.info("modify....."+vo);
		return mapper.update(vo);
	}

	@Override
	public List<ReplyVO> getList(Criteria crt, int bno) {
		// TODO Auto-generated method stub
		log.info("getList...."+bno);
		return mapper.getListWithPaging(crt, bno);
	}

}
