package minseok.yju.wda.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import minseok.yju.wda.domain.BoardVO;
import minseok.yju.wda.domain.Criteria;

public interface BoardMapper {
	@Select("select * from tbl_board")
	public List<BoardVO> getList();
	
	public void insert(BoardVO vo);
	
	public void insertSelectKey(BoardVO vo);
	
	public BoardVO read(int bno);
	
	public int delete(int bno);
	
	public int update(BoardVO vo);
	
	public List<BoardVO> getListWithPaging(Criteria crt);
	
	public int getTotalCount(Criteria crt);
}
