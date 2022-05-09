package vd;
import java.util.ArrayList;
class Queue
{

		ArrayList<Integer> al=new ArrayList<Integer>();
		
		void enqueue(int x) {
			al.add(x);
		}
		void dequeue() {
			al.remove(al.size()-1);

		}
		void peek(){
			System.out.println(al.get(0));
			
		}
		void display() {
			for (int i: al) {
				System.out.print(i+" ");
				
			}
			System.out.println("printed");
		}
		void delete() {
			al.clear();
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Queue q=new Queue();
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);
			q.enqueue(40);
			q.display();
			q.dequeue();
			q.peek();
			q.display();
			q.delete();
			q.display();
	            
		}
		}