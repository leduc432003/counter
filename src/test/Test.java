package test;

import model.CounterModel;
import view.CounterView;

public class Test {
	public static void main(String[] args) {
		CounterModel cm = new CounterModel();
		cm.increment();
		cm.increment();
		cm.increment();
		System.out.println(cm.getValue());
		cm.decrement();
		System.out.println(cm.getValue());
		CounterView ctv = new CounterView();
	}
}
