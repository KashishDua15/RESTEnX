package com.fil.entities;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CustomerProfile {
	Set<String> customerFavourites = new LinkedHashSet<String>();
	List<CustomerOrders> orderHistory = new ArrayList<CustomerOrders>();

}
