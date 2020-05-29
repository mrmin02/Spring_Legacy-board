package minseok.yju.wda.service;

import java.util.List;

import minseok.yju.wda.domain.BoardVO;
import minseok.yju.wda.domain.Criteria;

public interface BoardService {
	public void register(BoardVO board);
	
	public BoardVO get(int bno);
	
	public void modify(BoardVO board);
	
	public void remove(int bno);
	
	public List<BoardVO> getList();
	
	public List<BoardVO> getList(Criteria crt);
	
	public int getTotal(Criteria crt);
}
