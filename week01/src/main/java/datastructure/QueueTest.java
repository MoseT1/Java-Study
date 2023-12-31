package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		q.offer("홍길동");
		q.offer("마이콜");
		q.offer("크산테");
		
		while(!q.isEmpty()) {
			String s = 	q.poll();
			
			System.out.println(s);
		}
		q.offer("홍길동");
		q.offer("마이콜");
		q.offer("크산테");
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		//비어있는 경우 null을 반환한다.
		System.out.println(q.poll());
	}
}
