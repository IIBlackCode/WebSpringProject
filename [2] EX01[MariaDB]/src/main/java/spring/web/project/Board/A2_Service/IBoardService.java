package spring.web.project.Board.A2_Service;

import java.util.List;

import spring.web.project.Board.Model.Board;

public interface IBoardService {
	
	//게시글 등록
	public void regist(Board board) throws Exception;

	//게시글 읽기
	public Board read(Integer bno) throws Exception;
	
	//게시글 수정
	public void modify(Board board) throws Exception;
	
	//게시글 삭제
	public void remove(Integer bno) throws Exception;
	
	//게시글 리스트 Select
	public List<Board> listAll() throws Exception;
	
}
