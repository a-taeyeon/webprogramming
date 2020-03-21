/* 컴퓨터학과 20180981 안태연 (크롬최적화) */
package jspbook.pr36;

import java.util.ArrayList;
import java.util.List;

public class LectureManager {
	List<LectureBean> lectureList = new ArrayList<LectureBean>();

	public List<LectureBean> getLectureList(){
		return lectureList;
	}
	public void add(LectureBean lbean) {
		lectureList.add(lbean);
	}
}
