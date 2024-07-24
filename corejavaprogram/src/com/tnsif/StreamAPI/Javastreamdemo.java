package com.tnsif.StreamAPI;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamdemo {
public static void main(String[] args) {
	List<Product> pl=new ArrayList<Product>();
	pl.add(new Product (1,"hp",200000));
	pl.add(new Product (2,"dell",100000));
	pl.add(new Product (3,"apple",2500000));
	pl.add(new Product (4,"lenovo",18000));
	//List<Float>pl2=pl.stream().filter(p->p.price<30000)//filter for filtering the data
	//		.map(p->p.price)//fetch the data
		//	.collect(Collectors.toList());//toList-to collect from list
	//System.out.println(pl2);
DoubleSummaryStatistics totalprice=pl.stream().collect(Collectors.summarizingDouble(Product->Product.price));
System.out.println(totalprice);
	//finding max and min
	/*Product p=pl.stream().max((Product1,Product2)->Product1.price>Product2.price?1
			:-1).get();
	System.out.println(p.price);*/
	
	
}
}
