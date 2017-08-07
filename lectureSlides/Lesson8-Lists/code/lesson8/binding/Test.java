package lesson8.binding;
import java.util.*;

import javafx.beans.binding.ListBinding;
import javafx.collections.*;
public class Test {
	ListBinding<String> mList; 
	ObservableList<String> list1 
	 = FXCollections.observableArrayList(new ArrayList<String>());
	ObservableList<String> list2 
	 = FXCollections.observableArrayList(new ArrayList<String>());
	public static void main(String[] args) {
		Test t = new Test();
		t.bindLists();
		t.list1.add("a");
		t.list2.add("b");
		System.out.println(t.mList.get());

	}
	private void bindLists() {
		
		mList = new ListBinding<String>() {
			 
            {
                super.bind(mList, list1, list2);
            }
 
            @Override
            protected ObservableList<String> computeValue() {
            	List<String> ret = new ArrayList<>();
            	ret.addAll(list1);
            	ret.addAll(list2);
            	return FXCollections.observableArrayList(ret);
            }
        };
 
	}

}
