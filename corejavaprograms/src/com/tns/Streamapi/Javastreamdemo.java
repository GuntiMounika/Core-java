package com.tns.Streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamdemo {
public static void main(String[] args) {
	List<Product>pi=new ArrayList<Product>();
	pi.add(new Product(1,"hp",40000));
	pi.add(new Product(2,"dell",80000));
	pi.add(new Product(3,"apple",50000));
	List<Float>pi2=pi.stream().filter(p->p.price>30000).map(p->p.price)
			.collect(Collectors.toList());
	System.out.println(pi2);
}
}
