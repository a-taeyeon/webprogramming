package jspbook.pr47;

import java.util.ArrayList;
import java.util.List;

public class LectureManager {
	private static final int times = 6;
	private static final int days = 5;
	private int[][] typeMatrix = new int[times][days];
	private int[][] titleMatrix = new int[times][days];
	private int[][] spanMatrix = new int[times][days];
	List<LectureBean> lectureList = new ArrayList<LectureBean>();
	
	public List<LectureBean> getLectureList(){
		return lectureList;
	}
	public void add(LectureBean lbean) {
		lectureList.add(lbean);
	}
	
	public void buildMatrix() {
		for(int i = 0; i < times; i++) {
			for(int j = 0; j < days; j++) {
				typeMatrix[i][j] = 0;
				titleMatrix[i][j] = -1;
				spanMatrix[i][j] = 1;
			}
		}
		for(LectureBean lb : lectureList) {
			typeMatrix[lb.getTime() - 1][lb.getDay()] = lb.getType() + 1;
			titleMatrix[lb.getTime() - 1][lb.getDay()] = lb.getTitle();
			spanMatrix[lb.getTime() - 1][lb.getDay()] = lb.getConsecutive();
			
			for(int i = 1; i < lb.getConsecutive(); i++) {
				spanMatrix[lb.getTime() - 1 + i][lb.getDay()] = 0;
			}
		}
	}
	
	public int[][] getTypeMatrix() {
		return typeMatrix;
	}
	public int[][] getTitleMatrix(){
		return titleMatrix;
	}
	public int[][] getSpanMatrix(){
		return spanMatrix;
	}
}
