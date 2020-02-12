package spring.web.project.Board.A3_Dao;

import java.util.List;

import spring.web.project.Board.Model.Board;

public interface IBoardDao {
	
	public void boardCreate(Board vo) throws Exception;
	
	public Board boardSelect(Integer bno) throws Exception;
	
	public void boardUpdate(Board vo) throws Exception;
	
	public void boardDelete(Integer bno) throws Exception;
	
	public List<Board> boardListAll() throws Exception;
	
}
