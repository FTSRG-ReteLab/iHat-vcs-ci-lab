import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;


class Tachograph {

	Table<Integer, Integer, Integer> table;

	Tachograph(){
		table = TreeBasedTable.create();
	}

	void add(int time, int position, int speed){
		table.put(time, position, speed);
	}
}

