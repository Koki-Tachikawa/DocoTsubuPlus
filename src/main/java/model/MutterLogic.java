package model;

import java.util.List;

public class MutterLogic {
	public List<Mutter> execute(List<Mutter> mutterList, Mutter mutter){
		mutterList.add(mutter);
		return mutterList;
	}
}
