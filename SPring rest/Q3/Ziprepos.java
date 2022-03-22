package com.Mongodb.Examples;

import java.util.ArrayList;
import java.util.List;

public class Ziprepos {
	List<Zipcodes> ziplist = new ArrayList<Zipcodes>();

	public List<Zipcodes> getZips() {
		Zipcodes z1 = new Zipcodes(1234, "up", "abc", "onestate");
		Zipcodes z2 = new Zipcodes(99501,"AK", "ANCHORAGE", "US");
		Zipcodes z3 = new Zipcodes(442001,"mahrastra", "wardha", "India");

		ziplist.add(z1);
		ziplist.add(z2);
		ziplist.add(z3);
		return ziplist;
	}

	public Zipcodes  getzipslist(long zip) {
		// TODO Auto-generated method stub
		for (Zipcodes  zips : ziplist) {
			if (zips.getZipcode() == zip)
				return zips;
		}
		return null;
	}
}
