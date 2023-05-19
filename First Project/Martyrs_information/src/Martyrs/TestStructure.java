package Martyrs;

import java.util.Arrays;

public class TestStructure {

	public static void main(String[] args) {

		SingelLinkedList sList = new SingelLinkedList();
		sList.addFirst(new NodeSigleLinkedList(new Martyrs("T3")));
		sList.addFirst(new NodeSigleLinkedList(new Martyrs("T1")));
		sList.addLast(new NodeSigleLinkedList(new Martyrs("T4")));
		sList.printList();
		sList.removObj(new NodeSigleLinkedList(new Martyrs("T1")));
		sList.printList();
		sList.removObj(new NodeSigleLinkedList(new Martyrs("T3")));
		sList.printList();
		sList.removObj(new NodeSigleLinkedList(new Martyrs("T4")));
		sList.printList();

//		DoublyLinkedList sList2 = new DoublyLinkedList();
//		// NodeDoubleLinkedList d2 =new NodeDoubleLinkedList("Tsaws");
//		NodeDoubleLinkedList d3 = new NodeDoubleLinkedList("Tsaws3");
//		NodeDoubleLinkedList d4 = new NodeDoubleLinkedList("Tsaws4");
//		NodeDoubleLinkedList d5 = new NodeDoubleLinkedList("Tsaws5");
//		NodeDoubleLinkedList[] arr = { new NodeDoubleLinkedList("Bethlehem"), new NodeDoubleLinkedList("Deir al-Balah"),
//				new NodeDoubleLinkedList("East Jerusalem"), new NodeDoubleLinkedList("Gaza"),
//				new NodeDoubleLinkedList("Gush Katif"), new NodeDoubleLinkedList("Hebron"),
//				new NodeDoubleLinkedList("Israel"), new NodeDoubleLinkedList("Jericho"),
//				new NodeDoubleLinkedList("Khan Yunis"), new NodeDoubleLinkedList("Nablus"),
//				new NodeDoubleLinkedList("North Gaza"), new NodeDoubleLinkedList("Qalqiliya"),
//				new NodeDoubleLinkedList("Rafah"), new NodeDoubleLinkedList("Salfit"),
//				new NodeDoubleLinkedList("Tubas"), new NodeDoubleLinkedList("Tulkarm"),
//				new NodeDoubleLinkedList("al-Quds"), new NodeDoubleLinkedList("al-Quds"),
//				new NodeDoubleLinkedList("Ramallah and al-Bira"), new NodeDoubleLinkedList("Jenin"),
//				new NodeDoubleLinkedList("Bethlehem"), new NodeDoubleLinkedList("Deir al-Balah"),
//				new NodeDoubleLinkedList("East Jerusalem"), new NodeDoubleLinkedList("Jenin"), };
//		for (int i = 0; i < arr.length; ++i) {
//			NodeDoubleLinkedList temp = sList2.search(arr[i].getLocation());
//			if (temp == null) {
//				sList2.addNodeSorted(arr[i]);
//			} else {
//				System.out.println("exist " + arr[i].getLocation());
//			}
//		}
//		sList2.printList();
//		System.out.println(sList2.getFirt() + "---" + sList2.getLast() + "---" + sList2.size() + " " + arr.length);

//		sList.addFirst(new NodeDoubleLinkedList("T3"));
//		sList.addLast(new NodeDoubleLinkedList("T4"));
//		sList.addNode(new NodeDoubleLinkedList("T4 at index"),1);
//		sList.addNode(new NodeDoubleLinkedList("T5 at index"),0);
//	    sList2.removeAt(515);
//		sList2.removeFirst();
//		sList2.removeLast();
//		sList2.add(new NodeDoubleLinkedList("T3"),-1);
//		sList.search("T");
//		sList.getLast();

//		System.out.println(sList2.search("w"));

//		DoublyLinkedList mySingle = new DoublyLinkedList();
//    	NodeDoubleLinkedList ndSingel = new NodeDoubleLinkedList("a");
//		NodeDoubleLinkedList ndSingel2 = new NodeDoubleLinkedList("d");
//		NodeDoubleLinkedList ndSingel3 = new NodeDoubleLinkedList("b");
//		NodeDoubleLinkedList ndSingel4 = new NodeDoubleLinkedList("c");
//		
//		mySingle.addNodeSorted(ndSingel);
//     	mySingle.addNodeSorted(ndSingel2);
//		mySingle.addNodeSorted(ndSingel3);
//		mySingle.addNodeSorted(ndSingel4);
////		
//		mySingle.printList();
//		System.out.println(mySingle.getFirt());
//		System.out.println(mySingle.getLast());

//		SingelLinkedList mySingle = new SingelLinkedList();
//		NodeSigleLinkedList ndSingel = new NodeSigleLinkedList(new Martyrs("cbad"));
//		NodeSigleLinkedList ndSingel2 = new NodeSigleLinkedList(new Martyrs("a"));
//		NodeSigleLinkedList ndSingel3 = new NodeSigleLinkedList(new Martyrs("b"));
//		mySingle.addNodeSorted(ndSingel);
//		mySingle.addNodeSorted(ndSingel2);
//		mySingle.addNodeSorted(ndSingel3);
//		mySingle.printList();
//		System.out.println(mySingle.search(""));
//		System.out.println(mySingle.getLast());

		
		
		int[] arr = { 1, 8, 3, 7, 5, 7, 2, 8, 1, 0 };
		boolean []temp = new boolean[arr.length];
		int count;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			if(temp[i]==true) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] ) {
					count++;
					temp[j]=true;
				}
			}
			System.out.println(arr[i] + " -----> " + count);
		}

	}
}
