package corp.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import corp.sorting.*;


public class Sample {
	
	void main() {
		int[] s= {0,3,1,3,5,8};
		int[] e= {6,4,2,9,7,9};
		List<Integer> list=maxMeetings(s,e);
		System.out.println(list);
	}

	private List<Integer> maxMeetings(int[] s, int[] e) {
		List<Integer> list=new ArrayList<>();
		List<Meeting> meetings=new ArrayList<>();
		for(int i=0;i<s.length;i++) {
			meetings.add(new Meeting(s[i],e[i],i));
		}
		
		Collections.sort(meetings,(a,b)->Integer.compare(a.end,b.end));
		
		int lastendtime=0;
		for(Meeting meeting:meetings) {
			if(lastendtime<meeting.start) {
				list.add(meeting.pos);
				lastendtime=meeting.end;
			}
		}
		Collections.sort(list);
		return list;
	}
}
