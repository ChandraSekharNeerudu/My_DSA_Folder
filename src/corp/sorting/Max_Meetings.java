package corp.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Meeting{
	int start,end,pos;

	public Meeting(int start, int end, int pos) {
		this.start = start;
		this.end = end;
		this.pos = pos;
	}

	@Override
	public String toString() {
		return "Meeting [start=" + start + ", end=" + end + ", pos=" + pos + "]";
	}
}
public class Max_Meetings {
	void main() {
		int[] s= {0,3,1,3,5,8};
		int[] e= {6,4,2,9,7,9};
		List<Integer> list=maxMeetings(s,e);
		System.out.println(list);
	}
	public List<Integer> maxMeetings(int[] s,int[] e){
		List<Meeting> meetings=new ArrayList<>();
		for(int i=0;i<s.length;i++)
			meetings.add(new Meeting(s[i],e[i],i));
		Collections.sort(meetings,(a,b)->Integer.compare(a.end,b.end));
		List<Integer> list=new ArrayList<>();
		int last=-1;
		for(Meeting meeting:meetings) {
			int st=meeting.start,et=meeting.end,p=meeting.pos;
			if(st>last) {
				list.add(p);
				last=et;
			}
		}
		Collections.sort(list);
		return list;
	}
}
