package minseok.yju.wda.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minseok.yju.wda.domain.BoardVO;
import minseok.yju.wda.domain.Criteria;
import minseok.yju.wda.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	@Autowired
	private BoardMapper mapper;
	
	public BoardServiceImpl(BoardMapper mapper) {
		this.mapper = mapper;
	}
	
	@Override
	public void register(BoardVO board) {
		// TODO Auto-generated method stub
		logger.info("register......."+board);
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(int bno) {
		// TODO Auto-generated method stub
		
		return mapper.read(bno);
	}

	@Override
	public void modify(BoardVO board) {
		// TODO Auto-generated method stub
		mapper.update(board);
	}

	@Override
	public void remove(int bno) {
		// TODO Auto-generated method stub
		mapper.delete(bno);
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		
		return mapper.getList();
	}
	
	@Override
	public List<BoardVO> getList(Criteria crt){
		return mapper.getListWithPaging(crt);
	}

	@Override
	public int getTotal(Criteria crt) {
		logger.info("get total count");
		logger.info("get count :"+mapper.getTotalCount(crt));
		return mapper.getTotalCount(crt);
	}
	
}
